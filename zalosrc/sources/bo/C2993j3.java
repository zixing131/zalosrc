package bo;

import java.util.ArrayList;
import java.util.List;
import p304ks.C21933s;

/* renamed from: bo.j3 */
/* loaded from: classes4.dex */
public class C2993j3 {

    /* renamed from: a */
    private final C3000l0 f11822a;

    /* renamed from: b */
    private C21933s f11823b;

    /* renamed from: c */
    private boolean f11824c = false;

    /* renamed from: d */
    private boolean f11825d = false;

    /* renamed from: e */
    private boolean f11826e = false;

    public C2993j3(C21933s c21933s) {
        this.f11823b = c21933s;
        C3000l0 c3000l0 = new C3000l0();
        this.f11822a = c3000l0;
        c3000l0.f11895q = "feed_content_Id_sug_friend";
        c3000l0.f11877Z = C21933s.m114404I().f107899Z.f107996b;
        c3000l0.f11876Y = new ArrayList();
    }

    /* renamed from: a */
    public C3000l0 m14190a() {
        return this.f11822a;
    }

    /* renamed from: b */
    public boolean m14191b() {
        return this.f11825d;
    }

    /* renamed from: c */
    public boolean m14192c() {
        List list = this.f11822a.f11876Y;
        if (list == null || !this.f11825d || !this.f11826e || list.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m14193d() {
        return this.f11824c;
    }

    /* renamed from: e */
    public void m14194e(ArrayList arrayList) {
        this.f11822a.f11876Y = arrayList;
    }

    /* renamed from: f */
    public void m14195f(boolean z11) {
        this.f11825d = z11;
        this.f11826e = z11;
    }

    /* renamed from: g */
    public void m14196g(boolean z11) {
        this.f11826e = z11;
    }

    /* renamed from: h */
    public void m14197h(boolean z11) {
        this.f11824c = z11;
    }

    public C2993j3() {
        C3000l0 c3000l0 = new C3000l0();
        this.f11822a = c3000l0;
        c3000l0.f11876Y = new ArrayList();
    }
}
