package calisma00;

public class Elmas_BoslukluUcgen {
    public static void main(String[] args) {

        for (int i = 1; i <=8 ; i++) {
            for (int j = 7; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j =1; j <2*i ; j++) {
                System.out.print("*");
            }System.out.println();
        }
        for (int i = 7; i >=1; i--) {
            for (int j = 8; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <2*i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
