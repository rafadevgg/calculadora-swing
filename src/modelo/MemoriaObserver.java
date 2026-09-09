package modelo;

@FunctionalInterface
public interface MemoriaObserver {
    void valorAlterado(String novoValor);
}
