package Games.factory;

import Games.ataque.AtaqueEspada;
import Games.personaje.Personaje;

public class GuerreroFactory implements PersonajeFactory {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Personaje(nombre, new AtaqueEspada());
    }
}