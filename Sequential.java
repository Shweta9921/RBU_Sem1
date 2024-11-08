import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class Sequential{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        String filename= "SequentialNumbers.txt";
        int n=100000;
        try(BufferedWriter Wr= new BufferedWriter(new FileWriter(filename))){
            for(int i=0;i<n;i++){

                Wr.write(Integer.toString(i));
                Wr.newLine();
            }
            System.out.println(filename+" is created Sucessfully");
        }
        catch(IOException e){
            System.out.println("Error is occured"+e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to write to file: "+(endTime-startTime));
    }
}