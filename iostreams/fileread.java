//file read and display
import java.io.*;
public class fileread {
    public static void main(String[] args)throws IOException {
        FileInputStream fs= null;
        try{
            fs=new FileInputStream("inp.txt");
            while(true){
                int i=fs.read();
                if(i==-1){
                    break;
                }
                System.out.print((char)i);
            }
        }     

        catch(Exception e){
            System.out.print(e);
        }

        finally{
            if(fs!=null){
                fs.close();
            }
        }
    }
}
