public class GenericClass<T> {
    private T Object;

    public void setObject(T Object){
        this.Object=Object;
    }
    public T getObject() {
        return Object;
    }

    public static void main(String[] args) {
        GenericClass<String>words=new GenericClass<>();
        words.setObject("Lufuno");
        System.out.println(words.getObject());

        GenericClass<Integer>numbers=new GenericClass<>();
        numbers.setObject(20);
        System.out.println(numbers.getObject());
    }
}
