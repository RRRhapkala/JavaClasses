
public class CinemaTicket
{
    static String cinema_name = "Kosmos";
    String film_title;
    int row;
    int seat;
    float price;
    public CinemaTicket(String get_film_title, int get_row, int get_seat, float get_price) {
    
    film_title = get_film_title;
    row = get_row;
    seat = get_seat;
    price = get_price;
    
    }
        void DisplayInfo()
        {
            System.out.println("Name of the cinema: " + cinema_name + "\nTitle of the film: " + film_title + "\nYour row: " + row + "\nYour seat: " + seat + "\nPrice of the ticket: " + price);
            
        }
    }
