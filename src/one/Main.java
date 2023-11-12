package one;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Hewan obj;

        System.out.print("Masukan jenis hewan (kucing/anjing): ");
        String res = input.nextLine();
        res = res.toLowerCase();
        if(res.equals("kucing")) obj = new Kucing();
        else if(res.equals("anjing")) obj = new Anjing();
        else {
            System.out.println("Invalid Input!");
            return;
        }

        System.out.println("\nHewan bersuara: " + obj.bersuara());
        System.out.println(obj.isMammal());
    }
}