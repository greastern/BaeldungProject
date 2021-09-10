import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

@SpringBootApplication
public class Loop1 {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Loop1.class, args);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        Loop1 l = new Loop1();

        for (int i=1; i<=10; i++)
        {
            System.out.println(l.outputLine(N, i));
        }
        bufferedReader.close();
    }

    public String outputLine(int number, int factor)
    {
        return number + " x "  + factor + " = "+ number * factor;
    }




}
