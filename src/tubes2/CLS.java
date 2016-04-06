package tubes2;

import java.io.IOException;

class CLS {
	public CLS() {}

    public void clear() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}