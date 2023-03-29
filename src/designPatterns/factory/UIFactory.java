package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    DropDown createDropDown();
    Button createButton();
}

//Assignment -> Booking type on a plane -> Business, Premium, Economy. Each have 3 sets of features, seattype, food menu and drinks menu
// depending on the booking type chosen, create the ticket object with internal 3 set of features.