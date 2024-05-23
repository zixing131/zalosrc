package h50;

import android.net.Uri;
import fn0.AbstractC19074t;

/* renamed from: h50.b */
/* loaded from: classes5.dex */
public class C19881b {

    /* renamed from: a */
    private String f98052a;

    /* renamed from: b */
    private int f98053b;

    /* renamed from: c */
    private Uri f98054c;

    public C19881b(String str, int i11, Uri uri) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(uri, "uri");
        this.f98052a = str;
        this.f98053b = i11;
        this.f98054c = uri;
    }

    /* renamed from: a */
    public final int m103568a() {
        return this.f98053b;
    }

    /* renamed from: b */
    public final String m103569b() {
        return this.f98052a;
    }

    /* renamed from: c */
    public final Uri m103570c() {
        return this.f98054c;
    }

    /* renamed from: d */
    public final void m103571d(Uri uri) {
        AbstractC19074t.m100208f(uri, "<set-?>");
        this.f98054c = uri;
    }
}
