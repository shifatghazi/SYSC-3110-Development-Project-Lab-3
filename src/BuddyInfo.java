public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        this("", "", "");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }


    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "742 Evergreen Terrace", "613-851-4044");

        System.out.println("Hello " + buddyInfo.getName());

    }


}
