package me.NeoCode.test;

import java.io.IOException;

import me.NeoCode.main.Translator;

public class Main {

	static Translator translator;

	public static void main(String[] args) {
		translator = new Translator();
		translator.setUrl("https://raw.githubusercontent.com/xRealNeon/SimpleTranslator/master/TestLangs/");
		System.out.println("Following Langs:");
		try {
			for (String lang : translator.getLangs()) {
				System.out.println(lang);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		translator.setLang("en");
		try {
			translator.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(translator.getText("test"));
	}

}
