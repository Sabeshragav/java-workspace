import java.util.regex.Pattern;

/**
 * Simplified Regex Demonstration using Pattern.matches()
 * This approach is perfect for most validation scenarios
 */
public class Regex {

    public static void main(String[] args) {
        System.out.println("=== REGEX WITH PATTERN.MATCHES() ===\n");

        // Basic validation examples
        basicValidation();

        // Common validation patterns
        commonValidations();

        // When Pattern.matches() is NOT enough
        whenPatternMatchesIsNotEnough();
    }

    /**
     * Basic validation using Pattern.matches()
     */
    public static void basicValidation() {
        System.out.println("1. BASIC VALIDATION WITH PATTERN.MATCHES()");
        System.out.println("=" + "=".repeat(45));

        // Simple text validation
        String text = "Hello123";

        System.out.println("Validating: '" + text + "'");
        System.out.println("  Contains only letters and digits: " +
                Pattern.matches("[a-zA-Z0-9]+", text));
        System.out.println("  Starts with letter: " +
                Pattern.matches("[a-zA-Z].*", text));
        System.out.println("  Exactly 8 characters: " +
                Pattern.matches(".{8}", text));
        System.out.println("  Contains at least one digit: " +
                Pattern.matches(".*\\d.*", text));

        System.out.println();
    }

    /**
     * Common validation patterns using Pattern.matches()
     */
    public static void commonValidations() {
        System.out.println("2. COMMON VALIDATION PATTERNS");
        System.out.println("=" + "=".repeat(35));

        // Email validation
        String[] emails = {
                "user@example.com",
                "test.email@domain.co.uk",
                "invalid-email",
                "user@domain"
        };

        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        System.out.println("Email Validation:");
        for (String email : emails) {
            boolean isValid = Pattern.matches(emailRegex, email);
            System.out.println("  " + email + " -> " + (isValid ? "✓ VALID" : "✗ INVALID"));
        }

        // Phone number validation
        String[] phones = {
                "123-456-7890",
                "(555) 123-4567",
                "5551234567",
                "123-45-6789",
                "abc-def-ghij"
        };

        String phoneRegex = "(\\d{3}-\\d{3}-\\d{4}|\\(\\d{3}\\)\\s\\d{3}-\\d{4}|\\d{10})";
        System.out.println("\nPhone Validation:");
        for (String phone : phones) {
            boolean isValid = Pattern.matches(phoneRegex, phone);
            System.out.println("  " + phone + " -> " + (isValid ? "✓ VALID" : "✗ INVALID"));
        }

        // Password validation
        String[] passwords = {
                "Password123!",
                "weakpass",
                "STRONG123!",
                "weak",
                "NoSpecialChar123"
        };

        // At least 8 chars, 1 uppercase, 1 lowercase, 1 digit, 1 special char
        String passwordRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}";
        System.out.println("\nPassword Validation (8+ chars, upper, lower, digit, special):");
        for (String password : passwords) {
            boolean isValid = Pattern.matches(passwordRegex, password);
            System.out.println("  " + password + " -> " + (isValid ? "✓ VALID" : "✗ INVALID"));
        }

        // Date validation (YYYY-MM-DD)
        String[] dates = {
                "2024-12-25",
                "2024-02-29",
                "24-12-25",
                "2024-13-01",
                "2024/12/25"
        };

        String dateRegex = "\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])";
        System.out.println("\nDate Validation (YYYY-MM-DD):");
        for (String date : dates) {
            boolean isValid = Pattern.matches(dateRegex, date);
            System.out.println("  " + date + " -> " + (isValid ? "✓ VALID" : "✗ INVALID"));
        }

        // IP Address validation
        String[] ipAddresses = {
                "192.168.1.1",
                "255.255.255.255",
                "300.1.1.1",
                "192.168.1",
                "192.168.1.1.1"
        };

        String ipRegex = "((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)";
        System.out.println("\nIP Address Validation:");
        for (String ip : ipAddresses) {
            boolean isValid = Pattern.matches(ipRegex, ip);
            System.out.println("  " + ip + " -> " + (isValid ? "✓ VALID" : "✗ INVALID"));
        }

        System.out.println();
    }

    /**
     * Scenarios where Pattern.matches() is not sufficient
     */
    public static void whenPatternMatchesIsNotEnough() {
        System.out.println("3. WHEN PATTERN.MATCHES() IS NOT ENOUGH");
        System.out.println("=" + "=".repeat(42));

        System.out.println("Pattern.matches() is perfect for validation, but you need other methods for:");
        System.out.println();

        // 1. Finding patterns within text
        System.out.println("1. Finding patterns WITHIN text (not full string match):");
        String text = "Contact me at john@example.com or call 555-1234";

        // Pattern.matches() checks if ENTIRE string matches
        System.out.println("  Text: '" + text + "'");
        System.out.println("  Pattern.matches() for email: " +
                Pattern.matches("[\\w.]+@[\\w.]+\\.[a-zA-Z]{2,}", text) + " (checks entire string)");
        System.out.println("  → Use Pattern.compile() + find() to find email within text");

        // 2. Extracting multiple matches
        System.out.println("\n2. Extracting multiple matches:");
        String priceText = "Item 1: $19.99, Item 2: $25.50, Item 3: $12.75";
        System.out.println("  Text: '" + priceText + "'");
        System.out.println("  → Use Pattern.compile() + Matcher.find() in loop to extract all prices");

        // 3. Replacing text
        System.out.println("\n3. Replacing text based on patterns:");
        String phoneText = "Call me at 555-1234 or 555-5678";
        System.out.println("  Text: '" + phoneText + "'");
        System.out.println("  → Use String.replaceAll() or Matcher.replaceAll() to replace phone numbers");

        // 4. Getting capture groups
        System.out.println("\n4. Extracting parts of the match (capture groups):");
        String nameText = "John Doe";
        System.out.println("  Text: '" + nameText + "'");
        System.out.println("  → Use Pattern.compile() + Matcher.group() to extract first and last name separately");

        System.out.println("\nSUMMARY:");
        System.out.println("✓ Use Pattern.matches() for: Simple validation (does entire string match pattern?)");
        System.out.println("✓ Use String.matches() for: Even simpler one-line validation");
        System.out.println("✓ Use Pattern.compile() when you need: Finding, extracting, replacing, or grouping");

        System.out.println();
    }

    /**
     * Bonus: Quick validation helper methods
     */
    public static class QuickValidator {

        public static boolean isEmail(String email) {
            return Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", email);
        }

        public static boolean isPhone(String phone) {
            return Pattern.matches("(\\d{3}-\\d{3}-\\d{4}|\\(\\d{3}\\)\\s\\d{3}-\\d{4}|\\d{10})", phone);
        }

        public static boolean isStrongPassword(String password) {
            return Pattern.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}", password);
        }

        public static boolean isDate(String date) {
            return Pattern.matches("\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])", date);
        }

        public static boolean isIPAddress(String ip) {
            return Pattern.matches("((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)",
                    ip);
        }
    }
}