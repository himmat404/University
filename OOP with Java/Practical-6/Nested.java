class Ac {
    //non-static (inner) class
    class Mitsubishi {
        public void displayInfo() {
            System.out.println("Mitsubishi Heavy Industries");
        }
    }
    //static class
    static class Whirpool {
        public void displayInfo(){
            System.out.println("Whirpool Ac");
        }
    }
}

class Nested {
    public static void main(String[] args) {

        //object creation of the outer class
        Ac ac = new Ac();

        //object creation of non-static nested class
        Ac.Mitsubishi MSY_GRT = ac.new Mitsubishi();
        MSY_GRT.displayInfo();

        //object creation of static nested class
        Ac.Whirpool Supremecool = new Ac.Whirpool();
        Supremecool.displayInfo();
    }
}