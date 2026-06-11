# 📱 FitGen — Fitness & Health Tracker App

Fitgen adalah aplikasi pelacak kebugaran dan kesehatan komprehensif berbasis Kotlin Multiplatform (KMP). Aplikasi ini dirancang untuk merevolusi cara pengguna memantau gaya hidup sehat mereka dengan mengintegrasikan pencatatan olahraga, pelacak nutrisi otomatis menggunakan AI, pemantauan hidrasi, hingga asisten virtual pribadi untuk konsultasi kebugaran.

Dibangun dengan antarmuka yang modern menggunakan compose multiplatform, FitGen menawarkan pengguna yang mulus di ekosistem android dan iOS dengan menggunakan satu basis kode untuk logika bisnis dan User Interface.

## 👥 Nama Anggota Tim

| No | Nama | NIM | 
|----|------|-----|
| 1  | Fanisa Aulia Safitri | 123140121 |
| 2  | Anisah Octa Rohila   | 123140106 |

**Mata Kuliah:** Pengembangan Aplikasi Mobile  
**Dosen Pengampu:** Muhammad Habib Alghifari, S.Kom., M.Kom.  
**Institusi:** Institut Teknologi Sumatera 

## 📱 Deskripsi Aplikasi

Fitgen bukan hanya sekadar aplikasi pencatatan biasa, melainkan asisten cerdas yang memadukan berbagai fungsionalitas kebugaran dalam satu tempat:

1. AI Food Scanner (Pemindai Nutrisi)
   Pencatatan kalori dengan hanya mengambil foto atau unggah foto makananmu, dan model akan secara ajaib akan:
   - mengidentifikasi nama makanan di dalam gambar
   - Mengestimasi total kalori
   - Memecah makronutrian secara mendetail: Protein (g), karbohidrat (g), dan lemak (g)

2. Smart Fitnes Assistant
   Aplikasi ini menyediakan chatbot cerdas yang siap menjawab pertanyaanmu secara instan. Kamu bisa berdiskusi tentang:
   - Rekomendasi program diet
   - Penyesuaian jadwal latihan
   - Tips pemulihan otot dan pencegahan cedera

3. Workout & Routine Management
   Terintegrasi dengan basis data kebugaran global (Wger API), pengguna dapat:
- Mencari ratusan katalog latihan beserta visualisasi animasi GIF cara melakukannya.
- Membuat Custom Routine (Misalnya: *Leg Day*, *Push Day*).
- Mencatat set, repetisi, dan beban latihan ke dalam Local Database.

4. Pelacak Hidrasi
   Fitur cepat untuk mencatat jumlah gelas air yang diminum setiap harinya. Membantu pengguna mempertahankan target harian untuk metabolisme yang optimal.
  
5. Dashboard Analitik dan Gamifikasi
   - Login Streak: Sistem gamifikasi yang menghitung hari berturut-turut pengguna membuka aplikasi untuk menjaga motivasi
   - Grafik Metrik: Visualisasi data nutrisi dan kalori mingguan yang mudah dibaca menggunakan komponen Chart.

## Arsitektur & Tech Stack

Aplikasi ini mengadopsi pola Clean Architecture (Presentation, Domain, Data) dan paradigma MVVM (Model-View-ViewModel) untuk memastikan kode mudah dikembangkan, diuji, dan dipelihara.

**Library & Teknologi Lintas Platform:**
* UI Framework: [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/) - Membuat UI deklaratif untuk Android & iOS.
* Networking: [Ktor Client](https://ktor.io/) - Melakukan HTTP Request ke API Gemini, Groq, dan Wger.
* Dependency Injection: [Koin](https://insert-koin.io/) - Mengelola lifecycle Repository dan ViewModel.
* Local Database: [SQLDelight](https://cashapp.github.io/sqldelight/) - Database SQLite type-safe untuk menyimpan riwayat latihan dan nutrisi.
* Local Preferences: DataStore & [Okio](https://square.github.io/okio/) - Menyimpan Login Streak dan preferensi pengguna.
* Image Loading & Processing: [Coil3](https://coil-kt.github.io/coil/) (untuk merender gambar dari internet/GIF) & [Peekaboo](https://github.com/onseok/peekaboo) (untuk fitur Kamera & Galeri KMP).
* Secrets Management: [BuildKonfig](https://github.com/yshrsmz/BuildKonfig) - Menyembunyikan dan memanggil API Key secara aman dari `local.properties`.
* Concurrency: Kotlin Coroutines & Flow - Menangani tugas background dan reaktivitas state.

---

## 📂 Struktur Direktori Proyek

FitGen memisahkan kodenya berdasarkan tanggung jawab:


```text
📦 composeApp/src/commonMain
 ┣ 📂 core          # Utilitas umum, DI setup (AppModule), Network config (Ktor), Ekstensi.
 ┣ 📂 data          # Implementasi Repository, Database Lokal (SQLDelight), Remote API (GeminiService, Wger).
 ┣ 📂 domain        # Aturan Bisnis (Use Cases), Data Classes (Models), Interface Repository.
 ┣ 📂 presentation  # Layer UI: Screens (Home, AI, Workout, Nutrition), ViewModels, dan Theme Compose.
 ┗ 📂 sqldelight    # Skema Tabel Database (.sq) untuk Code Generation.
