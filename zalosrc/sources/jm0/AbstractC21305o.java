package jm0;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: jm0.o */
/* loaded from: classes.dex */
public abstract class AbstractC21305o {
    /* renamed from: a */
    public static String m110332a(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* renamed from: b */
    public static String m110333b(Map map, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            boolean z11 = true;
            for (String str3 : map.keySet()) {
                if (!z11) {
                    sb2.append("&");
                }
                String m110332a = m110332a(str3, str);
                String str4 = (String) map.get(str3);
                if (str4 != null) {
                    str2 = m110332a(str4, str);
                } else {
                    str2 = "";
                }
                sb2.append(m110332a);
                sb2.append("=");
                sb2.append(str2);
                z11 = false;
            }
        }
        return sb2.toString();
    }
}
