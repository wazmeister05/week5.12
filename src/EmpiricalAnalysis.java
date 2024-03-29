public class EmpiricalAnalysis {

    public static void main (String[] args) {

        Integer[] number = new Integer[] {50,500,5000,50000,500000};    //my preferred method to running them all individually.
        for (int num : number) {
            long start = System.nanoTime();
            CreateArray ca = new CreateArray();
            ca.run(num);
            long end = System.nanoTime();
            System.out.println("The algorithm for " + num + " numbers ran in " + (end - start) + " nanoseconds.\n");
        }
    }
}
