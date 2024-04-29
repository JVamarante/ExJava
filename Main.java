import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadastroPessoas cp = new CadastroPessoas();

        boolean adicionarMaisPessoas = true;
        while (adicionarMaisPessoas) {
            PessoaFisica pessoaFisica = new PessoaFisica();

            System.out.println("Digite o nome da pessoa física:");
            pessoaFisica.setNome(scanner.next());
            System.out.println("Digite a idade da pessoa física:");
            pessoaFisica.setIdade(scanner.nextInt());

            cp.cadastrarPessoaFisica(pessoaFisica);
            System.out.println(pessoaFisica.toString());

            System.out.println("Deseja adicionar outra pessoa? (Sim/Não)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("Sim")) {
                adicionarMaisPessoas = false;
            }
        }

        cp.listarFisica();
    }
}