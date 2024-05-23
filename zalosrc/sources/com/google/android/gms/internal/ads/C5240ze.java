package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.ze */
/* loaded from: classes2.dex */
public final class C5240ze extends AbstractCallableC4316ag {

    /* renamed from: j */
    private static final C4353bg f31474j = new C4353bg();

    /* renamed from: i */
    private final Context f31475i;

    public C5240ze(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12, Context context) {
        super(c4719le, "joxZSCFIfSio2J1Z0g3HMtlcDGNvogfMyrj1e2b+qPNv6DXnDVXfwkgCXW9zFWFC", "iJiFXDBrMwFOGpG8WmWNKc3sGwXbWv8N6fPQac0mMm0=", c4939ra, i11, 29);
        this.f31475i = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        this.f17024e.m26042s0("E");
        AtomicReference m20512a = f31474j.m20512a(this.f31475i.getPackageName());
        if (m20512a.get() == null) {
            synchronized (m20512a) {
                try {
                    if (m20512a.get() == null) {
                        m20512a.set((String) this.f17025f.invoke(null, this.f31475i));
                    }
                } finally {
                }
            }
        }
        String str = (String) m20512a.get();
        synchronized (this.f17024e) {
            this.f17024e.m26042s0(AbstractC5163xb.m27875a(str.getBytes(), true));
        }
    }
}
