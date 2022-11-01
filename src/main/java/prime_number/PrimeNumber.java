// 22 11 01
// 프로그래머스 - 소수 찾기

// 한자리 수를 붙여 소수를 몇개 만들 수 있는가?
// 문자열 numbers은 0~9로만 이루어진 길이 1~7 문자열입니다. == 숫자는 랜덤, 배열의 길이는 [6]
// 013은 0, 1, 3의 숫자가 있다는 의미 == 수를 조합하는 로직 == 3개의 숫자로 나올 수 있는 소수 경우의수는?
// 위의 수로는 11, 101같은 소수를 만들 수 있습니다. == 조합된 수를 소수로 판별하고 출력하는 로직


package prime_number;

public class PrimeNumber {

    boolean isPrime(int num) {

    // i < num
    // i < num / 2
    // i * i < num
    // Math.sqrt()를 사용할 수 있지만 연산이 많다는 단점
    // System.out.println(Math.sqrt(num)); == i * i
        for (int i = 2; i < num; i++) {
        if(num % i == 0) return false;
    }
        return true;
}

    public static void main(String[] args) {

    }
}
