package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.core.util.AbstractC1482d;

/* renamed from: androidx.media.i */
/* loaded from: classes2.dex */
final class C1835i implements InterfaceC1832f {

    /* renamed from: a */
    final MediaSessionManager.RemoteUserInfo f7553a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1835i(String str, int i11, int i12) {
        this.f7553a = AbstractC1834h.m9509a(str, i11, i12);
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1835i) {
            equals = this.f7553a.equals(((C1835i) obj).f7553a);
            return equals;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1482d.m7476b(this.f7553a);
    }
}
