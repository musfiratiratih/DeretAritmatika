/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author musfi
 */
public class Belajar {
    public static void main(String[] args){
        int sukuPertama = 3; //nilai dari suku pertama
        int selisih = 5; //selisih antara nilai suku-suku 
        int jumlahSuku = 10; //banyaknya suku
        int sukuSaatIni = sukuPertama; //perhitungan dimulai dari suku pertama
        int jumlahDeretAritmatika = 0; //variabel untuk menghitung jumlah deret keseluruhan

        for(int i = 1; i <= jumlahSuku; i++){ //perulangan suku ke -
            System.out.println("Suku ke - "+i+" adalah "+sukuSaatIni); //menampilkan deret aritmatika

           jumlahDeretAritmatika += sukuSaatIni; //menghitung jumlah setiap suku
            
            sukuSaatIni += selisih; //mengubah suku saat ini ke suku selanjutnya sesuai selisih
            
        }

        System.out.println("Jumlah Deret Matematika : " + jumlahDeretAritmatika); //menampilkan jumlah deret keseluruhan
    }
}



