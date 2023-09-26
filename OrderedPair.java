//Arthur Walker, September 26, 2023, Problem Set 2B
public class OrderedPair
{
   double X, Y;
   
   public OrderedPair(){
       X = 0;
       Y = 0;
   }
   
   public OrderedPair(double x, double y){
       X = x;
   }
   
   public String toString(){
       return +X+", "+Y;
   }
   
   public double getX(){
       return X;
   }
   
   public double getY(){
       return Y;
   }
}
