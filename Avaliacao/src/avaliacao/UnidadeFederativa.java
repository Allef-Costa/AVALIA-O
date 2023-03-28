package avaliacao;


public enum UnidadeFederativa {
  ACRE ("AC", "Acre"),
ALAGOAS ("AL", "Alagoas"),
AMAPÁ ("AP", "Amapá"),
AMAZONAS ("AM", "Amazonas"),
BAHIA ("BA", "Bahia"),
CEARÁ ("CE", "Ceará"),
DISTRITO_FEDERAL ("DF", "Distrito Federal"),
ESPÍRITO_SANTO ("ES", "Espírito Santo"),
GOIÁS ("GO","Goiás"),
MARANHÃO ("MA", "Maranhão"),
MATO_GROSSO ("MT", "Mato Grosso"),
MATO_GROSSO_DO_SUL ("MS", "Mato Grosso do Sul"),
MINAS_GERAIS ("MG", "Minas Gerais"),
PARÁ ("PA", "Pará"),
PARAÍBA ("PB", "Paraíba"),
PARANÁ ("PR", "Paraná"),
PERNAMBUCO ("PE", "Pernambuco"),
PIAUÍ ("PI", "Piauí"),
RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
RIO_GRANDE_DO_NORTE ("RN", "Rio Grande do Norte"),
RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul"),
RONDÔNIA ("RO", "Rondônia"),
RORAIMA ("RR", "Roraíma"),
SANTA_CATARINA ("SC", "Santa Catarina"),
SÃO_PAULO ("SP", "São Paulo"),
SERGIPE ("SE", "Sergipe"),
TOCANTINS ("TO", "Tocantins");

private String nome;
private String sigla;

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    private UnidadeFederativa() {
    }

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

   
    
}
