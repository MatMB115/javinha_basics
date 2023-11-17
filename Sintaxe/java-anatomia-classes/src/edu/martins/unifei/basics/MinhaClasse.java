package edu.martins.unifei.basics;

public class MinhaClasse {

    public static void main (String [] args) {
        String nome = nomeCompleto("Jorge", "Amado");
        System.out.print (nome);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

