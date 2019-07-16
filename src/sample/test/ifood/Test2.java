package sample.test.ifood;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * Input
3
9

 */
public class Test2 {

	// Complete the oddNumbers function below.
	static List<Integer> oddNumbers(int l, int r) {

		List<Integer> returnList = new ArrayList<Integer>();
		for (int x = l; x <= r; x++) {

			if (x % 2 != 0) {
				returnList.add(x);
			}
		}

		return returnList;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\desenv\\tmp\\test1.txt"));

		int l = Integer.parseInt(bufferedReader.readLine().trim());

		int r = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> res = oddNumbers(l, r);

		bufferedWriter.write(res.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
