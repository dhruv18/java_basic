class parent {
    public static void pStatic() {
        System.out.println("Parent pStatic");
    }

    public void pNonStatic() {
        System.out.println("parent pNonStatic");
    }
}

class chaild extends parent {
    public static void pStatic() {
        System.out.println("chaild pStatic");
    }

    public void pNonStatic() {
        System.out.println("chaild pNonStatic");
    }
}

class staticMethodOverriding {
    public static void main(String[] args) {
        /*
         * 1-> SO the static methods are called using the type of reference which call
         * it not the object being refered.Which means method call is decided at compile
         * time.
         */
        parent p = new chaild();
        p.pStatic(); // -call parent p1;

        /*
         * 2-> the non static method are the called according to the type of object
         * being referred not according to type of reference.which means method call at
         * runtime.
         */
        p.pNonStatic();

    }
}