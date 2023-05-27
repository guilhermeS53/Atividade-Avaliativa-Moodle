package Ex29;

public class Prod {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Prod(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    static class itemPed {
        private Prod prod;
        private int qtd;

        public itemPed(Prod prod, int qtd) {
            this.prod = prod;
            this.qtd = qtd;
        }

        public Prod getProd() {
            return prod;
        }

        public int getQtd() {
            return qtd;
        }

        public double calcularTotal() {
            return prod.getPreco() * qtd;
        }
    }

    static class Ped {
        private itemPed[] itens;
        private String formPagm;

        public Ped(itemPed[] itens, String formPagm) {
            this.itens = itens;
            this.formPagm = formPagm;
        }

        public itemPed[] getItens() {
            return itens;
        }

        public String getFormPagamento() {
            return formPagm;
        }

        public double calcularTotal() {
            double total = 0.0;
            for (itemPed item : itens) {
                total += item.calcularTotal();
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Prod carne = new Prod("Carne", 40.0, 40);
        Prod feijao = new Prod("Feijão", 46.0, 45);
        Prod maca = new Prod("Maçã", 70.0, 50);

        itemPed it1 = new itemPed(carne, 5);
        itemPed it2 = new itemPed(feijao, 7);
        itemPed it3 = new itemPed(maca, 4);
        itemPed[] itemPeds = {it1, it2, it3};

        Ped ped = new Ped(itemPeds, "Cartão");

        double totalPed = ped.calcularTotal();

        System.out.println("Produtos do pedido em questão: ");
        for (itemPed item : ped.getItens()) {
            System.out.println(item.getProd().getNome() + " --> Quantidade(s): " + item.getQtd());
        }
        System.out.println("Forma de Pagamento identificada: " + ped.getFormPagamento());
        System.out.println("Total do Pedido em questão: " + totalPed);
    }
}


