# User API Spec
## Dosen :
### Add Dosen
Endpoint : GET/dsn/add

Request Body :
```json
{
  "nidn"  : " ", // input data
  "nama"  : " ", // input data
  "gelar" : " ", // input data
  "email" : " " // input data
}
```

Repsonse Body (Success) :
```json
{
  "id"   : "1",
  "nidn"  : "2211",
  "nama"  : "Imran",
  "gelar" : "Hi-Tech",
  "email" : "imran@example.com"
}
```
Response Body (Failed) :
```json
{
  "errors" : "Unauthorized"
}
```

## Get Dosen

Endpoint : GET /dsn

Response Body(Sccess) :
```json
{
  "id"   : "1",
  "nidn"  : "2211",
  "nama"  : "Imran",
  "gelar" : "Hi-Tech",
  "email" : "imran@example.com"
}
```
Response Body (Failed) :
```json
{
  "errors" : "Unauthorized"
}
```
## Update Dosen

Endpoint : GET/dsn/update/{id}

Request Body :
```json
{
  "nidn"  : "2211", // put if only want to update nidn
  "nama"  : "Imran", // put if only want to update nama
  "gelar" : "Hi-Tech", // put if only want to update gelar
  "email" : "imran@example.com" // put if only want to update email
}
```

Response Body (Success) :
```json
{
  "nidn"  : "2211",
  "nama"  : "Imran",
  "gelar" : "Hi-Tech",
  "email" : "imran@example.com"
}
```
Response Body (Failed) :
```json
{
  "errors" : "Unauthorized"
}
```
## Delete Dosen

Endpoint : POST/dsn/delete/{id}

Request body :
```json
{
  "id" : " " //input id
}
```

Response Body (Success):
```json
{
  //Data berhasil Dihapus
}
```

Respone Body (Failed):
```json
{
  "errors" : "Unauthorized"
}
```

## Mahasiswa :
### Add Mahasiswa
Endpoint : GET/mhs/add

Request Body :
```json
{
  "nim"  : " ", // input data
  "nama"  : " ", // input data
  "prodi" : " ", // input data
  "no_hp" : " " // input data
}
```

Repsonse Body (Success) :
```json
{
  "id"   : "1",
  "nim"  : "2211103062",
  "nama"  : "Farhan Dwi Nugroho",
  "prodi" : "Sistem Informasi",
  "no_hp" : "0812345678"
}
```
Response Body (Failed) :
```json
{
  "errors" : "Unauthorized"
}
```

## Get Mahasiswa

Endpoint : GET/mhs

Response Body(Sccess) :
```json
{
  "id"    : "1",
  "nim"   : "2211103062",
  "nama"  : "Farhan Dwi Nugroho",
  "prodi" : "Sistem Informasi",
  "no_hp" : "0812345678"
}
```
Response Body (Failed) :
```json
{
  "errors" : "Unauthorized"
}
```
## Update Mahasiswa

Endpoint : GET/mhs/update/{id}

Request Body :
```json
{
  "nim"  : "2211103062", // put if only want to update nidn
  "nama"  : "Farhan Dwi Nugroho", // put if only want to update nidn
  "prodi" : "Sistem Informasi", // put if only want to update nidn
  "no_hp" : "0812345678" // put if only want to update nidn
}
```

Response Body (Success) :
```json
{
  "nidn"  : "2211",
  "nama"  : "Imran",
  "gelar" : "Hi-Tech",
  "email" : "imran@example.com"
}
```
Response Body (Failed) :
```json
{
  "errors" : "Unauthorized"
}
```
## Delete Mahasiswa

Endpoint : POST/mhs/delete/{id}

Request body :
```json
{
  "id" : " " //input id
}
```

Response Body (Success):
```json
{
  //Data berhasil Dihapus
}
```

Respone Body (Failed):
```json
{
  "errors" : "Unauthorized"
}
```