package org.example;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle(int numPokemon, String nombrePokemon){
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
    public void atacarHidrobomba() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo hidro bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo hidropulso");
    }
}
