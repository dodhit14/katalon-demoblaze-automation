# Build Object Repository

## Overview
- Object Repository merupakan tempat penyimpanan seluruh locator element web yang dapat digunakan pada banyak test case.
- Setiap elemen disimpan sebagai **TestObject**.
- Locator dapat berupa :
    - id
    - name
    - css selector
    - xpath
    - attributes
- Dengan menggunakan Object Repository, perubahan locator cukup dilakukan sekali.

## Cara Membuat Object Repository

Katalon Studio menyediakan beberapa cara untuk membuat Test Object. Pada project ini saya menggunakan fitur Spy Web untuk mengambil elemen web.

---
# Spy Web

## Apa itu Spy Web?

Spy Web merupakan fitur Katalon Studio untuk mengambil informasi web element secara langsung dari browser tanpa melakukan proses recording.

Spy Web digunakan ketika saya hanya membutuhkan locator dari suatu element tertentu.

Contohnya:

- Login Button
- Username Textbox
- Password Textbox

Setelah proses spy selesai, object dapat langsung disimpan ke dalam Object Repository.
---

## Kapan Menggunakan Spy Web?

Saya lebih sering menggunakan Spy Web ketika:

- hanya membutuhkan beberapa object
- ingin memilih locator secara manual
- melakukan maintenance locator yang berubah

Spy Web memberikan kontrol lebih besar terhadap locator yang akan digunakan.

---

# Record Web

## Apa itu Record Web?

Record Web merupakan fitur yang merekam interaksi pengguna terhadap browser.

Selain membuat Test Case secara otomatis, Record Web juga menghasilkan Test Object yang akan disimpan pada Object Repository.

Fitur ini sangat mudah digunakan untuk pemula, nemun memiliki kelemahan seperti script yang rapuh terhadap perubahan UI, menghasilkan kode yang berulang dan sering kesulitan menggambil eleman yang dinamis.

---

## Kapan Menggunakan Record Web?

Saya menggunakan Record Web ketika ingin:

- membuat prototype automation lebih cepat
- mengetahui object apa saja yang digunakan dalam suatu alur
- memahami urutan automation

Namun setelah recording selesai, saya tetap melakukan review terhadap object yang dihasilkan.

Tidak semua locator hasil recording digunakan secara langsung.

---

# Struktur Object Repository

Pada project ini Object Repository disusun berdasarkan fitur aplikasi.

```text
Object Repository
│
├── Login
│   ├── txt_username
│   ├── txt_password
│   └── btn_login
│
├── Register
│   ├── txt_username
│   ├── txt_password
│   └── btn_register
│
└── Logout
    └── btn_logout
```

Dengan struktur tersebut, object menjadi lebih mudah ditemukan ketika project mulai berkembang.

---

# Naming Convention

Saya menggunakan format penamaan berikut.

```
txt_username

txt_password

btn_login

lbl_welcome

lnk_home
```

Prefix yang digunakan:

| Prefix | Keterangan |
|---------|------------|
| txt | Text Field |
| btn | Button |
| lbl | Label |
| lnk | Link |
| img | Image |
| ddl | Dropdown |
| chk | Checkbox |
| rdo | Radio Button |

Penamaan yang konsisten membuat Test Case lebih mudah dibaca.

---

# Best Practices

Selama mengembangkan project ini saya menerapkan beberapa prinsip berikut.

- Mengelompokkan object berdasarkan fitur.
- Menggunakan nama object yang konsisten.
- Menghindari penggunaan Absolute XPath.
- Memilih locator yang paling stabil.
- Menggunakan satu object untuk banyak Test Case.

---

# Kendala yang Saya Temui

Pada website Demoblaze terdapat modal Login dan Register yang memiliki struktur HTML hampir sama.

Jika menggunakan XPath yang terlalu umum, automation dapat memilih element yang salah.

Solusi yang saya gunakan adalah:

- memilih locator yang lebih spesifik
- memvalidasi locator menggunakan Spy Web
- menyimpan object Login dan Register pada folder yang berbeda

Pendekatan tersebut membuat proses maintenance menjadi lebih mudah.

---

# Pembelajaran

Dari implementasi pada project ini saya memahami bahwa Object Repository bukan hanya tempat menyimpan locator.

Object Repository merupakan fondasi yang menentukan kemudahan maintenance automation.

Semakin baik struktur Object Repository, semakin sedikit perubahan yang perlu dilakukan ketika aplikasi mengalami perubahan UI.

---

# Kesimpulan

Object Repository membantu memisahkan locator dari Test Case sehingga automation menjadi lebih modular, mudah dibaca, dan lebih mudah dipelihara.

Spy Web dan Record Web merupakan dua fitur yang sangat membantu dalam membangun Object Repository, namun setiap locator tetap perlu divalidasi sebelum digunakan pada automation.