package p566v3;

import p566v3.C27502j;

/* renamed from: v3.i */
/* loaded from: classes2.dex */
public class C27501i extends C27502j {

    /* renamed from: u */
    boolean f129353u;

    /* renamed from: v3.i$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo40013a(String str);
    }

    public C27501i(C27502j.a aVar) {
        super(aVar.f129374a, aVar.f129375b, aVar.f129376c, aVar.f129377d, aVar.f129378e, aVar.f129379f, aVar.f129380g, aVar.f129381h, aVar.f129382i, aVar.f129383j, aVar.f129384k, aVar.f129385l, aVar.f129386m, aVar.f129387n, aVar.f129388o);
        this.f129353u = false;
    }

    /* renamed from: s */
    public boolean m140613s(int i11) {
        if (!this.f129353u) {
            float f11 = i11;
            if (f11 >= m140620f() && f11 <= m140627m()) {
                this.f129353u = true;
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: t */
    public void m140614t() {
        this.f129353u = false;
    }

    public C27501i(C27501i c27501i) {
        super(c27501i);
        this.f129353u = false;
    }
}
