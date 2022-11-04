package Chapter8_9_10.Question9_6;

public class Books {
    private String title;
    private String yearOfPublication;
    private String author;

    public Books(){
        this("The act of the ark", "2005", "Anu Ore-Ofe");
    }

    public Books(String title, String yearOfPublication, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
