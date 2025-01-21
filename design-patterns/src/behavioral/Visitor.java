package behavioral;

import java.util.ArrayList;
import java.util.List;

// The Visitor Pattern lets you add new operations to a set of classes without modifying their structure by using a visitor object.

// Element interface
interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}

// Concrete elements
class File implements FileSystemElement {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}

class Folder implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public String getName() {
        return name;
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemElement element : elements) {
            element.accept(visitor);
        }
    }
}

// Visitor interface
interface FileSystemVisitor {
    void visit(File file);
    void visit(Folder folder);
}

// Concrete visitor
class FileSystemPrinter implements FileSystemVisitor {
    @Override
    public void visit(File file) {
        System.out.println("File: " + file.getName());
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Folder: " + folder.getName());
    }
}

// Main method
public class Visitor {
    public static void main(String[] args) {
        // Create file system structure
        Folder root = new Folder("root");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Folder subFolder = new Folder("subfolder");

        root.addElement(file1);
        root.addElement(subFolder);
        subFolder.addElement(file2);

        // Visitor to print file system structure
        FileSystemPrinter printer = new FileSystemPrinter();
        root.accept(printer);
    }
}
