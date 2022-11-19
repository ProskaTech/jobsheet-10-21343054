public class mobilutama{
    public static void main(String[] args) {
        mobil honda = new mobil ();
        honda.merk ="civic";
        honda.warna="Hitam";
        honda.tahunproduksi= 2020;
        System.out.println("merk\t: "+honda.merk);
        System.out.println("warna\t: "+honda.warna);
        System.out.println("tahun\t: "+honda.tahunproduksi);
        honda.Maju();
        honda.Maju();
        honda.Mundur();

    }
}