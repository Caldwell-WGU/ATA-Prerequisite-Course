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
        int endIdx = url.indexOf(":");
        return url.substring(0, endIdx);
    }

    /*
     * Gets the hostname of an url
     *
     * @param url the url as a String
     * @return the hostname part of the url
     * */
    public String getHostname(String url) {
        // TODO: Step 2 - Replace return null to return the hostname of url
        int protocolEnd = getProtocol(url).length();
        int startIdx = protocolEnd + 3;
        int endIdx = url.indexOf("/", startIdx);
        return url.substring(startIdx, endIdx);
    }

    /*
     * Gets the path of an url
     *
     * @param url the url as a String
     * @return the path part of the url
     * */
    public String getPath(String url) {
        // TODO: Step 3 - Replace return null to return the path of url
        int protocolSize = getProtocol(url).length();
        int hostnameSize = getHostname(url).length();
        int startIdx = protocolSize + 3 + hostnameSize + 1;
        return url.substring(startIdx);
    }
}
