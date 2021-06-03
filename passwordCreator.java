/*
This class help people to create a random password
*/
class passwordCreator {
    //variable, declarate a String
    private String newPassword;

    //constructor, make it in to an empty password
    public passwordCreator() {
        newPassword = "";
    }

    //accossor to get password
    public String getMyNewPassword() {
        return newPassword;
    }

    //return a random pure number password
    public String makeNewNumPassword(int length) {
        newPassword = "";
        String[] nums = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        if (length <= 3) {
            newPassword = "Must longer than 3";
        } else {
            for (int i = 0; i < length; i++) {
                String oneNum = nums[(int)(Math.random() * 10)];
                newPassword += oneNum;
            }
        }
        
        return newPassword;
    }

    //reture a word mixed password
    public String makeNewMixPassword(int length) {
        newPassword = "";
        String[] nums = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] charsLower = new String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        String[] charsUper = new String[]{"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
        
        if (length <= 3) {
            newPassword = "Must longer than 3";
        } else {
            newPassword += charsUper[(int)(Math.random() * 26)];
            newPassword += charsLower[(int)(Math.random() * 26)];
            for (int i = 0; i < length-2; i++) {
                String oneNum = nums[(int)(Math.random() * 10)];
                newPassword += oneNum;
            }
        }
        return newPassword;
    }
}
