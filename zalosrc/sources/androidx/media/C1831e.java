package androidx.media;

import android.os.Build;

/* renamed from: androidx.media.e */
/* loaded from: classes2.dex */
public final class C1831e {

    /* renamed from: a */
    InterfaceC1832f f7552a;

    public C1831e(String str, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7552a = new C1835i(str, i11, i12);
        } else {
            this.f7552a = new C1836j(str, i11, i12);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1831e)) {
            return false;
        }
        return this.f7552a.equals(((C1831e) obj).f7552a);
    }

    public int hashCode() {
        return this.f7552a.hashCode();
    }
}
