package examenunidad3;


import java.util.Scanner;

public class ExamenUnidad3 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner leer = new Scanner(System.in);
        int i;
        
        
        System.out.println("Introduce un numero: ");
        for ( i = 0; i < numeros.length; i++) {
            numeros[i] = leer.nextInt();
        }
        
        
        for(i = 0; i < numeros.length; i++){
        if(numeros[i]%2==0 || numeros[i]%2!=0){
            System.out.println(numeros[i]);
       
         }
        }
       
       
    }

    }

//if (numeros[i] % 1 == 0) {
              //  System.out.println(numeros[i]);
            //} else {
              //  System.out.println(numeros[i]);
            //}

 //System.out.println("Los numeros que ingresaste son: ");
        //for(i = 0; i < numeros.length; i++){
           //  System.out.println(numeros[i]);
         //}


// int par = numeros[i];
  //      int impar = numeros[i];
        
    //    if(par%2==0 || impar%2!=0){
         
      //      System.out.println(par + " " + impar);
