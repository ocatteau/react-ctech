package fr.stateofmind.ctech.cucumber.stepdefs;

import fr.stateofmind.ctech.CtechApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CtechApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
