
package example04;

public class Example04 {

    public static void main(String[] args) {
        Example04  data = new Example04();
        String txt = data.wordMax("this is a word");
        System.out.println(txt);
    }
     public String wordMax(String txt){
         String[] words = txt.split(" ");
         int index = 0;
         int count = 0;
         for (int i=0;i<words.length;i++) {
             int sum = 0;
            for(int j=0;j<words[i].length();j++){
                char ch =  words[i].charAt(j);
                //ASCII value a=97-96 = 1
                sum+=(ch-96);  
            }
            if(sum>count){
                count=sum;
                index = i;
            }
          
        }
        return words[index];
    }
}
