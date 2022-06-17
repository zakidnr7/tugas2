package Praktikum2;
import java.util.Scanner;

class Persegi {
    int sisiPersegi;
    
    public Persegi (int sisiPersegi){
        this.sisiPersegi = sisiPersegi;
    }
    public int luasPersegi(){
        int luas = sisiPersegi * sisiPersegi;
        System.out.println(luas);
        return luas;
    }
}

class Segitiga {
    int alasSegitiga, tinggiSegitiga;
    
    public Segitiga(int alasSegitiga, int tinggiSegitiga){
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
    }
    public int luasSegitiga(){
        int luas = (alasSegitiga * tinggiSegitiga / 2);
        System.out.println(luas);
        return luas;
    }
}

class Lingkaran {
     int jarijariLingkaran;

    public Lingkaran(int jarijariLingkaran){
        this.jarijariLingkaran = jarijariLingkaran;
    }
    public int LuasLingkaran1(){
        int luas = (int)(22/7 * jarijariLingkaran * jarijariLingkaran);
        System.out.println((double) luas);
        return luas;
    }
    public int LuasLingkaran2(){
        int luas = (int)(3.14 * jarijariLingkaran * jarijariLingkaran);
        System.out.println((double) luas);
        return luas;
    }
}

public class TugasPraktikum02 {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Pilih Menu Hitung : ");
        int pilihMenu = scan.nextInt();
        int sisiPersegi;
        double alasSegitiga, tinggiSegitiga, jariLingkaran;
        
        if (pilihMenu == 1){
            Persegi persegi = new Persegi(scan.nextInt());
            persegi.luasPersegi();
 
        }
        else if (pilihMenu == 2){
            Segitiga segitiga = new Segitiga(scan.nextInt(), scan.nextInt());
            segitiga.luasSegitiga();
        } 
        else if (pilihMenu == 3){
            int input = scan.nextInt();
            Lingkaran lingkaran = new Lingkaran(input);
            if (input % 7 == 0) {
                lingkaran.LuasLingkaran1();
            } else {
                lingkaran.LuasLingkaran2();
            }
        }
        else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
     }
}
