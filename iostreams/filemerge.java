//filemerge

import java.io.*;

public class filemerge {
    public static void main(String[] args)throws IOException{
        FileInputStream fs=null;
        FileInputStream fs1=null;
        FileOutputStream fd=null;

        try{
            fs=new FileInputStream("inp.txt");
            fs1=new FileInputStream("inp1.txt");
            fd=new FileOutputStream("opt.txt");

            while(true){
                int i=fs.read();
                
                if(i==-1)
                    break;
                
                fd.write(i);
                
            }

            while(true){
                int j=fs1.read();
                if(j==-1)
                    break;

                fd.write(j);
            }
        }

        catch(Exception e){
            System.out.print(e);
        }

        finally{
            if(fs!=null)
                fs.close();

            if(fs1!=null)
                fs1.close();
                
            if(fd!=null)
                fd.close();
        }
    }
}
;