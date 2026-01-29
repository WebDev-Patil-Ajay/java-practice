class logicalOperator {
    public static void main(String[] args) {

        int num = 5;

        if ((num > 0 || num == 0) && ! (num < 0)) {
            System.out.println("Number is valid");
        } else {
            System.out.println("Number is invalid");
        }
    }
}
