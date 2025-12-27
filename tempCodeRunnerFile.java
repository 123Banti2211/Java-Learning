boolean isPrime = true;

        // Special cases
        if (num <= 1) {
            isPrime = false;
        } 
        else {
            // Check divisibility from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        Print result
        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }