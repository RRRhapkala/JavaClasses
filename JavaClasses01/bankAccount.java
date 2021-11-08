
public class bankAccount
{
    String name;
    int id;
    float money;
    String cards;
    float arrears;
    
    public bankAccount(String get_name, int get_id, float get_money, float get_arrears, String get_cards)
    {
        name = get_name;
        id = get_id;
        money = get_money;
        arrears = get_arrears;
        cards = get_cards;
    }
    
    void getCash (float add_money)
    {
        money = money + add_money;
        System.out.println("Some cash dropped: " + add_money);
    }
    
    void PayWithCard (String check_card)
    {
        if (check_card == cards) {
            System.out.println("Transaction completed");
        } else {
            System.out.println("Change your card");
        }
    
    }
    
    void ChangeName (String new_name)
    {
        name = new_name;
        System.out.println("Name changed successfully\nNew name: " + name);
    }
}