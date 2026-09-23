# Sistem Manajeman Pengelolaan Rumah Subsidi

Nama  : Farah Hikmatul Maula

NIM   : 2509116099

# Deskripsi Singkat Program
Sistem manajemen rumah suubsidi dibuat untuk administrasi dalam mengelola pendataan rumah subsidi, data pembeli, pengajuan rumah subsidi sampai dengan proses pembayaran. Sistem ini ditujukan untuk bagian administrasi atau admin.

Program dijalankan
Admin dapat melakukan proses menambah data, melihat, mengubah, dan menghapus data rumah subsidi dan pembeli yang digunakan sebagai syarat mengajukan pembelian rumah subsidi. 

Setelah data dimasukkan pembeli dapat melakukan pengajuan pembelian dengan memasukkan NIK pembeli dan ID rumah yang ingin diajukan. Setelah itu akan dilakukan proses pengajuan, jika penghasilan atau gaji pembeli dibawah 2 juta serta sudah mempunyai rumah sebelumnya maka pengajuan akan ditolak. Setelah pengajuan diproses dan memenuhi persyaratan, pengajuan dapat disetujui dan dilanjutkan ke proses pembayaran. Saat melakukan pembayaran terdapat dua pilihan yaitu sistem cash atau cicilan. Untuk pembayaran cicilan, sistem menghitung jumlah cicilan berdasarkan 30% dari penghasilan pembeli.

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


Admin dapat melakukan proses menambah data, melihat, mengubah, dan menghapus data rumah subsidi dan pembeli yang digunakan sebagai syarat mengajukan pembelian rumah subsidi. 

Setelah data dimasukkan pembeli dapat melakukan pengajuan pembelian dengan memasukkan NIK pembeli dan ID rumah yang ingin diajukan. Setelah itu akan dilakukan proses pengajuan, jika penghasilan atau gaji pembeli dibawah 2 juta serta sudah mempunyai rumah sebelumnya maka pengajuan akan ditolak. Setelah pengajuan diproses dan memenuhi persyaratan, pengajuan dapat disetujui dan dilanjutkan ke proses pembayaran. Saat melakukan pembayaran terdapat dua pilihan yaitu sistem cash atau cicilan. Untuk pembayaran cicilan, sistem menghitung jumlah cicilan berdasarkan 30% dari penghasilan pembeli.
