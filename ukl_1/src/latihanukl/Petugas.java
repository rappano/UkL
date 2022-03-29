/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl;
import java.util.ArrayList;

/**
 *
 * @author predator
 */
public class Petugas implements User {
private ArrayList<String> namaPetugas = new ArrayList<String>(); 
private ArrayList<String> alamat = new ArrayList<String>(); 
private ArrayList<String> telepon = new ArrayList<String>(); 
private ArrayList<String> jabatan = new ArrayList<String>();

public Petugas (){
    this.namaPetugas.add("Suki");
    this.alamat.add("Togogan");
    this.telepon.add("081368045735");
    this.jabatan.add("Pemilik toko");
    
    this.namaPetugas.add("Ani");
    this.alamat.add("Srengat");
    this.telepon.add("082234664321");
    this.jabatan.add("Petugas cuci");
    
    this.namaPetugas.add("Nisa");
    this.alamat.add("Blitar");
    this.telepon.add("081234234255");
    this.jabatan.add("Petugas setrika");
    
    this.namaPetugas.add("Nanik");
    this.alamat.add("Dandong");
    this.telepon.add("085452344230");
    this.jabatan.add("Petugas packing");
}
public void setJabatan(String jabatan){
    this.jabatan.add(jabatan);
}
public String getJabatan(int id){
    return this.jabatan.get(id);
}
public int getJmlPetugas(){
    return this.namaPetugas.size();
}

    @Override
    public void setNama(String namaKaryawan) {
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    
}