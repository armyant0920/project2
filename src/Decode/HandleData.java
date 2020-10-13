package Decode;

import java.util.Random;

public class HandleData {

    private int length;
    private String data;
    private String encryptData;

    public HandleData(int length) {
        this.length = length;
        this.data=createData(length);
        this.encryptData = encrypt(this.data);

    }

    public HandleData(String s){

        this.data=s;
        this.encryptData=encrypt(this.data);
    }
    public String createData(int length) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char)(rnd.nextInt(26) + 65));
        }
        return sb.toString();
    }
    public String encrypt(String s) {
        char[] data = s.toCharArray();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < data.length) {
            int code = data[index];
            int length=(int) Math.ceil(Math.log(code) / Math.log(10));
            sb.append(length);
            sb.append(code);
            index++;
        }
        return sb.toString();
    }
    public String unEncrypt() {

        int length=this.encryptData.length();
        StringBuilder sb=new StringBuilder();
        int index=0;
        while(index<length){
            int nextLen=Character.getNumericValue(this.encryptData.charAt(index));

            index++;
            StringBuilder sb2=new StringBuilder();
            for(int i=0;i<nextLen;i++){
                sb2.append(this.encryptData.charAt(index));
                index++;
            }
            int num=Integer.parseInt(sb2.toString());
            sb.append((char)num);

        }
        return sb.toString();
    }

    public void showData() {

        System.out.println(data);
    }

    public void showEncryptData() {

        System.out.println(encryptData);

    }

    public String getEncryptData(){
        return this.encryptData;
    }

}
