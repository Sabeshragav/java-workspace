//save by B.java  

import pack.*;

class ProtectedDemoo extends ProtectedDemo {
    public static void main(String args[]) {
        ProtectedDemoo obj = new ProtectedDemoo();
        obj.msg();
        System.out.println("Integer inside the protected class = " + obj.variableValue);
    }
}