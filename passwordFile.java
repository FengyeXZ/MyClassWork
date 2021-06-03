/*
This class define what should contain in each password file
*/
class passwordFile {
    //the variables, declaration and initialization
    private String webName = "";
    private String link = "";
    private String account = "";
    private String password = "";

    //the constructor, take all value from parameter list
    public passwordFile(String setWebName,String setLink, String setAccount, String setPassword) {
        webName = setWebName;
        link = setLink;
        account = setAccount;
        password = setPassword;
    }

    //accessor
    public String getWebName() {
        return webName;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getLink() {
        return link;
    }

    //print the information of a password file
    public void printPasswordInfo() {
        System.out.println(webName + " link: " + link + " Your account: " + account + " The password: " + password);
    }

    //mutator, set the new password
    public void changePassword(String setPassword) {
        password = setPassword;
    }

    //set the new webname
    public void changeWebName(String setWebName) {
        webName = setWebName;
    }
}
