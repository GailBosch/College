// -- Wk 8 - FileOutputStream2 --
//FileOutputStream: Write a string

import java.io.FileOutputStream;
public class FileOutputStreamExample
{  
    public static void main(String args[])
    {    
        try
        {    
            FileOutputStream fout=new FileOutputStream("out.txt");    
            String s="Welcome to Java";    
            byte b[]=s.getBytes(); // Converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
        }catch(Exception e){System.err.println(e);}    
    }    
}

// -- Wk 8 - FileOutputStream1 --
// FileOutputStream: Write a single byte
//import java.io.FileOutputStream;
//
//public class FileOutputStreamExample
//{  
//    public static void main(String args[])
//    {    
//        try
//        {    
//            FileOutputStream fout = new FileOutputStream("out.txt");    
//            fout.write(65);    
//            fout.close();    
//            System.out.println("success...");    
//         }catch(Exception e){System.err.println(e);}    
//    }    
//} 
