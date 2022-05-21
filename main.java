
package com.tallerjava.calculadora;

import java.io.IOException;
import java.util.Scanner;


public class main {

    private static void swicht(String signo2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private double num1;
    private double num2;
    public static double resultado;
    private double opcion;
    private boolean control;
   
    
    public static void main(String[] args) throws IOException{
        
        //inicializo la variable que va control el ciclo do while
        boolean control = true;
        boolean control2 = true;
        double resultado = 0;
        
        //se emplea el ciclo do while para ejecutar la apliacion
        do{
            //mensaje de inicio
            mensaje2();

            //solicito el primer numero
            mensaje();

            //solicito el primer numero
            double num1 = capturarNumero();

            //solicito la operacion a realizar
            menu();

            String signo = capturarSigno();

            //evaluo la operacion a realizar

            if(signo.equals("+")){
              //solicito y capturo el segundo numero
              mensaje();

              double num2 = capturarNumero();

              //inicializo la clase suma
              Suma suma = new Suma();
              resultado = suma.Suma(num1, num2);

            }else if(signo.equals("-")){
              //solicito y capturo el segundo numero
              mensaje();

              double num2 = capturarNumero();

              //inicializo la clase Resta
              Resta resta = new Resta();

              resultado = resta.Resta(num1, num2); 

            }else if(signo.equals("*")){
              //solicito y capturo el segundo numero
              mensaje();

              double num2 = capturarNumero();
              //inicializo la clase multiplicar
              Multiplicar multiplicar = new Multiplicar();

              resultado = multiplicar.Multiplicar(num1, num2);   
            }else if(signo.equals("/")){
              //solicito y capturo el segundo numero
              mensaje();
              double num2 = capturarNumero();
              if(num2 == 0){
                  System.out.println("La division por 0 no se puede, ingrese un nuevo numero de nuevo");
                  //solicito y capturo el segundo numero
                  mensaje();

                  double num3 = capturarNumero();
                  //inicializo la clase division
                  Division divivir = new Division();

                  resultado = divivir.Division(num1, num2); 
              }else{
                  //inicializo la clase division
                  Division divivir = new Division();

                  resultado = divivir.Division(num1, num2); 
              }

            }else if(signo.equals("%")){
              //solicito y capturo el segundo numero
              mensaje();
              double num2 = capturarNumero();
              if(num2 == 0){
                  System.out.println("La division por 0 no se puede, ingrese un nuevo numero de nuevo");
                  //solicito y capturo el segundo numero
                  mensaje();

                  double num3 = capturarNumero();
                  //inicializo la clase modulo
                    Modulo modulo = new Modulo();

                   resultado = modulo.Modulo(num1, num3); 
              }else{
                  //inicializo la clase modulo
                    Modulo modulo = new Modulo();

                    resultado = modulo.Modulo(num1, num2); 
              }

            }else if(signo.equals("=")){
                control = false;
            }else{
                System.out.println("Opcion incorrecta, intente nuevamente");
            }
            
            //imprimo el resultado de la operacion
            System.out.println("El resultado de la operacion es: " + resultado);
          
            while(control2 == true){
              //muestro nuevament el menu
              menu();
              String signo2 = capturarSigno();
             switch(signo2){
                case "+" -> {
                    //solicito y capturo el segundo numero
                    mensaje();
            
                    double num2 = capturarNumero();
            
                    //inicializo la clase suma
                    Suma suma = new Suma();
                    resultado = suma.Suma(resultado, num2);
                    control2 = true;
                }
                case "-" -> {
                    //solicito y capturo el segundo numero
                    mensaje();
            
                    double num2 = capturarNumero();

                    //inicializo la clase Resta
                    Resta resta = new Resta();

                    resultado = resta.Resta(resultado, num2); 
                    control2 = true;
                }
                case "*" -> {
                    //solicito y capturo el segundo numero
                    mensaje();

                    double num2 = capturarNumero();
                    //inicializo la clase multiplicar
                    Multiplicar multiplicar = new Multiplicar();

                    resultado = multiplicar.Multiplicar(resultado, num2); 
                    control2 = true;
                }
                case "/" -> {
                    //solicito y capturo el segundo numero
                    mensaje();
                    double num2 = capturarNumero();
                    if(num2 == 0){
                        System.out.println("La division por 0 no se puede, ingrese un nuevo numero de nuevo");
                        //solicito y capturo el segundo numero
                        mensaje();

                        double num3 = capturarNumero();
                        //inicializo la clase division
                        Division divivir = new Division();

                        resultado = divivir.Division(resultado, num2); 
                        control2=true;
                    }else{
                        //inicializo la clase division
                        Division divivir = new Division();

                        resultado = divivir.Division(resultado, num2); 
                    } 
                    control2 = true;
                }
                case "%" -> {
                    //solicito y capturo el segundo numero
                    mensaje();
                    double num2 = capturarNumero();
                    if(num2 == 0){
                        System.out.println("La division por 0 no se puede, ingrese un nuevo numero de nuevo");
                        //solicito y capturo el segundo numero
                        mensaje();

                        double num3 = capturarNumero();
                        //inicializo la clase modulo
                        Modulo modulo = new Modulo();

                        resultado = modulo.Modulo(resultado, num3); 
                    }else{
                        //inicializo la clase modulo
                        Modulo modulo = new Modulo();

                        resultado = modulo.Modulo(resultado, num2); 
                    } 
                    control2 = true;
                }
                case "=" -> {
                    
                    control2 = false;
                }
                default -> {
                    System.out.println("Ingreso un opcion invalida, intente de nuevo");
                }
            }//fin de switch
             
            //imprimo el resultado de la operacion
            System.out.println("El resultado de la operacion es: " + resultado);
          }  
            
           
           
            
        }while(control == true);//fin del ciclo do while
           
    }//fin del metodo principal
    
    //metodo para mostrar un menu de operaciones
    private static void menu(){
        System.out.println("Escriba el signo de la operacion que desea realizar");
        System.out.println("1.Suma(+).");
        System.out.println("2.Resta(-).");
        System.out.println("3.Multiplicacion(*).");
        System.out.println("4.Division(/).");
        System.out.println("5.Modulo de la Division(%).");
        System.out.println("Salir(=).");
    }//fin del metodo
    
    //metodo para capturar la opcion elegida por el usuario
    private static String capturarSigno(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }//fin del metodo
    
    
    //metodo para mostrar mensaje inicial al sistema
    private static void mensaje2(){
        System.out.println("Bienvenido, si desea realizar alguno operacion, por favor ingrese un numero, de lo contrario ingrese = para salir");
    }
   
    
    //metodo para solicitar al usuario los numeros para realizar la operacion
    private static void mensaje(){
        System.out.println("Ingrese por favor un numero");
    }//fin del metodo
    
    //metodo para capturar la opcion elegida por el usuario
    private static double capturarNumero(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }//fin del metodo 
   
    
}//fin de la clase 
