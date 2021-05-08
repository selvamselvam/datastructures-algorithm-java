package com.datastructure.trie;

public class TrieNode {
	   char letter;
	    TrieNode[] links;
	    boolean fullWord;
	  
	    TrieNode(char letter, boolean fullWord)
	    {
	        this.letter = letter;
	        this.fullWord = fullWord;
	        links = new TrieNode[26];
	    }
}
