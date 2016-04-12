package makhluk2;

import java.io.IOException;

class CLS {
    /**
     * Constructor of CLS Class that runs the "cls" windows system call
     */
    public CLS() {}
    /**
     * 
     * @throws IOException throws an exception error message when IOException is detected
     * @throws InterruptedException throws an exception error message when InterruptedException
     */
    public void clear() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}