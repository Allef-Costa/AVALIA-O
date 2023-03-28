package avaliacao;


public class Medico extends Funcionario{
    private String crm;

    @Override
    public String toString() {
        return "\n Medico: " + "\ncpf: " + super.cpf + "\nrg: " + super.rg + "\nmatricula: " + super.matricula +
                "\nsetor: " + super.setor.getSigla() + "\nsalario:" + super.salario + "\nidade: " + super.idade + 
                        "\ngenero: " + super.genero.getNome() + "\nid: " + super.id + "\nnome: " + super.getNome() + 
                         "\ntelefone:" + super.getTelefone() + "\nemail: " + super.getEmail() + "\n" + 
                "\n Endereço:\n " + super.endereco.getCep() + "\n" + super.endereco.getCidade() + "\n" + super.endereco.getComplemento() +
                "\n" + super.endereco.getLogradouro() + "\n" + super.endereco.getNumero();
    }
    

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, id, nome, telefone, email, endereco);
        this.crm = crm;
    }

   

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    
    
    
    
    
}
