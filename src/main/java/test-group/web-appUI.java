package test-group;

import org.linkki.core.vaadin.component.LinkkiWidgetset;
import org.linkki.framework.ui.application.LinkkiUi;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;

import test-group.view.MainView;

@Theme("web-app")
@Widgetset(LinkkiWidgetset.NAME)
public class web-appUI extends LinkkiUi implements ViewDisplay {

    private static final long serialVersionUID = 1L;

    public web-appUI() {
        super(new web-appApplicationConfig());
    }

    @Override
    protected void init(VaadinRequest request) {
        super.init(request);
        addView(MainView.NAME, MainView.class);
    }

    @Override
    public void showView(View view) {
        getApplicationLayout().showView(view);
    }

}
