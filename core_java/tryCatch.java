
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}
class TestCustomException{
    int age;
    TestCustomException(int age){
        this.age=age;
    }
    public void checkAge() throws CustomException{
        if(age<18){
            throw new CustomException("Age must be 18 or above.");
        } else{
            System.out.println("Age is valid.");
        }
    }
}
class ThrowsKeyword{
    String fileName;
    ThrowsKeyword(String fileName){
        this.fileName=fileName;
    }
    public void readFile() throws FileNotFoundException{
        try{
            FileReader fr = new FileReader(fileName);
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);  // convert int to char
            }
            fr.close();
        } catch(FileNotFoundException e){
            System.out.println("FileNotFoundException Caught:"+e);
        } catch(Exception e){
            System.out.println("Exception Caught:"+e);
        }
    }

}
class ThrowKeyword{
    ThrowKeyword(int age){
        try{
            System.out.println("Throw Keyword");
            if(age < 18){
                throw new ArithmeticException("Age must be 18 or above.");
            }
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException Caught:" + e);
        } catch(Exception e){
            System.out.println("Exception Occured:"+e);
        } finally{
            System.out.println("DB Cleanup done...");
        }
    }
}
class NestedTryCatch{
    NestedTryCatch() {
        try {
            try {
                int[] a = new int[3];
                a[5] = 100;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }

            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
class MultipleTryCatch{
    String str;
    MultipleTryCatch(String str){
        System.out.println("MultipleTryCatch");
        try{
            this.str=str;
            System.out.println(str.charAt(0)); // NullPointer Exception
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException Caught:"+e.getMessage());
        } catch(NullPointerException e){
            System.out.println("NullPointerException Caught:"+e.getMessage());
        } catch(Exception e){
            System.out.println("Exception Occured:"+e);
        }
        finally{
            System.out.println("finally block");
        }
    }
}
class BasicTryCatch{
    BasicTryCatch(){
        System.out.println("BasicTryCatch");
        try{
            int result = 10/0; 
        } catch(Exception e){
            System.out.println("Exception Caught:"+e);
        } finally{
            System.out.println("finally block");
        }
    }
}
public class tryCatch {
    public static void main(String[] args){
        // BasicTryCatch basicTryCatch = new BasicTryCatch();
        // MultipleTryCatch multipleTryCatch1 = new MultipleTryCatch("");
        // NestedTryCatch nestedtrycatch = new NestedTryCatch();
        // ThrowKeyword throwKeyword = new ThrowKeyword(17);
        // ThrowsKeyword throwsKeyword = new ThrowsKeyword("text.txt");
        // try {
        //     throwsKeyword.readFile();
        // } catch (FileNotFoundException e) {
        //     System.out.println("File not found error solved in MAIN,\n Error:"+e);
        // }
        TestCustomException testException = new TestCustomException(19);
        try{
            testException.checkAge();
        } catch(CustomException e){
            System.out.println("CustomException Caught handled in MAIN:"+e);
        }
    }
}
