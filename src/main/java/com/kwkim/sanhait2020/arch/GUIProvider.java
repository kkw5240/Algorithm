package com.kwkim.sanhait2020.arch;

public class GUIProvider {
    public GUIFactory create(String buttonType) throws Exception {
        GUIFactory guiFactory;
        if ("WinButton".equals(buttonType)) {
            guiFactory = new WinFactory();
        } else if ("OSXButton".equals(buttonType)) {
            guiFactory = new OSXFactory();
        } else {
            throw new Exception("There Are No Type");
        }

        return guiFactory;
    }
}
