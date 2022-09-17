package TryOuts;

class EqualityTester<T> {
    T value1;
    T value2;

    public EqualityTester(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean checkEquals() {
        return value1.equals(value2);
    }
}

class GenericsEX2 {
    public static void main(String[] args) {
        EqualityTester obj = new EqualityTester("Str", "Str");
        System.out.println(obj.checkEquals());

        // try with different inputs and observe the results
    }
}
