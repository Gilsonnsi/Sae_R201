public class Multiplication extends Operation{
    public Multiplication(Expression operande1, Expression operande2){
        super(operande1,operande2);
    }

    public double valeur(){
        return this.getOperande1().valeur()*this.getOperande2().valeur();
    }

    @Override
    public String toString(){
        return "("+getOperande1() + " x " + getOperande2() +")";
    }
}   
