package p586vt;

import android.text.TextUtils;
import e40.C18198a;
import fn0.AbstractC19074t;
import p586vt.AbstractC28617b;

/* renamed from: vt.h */
/* loaded from: classes4.dex */
public final class C28623h {

    /* renamed from: a */
    public static final C28623h f132712a = new C28623h();

    private C28623h() {
    }

    /* renamed from: a */
    public final AbstractC28617b.a m143155a(String str) {
        AbstractC19074t.m100208f(str, "key");
        if (TextUtils.isEmpty(str) || !AbstractC19074t.m100204b("PcTransferMessage", str)) {
            return null;
        }
        return new C18198a.b();
    }
}
