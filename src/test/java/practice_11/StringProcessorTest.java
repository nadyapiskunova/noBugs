package practice_11;

import org.junit.jupiter.api.BeforeEach;
import part_11.practice_11.StringProcessor;

public class StringProcessorTest {
    protected StringProcessor stringProcessor;

    @BeforeEach
    public void setupTest(){
        stringProcessor = new StringProcessor();
    }
}
