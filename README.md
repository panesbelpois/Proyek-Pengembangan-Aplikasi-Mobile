<div align="center">
  <img width="1080" height="1080" alt="Desain tanpa judul" src="https://github.com/user-attachments/assets/ca01a9ad-5d4e-40c7-a89a-4687bca6e554" />
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
 ┣ **Catatan:** Proyek ini disusun secara khusus untuk memenuhi **Tugass Besar Mata Kuliah Pengembangan Aplikasi Mobile (PAM)**
```
--- 
## Fitur Utama
1. **AI Food Scanner (Pemindai Nutrisi)** - Pindai gambar makanamu, dan AI akan mengidentifikasi nama makanan, estimasi kalori, serta rincian makronutrien (Protein, Karbohidrat, Lemak) secara otomatis
2. **AI Workout Generator/Smart Assistant** - Chatbot cerdas yang siap menjawab pertanyaanmu mengenai rekomendasi latihan, penyesuaian jadwal latihan, diet, dan pemulihan tubuh
3. **Daily Tracker (Nutrisi & Hidrasi)** - Lacak jumlah asupan harianmu, asupan nutrisi, air, serta login streak untuk menjaga motivasi dengan grafik yang interaktif.
4. **Popular Challenges & Exercises** - Ikuti tantangan olahraga populer dan cari katalog latihan dengan panduan animasi/GIF (didukung oleh Wger API).
5. **Dark Mode** - Pengalaman pengguna yang nyaman bagi mata baik di kondisi terang maupun gelap.

## Screenshots
Berikut adalah cuplikan fitur-fitur dari aplikasi FitGen:
1. **Homepage & Dashboard**
   <div align="center">
      <img width="387" height="1599" alt="image" src="https://github.com/user-attachments/assets/6ea3fe11-da78-40e9-b413-f9f2a34f7c1b" />
   </div>
2. **Popular Challenges & Detail**
   <div align="center">
      <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/bd20e6c1-85e3-4042-90e1-610ed4eec94e" />
      <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/e1e2b9d2-779c-47bc-9dc7-3609530a330a" />
   </div>
3. **AI Workout & Assistant**
   <div align="center">
      <img width="503" height="1600" alt="image" src="https://github.com/user-attachments/assets/50e9919e-85f5-4da6-824a-b5f3418f9e48" />

      <img width="379" height="1600" alt="image" src="https://github.com/user-attachments/assets/08bfdc18-a374-434d-b89c-2ac65d88e28d" />

   </div>
4. **Classic Workout & Timer + Tambah Custom Latihan**
   <div align="center">
     <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/60d7b2d1-398f-47b2-974f-fd1f95b593f2" />

      <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/fe97c112-7a80-477d-a528-18c2c23cba4b" />

      <img width="1080" height="584" alt="image" src="https://github.com/user-attachments/assets/d36f7157-68d1-4c39-a8ef-4cb3a46dba6b" />

   </div>
5. **Page Latihan & Rekap Latihan (Harian/Mingguan/Bulanan)**
    <div align="center">
      <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/f87665c2-a604-4dea-a07b-08ea81f60635" />
   </div>
6. **Custom Latihan & Search Bar Latihan**
    <div align="center">
      <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/e872bcc8-8beb-4149-83c7-c57011fffb34" />

   </div>
7. **Page Nutrisi Harian & AI Cam Food Scanner**
   <div align="center">
      <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/9a2c6c3c-391c-4f52-bee7-b0c918b2bf1f" />

      <img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/a9c6cd2f-7ac1-46a5-a0ff-315c2a0fe497" />

   </div>
8. **Profil Page & Edit Profil**
   <div align="center">
      <img width="375" height="1600" alt="image" src="https://github.com/user-attachments/assets/c6cf5963-9286-4902-9c59-eefb41c7b54e" />

      <img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/2aa96fee-fbb8-48d0-922b-c2d649a01d06" />
   </div>

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

## Diagram Arsitektur MVVM
FitGen mengimplementasikan pola arsitektur Model-View-ViewModel (MVVM) dengan pemisahan Clean Architecture antara lapisan Data, Domain, dan UI/Presentation.

Terima kasih atas koreksinya. Pemahaman Anda sudah sangat tepat mengenai siklus aliran data pada MVVM dan Clean Architecture. Teks pada panah sebelumnya memang kurang pas secara logika arah interaksinya.

Berikut adalah sintaks Mermaid yang sudah diperbaiki logikanya. Sekarang View secara eksplisit meng-observe state dari ViewModel dan mengirimkan intent ke arah yang benar, diteruskan hingga ke eksekusi database dan API:

Markdown
## 🏗️ Diagram Arsitektur MVVM

Aplikasi ini menerapkan pola arsitektur **MVVM (Model-View-ViewModel)** yang dipadukan dengan prinsip *Clean Architecture* untuk memastikan kode komponen tetap terpisah, modular, mudah diuji (*testable*), serta optimal saat dijalankan di lingkungan Kotlin Multiplatform.

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
3. Siapkan local.properties: Duplikat file local.properties.example menjadi local.properties dan isi dengan API Key yang valid (untuk Gemini AI API dll).
4. Sinkronisasi Gradle: Buka project di Android Studio, lalu lakukan sync project dengan Gradle files.
5. Jalankan Aplikasi:
   * Android: Pilih konfigurasi run composeApp untuk Android dan tekan Run (shift + F10).
   * iOS: Pilih konfigurasi run iosApp dan jalankan di simulator atau perangkat fisik Apple.
  
---

## Struktur Proyek
Berikut adalah gambaran tingkat tinggi dari struktur proyek Kotlin Multiplatform ini:

```teks
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
**Program Studi**: Teknik Informatika
**Institusi**: Institut Teknologi Sumatera
