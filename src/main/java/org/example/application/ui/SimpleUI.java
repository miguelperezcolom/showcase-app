package org.example.application.ui;

import io.mateu.mdd.core.annotations.MateuUI;
import io.mateu.mdd.shared.annotations.*;
import io.mateu.security.Private;
import org.example.application.ui.simpleUI.ConfigMenu;
import org.example.application.ui.wizards.WizardPage1;
import org.example.domain.boundaries.common.entities.Person;

@MateuUI(path = "")
public class SimpleUI {

    @Submenu
    ConfigMenu config;

    @MenuOption
    Class persons = Person.class;

    @MenuOption
    WizardPage1 wizard;

    @Home
    String msg = "Hello world";

}
