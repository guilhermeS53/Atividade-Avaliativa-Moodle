package Ex30;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public static void main(String[] args) {
        Pessoa avoMatA = new Pessoa("Avó Materna", 80);
        Pessoa avoMat = new Pessoa("Avô Paterno", 82);
        Pessoa avoPatA = new Pessoa("Avó Paterna", 74);
        Pessoa avoPat = new Pessoa("Avô Paterno", 75);

        Pessoa mae = new Pessoa("Mãe", 34);
        Pessoa pai = new Pessoa("Pai", 38);
        Pessoa filho = new Pessoa("Filho", 18);

        avoPat.setPai(null);
        avoPat.setMae(null);
        avoPatA.setPai(null);
        avoPatA.setMae(null);
        avoMat.setPai(null);
        avoMat.setMae(null);
        avoMatA.setPai(null);
        avoMatA.setMae(null);
        pai.setPai(avoPat);
        pai.setMae(avoPatA);
        mae.setPai(avoMat);
        mae.setMae(avoMatA);
        filho.setPai(pai);
        filho.setMae(mae);

        imprimirArvoreGenealogica(filho, 0);

    }

    public static void imprimirArvoreGenealogica(Pessoa pessoa, int lev) {
        for (int i = 0; i < lev; i++) {
            System.out.println(" ");
        }
        System.out.println(pessoa.getNome() + " (" + pessoa.getIdade() + " anos)");

        Pessoa pai = pessoa.getPai();
        if (pai != null) {
            imprimirArvoreGenealogica(pai, lev + 1);
        }

        Pessoa mae = pessoa.getMae();
        if (mae != null) {
            imprimirArvoreGenealogica(mae, lev + 1);
        }
    }
}


