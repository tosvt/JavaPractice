package ru.m.lab10;

public class FactoryComplexNumbers {

    public interface AbstractNumber {
        AbstractNumber sum(AbstractNumber b);
        AbstractNumber dif (AbstractNumber b);
        int getA();
        int getB();
        void show();
    }

    public interface AbstractFactory {
        AbstractNumber CreateAbstractNumber(int a, int b);
    }

    static class Factory implements AbstractFactory {
        @Override
        public AbstractNumber CreateAbstractNumber(int a, int b) {
            return new Number(a,b);
        }
    }

    static class Number implements AbstractNumber {
        int a;
        int b;

        Number (int a1, int b1){
            a=a1;
            b=b1;
        }

        @Override
        public int getA(){
            return a;
        }
        @Override
        public int getB(){
            return b;
        }
        @Override
        public AbstractNumber sum(AbstractNumber B) {
            return new Number(a+B.getA(), b+B.getB());
        }
        @Override
        public AbstractNumber dif(AbstractNumber B) {
            return new Number(a-B.getA(), b-B.getB());
        }
        @Override
        public void show(){
            System.out.print(a+"+"+b+"*i\n");
        }
    }
    static class Client {
        private AbstractNumber number1, number2;

        Client(AbstractFactory factory) {
            number1 = factory.CreateAbstractNumber(4, 76);
            number2 = factory.CreateAbstractNumber(13, 3);
        }

        void execute() {
            number1 = number1.sum(number2);
            number1.show();
            number1=number1.dif(number2);
            number1.show();
        }
    }
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory();
        Client client1 = new Client(factory1);
        client1.execute();
    }
}
