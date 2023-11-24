// What is the problem with this code?
// Compiler Error - Test.java:4:variable number might not have been initialized age = age + 7;

public class Test 
{
   public void pupAge(int age) 
   {
      age = age + 7;
      System.out.println("Puppy age is : " + age);
   }

   public static void main(String[] args) 
   {
      Test test = new Test();
      test.pupAge(7);
   }
}