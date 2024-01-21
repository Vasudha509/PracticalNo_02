// java program to perform operations on String class of Java
import java.lang.String;

class StringOperation {
  public static void main(String[] args) {
  // "Java_Programming" = char 
    String str = new String("Java_Programming\n");
    
    System.out.println("Given String : "+ str);
    // operation of string class on string
    
    // Returns the length of the string.
    System.out.println("\npublic int length()      \n>> "+ str.length());
    
    // Returns true if, and only if, length() is 0.
    System.out.println("\npublic boolean isEmpty()  \n>> "+ str.isEmpty());
    
    // Returns the char value at the specified index. An index ranges from 0 to length() - 1.
    // Throws: IndexOutOfBoundsException 
    System.out.println("\npublic char charAt(int)  \n>> "+ str.charAt(5));
    
    // Returns the code point value of the character at the specified index.
    System.out.println("\npublic int codePointAt(int) \n>> "+ str.codePointAt(2));
    
    // Returns the unicode code point value of character before the specified index.
    System.out.println("\npublic int codePointBefore(int) \n>> "+ str.codePointBefore(4));
    
    // Compares this string to the specified object. 
    System.out.println("\npublic boolean equals(Object) \n>> "+ str.equals("Hii"));
    
    // Compares this string to another string, ignoring case considerations.
    System.out.println("\npublic boolean equalsIgnoreCase(String) \n>> "+ str.equalsIgnoreCase("java_programming"));
    
    // Compares two strings lexicographically. The comparison is based on the unicode value of each character in the strings.
    System.out.println("\npublic int compareTo(String) \n>> "+ str.compareTo("Java"));
    
    // Returns the index within this string of the first occurrence of the specified charachter.
    System.out.println("\npublic int indexOf(int ch) \n>> "+ str.indexOf('J'));
    
    // Returns the index within this string of the last occurrence of the specified character.
    System.out.println("\npublic int lastIndexOf(int ch) \n>> "+ str.lastIndexOf('m'));
    
    // Returns a string that is a substring of this string.
    System.out.println("\npublic String substring(int beginIndex) \n>> "+ str.substring(5));
    
    // Concatenates the specified string to the end of this string.
    System.out.println("\npublic String concat(String str) \n>> "+ str.concat(" Challenge."));
    
    // Returns a string resulting from replacing all occurrnces of oldChar in this string with newChar.
    System.out.println("\npublic String replace(char oldChar, char newChar) \n>> "+ str.replace("J", "j"));
    
    // Tells whether or not this string matches the given regular expression.
  //  System.out.println("public boolean matches(String regex) : "+ str.matches());
    
    // Returns true if and only if this string contains the specified sequence of char values.
 //   System.out.println("public boolean contains(CharSequence s) : "+ str.contains('j'));
    
    // Replace the first substring of this string that matches the fiven regular expression with the given replacement.
//    System.out.println("public Strinf replaceFirst(String regex, String replacement) : "+ str.replaceFirst());
    
    // Replaces each substring of this string that matches the given regular expression with the given replacement.
 //   System.out.println("public String replaceAll(String regex, String replacement) : "+ str.replaceAll());
    
    // Splits this string around mathces of the given regular expression.
 //   System.out.println("public String[] split(String regex, int limit) : "+ str.split());
    
    // Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
    System.out.println("\npublic static String join(CharSeqence delimiter, CharSequence... elements) \n>> "+ str.join("-","java","is","cool"));
    
    // Converts all of the characters in this String to lower case using the rules of the given Locale.
    System.out.println("\npublic String toLowerCase() \n>> "+ str.toLowerCase());
    
    // Converts all of the characters in this String to upper case using the rules of the given Locale.
    System.out.println("\npublic String toUpperCase() \n>> "+ str.toUpperCase());
    
    // Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U-0020' (the space character)
    System.out.println("\npublic String trim() \n>> "+ str.trim());
    
    // Returns true if the string is empty or contains only white space codepoints, otherwise false.
    System.out.println("\npublic boolean isBlank() \n>> "+ str.isBlank());
    
    // This object (which is already a string!) is itself returned.
    System.out.println("\npublic String toString() \n>> "+ str.toString());
    
    // Converts this string to a new character array.
    System.out.println("\npublic char[] toCharArray() \n>> "+ str.toCharArray());
    
    // Returns a string whose value is the concatenation of this string repeated count times.
    System.out.println("\npublic String repeat(int count) \n>> "+ str.repeat(4));
  }
}
