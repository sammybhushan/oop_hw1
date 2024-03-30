// Factory
public class RedFactory extends GUIFactory{
    @Override
    Button createButton() {
        return new Button(new SimpleCompositor(), "Red");
    }

    @Override
    Label createLabel() {
        return new Label(new SimpleCompositor(), "Red");

    }
}
