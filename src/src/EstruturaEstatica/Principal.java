package EstruturaEstatica;

public class Principal {
    public static void main(String[] args) {
        Pilha <String> pilha = new Pilha();

        pilha.adiciona("a");
        pilha.adiciona("b");
        pilha.adiciona("c");
        System.out.println(pilha);

        System.out.println(pilha.desempilha());

        System.out.println(pilha);

        System.out.println(pilha.estavazia());
    }
}