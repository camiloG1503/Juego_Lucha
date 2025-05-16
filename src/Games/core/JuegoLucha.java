package Games.core;

import Games.observer.*;
import Games.personaje.Personaje;

import java.util.ArrayList;
import java.util.List;

public class JuegoLucha {
    private final Personaje jugador1;
    private final Personaje jugador2;
    private final List<ObservadorCombate> observadores = new ArrayList<>();

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void agregarObservador(ObservadorCombate obs) {
        observadores.add(obs);
    }

    private void notificar(Evento e) {
        for (ObservadorCombate obs : observadores)
            obs.update(e);
    }

    public void iniciarPelea() {
        notificar(new Evento("INICIO", "Comienza la pelea entre " + jugador1.getNombre() + " y " + jugador2.getNombre()));

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) turno(jugador2, jugador1);
        }

        String ganador = jugador1.estaVivo() ? jugador1.getNombre() : jugador2.getNombre();
        notificar(new Evento("FIN", "El ganador es: " + ganador));
    }

    private void turno(Personaje atacante, Personaje defensor) {
        notificar(new Evento("TURNO", "Turno de " + atacante.getNombre()));
        atacante.atacar(defensor);
        notificar(new Evento("ESTADO", defensor.getNombre() + " tiene " + defensor.getPuntosDeVida() + " puntos de vida."));
    }
}
