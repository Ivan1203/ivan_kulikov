package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamorest.core.Is.is;
import static org.junit.Assert.assertThat; 

/**
test
*/
 public class CalculateTest {


	public void whenAddOneToOneThenTwo() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(out.toString(),is(String.format("Hello Worlds\r\n")));
		System.getProperty("line.separator");
									
	}
 }
 
			
 