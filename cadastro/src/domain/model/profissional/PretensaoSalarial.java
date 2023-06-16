package domain.model.profissional;

import java.math.BigDecimal;

public class PretensaoSalarial {

    private BigDecimal valorMinimo;
    private BigDecimal valorMaximo;

    public PretensaoSalarial(Double valorMinimo, Double valorMaximo) {
        this.valorMinimo = new BigDecimal(valorMinimo);
        this.valorMaximo = new BigDecimal(valorMaximo);
    }

    public BigDecimal getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(BigDecimal valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public BigDecimal getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
}
