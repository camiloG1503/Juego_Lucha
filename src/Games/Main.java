package Games;

import Games.core.JuegoLucha;
import Games.observer.CombateLogger;
import Games.personaje.Personaje;
import Games.factory.Ken;
import Games.factory.Ryu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del jugador 1: ");
        String nombre1 = sc.nextLine();

        System.out.print("Nombre del jugador 2: ");
        String nombre2 = sc.nextLine();

        // Creación de las factories para Ryu y Ken
        Personaje factory1 = new Ryu("factory");
        Personaje factory2 = new Ken("factory");

        Personaje jugador1 = factory1.crearPersonaje(nombre1);
        Personaje jugador2 = factory2.crearPersonaje(nombre2);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.agregarObservador(new CombateLogger());
        juego.iniciarPelea();
    }
}