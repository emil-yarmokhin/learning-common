public class BranchingTask4 {
    public static void main(String[] args) {
            int [] array = {15, 5, 6};
            int A = 5;
            int B = 4;

            boolean sort = false;
            int mins;
            while(!sort) {
                sort = true;
                for (int i = 0; i < array.length-1; i++) {
                    if(array[i] > array[i+1]){
                        sort = false;
                        mins = array[i];
                        array[i] = array[i+1];
                        array[i+1] = mins;
                    }
                }
            }
            if (((array[0] <= A) && (array[1] <= B)) || ((array[1] <= A) && (array[0] <= B))) {
                System.out.println("Кирпич пройдёт в отверстие");
            } else {
                System.out.println("Кирпич не пройдёт в отверстие");

            }
        }
    }
