import java.util.Scanner;  
public class SpyNumberExample2  
{  
//method to check the Spy number  
private static boolean isSpyNumber(int number)   
{  
int lastDigit = 0;  
int sum = 0;  
int product = 1;  
//executes until the condition returns true  
while(number != 0)   
{  
