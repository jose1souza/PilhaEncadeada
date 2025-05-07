package pilhajava2025;

public class No<T> {
    private T dado;
    private No<T> proximo; // referencia para outro no

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return this.dado.toString();
    }
}
