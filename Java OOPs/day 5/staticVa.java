
class staticvar{
    static String SchoolName="sai mahavidyalay";
    static int count;

    staticvar(){
        System.out.println("default constructor");
        count++;
    };

    staticvar(String SchoolName){
        System.out.println("1 para consructor");
        this.SchoolName=SchoolName;
        count++;
    }
   static void display(String name){
     SchoolName="Apna Collage";
  }

}

public class staticVa {
    public static void main(String [] args){
    staticvar s1=new staticvar("sai junior school");
    System.out.println(s1.SchoolName);

    staticvar s2=new staticvar();
    System.out.println(s2.SchoolName);

    staticvar s3=new staticvar();
    staticvar.display("Swaminarayan");
    System.out.println(s3.SchoolName);
    
    System.out.println(staticvar.count);
    System.out.println(staticvar.SchoolName);
    }
}
