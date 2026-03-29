import java.util.*;

//parent
class cricketer {
    String PlayerName;
    String country;
    int TotalMatches;
 
  
    cricketer(String PlayerName, String country, int TotalMatches) {
        System.out.println("parent class");
        this.PlayerName = PlayerName; //null
        this.country = country;      //null
        this.TotalMatches = TotalMatches; //0
    }
}


//child 1
class batsman extends cricketer {
    int Totalrun;

     batsman(int totalrun, String PlayerName, String country, int TotalMatches) {
        super(PlayerName, country, TotalMatches);
        this.Totalrun = totalrun;
    }

   void playerinfo() {
        System.out.println("\nPlayer Name : " + this.PlayerName + "\nCountry : " + this.country + "\ntotal matches : "
                + this.TotalMatches+"\nTotal Run : "+this.Totalrun);
    }

};

//child 2
class bowler extends cricketer{
     int TotalWicket;

      bowler(int TotalWicket, String PlayerName, String country, int TotalMatches) {
        super(PlayerName, country, TotalMatches);
        this.TotalWicket = TotalWicket;
    }

   void playerinfo() {
        System.out.println("\nPlayer Name : " + this.PlayerName + "\nCountry : " + this.country + "\ntotal matches : "
                + this.TotalMatches+"\nTotal wickets : "+this.TotalWicket);
    }
}

public class Homework {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        batsman sachin= new batsman(2200,"Sachin", "india", 100);
        sachin.playerinfo();

        bowler Ravindra= new bowler(500, "Ravindra jadeja", "india", 200);
        Ravindra.playerinfo();
    }
}