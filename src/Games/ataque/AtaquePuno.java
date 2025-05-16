package Games.ataque;

import Games.personaje.Personaje;

public class AtaquePuno implements IAtaque{
    @Override
    public void ejecutar(Personaje atacante, Personaje oponente) {
        System.out.println(atacante.getNombre() + " ataca a " + oponente.getNombre() + " con un puñetazo!");
        int dano = 10; // Daño fijo por puñetazo
        oponente.recibirDano(dano);
        System.out.println(oponente.getNombre() + " recibe " + dano + " puntos de daño.");
    }

}
