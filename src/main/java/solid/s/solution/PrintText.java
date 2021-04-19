package solid.s.solution;

public class PrintText {
    private RewriteText text;

    public PrintText(RewriteText text) {
        this.text = text;
    }

    /*method for formatting output*/
    void printText(){
        System.out.println(text.getText());
    }
}
