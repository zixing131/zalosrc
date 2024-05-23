package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import fn0.AbstractC19074t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.os.b */
/* loaded from: classes2.dex */
public final class C1436b {

    /* renamed from: a */
    public static final C1436b f6266a = new C1436b();

    private C1436b() {
    }

    /* renamed from: a */
    public static final void m7337a(Bundle bundle, String str, IBinder iBinder) {
        AbstractC19074t.m100208f(bundle, "bundle");
        AbstractC19074t.m100208f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
