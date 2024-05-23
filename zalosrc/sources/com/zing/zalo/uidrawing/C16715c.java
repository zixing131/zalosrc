package com.zing.zalo.uidrawing;

import android.graphics.drawable.Drawable;

/* renamed from: com.zing.zalo.uidrawing.c */
/* loaded from: classes4.dex */
public final class C16715c {

    /* renamed from: a */
    C16719g f84689a;

    /* renamed from: b */
    Drawable f84690b;

    /* renamed from: c */
    boolean f84691c;

    /* renamed from: d */
    boolean f84692d;

    /* renamed from: e */
    boolean f84693e;

    /* renamed from: f */
    boolean f84694f = true;

    public C16715c(C16719g c16719g) {
        this.f84689a = c16719g;
    }

    /* renamed from: a */
    public C16715c m88997a(Drawable drawable) {
        if (this.f84690b != drawable) {
            this.f84690b = drawable;
            if (this.f84693e) {
                drawable.setCallback(this.f84689a);
            }
            this.f84689a.invalidate();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m88998b(int[] iArr) {
        Drawable drawable = this.f84690b;
        if (drawable != null && this.f84693e) {
            return drawable.setState(iArr);
        }
        return false;
    }
}
