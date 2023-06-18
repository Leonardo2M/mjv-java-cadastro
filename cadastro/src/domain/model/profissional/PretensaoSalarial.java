package domain.model.profissional;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PretensaoSalarial {

    private BigDecimal valorMinimo;
    private BigDecimal valorMaximo;

    public PretensaoSalarial(Double valorMinimo, Double valorMaximo) {
        this.valorMinimo = new BigDecimal(valorMinimo);
        this.valorMaximo = new BigDecimal(valorMaximo);
    }

    public BigDecimal getValorMinimo() {
        return valorMinimo.setScale(2, RoundingMode.HALF_UP);
    }

    public void setValorMinimo(BigDecimal valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public BigDecimal getValorMaximo() {
        return valorMaximo.setScale(2, RoundingMode.HALF_UP);
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
}
