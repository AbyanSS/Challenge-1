import java.util.Scanner;
// Ini versi kedua
public class Challenge1{
    public static void main(String[] args){
        MainMenu();
    }

    private static void MainMenu(){
        Scanner input = new Scanner(System.in);
        int pilihan = -1; //value defaultnya -1

        //main menu
        while(pilihan != 0){
            System.out.println("----------------------------------------");
            System.out.println("  Kalkulator Penghitung Luas dan Volum  ");
            System.out.println("----------------------------------------");
            System.out.println("                  Menu                  ");
            System.out.println("1. Hitung luas bidang");
            System.out.println("2. Hitung Volum");
            System.out.println("0. Tutup Aplikasi");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            
            //case buat pilihan input main menu
            switch(pilihan){
                case 1:
                    LuasBidang(); //forward ke void LuasBidang()
                    break;
                case 2:
                    VolumBidang(); //forward ke void VolumBidang()
                    break;
                case 0:
                    System.out.println("Terimakasih telah menggunakan kalkulator!!");
                    System.exit(0); //close program
                    
                default:
                    System.out.println("Inputan tidak valid!"); //output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }
    }

    private static void LuasBidang(){
        Scanner input = new Scanner(System.in);
        int pilihan = -1;
        double sisiP, panjangPP, lebarPP, alas, tinggi, jariJ, hasil; //pake double biar nilainya bisa desimal
        String home;

        //menu luas
        while(pilihan != 0){
            System.out.println("----------------------------------------");
            System.out.println("            Hitung luas Bidang          ");
            System.out.println("----------------------------------------");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.println("4. Persegi Panjang");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();

            //case buat pilihan input luas bidang
            switch(pilihan){
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("          Anda Memilih Persegi          ");
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan sisi : ");
                    sisiP = input.nextInt();
                    hasil = sisiP + sisiP;
                    System.out.println("Processing...");
                    System.out.println("Luas persegi adalah " + hasil + " cm^2");

                    //kalo input '0' bakal balik ke void LuasBidang()
                    while(true){
                        System.out.println("Tekan apa saja untuk kembali ke menu");
                        home = input.next();
                        LuasBidang();
                    }
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("         Anda Memilih Lingkaran         ");
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan jari-jari : ");
                    jariJ = input.nextInt();
                    hasil = 3.14 * jariJ;
                    System.out.println("Processing...");
                    System.out.println("Luas lingkaran adalah " + hasil + " cm^2");

                    //kalo input '0' bakal balik ke void LuasBidang()
                    while(true){
                        System.out.println("Tekan apa saja untuk kembali ke menu");
                        home = input.next();
                        LuasBidang();
                    }
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("         Anda Memilih Segitiga          ");
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan alas : ");
                    alas = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    tinggi = input.nextInt();
                    hasil = 0.5 * alas * tinggi;
                    System.out.println("Processing...");
                    System.out.println("Luas segitiga adalah : " + hasil + " cm^2");

                    //kalo input '0' bakal balik ke void LuasBidang()
                    while(true){
                        System.out.println("Tekan apa saja untuk kembali ke menu");
                        home = input.next();
                        LuasBidang();
                    }
                case 4:
                    System.out.println("----------------------------------------");
                    System.out.println("      Anda Memilih Persegi Panjang      ");
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan panjang : ");
                    panjangPP = input.nextInt();
                    System.out.print("Masukkan lebar : ");
                    lebarPP = input.nextInt();
                    hasil = panjangPP * lebarPP;
                    System.out.println("Processing...");
                    System.out.println("Luas persegi panjang adalah : " + hasil + " cm^2");

                    //kalo input '0' bakal balik ke void LuasBidang()
                    while(true){
                        System.out.println("Tekan apa saja untuk kembali ke menu");
                        home = input.next();
                        LuasBidang();
                    }
                case 0:
                    // while(true){
                        System.out.println("Kembali ke menu utama...");
                        MainMenu();
                        
                        // home = input.nextInt();
                        // if(home == 0){
                            // break;
                        // }
                    // }
                default:
                    System.out.println("Inputan tidak valid!"); //output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }
    }

    private static void VolumBidang(){
        Scanner input = new Scanner(System.in);
        double sisiK, panjangB, lebarB, tinggiB, tinggiT, jariT, hasil;
        int pilihan = -1;
        String home;

        while(pilihan != 0){
            System.out.println("----------------------------------------");
            System.out.println("           Hitung volum Bidang          ");
            System.out.println("----------------------------------------");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("           Anda Memilih Kubus           ");
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan sisi : ");
                    sisiK = input.nextInt();
                    hasil = sisiK * sisiK * sisiK;
                    System.out.println("Processing...");
                    System.out.println("Volume kubus adalah : " + hasil + " cm^3");

                    while(true){
                        System.out.println("Tekan apa saja untuk kembali ke menu");
                        home = input.next();
                        VolumBidang();
                    }
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("           Anda Memilih Balok           ");
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan panjang : ");
                    panjangB = input.nextInt();
                    System.out.print("Masukkan lebar : ");
                    lebarB = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    tinggiB = input.nextInt();
                    hasil = panjangB * lebarB * tinggiB;
                    System.out.println("Processing...");
                    System.out.println("Volume balok adalah : " + hasil + " cm^3");

                    while(true){
                        System.out.println("Tekan apa saja untuk kembali ke menu");
                        home = input.next();
                        VolumBidang();
                    }
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("          Anda Memilih Tabung           ");
                    System.out.println("----------------------------------------");
                    System.out.print("Masukkan tinggi : ");
                    tinggiT = input.nextInt();
                    System.out.print("Masukkan jari-jari : ");
                    jariT = input.nextInt();
                    hasil = 3.14 * tinggiT * jariT;
                    System.out.println("Processing...");
                    System.out.println("Volume tabung adalah : " + hasil + " cm^3");

                    while(true){
                        System.out.println("Tekan apa saja untuk kembali ke menu");
                        home = input.next();
                        VolumBidang();
                    }
                case 0:
                    System.out.println("Kembali ke menu utama...");
                    MainMenu();
                    break;
                default:
                    System.out.println("Inputan tidak valid!"); //output kalo input ga sesuai dari case yang tersedia
                    break;
            }
        }
    }

}