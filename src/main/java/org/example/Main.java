package org.example;

public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander(1, "Rigoberto");
        charmander.atacarPlacaje();
        Bulbasaur bulbasaur = new Bulbasaur(2, "Alberto");
        bulbasaur.atacarHojaAfilada();
        Pikachu pikachu = new Pikachu(3, "Mariberton");
        pikachu.atacarRayo();
        Squirtle squirtle = new Squirtle(4, "Reinaldo");
        squirtle.atacarHidrobomba();
    }

}