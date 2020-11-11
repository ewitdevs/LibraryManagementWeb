package com.ewit.librarymanagement.libraryconverter.utils;

import com.ewit.librarymanagement.librarymodel.models.CourseYear;
import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.librarymodel.models.UserType;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class MockDataProvider {

    private static Random random = new Random();


    public User provideUser(){
        User user = new User();
        user.setId(getRandomId());
        user.setName(getRandomString());
        user.setFirstName(getRandomString());
        user.setCanLogin(getRandomBoolean());
        user.setAllowedBooks(getRandomInt());
        user.setUpdatedAt(getDateTime());
        user.setCreatedAt(getDateTime());
        user.setType(randomEnum(UserType.class));
        user.setYear(randomEnum(CourseYear.class));
        user.setPassword(getRandomString());
        return user;
    }

    public static Boolean getRandomBoolean(){
        return ThreadLocalRandom.current().nextBoolean();
    }

    public static Long getRandomId(){
        return ThreadLocalRandom.current().longs(1, 100).findFirst().orElse(1);
    }

    public static Integer getRandomInt(){
        return ThreadLocalRandom.current().ints(1, 4).findFirst().orElse(1);
    }

    public static String getRandomString(){
        return UUID.randomUUID().toString();
    }

    public static LocalDateTime getDateTime(){
        return LocalDateTime.now();
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }


}
