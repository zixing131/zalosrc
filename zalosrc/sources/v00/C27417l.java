package v00;

import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mm0.AbstractC23349d;
import pm0.AbstractC24855l;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q20.C25094q;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;
import w00.AbstractC28684a;
import x00.InterfaceC29280a;

/* renamed from: v00.l */
/* loaded from: classes5.dex */
public final class C27417l {

    /* renamed from: a */
    public static final C27417l f129055a = new C27417l();

    /* renamed from: b */
    private static final InterfaceC24854k f129056b = AbstractC24855l.m129208a(b.f129065q);

    /* renamed from: c */
    private static final InterfaceC24854k f129057c = AbstractC24855l.m129208a(d.f129068q);

    /* renamed from: d */
    private static final InterfaceC24854k f129058d = AbstractC24855l.m129208a(c.f129066q);

    /* renamed from: e */
    private static final InterfaceC24854k f129059e = AbstractC24855l.m129208a(a.f129064q);

    /* renamed from: f */
    private static final InterfaceC29280a f129060f = AbstractC28684a.Companion.m143681o();

    /* renamed from: g */
    private static boolean f129061g;

    /* renamed from: h */
    private static boolean f129062h;

    /* renamed from: i */
    private static boolean f129063i;

    /* renamed from: v00.l$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f129064q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25094q mo12V4() {
            return new C25094q();
        }
    }

    /* renamed from: v00.l$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f129065q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return AbstractC23349d.m122764b();
        }
    }

    /* renamed from: v00.l$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f129066q = new c();

        /* renamed from: v00.l$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f129067q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m140395a(C27326d c27326d) {
                AbstractC19074t.m100208f(c27326d, "$this$Json");
                c27326d.m139881f(true);
                c27326d.m139882g(true);
                c27326d.m139879d(true);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m140395a((C27326d) obj);
                return C24848g0.f119245a;
            }
        }

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AbstractC27323a mo12V4() {
            return AbstractC27336n.m139941b(null, a.f129067q, 1, null);
        }
    }

    /* renamed from: v00.l$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f129068q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return AbstractC23349d.m122767e();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(b.f129065q);
        f129056b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f129068q);
        f129057c = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(c.f129066q);
        f129058d = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(a.f129064q);
        f129059e = m129210a4;
        f129060f = AbstractC28684a.Companion.m143681o();
    }

    private C27417l() {
    }

    /* renamed from: a */
    public final Channel m140377a() {
        return f129060f.mo146342q();
    }

    /* renamed from: b */
    public final User m140378b() {
        User mo146327b = f129060f.mo146327b();
        if (mo146327b == null) {
            return User.Anonymous.f50006J;
        }
        return mo146327b;
    }

    /* renamed from: c */
    public final CameraInputParams m140379c() {
        CameraInputParams m39203m = CameraInputParams.m39203m();
        m39203m.f41129s = 9;
        m39203m.f41133u = 4;
        m39203m.f41091J = true;
        m39203m.f41108a0 = false;
        m39203m.f41093L = true;
        m39203m.f41092K = true;
        m39203m.f41105X = "10";
        AbstractC19074t.m100207e(m39203m, "apply(...)");
        return m39203m;
    }

    /* renamed from: d */
    public final InterfaceC29280a m140380d() {
        return f129060f;
    }

    /* renamed from: e */
    public final ChannelConfig m140381e() {
        return f129060f.mo146325a();
    }

    /* renamed from: f */
    public final C25094q m140382f() {
        return (C25094q) f129059e.getValue();
    }

    /* renamed from: g */
    public final String m140383g() {
        Object value = f129056b.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (String) value;
    }

    /* renamed from: h */
    public final AbstractC27323a m140384h() {
        return (AbstractC27323a) f129058d.getValue();
    }

    /* renamed from: i */
    public final String m140385i() {
        Object value = f129057c.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (String) value;
    }

    /* renamed from: j */
    public final void m140386j() {
        boolean z11 = false;
        if (f129061g) {
            f129061g = false;
            return;
        }
        if (f129060f.mo146301C() == 2) {
            z11 = true;
        }
        f129063i = z11;
    }

    /* renamed from: k */
    public final void m140387k() {
        if (f129061g) {
            f129061g = false;
        } else {
            f129062h = m140378b().m51239l();
        }
    }

    /* renamed from: l */
    public final String m140388l() {
        String mo146306H = f129060f.mo146306H();
        if (mo146306H == null) {
            return "";
        }
        return mo146306H;
    }

    /* renamed from: m */
    public final boolean m140389m() {
        return f129062h;
    }

    /* renamed from: n */
    public final void m140390n() {
        f129061g = true;
    }

    /* renamed from: o */
    public final boolean m140391o() {
        return f129063i;
    }
}
