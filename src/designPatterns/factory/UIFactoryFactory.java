package designPatterns.factory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform supportedPlatform) {
        //TODO -> change this to switch case
        if(supportedPlatform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        } else if(supportedPlatform.equals(SupportedPlatform.IOS)) {
            return new IosUIFactory();
        } else if(supportedPlatform.equals(SupportedPlatform.WINDOWS)) {
            return new WindowsUIFactory();
        }
        return null;
    }
}
