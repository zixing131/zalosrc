package com.zing.zalo.webview;

import android.webkit.URLUtil;
import com.zing.zalo.AbstractC16803z;
import java.net.URL;
import java.util.Map;

/* renamed from: com.zing.zalo.webview.k */
/* loaded from: classes5.dex */
public class C16793k {

    /* renamed from: a */
    private Map f85222a;

    /* renamed from: com.zing.zalo.webview.k$a */
    /* loaded from: classes5.dex */
    private static class a {

        /* renamed from: a */
        static final C16793k f85223a = new C16793k();
    }

    /* renamed from: a */
    public static C16793k m89710a() {
        return a.f85223a;
    }

    /* renamed from: b */
    public int m89711b(URL url) {
        if (url == null) {
            return 0;
        }
        Map map = this.f85222a;
        if (map != null && map.containsKey(url.getHost())) {
            return AbstractC16803z.icn_url_notsecure;
        }
        if (URLUtil.isHttpsUrl(url.toString())) {
            return AbstractC16803z.icn_url_https_secure;
        }
        return AbstractC16803z.icn_url_http;
    }
}
