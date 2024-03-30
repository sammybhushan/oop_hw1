// Factory
public class GreenFactory extends GUIFactory{
    @Override
    Button createButton() {
        return new Button(new SimpleCompositor(), "Green");
    }

    @Override
    Label createLabel() {
        return new Label(new SimpleCompositor(), "Green");
    }
}
