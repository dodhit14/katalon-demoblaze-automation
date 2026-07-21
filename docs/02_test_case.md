# Creating Test Case

## Overview

Tescase merupakan kumpulan langkah-langkah(test steps) yang digunakan untuk memverivikasi sebuah skenario pengujian.

Pada project ini, setiap test case dibuat menggunakan fitur **Manual View**, pendekatan ini digunakan untuk memahami hubungan langkah-langkah Manual Testing dengan Automation Testing yang dikombinasikan dengan Script View atau custom keyword. 

Seluruh Test Case menggunakan Test Object yang berasal dari **Object Repository**, sehingga locator tidak ditulis secara langsung di dalam Test Case.

---

## Tujuan

Dokumentasi ini menjelaskan bagaimana saya menyusun test case yang 
- mudah dibaca (readable)
- mudah dipelihara
- dapat digunakan sebagai bagian dari Test Suite

## Struktur Folder

Test Case dikelompokkan berdasarkan fitur aplikasi.

```text
Test Cases
│
├── Authentification
│   ├── TC_Login
│   ├── TC_Register
│   └── TC_Logout
│
├── Product and Category
│   ├── TC_
│   └── TC_
│
└── 
```

Setiap Test Case merepresentasikan satu fitur utama.

Berbagai variasi pengujian, seperti valid maupun invalid input, dijalankan menggunakan **Data Files** sehingga satu Test Case dapat digunakan kembali untuk beberapa skenario tanpa perlu membuat Test Case baru.

---
## Naming Convention

Saya menggunakan format penamaan berikut.

```
TC_<Feature>
```

Contoh:

```
TC_Login

TC_Register

TC_Logout
```

Penamaan tersebut dibuat sederhana karena setiap Test Case merepresentasikan satu fitur utama.
Variasi skenario pengujian dikelola melalui **Data Files**, bukan melalui penambahan Test Case baru.

---

## Best Practices

Selama mengembangkan project ini saya menerapkan beberapa prinsip berikut.

### Kelompokkan Test Case berdasarkan fitur

Setiap fitur utama memiliki satu Test Case.

Contoh:

```
TC_Login

TC_Register

TC_Logout
```

Sedangkan variasi skenario dijalankan menggunakan Data Files.

---

### Gunakan Object Repository

Seluruh locator dipanggil melalui Object Repository.

Dengan demikian perubahan locator hanya dilakukan pada satu tempat.

---

### Pisahkan Logic dan Data

Langkah automation hanya ditulis satu kali.

Seluruh variasi username, password, dan expected result disimpan pada Data Files sehingga Test Case lebih mudah dipelihara.

---

### Gunakan Nama yang Konsisten

Penamaan Test Case mengikuti nama fitur agar mudah ditemukan ketika project berkembang.

---

## Pembelajaran

Selama membangun project ini saya memahami bahwa banyak skenario memiliki langkah automation yang sama.

Daripada membuat banyak Test Case dengan isi yang hampir identik, saya memilih menggunakan **Data-Driven Testing** sehingga satu Test Case dapat dijalankan menggunakan berbagai kombinasi data.

Pendekatan ini membuat project lebih ringkas, mengurangi duplikasi, dan mempermudah proses maintenance ketika terdapat perubahan pada alur aplikasi.

---

## Pengembangan Selanjutnya

Saat ini beberapa langkah automation masih ditulis langsung di dalam Test Case.

Pada tahap berikutnya, langkah-langkah yang sering digunakan, seperti proses Login atau Register, akan dipindahkan ke **Custom Keyword** agar dapat digunakan kembali oleh banyak Test Case dan membuat automation menjadi lebih modular.

---

## Kesimpulan

Test Case merupakan inti dari automation testing pada Katalon Studio.

Dengan menggabungkan **Object Repository** dan **Data-Driven Testing**, project ini dapat mengelola berbagai skenario pengujian tanpa perlu membuat banyak Test Case yang memiliki langkah automation yang sama.

Pendekatan ini membuat automation lebih mudah dipelihara, lebih mudah dikembangkan, dan lebih siap untuk diintegrasikan ke dalam Test Suite maupun automation workflow yang lebih kompleks.