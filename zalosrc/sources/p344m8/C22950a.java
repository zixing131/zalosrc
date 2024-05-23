package p344m8;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p153f8.C18821f;

/* renamed from: m8.a */
/* loaded from: classes3.dex */
public class C22950a {

    /* renamed from: a */
    private final String f111668a;

    /* renamed from: b */
    private final Map f111669b;

    /* renamed from: c */
    private final Map f111670c = new HashMap();

    public C22950a(String str, Map map) {
        this.f111668a = str;
        this.f111669b = map;
    }

    /* renamed from: a */
    private String m117678a(Map map) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() == null) {
            str = "";
        } else {
            str = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb2.append(str);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            if (entry2.getValue() == null) {
                str2 = "";
            } else {
                str2 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private String m117679b(String str, Map map) {
        String m117678a = m117678a(map);
        if (m117678a.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                m117678a = "&" + m117678a;
            }
            return str + m117678a;
        }
        return str + "?" + m117678a;
    }

    /* renamed from: e */
    private String m117680e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    /* renamed from: c */
    public C22952c m117681c() {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String m117680e = null;
        inputStream = null;
        try {
            String m117679b = m117679b(this.f111668a, this.f111669b);
            C18821f.m98795f().m98802i("GET Request URL: " + m117679b);
            httpsURLConnection = (HttpsURLConnection) new URL(m117679b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f111670c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        m117680e = m117680e(inputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C22952c(responseCode, m117680e);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    /* renamed from: d */
    public C22950a m117682d(String str, String str2) {
        this.f111670c.put(str, str2);
        return this;
    }
}
