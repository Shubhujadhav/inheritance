public class _3_NullPointerException {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
            int num = Integer.parseInt("xyz");

        }catch(NullPointerException ne){
            System.out.println("null pointer exception occured...");

        }catch(NumberFormatException nfe){
            System.out.println("number format exception occured...");

        }catch(Exception e){
            System.out.println("some other excetion occured...");
        }
    }
}
