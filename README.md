<div align="center">
  <img width="150" height="150" alt="Desain tanpa judul" src="https://github.com/user-attachments/assets/ca01a9ad-5d4e-40c7-a89a-4687bca6e554" />
</div>

<div align="center">

# 📱 FitGen

![Kotlin](https://img.shields.io/badge/Kotlin-Multiplatform-0081CB?logo=kotlin&logoColor=white)
<br>
![Android](https://img.shields.io/badge/Android-Supported-4CAF50?logo=android&logoColor=white)
<br>
![iOS](https://img.shields.io/badge/iOS-Supported-black?logo=apple&logoColor=white)
<br>
![Status](https://img.shields.io/badge/Status-Completed-4CAF50)

*Aplikasi pelacak kebugaran dan kesehatan komprehensif dengan asisten virtual cerdas.*

</div>
---

# Deskripsi Singkat & Latar Belakang

Fitgen adalah aplikasi pelacak kebugaran dan kesehatan komprehensif berbasis Kotlin Multiplatform (KMP). Di era modern, banyak orang kesulitan memantau aktivitas fisik dan pola makan sehat mereka secara konsisten karena kurangnya alat pencatatan yang cerdas dan terintegrasi.

Oleh karena itu, FitGen hadir untuk merevolusi cara pengguna memantau gaya hidup sehat mereka dengan menggabungkan berbagai fungsionalitas dalam satu platform. Mulai dari pencatatan olahraga harian, pelacak nutrisi otomatis dengan AI, hingga asisten virtual pribadi untuk memandu rutinitas kesehatan harian Anda. Semua ini disajikan dalam antarmuka yang modern, dinamis, dan terpadu untuk platform Android dan iOS menggunakan satu basis kode.

## Konteks Proyek

```text
📦 composeApp/src/commonMain
 ┣ **Catatan:** Proyek ini disusun secara khusus untuk memenuhi **Tugas Besar Mata Kuliah Pengembangan Aplikasi Mobile (PAM)**
```
--- 
## Fitur Utama
1. **AI Food Scanner (Pemindai Nutrisi)** - Pindai gambar makananmu, dan AI akan mengidentifikasi nama makanan, estimasi kalori, serta rincian makronutrien (Protein, Karbohidrat, Lemak) secara otomatis
2. **AI Workout Generator/Smart Assistant** - Chatbot cerdas yang siap menjawab pertanyaanmu mengenai rekomendasi latihan, penyesuaian jadwal latihan, diet, dan pemulihan tubuh
3. **Daily Tracker (Nutrisi & Hidrasi)** - Lacak jumlah asupan harianmu, asupan nutrisi, air, serta login streak untuk menjaga motivasi dengan grafik yang interaktif.
4. **Popular Challenges & Exercises** - Ikuti tantangan olahraga populer dan cari katalog latihan dengan panduan animasi/GIF (didukung oleh Wger API).
5. **Dark Mode** - Pengalaman pengguna yang nyaman bagi mata baik di kondisi terang maupun gelap.

## Screenshots
Berikut adalah cuplikan fitur-fitur dari aplikasi FitGen:
1. **Homepage & Dashboard**
   | **Homepage dan Dashboard Light Mode** | **Homepage dan Dashboard Dark Mode** |
   | :---: | :---: |
   | <img width="1080" height="2436" alt="homepage1" src="https://github.com/user-attachments/assets/3d5723c3-45e1-436d-b5af-7736280beea6" /> | <img width="1080" height="2436" alt="ss1" src="https://github.com/user-attachments/assets/c1bbed66-5004-472f-9ead-f2cfa8de9ae4" /> | 
2. **Popular Challenges & Detail**
   | **Popular Challenges Light Mode** | **Detail Light Mode** | **Popular Challengers Dark Mode** | **Detail Dark Mode** |
   | :---: | :---: | :---: | :---: |
   | <img width="1080" height="2436" alt="homepage1" src="https://github.com/user-attachments/assets/9e83372b-526c-4f16-87f4-008bc71c84a2" /> | <img width="1080" height="2436" alt="homepage_detail_workout" src="https://github.com/user-attachments/assets/62eeb52f-55c9-449f-930f-7d7ea898bd25" /> | <img width="1080" height="2436" alt="ss1" src="https://github.com/user-attachments/assets/b8a992dd-d81e-4d8e-8d1d-3fdf2225d452" /> | <img width="1080" height="2436" alt="ss5" src="https://github.com/user-attachments/assets/e1bfd782-c205-495c-a10d-ce7bd440372c" /> |
3. **AI Workout & Assistant**
   | **AI Workout dan Assistant Light Mode** | **AI Workout dan Assistant Dark Mode** |
   | :---: | :---: |
   | <img width="1080" height="2436" alt="homepage_ai_wo_generator1" src="https://github.com/user-attachments/assets/57b84376-e7c6-4aa7-9e24-8bfaa7a605b7" /> | <img width="1080" height="2436" alt="ss4" src="https://github.com/user-attachments/assets/5baa5122-75f8-4a48-81ee-1b3846ff32c1" /> |
4. **Classic Workout & Timer + Tambah Custom Latihan**
   | **Classic Workout Light Mode** | **Timer Light Mode** | **Tambah Custom Latihan Light Mode** | **Classic Workout Dark Mode** | **Timer Dark Mode** | **Tambah Custom Latihan Dark Mode** | 
   | :---: | :---: | :---: | :---: | :---: | :---: |
   | <img width="1080" height="2436" alt="homepage2" src="https://github.com/user-attachments/assets/2ccc096a-dfe7-43b3-a5cc-9ce9fc5cd0eb" /> | <img width="1080" height="2436" alt="homepage_timer" src="https://github.com/user-attachments/assets/395d1af6-2bf7-42b2-b34e-4e5454fab86c" /> | <img width="1080" height="2436" alt="homepage_detail_workout" src="https://github.com/user-attachments/assets/cb3df7fe-1fd1-43d9-8199-c8ff7b481d29" /> | <img width="1080" height="2436" alt="ss2" src="https://github.com/user-attachments/assets/9bbaeccd-101b-4cf6-9913-f9ed994ebae4" /> | <img width="1080" height="2436" alt="ss6" src="https://github.com/user-attachments/assets/0663146a-14f9-4a52-9692-20278e1d6868" /> | <img width="1080" height="2436" alt="ss5" src="https://github.com/user-attachments/assets/933fd49a-883f-4d1f-b517-20f044a03fc0" /> |
5. **Page Latihan & Rekap Latihan (Harian/Mingguan/Bulanan)**
   | **Page Latihan dan Rekap Latihan Light Mode** | **Page Latihan dan Rekap Latihan Dark Mode** |
   | :---: | :---: |
   | <img width="1080" height="2436" alt="latihanpage_riwayat_latihan" src="https://github.com/user-attachments/assets/c2c3453b-1e8d-461b-ad16-1733724e1df4" /> | <img width="1080" height="2436" alt="ss7" src="https://github.com/user-attachments/assets/271b0a89-7425-46c7-97b3-6ab816c92bc4" /> |
6. **Custom Latihan & Search Bar Latihan**
   | **Custom Latihan Light Mode** | **Search Bar Latihan Light Mode** | **Custom Latihan Light Mode Dark Mode** | **Search Bar Latihan Dark Mode** |
   | :---: | :---: | :---: | :---: |
   | <img width="1080" height="2436" alt="latihanpage_rutinitas_baru" src="https://github.com/user-attachments/assets/4159a238-eaa4-4062-9101-eaffe60ce74f" /> | <img width="1080" height="2436" alt="latihanpage_search_result" src="https://github.com/user-attachments/assets/ab3217e1-494f-47a7-a6be-45a340ee7819" /> | <img width="1080" height="2436" alt="ss8" src="https://github.com/user-attachments/assets/efceafa9-3d85-4a47-bda1-a34494b3a3c2" /> | <img width="1080" height="2436" alt="ss8" src="https://github.com/user-attachments/assets/016bc79b-0e5b-495e-819a-43b67e515007" /> |
7. **Page Nutrisi Harian & AI Cam Food Scanner**
   | **Page Nutrisi Harian Light Mode** | **AI Cam Food Scanner Light Mode** | **Page Nutrisi Harian Dark Mode** | **AI Cam Food Scanner Dark Mode** |
   | :---: | :---: | :---: | :---: |
   | <img width="200" alt="image" src="https://github.com/user-attachments/assets/9a2c6c3c-391c-4f52-bee7-b0c918b2bf1f" /> | <img width="200" alt="image" src="https://github.com/user-attachments/assets/a9c6cd2f-7ac1-46a5-a0ff-315c2a0fe497" /> | <img width="1080" height="2436" alt="ss10" src="https://github.com/user-attachments/assets/1ea45cea-2720-436b-b6b2-12dfa0b13a48" /> | <img width="1080" height="2436" alt="ss9" src="https://github.com/user-attachments/assets/615ab8da-0b16-49cb-b922-6149a096f673" /> |
8. **Profil Page & Edit Profil**
   | **Profil Page Light Mode** | **Edit Profil Light Mode** | **Profil Page Dark Mode** | **Edit Profil Dark Mode** |
   | :---: | :---: | :---: | :---: |
   | <img width="1080" height="2436" alt="profile_page1" src="https://github.com/user-attachments/assets/a46e8366-8252-40f0-a5f3-0f708ed16d4d" /> | <img width="1080" height="2436" alt="edit_profile" src="https://github.com/user-attachments/assets/bb56256d-961d-42b9-9505-2433b6a2ce15" /> | <img width="1080" height="2436" alt="ss11" src="https://github.com/user-attachments/assets/89c96d88-cc39-4018-894a-9adb9b282b27" /> | <img width="1080" height="2436" alt="ss12" src="https://github.com/user-attachments/assets/6f942bac-5e6d-4630-97d7-6fec8edabd95" /> |

---

## Error Handling Terintegrasi
Aplikasi telah dilengkapi validasi data dan error handling untuk menjamin stabilitas:

* Validasi Profil Pengguna:
   * Maksimal berat badan (BB) adalah 500 kg.
   * Maksimal tinggal badan (TB) adalah 300 cm.
   * Maksimal umur adalah 120 tahun
   * Nilai di atas tidak boleh negatif/minus.
* Koneksi Internet (AI Page): Jika tidak ada koneksi internet saat menggunakan AI Workout atau Scanner, aplikasi akan menolak permintaan dan memunculkan notifikasi/pesan "Cek jaringan Anda".

---

## Seluruh Tech Stack
Aplikasi ini menggunakan teknologi lintas platform yang modern dan clean architecture (MVVM):

* UI Framework: Compose Multiplatform - UI deklaratif untuk Android & iOS.
* Networking: Ktor Client - HTTP Request untuk API Gemini dan Wger.
* Dependency Injection: Koin - Mengelola lifecycle, ViewModel, dan Repository.
* Local Database: SQLDelight - Database SQLite lokal yang type-safe.
* Local Preferences: DataStore & Okio - Menyimpan konfigurasi, state login, dan streak harian.
* Image/Media Processing: Coil3 (render gambar/GIF) & Peekaboo (fitur kamera/galeri native).
* Secrets Management: BuildKonfig - Menyimpan kunci API secara aman.
* Concurrency: Kotlin Coroutines & Flow.

---

## 🏗️ Diagram Arsitektur MVVM

FitGen mengimplementasikan pola arsitektur **MVVM (Model-View-ViewModel)** yang dipadukan dengan prinsip *Clean Architecture* untuk memastikan kode komponen tetap terpisah, modular, mudah diuji (*testable*), serta optimal saat dijalankan di lingkungan Kotlin Multiplatform.

```mermaid
graph TD
    %% Definisi Node Utama
    V["🎨 View / UI Screen<br>(Compose Multiplatform)"]
    VM["⚡ ViewModel<br>(State Holders & Events)"]
    UC["⚙️ Use Cases<br>(Domain Layer / Business Logic)"]
    RI["📋 Repository Interface"]
    RI_Impl["🏗️ Repository Implementation<br>(Data Layer)"]
    
    %% Penyimpanan & Sumber Data
    DB[("💾 Local Database<br>(SQLDelight / DataStore)")]
    API["🌐 Remote API<br>(Ktor / Gemini / Wger)"]

    %% Alur Hubungan Komponen (Logika yang Diperbaiki)
    V -->|"Kirim Intent / Aksi"| VM
    V -.->|"Observe UI State (Flow)"| VM
    VM -->|"Panggil Logic / Use Cases"| UC
    UC -->|"Melakukan Penyimpanan / Akses Data"| RI
    RI_Impl -.->|"Mengimplementasikan"| RI
    RI_Impl -->|"Operasi Local Database"| DB
    RI_Impl -->|"Operasi Remote API"| API

    %% Penataan Gaya Visual (Mermaid Styling)
    classDef layerView fill:#f9f0ff,stroke:#d3adf7,stroke-width:2px;
    classDef layerVM fill:#e6f7ff,stroke:#91d5ff,stroke-width:2px;
    classDef layerDomain fill:#f6ffed,stroke:#b7eb8f,stroke-width:2px;
    classDef layerData fill:#fff7e6,stroke:#ffd591,stroke-width:2px;
    
    class V layerView;
    class VM layerVM;
    class UC,RI layerDomain;
    class RI_Impl,DB,API layerData;
```

---

## Persyaratan Sistem & Instalasi
Persyaratan Sistem:
* **Java**: JDK 17 atau lebih baru
* **IDE**: Android Studio Ladybug/Intellij IDEA
* **Untuk iOS**: macOS dengan versi terbaru Xcode terinstal

Instalasi & Cara Menjalankan
1. Clone repositori ini
   ```bash
   git clone <link-repositori>
   ```
2. Siapkan local.properties: Duplikat file local.properties.example menjadi local.properties dan isi dengan API Key yang valid (untuk Gemini AI API dll).
3. Sinkronisasi Gradle: Buka project di Android Studio, lalu lakukan sync project dengan Gradle files.
4. Jalankan Aplikasi:
   * Android: Pilih konfigurasi run composeApp untuk Android dan tekan Run (shift + F10).
   * iOS: Pilih konfigurasi run iosApp dan jalankan di simulator atau perangkat fisik Apple.
  
---

## Struktur Proyek
Berikut adalah gambaran tingkat tinggi dari struktur proyek Kotlin Multiplatform ini:

```text
📦 composeApp/src/commonMain
 ┣ 📂 core          # Utilitas umum, Config Ktor, Ekstensi, dll.
 ┣ 📂 data          # Repository Implementation, Data Sources (SQLDelight, Ktor).
 ┣ 📂 di            # Konfigurasi Dependency Injection dengan Koin.
 ┣ 📂 domain        # Interface Repository, Models (Entity), dan Use Cases.
 ┣ 📂 presentation  # Layer UI (Screens), ViewModels, dan Theme.
 ┗ 📂 sqldelight    # Skema Tabel Database (.sq) untuk Code Generation.
```
 ---

 ## Video YouTube
 Tonton demonstrasi lengkap fitur dan cara penggunaan aplikasi FitGen pada video di bawah ini:
 <div align="left">
  <a href="https://youtube.com/shorts/2iAqDp_CnL0">
    <img src="https://img.shields.io/badge/YOUTUBE-TONTON%20DEMO%20FITGEN-FF0000?style=for-the-badge&logo=youtube&logoColor=white" alt="Tonton Demo FitGen di YouTube">
  </a>
</div>

 ---

 ## Anggota Tim
 
 | **No** | **Nama** | **NIM** |
 | --- | --- | --- |
 | 1 | Anisah Octa Rohila | 123140137 |
 | 2 | Fanisa Aulia Safitri | 123140121 |


**Dosen Pengampu**: Muhammad Habib Alghifari, S.kom., M.Kom.
