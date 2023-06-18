package domain.service;

import domain.model.cadastro.Cadastro;
import domain.model.cadastro.CadastroBuilder;
import domain.model.contato.Celular;
import domain.model.contato.Email;
import domain.model.contato.Telefone;
import domain.model.pessoal.Sexo;
import domain.model.profissional.PretensaoSalarial;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class ConversorService {

    private final Path PATH = Paths.get("D:\\Intellij\\mjv-java-school\\files\\cadastro.csv");

    public ConversorService() {

    }

    public void toCSV(Cadastro cadastro) {
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

        try {
            String conteudo = Files.readString(PATH);

            String[] valores = conteudo.split(";");

            for (String valor : valores) {
                System.out.println(valor);
            }
            /*        Cadastro cadastro = CadastroBuilder
                .builder()
                .dadosPessoais(dadosPessoal)
                .dadosContato(dadosContato)
                .adicionarEndereco(endereco)
                .adicionarHabilidade("Esforçado")
                .adicionarHabilidade("Proativo")
                .adicionarHabilidade("Conhecimentos em Java")
                .adicionarHabilidade("Conhecimentos em Spring Boot")
                .dadosProfissional(dadosProfissional)
                .build();

            return cadastro;*/
        } catch (Exception e) {
            System.err.println("Erro ao ler o arquivo CSV: " + e);
        }

    }

}
