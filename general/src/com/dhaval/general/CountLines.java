/**
 * 
 */
package com.dhaval.general;

/**
 * @author Dhaval Simaria
 *
 * Will education be provided by Artificial Intelligence?
 *  In my opinion, not any time soon. 
 *  At least for the near future, I think human teachers will continue to be the best way to teach human students! 
 *  However, I think we can absolutely expect AI to be an important tool to enhance and augment teaching. 
 *  We’re on the cusp of seeing new tools emerge which will draw from Artificial Intelligence and neurotechnology to provide truly personalized learning, tailored to each students’ passions, capabilities and unique ways of thinking. 
 *  When the technology can learn about and respond to our thoughts as we learn, we’ll arrive at more efficient and optimized ways of passing on knowledge.
 *
 *
 * How often do you find yourself using an interrogation point in your everyday writing?
 *  What about an eroteme?
 *  You might be surprised to know that both of these appeared in the last two sentences.
 *  These terms might be unfamiliar, but you may know this punctuation mark by its more common name: the question mark.
 *  The question mark has a very simple function in writing—it indicates a question. 
 *  If a sentence ends with a question mark, then it is asking a question, just as the name suggests.
 *
 *
 */
public class CountLines {

	public static void main(String args[]) {
		String para = "Will education be provided by Artificial Intelligence? In my opinion, not any time soon. At least for the near future, I think human teachers will continue to be the best way to teach human students! However, I think we can absolutely expect AI to be an important tool to enhance and augment teaching. We’re on the cusp of seeing new tools emerge which will draw from Artificial Intelligence and neurotechnology to provide truly personalized learning, tailored to each students’ passions, capabilities and unique ways of thinking. When the technology can learn about and respond to our thoughts as we learn, we’ll arrive at more efficient and optimized ways of passing on knowledge.";
		
		String[] linesArray = para.split("[.?]");
		
		System.out.println("No. of sentences: " + linesArray.length);
	}
}
