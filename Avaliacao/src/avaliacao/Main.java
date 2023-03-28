package avaliacao;


public class Main {

   
    public static void main(String[] args) {
     Medico med1 = new Medico("123", "252152325", "852159357", "1935", Setor.SAUDE, 15, 23, Genero.MASCULINO, 1, "Allef", "985004807", "allefcqueiroz@hotmail.com", new Endereco("Rua de baixo", "272", "Frente ao mercado", "4111", "Salvador", UnidadeFederativa.BAHIA));
     Advogado adv1 = new Advogado("123", "252152325", "852159357", "1935", Setor.SAUDE, 15, 23, Genero.MASCULINO, 1, "Allef", "985004807", "allefcqueiroz@hotmail.com", new Endereco("Rua de baixo", "272", "Frente ao mercado", "4111", "Salvador", UnidadeFederativa.BAHIA));
     Engenheiro eng1 = new Engenheiro("123", "252152325", "852159357", "1935", Setor.SAUDE, 15, 23, Genero.MASCULINO, 1, "Allef", "985004807", "allefcqueiroz@hotmail.com", new Endereco("Rua de baixo", "272", "Frente ao mercado", "4111", "Salvador", UnidadeFederativa.BAHIA));
     Cliente cl1 = new Cliente(151, 23, Genero.MASCULINO, 12, "Allef", "985004807", "allefcqueiroz@hotmail.com", new Endereco("Rua", "272", "Casa", "41110560", "Salvador", UnidadeFederativa.BAHIA));
     Juridica j1 = new Juridica("1584562156189", "1515-5", 12352, "Fella", "985004821", "allefcqueiroz@hotmail.com", new Endereco("Rua", "272", "Casa", "41110560", "Salvador", UnidadeFederativa.BAHIA));
     
     
       
        
        System.out.println(adv1.toString());
        System.out.println(med1.toString());
        System.out.println(eng1.toString());
        System.out.println(cl1.toString());
        System.out.println(j1.toString());
        
        
        
    
}}
