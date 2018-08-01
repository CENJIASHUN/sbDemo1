package com.example.sbDemo1;

import com.example.sbDemo1.mapper.UserMapper;
import com.example.sbDemo1.model.User;
import com.sun.glass.ui.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class SbDemo1ApplicationTests {
	public void contextLoads() throws Exception{
}

}
