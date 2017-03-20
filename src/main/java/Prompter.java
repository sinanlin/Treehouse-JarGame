import java.util.Scanner;

public class Prompter {

    private Jar jar;
    //Take in value
    Scanner scanner = new Scanner(System.in);

    public void Play(){

    System.out.print("What type of item:  ");
    String item = scannString();
    System.out.print("Maximum number of" + item + " in the jar :  ");
    int number = scannInt();
    //Store the value
    jar = new Jar(item,number);

    //Initialise the maxInt ;
    int maxNumber = jar.randomJarNum(number);
    System.out.print(maxNumber + "\n");
    //Check the stored value

    String mItem = jar.getJarItem();
    int mNumber = jar.getJarNumber();


    //show the maximum possible number of items
    System.out.printf("The maximum number of " + mItem + " in the jar: "+ mNumber + "\n");
    System.out.printf("Your goal is to guess how many " + mItem + " are in the jar. "
    +   "Your guess should be between 0 and " + mNumber + "\n");

    //prompted to guess the number of item
    System.out.print("Guess:  ");
    int guessNumber = scannInt();
    guess(maxNumber,guessNumber);


  }

  public String scannString(){
    String item = scanner.nextLine();
    return item;
  }

  public int scannInt(){
    int number = scanner.nextInt();
    return number;
  }

  public void guess(int maxnumber,int number){
    int count = 1;
    while(maxnumber!=number){
      System.out.print("Guess:  ");
      number = scannInt();
      count ++;
    }
    System.out.print("Congratulations - you guess that there are  "+ number + " in the jar!"
    +" It took you " + count + " guess(es) to get it right.\n");
  }

}
