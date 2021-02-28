public class StringManipulator {
    public String trimAndConcat(String val1, String val2){
        return val1.trim() + val2.trim();
    }

    public Integer getIndexOrNull(String val1, char val2){
        return val1.indexOf(val2);
    }

    public Integer getIndexOrNull(String val1, String val2){
        return val1.indexOf(val2);
    }

    public String concatSubstring(String val1, int val2, int val3, String val4){
        return val1.substring(val2, val3) + val4;
    }
}