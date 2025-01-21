package creational;

interface GUIFactory {
    Button createButton();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}

class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }
}

interface Button {
    void render();
}

class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class MacOSButton implements Button {
    public void render() {
        System.out.println("Rendering MacOS Button");
    }
}


public class AbstractFactory {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        button.render(); // Rendering Windows Button
    }

}
