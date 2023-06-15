/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010455;
import dataset.*;
import obat.*;
import pegawai.*;
import java.util.Scanner;
import java.util.ArrayList;
import forms.*;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new frameUtama().setVisible(true);
        
//        Scanner input = new Scanner(System.in);
//        int pilihan;
//        
//        do {
//            System.out.println("============== Menu ==============");
//            System.out.println("1. Persediaan Obat");
//            System.out.println("2. Jenis Obat"); 
//            System.out.println("3. Obat Masuk");
//            System.out.println("4. Obat Keluar");
//            System.out.println("5. Admin Login");
//            System.out.println("6. Data Pegawai");
//            System.out.println("0. Keluar");
//            System.out.print("Pilih Nomor : ");
//            pilihan = input.nextInt();
//            input.nextLine();
//            
//            switch (pilihan) {
//                case 1:
//                    System.out.println("==================================");
//                    System.out.print("Masukkan nama obat (amoxicillin/metformin)< input sesuai tertulis : ");
//                    String inputobat = input.nextLine();
//                    
////                    persediaan_obat pobat = new persediaan_obat(); //agar constructor jalan
////                    
////                    pobat.setIdObat(inputobat);
////                    System.out.println(pobat.getIdObat());
////                    pobat.setKodeObat(inputobat);
////                    System.out.println(pobat.getKodeObat());
////                    pobat.setNamaObat(inputobat);
////                    System.out.println(pobat.getNamaObat());
////                    pobat.setJenisObat(inputobat);
////                    System.out.println(pobat.getJenisObat());
////                    pobat.setHargaObat(inputobat);
////                    System.out.println(pobat.getHargaObat());
////                    pobat.setStokObat(inputobat);
////                    System.out.println(pobat.getStokObat());
////
////                    System.out.println(pobat.perObat(inputobat, inputobat, inputobat, inputobat, inputobat, inputobat));
//                    
//                    datasetPersediaan dspo = new datasetPersediaan();
//                    dspo.insertNamaObat("amoxicillin");
//                    dspo.insertNamaObat("metformin");
//                    if(inputobat.equals("amoxicillin")){
//                        System.out.println("Nama Obat : "+dspo.getRecordNamaObat().get(0));
//                        dspo.setIdObat("amoxicillin");
//                        dspo.setKodeObat("amoxicillin");
//                        dspo.setJenisObat("amoxicillin");
//                        dspo.setHargaObat("amoxicillin");
//                        dspo.setStokObat("amoxicillin");
//                    }else if(inputobat.equals("metformin")){
//                        System.out.println("Nama Obat : "+dspo.getRecordNamaObat().get(1));
//                        dspo.setIdObat("metformin");
//                        dspo.setKodeObat("metformin");
//                        dspo.setJenisObat("metformin");
//                        dspo.setHargaObat("metformin");
//                        dspo.setStokObat("metformin");
//                    }else{
//                        System.out.println("Obat tidak tersedia!");
//                        break;
//                    }
//                    System.out.println(dspo.getIdObat());
//                    System.out.println(dspo.getKodeObat());
//                    System.out.println(dspo.getJenisObat());
//                    System.out.println(dspo.getHargaObat());
//                    System.out.println(dspo.getStokObat());
//                    break;
//                case 2:
//                    System.out.println("==================================");
//                    System.out.print("Masukkan nama obat (amoxicillin/metformin) < input sesuai tertulis : ");
//                    String inputjenis = input.nextLine();
////                    
////                    jenis_obat jobat = new jenis_obat(); //agar constructor jalan
////
////                    jobat.setNamaObat(inputjenis);
////                    System.out.println("Nama Obat : "+jobat.getNamaObat());
////                    jobat.setJenisObat(inputjenis);
////                    System.out.println("Jenis Obat : "+jobat.getJenisObat());
////  
////                     System.out.println(jobat.jenObat(inputjenis,inputjenis));
//                    
//                    datasetJenis dsj = new datasetJenis();
//                    dsj.insertNamaObat("amoxicillin");
//                    dsj.insertNamaObat("metformin");
//                    if(inputjenis.equals("amoxicillin")){
//                        System.out.println("Nama Obat : "+dsj.getRecordNamaObat().get(0));
//                        dsj.setJenisObat("amoxicillin");
//                    }else if(inputjenis.equals("metformin")){
//                        System.out.println("Nama Obat : "+dsj.getRecordNamaObat().get(1));
//                        dsj.setJenisObat("metformin");
//                    }else{
//                        System.out.println("Obat tidak tersedia!");
//                        break;
//                    }
//                    System.out.println(dsj.getJenisObat());
//                    break;
//                case 3:
//                    System.out.println("==================================");
//                    System.out.print("Masukkan nama obat (amoxicillin/metformin)< input sesuai tertulis : ");
//                    String obatMasuk = input.nextLine();
//                    
//                    
////                    obat_masuk obmasuk = new obat_masuk(); //agar constructor jalan
////                    
////                    obmasuk.setIdObat(obatMasuk);
////                    System.out.println(obmasuk.getIdObat());
////                    obmasuk.setKodeObat(obatMasuk);
////                    System.out.println(obmasuk.getKodeObat());
////                    obmasuk.setNamaObatMasuk(obatMasuk);
////                    System.out.println(obmasuk.getNamaObatMasuk());
////                    obmasuk.setJenisObatMasuk(obatMasuk);
////                    System.out.println(obmasuk.getJenisObatMasuk());
////                    obmasuk.setJumlahObatMasuk(obatMasuk);
////                    System.out.println(obmasuk.getJumlahObatMasuk());
////                    obmasuk.setTanggalMasuk(obatMasuk);
////                    System.out.println(obmasuk.getTanggalMasuk());
////
////                    System.out.println(obmasuk.ObatMasuk(obatMasuk,obatMasuk,obatMasuk, obatMasuk, obatMasuk,obatMasuk));
//                    
//                    datasetObatMasuk dsom = new datasetObatMasuk();
//                    dsom.insertNamaObatMasuk("amoxicillin");
//                    dsom.insertNamaObatMasuk("metformin");
//                    if(obatMasuk.equals("amoxicillin")){
//                        System.out.println("Nama Obat : "+dsom.getRecordNamaObatMasuk().get(0));
//                        dsom.setIdObat("amoxicillin");
//                        dsom.setKodeObat("amoxicillin");
//                        dsom.setJenisObatMasuk("amoxicillin");
//                        dsom.setJumlahObatMasuk("amoxicillin");
//                        dsom.setTanggalMasuk("amoxicillin");
//                    }else if(obatMasuk.equals("metformin")){
//                        System.out.println("Nama Obat : "+dsom.getRecordNamaObatMasuk().get(1));
//                        dsom.setIdObat("metformin");
//                        dsom.setKodeObat("metformin");
//                        dsom.setJenisObatMasuk("metformin");
//                        dsom.setJumlahObatMasuk("metformin");
//                        dsom.setTanggalMasuk("metformin");
//                    }else{
//                        System.out.println("Obat tidak tersedia!");
//                        break;
//                    }
//                    System.out.println(dsom.getIdObat());
//                    System.out.println(dsom.getKodeObat());
//                    System.out.println(dsom.getJenisObatMasuk());
//                    System.out.println(dsom.getJumlahObatMasuk());
//                    System.out.println(dsom.getTanggalMasuk());
//                    break;
//                case 4:
//                    System.out.println("==================================");
//                    System.out.print("Masukkan nama obat (amoxicillin/metformin)< input sesuai tertulis : ");
//                    String obatKeluar = input.nextLine();
//                    
////                    obat_keluar obkeluar = new obat_keluar(); //agar constructor jalan
////                    
////                    obkeluar.setIdObat(obatKeluar);
////                    System.out.println(obkeluar.getIdObat());
////                    obkeluar.setKodeObat(obatKeluar);
////                    System.out.println(obkeluar.getKodeObat());
////                    obkeluar.setNamaObatKeluar(obatKeluar);
////                    System.out.println(obkeluar.getNamaObatKeluar());
////                    obkeluar.setJenisObatKeluar(obatKeluar);
////                    System.out.println(obkeluar.getJenisObatKeluar());
////                    obkeluar.setJumlahObatKeluar(obatKeluar);
////                    System.out.println(obkeluar.getJumlahObatKeluar());
////                    obkeluar.setTanggalKeluar(obatKeluar);
////                    System.out.println(obkeluar.getTanggalKeluar());
////                    
////                    System.out.println(obkeluar.ObatKeluar(obatKeluar,obatKeluar,obatKeluar, obatKeluar, obatKeluar, obatKeluar));
//
//                    datasetObatKeluar dsok = new datasetObatKeluar();  
//                    dsok.insertNamaObatKeluar("amoxicillin");
//                    dsok.insertNamaObatKeluar("metformin");
//                    if(obatKeluar.equals("amoxicillin")){
//                        System.out.println("Nama Obat : "+dsok.getRecordNamaObatKeluar().get(0));
//                        dsok.setIdObat("amoxicillin");
//                        dsok.setKodeObat("amoxicillin");
//                        dsok.setJenisObatKeluar("amoxicillin");
//                        dsok.setJumlahObatKeluar("amoxicillin");
//                        dsok.setTanggalKeluar("amoxicillin");
//                    }else if(obatKeluar.equals("metformin")){
//                        System.out.println("Nama Obat : "+dsok.getRecordNamaObatKeluar().get(1));
//                        dsok.setIdObat("metformin");
//                        dsok.setKodeObat("metformin");
//                        dsok.setJenisObatKeluar("metformin");
//                        dsok.setJumlahObatKeluar("metformin");
//                        dsok.setTanggalKeluar("metformin");
//                    }else{
//                        System.out.println("Obat tidak tersedia!");
//                        break;
//                    }
//                    System.out.println(dsok.getIdObat());
//                    System.out.println(dsok.getKodeObat());
//                    System.out.println(dsok.getJenisObatKeluar());
//                    System.out.println(dsok.getJumlahObatKeluar());
//                    System.out.println(dsok.getTanggalKeluar());
//                    break;
//                case 5:
//                    System.out.println("==================================");
////                    System.out.print("Masukkan nama admin : ");
////                    String namaAdmin = input.nextLine();
////                    
////                    System.out.print("Masukkan password : ");
////                    String password = input.nextLine();
////                    
////                    admin adminlogin = new admin(); //agar constructor jalan
////                    
////                    adminlogin.setUsername(namaAdmin);
////                    adminlogin.setPassword(password);
////                    
////                    System.out.println(adminlogin.adminLogin("Nama Admin "+namaAdmin+" ","Password "+password));
////                    System.out.println("Berhasi Login");
////                    
//                    datasetAdmin dsa = new datasetAdmin();
//                    dsa.insertUsername("Ahmad");
//                    dsa.insertUsername("Daud");
//                    dsa.insertPassword("Ahmad123");
//                    dsa.insertPassword("Daud123");
//                    System.out.println("Username : "+dsa.getRecordUsername().get(1));
//                    System.out.println("Password : "+dsa.getRecordPassword().get(1));
//                    break;
//                case 6:
//                    System.out.println("==================================");
////                    pegawai pegawai = new pegawai();
////                    
////                    System.out.println("Data Pegawai : ");
////                    
////                    System.out.println(pegawai.dataPegawai("Ahmad","Ahmad","Ahmad", "Ahmad", "Ahmad"));
//                    ArrayList<String> pegawai = new ArrayList<String>();
//                    pegawai.add("Ahmad");
//                    pegawai.add("Daud");
//                    pegawai.add("Naufal");
//                    System.out.println("Jumlah Arraylist Pegawai : "+pegawai.size());
//                    System.out.println(pegawai);
//                    
//                    datasetPegawai dsp = new datasetPegawai();
//                    dsp.insertIdPegawai("1");
//                    dsp.insertIdPegawai("2");
//                    dsp.insertIdPegawai("3");
//                    dsp.insertKodePegawai("001");
//                    dsp.insertKodePegawai("002");
//                    dsp.insertKodePegawai("003");
//                    dsp.insertNamaPegawai("Ahmad");
//                    dsp.insertNamaPegawai("Daud");
//                    dsp.insertNamaPegawai("Naufal");
//                    dsp.insertAlamat("Jl.Ahmad Yani No.12");
//                    dsp.insertAlamat("Jl.Sungai Andai No.11");
//                    dsp.insertAlamat("Jl.Sungai Miai No.9");
//                    dsp.insertTelpon("08112308231");
//                    dsp.insertTelpon("08111028249");
//                    dsp.insertTelpon("08118564388");
//                    System.out.println("Id Pegawai : "+dsp.getRecordIdPegawai().get(0));
//                    System.out.println("Kode Pegawai : "+dsp.getRecordKodePegawai().get(0));
//                    System.out.println("Nama Pegawai : "+dsp.getRecordNamaPegawai().get(0));
//                    System.out.println("Alamat : "+dsp.getRecordAlamat().get(0));
//                    System.out.println("Telpon : "+dsp.getRecordTelpon().get(0));
//                    break;
//                case 0:
//                    System.out.println("==================================");
//                    System.out.println("Terima kasih!");
//                    break;
//                default:
//                    System.out.println("==================================");
//                    System.out.println("Pilihan tidak ada. Silakan pilih nomor yang ada.");
//                    break;
//            }
//
//            System.out.println();
//        } while (pilihan != 0);
    }    
}