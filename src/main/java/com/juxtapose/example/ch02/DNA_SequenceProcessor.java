/**
 * 
 */
package com.juxtapose.example.ch02;

import org.springframework.batch.item.ItemProcessor;

/**

 * @author wadï mami (mailto:didipostman77@gmail.com)
 * 2013-1-6下午09:55:38
 */
public class DNA_SequenceProcessor implements
		ItemProcessor<DNA_Sequence, DNA_Sequence> {
			
    private String dna_pattern  = "AATTCC";
	
	public DNA_Sequence process(DNA_Sequence dnas) throws Exception {
		
		
		
		String pat = dna_pattern;
		
		
		
        String txt = dnas.getDna();

        RabinKarp searcher = new RabinKarp(pat);
        int offset = searcher.search(txt);

        // print results
        //StdOut.println("text:    " + txt);

        // from brute force search method 1
        //StdOut.print("pattern: ");
        for (int i = 0; i < offset; i++){
			            StdOut.print(" ");
						dnas.setPattern(pat);
		}
        //StdOut.println(pat);
		
		//System.out.println(dnas.toString());
		return dnas;
	}
}
