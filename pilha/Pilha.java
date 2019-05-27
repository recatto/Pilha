package pilha;

public class Pilha {

    private char vetorPilha[];
    private int topo;

    public Pilha(int tamanho) {
        vetorPilha = new char[tamanho];
        topo = -1;
    }

    public void push(char in) {
        if (!isFull()) {
            topo++;
            vetorPilha[topo] = in;
        }
    }

    public char pop() {
        return vetorPilha[topo--];
    }

    public char peek() {
        return vetorPilha[topo];
    }

    public boolean isEmpty() {
        return (topo == -1);
    }
    
    public boolean isFull() {
        return (topo == this.vetorPilha.length - 1);
    }
}
