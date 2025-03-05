class RemoveZero {
    public static String removeZero(String str) {
        int i = 0;
   
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i);
    }
    public static void main(String[] args) {
        String str = "00000123569";
        str = removeZero(str);
        System.out.println(str);  
    }
}
