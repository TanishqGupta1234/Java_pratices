package Enum;

public class Basic {
    enum Week {
        Monday, tuesday, wednesday, thursday, friday 

      // enum constants
      //public , static, finals
      // since its final you cant create child enums
      // type is weak
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

       for(Week day : Week.values())
       {
        System.out.println(day);
       } 

    }
    
}
