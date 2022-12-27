package com.company;

        public class FizzBuzz {
            public static String generateString(int number) {
                String strReturn = null;

                if (number % 15 == 0) strReturn = "FizzBuzz";

                else  if (number % 3 == 0) strReturn = "Fizz";

                else if (number % 5 == 0) strReturn = "Buzz";

                else return String.valueOf(number);

                return strReturn;
            }
        }


