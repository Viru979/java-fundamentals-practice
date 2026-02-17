
// The javac compiler requires a file system path, not a package name, to locate source files.
// javac me hamesha file system path use hota hai (/)
// dot (.) sirf package declaration & java run me use hota hai
// 💡 Run time par hamesha dot (.) use hota hai

// A public class can be accessed and extended in another package, but its source file must be placed
// in the correct package directory. Protected members are accessible in subclasses across packages.

// 👉 public nahi hoga to dusre package me extend hi nahi hoga.

import folder.viru.*;

class c1 extends Problem1{
    void show() {
        System.out.println(proInt); // ✅ protected allowed // protected members are accessible through inheritance in different packages.
        // System.out.println(defInt); // ❌ default not allowed
    }
}

public class Problem2 {
    public static void main(String[] args) {
        c1 c = new c1();
        c.show();
    }
}
