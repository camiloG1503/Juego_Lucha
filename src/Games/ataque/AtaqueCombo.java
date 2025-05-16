package Games.ataque;

import Games.personaje.Personaje;

import java.util.Random;

public class AtaqueCombo implements IAtaque {
    @Override
    public void ejecutar(Personaje atacante, Personaje oponente) {
        int dano = new Random().nextInt(21) + 10; // 10–30
        oponente.recibirDano(dano);
        System.out.println(atacante.getNombre() + " ataca con un hechizo causando " + dano + " puntos de daño.");
    }
}
