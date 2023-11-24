class PersonTest
{ 
    public static void main (String[] args)
    {
        // Accessing the static method name() and field by class name itself. 
        Person.setName("Joe");  
        System.out.println(Person.name); 
         
        // Accessing the static method name() by using Object's reference. 
        Person obj = new Person(); 
        //obj.setName("Susan"); 
        System.out.println(obj.name);   
    } 
}