import java.util.*;

class DH{
	
	private static int n = 23;
	private static int g = 7;
	
	public static int generatePublicKey(int privateKey){
		
		int publicKey = ( ( int ) Math.pow( g, privateKey ) ) % n;
		return publicKey;
		
	}
	
	public static int generateSessionKey(int privateKey, int publicKey){
		
		int sessionKey = ( (int) Math.pow( publicKey, privateKey ) ) % n;
		return sessionKey;
		
	}
	
	public static void main(String args[]){
		
		if(args.length == 0){
			
			System.out.println("Missing arguments...");
			System.out.println("Usage:  java DH [private_key]");
            System.out.println("Usage:  java DH [private_key] [public_key]");
			
		}else if(args.length == 1){
			
			DH dif = new DH();
			int publicKey = dif.generatePublicKey(Integer.parseInt(args[0]));
			System.out.println("Public Key of the Session : " + publicKey );
			
		}else if(args.length == 2){
			
			DH dif = new DH();
			int sessionKey = dif.generateSessionKey(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			System.out.println("Session Key of the Session : " + sessionKey );
			
		}else{
			
			System.out.println("Invalid arguments...");
			System.out.println("Usage:  java DH [private_key]");
            System.out.println("Usage:  java DH [private_key] [public_key]");
			
		} 
	}
}