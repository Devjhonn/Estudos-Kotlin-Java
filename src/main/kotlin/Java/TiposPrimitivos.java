package Java;

public class TiposPrimitivos {
    public static void main(String[] args){
        int idade = 10;
        long numeroGrande = 1000000;
        double salarioDouble = 2000.00;
        float salarioFloat = 2500.40F;
        byte  idadeByte = 127;
        short idadeShort = 12;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'c';

        System.out.println("Int = " +idade);
        System.out.println("Long = " + numeroGrande);
        System.out.println("Double = " + salarioDouble);
        System.out.println("Float = " + salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
    }

    public static void variaveis(){
        int dias = 10; // variavel mutavel
        dias = 20;

        final int semanas = 20; //constantes
        //semanas = 1; // error
    }
}
