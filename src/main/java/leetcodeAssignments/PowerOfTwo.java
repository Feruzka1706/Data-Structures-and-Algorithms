package leetcodeAssignments;

public class PowerOfTwo {

    public static void main(String[] args) {

        PowerOfTwo power = new PowerOfTwo();
        System.out.println(power.isPowerOfTwo(1));
    }

    public boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }

        while (number > 1) {
            int remainder = number % 2;
            if (remainder > 0) {
                return false;
            }
            number /= 2; // 32 / 2 = 16
        }

        return true;
    }
}
