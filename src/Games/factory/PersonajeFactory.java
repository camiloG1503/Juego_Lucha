package Games.factory;

import Games.personaje.Personaje;

public interface PersonajeFactory {
    Personaje crearPersonaje(String nombre);
}