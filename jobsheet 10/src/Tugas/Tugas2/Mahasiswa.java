package Tugas.Tugas2;
import java.util.Scanner;;
public class Mahasiswa {
    String nama;
    int nim, semester;
    float ip;

    public void inputdata(){
        System.out.println();
        Scanner data = new Scanner(System.in);
        System.out.print("Nama Mahasiswa\t\t: ");
        nama = data.nextLine();
        System.out.print("Masukan Nim\t\t: ");
        nim = data.nextInt();
        System.out.print("Semester\t\t: ");
        semester = data.nextInt();
        System.out.print("Masukan IP Semester ini\t: ");
        ip = data.nextFloat();

    }
    public void data(){
        System.out.println("\n====================================\n");
        System.out.println("Nama Mahasiswa\t\t: "+nama);
        System.out.println("Nim\t\t\t: "+nim);
        System.out.println("Semester\t\t: "+semester);
        System.out.println("IP Semester Ini\t\t: "+ip);
        System.out.println();


        if (ip >= 3.5){
            System.out.println("Anda Berhak Mengontrak 24 SKS pada Semester 5");
        }
        else if(ip >= 3.0 && ip <3.5){
            System.out.println("Anda Berhak Mengontrak 22 SKS pada Semester 5");
        }
        else if(ip >=2.5 && ip <3.0){
            System.out.println("Anda Berhak Mengontrak 20 SKS pada Semester 5");

        }
        else if (ip>= 2.0 && ip <2.5){
            System.out.println("Anda Berhak Mengontrak 18 SKS pada Semester 5");

        }
        else {
            System.out.println("Anda Berhak Mengontrak 24 SKS pada Semester 5");
        }
    System.out.println();
       
    }
    public static void main(String[] args) {
        Mahasiswa A = new Mahasiswa();
        A.inputdata();
        A.data();

    }
    
    
}
