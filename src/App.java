public class App {
    public static void main(String[] args) throws Exception {
        int result = 1 + 2; 
        System.out.println("1 + 2 = " + result);

        int previousResult = result; 
        System.out.println("PreviousResult = " + previousResult);

        result = result - 1; 
        System.out.println(result);

        System.out.println("PreviousResult = " + previousResult);

        result = result * 10; 
        System.out.println(result);

        result = result / 5;
        System.out.println(result); 

        result = result % 3; 
        System.out.println(result); 

        result++;
        System.out.println(result);

        result--; 
        System.out.println(result);

        result += 2; 
        System.out.println(result);

        result *= 10; 
        System.out.println(result);

        result /= 3; 
        System.out.println(result);

        boolean isAlien = false; 

        if (isAlien == false) {
            System.out.println("It is not an Alien");
            System.out.println("And I am scared of Aliens!");
        }
            
        int topScore = 80; 
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95; 
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than 2nd and less than 100");
        }

        if (topScore > 90 || topScore < 100) {
            System.out.println("Greater than 2nd and less than 100");
        }

        boolean isCar = false; 
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false; 
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
