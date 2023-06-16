package domain.model.contato;

public class DadosContato {

    private Email email;
    private Telefone telefone;
    private Celular celular;

    public DadosContato(Email email, Telefone telefone, Celular celular) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public String getTelefone() {
        return telefone.getTelefone();
    }

    public Celular getCelular() {
        return celular;
    }
}
