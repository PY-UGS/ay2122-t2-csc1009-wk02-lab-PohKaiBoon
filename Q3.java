
public class Q3 {
    
    public static void main (String args[])
    {


            
            long mili = System.currentTimeMillis();
            
            long seconds= mili/1000;
            int currentsecond= (int) seconds % 60;
            
            long minutes= seconds/60;
            int currentminute= (int) minutes % 60;
            
            float hours= minutes/60;
            int currenthour= (int) hours % 24; 
           
            System.out.println("Current time is "+currenthour+":"+ currentminute +":"+currentsecond+ " GMT");


        

    }

}
