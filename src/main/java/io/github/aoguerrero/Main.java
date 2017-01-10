package io.github.aoguerrero;

import java.io.File;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
/**
 * Encode or decode using base64 from Apache Commons Codec.
 *
 * @author Andres Guerrero <aoguerrero@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
    	File input = new File("input.txt");
    	if(input.exists()) {
	    	String inputTxt = FileUtils.readFileToString(input, "UTF-8");
	        byte[] outputBin = Base64.decodeBase64(inputTxt);
	    	File output = new File("output.bin");
	    	if(output.exists()) output.delete();
	        FileUtils.writeByteArrayToFile(output, outputBin);
    	} else {
    		input = new File("input.bin");
    		if(input.exists()) {
    			byte[] inputBin = FileUtils.readFileToByteArray(input);
    			String outputTxt = Base64.encodeBase64String(inputBin);
    			File output = new File("output.txt");
    			if(output.exists()) output.delete();
    			FileUtils.writeStringToFile(output, outputTxt, "UTF-8");
    			
    		} else {
    			System.err.println("'input.txt' or 'input.bin' not found in current directory!");
    		}
    	}
    }
}