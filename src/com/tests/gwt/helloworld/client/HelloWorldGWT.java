package com.tests.gwt.helloworld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HelloWorldGWT implements EntryPoint {

    @Override
    public void onModuleLoad() {

        // add button to change font to big when clicked.
        Button Btn1 = new Button("Big Text");
        Btn1.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                RootPanel.get("mytext").setStyleName("gwt-Big-Text");
            }
        });

        // add button to change font to small when clicked.
        Button Btn2 = new Button("Small Text");
        Btn2.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                RootPanel.get("mytext").setStyleName("gwt-Small-Text");
            }
        });

        // create two Labels
        Label label1 = new Label("This is first GWT Label");
        Label label2 = new Label("This is second GWT Label");

        // use UIObject methods to set label properties.
        label1.setTitle("Title for first Lable");
        label1.addStyleName("gwt-Green-Border");
        label2.setTitle("Title for second Lable");
        label2.addStyleName("gwt-Blue-Border");

        // add labels to the root panel.
        VerticalPanel verticalPanel1 = new VerticalPanel();
        verticalPanel1.add(label1);
        verticalPanel1.add(label2);

        // create two HTML widgets
        HTML html1 = new HTML("This is first GWT HTML widget using <b> tag of html.");
        HTML html2 = new HTML("This is second GWT HTML widget using <i> tag of html.");

        // use UIObject methods to set HTML widget properties.
        html1.addStyleName("gwt-Green-Border");
        html2.addStyleName("gwt-Blue-Border");

        // add widgets to the root panel.
        VerticalPanel verticalPanel2 = new VerticalPanel();
        verticalPanel2.setSpacing(10);
        verticalPanel2.add(html1);
        verticalPanel2.add(html2);

        // Create a Image widget
        Image image = new Image();

        // set image source
        image.setUrl("http://www.tutorialspoint.com/images/gwt-mini.png");

        // Add image to the root panel.
        VerticalPanel verticalPanel3 = new VerticalPanel();
        verticalPanel3.add(image);

        // Create a Anchor widget, pass text as TutorialsPoint set asHtml as false,
        // href as www.tutorialspoint.com, target as _blank
        Anchor anchor = new Anchor("TutorialsPoint", false, "http://www.tutorialspoint.com", "_blank");
        anchor.setTitle("Tutorials -- Point");
        // Add anchor to the root panel.
        VerticalPanel verticalPanel4 = new VerticalPanel();
        verticalPanel4.add(anchor);

        // create buttons
        Button redButton = new Button("Red");
        Button greenButton = new Button("Green");
        Button blueButton = new Button("Blue");

        // use UIObject methods to set button properties.
        redButton.setWidth("100px");
        greenButton.setWidth("100px");
        blueButton.setWidth("100px");
        greenButton.addStyleName("gwt-Green-Button");
        blueButton.addStyleName("gwt-Blue-Button");

        // add a clickListener to the button
        redButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("Red Button clicked!");
            }
        });

        // add a clickListener to the button
        greenButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("Green Button clicked!");
            }
        });

        // add a clickListener to the button
        blueButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("Blue Button clicked!");
            }
        });

        // Add button to the root panel.
        VerticalPanel verticalPanel5 = new VerticalPanel();
        verticalPanel5.setSpacing(10);
        verticalPanel5.add(redButton);
        verticalPanel5.add(greenButton);
        verticalPanel5.add(blueButton);

        // Make a new check box, and select it by default.
        CheckBox checkBox1 = new CheckBox("Check Me 1!");
        CheckBox checkBox2 = new CheckBox("Check Me 2!");

        // set check box as selected
        checkBox1.setValue(true);

        // disable a checkbox
        checkBox2.setEnabled(false);

        checkBox1.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                CheckBox checkBox = (CheckBox) event.getSource();
                Window.alert("CheckBox is " + (checkBox.getValue() ? "" : "not ") + "checked");
            }
        });

        // Add checkboxes to the root panel.
        VerticalPanel verticalPanel6 = new VerticalPanel();
        verticalPanel6.setSpacing(10);
        verticalPanel6.add(checkBox1);
        verticalPanel6.add(checkBox2);

        // Create some radio buttons, all in one group 'radioGroup'.
        RadioButton radioButton1 = new RadioButton("radioGroup", "First");
        RadioButton radioButton2 = new RadioButton("radioGroup", "Second");
        RadioButton radioButton3 = new RadioButton("radioGroup", "Third");

        // Check 'First' by default.
        radioButton1.setValue(true);

        // disable 'Second' radio button
        radioButton2.setEnabled(false);

        // Add toggle button to the root panel.
        VerticalPanel verticalPanel7 = new VerticalPanel();
        verticalPanel7.setSpacing(10);
        verticalPanel7.add(radioButton1);
        verticalPanel7.add(radioButton2);
        verticalPanel7.add(radioButton3);

        // Make a new list box, adding a few items to it.
        ListBox listBox1 = new ListBox();
        listBox1.addItem("First");
        listBox1.addItem("Second");
        listBox1.addItem("Third");
        listBox1.addItem("Fourth");
        listBox1.addItem("Fifth");

        // Make a new list box, adding a few items to it.
        ListBox listBox2 = new ListBox();
        listBox2.addItem("First");
        listBox2.addItem("Second");
        listBox2.addItem("Third");
        listBox2.addItem("Fourth");
        listBox2.addItem("Fifth");

        // Make enough room for all five items
        listBox1.setVisibleItemCount(3);

        // setting itemcount value to 1 turns listbox into a drop-down list.
        listBox2.setVisibleItemCount(1);

        // Add listboxes to the root panel.
        VerticalPanel verticalPanel8 = new VerticalPanel();
        verticalPanel8.setSpacing(10);
        verticalPanel8.add(listBox1);
        verticalPanel8.add(listBox2);

        // create the suggestion data
        MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();
        oracle.add("A");
        oracle.add("AB");
        oracle.add("ABC");
        oracle.add("ABCD");
        oracle.add("B");
        oracle.add("BC");
        oracle.add("BCD");
        oracle.add("BCDE");
        oracle.add("C");
        oracle.add("CD");
        oracle.add("CDE");
        oracle.add("CDEF");
        oracle.add("D");
        oracle.add("DE");
        oracle.add("DEF");
        oracle.add("DEFG");

        // create the suggestion box and pass it the data created above
        SuggestBox suggestionBox = new SuggestBox(oracle);

        // set width to 200px.
        suggestionBox.setWidth("200");

        // Add suggestionbox to the root panel.
        VerticalPanel verticalPanel9 = new VerticalPanel();
        verticalPanel9.add(suggestionBox);

        // create textboxes
        TextBox textBox1 = new TextBox();
        TextBox textBox2 = new TextBox();

        // add text to text box
        textBox2.setText("Hello World!");

        // set textbox as readonly
        textBox2.setReadOnly(true);

        // Add text boxes to the root panel.
        VerticalPanel verticalPanel10 = new VerticalPanel();
        verticalPanel10.setSpacing(10);
        verticalPanel10.add(textBox1);
        verticalPanel10.add(textBox2);

        // create password textboxes
        PasswordTextBox passwordTextBox1 = new PasswordTextBox();
        PasswordTextBox passwordTextBox2 = new PasswordTextBox();

        // add text to text box
        passwordTextBox2.setText("hell@W@rld");

        // set textbox as readonly
        passwordTextBox2.setReadOnly(true);

        // Add text boxes to the root panel.
        VerticalPanel verticalPanel11 = new VerticalPanel();
        verticalPanel11.setSpacing(10);
        verticalPanel11.add(passwordTextBox1);
        verticalPanel11.add(passwordTextBox2);

        // create textarea elements
        TextArea textArea1 = new TextArea();
        TextArea textArea2 = new TextArea();

        // set width as 10 characters
        textArea1.setCharacterWidth(20);
        textArea2.setCharacterWidth(20);

        // set height as 5 lines
        textArea1.setVisibleLines(5);
        textArea2.setVisibleLines(5);

        // add text to text area
        textArea2.setText(" Hello World! \n Be Happy! \n Stay Cool!");

        // set textbox as readonly
        textArea2.setReadOnly(true);

        // Add text boxes to the root panel.
        VerticalPanel verticalPanel12 = new VerticalPanel();
        verticalPanel12.setSpacing(10);
        verticalPanel12.add(textArea1);
        verticalPanel12.add(textArea2);

        /*
         * create textbox and attach key down handler
         */
        TextBox textBox = new TextBox();
        textBox.addKeyDownHandler(new MyKeyDownHandler());

        /*
         * create button and attach click handler
         */
        Button button = new Button("Click Me!");
        button.addClickHandler(new MyClickHandler());

        VerticalPanel verticalPanel13 = new VerticalPanel();
        verticalPanel13.setSpacing(10);
        verticalPanel13.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        verticalPanel13.setSize("300", "100");
        verticalPanel13.add(textBox);
        verticalPanel13.add(button);

        DecoratorPanel decoratorPanel1 = new DecoratorPanel();
        decoratorPanel1.add(verticalPanel13);

        // Create an optional text box and add it to the root panel.
        OptionalTextBox otb = new OptionalTextBox("Want to explain the solution?");
        otb.setEnabled(true);

        RootPanel.get("gwtGreenButton").add(Btn1);
        RootPanel.get("gwtRedButton").add(Btn2);
        RootPanel.get("gwtLabelContainer").add(verticalPanel1);
        RootPanel.get("gwtHTMLContainer").add(verticalPanel2);
        RootPanel.get("gwtImageContainer").add(verticalPanel3);
        RootPanel.get("gwtAnchorContainer").add(verticalPanel4);
        RootPanel.get("gwtContainerButtons").add(verticalPanel5);
        RootPanel.get("gwtContainerCheckbox").add(verticalPanel6);
        RootPanel.get("gwtContainerRadioButton").add(verticalPanel7);
        RootPanel.get("gwtContainerListBox").add(verticalPanel8);
        RootPanel.get("gwtContainerSuggestBox").add(verticalPanel9);
        RootPanel.get("gwtContainerTextBox").add(verticalPanel10);
        RootPanel.get("gwtContainerPasswordTextBox").add(verticalPanel11);
        RootPanel.get("gwtContainerTextArea").add(verticalPanel12);
        RootPanel.get("gwtContainerEventHandling").add(decoratorPanel1);
        RootPanel.get("gwtContainerCustomWidget").add(otb);
    }

    /**
     * create a custom click handler which will call onClick method when button is
     * clicked.
     */
    private class MyClickHandler implements ClickHandler {
        @Override
        public void onClick(ClickEvent event) {
            Window.alert("Hello World!");
        }
    }

    /**
     * create a custom key down handler which will call onKeyDown method when a key
     * is down in textbox.
     */
    private class MyKeyDownHandler implements KeyDownHandler {
        @Override
        public void onKeyDown(KeyDownEvent event) {
            if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                Window.alert(((TextBox) event.getSource()).getValue());
            }
        }
    }

    private static class OptionalTextBox extends Composite implements ClickHandler {

        private TextBox textBox = new TextBox();
        private CheckBox checkBox = new CheckBox();
        private boolean enabled = true;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        /**
         * Style this widget using .optionalTextWidget CSS class.<br/>
         * Style textbox using .optionalTextBox CSS class.<br/>
         * Style checkbox using .optionalCheckBox CSS class.<br/>
         * Constructs an OptionalTextBox with the given caption on the check.
         * 
         * @param caption
         *            the caption to be displayed with the check box
         */
        public OptionalTextBox(String caption) {
            // place the check above the text box using a vertical panel.
            HorizontalPanel panel = new HorizontalPanel();
            // panel.setBorderWidth(1);
            panel.setSpacing(10);
            panel.add(checkBox);
            panel.add(textBox);

            // all composites must call initWidget() in their constructors.
            initWidget(panel);

            // set style name for entire widget
            //setStyleName("optionalTextWidget");

            // set style name for text box
            //textBox.setStyleName("optionalTextBox");

            // set style name for check box
            //checkBox.setStyleName("optionalCheckBox");
            textBox.setWidth("200");

            // Set the check box's caption, and check it by default.
            checkBox.setText(caption);
            checkBox.setValue(enabled);
            checkBox.addClickHandler(this);
            enableTextBox(enabled, checkBox.getValue());
        }

        public void onClick(ClickEvent event) {
            if (event.getSource() == checkBox) {
                // When the check box is clicked,
                // update the text box's enabled state.
                enableTextBox(enabled, checkBox.getValue());
            }
        }

        private void enableTextBox(boolean enable, boolean isChecked) {
            enable = (enable && isChecked) || (!enable && !isChecked);
            System.out.println("Enable: " + enable);
            textBox.setStyleDependentName("disabled", !enable);
            textBox.setEnabled(enable);
        }
    }
}
