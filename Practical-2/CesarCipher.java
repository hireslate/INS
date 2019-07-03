class CesarCipher 
{  
    public static void main(String[] args) 
    { 
        String msg = args[0]; 
        int key = Integer.parseInt(args[1]); 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<msg.length(); i++) 
        { 
            if (Character.isUpperCase(msg.charAt(i))) 
            { 
                char ch = (char)(((int)msg.charAt(i)+key - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)msg.charAt(i)+key-97) % 26 + 97);  
                result.append(ch); 
            } 
        }
		StringBuffer result1=result;
		System.out.println("encrypted message : "+result);
			
			for (int i=0; i<msg.length(); i++) 
        { 
            if (Character.isUpperCase(msg.charAt(i))) 
            { 
                char ch = (char)(((int)msg.charAt(i)-key - 65) % 26 + 65); 
                result1.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)msg.charAt(i)-key-97) % 26 + 97);  
                result1.append(ch); 
            } 
		}
		System.out.println("decrypted message : "+result1);
    } 
} 