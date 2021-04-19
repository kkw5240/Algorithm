package main.java.com.kwkim.sanhait2020.arch;

public class OSXFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
