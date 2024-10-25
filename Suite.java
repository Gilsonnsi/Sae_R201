import java.util.Scanner;
public class Suite extends Operation{
  public Suite(Expression operande1, Expression operande2){
      super(operande1,operande2);
  }
  public double valeur(){
    return this.getOperande1().valeur()*this.getOperande2().valeur();
}
        
        public double suite() {
          Scanner sc = new Scanner(System.in);
          System.out.println("Valeur de u0");
          int u = sc.nextInt();
          return u + this.getOperande1().valeur()*this.getOperande2().valeur();
    }
}