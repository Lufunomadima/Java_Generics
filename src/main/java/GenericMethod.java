public class GenericMethod {
    public static <E> void printArrayContent(E[]array){
        for (E element:array){
            System.out.print(element+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] words={"My","Name","Is","Lufuno"};
        Integer[] numbers={1,2,3,4,5};

        printArrayContent(words);
        printArrayContent(numbers);

    }
}
