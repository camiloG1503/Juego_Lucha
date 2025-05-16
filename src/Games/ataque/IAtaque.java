package Games.ataque;

import Games.personaje.Personaje;

public interface IAtaque {
    void ejecutar(Personaje atacante, Personaje oponente);
}
