package ControlFlow_1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
//	System.out.println("Hello World!");
	AsciiChars.printNumbers();
	AsciiChars.printUpperCaseLetters();
	AsciiChars.printLowerCaseLetters();
	userInput();
//	interactivePortion();
//	lotteryNumbers();
}

	private static void userInput() {
		// TODO Auto-generated method stub
		ArrayList<Main> answerList = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String firstName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName);// %s - formats strings

        System.out.println("Would you wish to continue? Enter yes or no.");
        String interestedAnswer = input.nextLine(); 
        String repeat = "yes";  // to respond whenever "yes" is chosen

        // if statement/while loop
        if(interestedAnswer.equals("yes")) {
            while(repeat.equals("yes")) {
                
            	// input for Strings .nextLine()
                System.out.println("Do you have a red car? Yes or No");
                String redCar = input.nextLine();
                
                System.out.println("What is the name of your favorite pet?");
                String namePet = input.nextLine();
                
                System.out.println("What is the first name of the your favorite actor or actress?");
                String favAct = input.nextLine();

                // input1 for Integers .nextInt()
                System.out.println("What is the age of your favorite pet?");
                int agePet = input1.nextInt();

                System.out.println("What is your lucky number?");
                int luckyNum = input1.nextInt();

                System.out.println("Do you have a favorite quarterback and/or athelete? If so what is the jersey number");
                int favQuarterback = input1.nextInt();

                System.out.println("What is the two-digit model year of your car?");
                int carYear = input1.nextInt();

                System.out.println("Enter a random number between 1 and 50.");
                int ranNum = input1.nextInt();

                // Lottery Numbers
				int num1_random = (int) (Math.random() * 65);
				int num2_random = (int) (Math.random() * 65);
				int num3_random = (int) (Math.random() * 2);
		
				// Magic Ball
				int mBall = 0;
				if(num3_random == 1) {	
					mBall = luckyNum * num1_random;	// lucky number * num1 or num2
				} 
				else {
					mBall = favQuarterback * num1_random;		// favorite quarter back * num1 or num2
				}
				if(mBall > 75) {
					mBall -= 75;		// if max "magic" number is > than 75, then subtract 75 from the value to make it the "magic ball" number
				}

                // Generate Values: 5 non-magic numbers
				int lottoNum1 = carYear + luckyNum;					// 1 modelYear + LuckyNum;
				int lottoNum2 = favQuarterback + luckyNum;			// 2 favQuarterback + LuckyNum;	
				int lottoNum3 = 42;									// 3 42;	
				int lottoNum4 = agePet + carYear;					// 4 ageOfPet + carYear;	
				int lottoNum5 = favQuarterback + agePet + luckyNum;	// 5 favQuarterback + ageOPet + luckyNum;	
		
				// "Print out the numbers"
				//Once all the numbers have been calculated, print them out in this form:

    			//   Lottery numbers: 1, 2, 3, 4, 5  Magic Ball: mBall
				System.out.println("Lottery Numbers: " + lottoNum1 + ", " + lottoNum2 + ", " + lottoNum3 + ", " + lottoNum4 + ", " + lottoNum5 + " " + " Magic Ball: " + mBall);
				
				
				// To repeat.nextLine();
				repeat = input.nextLine();


			// End of while loop
			}
			// End of if Statement
		}
		else {
			System.out.println("Thank you for your input. Please return later to complete the survey.");
			System.exit(0);
		};
		
		// Ask to replay or not
		// HashMap<>			// continue in userInput or public static void main(String[] args) {   shown above for step 0:
		HashMap<String, String> continueAnswer = new HashMap();
				
		// Answer list
		continueAnswer.put("Yes", firstName);
		continueAnswer.put("YES", firstName);
		continueAnswer.put("Y", firstName);
		continueAnswer.put("yes", firstName);
		continueAnswer.put("y", firstName);
		
		// Scanner
		Scanner replayInput = new Scanner(System.in);
		System.out.println("Would you wish to continue?");
		String interestedAnswer1 = replayInput.nextLine();       // nextLine() is for strings

		// if/else statement
		if (continueAnswer.containsKey(interestedAnswer1)){			// containsKey() {Key:Value}
		    System.out.println("Great! Let's continue.");
		    
//		    for (int i = 0; i<answerList.size(); i++) {
//		    	Main mainI = answerList.get(i);
//		    	System.out.println("Replay" + answerList[i]);
//		    	System.out.println(answerList);
//				System.out.println(mainI);		    	
//	            String a = input.nextLine();
//	            this.arrayList.add(i, a);
//	            int b = input1.nextInt();
//	            this.arrayList.add(i, a);

//	        }
		}
		
		else {
		    System.out.println("Thank you for your input. Please return later to complete the survey.");
		    System.exit(0);
		};
	
	// End of userInput()
	}

// End of Main class
}
