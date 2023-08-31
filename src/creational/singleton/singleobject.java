package creational.singleton;

public class singleobject {
         private static singleobject instance = new singleobject();
        private singleobject(){}

        public static singleobject getInstance(){
            return instance;
        }

        public void showMessage(){
            System.out.println("Hello World!");
        }
}
