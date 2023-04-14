package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String s1 = "Pavan Kumar pavan Pavan";
		
		duplicateWords("java pavan guides java java pavan pavan");
		
		duplicateWords("j java pavan pavan");
		

	}
	
	public static void duplicateWords(String inputstring)
	{
		
		String[] stringword = inputstring.split(" ");
		
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		for(String word: stringword)
		{
			if (wordcount.containsKey(word))
			{
				wordcount.put(word, wordcount.get(word)+1);
				
			}
			else
			{
				wordcount.put(word, 1);
			}
			
		}
		
		Set<String> keys = wordcount.keySet();
		
		for(String key:keys)
		{
			if(wordcount.get(key)>1)
			{
				System.out.println(key+" : " + wordcount.get(key));
			}
			
		}
		
	}

}
