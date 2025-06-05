//buffer read
import java.io.*;
public class buffer {
    public static void main(String[] args) throws IOException {
        FileInputStream fs=null;
        BufferedReader br=null;
        try{
            fs=new FileInputStream("inp.txt");
            br= new BufferedReader(new InputStreamReader(fs));
            while(true){
                String s = br.readLine();
                if(s==null)
                    break;
                System.out.println(s);
            }
        }

        catch(Exception e){
            System.out.print(e);
        }

        finally{
            if(fs!=null){
                fs.close();
            }

            if(br!=null){
                br.close();
            }
        }
        
    }
}
