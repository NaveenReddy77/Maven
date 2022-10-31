package test-group.view;

import org.linkki.framework.ui.component.Headline;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

import test-group.page.web-appPage;

public class MainView extends VerticalLayout implements View {

    public static final String NAME = "";

    private static final long serialVersionUID = 1L;

    public MainView() {
        addComponent(new Headline("linkki Example Web Application"));
        web-appPage page = new web-appPage();
        page.init();
        addComponent(page);

        setSizeFull();
        setExpandRatio(page, 1f);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub
    }

}