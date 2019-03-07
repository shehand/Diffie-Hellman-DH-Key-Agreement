import java.util.*;

class DH{
	
	private int n = 7;
	private int g = 31;
	
	public static int generatePublicKey(int privateKey){
		
		int publicKey = ( ( int ) Math.pow( g, privateKey ) ) % n;
		return publicKey;
	}
	public static void main(String args[]){
		
	}
}