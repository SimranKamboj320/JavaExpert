public class JavaExpert {
    public static class Encapsulation {
        private int data;

        public int getData() {
            return data;
        }

        public void setData(int newData) {
            this.data = newData;
        }
    }
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setData(10);

        System.out.println("Data: " + obj.getData());
    }
}

