//This program takes inputed data (Name, Age, Weight, Height) and calculates your BMI.
//Then, it outputs the average of the groups age, weight, height and BMI.
package Project1;
import java.util.Scanner;
public class J21_BrianHockenjos_HW_BMI{
//Declaring variables 
	private double weight, age, height, BMI;
	private String name;
//Constructor
	public J21_BrianHockenjos_HW_BMI() {
		weight = 0;
		age = 0;
		height = 0;
		BMI = 0;
		name = " ";
	}
//Sets the weight
		public void setWeight(double newWeight){ 
            this.weight = newWeight; 
			} 
//Sets the age
			public void setAge(double newAge){
				this.age = newAge;
				}
//Sets the height
				public void setHeight(double newHeight){
					this.height = newHeight;
					}
//Sets the name
					public void setName(String newName){
						this.name = newName;
						}
//Sets the BMI
						public void setBMI(double newBMI) {
							BMI = newBMI;
						}
//Returns the weight
		public double getWeight(){
			return weight;
			}
//Returns the age
			public double getAge(){
				return age;
				}
//Returns the height
				public double getHeight(){
					return height;
					}
//Returns the BMI
					public double getBMI() {
						return BMI;
					}
//Returns the name
						public String getName(){
							return name;
							}
//Checks if person i is under-weight or not
							public static double getUnderWeight(J21_BrianHockenjos_HW_BMI myBMI[]) {
								double underweight = 0;
								for(int i = 0; i < myBMI.length; i++){
									if(myBMI[i].getBMI() >= 0 && myBMI[i].getBMI() <= 18.5){
										underweight++;
										}
									}
										return underweight;
								}
//Checks if person i is healthy or not
								public static double getHealthy(J21_BrianHockenjos_HW_BMI myBMI[]) {
									double healthy = 0;
									for(int i = 0; i < myBMI.length; i++){
										if(myBMI[i].getBMI() >= 18.5 && myBMI[i].getBMI() < 25){
											healthy++;
											}
										}
										return healthy;
									}
//Checks if person i is overweight or not
									public static double getOverWeight(J21_BrianHockenjos_HW_BMI myBMI[]) {
										double overWeight = 0;
										for(int i = 0; i < myBMI.length; i++){
											if(myBMI[i].getBMI() >= 25 && myBMI[i].getBMI() < 30){
												overWeight++;
												}
											}
											return overWeight;
										}
//Checks if person i is obese or not
										public static double getObese(J21_BrianHockenjos_HW_BMI myBMI[]) {
											double obese = 0;
											for(int i = 0; i < myBMI.length; i++){
												if(myBMI[i].getBMI() >= 30){
													obese++;
													}
												}
												return obese;
											}
//Used to return the average weight of the group
		public static double getAvgWeight(J21_BrianHockenjos_HW_BMI[] myBMI){
			int totalWeight = 0;
			for(int i = 0; i < myBMI.length; i++){
				totalWeight += myBMI[i].getWeight();
				}
				double avgWeight = (totalWeight / myBMI.length);
					return avgWeight;
			}
//Used to return the average age of the group
			public static double getAvgAge(J21_BrianHockenjos_HW_BMI myBMI[]){
				int totalAge = 0;
				for(int i = 0; i < myBMI.length; i++){
					totalAge += myBMI[i].getAge();
					}
					double avgAge = (totalAge / myBMI.length);
						return avgAge;
				}
//Used to return the average height of the group
				public static double getAvgHeight(J21_BrianHockenjos_HW_BMI myBMI[]){
					int totalHeight = 0;
					for(int i = 0; i < myBMI.length; i++){
						totalHeight += myBMI[i].getHeight();
						}
						double avgHeight = (totalHeight / myBMI.length);
							return avgHeight;
					}
//Used to return the average BMI of the group
					public static double getAvgBMI(J21_BrianHockenjos_HW_BMI myBMI[]){
						int totalBMI = 0;
						for(int i = 0; i < myBMI.length; i++){
							totalBMI += myBMI[i].getBMI();
							}
							double avgBMI = (totalBMI / myBMI.length);
								return avgBMI;
						}
//writeOutput method.
		public static void writeOutput(J21_BrianHockenjos_HW_BMI myBMI[]){
			System.out.println("Average Age: " + J21_BrianHockenjos_HW_BMI.getAvgAge(myBMI));
			System.out.println("Average Weight: " + J21_BrianHockenjos_HW_BMI.getAvgWeight(myBMI));
			System.out.println("Average Height: " + J21_BrianHockenjos_HW_BMI.getAvgHeight(myBMI));
			System.out.println("Average BMI: " + J21_BrianHockenjos_HW_BMI.getAvgBMI(myBMI));
			System.out.println(J21_BrianHockenjos_HW_BMI.getObese(myBMI) + " of you were obese.");
			System.out.println(J21_BrianHockenjos_HW_BMI.getOverWeight(myBMI) + " of you were overweight.");
			System.out.println(J21_BrianHockenjos_HW_BMI.getHealthy(myBMI) + " of you were healthy.");
			System.out.println(J21_BrianHockenjos_HW_BMI.getUnderWeight(myBMI) + " of you were underweight.");
			}
//Start of main method.
		public static void main(String args[]){
			System.out.println("Enter the number of people you will be inputting.");
			Scanner keyboard = new Scanner(System.in);
			double nage, nweight, nheight;
			int size = 0;
		    try{   
		        String str = keyboard.next();  
		        size =  Integer.parseInt(str);               
		        }  
		        catch(Exception e) {  
		            System.out.println("Please use a whole number next time.");               
		            }
//Creating my Array.
			J21_BrianHockenjos_HW_BMI[] myBMI = new J21_BrianHockenjos_HW_BMI[size];
			for(int i = 0; i < myBMI.length; i++){
				double nbmi = 0;
				Scanner k = new Scanner(System.in);
				System.out.println("Input a name");
					String nName = k.nextLine();
						
				System.out.println("Input an age");
					nage = k.nextDouble();
						
				System.out.println("Input a weight");
					nweight = k.nextDouble();
						
				System.out.println("Enter a height");
					nheight = k.nextDouble();
					double totalHeight = (nheight * nheight);
					nbmi = ((nweight / (totalHeight))* 703);
//Initializing my array.
					myBMI[i] = new J21_BrianHockenjos_HW_BMI();
//Where I set my parameters.
					myBMI[i].setBMI(nbmi);
					myBMI[i].setName(nName);
					myBMI[i].setAge(nage);
					myBMI[i].setWeight(nweight);
					myBMI[i].setHeight(nheight);
				}
//Where I output each person that was inputed and their respective information.
			for(int i = 0; i < myBMI.length; i++){
				System.out.println("Your name was: " + myBMI[i].getName());
				System.out.println("Your age is: " + myBMI[i].getAge());
				System.out.println("Your weight is: " + myBMI[i].getWeight());
				System.out.println("Your Height is: " + myBMI[i].getHeight());
				System.out.println("Your BMI was: " + myBMI[i].getBMI());
				}
//Calling on my writeOutput method.
			J21_BrianHockenjos_HW_BMI.writeOutput(myBMI);		
			}
		
}
