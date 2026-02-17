// This program implements a Library Management System using Java class.
// The Library class stores available and issued books using arrays.
// Methods like addBook, issueBook, returnBook, and showAvailableBooks are used to manage books.
// The program demonstrates basic OOP concepts such as classes, objects, and encapsulation.

class Library{
    String avlBooks[];
    String issuedBooks[];
    int avlCount;
    int issuedCount;

    public Library(){
        avlBooks = new String[100];
        issuedBooks = new String[100];
        avlCount = 0;
        issuedCount = 0;
    }

    public void addBook(String book){
        avlBooks[avlCount] = book;
        avlCount++;
        System.out.println(book + " added to the library.");
    }

    public void showAvailableBooks(){
        if (avlCount == 0){
            System.out.println("No books available in library.");
            return;
        }
        System.out.println("\nThe availale books are: ");
        for(int i=0; i<avlCount; i++){
            if(avlBooks[i] != null){
                System.out.println(". " + avlBooks[i]);
            }
        }
        System.out.println();
    }

    public void issueBook(String book){
        if (avlCount == 0){
            System.out.println("No books available in library.");
            return;
        }
        for(int i=0; i<avlCount; i++){
            // null par .equals() call nahi ho sakta so first check book availablty, then compare.
            if(avlBooks[i] != null && avlBooks[i].equals(book)){
                issuedBooks[issuedCount] = book;
                issuedCount++;
                avlBooks[i] = null;
                System.out.println(book + " has been issued.");
                return;
            }
        }
        System.out.println(book + " is not available.");
    }
    public void returnBook(String book){
        for(int i=0; i<issuedCount; i++){
            if(issuedBooks[i] != null && issuedBooks[i].equals(book)){
                avlBooks[avlCount] = book;
                avlCount++;
                issuedBooks[i] = null;
                System.out.println(book + " has been returned.");
                return;
            }
        }
        System.out.println(book + " was not issued from from this library.");
    }
}
public class OopsMethodOverridingInheritence {
    public static void main(String[] args){
        Library lib = new Library();
        lib.addBook("Java Programming");
        lib.addBook("C++ Basics");
        lib.addBook("Python for Beginners");

        lib.showAvailableBooks();

        lib.issueBook("Java Programming");
        lib.showAvailableBooks();

        lib.returnBook("Java Programming");
        lib.showAvailableBooks();
    }
}




// A refer = new B();
// if (refer instanceof B) {
//     B temp = (B) refer;
//     temp.math3();
// }

// Overridden method call is decided at runtime based on the object,
// but method availability is checked at compile time based on the reference.

//  Overriding = same method signature with different behavior (decided at runtime)

/*class A{
    int a;
    public int viruBhai(){
        return 9;
    }
    public void math2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override // it helps catch errors at compile time
    public void math2(){
        // super.math2(); // use it when you want to also call the math2 of super class.
        System.out.println("I am method 2 of class B");
    }
    public void math3(){
        System.out.println("I am method 3 of class B");
    }
}

public class OopsMethodOverridingInheritence {
    public static void main(String[] args){
        /*A a = new A(); // no need
        a.math2();  // no need
        System.out.println(a.viruBhai());
        B b = new B();
        b.math2();
        System.out.println(b.viruBhai());
        b.math3();*/

        /*// This is called Dynamic method Dispatch -> it execute methods at runtime on the basis of object. but
        // Method call is resolved at runtime (Dynamic Method Dispatch),
        // but the compiler checks method availability using the reference type.
        
        A refer = new B(); // Reference of parent class is always equal to the object of child class.
        refer.math2();
        System.out.println(refer.viruBhai());
        // refer.math3(); // jiska refernce usi ka method call hoga lekin overrid ho jayega
        
        
    }
}*/
