package org.sdet.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class VersionValidation {
    public static void main(String[] args) {
        System.out.println(isVersionEqual("127.0.0.0", "127.0.0.0"));
        System.out.println(isVersionEqual("127.0.0.1", "127.0.0.0"));
        System.out.println(isVersionEqual("127.0.0.0", "127.0.0.0.0"));
        System.out.println(isVersionEqual("127.0.0.1", "127.0.1.0"));
    }

    private static int isVersionEqual(String currentVersion, String newVersion) {
        currentVersion = String.join("", currentVersion.split("\\."));
        newVersion = String.join("", newVersion.split("\\."));

        int currentVersionLen = currentVersion.length();
        int newVersionLen = newVersion.length();

        if(currentVersionLen < newVersionLen) {
            currentVersion = appendZero(currentVersion, newVersionLen - currentVersionLen);
        } else if (currentVersionLen > newVersionLen) {
            newVersion = appendZero(newVersion, currentVersionLen - newVersionLen);
        }

        int currentVersionInt = Integer.parseInt(currentVersion);
        int newVersionInt = Integer.parseInt(newVersion);

        return Integer.compare(currentVersionInt, newVersionInt);
    }

    private static String appendZero(String version, int count) {
        return version + "0".repeat(Math.max(0, count));
    }
}
