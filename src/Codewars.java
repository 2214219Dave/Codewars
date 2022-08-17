public class Codewars {
    public static void main(String[] args) {
        System.out.println(oddOrEven((new int[] {2, 5, 34, 6})));
    }
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int n : array){
            sum += n;
        }
        return sum%2==0 ? "even" : "odd";
    }
}