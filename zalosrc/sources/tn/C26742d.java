package tn;

import ag0.AbstractC0837p0;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23160o0;
import me0.C23055e5;
import mm0.AbstractC23349d;
import p645xh.C29628e;
import tn.C26736a;

/* renamed from: tn.d */
/* loaded from: classes4.dex */
public final class C26742d {

    /* renamed from: a */
    private final C10873l f126853a;

    /* renamed from: b */
    private final C26736a.c f126854b;

    /* renamed from: c */
    private final String f126855c;

    /* renamed from: d */
    private volatile boolean f126856d;

    /* renamed from: e */
    private boolean f126857e;

    public C26742d(C10873l c10873l, C26736a.c cVar) {
        AbstractC19074t.m100208f(c10873l, "comment");
        this.f126853a = c10873l;
        this.f126854b = cVar;
        String simpleName = C26742d.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        this.f126855c = simpleName;
        this.f126856d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m137545g(C26742d c26742d) {
        int i11;
        AbstractC19074t.m100208f(c26742d, "this$0");
        while (c26742d.f126856d) {
            if (c26742d.f126857e) {
                c26742d.f126853a.m56462d();
                c26742d.m137546b();
                return;
            }
            if (c26742d.f126853a.m56435C() != 3 && c26742d.f126853a.m56435C() != 2 && c26742d.f126853a.m56435C() != 5) {
                if (!c26742d.f126853a.m56453S()) {
                    c26742d.f126853a.m56462d();
                    c26742d.f126853a.m56436C0(-101);
                    c26742d.m137546b();
                } else if (c26742d.f126853a.m56435C() == 1 || c26742d.f126853a.m56435C() == 4) {
                    if (!C23055e5.m118273h(false, 1, null)) {
                        c26742d.m137549e(5000L);
                    } else if (!C29628e.m147249E0().m93432x()) {
                        c26742d.m137549e(3000L);
                    } else {
                        int i12 = c26742d.f126853a.f54890F;
                        if (i12 > 0) {
                            c26742d.m137549e(AbstractC23160o0.m119261j0(i12, 500L));
                        }
                        c26742d.f126853a.m56454W();
                        if (AbstractC23349d.m122770h()) {
                            i11 = 200;
                        } else {
                            i11 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                        }
                        c26742d.m137549e(i11);
                    }
                }
            } else {
                c26742d.m137546b();
            }
        }
    }

    /* renamed from: b */
    public final void m137546b() {
        this.f126856d = false;
        C26736a.c cVar = this.f126854b;
        if (cVar != null) {
            cVar.mo137543a(this);
        }
    }

    /* renamed from: c */
    public final C10873l m137547c() {
        return this.f126853a;
    }

    /* renamed from: d */
    public final String m137548d() {
        String m56493u = this.f126853a.m56493u();
        AbstractC19074t.m100207e(m56493u, "getCommentId(...)");
        return m56493u;
    }

    /* renamed from: e */
    public final void m137549e(long j11) {
        try {
            Thread.sleep(j11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    public final void m137550f() {
        this.f126856d = true;
        this.f126853a.m56504z0(System.currentTimeMillis());
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: tn.c
            @Override // java.lang.Runnable
            public final void run() {
                C26742d.m137545g(C26742d.this);
            }
        });
    }
}
