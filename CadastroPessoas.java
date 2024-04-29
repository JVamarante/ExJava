import java.util.ArrayList;
public class CadastroPessoas {
    private ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();
    private ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    public void cadastrarPessoaFisica(PessoaFisica pf) {
        pessoasFisicas.add(pf);
        System.out.println("Pessoa física cadastrada com sucesso!");
    }

    public void cadastrarPessoaJuridica(PessoaJuridica pj) {
        pessoasJuridicas.add(pj);
        System.out.println("Pessoa jurídica cadastrada com sucesso!");
    }

    public void listarFisica() {
        for (PessoaFisica pf : pessoasFisicas) {
            System.out.println(pf);
        }
    }

    public void listarPolimorficos() {
        ArrayList<Pessoa> pessoasPolimorficas = new ArrayList<>();
        pessoasPolimorficas.addAll(pessoasFisicas);
        pessoasPolimorficas.addAll(pessoasJuridicas);

        for (Pessoa p : pessoasPolimorficas) {
            if (p instanceof PessoaFisica) {
                System.out.println("Nome:" + p.getNome() + ", Idade:" + p.getIdade() + ", Tipo: Pessoa Física");
            } else if (p instanceof PessoaJuridica) {
                System.out.println("Nome:" + p.getNome() + ", Idade:" + p.getIdade() + ", Tipo: Pessoa Jurídica, CNPJ:" +
                        ((PessoaJuridica) p).getCnpj());
            } else {
                System.out.println("Nome:" + p.getNome() + ", Idade:" + p.getIdade());
            }
        }
        }
    }