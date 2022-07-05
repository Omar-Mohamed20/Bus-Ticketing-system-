
package systembus;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class booking extends bus {
    public  int boardingpass;
    
    public String booking_date_and_time;

    public  int num_of_ticket;
    
    
    public int numberofseat;
    
   public booking(String username, String usermail, int age,  String adress,int numberofbus, int seatofbus, double price,String rout_start,String rout_end){
        super(username,usermail,age,adress,numberofbus,seatofbus,price,rout_start,rout_end);
          DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
     Calendar cal = Calendar.getInstance();
     booking_date_and_time=df.format(cal.getTime());   
   }

    public int getNumberofseat() {
        return numberofseat;
    }

    public void setNumberofseat(int numberofseat) {
        this.numberofseat =numberofseat;
    }
   
    
    public String get_date_and_time(){
        return booking_date_and_time;
    }
    
    
 
   public int add_ticket(){
       
    
        Random random = new Random();    
       return boardingpass = random.nextInt(100);
    
    }    
    
    public int  boardingpass(){
        
        return boardingpass;
        
    }
    
    
    
      public double getprice()
    {
        
        return price;
    }
      public int totalnumofseat(int x)
      {
         seatofbus=seatofbus-x;
          return seatofbus;
      }
      
      
    @Override
      public String tostring(String s1){
      
          String result;
        result="\nplate bus : "+numberofbus+"\n"+"capacity:"+ seatofbus + "\n"+
              "name of captain :"+username +"\nfrom :"+rout_start +" to "+rout_end +"\nprice :"+price;
              return result;
      }
}