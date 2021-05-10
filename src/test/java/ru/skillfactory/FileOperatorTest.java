package ru.skillfactory;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FileOperatorTest {

    @Test
    public void testWhenWeReadFileShouldGetSomeData() throws IOException {
        FileOperator fileOperator = new FileOperator();
        String line = fileOperator.read("C:\\Users\\2\\Desktop\\Java\\1.txt");
        assertThat("Could not read file", line, is("SkillFactory"));
    }

    @Test
    public void testWhenWeReadAsLineShouldGetNotEmptyCollection() throws IOException {
        FileOperator fileOperator = new FileOperator();
        List<String> strings = fileOperator.readAsList("C:\\Users\\2\\Desktop\\Java\\1.txt");
        assertThat("Could not read file", strings.size(), is(2));
    }

    @Test
    public void writeToFileTest() throws IOException{
        FileOperator fileOperator = new FileOperator();
        fileOperator.write("Zoom", "C:\\Users\\2\\Desktop\\Java\\2.txt");
        String readData = fileOperator.read("C:\\Users\\2\\Desktop\\Java\\2.txt");
        assertThat("Could not read file", readData, is("Zoom"));
    }
}