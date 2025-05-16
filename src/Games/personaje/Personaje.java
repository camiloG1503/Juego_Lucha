package Games.personaje;

import Games.ataque.IAtaque;

public class Personaje {
    private String nombre;
    private int puntosDeVida = 100;
    private IAtaque estrategiaAtaque;

    public Personaje(String nombre, IAtaque ataque) {
        this.nombre = nombre;
        this.estrategiaAtaque = ataque;
    }

    public void atacar(Personaje oponente) {
        estrategiaAtaque.ejecutar(this, oponente);
    }

    public void recibirDano(int dano) {
        puntosDeVida -= dano;
        if (puntosDeVida < 0) puntosDeVida = 0;
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setAtaque(IAtaque nuevoAtaque) {
        this.estrategiaAtaque = nuevoAtaque;
    }
}
