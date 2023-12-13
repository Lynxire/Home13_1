package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class User {


    public static boolean userLog(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if(login.contains(" ") || login.length() >= 20)
            {
                throw new WrongLoginException("Логин не соответствует условиям");
            }
            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")){
                throw new WrongPasswordException("Пароль не соответствует условиям");
            }
            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("Пароли не совпадают");
            }
            System.out.println("Пользователь успешно создан");
            return true;
        }catch (WrongLoginException | WrongPasswordException e){
            return false;
        }
        //3 задание, так как программа будет завершена, блок finally не будет реализован
        finally {
            //throw new RuntimeException();
        }

    }
}
