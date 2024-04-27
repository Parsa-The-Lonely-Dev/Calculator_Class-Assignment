import java.util.Arrays;

public class ExtendedCalculator {

    //Fields
    private final Integer[] integers;

    //Constructors
    public ExtendedCalculator(Integer[] integers) {
        this.integers = integers;
    }

    //Methods
    public long sum() {

        long total = 0;
        for (Integer integer : integers) {
            total += integer;
        }
        return total;
    }

    public Integer findMax() {
        if (integers.length == 0) {
            return null;
        } else {
            Integer maximum = integers[0];
            for (Integer integer : integers) {
                if (integer > maximum) {
                    maximum = integer;
                }
            }
            return maximum;
        }
    }

    public Integer findMin() {
        if (integers.length == 0) {
            return null;
        } else {
            Integer minimum = integers[0];
            for (Integer integer :
                    integers) {
                if (integer < minimum) {
                    minimum = integer;
                }
            }
            return minimum;
        }
    }

    public static boolean isPrime(Integer integer) {
        if (integer > 1) {
            for (int i = 2; i < integer; i++) {
                if (integer % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public Integer countPrimes() {
        int count = 0;
        for (Integer integer : integers) {
            if (isPrime(integer)) {
                count++;
            }
        }
        return count;
    }

    public Integer[] primesIn() {
        Integer[] primes = new Integer[countPrimes()];
        for (int i = 0; i < countPrimes(); i++) {
            if (isPrime(integers[i])) {
                primes[i] = integers[i];
            }
        }
        return primes;
    }

    public float average() {
        return (float) sum() / integers.length;
    }

    public Integer[] reverse() {
        if (integers.length == 0) {
            return null;
        }
        Integer[] reversed = new Integer[integers.length];
        for (int i = 0; i < integers.length; i++) {
            reversed[i] = integers[integers.length - 1 - i];
        }
        return reversed;
    }

    public int count(Integer target) {
        int count = 0;
        for (Integer integer :
                integers) {
            if (integer.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public Integer[] subarray(int subBegin, int subEnd) {
        Integer[] subarray = new Integer[subEnd - subBegin];
        int j = 0;
        for (int i = subBegin; i <= subEnd; i++) {
            subarray[j] = integers[i];
            j++;
        }
        return subarray;
    }
}
