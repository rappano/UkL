/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl;

/**
 *
 * @author predator
 */
public class Laporan {
    public void laporan(JenisLaundry barang){ 
        int x=barang.getJmlJenisLaundry();
    

        System.out.println(); 
        System.out.println("Tabel Laundry"); 
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi \tHarga"); 
        for (int i = 0; i < x; i++) {
        System.out.println(barang.getJenisLaundry(i)+"\t"+ barang.getDurasi(i)+"\t"+barang.getHarga(i));
        }
        }
            public void laporan(Client member){ 
                int x=member.getJmlClient();

        System.out.println(); 
        System.out.println("Tabel Member"); 
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo"); 
        for (int i = 0; i < x; i++) {
        System.out.println(member.getNama(i)+"\t"+ member.getAlamat(i)+"\t"+member.getTelepon(i)+"\t"+ member.getSaldo(i));
        }
    }
        public void laporan(Transaksi transaksi, JenisLaundry barang){ 
            int x=transaksi.getJmlTransaksi();
            
            System.out.println();
            System.out.println("Laporan Transaksi");
            System.out.println();
            System.out.println("Jenis Laundry\tTotal \tHarga \tJumlah");
            
            int total=0;
            for (int i = 0; i < x; i++){
                int jumlah=transaksi.getBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
                            total+=jumlah; 
                            
                System.out.println(barang.getJenisLaundry(transaksi.getIdBarang(i))+"\t"+transaksi.getBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t"+jumlah);
            }
            System.out.println("Total Omset ="+total);
            }
            }

