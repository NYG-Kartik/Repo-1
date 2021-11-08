public class countHi{

public static int countHi(String str){
        int counter = 0;
        String phrase = str;
        for (int i = 0; i < phrase.length() - 1; i++) {
                if (phrase.substring(i, i+2) .equals("hi")){
                        counter += 1;
                }
        }
        return counter;
}

public static void main (String args[]){
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

}

}
