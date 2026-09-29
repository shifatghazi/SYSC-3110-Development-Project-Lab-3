import java.util.ArrayList;


public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    //Commenting to test by adding code on the online repo to late view it locally

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Homer", "742 Evergreen Terrace", "613-851-4044");

        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}


