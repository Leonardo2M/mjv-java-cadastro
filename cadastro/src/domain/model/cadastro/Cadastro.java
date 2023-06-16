package domain.model.cadastro;

import domain.model.contato.DadosContato;
import domain.model.pessoal.DadosPessoal;
import domain.model.profissional.DadosProfissional;

public class Cadastro {

    private DadosPessoal dadosPessoal;
    private DadosContato dadosContato;
    private DadosProfissional dadosProfissional;

    public Cadastro(DadosPessoal dadosPessoal, DadosContato dadosContato, DadosProfissional dadosProfissional) {
        this.dadosPessoal = dadosPessoal;
        this.dadosContato = dadosContato;
        this.dadosProfissional = dadosProfissional;
    }

    public DadosPessoal getDadosPessoal() {
        return dadosPessoal;
    }

    public DadosContato getDadosContato() {
        return dadosContato;
    }

    public DadosProfissional getDadosProfissional() {
        return dadosProfissional;
    }
}
