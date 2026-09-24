# Sistem Manajeman Pengelolaan Rumah Subsidi

Nama  : Farah Hikmatul Maula

NIM   : 2509116099

# Deskripsi Singkat Program
Sistem manajemen rumah suubsidi dibuat untuk administrasi dalam mengelola pendataan rumah subsidi, data pembeli, pengajuan rumah subsidi sampai dengan proses pembayaran. Sistem ini ditujukan untuk bagian administrasi atau admin. Terdapat 4 package dalam sistem saya. Pertama package main terdapat class main.java yang digunakan sebagai class utama untuk menjalankan program yang sudah dibuat. Kedua package model terdapat class rumah, pembeli, dokumen, pengajuan dan terdapat dua class tambahan dari inheritance yaitu rumah terjual dan rumah tersedia. Isi dari package ini adalah tempat atribut yang nantinya akan diisi jika program dijalankan. Ketiga package controller sebelum ini namanya adalah package crud tetapi karena saya menerapkan mvc maka diganti namanya menjadi controller. Terdapat class manajemen data dan validasi input didalamnya. Class manajemen data digunakan sebagai tempat untuk mengelola data dari package model dan lainnnya istilahnya sebagai tempat bermain utama dari sistem ini. Class validasi input digunakan untuk memeriksa data yang dimasukkan agar sesuai dengan aturan. Keempat package view yang terdapat class sistem view digunakan untuk mnampilkan data kepada user interface view ini juga berhubungan dengan penerapan mvc.

# Alur Program
Program utama dijalankan di package main. Class manajemen data digunakan untuk mengatur semua proses pengolahan data dan juga berperan sebagai controller karena controller tugasnya memang menerima input dari pengguna, memproses, meminta data yang diperlukan ke model, lalu mengirimkan hasilnya kembali ke View untuk ditampilkan. Saat sistem dijalankan terdapat lagi menu utama dari sistem manajemen pengelolaan rumah subsidi seperti pada gambar dibawah ini.
<img width="855" height="205" alt="image" src="https://github.com/user-attachments/assets/aef79a64-751c-4e21-805c-4d1820f5f9e8" />
Pada menu utama jika memilih menu utama dapat melakukan proses menambah data, melihat, mengubah, menghapus, melakukan verifikasi, sampai melakukan pembayaran pada setiap pilihannya sesuai dengan tugasnya masing-masing.

1. Manajemen Data Rumah 
<img width="822" height="401" alt="image" src="https://github.com/user-attachments/assets/9c342243-b072-485f-ade4-ec650a528769" />
Jika memilih no 1 pada menu utama akan masuk ke dalam manajemen data rumah. Admin dapat melakukan proses menambah data, melihat, mengubah, dan menghapus data rumah subsidi. Menu pertama saat melakukan pendataan tambah rumah sistem meminta memasukkan ID rumah, unit rumah, tipe rumah, harga, jumlah unit, dan blok rumah, jika berhasil memasukkannya data akan berhasil di simpan ke dalam sistemnya dan dapat dilihat pada menu kedua yaitu lihat rumah seperti contoh pada gambar dibawah ini.
<img width="763" height="316" alt="image" src="https://github.com/user-attachments/assets/85e64eda-1d5c-494b-8089-6e76d0d6f87a" />

Apabila ingin mengubah data rumah subsidi yang sudah ada bisa menggunakan menu 3 yaitu ubah rumah dengan memasukkan id rumah lalu dapat mengubah unit, tipe rumah, dan harga. Menu ini juga bisa digunakan untuk menghapus data rumah dengan memilih menu 4 yaitu hapus rumah maka data rumah otomatis akan terhapus. Menu 5 yaitu kembali akan mengembalikan sistem ke menu utama dari manajemen rumah subsidi ini dan lanjut untuk manajemen data lainnya. 

2. Manajemen Data Pembeli
<img width="832" height="397" alt="image" src="https://github.com/user-attachments/assets/b9ca108c-0c72-487e-960b-2ebff99e36ca" />
Pada menu pembeli ini isi menu sama dengan menu rumah yang sebelumnya dijelaskan. Kita dapat melakukan proses menambah data, melihat, mengubah, dan menghapus data pembeli. Saat menambahkan data pembeli di menu 1 akan diminta untuk memasukkan NIK, nama, penghasilan, nomor HP, dan status kepemilikan rumah. Setelah semua data terisi sistem akan langsung menyimpan data tersebut. Data pembeli bisa dilihat jika memilih menu 2 yaitu lihat pembeli seperti pada contoh gambar dibawah ini.
<img width="808" height="242" alt="image" src="https://github.com/user-attachments/assets/9b066d73-a7ca-4d48-86d8-3c460841592a" />

Apabila ingin mengubah data pembeli yang sudah ada bisa menggunakan menu 3 yaitu ubah pembeli dengan memasukkan NIK lalu dapat mengubah penghasilan dan no hp pembeli. Menu 4 ini digunakan untuk menghapus data pembeli maka data pembeli otomatis akan terhapus. Menu 5 yaitu kembali akan mengembalikan sistem ke menu utama dari manajemen rumah subsidi ini dan lanjut untuk manajemen data lainnya. 

3. Manajemen Dokumen
<img width="681" height="189" alt="image" src="https://github.com/user-attachments/assets/ee520496-0af4-40b4-a6f7-992118c7e288" />
Pada menu dokumen ini di menu 1 yaitu tambah dokumen bisa melakukan penambahan dokumen, dengan memasukkan id dokumen, NIK pembeli, dokumen yang dipilih bisa KTP atau surat keterangan belum mempunyai rumah sesuai dengan format yang ada lalu dokumen akan tersimpan tapi statusnya belum diverifikasi. Jika ingin diverifikasi ada pada menu 3 yaitu Verifikasi Dokumendengan memasukkan id dokumen kemudian dicek kembali apakah dokumen sudah sesuai jika sudah sesuai maka statusnya akan terverifikasi. Untuk melihat dokumen yang sudah ditambahkan bisa memilih menu 2 yaitu lihat dokumen seperti pada gambar dibawah ini.
<img width="714" height="149" alt="image" src="https://github.com/user-attachments/assets/ca2403b3-7bb9-4956-81ee-b07ad327a454" />

Menu 4 digunakan untuk menghapus dokumen yang ada dan otomatis akan terhapus pada sistem. Menu 5 yaitu kembali akan mengembalikan sistem ke menu utama dari manajemen rumah subsidi ini dan lanjut untuk manajemen data lainnya.

4. Manajemen Pengajuan Rumah Subsidi
<img width="625" height="208" alt="image" src="https://github.com/user-attachments/assets/7429debd-668e-4948-8c3f-e8b9473743b7" />
Pada menu pengajuan dapat membuat pengajuan rumah subsidi berdasarkan data pembeli, rumah, dan dokumen yang telah tersedia. Menu 1 yaitu tambah pengajuan
diminta untuk memasukkan id pengajuan, NIK pembeli, id rumah yang ingin dibeli kemudian akan dilihat penghasilan pembeli yang sebelumnya sudah dimasukkan jika gaji pembeli diatas atau sama dengan 2 juta maka pengajuan tidak bisa dibuat selain itu juga dilihat apakah pembeli sebelumnya sudah punya rumah atau belum. Jika belum maka pengajuan bisa dibuat. Ini adalah indikator yang menentukan apakah bisa mengajukan pembelian rumah subsidi atau tidak. Pada menu 2 dapat melihat hasil pengajuan yang sudah ditambahkan pada sistem seperti pada gambar dibawah ini.
<img width="705" height="216" alt="image" src="https://github.com/user-attachments/assets/673ca051-bdf6-4875-ad74-d519c5c0b94a" />

Menu 3 yaitu proses pengajuan merupakan proses dimana dapat melakukan verifikasi pengajuan pembelian rumah subsidi dengan memastikan data yang ada sudah sesuai agar pengajuan bisa disetujui. Menu 4 yaitu pembayaran dimana proses ini melakukan pembayaran rumah subsidi setelah proses pengajuan pembelian sudah disetujui. Dengan memasukkan id pengajuan lalu ada 2 cara yang bisa dipilih untuk pembayaran yaitu secara cash atau cicilan. Untuk pembayaran cash langsunng dengan memasukkan nominal pembayaran yang sesuai dengan harga rumah yang dibeli. Sementara itu untuk pembayaran cicilan, sistem menghitung jumlah cicilan berdasarkan 30% dari penghasilan pembeli.

# Penerapan Encapsulation & Inheritance

- Encapsulation

Dalam sistem manajemen pengelolaan rumah subsidi penerapan encapsulation ada pada semua class yang terdapat pada package model. Encapsulation pada program saya menerapkan access modifier private di dalam atribut class dan cara akses atributnya menggunakan getter dan setter. Dibawah ini adalah gambar dari penerapan encapsulation pada class package model. Secara keseluruhan program yang dipakai sama di setiap classnya.

**1. Class Rumah**

   <img width="1124" height="325" alt="image" src="https://github.com/user-attachments/assets/1ffc37d4-8ee4-4364-a94e-60ae33c79ac3" />

   Bisa terlihat pada gambar diatas bahwa atribut di dalam class rumah semua diberi akses private yang dimana jika access modifier privat maka yang bisa mengakses atribut hanya class itu sendiri dan package, subclass, dan lainnya diluar class rumah tidak dapat mengakses atribut tersebut. Maka dari itu dibutuhkan getter dan setter agar atribut yang disembunyikan dapat diakses di luar class rumah. Pada id rumah terdapat tambahan variabel yaitu final ini menandakan bahwa id rumah adalah atribut yang wajib ada atau sebagai primary key dari class ini dan juga nantinya akan berhubungan dengan inheritance.

   Pada gambar dibawah ini adalah penerapan getter yang digunakan untuk mengambil data field dan setter digunakan untuk  mengubah data. Data ini tidak dapat diubah secara sembarangan dari luar class. Perubahan dilakukan melalui setter, sedangkan pengambilan informasi menggunakan getter. Jika sudah melakukan perubahan atau modifikasi pada atribut data akan tersimpan pada public void tampilkan data dan akan berhasil disimpan di public final void cetak data rumah. Ini adalah penerapan encapsulation pada model class rumah.
   <img width="1106" height="508" alt="image" src="https://github.com/user-attachments/assets/bd4a6646-6369-4a60-8901-21e4480447c1" />
   <img width="1169" height="734" alt="image" src="https://github.com/user-attachments/assets/5a66c8ea-bc8d-42dc-b2fa-967e31868cce" />

**2. Class Pembeli**
   
   <img width="1243" height="337" alt="image" src="https://github.com/user-attachments/assets/0d141294-a702-4463-89b9-c8294c3446b4" />

   Bisa terlihat pada gambar diatas bahwa atribut di dalam class pembeli semua diberi akses private yang dimana jika access modifier privat maka yang bisa mengakses atribut hanya class itu sendiri sedangkan package, subclass, dan lainnya diluar class rumah tidak dapat mengakses atribut tersebut. Maka dari itu dibutuhkan getter dan setter agar atribut yang disembunyikan dapat diakses di luar class rumah.
   
   Pada gambar dibawah ini adalah penerapan getter yang digunakan untuk mengambil data field dan setter digunakan untuk  mengubah data. Data ini tidak dapat diubah secara sembarangan dari luar class. Perubahan dilakukan melalui setter, sedangkan pengambilan informasi menggunakan getter. Jika sudah melakukan perubahan atau modifikasi pada atribut data akan tersimpan pada public void tampilkan data. Ini adalah penerapan encapsulation pada model class rumah.
   <img width="1309" height="632" alt="image" src="https://github.com/user-attachments/assets/0b7464ca-2ad9-41f8-95ce-b4743ddef7fe" />
   <img width="1173" height="636" alt="image" src="https://github.com/user-attachments/assets/98af42d2-235e-4f7d-9cc3-204875efb6b9" />
   <img width="1112" height="243" alt="image" src="https://github.com/user-attachments/assets/b8d2a317-f9cf-4592-b437-be785919b1b3" />

**4. Class Dokumen**
   
   <img width="1042" height="311" alt="image" src="https://github.com/user-attachments/assets/af78b404-7a0e-40de-8da5-83b443b96517" />

   Bisa terlihat pada gambar diatas bahwa atribut di dalam class dokumen semua diberi akses private yang dimana jika access modifier privat maka yang bisa mengakses atribut hanya class itu sendiri sedangkan package, subclass, dan lainnya diluar class dokumen tidak dapat mengakses atribut tersebut. Maka dari itu dibutuhkan getter dan setter agar atribut yang disembunyikan dapat diakses di luar class dokumen.
   
   Pada gambar dibawah ini adalah penerapan getter yang digunakan untuk mengambil data field dan setter digunakan untuk  mengubah data. Data ini tidak dapat diubah secara sembarangan dari luar class. Perubahan dilakukan melalui setter, sedangkan pengambilan informasi menggunakan getter. Jika sudah melakukan perubahan atau modifikasi pada atribut data akan tersimpan pada public void tampilkan data. Ini adalah penerapan encapsulation pada model class rumah.
   <img width="1300" height="607" alt="image" src="https://github.com/user-attachments/assets/c0d80cd7-5cf3-4dc8-962c-a3b6850c6e85" />
   <img width="1178" height="637" alt="image" src="https://github.com/user-attachments/assets/1d6f1e85-92c8-4639-9da5-675e0a77c698" />

**6. Class Pengajuan**

   <img width="1000" height="364" alt="image" src="https://github.com/user-attachments/assets/d026e446-2680-46c6-aa42-d7e41797c240" />

Terlihat pada gambar diatas bahwa atribut di dalam class pengajuan semua diberi akses private yang dimana jika access modifier privat maka yang bisa mengakses atribut hanya class itu sendiri sedangkan package, subclass, dan lainnya diluar class pengajuan tidak dapat mengakses atribut tersebut. Maka dari itu dibutuhkan getter dan setter agar atribut yang disembunyikan dapat diakses di luar class pengajuan.
   
   Pada gambar dibawah ini adalah penerapan getter yang digunakan untuk mengambil data field dan setter digunakan untuk  mengubah data. Data ini tidak dapat diubah secara sembarangan dari luar class. Perubahan dilakukan melalui setter, sedangkan pengambilan informasi menggunakan getter. Jika sudah melakukan perubahan atau modifikasi pada atribut data akan tersimpan pada public void tampilkan data. Ini adalah penerapan encapsulation pada model class pengajuan.
   <img width="1286" height="665" alt="image" src="https://github.com/user-attachments/assets/4771785d-e2b7-4738-acfc-c1e7c64f5847" />
   <img width="1098" height="632" alt="image" src="https://github.com/user-attachments/assets/7e54a0e9-b4be-450e-a2c7-7aae886dc099" />
   <img width="985" height="477" alt="image" src="https://github.com/user-attachments/assets/a49accd3-2aad-4ff7-8967-818cafc41fc0" />

- Inheritance
  
  Dalam sistem saya menerapkan inheritance dengan terdapat 1 superclass dan 2 subclass. Class rumah pada package model saya jadikan sebagai superclass atau induk dari subclass yang nanti atributnya akan diwariskan pada subclass yang dibuat. Subclass yang dibuat turunan dari rumah yaitu subclass rumah tersedia dan rumah terjual.

  <img width="1283" height="470" alt="image" src="https://github.com/user-attachments/assets/15e62ce2-837c-41b6-bda9-708df4929d4c" />
  Pada gambar diatas adalah subclass rumah tersedia. Didalam class ini terdapat atribut tambahan yaitu jumlah unit dan blok rumah. Penggunaan variabel extends digunakan untuk memberitau bahwa rumah tersedia merupankan subclass atau warisan dari superclass rumah. Variabel super berisi atribut class rumah yang dipanggil. Nantinya data yang tersimpan akan masuk ke dalam public void tampilkan data. Terdapat variabel super.tampilkandata() yang dimana akan mengambil data yang ada di rumah dan menggabungkan dengan data rumah terjual sesuai dengan kode dibawah ini.
  <img width="908" height="280" alt="image" src="https://github.com/user-attachments/assets/1b7d641d-fa4d-4ba3-b6b9-6b9d42332c38" />
  
   <img width="677" height="267" alt="image" src="https://github.com/user-attachments/assets/f73dff83-5543-4c6e-ae48-af14883889f6" />
   
Gambar diatas adalah output dari superclass rumah dan subclass rumah tersedia yang saling terhubung. 

Untuk subclass rumah terjual diterapkan jika selesai melakukan pembayaran pembelian rumah subsidi. Dibawah ini adalah kode yang digunakan pada subclass rumah terjual. Isi subclass ini kurang lebih sama seperti subclass rumah tersedia seperti memanggil data dan isi super nya, yang membedakaan hanya atributnya yaitu mempunyai atribut tanggal jual. 
<img width="1293" height="386" alt="image" src="https://github.com/user-attachments/assets/dc7d4b2d-7407-4e1c-ba72-672f9ead9fe1" />
<img width="831" height="312" alt="image" src="https://github.com/user-attachments/assets/b24842f5-95b1-40a2-a352-3e7c2a84260c" />

# Penerapan Nilai Tambah














