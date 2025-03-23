# TP4DPBO2025C2

# Janji
Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan Tugas Praktikum 4 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

#  Desain Program

Program ini terdiri dari dua kelas utama:

## **1 Mahasiswa**

###  Atribut:
- `nim`  
- `nama`  
- `jenisKelamin`  
- `angkatan`  

### Method:
- Getter dan setter **nim**  
- Getter dan setter **nama**  
- Getter dan setter **jenisKelamin**  
- Getter dan setter **angkatan**  

---

## **2 Menu**

### Atribut:
- `listMahasiswa`  
- `mainPanel`  
- `nimField`  
- `namaField`  
- `mahasiswaTable`  
- `angkatanComboBox`  
- `addUpdateButton`  
- `cancelButton`  
- `jenisKelaminComboBox`  
- `deleteButton`  
- `titleLabel`  
- `nimLabel`  
- `namaLabel`  
- `jenisKelaminLabel`  
- `angkatanLabel`  

### Method:
- `Menu()` → Constructor  
- `setTable()`  
- `insertData()`  
- `updateData()`  
- `deleteData()`  
- `clearForm()`  
- `populateList()`  

---

#  Penjelasan Alur

##  **Saat Program Dijalankan**
- Program akan membuka sebuah **window** berisi **form input dan tabel data mahasiswa**.  
- **Form** berisi **field** untuk:  
  - **NIM** (Text Field)  
  - **Nama** (Text Field)  
  - **Jenis Kelamin** (ComboBox: "Laki-laki", "Perempuan")  
  - **Angkatan** (ComboBox: "2019", "2020", "2021", "2022", "2023", "2024")  
- Di samping form, terdapat tombol **Add** dan **Cancel**.  

## 2️ **Menambahkan Data**
- User mengisi form dan menekan tombol **Add**.  
- Data akan tersimpan ke dalam tabel dan muncul **dialog box** yang menunjukkan bahwa data berhasil ditambahkan.  

## 3️ **Mengupdate Data**
- Jika user mengklik salah satu baris pada tabel, maka **form akan otomatis terisi** dengan data tersebut.  
- **Tombol "Add" berubah menjadi "Update"**, dan tombol **Delete** akan muncul.  
- Jika user menekan tombol **Update**, maka data di dalam tabel akan diperbarui, dan **dialog box** akan muncul untuk menampilkan pesan sukses.  

## 4️ **Menghapus Data**
- Jika user menekan tombol **Delete**, akan muncul **dialog box konfirmasi** dengan pilihan **Yes/No**.  
- Jika memilih **Yes**, maka data akan dihapus dari tabel dan muncul **dialog box** yang menampilkan pesan sukses.  

## 5️ **Membatalkan Input**
- Jika user menekan tombol **Cancel**, maka seluruh **field dalam form akan dikosongkan kembali**.  

---
