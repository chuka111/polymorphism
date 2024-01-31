package Productv5;


    public class ProductDB {

        public static Product getProduct(String productCode) {
            // In a more realistic application, this code would
            // get the data for the product from a file or database
            // For now, this code just uses if/else statements
            // to return the correct product data


            Productv5.Book myBook = null;
            Productv5.Music myMusic = null;
            Productv5.Software mySoftware = null;
            Productv5.TV myTV = null;
            Productv5.Product myProduct = null;

            if (productCode.equalsIgnoreCase("java")) {
                myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("ATU Java Programming");
                myBook.setPrice(57.50);
                myBook.setAuthor("Joe Brown");
                myProduct = myBook;
            } else if (productCode.equalsIgnoreCase("jsp")) {
                myBook = new Productv5.Book();
                myBook.setCode(productCode);
                myBook.setDescription("Java Servlets and JSP");
                myBook.setPrice(57.50);
                myBook.setAuthor("Mike White");
                myProduct = myBook;
            } else if (productCode.equalsIgnoreCase("mysql")) {
                myBook = new Productv5.Book();
                myBook.setCode(productCode);
                myBook.setDescription("Lennon's MySQL");
                myBook.setPrice(54.50);
                myBook.setAuthor("Jim Lennon");
                myProduct = myBook;

            }else if (productCode.equalsIgnoreCase("pink")) {
                myMusic = new Productv5.Music();
                myMusic.setCode(productCode);
                myMusic.setDescription("wish you were here");
                myMusic.setPrice(8.00);
                myMusic.setLabel("Part of the columbia group");
                myProduct = myMusic;


            }if (productCode.equalsIgnoreCase("studios")) {
                mySoftware = new Productv5.Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Visual Studios");
                mySoftware.setPrice(57.50);
                mySoftware.setVersion("Microsoft 1.1");
                myProduct = mySoftware;
            } else if (productCode.equalsIgnoreCase("eclipse")) {
                mySoftware = new Productv5.Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Build Java apps");
                mySoftware.setPrice(57.50);
                mySoftware.setVersion("Eclipse Neon");
                myProduct = mySoftware;
            } else if (productCode.equalsIgnoreCase("oracle")) {
                mySoftware = new Productv5.Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Latest MySQL");
                mySoftware.setPrice(54.50);
                mySoftware.setVersion("Oracle 3.0");
                myProduct = mySoftware;

            }else if (productCode.equalsIgnoreCase("kdl43")) {
                myTV = new Productv5.TV();
                myTV.setCode(productCode);
                myTV.setDescription("sony bravia smart tv kdl43wf663");
                myTV.setPrice(819.00);
                myTV.setScreenSize("screen size is 55\" ");
                myProduct = myTV;
            }

            return myProduct;

        }




    }









