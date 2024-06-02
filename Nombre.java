public class Nombre extends Expression{
    private int valeurNombre;

    public Nombre(int valeurNombre){   // Dans le diagramme c'est écrit "Nombre" mais j'ai mit int car on peut pas demander en parametre un objet de la meme classe. 
        this.valeurNombre = valeurNombre;
    }

    public double valeur(){
        return this.valeurNombre;
    }

    public String toString(){
        return "" + this.valeurNombre;
    }
}