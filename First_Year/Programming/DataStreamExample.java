// -- Wk 8 - DataStreamExample2 --
// FileInputStream: Read all bytes

import java.io.FileInputStream;
  
public class DataStreamExample
{  
    public static void main(String args[])
    {    
        try
        {    
            FileInputStream fin = new FileInputStream("out.txt");    
            int i=0;    
            while((i=fin.read())!=-1)
            {    
                System.out.print((char)i);    
            }    
            fin.close();    
            }catch(Exception e){System.err.println(e);}    
      }    
} 

// -- Wk 8 - DataStreamExample1 --
//// FileInputStream: Read a single byte
//
//import java.io.FileInputStream;
// 
//public class DataStreamExample
//{  
//    public static void main(String args[])
//    {    
//        try
//        {    
//            FileInputStream fin = new  FileInputStream("out.txt");    
//            int i = fin.read();  
//            System.out.println((char)i);    
//            fin.close();    
//         }catch(Exception e){System.err.println(e);}    
//    }    
//} 