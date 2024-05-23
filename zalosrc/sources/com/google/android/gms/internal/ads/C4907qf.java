package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qf */
/* loaded from: classes2.dex */
public final class C4907qf extends AbstractCallableC4316ag {

    /* renamed from: i */
    private List f26736i;

    public C4907qf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "tPxcLkiesd8JzrYIyuRbLGxWAQfsX+C1jrJaS2rsRu6lU/ve1b9hEzSSzo6VwqXx", "0RWQk7vrKrAXtxwBYq7T9nI/JnUnK0yiZtx30+mk7/g=", c4939ra, i11, 31);
        this.f26736i = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        this.f17024e.m26016S(-1L);
        this.f17024e.m26012N(-1L);
        if (this.f26736i == null) {
            this.f26736i = (List) this.f17025f.invoke(null, this.f17021b.m24240b());
        }
        List list = this.f26736i;
        if (list != null && list.size() == 2) {
            synchronized (this.f17024e) {
                this.f17024e.m26016S(((Long) this.f26736i.get(0)).longValue());
                this.f17024e.m26012N(((Long) this.f26736i.get(1)).longValue());
            }
        }
    }
}
