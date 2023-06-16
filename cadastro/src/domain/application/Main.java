package domain.application;

import domain.model.CPF;

public class Main {
    public static void main(String[] args) {
        CPF cpf = new CPF("111.111.111-11");

        System.out.println(cpf.getNumero());
    }
}