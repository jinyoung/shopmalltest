package shoppingmall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shoppingmall.DeliveryApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryApplication.class })
public class CucumberSpingConfiguration {}
