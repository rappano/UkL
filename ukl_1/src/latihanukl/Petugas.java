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
private ArrayList<Integer> jabatan = new ArrayList<Integer>();

public Petugas (){
    this.namaPetugas.add("Suki");
    this.alamat.add("Togogan");
    this.telepon.add("08582385967");
    this.jabatan.add(0);
}
public void setJabatan(int jabatan){
    this.jabatan.add(jabatan);
}
public int getJabatan(int id){
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
