package Games.factory;

import Games.ataque.AtaqueCombo;
import Games.personaje.Personaje;

public class ShunlimeiFactory implements PersonajeFactory{
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Personaje(nombre, new AtaqueCombo());
    }
}
