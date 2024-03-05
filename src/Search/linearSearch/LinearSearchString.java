package Search.linearSearch;

public class LinearSearchString {

    // In this we have a string and we have to search a character in that string
    // first we created a function StringSearch which takes a string and character as an input
    // then first we will check if the string length is zero or not
    // then we will apply a for loop till the no of character present in the string
    // we will use the build in charAt function and compare it with the character provide
    // if it contains give the position of character
    // else return -1;
    public static int StringSearch(String str, char ch)
    {
        if(str.length() == 0)
        {
            return -1;
        }

        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i) == ch)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str= "sunnyt";
        char ch = 't';

       int ans= StringSearch(str, ch);
        System.out.println(ans);
    }
}
