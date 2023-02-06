package TreeAlgorithims;

public class TrieNode {

	//Trie: It is a tree-like data structure used to store a collection of strings, where each node in the trie represents a single character in a word.
	//It is used to efficiently search for words in a dictionary or to check if a given prefix is present in a set of strings.
	class TrieNode_ {
		   TrieNode[] children = new TrieNode[26];
		   boolean isEndOfWord;
		}

		class Trie {
		   TrieNode root;

		   public Trie() {
		      root = new TrieNode();
		   }

		   public void insert(String word) {
		      TrieNode node = root;
		      for (int i = 0; i < word.length(); i++) {
		         int index = word.charAt(i) - 'a';
		         if (node.children[index] == null) {
		            node.children[index] = new TrieNode();
		         }
		         node = node.children[index];
		      }
		      node.isEndOfWord = true;
		   }
	
}


