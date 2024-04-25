package enums;
/*
@date 25.04.2024
@author Sergey Bugaienko
*/

public class User {
    private String email;
    private String password;

    private Day currentDayWeek;

    private Role role; // user, admin, moderator

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.role = Role.USER;
    }

    public String info() {
        return "User{" +
                "role=" + role +
                ", email='" + email + '\'' +
                '}';
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
