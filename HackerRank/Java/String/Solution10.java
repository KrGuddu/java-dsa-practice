/* Problem Summary: You are given several lines of text written in a tag-based language like HTML/XML.
Your task is to extract and print the text content that is enclosed within valid matching tags, following these rules:

Rules: 1. Start and end tags must match exactly. Example:
    <h1>Text</h1> → ✅ valid
    <h1>Text</h2> → ❌ invalid
2. Ignore nested content. Example: <h1><a>Text</a>Invalid</h1>
        → Only Text is valid, Invalid is ignored.
3. Tags can contain any printable characters.

# Input Format:
First line: an integer N (number of lines).
Next N lines: each line contains tag-based text.

# Output Format
For each line:
    Print each valid content on a new line.
    If no valid content exists, print None.

# Example:- Input:
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

Output:
Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
*/

package Java.String;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution10 {
    public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
        // Regex explanation:
        // <([^>]+)>   -> opening tag (group 1 = tag name)
        // ([^<>]+)    -> content without nested tags
        // </\1>       -> closing tag matching the same tag name
        Pattern pattern = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");
        
		while(testCases > 0){
			String line = in.nextLine();
			
            Matcher matcher = pattern.matcher(line);
            boolean found = false;
            
            while(matcher.find()){
                System.out.println(matcher.group(2));
                found = true;
            }
            
            if(!found){
                System.out.println("None");
            }
            
			testCases--;
		}
        in.close();
	}
}
