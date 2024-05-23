package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uf */
/* loaded from: classes2.dex */
public final class C5055uf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private final ViewOnAttachStateChangeListenerC4980se f28842i;

    /* renamed from: j */
    private long f28843j;

    public C5055uf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12, ViewOnAttachStateChangeListenerC4980se viewOnAttachStateChangeListenerC4980se) {
        super(c4719le, "mkunJHFc5vhTAVOcsaNSYx7OvFB6slgbORGrA/joIDO0IYq5rQvDcAbp2AI6CPUh", "k8GEQUoJxJPI/0jAlfeUix8QD7WaaXAfMcSQAzrpgrU=", c4939ra, i11, 53);
        this.f28842i = viewOnAttachStateChangeListenerC4980se;
        if (viewOnAttachStateChangeListenerC4980se != null) {
            this.f28843j = viewOnAttachStateChangeListenerC4980se.m26284a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        if (this.f28842i != null) {
            this.f17024e.m26009H(((Long) this.f17025f.invoke(null, Long.valueOf(this.f28843j))).longValue());
        }
    }
}
