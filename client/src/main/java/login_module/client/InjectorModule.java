package login_module.client;

import login_module.client.ui.LoginPageView;
import login_module.client.ui.LoginPageViewImpl;
import main_module.client.ui.HomePageView;
import main_module.client.ui.HomePageViewImpl;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;



/**
 * Created by Saniye on 31.10.16.
 */
public class InjectorModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(EventBus.class).to(SimpleEventBus.class);
        bind(HomePageView.class).to(HomePageViewImpl.class);
        bind(LoginPageView.class).to(LoginPageViewImpl.class);
    }
}
