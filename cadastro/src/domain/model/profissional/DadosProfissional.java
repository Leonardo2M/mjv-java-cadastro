package domain.model.profissional;

import java.math.BigDecimal;

public class DadosProfissional {

    private String profissao;
    private String Empresa;
    private BigDecimal salario;
    private Boolean empregado;
    private PretensaoSalarial pretensaoSalarial;

    public DadosProfissional(String profissao, String empresa, BigDecimal salario, Boolean empregado, PretensaoSalarial pretensaoSalarial) {
        this.profissao = profissao;
        Empresa = empresa;
        this.salario = salario;
        this.empregado = empregado;
        this.pretensaoSalarial = pretensaoSalarial;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public PretensaoSalarial getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    public Boolean estaEmpregado() {
        return empregado;
    }
}
