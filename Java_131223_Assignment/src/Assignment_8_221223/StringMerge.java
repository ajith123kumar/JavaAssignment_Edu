package Assignment_8_221223;

public class StringMerge {

	public static void main(String[] args) {
		String Org = "Hello, ";
        String names[] = {"Ajith", "Dhoni", "Rajini"};
        int id[]= {101,111,123};
        
        
        String n1 = names[0].concat(String.valueOf(id[0])); 
		
		String n2 = names[1].concat(String.valueOf(id[1])); 
		
		String n3 = names[2].concat(String.valueOf(id[2]));
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
        String merged = StringMergeall(Org, names);
        
		
        System.out.println("Merged String: " + merged);

	}

	private static String StringMergeall(String org, String[] names) 
	{
		StringBuilder merged = new StringBuilder(org);

        for (String element : names) {
        	merged.append(element).append(", ");
        }

        return merged.substring(0, merged.length() - 2);
    }
	}


