package Games.factory;

import Games.personaje.Personaje;
import Games.ataque.AtaquePuno;
import Games.ataque.IAtaque;

public class Ken extends Personaje {
    public Ken(String nombre) {
        super(nombre, new AtaquePuno());
    }

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Ken(nombre);
    }
}
