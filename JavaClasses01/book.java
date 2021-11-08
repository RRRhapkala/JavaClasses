

public class book
{  
    String name;
    int page;
    String author;
    int number_of_pages;
    
    public book(String get_name, int get_page, String get_author, int get_number_of_pages)
    {
    name = get_name;
    page = get_page;
    author = get_author;
    number_of_pages = get_number_of_pages;
    }
    
    void DisplayInfo()
    {
        System.out.println("Your current page: " + page + "\nAuthor: " + author + "\nName: " + name + "\nNumber_of_pages: " + number_of_pages);
        
    }
}
