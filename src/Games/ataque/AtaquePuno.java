package Games.ataque;

import Games.personaje.Personaje;

import java.util.Random;

public class AtaquePuno implements IAtaque {
    @Override
    public void ejecutar(Personaje atacante, Personaje oponente) {
        int dano = new Random().nextInt(21) + 10; // 10–30
        oponente.recibirDano(dano);
        System.out.println(atacante.getNombre() + " ataca con un chin buster causando " + dano + " puntos de daño.");
    }
}
