package py;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import bi0.AbstractC2807a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C17073y;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ia0.AbstractC20484a;
import id0.C20518d;
import kd0.C21693c;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mj0.AbstractC23322a;
import n80.C23626f;
import p354n3.C23528a;
import p374ny.AbstractC23957a;
import p379o3.C23995f;
import p379o3.C23999j;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;

/* renamed from: py.d */
/* loaded from: classes4.dex */
public final class C24929d extends AbstractC20484a {

    /* renamed from: J */
    private final C23528a f119553J;

    /* renamed from: K */
    private AbstractC23957a.b f119554K;

    /* renamed from: L */
    private boolean f119555L;

    /* renamed from: M */
    private boolean f119556M;

    /* renamed from: N */
    private final InterfaceC24854k f119557N;

    /* renamed from: O */
    private final InterfaceC24854k f119558O;

    /* renamed from: P */
    private final InterfaceC24854k f119559P;

    /* renamed from: Q */
    private final InterfaceC24854k f119560Q;

    /* renamed from: R */
    private final InterfaceC24854k f119561R;

    /* renamed from: py.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C21693c f119562l1;

        /* renamed from: m1 */
        final /* synthetic */ C24929d f119563m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f119564n1;

        a(C21693c c21693c, C24929d c24929d, boolean z11) {
            this.f119562l1 = c21693c;
            this.f119563m1 = c24929d;
            this.f119564n1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (AbstractC19074t.m100204b(this.f119562l1.m89133b0(), str) && c3979l != null) {
                    this.f119563m1.m129604u0().setImageInfo(c3979l, false);
                    this.f119562l1.mo111924u1(c3979l.m18839c());
                    ((C23626f) this.f119563m1.m106522i0()).m123847O1().mo44614b1(8);
                    if (!this.f119564n1) {
                        this.f119562l1.m89135c1(new C20518d().m106593j(200L));
                    }
                } else {
                    ((C23626f) this.f119563m1.m106522i0()).m123848P1().mo44614b1(8);
                    ((C23626f) this.f119563m1.m106522i0()).m123847O1().mo44614b1(0);
                    ((C23626f) this.f119563m1.m106522i0()).m123847O1().mo111925v1(this.f119563m1.m129605v0());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                ((C23626f) this.f119563m1.m106522i0()).m123848P1().mo44614b1(8);
                ((C23626f) this.f119563m1.m106522i0()).m123847O1().mo44614b1(0);
                ((C23626f) this.f119563m1.m106522i0()).m123847O1().mo111925v1(this.f119563m1.m129605v0());
            }
        }
    }

    /* renamed from: py.d$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(C24929d.this.f7784p.getContext(), 24.0f));
        }
    }

    /* renamed from: py.d$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(C24929d.this.f7784p.getContext(), 32.0f));
        }
    }

    /* renamed from: py.d$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(C24929d.this.f7784p.getContext(), 64.0f));
        }
    }

    /* renamed from: py.d$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3977j mo12V4() {
            Context context = C24929d.this.f7784p.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new C3977j(context);
        }
    }

    /* renamed from: py.d$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable mo12V4() {
            Context context = C24929d.this.f7784p.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return C27280g.m139660c(context, AbstractC23322a.zds_ic_link_line_32, AbstractC2807a.icon_02);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24929d(ViewGroup viewGroup, C23528a c23528a, final InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C23626f(r1));
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(viewGroup, "parent");
        AbstractC19074t.m100208f(c23528a, "aQ");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f119553J = c23528a;
        ((C23626f) m106522i0()).m90820w1().mo89093E0(false);
        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: py.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C24929d.m129596l0(InterfaceC18319c.this, this, view);
            }
        });
        this.f7784p.setOnLongClickListener(new View.OnLongClickListener() { // from class: py.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m129597m0;
                m129597m0 = C24929d.m129597m0(InterfaceC18319c.this, this, view);
                return m129597m0;
            }
        });
        m129210a = AbstractC24856m.m129210a(new d());
        this.f119557N = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new b());
        this.f119558O = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new c());
        this.f119559P = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new e());
        this.f119560Q = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new f());
        this.f119561R = m129210a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m129596l0(InterfaceC18319c interfaceC18319c, C24929d c24929d, View view) {
        AbstractC19074t.m100208f(c24929d, "this$0");
        if (interfaceC18319c != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final boolean m129597m0(InterfaceC18319c interfaceC18319c, C24929d c24929d, View view) {
        AbstractC19074t.m100208f(c24929d, "this$0");
        if (interfaceC18319c != null) {
            return true;
        }
        return true;
    }

    /* renamed from: q0 */
    private final void m129600q0(C21693c c21693c, String str) {
        ((C23626f) m106522i0()).m123848P1().mo44614b1(0);
        ((C23626f) m106522i0()).m123847O1().mo44614b1(0);
        ((C23626f) m106522i0()).m123847O1().mo111925v1(m129605v0());
        boolean m125696L2 = C23999j.m125696L2(str, C23278z2.m120126f0());
        c21693c.m89129Y0(str);
        ((C23528a) this.f119553J.m123612r(m129604u0())).m123579C(str, C23278z2.m120126f0(), new a(c21693c, this, m125696L2));
    }

    /* renamed from: r0 */
    private final int m129601r0() {
        return ((Number) this.f119558O.getValue()).intValue();
    }

    /* renamed from: s0 */
    private final int m129602s0() {
        return ((Number) this.f119559P.getValue()).intValue();
    }

    /* renamed from: t0 */
    private final int m129603t0() {
        return ((Number) this.f119557N.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public final C3977j m129604u0() {
        return (C3977j) this.f119560Q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public final Drawable m129605v0() {
        return (Drawable) this.f119561R.getValue();
    }

    /* renamed from: p0 */
    public final void m129606p0(AbstractC23957a.b bVar, Object obj) {
        boolean z11;
        int m129602s0;
        AbstractC19074t.m100208f(bVar, "item");
        this.f119554K = bVar;
        boolean z12 = false;
        if (obj == null) {
            if (bVar.m125369g().length() > 0) {
                ((C23626f) m106522i0()).m123849Q1().m111959G1(bVar.m125369g());
                ((C23626f) m106522i0()).m123849Q1().mo44614b1(0);
            } else {
                ((C23626f) m106522i0()).m123849Q1().mo44614b1(8);
            }
            ((C23626f) m106522i0()).m90805G1(bVar.m125368f());
            String m125367e = bVar.m125367e();
            if (m125367e != null && m125367e.length() != 0) {
                m129600q0(((C23626f) m106522i0()).m123848P1(), bVar.m125367e());
            } else {
                ((C23626f) m106522i0()).m123848P1().mo44614b1(8);
                ((C23626f) m106522i0()).m123847O1().mo44614b1(0);
                AbstractC23957a.c m125366d = bVar.m125366d();
                if (m125366d != null) {
                    C21693c m123847O1 = ((C23626f) m106522i0()).m123847O1();
                    Context context = ((C23626f) m106522i0()).getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    m123847O1.mo111925v1(C27280g.m139660c(context, m125366d.m125376b(), m125366d.m125378d()));
                    ((C23626f) m106522i0()).m123847O1().m89087B0(m125366d.m125375a());
                    C16718f m89106L = ((C23626f) m106522i0()).m123847O1().m89106L();
                    int m129603t0 = m129603t0();
                    if (m125366d.m125377c()) {
                        m129602s0 = m129601r0();
                    } else {
                        m129602s0 = m129602s0();
                    }
                    m89106L.m89041Y(m129603t0 - (m129602s0 * 2));
                }
            }
        }
        if (obj == null || AbstractC19074t.m100204b(obj, "OnSelectStateChanged")) {
            if (this.f119555L != bVar.m125370h()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f119555L = bVar.m125370h();
                ScanQRUIUtils.f49155a.m49620E((C16959c0) m106522i0(), bVar.m125370h(), AbstractC19074t.m100204b(obj, "OnSelectStateChanged"));
            }
            if (this.f119556M != bVar.m125371i()) {
                this.f119556M = bVar.m125371i();
                C17073y m90820w1 = ((C23626f) m106522i0()).m90820w1();
                boolean m125371i = bVar.m125371i();
                if (AbstractC19074t.m100204b(obj, "OnSelectStateChanged") && !z11) {
                    z12 = true;
                }
                m90820w1.m91362p1(m125371i, z12);
            }
        }
    }
}
