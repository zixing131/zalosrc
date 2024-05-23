package me0;

import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import im0.AbstractC20626a;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mm0.AbstractC23349d;

/* renamed from: me0.u2 */
/* loaded from: classes.dex */
public abstract class AbstractC23228u2 {

    /* renamed from: a */
    private static final Pattern f112606a = Pattern.compile("^bytes[ =-]([0-9]+)-(([0-9]+)/?([0-9]+))?");

    /* renamed from: b */
    private static final int f112607b = 77;

    /* renamed from: c */
    private static final int f112608c = 77 + 20;

    /* renamed from: me0.u2$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        private final int f112609a;

        /* renamed from: b */
        private final int f112610b;

        /* renamed from: c */
        private final int f112611c;

        public a(int i11, int i12, int i13) {
            this.f112610b = i11;
            this.f112609a = i12;
            this.f112611c = i13;
        }

        /* renamed from: a */
        public int m119707a() {
            return this.f112610b;
        }

        /* renamed from: b */
        public int m119708b() {
            return this.f112611c;
        }

        public String toString() {
            return "Range[" + this.f112610b + "-" + this.f112609a + "/" + this.f112611c + "]";
        }
    }

    /* renamed from: a */
    public static String m119702a(String str) {
        if (!str.matches("(?i)^(http://|https://).*")) {
            str = "http://" + str;
        }
        try {
            String host = new URI(str).getHost();
            if (host != null) {
                if (host.startsWith("www.")) {
                    str = host.substring(4);
                    return str;
                }
                return host;
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return str;
        }
    }

    /* renamed from: b */
    public static Map m119703b() {
        HashMap hashMap = new HashMap();
        String str = "";
        if (CoreUtility.m93148a() != null) {
            String mo100075b = CoreUtility.m93148a().mo100075b();
            if (mo100075b == null) {
                mo100075b = "";
            }
            hashMap.put("viewerkey", mo100075b);
        }
        String m93451f = CoreUtils.m93451f();
        if (m93451f != null) {
            str = m93451f;
        }
        hashMap.put("zcid", str);
        hashMap.put("platform", "1");
        hashMap.put("clientVersion", String.valueOf(CoreUtility.f89236l));
        hashMap.put("networktype", String.valueOf(AbstractC20626a.m107387c()));
        hashMap.put("operator", String.valueOf(AbstractC23349d.m122766d()));
        return hashMap;
    }

    /* renamed from: c */
    private static int m119704c(String str) {
        long parseLong = Long.parseLong(str);
        if (parseLong >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) parseLong;
    }

    /* renamed from: d */
    public static a m119705d(String str) {
        int i11;
        Matcher matcher = f112606a.matcher(str);
        if (matcher.matches()) {
            int m119704c = m119704c(matcher.group(1));
            int i12 = -1;
            if (matcher.group(3) != null && matcher.group(3).length() != 0) {
                int m119704c2 = m119704c(matcher.group(3));
                if (matcher.group(4) != null && matcher.group(4).length() != 0) {
                    i11 = m119704c(matcher.group(4));
                    i12 = m119704c2;
                    return new a(m119704c, i12, i11);
                }
                i12 = m119704c2;
            }
            i11 = -1;
            return new a(m119704c, i12, i11);
        }
        return null;
    }

    /* renamed from: e */
    public static void m119706e(URLConnection uRLConnection) {
        try {
            if (!(uRLConnection instanceof HttpURLConnection)) {
                return;
            }
            uRLConnection.getRequestProperties();
            for (Map.Entry entry : m119703b().entrySet()) {
                uRLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
