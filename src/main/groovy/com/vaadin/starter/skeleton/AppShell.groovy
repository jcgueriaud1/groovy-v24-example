package com.vaadin.starter.skeleton

import com.vaadin.flow.component.page.AppShellConfigurator
import com.vaadin.flow.server.PWA
import com.vaadin.flow.theme.Theme
import groovy.transform.CompileStatic

@CompileStatic
/**
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@PWA(name = "Project Base for Vaadin", shortName = "Project Base")
@Theme("my-theme")
class AppShell implements AppShellConfigurator {
}
