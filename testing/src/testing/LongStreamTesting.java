package testing;

import java.util.OptionalLong;
import java.util.Random;
import java.util.stream.LongStream;

public class LongStreamTesting {

	public static void main(String[] args) {
		//Variables
		long size = 5, min = 5000, max = 10000, result;
		//Creation of the LongStream
		LongStream stream = new Random().longs(size, min, max);
		//Extraction of a Long of the stream
		OptionalLong optLong = stream.findAny();
		//Transforming the OptionalLong to a Long variable
		result = optLong.getAsLong();
		//Display of the result
		System.out.println(result);

	}

}
