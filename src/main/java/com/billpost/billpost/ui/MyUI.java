package com.billpost.billpost.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.annotation.WebServlet;

/**
 * MyUI
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@SpringUI
@Theme("valo")
public class MyUI extends UI {

    private HorizontalLayout horizontalLayout;
    private VerticalLayout verticalLayout;
    private MusteriEklePage musteriEklePage;
    private Table table;
    private Button save;

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        MusteriEkleButton();
        horizontalLayout.addComponent(save);

        verticalLayout.addComponent(horizontalLayout);
        verticalLayout.setComponentAlignment(horizontalLayout, Alignment.TOP_CENTER);
        setContent(verticalLayout);
    }
    private void MusteriEkleButton(){
        save = new Button("Yeni Kayıt");
        save.setIcon(FontAwesome.SAVE);
        save.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        save.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                MyUI.getCurrent().addWindow(musteriEklePage);
            }
        });
    }
}
