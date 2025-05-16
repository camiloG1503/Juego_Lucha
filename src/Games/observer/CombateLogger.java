package Games.observer;

public class CombateLogger implements ObservadorCombate {
    @Override
    public void update(Evento evento) {
        System.out.println("[LOG - " + evento.tipo + "] " + evento.descripcion);
    }
}
