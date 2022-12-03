package example02;
public class Example02 {

    public static void main(String[] args) {
        Example02  data = new Example02();
        int number = data.squareDigits(9119);
      System.out.println(number);
    }
    public int squareDigits(int number){
        String txt = String.valueOf(number);
         StringBuilder str = new StringBuilder();
        for(int i=0;i<txt.length();i++){
            int  num = Integer.parseInt(txt.charAt(i)+"");
            num *=num;
            str.append(num);
        }
        return Integer.parseInt(str.toString());
    }
}
