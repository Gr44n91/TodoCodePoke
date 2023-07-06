package org.example;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(int numPokemon, String nombrePokemon){
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
    public void atacarImpactrueno() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo punio trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy " + this.getClass().getName().substring(12) + " y estoy haciendo rayo carga");
    }
}
