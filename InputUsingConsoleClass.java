class InputUsingConsoleClass
{
    public static void main(String[] args)
    {
        
        String s = System.console().readLine();
 
        System.out.println("Your String is" + s);
    }
}