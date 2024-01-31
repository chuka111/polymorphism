package Productv5;

import ie.atu.productv1.Book;

public class ProductDB {

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}

    public class BookDB {

        public static ie.atu.productv1.Book getBook(String productCode) {
            // In a more realistic application, this code would
            // get the data for the product from a file or database
            // For now, this code just uses if/else statements
            // to return the correct product data


            ie.atu.productv1.Book myBook = null;
            if (productCode.equalsIgnoreCase("java")) {
                myBook = new ie.atu.productv1.Book();
                myBook.setCode(productCode);
                myBook.setDescription("ATU Java Programming");
                myBook.setPrice(57.50);
                myBook.setAuthor("Joe Brown");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                myBook = new ie.atu.productv1.Book();
                myBook.setCode(productCode);
                myBook.setDescription("Java Servlets and JSP");
                myBook.setPrice(57.50);
                myBook.setAuthor("Mike White");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("Lennon's MySQL");
                myBook.setPrice(54.50);
                myBook.setAuthor("Jim Lennon");
            }
            return myBook;
        }
    }







}

