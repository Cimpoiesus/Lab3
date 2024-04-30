class Pagina {
    Paragraf[] paragrafe;

    Pagina(Paragraf... paragrafe) {
        this.paragrafe = paragrafe;
    }

    public void searchPattern(String regex) {
        for (Paragraf paragraf : paragrafe) {
            paragraf.searchPattern(regex);
        }
    }

    public void searchPattern(String regex, int paragraphIndex) {
        if (paragraphIndex >= 0 && paragraphIndex < paragrafe.length) {
            paragrafe[paragraphIndex].searchPattern(regex);
        } else {
            System.out.println("Invalid paragraph index: " + paragraphIndex);
        }
    }
}