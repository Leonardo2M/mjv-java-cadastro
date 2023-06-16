package domain.model.contato;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if(ddd == null || !ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("ddd inválido!");
        }

        if(numero == null || !numero.matches("\\d{4}-\\d{4}$")) {
            throw new IllegalArgumentException("número de telefone inválido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getTelefone() {
        return "(" + ddd + ") " + numero;
    }


}
