package main_module.client.activity;



import login_module.client.ClientFactory;
import login_module.client.Injector;
import main_module.client.place.HomePlace;
import main_module.client.ui.HomePageView;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;



/**
 * Created by Saniye on 27.10.16.
 */
public class HomeActivity extends AbstractActivity implements HomePageView.Presenter {
    private ClientFactory clientFactory;
    final Injector injector;
    private String message;


    public HomeActivity(HomePlace place, ClientFactory clientFactory) {
        this.message = place.getGreetingMessage();
        this.clientFactory = clientFactory;
        this.injector = Injector.INSTANCE;
    }

    @Override
    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
        HomePageView homePageView = injector.gethomePageView();
        homePageView.setExitButtonText();
        homePageView.setGreetingMessage(message);
        homePageView.setPresenter(this);
        containerWidget.setWidget(homePageView.asWidget());
    }

    @Override
    public void goTo(Place place) {
        clientFactory.getPlaceController().goTo(place);
    }

    @Override
    public void openWindow(String name, String url) {
        com.google.gwt.user.client.Window.open(url, name.replace(" ", "_"),
                "menubar=no," +
                        "location=false," +
                        "resizable=yes," +
                        "scrollbars=yes," +
                        "status=no," +
                        "dependent=true");
    }


}
