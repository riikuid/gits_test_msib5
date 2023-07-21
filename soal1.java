public class soal1 {
    public static String soalnomor1(int n) {
        StringBuilder result = new StringBuilder();
        int number = 1;
        
        for (int i = 1; i <= n; i++) {
            result.append(number).append("-");
            number += i;
        }
        
        result.deleteCharAt(result.length() - 1);
        
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Output: " + soalnomor1(7));
    }
}
