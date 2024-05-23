package tn;

import ag0.AbstractC0837p0;
import bo.C3000l0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23160o0;
import me0.C23055e5;
import mm0.AbstractC23349d;
import p645xh.C29628e;
import tn.C26761p;

/* renamed from: tn.u */
/* loaded from: classes4.dex */
public final class C26766u {

    /* renamed from: a */
    private final C3000l0 f126967a;

    /* renamed from: b */
    private final C26761p.g f126968b;

    /* renamed from: c */
    private final String f126969c;

    /* renamed from: d */
    private volatile boolean f126970d;

    /* renamed from: e */
    private boolean f126971e;

    public C26766u(C3000l0 c3000l0, C26761p.g gVar) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        this.f126967a = c3000l0;
        this.f126968b = gVar;
        String simpleName = C26766u.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        this.f126969c = simpleName;
        this.f126970d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m137775h(C26766u c26766u) {
        int i11;
        AbstractC19074t.m100208f(c26766u, "this$0");
        c26766u.f126967a.m14378z1(System.currentTimeMillis());
        while (c26766u.f126970d) {
            if (c26766u.f126971e) {
                c26766u.f126967a.m14351p();
                c26766u.f126967a.m14357r1();
                c26766u.m137777c();
                return;
            }
            if (c26766u.f126967a.m14339j0() != 3 && c26766u.f126967a.m14339j0() != 2 && c26766u.f126967a.m14339j0() != 5) {
                if (!c26766u.f126967a.m14307M0()) {
                    c26766u.f126967a.m14351p();
                    C3000l0 c3000l0 = c26766u.f126967a;
                    c3000l0.m14286C1(c3000l0.m14321Z());
                    c26766u.f126967a.m14357r1();
                    c26766u.m137777c();
                } else if (c26766u.f126967a.m14339j0() == 1 || c26766u.f126967a.m14339j0() == 4) {
                    if (!C23055e5.m118273h(false, 1, null)) {
                        C3000l0 c3000l02 = c26766u.f126967a;
                        c3000l02.m14376y1(c3000l02.f11894p0 - C26761p.m137741q().f126945c);
                        c26766u.m137780f(5000L);
                    } else if (!C29628e.m147249E0().m93432x()) {
                        c26766u.f126967a.m14357r1();
                        c26766u.m137780f(3000L);
                    } else {
                        int i12 = c26766u.f126967a.f11853B;
                        if (i12 > 0) {
                            c26766u.m137780f(AbstractC23160o0.m119261j0(i12, 500L));
                        }
                        c26766u.f126967a.m14357r1();
                        c26766u.f126967a.m14336h1();
                        if (AbstractC23349d.m122770h()) {
                            i11 = 200;
                        } else {
                            i11 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                        }
                        c26766u.m137780f(i11);
                    }
                }
            } else {
                c26766u.f126967a.m14357r1();
                c26766u.m137777c();
            }
        }
    }

    /* renamed from: b */
    public final void m137776b() {
        this.f126971e = true;
    }

    /* renamed from: c */
    public final void m137777c() {
        this.f126970d = false;
        C26761p.g gVar = this.f126968b;
        if (gVar != null) {
            gVar.mo137773a(this);
        }
    }

    /* renamed from: d */
    public final C3000l0 m137778d() {
        return this.f126967a;
    }

    /* renamed from: e */
    public final String m137779e() {
        String str = this.f126967a.f11895q;
        AbstractC19074t.m100207e(str, "feedContentId");
        return str;
    }

    /* renamed from: f */
    public final void m137780f(long j11) {
        try {
            Thread.sleep(j11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    public final void m137781g() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: tn.t
            @Override // java.lang.Runnable
            public final void run() {
                C26766u.m137775h(C26766u.this);
            }
        });
        this.f126970d = true;
    }
}
