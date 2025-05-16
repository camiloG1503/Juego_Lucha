package Games.factory;

import Games.ataque.AtaqueCombo;
import Games.personaje.Personaje;

public class Shunlimei extends Personaje{
    public Shunlimei(String nombre) {
        super(nombre, new AtaqueCombo());
    }

    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Shunlimei(nombre);
    }
}
