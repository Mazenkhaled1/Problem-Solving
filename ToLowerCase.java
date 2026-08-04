public class ToLowerCase {

    public String toLowerCase(String s) {

//            return s.toLowerCase();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >=65 && chars[i] <= 90){
                chars[i] =  (char) (chars[i] += 32) ;
            }
        }
        return String.valueOf(chars);
    }
}
