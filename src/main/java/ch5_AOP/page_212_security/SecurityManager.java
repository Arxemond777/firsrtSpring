package ch5_AOP.page_212_security;

public class SecurityManager {
    private static ThreadLocal<UserInfo> threadLocal = new ThreadLocal<UserInfo>();

    public void login(String userName, String password) {
        threadLocal.set(new UserInfo(userName, password));
    }

    public void logout() {
        threadLocal.set(null);
    }

    public UserInfo getLoggedOnUser() {
        return threadLocal.get();
    }
}
