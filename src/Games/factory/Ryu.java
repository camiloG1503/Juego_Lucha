package Games.factory;

import Games.ataque.AtaquePoder;
import Games.personaje.Personaje;

public class Ryu extends Personaje {
    public Ryu(String nombre) {
        super(nombre, new AtaquePoder());
    }

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Ryu(nombre);
    }

}
