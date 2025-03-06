package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User Not Found. " + login);
    }

    public static boolean validate(User user) throws UserInvalidException {
            if (user.getUsername().length() < 3) {
                throw new UserInvalidException("In name < 3 symbol");
            }
            if (!user.isValid()) {
                throw new UserInvalidException("User not valid");
            }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ea) {
            ea.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
