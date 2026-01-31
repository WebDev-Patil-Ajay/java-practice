class Logical {
    public static void main(String[] args) {

        // AND (&&)
        System.out.println((2 > 4) && (2 > 1));
        System.out.println((20 > 40) && (2 < 5));
        System.out.println((30 > 2) && (4 > 6));

        // OR (||)
        System.out.println((2 > 4) || (2 > 1));
        System.out.println((20 > 40) || (2 < 5));
        System.out.println((30 > 2) || (4 > 6));

        // NOT (!)
        System.out.println(!(2 > 4));
        System.out.println(!(20 > 40));
        System.out.println(!(4 > 6));
    }
}
