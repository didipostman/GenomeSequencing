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
		
	
	StringBuffer pat = new StringBuffer(dna_pattern) ;
	
        StringBuffer txt = new StringBuffer(dnas.getDna()) ;

        RabinKarp searcher = new RabinKarp(pat.toString());
        int offset = searcher.search(txt.toString());

        
        // from brute force search method 1
        
        dnas.setPattern(pat.toString());
        for (int i = 0; i < offset; i++)
		 txt.insert(i, " ");
			
						
		
       String str = txt.toString();
		dnas.setPattern(str);
		//System.out.println(dnas.toString());
		return dnas;
	}
}
