package com.ewit.librarymanagement.libraryconverter.converter;

import com.ewit.librarymanagement.libraryconverter.utils.MockDataProvider;
import com.ewit.librarymanagement.librarydto.model.UserDTO;
import com.ewit.librarymanagement.librarymodel.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {UserConverter.class, MockDataProvider.class})
class UserConverterTest {

    @Autowired
    private UserConverter converter;

    @Autowired
    private MockDataProvider mockDataProvider;

    @Test
    public void testConvertFromUserModelToDTO(){
       assertNotNull(converter);
       assertNotNull(mockDataProvider);
       User user = mockDataProvider.provideUser();
       assertNotNull(user);
       UserDTO userDTO = converter.convertFromEntity(user);
       assertNotNull(userDTO);
    }

}