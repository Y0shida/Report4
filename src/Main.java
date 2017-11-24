public class Main {
    public static void main(String[] args){
        String str = "3．14";
        double value = Double.parseDouble(str);
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("例外発生");
            System.out.println(e.getMessage());
        }
    }

}