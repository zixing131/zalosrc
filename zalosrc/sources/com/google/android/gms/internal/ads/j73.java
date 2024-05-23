package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class j73 extends x63 {

    /* renamed from: p */
    private final Object f22711p;

    /* renamed from: q */
    private int f22712q;

    /* renamed from: r */
    final /* synthetic */ l73 f22713r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j73(l73 l73Var, int i11) {
        this.f22713r = l73Var;
        this.f22711p = l73.m24149i(l73Var, i11);
        this.f22712q = i11;
    }

    /* renamed from: a */
    private final void m23559a() {
        int m24138A;
        int i11 = this.f22712q;
        if (i11 == -1 || i11 >= this.f22713r.size() || !e53.m21617a(this.f22711p, l73.m24149i(this.f22713r, this.f22712q))) {
            m24138A = this.f22713r.m24138A(this.f22711p);
            this.f22712q = m24138A;
        }
    }

    @Override // com.google.android.gms.internal.ads.x63, java.util.Map.Entry
    public final Object getKey() {
        return this.f22711p;
    }

    @Override // com.google.android.gms.internal.ads.x63, java.util.Map.Entry
    public final Object getValue() {
        Map m24161p = this.f22713r.m24161p();
        if (m24161p != null) {
            return m24161p.get(this.f22711p);
        }
        m23559a();
        int i11 = this.f22712q;
        if (i11 == -1) {
            return null;
        }
        return l73.m24152n(this.f22713r, i11);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m24161p = this.f22713r.m24161p();
        if (m24161p != null) {
            return m24161p.put(this.f22711p, obj);
        }
        m23559a();
        int i11 = this.f22712q;
        if (i11 == -1) {
            this.f22713r.put(this.f22711p, obj);
            return null;
        }
        Object m24152n = l73.m24152n(this.f22713r, i11);
        l73.m24154q(this.f22713r, this.f22712q, obj);
        return m24152n;
    }
}
