public class Book {
    private String bookName;
    private int pageNumber;
    private String bookAuthor;
    private String releaseDate;
    public Book(String bookName, int pageNumber, String bookAuthor, String releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.bookAuthor = bookAuthor;
        this.releaseDate = releaseDate;
    }

    //#region -----------GETTER AND SETTER REGION---------
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    //#endregion -----------------GETTER AND SETTER END REGION--------------
}
