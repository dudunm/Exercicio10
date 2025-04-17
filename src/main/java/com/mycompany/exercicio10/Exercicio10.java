package com.mycompany.exercicio10;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        String num1 = n1.nextLine();
        
        Scanner n2 = new Scanner(System.in);
        System.out.print("Segundo número: ");
        String num2 = n2.nextLine();
        
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        
        int soma = x + y;
        
        if(soma > 10){
            System.out.println("O resultado é: " + soma);
        } else {
            System.out.println("Resultado menor que 10");
        }
        
        
    }
}
