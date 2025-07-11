
// ===========================
// C Bitwise Math Snippet Pack
// ===========================

// 1. Check if number is odd or even
int isOdd(int x) { return x & 1; }

// 2. Swap two variables without temp
void swap(int *a, int *b) {
    *a ^= *b;
    *b ^= *a;
    *a ^= *b;
}

// 3. Multiply by 2^n ( x * 2^n)
int multiplyByPowerOf2(int x, int n) { return x << n; }

// 4. Divide by 2^n  ( x / 2^n)
int divideByPowerOf2(int x, int n) { return x >> n; }

// 5. Check if number is power of 2
int isPowerOf2(int x) { return x && !(x & (x - 1)); }

// 6. Turn off rightmost 1 bit
int turnOffRightmostBit(int x) { return x & (x - 1); }

// 7. Isolate rightmost 1 bit
int isolateRightmostBit(int x) { return x & -x; }

// 8. Set rightmost 0 bit
int setRightmostZeroBit(int x) { return x | (x + 1); }

// 9. Absolute value using bitwise
int bitwiseAbs(int x) {
    int mask = x >> 31;
    return (x + mask) ^ mask;
}

// 10. Bitwise addition
int add(int a, int b) {
    while (b != 0) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
    }
    return a;
}

// 11. Bitwise subtraction
int subtract(int a, int b) {
    return add(a, add(~b, 1));
}

// 12. Multiply two numbers (no *)
int multiply(int a, int b) {
    int result = 0;
    while (b > 0) {
        if (b & 1)
            result += a;
        a <<= 1;
        b >>= 1;
    }
    return result;
}

// 13. Divide two numbers (no /)
int divide(int dividend, int divisor) {
    int quotient = 0;
    while (dividend >= divisor) {
        int temp = divisor, multiple = 1;
        while (dividend >= (temp << 1)) {
            temp <<= 1;
            multiple <<= 1;
        }
        dividend -= temp;
        quotient += multiple;
    }
    return quotient;
}

// 14. Modulo operation (no %)
int modulo(int dividend, int divisor) {
    return dividend - divisor * divide(dividend, divisor);
}

// 15. Count set bits
int countBits(int x) {
    int count = 0;
    while (x) {
        x &= (x - 1);
        count++;
    }
    return count;
}

// 16. Max and Min without if
int max(int a, int b) {
    return a - ((a - b) & ((a - b) >> 31));
}

int min(int a, int b) {
    return b + ((a - b) & ((a - b) >> 31));
}

// 17. Power using exponentiation by squaring
int power(int x, int n) {
    int result = 1;
    while (n > 0) {
        if (n & 1)
            result *= x;
        x *= x;
        n >>= 1;
    }
    return result;
}
