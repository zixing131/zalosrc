package p456qp;

import com.zing.zalo.common.C7853b;
import com.zing.zalo.feed.mvp.music.data.ExceptionInCall;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.C23055e5;
import on0.AbstractC24341v;
import p207he.C20024r;
import p426pp.C24903f;
import p456qp.C25451c;
import p509sp.C26359h;
import p509sp.C26361j;
import p509sp.InterfaceC26353b;
import vg.AbstractC28054e7;

/* renamed from: qp.c */
/* loaded from: classes.dex */
public final class C25451c {

    /* renamed from: b */
    private static int f121866b;

    /* renamed from: c */
    private static int f121867c;

    /* renamed from: d */
    private static int f121868d;

    /* renamed from: a */
    public static final C25451c f121865a = new C25451c();

    /* renamed from: e */
    private static AtomicBoolean f121869e = new AtomicBoolean(false);

    /* renamed from: qp.c$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo131831a(int i11, int i12);

        /* renamed from: b */
        void mo131832b();

        /* renamed from: c */
        void mo131833c(Exception exc);

        /* renamed from: d */
        void mo131834d();

        /* renamed from: e */
        void mo131835e();

        void onAudioFocusChange(int i11);

        void onPause();

        void onProgressChanged(int i11);
    }

    /* renamed from: qp.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24903f f121870q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C24903f c24903f) {
            super(0);
            this.f121870q = c24903f;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "playSound - " + this.f121870q.m129502e();
        }
    }

    /* renamed from: qp.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC28054e7 {

        /* renamed from: a */
        final /* synthetic */ boolean f121871a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC26353b f121872b;

        /* renamed from: c */
        final /* synthetic */ boolean f121873c;

        /* renamed from: d */
        final /* synthetic */ C24903f f121874d;

        /* renamed from: e */
        final /* synthetic */ a f121875e;

        /* renamed from: qp.c$c$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C24903f f121876q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C24903f c24903f) {
                super(0);
                this.f121876q = c24903f;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "playSound - onPlay " + this.f121876q.m129502e();
            }
        }

        c(boolean z11, InterfaceC26353b interfaceC26353b, boolean z12, C24903f c24903f, a aVar) {
            this.f121871a = z11;
            this.f121872b = interfaceC26353b;
            this.f121873c = z12;
            this.f121874d = c24903f;
            this.f121875e = aVar;
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            a aVar = this.f121875e;
            if (aVar != null) {
                aVar.mo131833c(ExceptionMusicStreaming.f46312p);
            }
            C25451c c25451c = C25451c.f121865a;
            c25451c.m131814v(false, this.f121872b);
            c25451c.m131820h().set(false);
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: b */
        public void mo64468b() {
            super.mo64468b();
            a aVar = this.f121875e;
            if (aVar != null) {
                aVar.onPause();
            }
            C25451c.f121865a.m131820h().set(false);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:2:0x0000, B:4:0x0014, B:6:0x0018, B:9:0x0022, B:10:0x0040, B:12:0x0061, B:17:0x0031, B:19:0x0035, B:20:0x003b), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        @Override // vg.AbstractC28054e7
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo16497c() {
            a aVar;
            InterfaceC26353b interfaceC26353b;
            try {
                C26359h.f125209a.mo135685a("FEED_MUSIC", "FEED_MUSIC_CONTROLLER", new a(this.f121874d));
                if (this.f121871a && ((interfaceC26353b = this.f121872b) == null || !interfaceC26353b.mo117210a())) {
                    C25451c.f121865a.m131816d();
                    C7853b.Companion.m40150a().m40128g();
                    this.f121874d.m129505h(C7853b.Companion.m40150a().m40112W());
                    C25451c c25451c = C25451c.f121865a;
                    c25451c.m131827r(this.f121874d.m129501d());
                    c25451c.m131815w();
                    aVar = this.f121875e;
                    if (aVar == null) {
                        aVar.mo131834d();
                        return;
                    }
                    return;
                }
                if (this.f121873c) {
                    C25451c.f121865a.m131821i();
                } else {
                    C25451c.f121865a.m131817e();
                }
                this.f121874d.m129505h(C7853b.Companion.m40150a().m40112W());
                C25451c c25451c2 = C25451c.f121865a;
                c25451c2.m131827r(this.f121874d.m129501d());
                c25451c2.m131815w();
                aVar = this.f121875e;
                if (aVar == null) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            super.mo16498e();
            a aVar = this.f121875e;
            if (aVar != null) {
                aVar.onPause();
            }
            C25451c.f121865a.m131820h().set(false);
        }
    }

    /* renamed from: qp.c$d */
    /* loaded from: classes4.dex */
    public static final class d implements C7853b.d {

        /* renamed from: a */
        final /* synthetic */ C24903f f121877a;

        /* renamed from: b */
        final /* synthetic */ a f121878b;

        d(C24903f c24903f, a aVar) {
            this.f121877a = c24903f;
            this.f121878b = aVar;
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
            if (AbstractC19074t.m100204b(this.f121877a.m129503f(), str)) {
                C25451c c25451c = C25451c.f121865a;
                c25451c.m131829t(i11);
                a aVar = this.f121878b;
                if (aVar != null) {
                    aVar.onProgressChanged(c25451c.m131819g());
                }
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: b */
        public void mo40157b(String str, String str2) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: c */
        public void mo40158c(String str, int i11) {
            C25451c c25451c = C25451c.f121865a;
            c25451c.m131828s(i11);
            a aVar = this.f121878b;
            if (aVar != null) {
                aVar.mo131831a(c25451c.m131818f(), this.f121877a.m129501d());
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        public void onAudioFocusChange(int i11) {
            a aVar = this.f121878b;
            if (aVar != null) {
                aVar.onAudioFocusChange(i11);
            }
        }
    }

    /* renamed from: qp.c$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f121879q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            C7853b.a aVar = C7853b.Companion;
            return "stopSound - isPlaying: " + aVar.m40150a().m40137k0() + " - isPreparing: " + aVar.m40150a().m40140m0();
        }
    }

    private C25451c() {
    }

    /* renamed from: l */
    private final void m131811l(C24903f c24903f, boolean z11, boolean z12, InterfaceC26353b interfaceC26353b, int i11, a aVar) {
        try {
            C26359h.f125209a.mo135685a("FEED_MUSIC", "FEED_MUSIC_CONTROLLER", new b(c24903f));
            C7853b.a aVar2 = C7853b.Companion;
            aVar2.m40150a().m40108T0();
            aVar2.m40150a().m40136j1();
            f121868d = i11;
            f121869e.set(true);
            if (aVar != null) {
                aVar.mo131835e();
            }
            aVar2.m40150a().m40092C0(c24903f.m129503f(), i11, new c(z12, interfaceC26353b, z11, c24903f, aVar), true);
            aVar2.m40150a().m40127f1(new d(c24903f, aVar));
            aVar2.m40150a().m40126e1(new C7853b.b() { // from class: qp.b
                public /* synthetic */ C25450b() {
                }

                @Override // com.zing.zalo.common.C7853b.b
                /* renamed from: a */
                public final void mo40153a(String str) {
                    C25451c.m131812m(C25451c.a.this, str);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static final void m131812m(a aVar, String str) {
        if (aVar != null) {
            aVar.mo131832b();
        }
    }

    /* renamed from: p */
    private final void m131813p(int i11) {
        C7853b.a aVar = C7853b.Companion;
        if (!aVar.m40150a().m40140m0()) {
            aVar.m40150a().m40116Y0(i11);
        }
        f121868d = i11;
    }

    /* renamed from: v */
    public final void m131814v(boolean z11, InterfaceC26353b interfaceC26353b) {
        try {
            C26359h.f125209a.mo135685a("FEED_MUSIC", "FEED_MUSIC_CONTROLLER", e.f121879q);
            C7853b.a aVar = C7853b.Companion;
            if (!aVar.m40150a().m40137k0()) {
                if (aVar.m40150a().m40140m0()) {
                }
            }
            if (z11 && interfaceC26353b != null && interfaceC26353b.mo117210a()) {
                aVar.m40150a().m40106S0();
                aVar.m40150a().m40147s0(false);
            } else {
                aVar.m40150a().m40136j1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public final void m131815w() {
        if (f121868d != C7853b.Companion.m40150a().m40117Z()) {
            m131813p(f121868d);
        }
    }

    /* renamed from: d */
    public final void m131816d() {
        try {
            C7853b.a aVar = C7853b.Companion;
            aVar.m40150a().m40108T0();
            aVar.m40150a().m40106S0();
            aVar.m40150a().m40102P(0.0f, 0.0f);
            aVar.m40150a().m40128g();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public final void m131817e() {
        try {
            C7853b.a aVar = C7853b.Companion;
            aVar.m40150a().m40134i1(1.0f, 1.0f);
            aVar.m40150a().m40104Q0(3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public final int m131818f() {
        return f121868d;
    }

    /* renamed from: g */
    public final int m131819g() {
        return f121867c;
    }

    /* renamed from: h */
    public final AtomicBoolean m131820h() {
        return f121869e;
    }

    /* renamed from: i */
    public final void m131821i() {
        try {
            C7853b.Companion.m40150a().m40146r0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public final void m131822j() {
        f121869e.set(false);
        C7853b.Companion.m40150a().m40091B0();
    }

    /* renamed from: k */
    public final void m131823k(C24903f c24903f, boolean z11, boolean z12, InterfaceC26353b interfaceC26353b, int i11, a aVar) {
        boolean m127128x;
        AbstractC19074t.m100208f(c24903f, "songToPlay");
        m127128x = AbstractC24341v.m127128x(c24903f.m129503f());
        if (m127128x) {
            if (aVar != null) {
                aVar.mo131833c(ExceptionMusicStreaming.f46312p);
            }
        } else if (!C23055e5.m118273h(false, 1, null)) {
            if (aVar != null) {
                aVar.mo131833c(ExceptionNoNetwork.f46313p);
            }
        } else if (!C20024r.m103941j() && !C7853b.Companion.m40150a().m40133i0()) {
            m131824n();
            m131811l(c24903f, z11, z12, interfaceC26353b, i11, aVar);
        } else if (aVar != null) {
            aVar.mo131833c(ExceptionInCall.f46308p);
        }
    }

    /* renamed from: n */
    public final void m131824n() {
        m131814v(false, null);
        f121867c = 0;
        f121868d = 0;
    }

    /* renamed from: o */
    public final C7853b.f m131825o(String str) {
        AbstractC19074t.m100208f(str, "path");
        C7853b.f m40113W0 = C7853b.Companion.m40150a().m40113W0(str);
        if (m40113W0.m40162b() == C7853b.f.a.f42236q) {
            f121869e.set(true);
        }
        f121868d = (int) m40113W0.m40161a();
        return m40113W0;
    }

    /* renamed from: q */
    public final void m131826q(int i11) {
        f121867c = C26361j.f125215a.m135695a(f121866b, i11);
        m131813p(i11);
    }

    /* renamed from: r */
    public final void m131827r(int i11) {
        f121866b = i11;
    }

    /* renamed from: s */
    public final void m131828s(int i11) {
        f121868d = i11;
    }

    /* renamed from: t */
    public final void m131829t(int i11) {
        f121867c = i11;
    }

    /* renamed from: u */
    public final void m131830u(boolean z11, InterfaceC26353b interfaceC26353b) {
        m131814v(z11, interfaceC26353b);
    }
}
