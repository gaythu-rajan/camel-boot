package com.capgemini.brahma.examples.route;

import com.capgemini.brahma.Application;
import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class RouteIntegrationTests {

    private int port = 10000; // TODO: load this from properties, the same as the ones which set the config on the route itself

    @Before
    public void setUp() throws Exception {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    @Ignore
    @Test
    public void restAssuredHelloWorld() throws Exception {
        when().get("/").then().body(equalTo("helloWorld"));
    }

    @Test
    public void restAssuredRestGetHello() throws Exception {
        when().get("/rest/hello").then().body(equalTo("\"BOOOOOOOM!!!!!\""));
    }

}
