package domain.model.contato;

public class Celular {

    private String ddd;
    private String numero;

    private Boolean whatsApp;

    public Celular(String ddd, String numero, Boolean whatsApp) {

        if(ddd == null || !ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("ddd inválido!");
        }

        if(numero == null || !numero.matches("^9\\d{4}-\\d{4}$")) {
            throw new IllegalArgumentException("número de celular inválido!");
        }

        this.ddd = ddd;
        this.numero = numero;
        this.whatsApp = whatsApp;
    }

    public String getNumero() {
        return "(" + ddd + ") " + numero;
    }

    public Boolean possuiWhatsApp() {
        return this.whatsApp;
    }
}
