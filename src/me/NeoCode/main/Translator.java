package me.NeoCode.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Translator {

	private String url;
	private String lang;
	private ArrayList<Tstring> Tstrings;

	public Translator() {
		Tstrings = new ArrayList<Tstring>();
	}

	public ArrayList<String> getLangs() throws IOException {
		return getUrl(url + "langs");
	}

	public void load() throws IOException {
		Tstrings.clear();
		String[] split;
		for (String index : getUrl(url + "langs/" + lang.toLowerCase() + ".lang")) {
			split = index.split("=");
			Tstrings.add(new Tstring(split[0], split[1]));
		}
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return lang;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private ArrayList<String> getUrl(String url) throws IOException {
		URL link = new URL(url);
		BufferedReader in = new BufferedReader(new InputStreamReader(link.openStream()));
		String line;
		ArrayList<String> list = new ArrayList<String>();

		while ((line = in.readLine()) != null) {
			list.add(line);
		}
		return list;
	}

	public class Tstring {

		public Tstring(String adress, String text) {
			this.text = text;
			this.adress = adress;
		}

		private String text;
		private String adress;

		public String getAdress() {
			return adress;
		}

		public String getText() {
			return text;
		}
	}

}
