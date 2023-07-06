package org.example;

public class Bulbasaur extends Pokemon implements  IPlanta{

    public Bulbasaur(int numPokemon, String namePokemon){
        super(numPokemon, namePokemon);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo aranazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo latigo cepa");
    }
}
