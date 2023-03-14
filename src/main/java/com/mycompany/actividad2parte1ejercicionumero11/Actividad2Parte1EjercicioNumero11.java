/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero11;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero11 {

    public static void main(String[] args) {
        String nom;
        int sal,num,salmen;
        Scanner input = new Scanner(System.in);
        System.out.println("escriba su nombre");
        nom = input.nextLine();
        System.out.println("salrio por hora");
        sal = input.nextInt();
        System.out.println("horas mensuales trabajadas");
        num = input.nextInt();
        salmen = sal*num;
        if(salmen>450000){
            System.out.println("Sr o Sra "+nom+" su salario es de: "+salmen+" pesos");
        }
        else{
            System.out.println("Buen dia Sr o Sra"+nom);
        }  
    }
}
