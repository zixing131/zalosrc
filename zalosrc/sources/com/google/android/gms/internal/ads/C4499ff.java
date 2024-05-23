package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ff */
/* loaded from: classes2.dex */
public final class C4499ff extends AbstractCallableC4316ag {
    public C4499ff(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", c4939ra, i11, 24);
    }

    /* renamed from: c */
    private final void m22003c() {
        AdvertisingIdClient m24245h = this.f17021b.m24245h();
        if (m24245h == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = m24245h.getInfo();
            String m25169d = AbstractC4831oe.m25169d(info.getId());
            if (m25169d != null) {
                synchronized (this.f17024e) {
                    this.f17024e.m26051x0(m25169d);
                    this.f17024e.m26049w0(info.isLimitAdTrackingEnabled());
                    this.f17024e.m26022Y(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        if (!this.f17021b.m24252q()) {
            synchronized (this.f17024e) {
                this.f17024e.m26051x0((String) this.f17025f.invoke(null, this.f17021b.m24240b()));
            }
            return;
        }
        m22003c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: b */
    public final Void mo20112b() {
        if (this.f17021b.m24253r()) {
            super.mo20112b();
            return null;
        }
        if (this.f17021b.m24252q()) {
            m22003c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        mo20112b();
        return null;
    }
}
