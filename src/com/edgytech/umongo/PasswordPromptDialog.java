package com.edgytech.umongo;

import com.edgytech.swingfast.FormDialog;

public class PasswordPromptDialog extends FormDialog {

	public enum Item {
		resource, password;
	}

	public PasswordPromptDialog() {
		setEnumBinding(Item.values(), null);
	}

	public void setResource(String resource) {
		setStringFieldValue(Item.resource, resource);
	}

	public String getPassword() {
		return getStringFieldValue(Item.password);
	}
}
