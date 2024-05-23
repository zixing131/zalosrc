package com.zing.zalo.webview;

import android.net.Uri;
import android.os.SystemClock;
import java.io.File;
import java.util.Random;
import me0.AbstractC23204s0;

/* loaded from: classes5.dex */
public abstract class Helpers {

    /* renamed from: a */
    public static Random f85180a = new Random(SystemClock.uptimeMillis());

    /* renamed from: b */
    private static final String f85181b = Helpers.class.getSimpleName();

    /* loaded from: classes5.dex */
    public static class GenerateSaveFileError extends Exception {
        private static final long serialVersionUID = 1;

        /* renamed from: p */
        String f85182p;

        public GenerateSaveFileError(String str) {
            this.f85182p = str;
        }
    }

    /* renamed from: a */
    private static String m89625a(String str) {
        String str2;
        int lastIndexOf;
        String decode = Uri.decode(str);
        if (decode != null && !decode.endsWith("/") && (lastIndexOf = decode.lastIndexOf(47) + 1) > 0) {
            str2 = decode.substring(lastIndexOf);
            if (str2.lastIndexOf(63) >= 0) {
                str2 = str2.substring(0, str2.indexOf(63));
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = String.valueOf(System.currentTimeMillis());
        }
        return str2.replaceAll("[^a-zA-Z0-9.\\-_]+", "_");
    }

    /* renamed from: b */
    private static String m89626b(String str) {
        String str2;
        File file = new File(AbstractC23204s0.m119555f());
        String m89625a = m89625a(str);
        int indexOf = m89625a.indexOf(46);
        if (indexOf < 0) {
            str2 = "";
        } else {
            String substring = m89625a.substring(indexOf);
            m89625a = m89625a.substring(0, indexOf);
            str2 = substring;
        }
        String path = new File(file, m89625a).getPath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("target file: ");
        sb2.append(path);
        sb2.append(str2);
        return m89627c(path, str2);
    }

    /* renamed from: c */
    private static String m89627c(String str, String str2) {
        String str3 = str + str2;
        if (!new File(str3).exists()) {
            return str3;
        }
        String str4 = str + "-";
        int i11 = 1;
        for (int i12 = 1; i12 < 1000000000; i12 *= 10) {
            for (int i13 = 0; i13 < 9; i13++) {
                String str5 = str4 + i11 + str2;
                if (!new File(str5).exists()) {
                    return str5;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("file with sequence number ");
                sb2.append(i11);
                sb2.append(" exists");
                i11 += f85180a.nextInt(i12) + 1;
            }
        }
        throw new GenerateSaveFileError("failed to generate an unused filename on internal download storage");
    }

    /* renamed from: d */
    public static String m89628d(String str) {
        return m89626b(str);
    }
}
