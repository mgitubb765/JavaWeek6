public class Main {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
     int[] scores = {10, 20, 30, 40, 50};
     System.out.println(scores[2]);
     }
}
public class Main {
    public static void main(String[] args) {
int[] scores = {10, 20, 30, 40, 50};
System.out.println("The length of the array is: " + scores.length);
    }
}
public class Main {
    public static void main(String[] args) {
int[] scores = {10, 20, 30, 40, 50};
for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
public class Main {

 public static int sumArray(int[] arr) {
  int sum = 0;
   sum += arr[i];
  }
  return sum;
}
public static void main(String[] args) {
int[] scores = {10, 20, 30, 40, 50};
 int result = sumArray(scores);
 System.out.println("The sum of the array elements is: " + result);
    }
}
public class Main {
ublic static int findMax(int[] arr) {
        int max = arr[0]; 
for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
   }
}
 return max;
}
 public static void main(String[] args) {
int[] scores = {10, 20, 30, 40, 50};
int maxValue = findMax(scores);
System.out.println("The maximum value in the array is: " + maxValue);
    }
}
public class Main {
public static void reverseArray(int[] arr) {
 int left = 0;
int right = arr.length - 1;
 while (left < right) {
int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
 left++;
            right--;
        }
    }
public static void main(String[] args) {
 int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
reverseArray(numbers);
System.out.println("Reversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
       public class Main {
    public static void main(String[] args) {
int[] scores = {10, 20, 30, 40, 50};
int[] copiedScores = new int[scores.length];
for (int i = 0; i < scores.length; i++) {
            copiedScores[i] = scores[i];
        }
        
        // Print the copied array to verify the copy
        System.out.println("Copied array:");
        for (int score : copiedScores) {
            System.out.print(score + " ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
 int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
 System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
      }
    }
}
public class Main {
    public static void main(String[] args) {
     String[] fruits = {"Apple", "Banana", "Blueberry", "Orange", "Plum"};
       for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}