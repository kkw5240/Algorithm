package com.kwkim.sanhait2020.arch;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
