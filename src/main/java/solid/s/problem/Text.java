package solid.s.problem;

public class Text {
    private String text;
    private String author;
    private int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /*methods that change the text*/
    void allLettersToUpperCase() {
        text = text.toUpperCase();
    }
    void findSubTextAndReplace(String subtext, String replace){
        text = text.replaceAll(subtext, replace);
    }

    /*method for formatting output*/
    void printText(){
        System.out.println(text);
    }
}
