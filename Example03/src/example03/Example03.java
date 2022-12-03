package example03;
public class Example03 {
     public static void main(String[] args) {
        Example03  data = new Example03();
        String txt = data.reverse("This is an example!");
        System.out.println(txt);
    }
    public String reverse(String txt){
        String[] words = txt.split(" ");
          StringBuilder str = new StringBuilder();
         for (String data : words) {
            for(int j=data.length()-1;j>=0;j--){
                str.append(data.charAt(j));
            }
             str.append(" ");
        }
        return str.toString();
    }
}
