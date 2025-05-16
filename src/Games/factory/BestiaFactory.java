package Games.factory;

import Games.ataque.AtaqueMagico;
import Games.ataque.AtaquePuno;
import Games.personaje.Personaje;

public class BestiaFactory implements PersonajeFactory {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Personaje(nombre, new AtaquePuno());
    }
}