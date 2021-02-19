public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator App");
    }

    public static int operationChooser(String option, int firstEntry, int secondEntry) {
        Operation op = new Operation();
        if (option.equals("soma")) {
            return op.sum(firstEntry, secondEntry);
        }
        return 0;
    }
}
