package domain.model.pessoal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class DadosPessoal {

    private String nome;
    private CPF cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private Set<Habilidade> habilidades = new HashSet<>();

    public DadosPessoal(String nome, CPF cpf, LocalDate dataNascimento, Sexo sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getDataNascimento() {
        return this.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getSexo() {
        return sexo.name();
    }

    public Set<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void adicionarHabilidade(Habilidade habilidade) {
        this.habilidades.add(habilidade);
    }
}
