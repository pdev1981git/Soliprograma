package com.mycompany.soliprograma;


public class Soliprograma {

    public static void main(String[] args) {
        
       /* int numInicio = 5;
        int numFinal = 14;
        String numTot = "Hola";
        
        while(numInicio <= numFinal) {

        System.out.println(numInicio);
        numInicio++;}
        System.out.println(numTot);    */
        
        
        String saludo = "hola que tal?";
	System.out.println(saludo.toUpperCase());
	System.out.println(saludo);
	saludo = "hola y chau";
	System.out.println(saludo);
	saludo = saludo.toUpperCase();
	System.out.println(saludo);
	String [] saludoPartido1 = saludo.split(" ");
	for (String palabra : saludoPartido1){
		System.out.println(palabra);
	}
	System.out.println(saludo.length());

    }
        
        
    
}
