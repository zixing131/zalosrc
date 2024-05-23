package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;

/* renamed from: com.google.android.gms.internal.ads.xf */
/* loaded from: classes2.dex */
public final class C5167xf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private final View f30436i;

    public C5167xf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12, View view) {
        super(c4719le, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", c4939ra, i11, 57);
        this.f30436i = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        if (this.f30436i != null) {
            Boolean bool = (Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20964D2);
            Boolean bool2 = (Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20960C8);
            C4869pe c4869pe = new C4869pe((String) this.f17025f.invoke(null, this.f30436i, this.f17021b.m24240b().getResources().getDisplayMetrics(), bool, bool2));
            C4495fb m22396F = C4532gb.m22396F();
            m22396F.m21981r(c4869pe.f26181a.longValue());
            m22396F.m21983u(c4869pe.f26182b.longValue());
            m22396F.m21984v(c4869pe.f26183c.longValue());
            if (bool2.booleanValue()) {
                m22396F.m21982s(c4869pe.f26185e.longValue());
            }
            if (bool.booleanValue()) {
                m22396F.m21980q(c4869pe.f26184d.longValue());
            }
            this.f17024e.m26018U((C4532gb) m22396F.m25898n());
        }
    }
}
