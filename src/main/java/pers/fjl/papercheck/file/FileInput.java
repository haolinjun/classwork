package pers.fjl.papercheck.file;

import java.io.*;

public class FileInput {

    public String readString(String FI){
        int len=0;
        StringBuffer str=new StringBuffer("");
        File file = new File(FI);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                if (len!=0){
                    str.append("\r\n"+line);
                }else {
                    str.append(line);
                }
                len++;
            }
            bufferedReader.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static void main(String[] args) {
        FileInput fileInput = new FileInput();
        String s = fileInput.readString("E:\\ideawenjian\\paperpass\\src\\main\\resources\\orig.txt");
        System.out.println(s);
    }

}
