package _09_IfElseStatements;

import java.util.Scanner;

/*
Görev:
Kullanıcıdan “E” veya “K” harflerinden birini alarak
cinsiyetini belirleyen program yazın.
E: Erkek, K: Kadın
*/
public class _04_GenderChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cinsiyetinizi giriniz (E/K): ");
        char cinsiyet = input.next().toLowerCase().charAt(0);

        if (cinsiyet == 'e') {
            System.out.println("Erkek");
        } else if (cinsiyet == 'k') {
            System.out.println("Kadın");
        } else {
            System.out.println("Geçersiz giriş");
        }

        input.close();
    }
}
