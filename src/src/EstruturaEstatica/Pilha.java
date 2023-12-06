package EstruturaEstatica;

public class Pilha <t> extends EstruturaEstatica <t>{
    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar (t elemento) {
        super.adiciona(elemento);
    }

    public t topo() {
        if (this.estavazia()){
            return null;
        }
        else {
            return this.elementos[tamanho-1];
        }
    }

    public t desempilha() {
        if (this.estavazia()){
            return null;
        }
        else {
            t elemento = this.elementos[tamanho-1];
            tamanho--;
            return elemento;
        }
    }


}
