/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1041 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float x, y;

        x = leitor.nextFloat();
        y = leitor.nextFloat();

        if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else {
            if (x == 0 && y != 0) {
                System.out.println("Eixo Y");
            } else {
                if (x == 0 && y == 0) {
                    System.out.println("Origem");
                } else {
                    if (x > 0 && y > 0) {
                        System.out.println("Q1");
                    } else {
                        if (x < 0 && y > 0) {
                            System.out.println("Q2");
                        } else {
                            if (x < 0 && y < 0) {
                                System.out.println("Q3");
                            } else {
                                if (x > 0 && y < 0) {
                                    System.out.println("Q4");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}