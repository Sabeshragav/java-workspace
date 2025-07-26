// ===========================
// C Bitwise Math Snippet Pack
// ===========================

// 1. Check if number is odd or even
// Example: 5 -> 1, 4 -> 0
int isOdd(int x) { return x & 1; }

// 2. Swap two variables without temp
// Example: a=3, b=5 -> a=5, b=3
void swap(int *a, int *b) {
    *a ^= *b;
    *b ^= *a;
    *a ^= *b;
}

// 3. Multiply by 2
// Example: 3 -> 6
int multiplyBy2(int x){ return x << 1; }

// 4. Divide by 2
// Example: 6 -> 3
int divideBy2(int x){ return x >> 1; }

// 5. Multiply by 2^n
// Example: x=3, n=2 -> 12
int multiplyByPowerOf2(int x, int n) { return x << n; }

// 6. Divide by 2^n
// Example: x=12, n=2 -> 3
int divideByPowerOf2(int x, int n) { return x >> n; }

// 7. Check if power of 2
// Example: 4 -> 1, 5 -> 0
int isPowerOf2(int x) { return x && !(x & (x - 1)); }

// 8. Turn off rightmost 1 bit
// Turns off the rightmost set bit in the binary representation of the number.
// Example: For x = 10 (binary: 1010), the rightmost set bit is 2 (binary: 0010).
// After turning it off, x becomes 8 (binary: 1000).
int turnOffRightmostBit(int x) { return x & (x - 1); }

// 9. Isolate rightmost 1 bit
// Isolates the rightmost set bit in the binary representation of the number.
// Example: For x = 10 (binary: 1010), the rightmost set bit is 2 (binary: 0010).
// This function extracts that bit, resulting in 2.
int isolateRightmostBit(int x) { return x & -x; }

// 10. Set rightmost 0 bit
// Sets the rightmost unset bit in the binary representation of the number.
// Example: For x = 10 (binary: 1010), the rightmost unset bit is 1 (binary: 0001).
// After setting it, x becomes 11 (binary: 1011).
int setRightmostZeroBit(int x) { return x | (x + 1); }

// 11. Absolute value
// Example: -5 -> 5
int bitwiseAbs(int x) {
    int mask = x >> 31;
    return (x + mask) ^ mask;
}

// 12. Bitwise addition
// Example: 3+5 -> 8
int add(int a, int b) {
    while (b != 0) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
    }
    return a;
}

// 13. Bitwise subtraction
// Example: 5-3 -> 2
int subtract(int a, int b) {
    return add(a, add(~b, 1));
}

// 14. Multiply two numbers
// Example: 3*5 -> 15
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

// 15. Divide two numbers
// Example: 15/3 -> 5
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

// 16. Modulo operation
// Example: 15%4 -> 3
int modulo(int dividend, int divisor) {
    return dividend - divisor * divide(dividend, divisor);
}

// 17. Count set bits
// Example: 5 -> 2  (101  => 2 bits are set)
int countBits(int x) {
    int count = 0;
    while (x) {
        x &= (x - 1);
        count++;
    }
    return count;
}

// 18. Max and Min
// Example: max(3,5) -> 5, min(3,5) -> 3
int max(int a, int b) {
    return a - ((a - b) & ((a - b) >> 31));
}

int min(int a, int b) {
    return b + ((a - b) & ((a - b) >> 31));
}

// 19. Power
// Example: 2^3 -> 8
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

// 20. Toggle the last bit
// Toggles the last bit of the binary representation of the number.
// Example: For n = 10 (binary: 1010) and mask = 1 (binary: 0001),
// n ^ mask results in 11 (binary: 1011).
int toggleLastBit(int n, int mask = 1) {
    return n ^ 1;  
}
