package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value = "java")
public class MainView2 extends VerticalLayout {
    public MainView2() {
        // Use TextField for standard text input
        TextField textField = new TextField("Your name");

        // Button click listeners can be defined as lambda expressions
        Button button = new Button("Say hello in Java", e -> {
            add(new Paragraph(GreetService.greet(textField.getValue())));
        });

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button is more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);

        // Use custom CSS classes to apply styling. This is defined in shared-styles.css.
        addClassName("centered-content");

        add(textField, button);
    }
}
