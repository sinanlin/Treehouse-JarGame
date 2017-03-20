import java.util.Random;
public class Jar {
  private static String item;
  private static int number;

    public Jar(){
      this.item = "";
      this.number = 0;

    }
    public Jar(String item, int number){
      this.item = item;
      this.number = number;
      
    }

    public static String getJarItem(){
        return item;
    }

    public int getJarNumber(){
      return number;
    }

    public int randomJarNum(int maxInt){
        Random random = new Random();
        int someNumber = random.nextInt(maxInt);
        return someNumber;
    }


}
