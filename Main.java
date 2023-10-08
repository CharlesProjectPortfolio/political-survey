import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.lang.Integer;

class Main {
  public static void main(String[] args) {

    //Create the Survey questions file
    try {
      File survey = new File("SurveyQuestions.txt");
      if (survey.createNewFile()) {
        System.out.println("File name: " + survey.getName());
      } else {
        System.out.println("File aready exists.");
      }
    } catch (IOException e) {
        System.out.println("An error occured.");
        e.printStackTrace();
    }
    

    //Create the four file for political parties
    //Create file for Republican party
    try {
      File republican = new File("Republican.txt");//Initialize file
      if (republican.createNewFile()) {//Check if already exists
        System.out.println("File name: " + republican.getName());
      } else {
        System.out.println("File aready exists.");
      }
    } catch (IOException e) {//Catch error if thrown
        System.out.println("An error occured.");
        e.printStackTrace();
    }
    //Create file for Democrat party
    try {
      File democrat = new File("Democrat.txt");//Initialize file
      if (democrat.createNewFile()) {//Check if already exists
        System.out.println("File name: " + democrat.getName());
      } else {
        System.out.println("File aready exists.");
      }
    } catch (IOException e) {//catch error if thrown
        System.out.println("An error occured.");
        e.printStackTrace();
    }
    //Create file for Libertarian party
    try {
      File libertarian = new File("Libertarian.txt");//Initialize file
      if (libertarian.createNewFile()) {//Check if already exists
        System.out.println("File name: " + libertarian.getName());
      } else {
        System.out.println("File aready exists.");
      }
    } catch (IOException e) {//Catch error if thrown
        System.out.println("An error occured.");
        e.printStackTrace();
    }
    //Create file for Green party
    try {
      File green = new File("Green.txt");//Initialize file
      if (green.createNewFile()) {//Check if already exists
        System.out.println("File name: " + green.getName());
      } else {
        System.out.println("File aready exists.");
      }
    } catch (IOException e) {//Catch error if thrown
        System.out.println("An error occured.");
        e.printStackTrace();
    }

    //Create file to store weights for each answer
    try {
      File weight = new File("weights.txt");//Initialize file
      if (weight.createNewFile()) {//Check if already exists
        System.out.println("File name: " + weight.getName());
      } else {
        System.out.println("File aready exists.");
      }
    } catch (IOException e) {//Catch error if thrown
        System.out.println("An error occured.");
        e.printStackTrace();
    }

    
    //Write survey questions to survey file
    try {
    BufferedWriter myWriter = new BufferedWriter(new FileWriter("SurveyQuestions.txt"));
    myWriter.write("1:What should the government do to help the poor?");
    myWriter.newLine();
    myWriter.write("2:How should the government handle abortion rights?");
    myWriter.newLine();
    myWriter.write("3:How do you feel about the second amendment?");
    myWriter.newLine();
    myWriter.write("4:How involved should the government be in the regulation of businesses?");
    myWriter.newLine();
    myWriter.write("5:Does the government need to take a stronger stance on illegal immigration.");
    myWriter.newLine();
    myWriter.write("6:Should the government have the authority to set and uphold moral standards for its citizens?");
    myWriter.newLine();
    myWriter.write("7:Should the government have the authority to outlaw certain drugs or substances?");
    myWriter.newLine();
    myWriter.write("8:Should eminent domain be legal?");
    myWriter.newLine();
    myWriter.write("9:Should the U.S. continue to act as the world police?");
    myWriter.newLine();
    myWriter.write("10:Should African Americans receive reparations to right the wrongs of slavery?");
    myWriter.newLine();
    myWriter.write("11:Should health care be treated as a right?");
    myWriter.newLine();
    myWriter.write("12:What should the government do about the minimum wage?");
    myWriter.newLine();
    myWriter.write("13:Should there be federal protections for unions and their members?");
    myWriter.newLine();
    myWriter.write("14:Should the government be involved in negotiations between unions and companies?");
    myWriter.newLine();
    myWriter.write("15:Should there be government programs in place to help ensure equitable outcomes for all people?");
    myWriter.newLine();
    myWriter.write("16:Should the government be able to incur debt?");
    myWriter.newLine();
    myWriter.write("17:Who should make decisions about school curriculums?");
    myWriter.newLine();
    myWriter.write("18:Do taxes need to be increased on the wealthy?");
    myWriter.newLine();
    myWriter.write("19:How strongly should the right to private property be protected?");
    myWriter.newLine();
    myWriter.write("20:Which political party do you affiliate with?");
    myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }

    //Write Answers to republican party file
    try {
    BufferedWriter RmyWriter = new BufferedWriter(new FileWriter("Republican.txt"));
    RmyWriter.write("Nothing.");
    RmyWriter.newLine();
    RmyWriter.write("No exceptions ban.");
    RmyWriter.newLine();
    RmyWriter.write("I fully support the right to keep and bear arms.");
    RmyWriter.newLine();
    RmyWriter.write("Some regulation is necessary.");
    RmyWriter.newLine();
    RmyWriter.write("Yes, all illegal aliens need to be prevented from entering the country and if they are already here they should be deported.");
    RmyWriter.newLine();
    RmyWriter.write("Yes, a moral society is a just society");
    RmyWriter.newLine();
    RmyWriter.write("Yes, if it is deemed harmful to society.");
    RmyWriter.newLine();
    RmyWriter.write("Yes, but only under very strict circumstances.");
    RmyWriter.newLine();
    RmyWriter.write("Yes, As the strongest country it is our duty.");
    RmyWriter.newLine();
    RmyWriter.write("No, people who had nothing to do with it shouldn't be responsible for it.");
    RmyWriter.newLine();
    RmyWriter.write("No, that would only further incentivize people to rely on the government.");
    RmyWriter.newLine();
    RmyWriter.write("Keep it where it is currently at.");
    RmyWriter.newLine();
    RmyWriter.write("No, the government shouldn't get involved between companies and employees.");
    RmyWriter.newLine();
    RmyWriter.write("No, that's between the company and union.");
    RmyWriter.newLine();
    RmyWriter.write("No, everyone should get an equal opportunity, but there are no guaranteed outcomes.");
    RmyWriter.newLine();
    RmyWriter.write("Yes, but only if absolutely necessary.");
    RmyWriter.newLine();
    RmyWriter.write("States should set there own curriculums.");
    RmyWriter.newLine();
    RmyWriter.write("No, they will just leave the country, which will hurt the economy.");
    RmyWriter.newLine();
    RmyWriter.write("There is very little if any reason that the right to private property should be infringed upon.");
    RmyWriter.newLine();
    RmyWriter.write("Republican.");
    RmyWriter.close();
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }

    //Write Answers to Democrat party file
    try {
    BufferedWriter DmyWriter = new BufferedWriter(new FileWriter("Democrat.txt"));
    DmyWriter.write("Offer welfare programs.");
    DmyWriter.newLine();
    DmyWriter.write("Allow it up to the third trimester.");
    DmyWriter.newLine();
    DmyWriter.write("The second amendment wasn't written with today's guns in mind.");
    DmyWriter.newLine();
    DmyWriter.write("The government should put the people's needs above corporations.");
    DmyWriter.newLine();
    DmyWriter.write("If they are seeking political asylum then they should be fully welcomed.");
    DmyWriter.newLine();
    DmyWriter.write("No, People should be free to live as they please, as long as it doesn't infringe upon others.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, if it has been proven to be harmful to the individual.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, if the land is needed for public or government use.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, As long as there are still groups being oppressed.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, It will help put them on equal ground with other groups.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, Everyone has a right to healthcare.");
    DmyWriter.newLine();
    DmyWriter.write("Increase it to account for inflation.");
    DmyWriter.newLine();
    DmyWriter.write("Yes the government should protect unions.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, but only if a fair deal cannot be reached.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, but only if they were born at a disadvantage.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, there are government programs which have to be funded no matter what.");
    DmyWriter.newLine();
    DmyWriter.write("States should set their own curriculum but the federal government should be able to make changes if necessary.");
    DmyWriter.newLine();
    DmyWriter.write("Yes, they should have to pay their fair share just like everyone else.");
    DmyWriter.newLine();
    DmyWriter.write("Private property should be protected unless there is good reason for the public or government to have access to it.");
    DmyWriter.newLine();
    DmyWriter.write("Democrat.");
    DmyWriter.close();
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }

    //Write Answers to Green party file
    try {
    BufferedWriter GmyWriter = new BufferedWriter(new FileWriter("Green.txt"));
    GmyWriter.write("Anything that's necessary.");
    GmyWriter.newLine();
    GmyWriter.write("Abortion should be subsidized by the government.");
    GmyWriter.newLine();
    GmyWriter.write("The second amendment should be abolished.");
    GmyWriter.newLine();
    GmyWriter.write("Businesses should be heavily regulated.");
    GmyWriter.newLine();
    GmyWriter.write("All people seeking a better life should be welcomed.");
    GmyWriter.newLine();
    GmyWriter.write("Yes, the government is responsible for the fair and equal treatment of all people.");
    GmyWriter.newLine();
    GmyWriter.write("No, All drugs should be decriminalized.");
    GmyWriter.newLine();
    GmyWriter.write("Yes, any property that is being mismanaged or that is deemed useful to the public.");
    GmyWriter.newLine();
    GmyWriter.write("Yes, but we should rely on diplomacy not military strength.");
    GmyWriter.newLine();
    GmyWriter.write("Yes, they are owed a debt for all the wrongs they have faced in the past.");
    GmyWriter.newLine();
    GmyWriter.write("Yes, universal healthcare should be freely available to all.");
    GmyWriter.newLine();
    GmyWriter.write("Increase it so there is a minimum standard of living for all, no matter what job they have.");
    GmyWriter.newLine();
    GmyWriter.write("Yes, the government should always protect employees");
    GmyWriter.newLine();
    GmyWriter.write("Yes, it is the government's responsibility to make sure companies aren't taking advantage of workers.");
    GmyWriter.newLine();
    GmyWriter.write("Yes, the government should do whatever is necessary to ensure all people have a good life.");
    GmyWriter.newLine();
    GmyWriter.write("No, we should tax the wealthy to fill the gap between government spending and income.");
    GmyWriter.newLine();
    GmyWriter.write("The federal government should set the curriculum to ensure the accuracy of the subjects being taught.");
    GmyWriter.newLine();
    GmyWriter.write("Yes, the hoarding of wealth only hurts us all.");
    GmyWriter.newLine();
    GmyWriter.write("Private property should be respected and only seized if there is a public need for it.");
    GmyWriter.newLine();
    GmyWriter.write("Green.");
    GmyWriter.close();
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }

    //Write Answers to Libertarian party file
    try {
    BufferedWriter LmyWriter = new BufferedWriter(new FileWriter("Libertarian.txt"));
    LmyWriter.write("Create programs to give them jobs not money.");
    LmyWriter.newLine();
    LmyWriter.write("There should be exceptions for rape and incest.");
    LmyWriter.newLine();
    LmyWriter.write("The government has no right banning any weapon.");
    LmyWriter.newLine();
    LmyWriter.write("The free market should be the only regulation.");
    LmyWriter.newLine();
    LmyWriter.write("Some regulation is necessary to prevent criminals and terrorists from entering the country.");
    LmyWriter.newLine();
    LmyWriter.write("No, The government doesn't have the authority to set moral standards.");
    LmyWriter.newLine();
    LmyWriter.write("No, People have the right to decide what they choose to consume.");
    LmyWriter.newLine();
    LmyWriter.write("No, the government never has the right to seize private property.");
    LmyWriter.newLine();
    LmyWriter.write("No, we should only get involved if there is a direct threat to us.");
    LmyWriter.newLine();
    LmyWriter.write("No, While slavery was wrong, people should not be responsible for the  indiscretions of their ancestors.");
    LmyWriter.newLine();
    LmyWriter.write("No, healthcare should be left to the free market with no government involvement.");
    LmyWriter.newLine();
    LmyWriter.write("There should be no minimum wage, the free market will determine the value of labor.");
    LmyWriter.newLine();
    LmyWriter.write("No, the government has no right to get involved in private matters.");
    LmyWriter.newLine();
    LmyWriter.write("No, the government should never get involved in a private business dispute.");
    LmyWriter.newLine();
    LmyWriter.write("No, life is what you make of it.");
    LmyWriter.newLine();
    LmyWriter.write("No, it is unfair to leave future generations saddled with debt.");
    LmyWriter.newLine();
    LmyWriter.write("States should set the curriculums with input from local governments.");
    LmyWriter.newLine();
    LmyWriter.write("No, taxation is theft.");
    LmyWriter.newLine();
    LmyWriter.write("The right to private property should under no circumstance be infringed upon.");
    LmyWriter.newLine();
    LmyWriter.write("Libertarian.");
    LmyWriter.close();
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }

    //Write weights to weight file
    try {
    BufferedWriter WmyWriter = new BufferedWriter(new FileWriter("weights.txt"));
    WmyWriter.write("A{5,0,0,0} B{0,5,3,1} C{0,2,5,0} D{3,2,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,0,2} B{2,5,3,2} C{0,2,5,0} D{3,1,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,2,0,5} B{1,5,3,0} C{0,2,5,0} D{4,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,3,1,2} B{2,5,4,3} C{1,3,5,0} D{2,1,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,1,0,2} B{2,5,3,3} C{1,3,5,3} D{2,3,1,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,2,0} B{1,5,1,3} C{2,1,5,0} D{0,2,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,2,0,0} B{3,5,0,0} C{0,1,5,4} D{0,1,3,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,3,2,0} B{3,5,2,0} C{1,2,5,0} D{1,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,3,1,0} B{2,5,3,0} C{1,2,5,0} D{1,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,0,4} B{0,5,4,0} C{0,4,5,0} D{4,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,0,4} B{0,5,4,0} C{0,4,5,0} D{4,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,0,0} B{1,5,3,0} C{0,3,5,0} D{2,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,0,4} B{0,5,3,0} C{0,3,5,0} D{4,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,0,4} B{0,5,3,0} C{0,4,5,0} D{4,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,1,0,2} B{0,5,3,0} C{0,2,5,0} D{4,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,2,0,0} B{2,5,0,0} C{0,0,5,0} D{0,0,3,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,4,0,3} B{2,5,1,1} C{0,1,5,0} D{4,2,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,0,4} B{0,5,4,0} C{0,4,5,0} D{4,0,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,3,2,4} B{2,5,3,0} C{0,2,5,0} D{4,2,0,5}");
    WmyWriter.newLine();
    WmyWriter.write("A{5,0,0,0} B{0,5,0,0} C{0,0,5,0} D{0,0,0,5}");
    WmyWriter.close();
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }

    //Array to store parties and keep them in order
    String[] party = {"Republican", "Democrat", "Green", "Libertarian"};
    int[] totals = {0, 0, 0, 0};//Array to hold total weights for each party
    int tracker = 0;// variable to track number of questions
    //Read survey questions file
    try {
      //Create variables to access files
      File objct = new File("SurveyQuestions.txt");
      File Robjct = new File("Republican.txt");
      File Dobjct = new File("Democrat.txt");
      File Gobjct = new File("Green.txt");
      File Lobjct = new File("Libertarian.txt");
      File Wobjct = new File("weights.txt");
      //Create Scanner variables to read files
      Scanner myReader = new Scanner(objct);
      Scanner RmyReader = new Scanner(Robjct);
      Scanner DmyReader = new Scanner(Dobjct);
      Scanner GmyReader = new Scanner(Gobjct);
      Scanner LmyReader = new Scanner(Lobjct);
      Scanner WmyReader = new Scanner(Wobjct);
      //Loop to read all lines in the files
      while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      String Ranswer = RmyReader.nextLine();
      String Danswer = DmyReader.nextLine();
      String Ganswer = GmyReader.nextLine();
      String Lanswer = LmyReader.nextLine();
      String Wanswer = WmyReader.nextLine();

      //Initialize random number generator
      Random rand = new Random();
      //First random number
      int rand1 = rand.nextInt(4);
      //Second random number
      int rand2 = rand.nextInt(4);
      //Make sure rand2 != rand1
      while (rand2 == rand1) {
        rand2 = rand.nextInt(4);
      }
      //Third random number
      int rand3 = rand.nextInt(4);
      //Make sure rand3 != rand2 or rand1
      while (rand3 == rand2 || rand3 == rand1) {
        rand3 = rand.nextInt(4);
      }
      //Fourth random number
      int rand4 = rand.nextInt(4);
      //Make sure rand4 != rand1, rand2, or rand3
      while (rand4 == rand3 || rand4 == rand2 || rand4 == rand1) {
        rand4 = rand.nextInt(4);
      }
        
      //Create string array to hold random order
      String[] randAns = new String[4];
      //Create string array for tracking answers
      String[] trackAns = new String[4];

      //Put answers into randAns array
      randAns[rand1] = Ranswer;
      randAns[rand2] = Danswer;
      randAns[rand3] = Ganswer;
      randAns[rand4] = Lanswer;

      //Put answer keys into trackAns
      trackAns[rand1] = "A";
      trackAns[rand2] = "B";
      trackAns[rand3] = "C";
      trackAns[rand4] = "D";

      //Print statement to display the questions and answer choices
      System.out.println(data);
      for (int i = 0; i < randAns.length; i++) {
        if (i == 0) {
          System.out.println("A: " +randAns[i]);
        } else if (i == 1) {
          System.out.println("B: " +randAns[i]);
        } else if (i == 2) {
          System.out.println("C: " +randAns[i]);
        } else if (i == 3) {
          System.out.println("D: " +randAns[i]);
        }
      }
      System.out.println();


      //Get the user input
      Scanner myObject = new Scanner(System.in);//Create scanner object
      System.out.println("Enter answer: A, B, C, D");//Output prompt for user
      String ans = myObject.nextLine();//Store user input in string
      //Loop to make sure the user inputs a valid answer
      while (!ans.equals("A") && !ans.equals("B") && !ans.equals("C") && !ans.equals("D")) {
        System.out.println("Invalid input please enter A, B, C, D");
        myObject = new Scanner(System.in);
        ans = myObject.nextLine();
      }
      System.out.println();
      //StringBuilder variable to access the correct answer and associated weights in the weights file
      StringBuilder sb = new StringBuilder(Wanswer);
      
      //Get position in track array from user answer
      int startIndex = 0, endIndex = 0;
      if (ans.equals("A")) {
      startIndex = sb.indexOf(trackAns[0]) + 2;//Get starting index
      endIndex = sb.indexOf("}", startIndex);//Get ending index
      } else if (ans.equals("B")) {
      startIndex = sb.indexOf(trackAns[1]) + 2;//Get starting index
      endIndex = sb.indexOf("}", startIndex);//Get ending index
      } else if (ans.equals("C")) {
      startIndex = sb.indexOf(trackAns[2]) + 2;//Get starting index
      endIndex = sb.indexOf("}", startIndex);//Get ending index
      } else if (ans.equals("D")) {
      startIndex = sb.indexOf(trackAns[3]) + 2;//Get starting index
      endIndex = sb.indexOf("}", startIndex);//Get ending index
      }
        
      //Create a substring with the correct weights
      String correctWeights = sb.substring(startIndex, endIndex);
      int counter = 0;//Counter variable for totals array
      //Loop to move through the string and add the correct weight to the totals array
      for (int i = 0; i < correctWeights.length(); i++) {
        char temp = correctWeights.charAt(i);//Convert string to char
        //Statement to test whether char is a number
        if (!Character.valueOf(temp).equals(Character.valueOf(','))) {
          //Convert char to integer for totals array
          int ascii = Integer.parseInt(String.valueOf(temp));
          //Add char to correct location in totals array
          totals[counter] += ascii;
          counter += 1;//Increase counter variable 
        }
      }

      int tempVar = 0;//Variable to get index for party
      int test = totals[0];//Variable to test for max value
      //Loop to find max value in totals array
      for (int i = 0; i < totals.length; i++) {
        if (test < totals[i]) {//Check if test is < value of totals of i
          tempVar = i;//Change index to i
          test = totals[i];//Change test to value at totals of i
        }
      }
      if (tracker == 4 || tracker == 9 || tracker == 14 || tracker ==19) {
        System.out.println(party[tempVar]);
        System.out.println();
      }
        
      tracker += 1;
      }
      //Close all files
      myReader.close();
      RmyReader.close();
      DmyReader.close();
      GmyReader.close();
      LmyReader.close();
      
    } catch (FileNotFoundException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }
      
  }
}