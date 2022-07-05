
package systembus;
public class bus extends captain {
    public int numberofbus;
    public int seatofbus;
   public String rout_start;
    public String rout_end;
    public double price;
    
    public bus() {
    }
    public bus(String username, String usermail, int age, String adress,int numberofbus, int seatofbus,double price,String rout_start,String rout_end) {
   super(username,usermail,age,adress);
   this.numberofbus = numberofbus;
   this.seatofbus = seatofbus;
   this.price=price;  
   this.rout_start=rout_start;
   this.rout_end=rout_end;
    
    }
    public int getnumberofbus(){
        return numberofbus;
    }
    
    
    public int getseatofbus(){
        return seatofbus;
    }
    
    public String getdriver(){
    return username;
}
    
    public String tostring(String s1)
    {
    
       String result;
        result="\nplate bus : "+numberofbus+"\n" +"capacity:"+seatofbus+ "\n"+
              "name of captain :  "+username;
              return result;  
    }
    }
