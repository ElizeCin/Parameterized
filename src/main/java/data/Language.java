package data;

public enum Language {
    EN("en_GB"),
    ES("es_ES"),
    PL("pl_PL");
//    FR("fr"),
//    UA("uk");
//    RU("ru"),
//    DE("de");

        final String lang;

        Language(String lang) {
            this.lang = lang;
        }

        public String getLang() {
            return lang;
        }
}
