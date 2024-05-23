package ht;

import android.graphics.Bitmap;
import et.C18596c;
import p169fu.AbstractC19146a;

/* renamed from: ht.e */
/* loaded from: classes4.dex */
public class C20125e {

    /* renamed from: a */
    private C18596c f99241a;

    /* renamed from: b */
    private C20124d f99242b;

    public C20125e(C18596c c18596c) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OffScreenFilter(");
        sb2.append(c18596c);
        sb2.append(")");
        this.f99241a = c18596c;
        this.f99242b = new C20124d(c18596c);
    }

    /* renamed from: a */
    public void m104741a() {
        this.f99241a.destroy();
        this.f99242b.m104735f();
    }

    /* renamed from: b */
    public Bitmap m104742b(Bitmap bitmap) {
        return m104743c(bitmap, false);
    }

    /* renamed from: c */
    public Bitmap m104743c(Bitmap bitmap, boolean z11) {
        C20126f c20126f = new C20126f(bitmap.getWidth(), bitmap.getHeight());
        c20126f.m104749f(this.f99242b);
        this.f99242b.m104738m(this.f99241a);
        this.f99242b.m104739n(bitmap, z11);
        Bitmap m104748c = c20126f.m104748c();
        if ((m104748c == null || AbstractC19146a.m100464c(m104748c)) && !bitmap.isRecycled()) {
            return bitmap;
        }
        this.f99242b.m104735f();
        c20126f.m104747b();
        return m104748c;
    }
}
