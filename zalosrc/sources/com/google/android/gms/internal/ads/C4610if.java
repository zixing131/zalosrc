package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.if */
/* loaded from: classes2.dex */
public final class C4610if extends AbstractCallableC4316ag {

    /* renamed from: i */
    private static volatile Long f22163i;

    /* renamed from: j */
    private static final Object f22164j = new Object();

    public C4610if(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "N0mA2OgFUnHXhnZTWHrO10/LZw/fChWm76LMkbZzvR9G3lxQkMoE65IWMn9zBWSu", "uxIInGM9FQ+1gujg5A7z9IJxIqStl6tvqqzSbuEi494=", c4939ra, i11, 22);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        if (f22163i == null) {
            synchronized (f22164j) {
                try {
                    if (f22163i == null) {
                        f22163i = (Long) this.f17025f.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f17024e) {
            this.f17024e.m26005D0(f22163i.longValue());
        }
    }
}
