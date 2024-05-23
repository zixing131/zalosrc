package p476r9;

import java.net.URL;
import java.net.URLConnection;

/* renamed from: r9.m */
/* loaded from: classes3.dex */
public class C25705m {

    /* renamed from: a */
    private final URL f122728a;

    public C25705m(URL url) {
        this.f122728a = url;
    }

    /* renamed from: a */
    public URLConnection m132619a() {
        return this.f122728a.openConnection();
    }

    public String toString() {
        return this.f122728a.toString();
    }
}
