package com.example.ch4.custom;

import java.beans.PropertyEditorSupport;

public class NewPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws java.lang.IllegalArgumentException {
        String[] name = text.split("\\s");
        setValue(new FullName(name[0], name[1]));
    }

}
