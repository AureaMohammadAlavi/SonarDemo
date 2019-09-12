package me.smash.abstractfactory;

public class AbstractFactoryDemo {

  public static void main(String[] args) {
    WidgetLibrary library = new WidgetLibrary(new MacOSWidgetFactory());

    Window window = library.createWindow();
    window.show();
    Button button = library.createButton();
    button.click();

  }
}
