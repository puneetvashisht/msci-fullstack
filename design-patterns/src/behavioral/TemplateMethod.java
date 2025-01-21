package behavioral;

// This pattern defines the skeleton of an algorithm and allows subclasses to redefine certain steps without changing the algorithm's structure.

abstract class Game {
    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();
}

class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished.");
    }
}

class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("Chess Game Initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Chess Game Started.");
    }

    @Override
    void endPlay() {
        System.out.println("Chess Game Finished.");
    }
}

// Main method
public class TemplateMethod {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        System.out.println();

        game = new Chess();
        game.play();
    }
}

