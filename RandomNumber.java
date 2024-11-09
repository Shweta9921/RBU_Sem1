import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
class RandomNumber{
    public static void main(String[] args){
        String fileName="Random.txt";
        int n=100000;
        Random r=new Random();
        final long startTime = System.currentTimeMillis();
        try(BufferedWriter bw =new BufferedWriter(new FileWriter(fileName))){
            for(int i=0;i<n;i++){
                 int random=r.nextInt(100);
                bw.write(Integer.toString(random));
                bw.newLine();
            }
            System.out.println(fileName+" is ready");

        }
        catch(IOException e){
            System.out.println("Error writing to file");
        }
        final long endTime = System.currentTimeMillis();
        System.out.println(fileName+" took "+(endTime-startTime)+" milliseconds");
    }
}