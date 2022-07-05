package systembus;



public class captain {
    
 String username;
  public String useremail;
  public int age; 
  public int id;
  public String adress;
  
    public captain() {
        }    
  public captain(String username, String usermail, int age, String adress)
    {
        this.username=username;
        this.useremail=usermail;
        this.age = age;
        this.adress=adress;
       
        }
  
  public void setusername(String name)
  {
         username=name;
     }
  
   public void setuseremail(String mail)
   {
         useremail=mail;
     }
  
   public void  setage(int Age)
    {
        age=Age;
     } 
   
      public void setadress(String Adress){
         adress=Adress;
     }
      public String getusername(){
          return username;
      }
       public String getuseremail(){
          return useremail;
      }
        public int getage(){
          return age;
      }
        
          public String getadress(){
          return adress;
      }
          
          
       
              
    }
    
     
   
   
 
 
    




