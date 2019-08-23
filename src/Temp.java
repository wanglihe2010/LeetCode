public class Temp {

    boolean stringEqual(String string1, String string2, int tolerance) {
        if(string1 == null || string2 == null) return false;
        if(Math.abs(string1.length() - string2.length()) > tolerance) return false;
        int diff = 0;
        int index1 = 0;
        int index2 = 0;
        while(index1<string1.length() && index2 < string2.length()) {
            char c1 = string1.charAt(index1);
            char c2 = string2.charAt(index2);
            if(c1 >= 'a' && c1 <= 'z'){
                c1 = (char) ('A' + c1 -'a');
            }
            if(c2 >= 'a' && c2 <= 'z'){
                c2 = (char) ('A' + c2 -'a');
            }
            if(c1 != c2){
                if(diff < tolerance) {
                    diff ++;
                    if(string1.length() < string2.length()) {
                        index1--;
                    } else if (string2.length() < string1.length()) {
                        index2 --;
                    }
                } else {
                    return false;
                }
            }

            index1++;
            index2++;
        }
        if(diff == tolerance){
            if(index1<string1.length() || index2 < string2.length()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Temp temp = new Temp();
        System.out.println(temp.stringEqual("ABC","ac",1));
        System.out.println(temp.stringEqual("AC","adec",2));
        System.out.println((-10 & Integer.MAX_VALUE));
        System.out.println(temp.stringEqual("horse","ros",3));
    }
}


