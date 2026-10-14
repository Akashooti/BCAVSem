public class Nagative ArraySizeExceptionExample
{
public static void main(Sting[]args)
{
try
{
int[] array=new int[-5];
}
catch(NegativeArraySizeException nase)
{
nase.printStackTrace();
}
System.out.println("Continuing execution...");
}
}