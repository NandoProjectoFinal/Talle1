package com.company;

import com.sun.security.jgss.GSSUtil;
import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.text.AbstractDocument;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {

    public static void main(String[] args) {
        int a=0;
        ingresoNum(a);
        int b = ingresoNum(a);
        numeroEntero(b);
        creadorarreglo(b);
        imprimirNumBinario8Bits(creadorarreglo(b));
//        arregloabinario();


    }

    private static void arregloabinario() {
    }


    private static void imprimirNumBinario8Bits(int[] arr) {
        System.out.println("El numero es:");
        for (int i=0; i<arr.length; i++){
            System.out.print("["+arr[i]+"]");
        }
    }


    private static int[] creadorarreglo(int ingresoNum) {
        int[] arr = new int[8];
        for (int i=0; i<arr.length; i++) {
            int a = arr.length-1;
            if (ingresoNum % 2 == 0) {
                arr[a]=1;
            }
            else{
                arr[a]=0;  }
            a--;
        }
        return arr;
    }

    private static int ingresoNum(int a) {
        Scanner teclado = new Scanner(System.in);
        int num=0;
        do {
            try {
                System.out.println("Ingrese un numero");
                a = teclado.nextInt();
            }catch (Exception e){
                System.out.println("Dato ingresado no valido");
                teclado.next();
                num=0;
            }
            num=1;
        }while (num==0);
        return a;
    }

    private static boolean numeroEntero(int leerNumero) {
        boolean num=false;
        if (leerNumero != (int)leerNumero){
            leerNumero=(int)leerNumero;
            return true;
        }else{
            return true;
        }
    }
}
