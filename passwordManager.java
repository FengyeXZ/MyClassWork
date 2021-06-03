/*
this class is used to manage the password files
creat an arraylist to put all password files in
*/
import java.util.ArrayList;
import java.util.Iterator;

class passwordManager {
    //variable, declare a new arraylist
    private ArrayList<passwordFile> passwords;

    //constructor create a space for a new arraylist
    public passwordManager() {
        passwords = new ArrayList<passwordFile>();
    }

    //add a new password file to the arraylist
    public void addNewPassword(String setWebName, String setLink, String setAccount, String setPassword) {
        passwordFile newPassword = new passwordFile(setWebName, setLink, setAccount, setPassword);
        passwords.add(newPassword);
    }

    //how many password file in the arraylist
    public int numOfPassword() {
        return passwords.size();
    }

    //print all the password files
    public void printListOfPassword() {
        Iterator<passwordFile> it = passwords.iterator();
        while (it.hasNext()) {
            it.next().printPasswordInfo();
        }
    }
    
    //search a password file by webname, link, account or password
    public void findPassword(String getWord) {
        int num = 0;
        for (int i = 0; i < passwords.size(); i++) {
            if (getWord.equals(passwords.get(i).getWebName())||getWord.equals(passwords.get(i).getLink())||getWord.equals(passwords.get(i).getAccount())||getWord.equals(passwords.get(i).getPassword())) {
                num++;
                passwords.get(i).printPasswordInfo();
            }
        }
        if (num == 0) {
            System.out.println("Not Found");
        }
    }

    //delet a password file only by webname or link
    public void deletePassword(String getWebLink) {
        int num = 0;
        for (int i = 0; i < passwords.size(); i++) {
            if (getWebLink.equals(passwords.get(i).getWebName())||getWebLink.equals(passwords.get(i).getLink())) {
                num++;
                passwords.get(i).printPasswordInfo();
                passwords.remove(i);
                System.out.println("is deleted");
            }
        }
        if (num == 0) {
            System.out.println("Not Found");
        }
    }
}
