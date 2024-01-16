package AdvancedJava;
import java.net.*;
public class URLDemo {
	public static void main(String[] args) throws MalformedURLException{
		URL hp = new URL("http://www.gita.edu.in/academics");
		System.out.println("protocol: "+hp.getProtocol());
		System.out.println("port "+hp.getPort());
		System.out.println("host "+hp.getHost());
		System.out.println("File: "+hp.getFile());
	}
}
