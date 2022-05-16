
package com.tallerjava.calculadora;

import java.io.IOException;
import java.util.Scanner;


public class main {
    
    private int num1;
    private int num2;
    public static double resultado;
    private int opcion;
    private boolean control;
    
    public static void main(String[] args) throws IOException{
        
        //inicializo la variable que va control el ciclo do while
        boolean control = true;
        
        //se emplea el ciclo do while para ejecutar la apliacion
        do{
           //muestro el menu de opciones al usuario
           menu(); 
           
           //capturo la opcion del menu
           int opcion = opcionMenu();
           
           //evaluo y ejecuto la opcion elegida por el usuario 
           evalurOpcion(opcion);
           
           //muestro un mensaje indicandole al usuario si quiere continuar realizando operaciones 
           mensaje2();
           
           
           //capturo la opcion elegida por el usuario
           int opcion2 = capturarInt();
           
           if(opcion2 == 1){
               //ejecuto un ciclo para seguir realizando operaciones con el resultado de la operacion anterior
              boolean control2 = true;
               do{
                  double resultado2 = 0;
                  int opcion3;
                  int num2;
                  double resultado1;
                  resultado1 = resultado;
                  
                  //muestro el menu
                  menu();
                  
                  //capturo la opcion
                  opcion3 = capturarInt();
                  
                  //ejecuto la operacion
                  if(opcion3 == 1){
                    //solicito el numero al usuario
                    mensaje();
                    
                    //capturo el numero
                    num2 = capturarInt();
                    
                    resultado2 = resultado1 + num2;
                    
                    //imprimo en pantalla el resultado de la operacion
                    System.out.println("El resultado de la suma de la operacion "+resultado1+" + "+num2+" es: "+resultado2);
                      
                  }else if(opcion3 == 2){
                      //solicito el numero al usuario
                    mensaje();
                    
                    //capturo el numero
                    num2 = capturarInt();
                    
                    resultado2 = resultado1 - num2;
                    
                    //imprimo en pantalla el resultado de la operacion
                    System.out.println("El resultado de la resta de la operacion "+resultado1+" - "+num2+" es: "+resultado2);
                  }else if(opcion3 == 3){
                      //solicito el numero al usuario
                    mensaje();
                    
                    //capturo el numero
                    num2 = capturarInt();
                    
                    resultado2 = resultado1 * num2;
                    
                    //imprimo en pantalla el resultado de la operacion
                    System.out.println("El resultado de la multiplicacion de la operacion "+resultado+" x "+num2+" es: "+resultado2);
                  }else if(opcion3 == 4){
                      //solicito el numero al usuario
                        mensaje();

                        //capturo el numero
                        num2 = capturarInt();

                        
                      //se verifica la division por cero
                      if(num2 == 0){
                        //si num2 es igual a 0 no se ejecuta la operacion y se muestra en pantalla un mensaje indicadole el error
                        System.out.println("La division por 0 no se puede realizar");

                        //nueva se le solicita un nuevo numero
                        System.out.println("Ingrese nuevamente el numero que sea diferente a 0");

                        //capturo el segundo numero
                        num2 = capturarInt();

                        //ejecuto la operacion
                        resultado2 = resultado1 / num2;

                        //imprimo en pantalla el resultado de la operacion
                        System.out.println("El resultado de la division de la operacion "+resultado1+" / "+num2+" es: "+resultado2);

                    }else {
                        //ejecuto la operacion
                        resultado2 = resultado1 / num2;
                        //imprimo en pantalla el resultado de la operacion
                        System.out.println("El resultado de la division de la operacion "+resultado1+"/"+num2+" es: "+resultado2);
                    }//fin del if else 
                      
                 }else if(opcion3==5){
                      //solicito el numero al usuario
                        mensaje();

                        //capturo el numero
                        num2 = capturarInt();

                        
                      //se verifica la division por cero
                      if(num2 == 0){
                        //si num2 es igual a 0 no se ejecuta la operacion y se muestra en pantalla un mensaje indicadole el error
                        System.out.println("La division por 0 no se puede realizar");

                        //nueva se le solicita un nuevo numero
                        System.out.println("Ingrese nuevamente el numero que sea diferente a 0");

                        //capturo el segundo numero
                        num2 = capturarInt();

                        //ejecuto la operacion
                        resultado2 = resultado1 % num2;

                        //imprimo en pantalla el resultado de la operacion
                        System.out.println("El resultado del modulo de la division "+resultado1+" / "+num2+" es: "+resultado2);

                    }else {
                        //ejecuto la operacion
                        resultado2 = resultado1 % num2;
                        //imprimo en pantalla el resultado de la operacion
                        System.out.println("El resultado del modulo de la division "+resultado1+" MOD "+num2+" es: "+resultado2);
                    }//fin del if else
                 } else{
                   
                    control2 = false;
                }//fin del if else 
                              
               }while(control2 == true);//fin del ciclo do while
               
           }else{
               control = false;
           }//fin del if else
           
            
        }while(control == true);//fin del ciclo do while
           
    }//fin del metodo principal
    
    //metodo para mostrar un menue de opciones al usuario
    private static void menu(){
        System.out.println("Eliga la operacion que desea realizar");
        System.out.println("1.Suma.");
        System.out.println("2.Resta.");
        System.out.println("3.Multiplicacion.");
        System.out.println("4.Division.");
        System.out.println("5.Modulo de la Division.");
        System.out.println("0.Salir.");
    }//fin del metodo
    
    //metodo para capturar la opcion elegida por el usuario
    private static int opcionMenu(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }//fin del metodo
    
    //metodo para capturar el numero ingresado por el usuario
    private static int capturarInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }//fin del metodo
    
    //metodo para solicitar al usuario los numeros para realizar la operacion
    private static void mensaje(){
        System.out.println("Ingrese por favor un numero");
    }//fin del metodo
    
    //metodo para solicitar al usuario continuar realizando la operaciones
    private static void mensaje2(){
        System.out.println("Si desea continuar ingrese 1 de lo contrario 0, si ingreso 1 por favor Ingrese otro un numero y selecione la operacion que desea realizar, de lo contrario ¡Hasta pronto!");
    }//fin del metodo
     
    //metodo para evaluar opciones 
    public static int evalurOpcion(int opcion) throws IOException{
        
        //declaro la variables a utilizar
        int num1;
        int num2;
        
        //evaluo la opcion elegida por el usuario y se ejecuta la operacion elegida      
        switch(opcion){
            case 1 -> {                
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el primer numero
                num1 = capturarInt();
                
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el segundo numero
                num2 = capturarInt();
                
                //ejecuto la operacion
                resultado = num1 + num2;
                
                //imprimo en pantalla el resultado de la operacion
                System.out.println("El resultado de la suma de la operacion "+num1+" + "+num2+" es: "+resultado);
                
                
            }
            case 2 -> {
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el primer numero
                num1 = capturarInt();
                
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el segundo numero
                num2 = capturarInt();
                
                //ejecuto la operacion
                resultado = num1 - num2;
                
                //imprimo en pantalla el resultado de la operacion
                System.out.println("El resultado de la resta de la operacion "+num1+" - "+num2+" es: "+resultado);
                
            }
            case 3 -> {
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el primer numero
                num1 = capturarInt();
                
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el segundo numero
                num2 = capturarInt();
                
                //ejecuto la operacion
                resultado = num1 * num2;
                
                //imprimo en pantalla el resultado de la operacion
                System.out.println("El resultado de la multiplicacion de la operacion "+num1+" x "+num2+" es: "+resultado);
                
            }
            case 4 -> {
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el primer numero
                num1 = capturarInt();
                
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el segundo numero
                num2 = capturarInt();
                
                if(num2 == 0){
                    //si num2 es igual a 0 no se ejecuta la operacion y se muestra en pantalla un mensaje indicadole el error
                    System.out.println("La division por 0 no se puede realizar");
                    
                    //nueva se le solicita un nuevo numero
                    System.out.println("Ingrese nuevamente el numero que sea diferente a 0");
                    
                    //capturo el segundo numero
                    num2 = capturarInt();
                     
                    //ejecuto la operacion
                    resultado = num1 / num2;
                    
                    //imprimo en pantalla el resultado de la operacion
                    System.out.println("El resultado de la division de la operacion "+num1+" / "+num2+" es: "+resultado);
                    
                }else {
                    //ejecuto la operacion
                    resultado = num1 / num2;
                    //imprimo en pantalla el resultado de la operacion
                    System.out.println("El resultado de la division de la operacion "+num1+" / "+num2+" es: "+resultado);
                }//fin del condicional if else    
            }
            
            case 5 -> {
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el primer numero
                num1 = capturarInt();
                
                //muestro en pantalla un mensaje solicitado los numeros para realiazar la opereacion al usuario
                mensaje(); 
                
                //capturo el segundo numero
                num2 = capturarInt();
                
                if(num2 == 0){
                    //si num2 es igual a 0 no se ejecuta la operacion y se muestra en pantalla un mensaje indicadole el error
                    System.out.println("La division por 0 no se puede realizar");
                    
                    //nueva se le solicita un nuevo numero
                    System.out.println("Ingrese nuevamente el numero que sea diferente a 0");
                    
                    //capturo el segundo numero
                    num2 = capturarInt();
                     
                    //ejecuto la operacion
                    resultado = num1 % num2;
                    
                    //imprimo en pantalla el resultado de la operacion
                    System.out.println("El resultado del modulo de la division "+num1+" / "+num2+" es: "+resultado);
                    
                }else {
                    //ejecuto la operacion
                    resultado = num1 % num2;
                    //imprimo en pantalla el resultado de la operacion
                    System.out.println("El resultado del modulo de la division "+num1+" MOD "+num2+" es: "+resultado);
                }//fin del condicional if else  
                
            }
            
            case 0 -> {
                
                boolean control;
                control = false;
                
            }
            default -> {
                System.out.println("Opción incorrecta");
                System.in.read();            
            }
        }//fin del switch
        return 0;
    }//fin del metodo 
    
}//fin de la clase 
