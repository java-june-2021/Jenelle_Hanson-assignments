public class StringManipulator {
    public String trimAndConcat(String a1, String b1) {
        String c = a1.trim() + " "+ b1.trim();
        return c;
    }

    public Integer getIndexOrNull(String s, char a){
        Integer idx = s.indexOf(a);
        if(idx < 0){
            return null;
        }
        return idx;
    }

    public Integer getIndexOrNull(String s1, String s2){
        Integer idx1 = s1.indexOf(s2);
        if(idx1 < 0){
            return null;
        }
        return idx1;
    }

    public String concatSubstring(String e, int f, int g, String h){
        String str1 = e.substring(f, g);
        str1 += h;
        return str1;
        //System.out.println(str.substring(15, 20));
    }
}
