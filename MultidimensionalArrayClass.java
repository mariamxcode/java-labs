import java.util.Arrays;
public class MultidimensionalArrayClass{

	public static void main(String [] args){

		/**

		String [] names = {"Motun", "Johnson", "Mariam", "Akachukwu"};

		for(int index = 0; index < names.length; index++){
			System.out.println(names[index]);

			for (int innerIndex= 0; innerIndex < names[index].length(); innerIndex++){
				System.out.println(names[index].charAt(innerIndex));
				
			}
		}
		*/

		int [] [] agesOfCohorts = new int [3] [2];

			agesOfCohorts [0][0] =1;
			agesOfCohorts [0][1] =2;
			agesOfCohorts [1][0] =3;
			agesOfCohorts [1][1] =4;
			agesOfCohorts [2][0] =5;
			agesOfCohorts [2][1] =6;

		for(int index = 0; index < agesOfCohorts.length; index++ ){

			for (int innerIndex= 0; innerIndex < agesOfCohorts[index].length; innerIndex++){
				System.out.println(agesOfCohorts[index][innerIndex]);
				
			}


		}

		for(int [] ages: agesOfCohorts){

			for (int age : ages){
				System.out.println(age);

			}


		}


		System.out.println(Arrays.deepToString(agesOfCohorts));
			

		

		
		














	}

}
