package Games.factory;

import Games.ataque.AtaquePoder;
import Games.personaje.Personaje;

public class RyuFactory implements PersonajeFactory {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Personaje(nombre, new AtaquePoder());
    }
}
