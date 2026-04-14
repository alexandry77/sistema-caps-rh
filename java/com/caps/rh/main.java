package com.caps.rh;

public class Main {
    public static void main(String[] args) {

        Funcionario pam = new Funcionario("Pam Beesly", "111.111.111-11", 2000);
        Gerente michael = new Gerente("Michael Scott", "222.222.222-22", 5000, 2000);

        System.out.println("Funcionária: - main.java:9" + pam.getNome());
        System.out.println("Salário: - main.java:10" + pam.getSalario());

        System.out.println("\nGerente: - main.java:12" + michael.getNome());
        System.out.println("Salário: - main.java:13" + michael.getSalario());
        System.out.println("Remuneração Total: - main.java:14" + michael.calcularRemuneracaoTotal());

        pam.aplicarAumento(10);

        System.out.println("\nApós aumento de 10%: - main.java:18");
        System.out.println("Novo salário da Pam: - main.java:19" + pam.getSalario());
    }
}