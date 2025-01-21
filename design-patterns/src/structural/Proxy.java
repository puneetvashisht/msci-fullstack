package structural;

// Subject Interface
interface Image {
    void display();
}

// Real Subject
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

// Proxy
class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Lazy initialization
        }
        realImage.display();
    }
}


public class Proxy {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded and displayed for the first time
        image.display();

        // Image will only be displayed as it's already loaded
        image.display();
    }
    
}
