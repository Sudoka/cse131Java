package lab4;
/**
 * Name: Philip I. Thomas
 * Lab Section: A
 * Date: February 27 2012
 * Lab4.java
 * CSE 131 Lab 4
 */

import nip.NIP;

public class Lab4 {

	public static void main(String[] args) {
		// Sets up the NIP interface and initiates the EyeballTool
		NIP nip = new NIP(300, 300, 2, "", "ken.jpg");
		nip.setTool(new EyeballTool(nip.getTargetPanel()));


	}
}
