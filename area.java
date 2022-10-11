import java.util.Scanner;

import java.lang.Math. *;

public class area {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();
        
        double area = (raio*raio)*Math.PI;
        System.out.println("A área do círculo é igual a: " + area + ".\n");
    }
}