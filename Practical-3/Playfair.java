class Playfair{
	public static void main(String args[]){
		char [][] playMatrix = new char[5][5];
		String plainText = "trojan";
		String key = "aapex";
		String alpha = "abcdefghiklmnopqrstuvwxyz";
		key = key+alpha;
		int k=0;
		
		/*for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(k<apex.length() && playMatrix[i][j]!=key.charAt(k)){
					playMatrix[i][j] = plainText.charAt(k);
					k++;
				}
			}
		}*/
		
		StringBuilder sb = new StringBuilder();
		key.chars().distinct().forEach(c -> sb.append((char)c));
		//alpha.chars().distinct().forEach(c -> sb.append((char)c));
		
		for(int i =0; i<5; i++){
			for(int j=0; j<5; j++){
				playMatrix[i][j] = key.charAt(k);
				k++;
			}
		}
	}
}