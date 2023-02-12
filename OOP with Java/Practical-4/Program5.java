class AccessModifiers {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;
 
    private void privateMethod() {
       System.out.println("privateMethod called, privateVar : " + privateVar);
    }
    void defaultMethod() {
       System.out.println("defaultMethod called, defaultVar : " + defaultVar);
    }
    protected void protectedMethod() {
       System.out.println("protectedMethod called, protectedVar : " + protectedVar);
    }
    public void publicMethod() {
       System.out.println("publicMethod called, publicVar : " + publicVar);
    }
 }
 
 public class Program5 {
    public static void main(String[] args) {
       AccessModifiers obj = new AccessModifiers();
       obj.publicMethod();
       obj.defaultMethod();
       obj.protectedMethod();
       // obj.privateMethod();  // compile error
       // System.out.println("privateVar : " + obj.privateVar); // compile error
       System.out.println("defaultVar : " + obj.defaultVar);
       System.out.println("protectedVar : " + obj.protectedVar);
       System.out.println("publicVar : " + obj.publicVar);
    }
 }