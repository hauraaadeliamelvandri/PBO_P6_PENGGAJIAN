import java.text.DecimalFormat;
import java.io.*;
import java.util.Scanner;
public class penggajian {
 private static Object tanyalagi;
 public static void main(String[] args) {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    Scanner in = new Scanner(System.in);
    DecimalFormat digit = new DecimalFormat("0.00");
  
 int jamKerja, jumlah, golongan, Lembur, lamaKerja, gajiPokok, jamLembur ;
 float gajiBersih;
 String namaKaryawan;
 String nama = "";
 String tanya;
 String tanyalagi;
 
 System.out.println("-------------------------------------------------");
 System.out.println("-------PROGRAM MENGHITUNG GAJI KARYAWAN----------");
 System.out.println("-------------------------------------------------");
 
 System.out.print("Masukan Nama : ");
 namaKaryawan=in.next();
   
 System.out.print("Masukan Golongan : ");
 golongan=in.nextInt();
   
 System.out.print("Masukan Jam Kerja : ");
 jamKerja=in.nextInt();

  try {
   nama = input.readLine();
  } catch (IOException e){
   System.out.println("Error!");
  }
  
  
  if (jamKerja>135){
            jamLembur=jamKerja-135;
             }else{
            jamLembur=0;
        }
  switch(golongan){
    case 1 :
        gajiPokok=1500000;
        lamaKerja=250000;
        break;
    case 2 :
        gajiPokok=1850000;
        lamaKerja=280000;
        break;
    case 3 :
        gajiPokok=2000000;
        lamaKerja=320000;
        break;
    default :
        gajiPokok=0;
        lamaKerja=0;
        }
  
 Lembur=jamLembur*20000;
 gajiBersih=((Lembur+gajiPokok+lamaKerja));
 System.out.println("========================\n");
 System.out.println("Nama Karyawan        : "+namaKaryawan);
 System.out.println("Gaji Pokok 1 Bulan   : "+gajiPokok);
 System.out.println("Gaji Lembur          : "+Lembur);
 System.out.println("Tunjangan Lama Kerja : "+lamaKerja);
 System.out.println("Gaji Bersih          : "+gajiBersih);
  
  //Looping
   System.out.print("Apakah Data sudah benar (y/t) : ");
   tanya = in.next();
   
   if (tanya.equalsIgnoreCase("y")){
    Terimakasih();
    }
   else {
    ulang();
   }
   
 }
 private static void Terimakasih(){  
   System.out.println();
   System.out.println("=================================================");
   System.out.println("                  TERIMAKASIH");
   System.out.println("=================================================");
  }
 private static void ulang(){
  Scanner in = new Scanner(System.in);
  System.out.print("Apakah ingin di ulang? (y/t) : ");
  penggajian.tanyalagi = in.next();
  
  if (((String) tanyalagi).equalsIgnoreCase("y")){
   main(null);
  }
  
  else { 
   Terimakasih();
  }
 }
}