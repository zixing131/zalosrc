package sj0;

import android.graphics.drawable.Drawable;

/* renamed from: sj0.u */
/* loaded from: classes7.dex */
public final class C26296u {

    /* renamed from: a */
    private int f124906a;

    /* renamed from: b */
    private Drawable f124907b;

    /* renamed from: a */
    public final Drawable m135366a() {
        return this.f124907b;
    }

    /* renamed from: b */
    public final C26276a m135367b() {
        Drawable drawable = this.f124907b;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof C26276a) {
            return (C26276a) drawable;
        }
        if (!(drawable instanceof C26282g)) {
            return null;
        }
        C26282g c26282g = (C26282g) drawable;
        if (!(c26282g.m135247e() instanceof C26276a)) {
            return null;
        }
        return (C26276a) c26282g.m135247e();
    }

    /* renamed from: c */
    public final int m135368c() {
        return this.f124906a;
    }

    /* renamed from: d */
    public final void m135369d(Drawable drawable, int i11) {
        this.f124907b = drawable;
        this.f124906a = i11;
    }
}
