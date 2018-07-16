package me.NeoCode.test;

import java.io.IOException;

import me.NeoCode.main.Translator;

public class Main {

	static Translator translator;

	public static void main(String[] args) {
		// Init
		translator = new Translator();
		translator.setUrl("https://raw.githubusercontent.com/xRealNeon/SimpleTranslator/master/TestLangs/");

		// Get Langs
		System.out.println("Following Langs:");
		try {
			for (String lang : translator.getLangs()) {
				System.out.println(lang);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Set Lang
		translator.setLang("en");

		// Get Lang
		try {
			translator.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void example() {
		// Get Translated Text
		System.out.println(translator.getText("test"));
	}

}
