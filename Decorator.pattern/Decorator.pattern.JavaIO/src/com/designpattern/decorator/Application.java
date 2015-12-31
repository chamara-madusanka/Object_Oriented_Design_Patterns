/*
 * Application.java 
 */
package com.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.designpattern.decorator.deco.LowerCaseInputStream;

/**
 * @author Chamara Jayalath
 *
 */
public class Application {

	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream input = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

			while ((c = input.read()) >= 0) {
				System.out.print((char) c);
			}

			input.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
