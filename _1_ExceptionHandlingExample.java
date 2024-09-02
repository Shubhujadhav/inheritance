public class _1_ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 50;  // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.err.println("Try to insert values within an index: " + aiobe);
        } catch (Exception e) {
            System.out.println("A general exception occurred.");
            e.printStackTrace();
        }
    }
}
