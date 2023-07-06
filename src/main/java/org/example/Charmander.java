package org.example;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(int numPokemon, String nombrePokemon){
        super(numPokemon, nombrePokemon);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo mordisco");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo Punio fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo Lanzallamas");
    }
}
