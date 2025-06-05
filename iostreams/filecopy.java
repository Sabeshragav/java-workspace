//filecopy

import java.io.*;

public class filecopy {
    public static void main(String[] args)throws IOException{
        FileInputStream fs=null;
        FileOutputStream fd=null;

        try{
            fs=new FileInputStream("inp.txt");
            fd=new FileOutputStream("opt.txt");

            while(true){
                int i=fs.read();
                if(i==-1)
                    break;
                
                fd.write(i);
            }
        }

        catch(Exception e){
            System.out.print(e);
        }

        finally{
            if(fs!=null)
                fs.close();
            if(fd!=null)
                fd.close();
        }
    }
}
