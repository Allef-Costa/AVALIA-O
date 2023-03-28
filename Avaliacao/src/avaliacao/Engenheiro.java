package avaliacao;


public class Engenheiro extends Funcionario{
    private String crea;

    @Override
    public String toString() {
        return "\n Engenharia: " + "\ncrea: " + crea + "\ncpf: " + super.cpf + "\nrg: " + super.rg + "\nmatricula: " + super.matricula +
                "\nsetor: " + super.setor.getSigla() + "\nsalario:" + super.salario + "\nidade: " + super.idade + 
                        "\ngenero: " + super.genero.getNome() + "\nid: " + super.id + "\nnome: " + super.getNome() + 
                         "\ntelefone:" + super.getTelefone() + "\nemail: " + super.getEmail() + "\n" + 
                "\n Endereço:\n " + super.endereco.getCep() + "\n" + super.endereco.getCidade() + "\n" + super.endereco.getComplemento() +
                "\n" + super.endereco.getLogradouro() + "\n" + super.endereco.getNumero();
    }
    

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    
    
    
}
