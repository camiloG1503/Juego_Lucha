package Games.ataque;

import Games.personaje.Personaje;

import java.util.Random;

public class AtaqueMagico implements IAtaque {
    @Override
    public void ejecutar(Personaje atacante, Personaje oponente) {
        int dano = new Random().nextInt(16) + 15; // 15–30
        oponente.recibirDano(dano);
        System.out.println(atacante.getNombre() + " lanza hechizo causando " + dano + " puntos de daño.");
    }
}
