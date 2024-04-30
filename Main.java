import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadastroPessoas cp = new CadastroPessoas();

        boolean adicionarMaisPessoas = true;
        while (adicionarMaisPessoas) {
            System.out.println("Digite o tipo de pessoa (Física ou Jurídica):");
            String tipoPessoa = scanner.nextLine();

            if (tipoPessoa.equalsIgnoreCase("Física")) {
                PessoaFisica pessoaFisica = new PessoaFisica();

                System.out.println("Digite o nome da pessoa física:");
                pessoaFisica.setNome(scanner.nextLine());
                System.out.println("Digite a idade da pessoa física:");
                pessoaFisica.setIdade(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Digite o CPF da pessoa física:");
                pessoaFisica.setCpf(scanner.nextLine());

                cp.cadastrarPessoa(pessoaFisica);
            } else if (tipoPessoa.equalsIgnoreCase("Jurídica")) {
                PessoaJuridica pessoaJuridica = new PessoaJuridica();

                System.out.println("Digite o nome da pessoa jurídica:");
                pessoaJuridica.setNome(scanner.nextLine());
                System.out.println("Digite a idade da pessoa jurídica:");
                pessoaJuridica.setIdade(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Digite o CNPJ da pessoa jurídica:");
                pessoaJuridica.setCnpj(scanner.nextLine());

                cp.cadastrarPessoa(pessoaJuridica);
            } else {
                System.out.println("Tipo de pessoa inválido. Por favor, digite 'Física' ou 'Jurídica'.");
                continue; // Volta para o início do loop
            }

            System.out.println("Deseja adicionar outra pessoa? (Sim/Não)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("Sim")) {
                adicionarMaisPessoas = false;
            }
        }

        System.out.println("Listagem de Pessoas:");
        cp.listarPolimorficos();
    }
}