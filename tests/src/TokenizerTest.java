package src;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenizerTest {


    @Test
    void add() {
        Tokenizer tokenizer = new Tokenizer();
        tokenizer.add("read|write|begin|end|if|then|else|endif|while|endwh", 1);
    }

    @Test
    void tokenize() {
    }


    @Test
    public void getTokens() {
        Tokenizer tokenizer = new Tokenizer();
        assertNotNull(tokenizer);
    }
}