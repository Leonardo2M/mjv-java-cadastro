package domain.service;

import domain.model.cadastro.Cadastro;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ConversorService {

    private final Path PATH = Paths.get("D:\\Intellij\\mjv-java-school\\files\\cadastro.csv");

    private Cadastro cadastro;

    public ConversorService() {

    }

    public void cabecalho() {
        StringBuilder cabecalho = new StringBuilder();

        cabecalho.append("NOME | ");
        cabecalho.append("CPF | ");
        cabecalho.append("DATA NASC. | ");
        cabecalho.append("SEXO | ");
        cabecalho.append("LOGADOURO | ");
        cabecalho.append("NUMERO | ");
        cabecalho.append("COMPLEMENTO | ");
        cabecalho.append("BAIRRO | ");
        cabecalho.append("CIDADE | ");
        cabecalho.append("ESTADO | ");
        cabecalho.append("E-MAIL | ");
        cabecalho.append("TELEFONE | ");
        cabecalho.append("CELULAR | ");
        cabecalho.append("WHATSAPP | ");
        cabecalho.append("PROFISSAO | ");
        cabecalho.append("EMPRESA | ");
        cabecalho.append("SALARIO | ");
        cabecalho.append("EMPREGO ATUAL | ");
        cabecalho.append("PRETENSÃO SALARIAL MINIMA | ");
        cabecalho.append("PRETENSÃO SALARIAL MAXIMA | ");
        cabecalho.append("HABILIDADES").append("\n");

        try {
            Files.writeString(PATH, cabecalho.toString(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void toCSV(Cadastro cadastro) {
        if(!arquivoJaExiste()) {
            this.cabecalho();
        }

        StringBuilder cadastroCSV = new StringBuilder();

        cadastroCSV.append(cadastro.getDadosPessoal().getNome()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getCpf()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getDataNascimento()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getSexo()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getEndereco().getLogradouro()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getEndereco().getNumero()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getEndereco().getComplemento()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getEndereco().getBairro()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getEndereco().getCidade()).append(";");
        cadastroCSV.append(cadastro.getDadosPessoal().getEndereco().getEstado()).append(";");
        cadastroCSV.append(cadastro.getDadosContato().getEmail()).append(";");
        cadastroCSV.append(cadastro.getDadosContato().getTelefone()).append(";");
        cadastroCSV.append(cadastro.getDadosContato().getCelular().getNumero()).append(";");
        cadastroCSV.append(cadastro.getDadosContato().getCelular().possuiWhatsApp()).append(";");
        cadastroCSV.append(cadastro.getDadosProfissional().getProfissao()).append(";");
        cadastroCSV.append(cadastro.getDadosProfissional().getEmpresa()).append(";");
        cadastroCSV.append(cadastro.getDadosProfissional().getSalario()).append(";");
        cadastroCSV.append(cadastro.getDadosProfissional().getPretensaoSalarial().getValorMinimo()).append(";");
        cadastroCSV.append(cadastro.getDadosProfissional().getPretensaoSalarial().getValorMaximo()).append(";");
        cadastro.getDadosPessoal().getHabilidades().forEach(h -> cadastroCSV.append(h.getDescricao()).append(";"));

        try {
            Files.writeString(PATH, cadastroCSV.toString(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }

    public void fromCSV() {
        return;
    }

    public Boolean arquivoJaExiste() {
        return Files.exists(PATH);
    }
}
