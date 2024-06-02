public class Addition extends Operation {

    public Addition(Nombre operande1, Nombre operande2){
        super(operande1,operande2);
    }

    public int valeur(){
        return this.getOperande1().valeur()+this.getOperande2().valeur();

    }

    @Override
    public String toString(){
        return ""+this.getOperande1().valeur()+" + "+this.getOperande2().valeur(); // J'ais mit "" car on veut un String et non pas un Integer ( "": permet de convertir le nombre en String )

    }
    
}