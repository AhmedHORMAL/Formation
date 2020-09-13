package com.fragility;

public class Fragility {
    public static void Main() {
        if (Helper.authorize(1, "/pictures")) {
            System.out.println("Authorized");
        }
    }
}

class Helper {
    public static boolean authorize(int roleId, String resourceUri) {
        if (roleId == 1 || roleId == 10) {
            if (resourceUri == "/pictures") {
                return true;
            }
        }

        if (roleId == 1 || roleId == 2 && resourceUri == "/admin") {
            return true;
        }

        return false;
    }
}