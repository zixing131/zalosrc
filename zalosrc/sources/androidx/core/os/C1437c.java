package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import fn0.AbstractC19074t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.os.c */
/* loaded from: classes2.dex */
public final class C1437c {

    /* renamed from: a */
    public static final C1437c f6267a = new C1437c();

    private C1437c() {
    }

    /* renamed from: a */
    public static final void m7338a(Bundle bundle, String str, Size size) {
        AbstractC19074t.m100208f(bundle, "bundle");
        AbstractC19074t.m100208f(str, "key");
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m7339b(Bundle bundle, String str, SizeF sizeF) {
        AbstractC19074t.m100208f(bundle, "bundle");
        AbstractC19074t.m100208f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
