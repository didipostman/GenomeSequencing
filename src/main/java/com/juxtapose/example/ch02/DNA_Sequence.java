/**
 * 
 */
package com.juxtapose.example.ch02;

/**

 * @author wadï mami (mailto:didipostman77@gmail.com)
 * 2013-1-6下午09:56:02
 */
public class DNA_Sequence {
	
	private String dna = "";
	private String pattern = "";
	
	
	
	public String getDna() {
		return dna;
	}
	public void setDna(String dna) {
		this.dna = dna;
	}
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	/**
	 * 
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append( "dna=" + getDna() +";pattern :" + getPattern() );
		return sb.toString();
	}
}
