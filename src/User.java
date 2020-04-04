public class User {
    public  String name;
    public String lastName;
    public String Email;
    public String password;

    User(String x, String y, String z, String t){

        this.name = x;
        this.lastName = y;
        this.Email = z;
        this.password =  t;
    }

    User(String e){

        this.name = "guest";
        this.lastName = "guest";
        this.Email = e;
        this.password = null;
    }

    User(User c, String n, String l, String p){

        this.name = n;
        this.lastName = l;
        this.Email = c.Email;
        this.password = p;
    }
}
