package utilities;

import java.util.Random;

public class FakerUtility 
{
	public static int randomNuberGenerator()
	{
		Random rand= new Random();
		int randomNumber = rand.nextInt(100000);
		return randomNumber;
	}
}
