package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vf */
/* loaded from: classes2.dex */
public final class C5092vf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private static volatile Long f29292i;

    /* renamed from: j */
    private static final Object f29293j = new Object();

    public C5092vf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "5BhEc19mhLCb3gixLpO/usqpdcrz8iDHUvKRNr8tUAX9rUzF0wog6vEOJrftvcpW", "yZHUQ89G8fTgEsMNs0hBrXwZIrb4VL1iE12C/t/Y3UE=", c4939ra, i11, 33);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        if (f29292i == null) {
            synchronized (f29293j) {
                try {
                    if (f29292i == null) {
                        f29292i = (Long) this.f17025f.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f17024e) {
            this.f17024e.m26015R(f29292i.longValue());
        }
    }
}
