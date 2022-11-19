import java.util.Scanner;
public class Manusia {
    String nama, tempat_lahir,tgl_lahir;
    int berat_badan,tinggi_bandan;
    public void inputdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama lengkap\t: ");
        nama = input.nextLine();
        System.out.print("Masukan tempat lahir\t: ");
        tempat_lahir=input.nextLine();
        System.out.print("Masukan tanggal lahir\t: ");
        tgl_lahir= input.nextLine();
        System.out.print("Masukan Berat badan\t: ");
        berat_badan= input.nextInt();
        System.out.print("Masukan tinggi badan\t: ");
        tinggi_bandan=input.nextInt();
    }
    public void identitas(){
        System.out.println("Nama saya\t : "+nama);
        System.out.println("Tempat lahir\t : "+tempat_lahir);
        System.out.println("Tanggal lahir\t : "+ tgl_lahir);
        System.out.println("Berat badan\t : "+ berat_badan+" cm");
        System.out.println("Tinggi Badan\t : "+ tinggi_bandan+" cm");
    }

    public static void main(String[] args) {
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
    
}
