



public interface Printable {
    void print();

    void hai();
}


class inter implements Printable {


    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
   public void hai() {
       System.out.println("Hai");
   }

//        void hello(){
//        System.out.println("Hello");
//    }



    public static void main(String[] args) {

        inter obj = new inter();
        obj.print();
        obj.hai();
//        obj.hello();

    }
}
