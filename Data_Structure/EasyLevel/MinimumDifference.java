public class MinimumDifference {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        
        int maxVal = num;
        for (char ch : numStr.toCharArray()) {
            if (ch != '9') {
                String maxStr = numStr.replace(ch, '9');
                maxVal = Math.max(maxVal, Integer.parseInt(maxStr));
                break;
            }
        }

        int minVal = num;
        for (char ch : numStr.toCharArray()) {
            if (ch != '0') {
                String minStr = numStr.replace(ch, '0');
                minVal = Math.min(minVal, Integer.parseInt(minStr));
                break;
            }
        }

        return maxVal - minVal;
    }

    public static void main(String[] args) {
        int num = 11891;
        MinimumDifference obj = new MinimumDifference();
        System.out.println(obj.minMaxDifference(num));
    }
}
