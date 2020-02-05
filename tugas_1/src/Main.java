import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        float nilai [] = new float[5];
        float total=0,rata,terbesar=0,terendah=105;
        Scanner ngeInput = new Scanner(System.in);
        System.out.print("Nama  : "); nama = ngeInput.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai ke-" +i+"   : "); nilai[i] = ngeInput.nextFloat();
            total += nilai[i];
            if (terbesar<nilai[i]){
                terbesar = nilai[i];
            }
            if (terendah>nilai[i]){
                terendah = nilai[i];
            }
        }
        rata= total/5;
        System.out.println("");
        System.out.println("Nama    : " + nama);
        System.out.println("Nilai tertinggi : "+terbesar);
        System.out.println("Nilai terendah  : "+terendah);
        System.out.println("Rata-rata   : "+rata);
    }
}
