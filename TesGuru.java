import java.util.Scanner;

public class TesGuru {
     public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
            System.out.println("Nama: ");
            String nama = in.nextLine();
            System.out.println("Mapel: ");
            String mapel = in.nextLine();
            System.out.println("Alamat: ");
            String alamat = in.nextLine();
            System.out.println("ID: ");
            int id = in.nextInt();

            //membuat obyek
            Guru bu_pasha = new Guru(id,nama,mapel,alamat);

            bu_pasha.print();
   

            //membuat obyek
             bu_pasha = new Guru();

             bu_pasha = new Guru (90, "Bu Pasha","Produktif", "Malang");
            bu_pasha.id = 90;
            bu_pasha.nama = "Bu Pasha";
            bu_pasha.mapel = "Produktif";
            bu_pasha.alamat = "Malang";
            System.out.println("Ini data bu_pasha");
            System.out.println(bu_pasha.id);
            System.out.println(bu_pasha.nama);
            System.out.println(bu_pasha.mapel);
            System.out.println(bu_pasha.alamat);
        }
        
    
        
    } 

