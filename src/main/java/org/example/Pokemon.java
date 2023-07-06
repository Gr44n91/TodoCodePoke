package org.example;

public abstract class Pokemon {

    private int numPokemon;
    private String nombrePokemon;
    private double pesoPokemon;
    private String sexoPokemon;
    private int temporadaEnLaQueAparece;

    public Pokemon(int numPokemon, String nombrePokemon) {
        this.numPokemon = numPokemon;
        this.nombrePokemon = nombrePokemon;
    }

    public int getNumPokemon() {
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public String getSexoPokemon() {
        return sexoPokemon;
    }

    public void setSexoPokemon(String sexoPokemon) {
        this.sexoPokemon = sexoPokemon;
    }

    public int getTemporadaEnLaQueAparece() {
        return temporadaEnLaQueAparece;
    }

    public void setTemporadaEnLaQueAparece(int temporadaEnLaQueAparece) {
        this.temporadaEnLaQueAparece = temporadaEnLaQueAparece;
    }

    public abstract void atacarPlacaje();
    public abstract void atacarAranazo();
    public abstract void atacarMordisco();
}
