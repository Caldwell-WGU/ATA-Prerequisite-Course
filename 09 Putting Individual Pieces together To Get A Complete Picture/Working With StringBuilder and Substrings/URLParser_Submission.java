package com.ata;

public class URLParser {

    /*
    * Gets the protocol of an url
    *
    * @param url the url as a String
    * @return the protocol part of the url
    * */
    public String getProtocol(String url) {
        // TODO: Step 1 - Replace return null to return the protocol of url
        int index = url.indexOf(":");
        return url.substring(0, index);
    }

    /*
     * Gets the hostname of an url
     *
     * @param url the url as a String
     * @return the hostname part of the url
     * */
    public String getHostname(String url) {
        // TODO: Step 2 - Replace return null to return the hostname of url
        int startIndex = url.indexOf("//") + 2;
        int endIndex = url.indexOf(".com") + 4;
        return url.substring(startIndex, endIndex);
    }

    /*
     * Gets the path of an url
     *
     * @param url the url as a String
     * @return the path part of the url
     * */
    public String getPath(String url) {
        // TODO: Step 3 - Replace return null to return the path of url
        int startIndex = url.indexOf(".com") + 5;
        int endIndex = url.length();
        return url.substring(startIndex, endIndex);
    }

}
