package Games.ataque;

import Games.personaje.Personaje;

import java.util.Random;

public class AtaqueEspada implements IAtaque {
    @Override
    public void ejecutar(Personaje atacante, Personaje oponente) {
        int dano = new Random().nextInt(16) + 15; // 15–30
        oponente.recibirDano(dano);
        System.out.println(atacante.getNombre() + " golpe multiples veces con la espada causando " + dano + " puntos de daño.");
    }
}
