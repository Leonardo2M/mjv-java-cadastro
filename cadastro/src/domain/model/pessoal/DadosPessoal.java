package domain.model.pessoal;

import java.time.LocalDate;
import java.util.List;

public class DadosPessoal {

    private String nome;
    private CPF cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private List<Habilidade> habilidades;

}
