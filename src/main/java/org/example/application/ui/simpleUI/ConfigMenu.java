package org.example.application.ui.simpleUI;

import io.mateu.mdd.shared.annotations.MenuOption;
import org.example.application.ui.wizards.WizardPage1;
import org.example.domain.boundaries.common.entities.Person;
import org.example.domain.boundaries.educational.entities.AcademicPlan;
import org.example.domain.boundaries.educational.entities.Classroom;
import org.example.domain.boundaries.educational.entities.Course;

public class ConfigMenu {

    @MenuOption
    Class plans = AcademicPlan.class;

    @MenuOption
    Class courses = Course.class;


    @MenuOption
    Class classrooms = Classroom.class;


}
