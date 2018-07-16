# SimpleTranslator
[![GitHub release](https://img.shields.io/github/release/xRealNeon/SimpleTranslator.svg)](https://GitHub.com/xRealNeon/SimpleTranslator/releases/)

```Java
	static Translator translator;

	public static void main(String[] args) {
		// Init
		translator = new Translator();
		translator.setUrl("your url");

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

	// Called from somewehre
	public void example() {
		// Get Translated Text
		System.out.println(translator.getText("your adress for example: login.failed"));
	}
```
