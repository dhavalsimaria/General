/**
 * 
 */
package com.dhaval.general;

/**
 * @author Dhaval Simaria
 *
 */
public class VowelCount {

	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();
		
		String para = "Sunset is the time of day when our sky meets the outer space solar winds. There are blue, pink, and purple swirls, spinning and twisting, like clouds of balloons caught in a blender. The sun moves slowly to hide behind the line of horizon, while the moon races to take its place in prominence atop the night sky. People slow to a crawl, entranced, fully forgetting the deeds that still must be done. There is a coolness, a calmness, when the sun does set.";
		para = para.toLowerCase();
		String[] wordArray = para.split(" ");
		
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		
		for(int k = 0; k < wordArray.length; k++) {
			String word = wordArray[k];
			if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
				for(int j = 0; j < word.length(); j++) {
					switch(word.charAt(j)) {
						case 'a':
							a++;
							break;
						case 'e':
							e++;
							break;
						case 'i':
							i++;
							break;
						case 'o':
							o++;
							break;
						case 'u':
							u++;
							break;
					}
				}
			}
		}
		
		Long endTime = System.currentTimeMillis();
		//System.out.println("a: " + a + "\n e: " + e + "\n i: " + i + "\n o: " + o + "\n u: " + u + "\n exe. time: " + (endTime - startTime)/1000);
		System.out.println("{\"a\": " + a + ",\"e\": " + e + ",\"i\": " + i + ",\"o\": " + o + ",\"u\": " + u + "}");
	}
}
