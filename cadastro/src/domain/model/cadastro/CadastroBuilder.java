package domain.model.cadastro;

import domain.model.contato.Celular;
import domain.model.contato.DadosContato;
import domain.model.contato.Email;
import domain.model.contato.Telefone;
import domain.model.pessoal.CPF;
import domain.model.pessoal.DadosPessoal;
import domain.model.pessoal.Habilidade;
import domain.model.pessoal.Sexo;
import domain.model.profissional.DadosProfissional;
import domain.model.profissional.PretensaoSalarial;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CadastroBuilder {

    private DadosPessoal dadosPessoal;
    private DadosContato dadosContato;
    private DadosProfissional dadosProfissional;
    private Set<Habilidade> habilidades = new HashSet<>();

    public static CadastroBuilder builder() {
        return new CadastroBuilder();
    }

    public CadastroBuilder dadosPessoais(String nome, String cpf, LocalDate dataNascimento, Sexo sexo) {
        this.dadosPessoal = new DadosPessoal(nome, new CPF(cpf), dataNascimento, sexo);
        return this;
    }
    public CadastroBuilder dadosContato(Email email, Telefone telefone, Celular celular) {
        this.dadosContato = new DadosContato(email, telefone, celular);
        return this;
    }

    public CadastroBuilder adicionarHabilidade(String descricao) {
        habilidades.add(new Habilidade(descricao));
        return this;
    }
    public CadastroBuilder dadosProfissional(String profissao, String empresa, BigDecimal salario, Boolean empregado, PretensaoSalarial pretensaoSalarial) {
        this.dadosProfissional = new DadosProfissional(profissao, empresa, salario, empregado, pretensaoSalarial);
        return this;
    }

    public Cadastro build() {
        habilidades.forEach(h -> dadosPessoal.adicionarHabilidade(h));
        return new Cadastro(dadosPessoal, dadosContato, dadosProfissional);
    }
}
