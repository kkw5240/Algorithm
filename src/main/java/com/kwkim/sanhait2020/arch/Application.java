package main.java.com.kwkim.sanhait2020.arch;

public class Application {
    public static void main(String[] args) {
        GUIProvider guiProvider = new GUIProvider();
        try {
            GUIFactory winFactory = guiProvider.create("WinButton");
            GUIFactory osxFactory = guiProvider.create("OSXButton");

            Button winButton = winFactory.createButton();
            Button osxButton = osxFactory.createButton();

            winButton.paint();
            osxButton.paint();

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
