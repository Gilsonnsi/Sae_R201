public class Division extends Operation{
    public Division(Expression operande1, Expression operande2){
        super(operande1,operande2);
        if (operande2.valeur() == 0)
        {
            throw new ArithmeticException("ATTENTION !!!! Tu ne dois pas diviser par 0");
        }
    }

    public double valeur(){
        return this.getOperande1().valeur()/this.getOperande2().valeur();
    }

    @Override
    public String toString(){
        return "("+getOperande1() + " / " + getOperande2() +")";
    }
}   
