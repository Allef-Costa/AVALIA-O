package avaliacao;


public class Cliente extends Fisica{
    private int protocoloAtendimento;

    @Override
    public String toString() {
        return "\n\ncliente: \n" + protocoloAtendimento + "\nidade: " + super.id + "\ngenero: " + super.genero.nome +
                "\nid: " + super.id + "\nnome: " + super.nome + "\ntelefone: " + super.telefone + "\nemail: " + super.email + "\nEndereco: " +"\n"
                + super.endereco.getCep() + "\n" + super.endereco.getCidade() + "\n" + super.endereco.getComplemento() + "\n" +
                super.endereco.getLogradouro() + "\n" + super.endereco.getNumero();
    }

    public Cliente(int protocoloAtendimento, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(idade, genero, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    
    
   
}
