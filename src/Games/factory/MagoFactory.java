package Games.factory;

import Games.ataque.AtaqueMagico;
import Games.personaje.Personaje;

public class MagoFactory implements PersonajeFactory{
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Personaje(nombre, new AtaqueMagico());
    }
}
