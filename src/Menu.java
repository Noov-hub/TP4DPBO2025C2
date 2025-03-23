import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Menu extends JFrame {


    private int selectedIndex = -1;
    private ArrayList<Mahasiswa> listMahasiswa;

    private JPanel mainPanel;
    private JTextField nimField;
    private JTextField namaField;
    private JTable mahasiswaTable;
    private JButton addUpdateButton;
    private JButton cancelButton;
    private JComboBox<String> jenisKelaminComboBox;
    private JComboBox<String> angkatanComboBox;
    private JButton deleteButton;
    private JLabel titleLabel;
    private JLabel nimLabel;
    private JLabel namaLabel;
    private JLabel jenisKelaminLabel;
    private JLabel angkatanLabel;

    public Menu() {
        setTitle("Data Mahasiswa"); // Tambahkan title agar lebih jelas
        setSize(480, 560);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listMahasiswa = new ArrayList<>();
        populateList();

        mahasiswaTable.setModel(setTable());

        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 20f));

        String[] jenisKelaminData = {"Laki-laki", "Perempuan"};
        jenisKelaminComboBox.setModel(new DefaultComboBoxModel<>(jenisKelaminData));


        String[] angkatanData = {"2020", "2021", "2022", "2023", "2024"};
        angkatanComboBox.setModel(new DefaultComboBoxModel<>(angkatanData));

        deleteButton.setVisible(false);

        addUpdateButton.addActionListener(e -> {
            if (selectedIndex == -1) {
                insertData();
            } else {
                updateData();
            }
        });

        deleteButton.addActionListener(e -> {
            if (selectedIndex >= 0) {
                int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    deleteData();
                }
            }
        });

        cancelButton.addActionListener(e -> clearForm());

        mahasiswaTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                selectedIndex = mahasiswaTable.getSelectedRow();
                String selectedNim = mahasiswaTable.getModel().getValueAt(selectedIndex, 1).toString();
                String selectedNama = mahasiswaTable.getModel().getValueAt(selectedIndex, 2).toString();
                String selectedJenisKelamin = mahasiswaTable.getModel().getValueAt(selectedIndex, 3).toString();
                String selectedAngkatan = mahasiswaTable.getModel().getValueAt(selectedIndex, 4).toString();

                nimField.setText(selectedNim);
                namaField.setText(selectedNama);
                jenisKelaminComboBox.setSelectedItem(selectedJenisKelamin);
                angkatanComboBox.setSelectedItem(selectedAngkatan);

                addUpdateButton.setText("Update");
                deleteButton.setVisible(true);
            }
        });

        setContentPane(mainPanel); // Tambahkan ini agar komponen dalam mainPanel tampil
    }


    private DefaultTableModel setTable() {
        String[] column = {"No", "NIM", "Nama", "Jenis Kelamin", "Angkatan"};
        DefaultTableModel temp = new DefaultTableModel(null, column);
        for (int i = 0; i < listMahasiswa.size(); i++) {
            Object[] row = {i + 1, listMahasiswa.get(i).getNim(), listMahasiswa.get(i).getNama(), listMahasiswa.get(i).getJenisKelamin(), listMahasiswa.get(i).getAngkatan()};
            temp.addRow(row);
        }
        return temp;
    }

    private void insertData() {
        String nim = nimField.getText();
        String nama = namaField.getText();
        String jenisKelamin = (String) jenisKelaminComboBox.getSelectedItem();
        int angkatan = Integer.parseInt((String) angkatanComboBox.getSelectedItem());

        listMahasiswa.add(new Mahasiswa(nim, nama, jenisKelamin, angkatan));
        mahasiswaTable.setModel(setTable());
        clearForm();
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
    }

    private void updateData() {
        String nim = nimField.getText();
        String nama = namaField.getText();
        String jenisKelamin = (String) jenisKelaminComboBox.getSelectedItem();
        int angkatan = Integer.parseInt((String) angkatanComboBox.getSelectedItem());

        listMahasiswa.get(selectedIndex).setNim(nim);
        listMahasiswa.get(selectedIndex).setNama(nama);
        listMahasiswa.get(selectedIndex).setJenisKelamin(jenisKelamin);
        listMahasiswa.get(selectedIndex).setAngkatan(angkatan);

        mahasiswaTable.setModel(setTable());
        clearForm();
        JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
    }

    private void deleteData() {
        listMahasiswa.remove(selectedIndex);
        mahasiswaTable.setModel(setTable());
        clearForm();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    }

    private void clearForm() {
        nimField.setText("");
        namaField.setText("");
        jenisKelaminComboBox.setSelectedIndex(0);
        angkatanComboBox.setSelectedIndex(0);
        addUpdateButton.setText("Add");
        deleteButton.setVisible(false);
        selectedIndex = -1;
    }

    public static void main(String[] args) {
        Menu window = new Menu();
        window.setSize(480, 560);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    private void populateList() {
            listMahasiswa.add(new Mahasiswa("2203999", "Amelia Zalfa Julianti", "Perempuan", 2022));
            listMahasiswa.add(new Mahasiswa("2202292", "Muhammad Iqbal Fadhilah", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2202346", "Muhammad Rifky Afandi", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2210239", "Muhammad Hanif Abdillah", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2202046", "Nurainun", "Perempuan", 2022));
            listMahasiswa.add(new Mahasiswa("2205101", "Kelvin Julian Putra", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2200163", "Rifanny Lysara Annastasya", "Perempuan", 2022));
            listMahasiswa.add(new Mahasiswa("2202869", "Revana Faliha Salma", "Perempuan", 2022));
            listMahasiswa.add(new Mahasiswa("2209489", "Rakha Dhifiargo Hariadi", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2203142", "Roshan Syalwan Nurilham", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2200311", "Raden Rahman Ismail", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2200978", "Ratu Syahirah Khairunnisa", "Perempuan", 2022));
            listMahasiswa.add(new Mahasiswa("2204509", "Muhammad Fahreza Fauzan", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2205027", "Muhammad Rizki Revandi", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2203484", "Arya Aydin Margono", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2200481", "Marvel Ravindra Dioputra", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2209889", "Muhammad Fadlul Hafiizh", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2206697", "Rifa Sania", "Perempuan", 2022));
            listMahasiswa.add(new Mahasiswa("2207260", "Imam Chalish Rafidhul Haque", "Laki-laki", 2022));
            listMahasiswa.add(new Mahasiswa("2204343", "Meiva Labibah Putri", "Perempuan", 2022));
        }
}
