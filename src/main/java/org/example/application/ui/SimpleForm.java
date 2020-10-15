package org.example.application.ui;

import com.vaadin.icons.VaadinIcons;
import io.mateu.mdd.core.annotations.MateuUI;
import io.mateu.mdd.shared.annotations.Action;
import io.mateu.mdd.shared.annotations.TextArea;
import lombok.Getter;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;

@MateuUI(path = "/form")
@Getter@Setter
public class SimpleForm {

    public SimpleForm(HttpServletRequest request) {
        email = request.getParameter("email");
    }


    String email;

    String subject;

    @TextArea
    String body;

    @Action(icon = VaadinIcons.ENVELOPE)
    public void send() throws Throwable {
        // send the email
    }

}
