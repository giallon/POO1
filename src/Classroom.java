package wlc;

import wlc.Wilder;

public class Classroom {
    public static void main(String... args) {
	Wilder jcvd = new Wilder("Jean-Claude", true);
	Wilder henri = new Wilder("Henri", false);

	System.out.println(jcvd.whoAmI());
	System.out.println(henri.whoAmI());
    }
}
