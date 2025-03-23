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

# Dokumentasi
![Screenshot 2025-03-23 201830](https://github.com/user-attachments/assets/7cdbb114-17d9-4b7e-b89f-e7098acdd475)
![Screenshot 2025-03-23 201838](https://github.com/user-attachments/assets/bd5073de-9fa8-4bc2-81a2-82ccb596ad7a)
![Screenshot 2025-03-23 201858](https://github.com/user-attachments/assets/041be614-b247-4a87-9350-2731b11496fe)
![Screenshot 2025-03-23 201905](https://github.com/user-attachments/assets/5c0e2811-21c4-4114-ac29-d50edc22d79d)
![Screenshot 2025-03-23 201923](https://github.com/user-attachments/assets/78847c22-9679-4d48-871c-6c9500dd64fb)
![Screenshot 2025-03-23 201928](https://github.com/user-attachments/assets/281101f2-7f49-48d0-afa1-cda983a41cbe)
![Screenshot 2025-03-23 201934](https://github.com/user-attachments/assets/3252c3b8-3a6d-49fe-93d3-4e1c3e9120c4)
![Screenshot 2025-03-23 201939](https://github.com/user-attachments/assets/b5e4a293-3448-40eb-9d95-5653e6a2a248)
![Screenshot 2025-03-23 201944](https://github.com/user-attachments/assets/37983e93-b35b-4ce3-88e3-5aeedef55d18)
