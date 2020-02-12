package com.laurentiu;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] tabel = new char[][]{{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};

        boolean play = true;
        boolean flag = true;
        int counter = 9;
        String player1 = "Vlad,";
        String player2 = "Laurentiu,";

        int x = 0;
        int y = 0;

        while (play) {

            printeazaTabela(tabel);

            if (flag) {
                System.out.println(player1 + " este randul tau:");
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (tabel[x][y] == '-') {
                    tabel[x][y] = 'X';
                    counter--;
                    flag = false;
                } else {
                    System.out.println("Casuta este ocupata!");
                }

            } else {

                System.out.println(player2 + " este randul tau:");
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (tabel[x][y] == '-') {
                    tabel[x][y] = '0';
                    counter--;
                    flag = true;
                } else {
                    System.out.println("Casuta este ocupata!");
                }

            }
            System.out.println("au mai ramas " + counter + " mutari");
            if (reguli(tabel)) {

                if (tabel[x][y] == 'X') {
                    printeazaTabela(tabel);
                    System.out.println(player1 + " ai castigat!");
                } else {
                    printeazaTabela(tabel);
                    System.out.println(player2 + " ai castigat!");
                }
                break;

            }

            if (counter == 0) {
                printeazaTabela(tabel);
                System.out.println("REMIZA!");
                break;
            }


        }
    }

    public static void printeazaTabela(char[][] tabel) {
        for (int i = 0; i < tabel.length; i++) {

            for (int j = 0; j < tabel.length; j++) {

                System.out.print(tabel[i][j] + " ");

            }
            System.out.println("");

        }
    }


    public static boolean reguli(char[][] tabel) {

        if (tabel[0][0] == 'X' && tabel[0][1] == 'X' && tabel[0][2] == 'X') {

            return true;

        } else if (tabel[1][0] == 'X' && tabel[1][1] == 'X' && tabel[1][2] == 'X') {

            return true;

        } else if (tabel[2][0] == 'X' && tabel[2][1] == 'X' && tabel[2][2] == 'X') {

            return true;

        } else if (tabel[0][0] == 'X' && tabel[1][0] == 'X' && tabel[2][0] == 'X') {

            return true;

        } else if (tabel[0][1] == 'X' && tabel[1][1] == 'X' && tabel[2][1] == 'X') {

            return true;

        } else if (tabel[0][2] == 'X' && tabel[1][2] == 'X' && tabel[2][2] == 'X') {

            return true;

        } else if (tabel[0][0] == 'X' && tabel[1][1] == 'X' && tabel[2][2] == 'X') {

            return true;

        } else if (tabel[2][0] == 'X' && tabel[1][1] == 'X' && tabel[0][2] == 'X') {

            return true;

        } else if (tabel[0][0] == '0' && tabel[0][1] == '0' && tabel[0][2] == '0') {

            return true;

        } else if (tabel[1][0] == '0' && tabel[1][1] == '0' && tabel[1][2] == '0') {

            return true;

        } else if (tabel[2][0] == '0' && tabel[2][1] == '0' && tabel[2][2] == '0') {

            return true;

        } else if (tabel[0][0] == '0' && tabel[1][0] == '0' && tabel[2][0] == '0') {

            return true;

        } else if (tabel[0][1] == '0' && tabel[1][1] == '0' && tabel[2][1] == '0') {

            return true;

        } else if (tabel[0][2] == '0' && tabel[1][2] == '0' && tabel[2][2] == '0') {

            return true;

        } else if (tabel[0][0] == '0' && tabel[1][1] == '0' && tabel[2][2] == '0') {

            return true;

        } else if (tabel[2][0] == '0' && tabel[1][1] == '0' && tabel[0][2] == '0') {

            return true;

        } else {

            return false;
        }

    }
}




