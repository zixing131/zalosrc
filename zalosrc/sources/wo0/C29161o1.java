package wo0;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ap0.C2279a;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.AbstractC3104p;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dg0.AbstractC17927b;
import dg0.AbstractC17930e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gp0.C19561o0;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import lo0.C22626t;
import me0.C23055e5;
import mo0.EnumC23410a;
import mo0.EnumC23411b;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p019aj.C0874h;
import p097db.AbstractC17849h;
import p097db.EnumC17860s;
import p173fz.C19172a;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p304ks.AbstractC21935u;
import p308kx.C21965i;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p361nb.C23648e;
import p363nh.C23744a;
import p471r3.C25630b;
import qm0.AbstractC25358n;
import qo0.InterfaceC25444b;
import ro0.AbstractRunnableC25943g;
import ro0.C25938b;
import ro0.C25948l;
import so0.C26350a;
import to0.InterfaceC26862g;
import to0.InterfaceC26863h;
import uo0.AbstractC27351a;
import vg.AbstractC28025b8;
import vg.C28203u6;
import vg.C28212v6;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import zm.voip.p721ui.incall.C32457b;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32246a;
import zm.voip.service.C32252b;
import zm.voip.service.C32257b4;
import zm.voip.service.C32318n3;
import zm.voip.service.C32319o;
import zm.voip.service.HandlerC32324p;
import zm.voip.service.VoipAudioHelper;
import zo0.EnumC32540i;

/* renamed from: wo0.o1 */
/* loaded from: classes7.dex */
public final class C29161o1 extends AbstractC19962a implements InterfaceC26862g {

    /* renamed from: R */
    public static final a f135084R = new a(null);

    /* renamed from: A */
    private C22626t f135085A;

    /* renamed from: B */
    private EnumC23411b f135086B;

    /* renamed from: C */
    private boolean f135087C;

    /* renamed from: D */
    private int f135088D;

    /* renamed from: E */
    private String f135089E;

    /* renamed from: F */
    private boolean f135090F;

    /* renamed from: G */
    private C25938b f135091G;

    /* renamed from: H */
    private c f135092H;

    /* renamed from: I */
    private boolean f135093I;

    /* renamed from: J */
    private boolean f135094J;

    /* renamed from: K */
    private boolean f135095K;

    /* renamed from: L */
    private b f135096L;

    /* renamed from: M */
    private int f135097M;

    /* renamed from: N */
    private boolean f135098N;

    /* renamed from: O */
    private boolean f135099O;

    /* renamed from: P */
    private final e f135100P;

    /* renamed from: Q */
    private final f f135101Q;

    /* renamed from: t */
    private final AbstractC32273e3 f135102t;

    /* renamed from: u */
    private final C32257b4 f135103u;

    /* renamed from: v */
    private final C32318n3 f135104v;

    /* renamed from: w */
    private final VoipAudioHelper f135105w;

    /* renamed from: x */
    private final C32252b f135106x;

    /* renamed from: y */
    private final C32457b f135107y;

    /* renamed from: z */
    private final C21965i f135108z;

    /* renamed from: wo0.o1$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wo0.o1$b */
    /* loaded from: classes7.dex */
    public static final class b extends Enum {

        /* renamed from: p */
        public static final b f135109p = new b("PORTRAIT", 0);

        /* renamed from: q */
        public static final b f135110q = new b("LEFT_LANDSCAPE", 1);

        /* renamed from: r */
        public static final b f135111r = new b("RIGHT_LANDSCAPE", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f135112s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f135113t;

        static {
            b[] m145620b = m145620b();
            f135112s = m145620b;
            f135113t = AbstractC30166b.m148796a(m145620b);
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m145620b() {
            return new b[]{f135109p, f135110q, f135111r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f135112s.clone();
        }
    }

    /* renamed from: wo0.o1$c */
    /* loaded from: classes7.dex */
    public static final class c extends Enum {

        /* renamed from: p */
        public static final c f135114p = new c("ACTIVE", 0);

        /* renamed from: q */
        public static final c f135115q = new c("IDLE", 1);

        /* renamed from: r */
        public static final c f135116r = new c("SEMI_IDLE", 2);

        /* renamed from: s */
        private static final /* synthetic */ c[] f135117s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f135118t;

        static {
            c[] m145621b = m145621b();
            f135117s = m145621b;
            f135118t = AbstractC30166b.m148796a(m145621b);
        }

        private c(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m145621b() {
            return new c[]{f135114p, f135115q, f135116r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f135117s.clone();
        }
    }

    /* renamed from: wo0.o1$d */
    /* loaded from: classes7.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f135119a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f135120b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f135121c;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f135114p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f135115q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f135116r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135119a = iArr;
            int[] iArr2 = new int[EnumC23411b.values().length];
            try {
                iArr2[EnumC23411b.f113755q.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC23411b.f113756r.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC23411b.f113757s.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f135120b = iArr2;
            int[] iArr3 = new int[EnumC23410a.values().length];
            try {
                iArr3[EnumC23410a.f113743p.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EnumC23410a.f113748u.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EnumC23410a.f113749v.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC23410a.f113746s.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC23410a.f113747t.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC23410a.f113744q.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC23410a.f113745r.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[EnumC23410a.f113739C.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[EnumC23410a.f113740D.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[EnumC23410a.f113752y.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[EnumC23410a.f113750w.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[EnumC23410a.f113751x.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[EnumC23410a.f113738B.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[EnumC23410a.f113753z.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[EnumC23410a.f113737A.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            f135121c = iArr3;
        }
    }

    /* renamed from: wo0.o1$e */
    /* loaded from: classes7.dex */
    public static final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C29161o1.this.mo138251E4();
            ((InterfaceC26863h) C29161o1.this.m103742Dp()).removeCallbacks(this);
        }
    }

    /* renamed from: wo0.o1$f */
    /* loaded from: classes7.dex */
    public static final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C29161o1.this.f135087C && AbstractC3096i0.f13165i) {
                AbstractC3082b0.m15421c("SingleCallPresenter", "restart states in case of cannot destroy activity");
                AbstractC3096i0.f13159c = false;
                AbstractC3096i0.f13165i = false;
                ((InterfaceC26863h) C29161o1.this.m103742Dp()).removeCallbacks(this);
            }
        }
    }

    /* renamed from: wo0.o1$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractRunnableC25943g {
        g() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            if ((C29161o1.this.f135106x.m155709b() || C29161o1.this.f135106x.m155708a()) && !C29161o1.this.m145604Aq()) {
                AbstractC3082b0.m15424f("SingleCallPresenter", "Restart Capture");
                AbstractC17849h.m94301j();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29161o1(InterfaceC26863h interfaceC26863h, AbstractC32273e3 abstractC32273e3, C32257b4 c32257b4, C32318n3 c32318n3, VoipAudioHelper voipAudioHelper, C32252b c32252b, C32457b c32457b, C21965i c21965i) {
        super(interfaceC26863h);
        AbstractC19074t.m100208f(interfaceC26863h, "view");
        AbstractC19074t.m100208f(abstractC32273e3, "voipController");
        AbstractC19074t.m100208f(c32257b4, "voipCallback");
        AbstractC19074t.m100208f(c32318n3, "notification");
        AbstractC19074t.m100208f(voipAudioHelper, "audioHelper");
        AbstractC19074t.m100208f(c32252b, "deviceHandler");
        AbstractC19074t.m100208f(c32457b, "proximityManager");
        AbstractC19074t.m100208f(c21965i, "wakeLock");
        this.f135102t = abstractC32273e3;
        this.f135103u = c32257b4;
        this.f135104v = c32318n3;
        this.f135105w = voipAudioHelper;
        this.f135106x = c32252b;
        this.f135107y = c32457b;
        this.f135108z = c21965i;
        this.f135086B = EnumC23411b.f113754p;
        this.f135089E = "";
        this.f135091G = new C25938b(EnumC23410a.f113743p.ordinal(), -1);
        this.f135092H = c.f135114p;
        this.f135096L = b.f135109p;
        this.f135100P = new e();
        this.f135101Q = new f();
    }

    /* renamed from: Ar */
    private final boolean m145510Ar() {
        if (m145515Eq() && (m145604Aq() || m145511Bq())) {
            return true;
        }
        return false;
    }

    /* renamed from: Bq */
    private final boolean m145511Bq() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        return c22626t.f110947r0;
    }

    /* renamed from: Br */
    private final boolean m145512Br(String str) {
        C28212v6 m141453i = AbstractC28025b8.m141453i(str);
        if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
            return true;
        }
        return false;
    }

    /* renamed from: Cr */
    private final boolean m145513Cr() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117126k0() || !mo138314xj() || !AbstractC23309i.m121627Y2() || AbstractC3096i0.m15536f() || AbstractC3096i0.m15538g()) {
            return false;
        }
        return true;
    }

    /* renamed from: Dq */
    private final boolean m145514Dq() {
        return ((InterfaceC26863h) m103742Dp()).mo138418sk();
    }

    /* renamed from: Eq */
    private final boolean m145515Eq() {
        if (C19172a.m100600k("features@voip@dock_button_list", 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Er */
    private final void m145516Er() {
        AbstractC32273e3 abstractC32273e3 = this.f135102t;
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        int m155825M = abstractC32273e3.m155825M(String.valueOf(c22626t.m117013C()));
        AbstractC32273e3 abstractC32273e32 = this.f135102t;
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t3;
        }
        String m155853V = abstractC32273e32.m155853V(c22626t2.m117010B());
        if (m155825M != -1) {
            AbstractC19074t.m100205c(m155853V);
            if (m155853V.length() > 0) {
                ((InterfaceC26863h) m103742Dp()).mo138391cy(m155853V, m155825M);
                return;
            }
        }
        ((InterfaceC26863h) m103742Dp()).mo138390c5();
    }

    /* renamed from: Fq */
    public static final void m145517Fq(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        try {
            ((InterfaceC26863h) c29161o1.m103742Dp()).mo138404lt(AbstractC27351a.b.f128638a);
            c29161o1.f135102t.mo155857X();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Fr */
    private final void m145518Fr() {
        ((InterfaceC26863h) m103742Dp()).mo138324Am();
        ((InterfaceC26863h) m103742Dp()).mo138352Me(mo138265Pd(), true);
        ((InterfaceC26863h) m103742Dp()).mo138339Hb(mo138250Dl());
        AbstractC28025b8.m141442M("tip.videocall.sticker");
        mo138284Xo();
        m145600wq(7000L);
        mo138304q6();
        m145612lq("tip.videocall.sticker");
    }

    /* renamed from: Gq */
    private final void m145519Gq() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117082Z() && !mo138287c1()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t3;
            }
            c22626t2.f110919d0 = true;
            this.f135102t.m155905o2("40002");
            return;
        }
        C22626t c22626t4 = this.f135085A;
        if (c22626t4 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t4 = null;
        }
        if (c22626t4.m117082Z()) {
            C22626t c22626t5 = this.f135085A;
            if (c22626t5 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t5;
            }
            c22626t2.m117099d1(true);
            this.f135102t.m155905o2("40003");
            return;
        }
        this.f135102t.m155905o2("40004");
    }

    /* renamed from: Gr */
    private final void m145520Gr() {
        int i11;
        int m117153r;
        if (!mo138287c1() || m145588pq() != 1) {
            return;
        }
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117017D0()) {
            i11 = this.f135102t.f148909w;
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t3;
            }
            m117153r = c22626t2.m117149q();
        } else {
            i11 = this.f135102t.f148901o;
            C22626t c22626t4 = this.f135085A;
            if (c22626t4 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t4;
            }
            m117153r = c22626t2.m117153r();
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: wo0.a1

            /* renamed from: q */
            public final /* synthetic */ int f135024q;

            public /* synthetic */ RunnableC29119a1(int i12) {
                r2 = i12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145524Ir(C29161o1.this, r2);
            }
        });
    }

    /* renamed from: Hq */
    private final void m145521Hq() {
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_speaker", new String[0]).m123926s("1"), false);
    }

    /* renamed from: Iq */
    private final boolean m145523Iq() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        String m117007A = c22626t.m117007A();
        if (m117007A != null && m117007A.length() != 0) {
            String str = this.f135089E;
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t3;
            }
            if (!AbstractC19074t.m100204b(str, c22626t2.m117007A())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ir */
    public static final void m145524Ir(C29161o1 c29161o1, int i11) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138436zE(i11);
    }

    /* renamed from: Jr */
    private final void m145526Jr() {
        this.f135107y.m157198d();
        this.f135095K = true;
    }

    /* renamed from: Kq */
    public static final void m145528Kq(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        c29161o1.mo138311wf();
    }

    /* renamed from: Lq */
    public static final void m145529Lq(Object[] objArr, C29161o1 c29161o1) {
        boolean z11;
        AbstractC19074t.m100208f(objArr, "$args");
        AbstractC19074t.m100208f(c29161o1, "this$0");
        try {
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj).booleanValue()) {
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138343Jx();
                    return;
                }
            }
            c29161o1.mo138303pl();
            C22626t c22626t = c29161o1.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c22626t.m117067U()) {
                c29161o1.m145530Lr();
            }
            InterfaceC26863h interfaceC26863h = (InterfaceC26863h) c29161o1.m103742Dp();
            C22626t c22626t2 = c29161o1.f135085A;
            if (c22626t2 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t2 = null;
            }
            interfaceC26863h.mo138407mG(c22626t2.m117126k0(), c29161o1.m145614qq(), c29161o1.mo138314xj());
            InterfaceC26862g.a.m138320d(c29161o1, false, 1, null);
            c29161o1.m145551Tr();
            c29161o1.m145575hq();
            c29161o1.m145579jq();
            c29161o1.m145581kq();
            int m145588pq = c29161o1.m145588pq();
            if (m145588pq != 5) {
                if (m145588pq == 6 && c29161o1.mo138314xj()) {
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138425vt(c29161o1.mo138281Vd());
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138393fn(c29161o1.m145619zr());
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138365TA(c29161o1.m145617yr());
                    c29161o1.mo138311wf();
                }
            } else if (!c29161o1.f135098N) {
                c29161o1.f135098N = true;
                if (c29161o1.mo138314xj()) {
                    c29161o1.mo138279Uf();
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138425vt(c29161o1.mo138281Vd());
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138423vj(c29161o1.mo138260Kd(), true);
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138352Me(c29161o1.mo138265Pd(), true);
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138416s9(c29161o1.mo138306rp(), true);
                    AbstractC19444a.m101694b(new Runnable() { // from class: wo0.d1
                        public /* synthetic */ RunnableC29128d1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C29161o1.m145532Mq(C29161o1.this);
                        }
                    }, 500L);
                    C23744a.Companion.m124119a().m124116d(10041, 0, c29161o1.m145595tq());
                }
            }
            ((InterfaceC26863h) c29161o1.m103742Dp()).mo138373Vy(c29161o1.m145588pq());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Lr */
    private final void m145530Lr() {
        if (!this.f135108z.m114696B()) {
            this.f135108z.m114700x();
        }
    }

    /* renamed from: Mq */
    public static final void m145532Mq(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        c29161o1.m145584nq();
    }

    /* renamed from: Mr */
    private final void m145533Mr() {
        ((InterfaceC26863h) m103742Dp()).mo138376Wp();
    }

    /* renamed from: Nq */
    private final void m145535Nq() {
        AbstractC17927b.Companion.m94536b().mo94527a("onCameraBtnClicked", new Runnable() { // from class: wo0.l1
            public /* synthetic */ RunnableC29152l1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145537Oq(C29161o1.this);
            }
        }, 300L);
    }

    /* renamed from: Oq */
    public static final void m145537Oq(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138382Zh(false);
        if (c29161o1.m145604Aq()) {
            if (c29161o1.mo138280Ul()) {
                if (((InterfaceC26863h) c29161o1.m103742Dp()).mo138358P0()) {
                    c29161o1.mo138261L4("Manual", 7);
                } else {
                    ((InterfaceC26863h) c29161o1.m103742Dp()).mo138422u2(140);
                }
            } else {
                ((InterfaceC26863h) c29161o1.m103742Dp()).mo138382Zh(true);
                ((InterfaceC26863h) c29161o1.m103742Dp()).mo138402kB();
            }
        } else {
            c29161o1.m145609Rr("Manual", 0);
        }
        C22626t c22626t = c29161o1.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        c22626t.m117015C1(System.currentTimeMillis());
    }

    /* renamed from: Pq */
    private final void m145539Pq(int i11) {
        AbstractC3082b0.m15424f("SingleCallPresenter", "onEndCallClicked");
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        c22626t.f110921e0 = true;
        ((InterfaceC26863h) m103742Dp()).mo138381Z7();
        m145519Gq();
        m145533Mr();
        this.f135102t.mo116929a(0, i11);
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t3 = null;
        }
        if (c22626t3.m117126k0()) {
            this.f135102t.mo155864a1();
        }
        C22626t c22626t4 = this.f135085A;
        if (c22626t4 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t4 = null;
        }
        if (c22626t4.m117156r2() || AbstractC23309i.m121073J3() != 1) {
            C22626t c22626t5 = this.f135085A;
            if (c22626t5 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t5 = null;
            }
            if (c22626t5.m117157s() != -3) {
                C22626t c22626t6 = this.f135085A;
                if (c22626t6 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t6 = null;
                }
                if (c22626t6.m117157s() != -4 && !this.f135087C) {
                    return;
                }
            }
        }
        AbstractC3082b0.m15421c("SingleCallPresenter", "Force to quit UI Incomming");
        mo138299lh(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        C22626t c22626t7 = this.f135085A;
        if (c22626t7 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t7;
        }
        c22626t2.m117083Z0(6);
        ((InterfaceC26863h) m103742Dp()).mo138373Vy(m145588pq());
    }

    /* renamed from: Pr */
    private final void m145540Pr() {
        if (this.f135095K) {
            this.f135107y.m157196b();
            this.f135107y.m157199e();
            this.f135107y.m157197c(0);
            this.f135095K = false;
        }
    }

    /* renamed from: Qq */
    private final void m145542Qq() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117126k0()) {
            m145613mq("tip.call.hd.label");
        }
    }

    /* renamed from: Qr */
    private final void m145543Qr(boolean z11) {
        if (this.f135102t.mo155837P().getValue() == InterfaceC25444b.b.f121842q) {
            return;
        }
        if (this.f135102t.mo155837P().getValue() == InterfaceC25444b.b.f121844s) {
            ((InterfaceC26863h) m103742Dp()).mo59032jx(AbstractC8020f0.str_filter_call_v2_init_fail);
            return;
        }
        this.f135102t.mo155874d2(z11);
        if (z11) {
            ((InterfaceC26863h) m103742Dp()).mo138362Qi();
        } else {
            ((InterfaceC26863h) m103742Dp()).mo138412rF(0L);
        }
    }

    /* renamed from: Rq */
    private final void m145545Rq(Object... objArr) {
        boolean z11;
        try {
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) obj).intValue() == 443) {
                    C22626t c22626t = this.f135085A;
                    if (c22626t == null) {
                        AbstractC19074t.m100223u("callInfo");
                        c22626t = null;
                    }
                    if (c22626t.m117126k0()) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: wo0.i1
                            public /* synthetic */ RunnableC29143i1() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C29161o1.m145547Sq(C29161o1.this);
                            }
                        });
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Sq */
    public static final void m145547Sq(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        if (c29161o1.mo138314xj()) {
            c29161o1.mo138304q6();
        } else {
            c29161o1.mo138276Sk();
            c29161o1.mo138259In();
        }
    }

    /* renamed from: Sr */
    public static final void m145548Sr(C29161o1 c29161o1, boolean z11) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138354No(C32246a.f148777h.m155689a().m155688w(), z11);
    }

    /* renamed from: Tq */
    private final void m145550Tq(EnumC23410a enumC23410a, int i11) {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117082Z()) {
            if (this.f135091G.m133646b() != enumC23410a.ordinal() || this.f135091G.m133645a() != i11) {
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t3 = null;
                }
                if (!c22626t3.m117126k0()) {
                    ((InterfaceC26863h) m103742Dp()).mo138353N6(m145601wr());
                    return;
                }
                C22626t c22626t4 = this.f135085A;
                if (c22626t4 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t4;
                }
                String m117052P = c22626t2.m117052P(((InterfaceC26863h) m103742Dp()).mo138370VC(), 10);
                AbstractC19074t.m100207e(m117052P, "getVoipDisplayName(...)");
                this.f135091G = new C25938b(enumC23410a.ordinal(), i11);
                boolean m145601wr = m145601wr();
                switch (d.f135121c[enumC23410a.ordinal()]) {
                    case 1:
                        ((InterfaceC26863h) m103742Dp()).mo138353N6(m145601wr);
                        break;
                    case 2:
                        ((InterfaceC26863h) m103742Dp()).mo138355O7(m145601wr);
                        break;
                    case 3:
                        ((InterfaceC26863h) m103742Dp()).mo138389bs(m145601wr);
                        break;
                    case 4:
                        ((InterfaceC26863h) m103742Dp()).mo138372Vs(m117052P, m145601wr);
                        break;
                    case 5:
                        ((InterfaceC26863h) m103742Dp()).mo138378Xe(m145601wr);
                        break;
                    case 6:
                        ((InterfaceC26863h) m103742Dp()).mo138374W6(m117052P, m145601wr);
                        break;
                    case 7:
                        ((InterfaceC26863h) m103742Dp()).mo138432xp(m145601wr);
                        break;
                    case 8:
                        ((InterfaceC26863h) m103742Dp()).mo138430wz(m145614qq(), m145601wr);
                        break;
                    case 9:
                        ((InterfaceC26863h) m103742Dp()).mo138323AF(m145601wr);
                        break;
                    case 10:
                        ((InterfaceC26863h) m103742Dp()).mo138420t8(m145601wr);
                        break;
                    case 11:
                        ((InterfaceC26863h) m103742Dp()).mo138428wa(m145601wr);
                        break;
                    case 12:
                        ((InterfaceC26863h) m103742Dp()).mo138363Rr(m145601wr);
                        break;
                    case 13:
                        ((InterfaceC26863h) m103742Dp()).mo138369Ux(m145601wr);
                        break;
                    case 14:
                        ((InterfaceC26863h) m103742Dp()).mo138409ox(m145601wr);
                        break;
                    case 15:
                        ((InterfaceC26863h) m103742Dp()).mo138331Dy(m145601wr);
                        break;
                }
                if (mo138314xj()) {
                    ((InterfaceC26863h) m103742Dp()).mo138398iE(mo138263Lh());
                } else {
                    mo138316z8();
                }
            }
        }
    }

    /* renamed from: Tr */
    private final void m145551Tr() {
        ((InterfaceC26863h) m103742Dp()).mo138408nF(mo138296ka(20));
    }

    /* renamed from: Uq */
    private final void m145552Uq() {
        if (!mo138314xj()) {
            return;
        }
        ((InterfaceC26863h) m103742Dp()).mo138367U4(m145595tq(), m145593sq());
    }

    /* renamed from: Ur */
    private final void m145553Ur(Object... objArr) {
        boolean z11;
        Object m131356D;
        Object m131356D2;
        try {
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                m131356D = AbstractC25358n.m131356D(objArr);
                if (m131356D instanceof Integer) {
                    InterfaceC26863h interfaceC26863h = (InterfaceC26863h) m103742Dp();
                    m131356D2 = AbstractC25358n.m131356D(objArr);
                    AbstractC19074t.m100206d(m131356D2, "null cannot be cast to non-null type kotlin.Int");
                    interfaceC26863h.mo138404lt(new AbstractC27351a.a(((Integer) m131356D2).intValue()));
                }
            } else {
                InterfaceC26863h interfaceC26863h2 = (InterfaceC26863h) m103742Dp();
                ArrayList mo155845S = this.f135102t.mo155845S();
                AbstractC19074t.m100207e(mo155845S, "getListStickerTopics(...)");
                interfaceC26863h2.mo138404lt(new AbstractC27351a.c(mo155845S));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Vq */
    private final void m145554Vq() {
        try {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117035J0()) {
                AbstractC3082b0.m15424f("SingleCallPresenter", "NOTI_CALL_ACTION_AUTO_HANGUP");
                ((InterfaceC26863h) m103742Dp()).mo138380Z2();
                mo138286bm(EnumC23411b.f113755q);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Wq */
    private final void m145556Wq(Object... objArr) {
        try {
            if (objArr.length == 0) {
                return;
            }
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        m145543Qr(AbstractC19074t.m100204b(objArr[1], 1));
                    }
                } else {
                    m145567cr();
                }
            } else {
                m145521Hq();
                ((InterfaceC26863h) m103742Dp()).mo138361QD();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Xq */
    private final void m145558Xq(Object... objArr) {
        try {
            if (objArr.length >= 2) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                Object obj2 = objArr[1];
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                m145550Tq(EnumC23410a.values()[intValue], ((Integer) obj2).intValue());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Zq */
    private final void m145561Zq() {
        if (this.f135090F) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_video_split_view_flick", new String[0]).m123926s("1"), false);
        InterfaceC26862g.a.m138321e(this, true, false, 2, null);
    }

    /* renamed from: ar */
    private final void m145563ar() {
        if (!this.f135090F) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_video_split_view_flick", new String[0]).m123926s("0"), false);
        InterfaceC26862g.a.m138321e(this, false, false, 2, null);
    }

    /* renamed from: br */
    private final void m145565br() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117126k0()) {
            m145610Yq();
        }
    }

    /* renamed from: cr */
    private final void m145567cr() {
        int i11 = 0;
        if (this.f135090F) {
            InterfaceC26862g.a.m138321e(this, false, false, 2, null);
            C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_video_split_view", new String[0]).m123926s("0"), false);
            C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
            C0815e1 m2075D = C0815e1.m2075D();
            if (!mo138314xj()) {
                i11 = 3;
            }
            m2075D.m2096R(i11, System.currentTimeMillis());
            return;
        }
        InterfaceC26862g.a.m138321e(this, true, false, 2, null);
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_video_split_view", new String[0]).m123926s("1"), false);
        C0815e1.m2075D().m2097S(4, 1, System.currentTimeMillis());
        C0815e1.m2075D().m2096R(1, System.currentTimeMillis());
    }

    /* renamed from: dq */
    private final int m145568dq() {
        if (AbstractC3096i0.f13172p) {
            AbstractC3096i0.f13172p = false;
            return 0;
        }
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117156r2() && C19561o0.m102161L().m102263l0()) {
            return 6000;
        }
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t3 = null;
        }
        if (c22626t3.m117157s() != -3) {
            C22626t c22626t4 = this.f135085A;
            if (c22626t4 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t4 = null;
            }
            if (c22626t4.m117157s() != -4) {
                C22626t c22626t5 = this.f135085A;
                if (c22626t5 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t5 = null;
                }
                if (c22626t5.f110960y != 0 && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
                    return Integer.MAX_VALUE;
                }
                if (!mo138287c1()) {
                    C22626t c22626t6 = this.f135085A;
                    if (c22626t6 == null) {
                        AbstractC19074t.m100223u("callInfo");
                    } else {
                        c22626t2 = c22626t6;
                    }
                    if (!c22626t2.m117170w0()) {
                        return 0;
                    }
                }
                return 1000;
            }
        }
        return 4000;
    }

    /* renamed from: dr */
    private final void m145569dr() {
        if (!((InterfaceC26863h) m103742Dp()).mo138418sk()) {
            mo138262L9(c.f135114p);
            m145518Fr();
            ((InterfaceC26863h) m103742Dp()).mo138348LC("tip.videocall.filter_skin");
            return;
        }
        m145602xq(this, 0L, 1, null);
    }

    /* renamed from: eq */
    public static final void m145570eq(C29161o1 c29161o1, int i11) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        C2279a m120722w0 = AbstractC23306f.m120722w0();
        C22626t c22626t = c29161o1.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        String valueOf = String.valueOf(c22626t.m117013C());
        String m138317a = InterfaceC26862g.a.m138317a(c29161o1, 0, 1, null);
        C22626t c22626t3 = c29161o1.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t3;
        }
        String m117007A = c22626t2.m117007A();
        AbstractC19074t.m100207e(m117007A, "getPeerAvatarUrl(...)");
        m120722w0.m101508a(new C2279a.a(valueOf, m138317a, m117007A, c29161o1.mo138314xj(), i11, null, 32, null));
    }

    /* renamed from: er */
    private final void m145571er() {
        m145600wq(7000L);
    }

    /* renamed from: fr */
    private final void m145572fr() {
        C28203u6 c28203u6 = C28203u6.f131407a;
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        ContactProfile m141798e = C28203u6.m141798e(c28203u6, String.valueOf(c22626t.m117013C()), null, 2, null);
        if (m141798e == null) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t3;
            }
            m141798e = new ContactProfile(String.valueOf(c22626t2.m117013C()));
        }
        ((InterfaceC26863h) m103742Dp()).mo138379Yw(m141798e);
    }

    /* renamed from: gq */
    private final boolean m145573gq(c cVar) {
        if (mo138314xj()) {
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117126k0()) {
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t3;
                }
                if (!c22626t2.m117038K0() && cVar != this.f135092H && !((InterfaceC26863h) m103742Dp()).mo138325Ap() && !((InterfaceC26863h) m103742Dp()).mo138392ep() && !this.f135093I && ((((InterfaceC26863h) m103742Dp()).mo138335F2() || !((InterfaceC26863h) m103742Dp()).mo138338H9()) && (cVar != c.f135115q || !((InterfaceC26863h) m103742Dp()).mo138406m1()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: gr */
    private final void m145574gr(int i11, int i12, int i13) {
        if (!((InterfaceC26863h) m103742Dp()).mo138335F2() && mo138314xj()) {
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117126k0()) {
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t3;
                }
                if (!c22626t2.m117038K0()) {
                    if (i11 == 0 && i12 == 0 && i13 == 0) {
                        return;
                    }
                    ((InterfaceC26863h) m103742Dp()).mo138424vn(i11, i12, i13, false);
                }
            }
        }
    }

    /* renamed from: hq */
    private final void m145575hq() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!AbstractC21935u.m114554u(String.valueOf(c22626t.m117013C()))) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t3;
            }
            if (!c22626t2.m117086a0()) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: wo0.e1
                    public /* synthetic */ RunnableC29131e1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29161o1.m145577iq(C29161o1.this);
                    }
                });
            }
        }
    }

    /* renamed from: hr */
    private final void m145576hr(Object... objArr) {
        try {
            if (objArr.length < 3) {
                return;
            }
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = objArr[1];
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj2).intValue();
            Object obj3 = objArr[2];
            AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.Int");
            m145574gr(intValue, intValue2, ((Integer) obj3).intValue());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: iq */
    public static final void m145577iq(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        if (AbstractC23309i.m121109K2() == 0) {
            return;
        }
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138346Ks(true);
    }

    /* renamed from: ir */
    private final void m145578ir() {
        if (this.f135108z.m114696B()) {
            this.f135108z.m114697N();
        }
    }

    /* renamed from: jq */
    private final void m145579jq() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117086a0()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t3;
            }
            if (c22626t2.m117173x0()) {
                ((InterfaceC26863h) m103742Dp()).mo138322A5(true);
            }
        }
    }

    /* renamed from: jr */
    public static final void m145580jr(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        c29161o1.f135093I = false;
    }

    /* renamed from: kq */
    private final void m145581kq() {
        boolean m127128x;
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117086a0()) {
            return;
        }
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t3;
        }
        String m117105f = c22626t2.m117105f();
        if (m117105f != null) {
            m127128x = AbstractC24341v.m127128x(m117105f);
            if (!m127128x) {
                ((InterfaceC26863h) m103742Dp()).mo138326Bq(m117105f);
            }
        }
    }

    /* renamed from: kr */
    private final void m145582kr() {
        if (!mo138314xj()) {
            return;
        }
        if ((this.f135106x.m155709b() || this.f135106x.m155708a()) && !m145604Aq()) {
            HandlerC32324p.m156352e(new g(), ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
    }

    /* renamed from: lr */
    private final void m145583lr(int i11) {
        mo138299lh(i11);
        AbstractC17927b.Companion.m94536b().mo94530d("scheduleCallbackTimeout", new Runnable() { // from class: wo0.j1
            public /* synthetic */ RunnableC29146j1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145585nr(C29161o1.this);
            }
        }, i11);
    }

    /* renamed from: nq */
    private final void m145584nq() {
        if (m145593sq().ordinal() > EnumC32540i.f150296q.ordinal() && !((InterfaceC26863h) m103742Dp()).mo138334Ey()) {
            m145613mq("tip.videocall.filter_skin");
        }
    }

    /* renamed from: nr */
    public static final void m145585nr(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        C32319o.m156293t().m156330r0();
        C22626t c22626t = c29161o1.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        c22626t.f110960y = 0;
        C22626t c22626t3 = c29161o1.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t3;
        }
        c22626t2.m117068U0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* renamed from: oq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m145586oq() {
        boolean z11;
        if (AbstractC3096i0.f13167k == 4) {
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c22626t.m117067U()) {
                C25948l mo155855W = this.f135102t.mo155855W();
                if (!m145604Aq()) {
                    C22626t c22626t3 = this.f135085A;
                    if (c22626t3 == null) {
                        AbstractC19074t.m100223u("callInfo");
                        c22626t3 = null;
                    }
                    if (!c22626t3.m117038K0()) {
                        z11 = true;
                        mo155855W.f123737b = z11;
                        if (!AbstractC3096i0.m15538g()) {
                            boolean mo155799F0 = this.f135102t.mo155799F0();
                            if ((mo138314xj() || ((InterfaceC26863h) m103742Dp()).mo138383Zj() || this.f135099O) && mo155799F0) {
                                this.f135102t.mo155899m2();
                            }
                        } else if (mo138314xj() && AbstractC3103o.m15623l()) {
                            C22626t c22626t4 = this.f135085A;
                            if (c22626t4 == null) {
                                AbstractC19074t.m100223u("callInfo");
                                c22626t4 = null;
                            }
                            if (c22626t4.m117126k0()) {
                                if (this.f135099O) {
                                    m145609Rr("Minimize", 1);
                                } else {
                                    m145609Rr("HomeApp", 2);
                                }
                            } else if (mo138287c1()) {
                                C22626t c22626t5 = this.f135085A;
                                if (c22626t5 == null) {
                                    AbstractC19074t.m100223u("callInfo");
                                    c22626t5 = null;
                                }
                                if (c22626t5.m117082Z()) {
                                    m145609Rr("HomeApp", 14);
                                }
                            }
                        }
                        if (m145513Cr()) {
                            ((InterfaceC26863h) m103742Dp()).mo59032jx(AbstractC8020f0.str_call_no_miniview_toast);
                        }
                        if (AbstractC3096i0.m15538g()) {
                            if (mo138314xj()) {
                                C22626t c22626t6 = this.f135085A;
                                if (c22626t6 == null) {
                                    AbstractC19074t.m100223u("callInfo");
                                } else {
                                    c22626t2 = c22626t6;
                                }
                                if (c22626t2.m117126k0()) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        C32318n3.m156214E().m156254M(true);
                    }
                }
                z11 = false;
                mo155855W.f123737b = z11;
                if (!AbstractC3096i0.m15538g()) {
                }
                if (m145513Cr()) {
                }
                if (AbstractC3096i0.m15538g()) {
                }
                C32318n3.m156214E().m156254M(true);
            }
        }
    }

    /* renamed from: or */
    private final void m145587or(long j11, boolean z11) {
        AbstractC17930e.Companion.m94550a().mo94530d("HIDE_KEYBOARD_TASK_KEY", new Runnable() { // from class: wo0.b1

            /* renamed from: q */
            public final /* synthetic */ boolean f135027q;

            public /* synthetic */ RunnableC29122b1(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145589pr(C29161o1.this, r2);
            }
        }, j11);
    }

    /* renamed from: pq */
    private final int m145588pq() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        return c22626t.m117113h();
    }

    /* renamed from: pr */
    public static final void m145589pr(C29161o1 c29161o1, boolean z11) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138427wA(c29161o1.mo138301mn(), false);
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138435yI(z11);
    }

    /* renamed from: qr */
    private final void m145590qr(boolean z11, long j11) {
        AbstractC17927b.Companion.m94536b().mo94530d("DISMISS_MORE_MENU_TASK_KEY", new Runnable() { // from class: wo0.f1
            public /* synthetic */ RunnableC29134f1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145594sr(C29161o1.this);
            }
        }, j11);
    }

    /* renamed from: rq */
    private final int m145591rq(EnumC23411b enumC23411b) {
        int i11 = d.f135120b[enumC23411b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return 0;
                }
                return AbstractC23309i.m120815C4();
            }
            return AbstractC23309i.m120852D4();
        }
        return 60000;
    }

    /* renamed from: rr */
    static /* synthetic */ void m145592rr(C29161o1 c29161o1, boolean z11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            j11 = 5000;
        }
        c29161o1.m145590qr(z11, j11);
    }

    /* renamed from: sq */
    private final EnumC32540i m145593sq() {
        if (!this.f135102t.mo155822L0()) {
            return EnumC32540i.f150295p;
        }
        if (m145604Aq()) {
            return EnumC32540i.f150296q;
        }
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117086a0()) {
            return EnumC32540i.f150296q;
        }
        if (this.f135102t.mo155826M0()) {
            return EnumC32540i.f150299t;
        }
        return EnumC32540i.f150298s;
    }

    /* renamed from: sr */
    public static final void m145594sr(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138429wr();
    }

    /* renamed from: tq */
    private final EnumC32540i m145595tq() {
        if (m145611fq()) {
            if (this.f135090F) {
                return EnumC32540i.f150299t;
            }
            return EnumC32540i.f150298s;
        }
        return EnumC32540i.f150296q;
    }

    /* renamed from: tr */
    public static final void m145596tr(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        c29161o1.mo138262L9(c.f135115q);
    }

    /* renamed from: uq */
    private final String m145597uq() {
        if (!mo138268Po()) {
            return null;
        }
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117176y0()) {
            C22626t c22626t2 = this.f135085A;
            if (c22626t2 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t2 = null;
            }
            if (c22626t2.f110945q0) {
                if (m145605Cq()) {
                    return ((InterfaceC26863h) m103742Dp()).mo138336FA(InterfaceC26862g.a.m138317a(this, 0, 1, null));
                }
                return ((InterfaceC26863h) m103742Dp()).mo138385a9(InterfaceC26862g.a.m138317a(this, 0, 1, null));
            }
        }
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t3 = null;
        }
        if (c22626t3.m117176y0()) {
            if (m145605Cq()) {
                return ((InterfaceC26863h) m103742Dp()).mo138386ax(InterfaceC26862g.a.m138317a(this, 0, 1, null));
            }
            return ((InterfaceC26863h) m103742Dp()).mo138400j7(InterfaceC26862g.a.m138317a(this, 0, 1, null));
        }
        C22626t c22626t4 = this.f135085A;
        if (c22626t4 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t4 = null;
        }
        if (!c22626t4.f110945q0) {
            return null;
        }
        return ((InterfaceC26863h) m103742Dp()).mo138337FG(InterfaceC26862g.a.m138317a(this, 0, 1, null));
    }

    /* renamed from: vq */
    private final c m145598vq() {
        if (d.f135119a[this.f135092H.ordinal()] == 1) {
            return c.f135115q;
        }
        return c.f135114p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:            if (zm.voip.service.VoipAudioHelper.m155575V() == false) goto L67;     */
    /* renamed from: vr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m145599vr() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.f110947r0) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t3 = null;
            }
            if (!c22626t3.f110945q0) {
                if (!VoipAudioHelper.m155579X()) {
                }
            }
        }
        C22626t c22626t4 = this.f135085A;
        if (c22626t4 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t4 = null;
        }
        if (!c22626t4.m117086a0()) {
            C22626t c22626t5 = this.f135085A;
            if (c22626t5 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t5;
            }
            if (!c22626t2.m117067U() && !((InterfaceC26863h) m103742Dp()).mo138335F2() && this.f135091G.m133646b() == EnumC23410a.f113743p.ordinal()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: wq */
    private final void m145600wq(long j11) {
        AbstractC17927b.Companion.m94536b().mo94530d("hideSickerPanel", new Runnable() { // from class: wo0.m1
            public /* synthetic */ RunnableC29155m1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145603yq(C29161o1.this);
            }
        }, j11);
    }

    /* renamed from: wr */
    private final boolean m145601wr() {
        if (this.f135091G.m133646b() != EnumC23410a.f113743p.ordinal()) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117126k0() && !((InterfaceC26863h) m103742Dp()).mo138335F2() && !mo138271Qd()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: xq */
    static /* synthetic */ void m145602xq(C29161o1 c29161o1, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        c29161o1.m145600wq(j11);
    }

    /* renamed from: yq */
    public static final void m145603yq(C29161o1 c29161o1) {
        AbstractC19074t.m100208f(c29161o1, "this$0");
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138356On();
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138339Hb(c29161o1.mo138250Dl());
        ((InterfaceC26863h) c29161o1.m103742Dp()).mo138352Me(c29161o1.mo138265Pd(), true);
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: A8 */
    public void mo138245A8() {
        CharSequence m127168X0;
        if (!mo138314xj()) {
            return;
        }
        try {
            C23302b c23302b = C23302b.f113247a;
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c23302b.m120523d(c22626t.m117169w())) {
                InterfaceC26863h interfaceC26863h = (InterfaceC26863h) m103742Dp();
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t3;
                }
                String m117169w = c22626t2.m117169w();
                AbstractC19074t.m100207e(m117169w, "getMyAvatarUrl(...)");
                m127168X0 = AbstractC24342w.m127168X0(m117169w);
                interfaceC26863h.mo138366Tq(m127168X0.toString());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Aq */
    public boolean m145604Aq() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        return c22626t.m117114h0();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: C4 */
    public b mo138246C4() {
        return this.f135096L;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: C8 */
    public boolean mo138247C8() {
        if (mo138312wg() && !mo138271Qd() && !((InterfaceC26863h) m103742Dp()).mo138347L4()) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if ((!c22626t.m117082Z() || mo138287c1()) && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Ca */
    public void mo138248Ca() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117026G0()) {
            return;
        }
        if (((InterfaceC26863h) m103742Dp()).mo138392ep()) {
            InterfaceC26862g.a.m138318b(this, false, 1, null);
        } else {
            m145606Dr();
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Cb */
    public void mo138249Cb() {
        if (((InterfaceC26863h) m103742Dp()).mo138392ep()) {
            InterfaceC26862g.a.m138318b(this, false, 1, null);
        }
    }

    /* renamed from: Cq */
    public boolean m145605Cq() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        return c22626t.m117179z0();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Dl */
    public boolean mo138250Dl() {
        if (((InterfaceC26863h) m103742Dp()).mo138335F2() || m145514Dq()) {
            return false;
        }
        if (!mo138312wg() && !mo138255Gi() && !mo138271Qd() && !((InterfaceC26863h) m103742Dp()).mo138347L4()) {
            return false;
        }
        return true;
    }

    /* renamed from: Dr */
    public void m145606Dr() {
        ((InterfaceC26863h) m103742Dp()).mo138427wA(mo138301mn(), false);
        ((InterfaceC26863h) m103742Dp()).mo138431xg();
        m145587or(30000L, false);
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: E4 */
    public void mo138251E4() {
        AbstractC3096i0.f13173q = true;
        ((InterfaceC26863h) m103742Dp()).mo138395g3();
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        super.mo994F2();
        this.f135087C = false;
        m145540Pr();
        m145578ir();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: G9 */
    public boolean mo138252G9() {
        if (!m145604Aq() && mo138314xj()) {
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c22626t.m117067U()) {
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t3 = null;
                }
                if (!c22626t3.m117090b0()) {
                    C22626t c22626t4 = this.f135085A;
                    if (c22626t4 == null) {
                        AbstractC19074t.m100223u("callInfo");
                    } else {
                        c22626t2 = c22626t4;
                    }
                    if (c22626t2.m117126k0()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Gf */
    public void mo138253Gf(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "sticker");
        m145574gr(c25630b.m132429g(), c25630b.m132427f(), c25630b.m132434l());
        AbstractC32273e3.m155748Q().mo155856W1(c25630b.m132429g(), c25630b.m132427f(), c25630b.m132434l());
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Gg */
    public void mo138254Gg(int i11) {
        boolean mo138375W8;
        if (mo138314xj()) {
            mo138375W8 = ((InterfaceC26863h) m103742Dp()).mo138358P0();
        } else {
            mo138375W8 = ((InterfaceC26863h) m103742Dp()).mo138375W8();
        }
        if (mo138375W8) {
            m145583lr(0);
            AbstractC17927b.Companion.m94536b().mo94531e(new Runnable() { // from class: wo0.n1

                /* renamed from: q */
                public final /* synthetic */ int f135080q;

                public /* synthetic */ RunnableC29158n1(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29161o1.m145570eq(C29161o1.this, r2);
                }
            }, 1000L);
        } else if (mo138314xj()) {
            ((InterfaceC26863h) m103742Dp()).mo138422u2(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444);
        } else {
            ((InterfaceC26863h) m103742Dp()).mo138403lm(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444);
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Gi */
    public boolean mo138255Gi() {
        if (this.f135092H == c.f135116r) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: He */
    public boolean mo138256He() {
        return this.f135090F;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Hl */
    public void mo138257Hl() {
        mo138299lh(m145568dq());
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Hm */
    public int mo138258Hm() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117020E0()) {
            return -1;
        }
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t3 = null;
        }
        int m117034J = c22626t3.m117034J();
        C22626t c22626t4 = this.f135085A;
        if (c22626t4 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t4 = null;
        }
        int m117031I = c22626t4.m117031I();
        C22626t c22626t5 = this.f135085A;
        if (c22626t5 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t5 = null;
        }
        if (m117031I > c22626t5.m117034J() || m117034J == 0) {
            return -1;
        }
        C22626t c22626t6 = this.f135085A;
        if (c22626t6 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t6;
        }
        return (c22626t2.m117031I() * 100) / m117034J;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: In */
    public void mo138259In() {
        if (mo138314xj()) {
            return;
        }
        ((InterfaceC26863h) m103742Dp()).mo138359PF(VoipAudioHelper.m155575V(), VoipAudioHelper.m155579X());
        mo138316z8();
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Jq */
    public void mo995Nd(C26350a c26350a, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c26350a, interfaceC19968g);
        C22626t m155737l = this.f135103u.m155737l();
        AbstractC19074t.m100207e(m155737l, "getActiveCallInfo(...)");
        this.f135085A = m155737l;
        C22626t c22626t = null;
        if (m155737l == null) {
            AbstractC19074t.m100223u("callInfo");
            m155737l = null;
        }
        this.f135088D = m155737l.m117055Q();
        m145608Or();
        C22626t c22626t2 = this.f135085A;
        if (c22626t2 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t2 = null;
        }
        if (!c22626t2.m117064T()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t = c22626t3;
            }
            c22626t.m117083Z0(6);
        }
        if (mo138287c1()) {
            this.f135104v.m156256Q();
        } else {
            AbstractC3096i0.m15548l(false);
        }
        if (!mo138314xj()) {
            m145526Jr();
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: wo0.z0
            public /* synthetic */ RunnableC29183z0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145528Kq(C29161o1.this);
            }
        });
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Kd */
    public boolean mo138260Kd() {
        if (mo138312wg() && mo138273S4() && !mo138271Qd() && ((!((InterfaceC26863h) m103742Dp()).mo138421th() || ((InterfaceC26863h) m103742Dp()).mo138399ib(AbstractC3104p.m15650a(500.0f))) && !((InterfaceC26863h) m103742Dp()).mo138335F2() && !((InterfaceC26863h) m103742Dp()).mo138347L4())) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c22626t.m117082Z()) {
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: L4 */
    public void mo138261L4(String str, int i11) {
        AbstractC19074t.m100208f(str, "reason");
        AbstractC3082b0.m15421c("SingleCallPresenter", "turnOnCamera isLocalCamOff: " + m145604Aq() + " reason: " + str);
        if (m145604Aq()) {
            this.f135102t.mo155785B2(str, i11);
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: L9 */
    public void mo138262L9(c cVar) {
        int i11;
        AbstractC19074t.m100208f(cVar, "targetMode");
        if (cVar == c.f135115q && m145510Ar()) {
            cVar = c.f135116r;
        }
        if (!m145573gq(cVar)) {
            return;
        }
        this.f135092H = cVar;
        ((InterfaceC26863h) m103742Dp()).mo138405lx(mo138312wg());
        ((InterfaceC26863h) m103742Dp()).mo138377Xb(!mo138312wg());
        ((InterfaceC26863h) m103742Dp()).mo138333Ew(m145616xr());
        ((InterfaceC26863h) m103742Dp()).mo138396gu(mo138247C8(), true);
        ((InterfaceC26863h) m103742Dp()).mo138328DB(m145615ur(), true);
        ((InterfaceC26863h) m103742Dp()).mo138339Hb(mo138250Dl());
        ((InterfaceC26863h) m103742Dp()).mo138398iE(mo138263Lh());
        ((InterfaceC26863h) m103742Dp()).mo138427wA(mo138301mn(), true);
        InterfaceC26863h interfaceC26863h = (InterfaceC26863h) m103742Dp();
        if (mo138266Pj()) {
            i11 = 3;
        } else {
            i11 = 1;
        }
        interfaceC26863h.mo138368UE(3, i11);
        ((InterfaceC26863h) m103742Dp()).mo138327CH(!((InterfaceC26863h) m103742Dp()).mo138335F2());
        ((InterfaceC26863h) m103742Dp()).mo138423vj(mo138260Kd(), true);
        ((InterfaceC26863h) m103742Dp()).mo138352Me(mo138265Pd(), true);
        ((InterfaceC26863h) m103742Dp()).mo138416s9(mo138306rp(), true);
        if (d.f135119a[this.f135092H.ordinal()] == 1) {
            mo138267Pl(7000L);
            m145612lq("tip.videocall.sticker");
            m145613mq("tip.videocall.sticker");
            ((InterfaceC26863h) m103742Dp()).mo138426vw(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:            if (r1.m117176y0() != false) goto L68;     */
    @Override // to0.InterfaceC26862g
    /* renamed from: Lh */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo138263Lh() {
        if (!mo138271Qd() && (!m145514Dq() || !mo138268Po())) {
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117126k0() && !m145601wr()) {
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t3 = null;
                }
                if (!c22626t3.m117086a0()) {
                    C22626t c22626t4 = this.f135085A;
                    if (c22626t4 == null) {
                        AbstractC19074t.m100223u("callInfo");
                        c22626t4 = null;
                    }
                    if (!c22626t4.f110945q0) {
                        C22626t c22626t5 = this.f135085A;
                        if (c22626t5 == null) {
                            AbstractC19074t.m100223u("callInfo");
                        } else {
                            c22626t2 = c22626t5;
                        }
                    }
                    if (!((InterfaceC26863h) m103742Dp()).mo138335F2()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Lj */
    public boolean mo138264Lj() {
        if (this.f135092H == c.f135115q) {
            return true;
        }
        return false;
    }

    /* renamed from: Or */
    public void m145608Or() {
        if (AbstractC3096i0.m15509Q()) {
            AbstractC32273e3.m155748Q().mo155914r2();
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Pd */
    public boolean mo138265Pd() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117082Z() && !((InterfaceC26863h) m103742Dp()).mo138347L4() && !mo138271Qd() && mo138312wg() && mo138314xj()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t3 = null;
            }
            if (!c22626t3.m117086a0() && ((!((InterfaceC26863h) m103742Dp()).mo138421th() || ((InterfaceC26863h) m103742Dp()).mo138399ib(AbstractC3104p.m15650a(500.0f))) && !((InterfaceC26863h) m103742Dp()).mo138335F2())) {
                C22626t c22626t4 = this.f135085A;
                if (c22626t4 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t4;
                }
                if (!c22626t2.m117082Z()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Pj */
    public boolean mo138266Pj() {
        if (mo138312wg() && mo138268Po()) {
            return false;
        }
        return true;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Pl */
    public void mo138267Pl(long j11) {
        if (!mo138314xj()) {
            return;
        }
        if (j11 < 0) {
            j11 = Long.MAX_VALUE;
        }
        AbstractC17927b.Companion.m94536b().mo94530d("scheduleRestState", new Runnable() { // from class: wo0.k1
            public /* synthetic */ RunnableC29149k1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145596tr(C29161o1.this);
            }
        }, j11);
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Po */
    public boolean mo138268Po() {
        if (mo138246C4() == b.f135109p) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Q5 */
    public void mo138269Q5() {
        m145583lr(0);
        if (this.f135086B == EnumC23411b.f113755q) {
            m145572fr();
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Q6 */
    public void mo138270Q6(boolean z11) {
        int m104528d;
        b bVar;
        if (!z11) {
            m104528d = AbstractC20104d.m104528d(this.f135097M / 90);
            int i11 = m104528d * 90;
            if (i11 != 90) {
                if (i11 != 270) {
                    bVar = b.f135111r;
                } else {
                    bVar = b.f135110q;
                }
            } else {
                bVar = b.f135111r;
            }
        } else {
            bVar = b.f135109p;
        }
        this.f135096L = bVar;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Qd */
    public boolean mo138271Qd() {
        if (this.f135086B != EnumC23411b.f113754p) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Rb */
    public void mo138272Rb() {
        if (!mo138264Lj()) {
            InterfaceC26862g.a.m138319c(this, 0L, 1, null);
        }
    }

    /* renamed from: Rr */
    public void m145609Rr(String str, int i11) {
        AbstractC19074t.m100208f(str, "reason");
        AbstractC3082b0.m15421c("SingleCallPresenter", "turnOffCamera ifOffCamera = " + m145604Aq() + " " + str);
        if (!m145604Aq()) {
            this.f135102t.mo155781A2(str, i11);
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: S4 */
    public boolean mo138273S4() {
        if (C0874h.f3217a.m2589d() != null) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c22626t.m117086a0()) {
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: S5 */
    public void mo138274S5(boolean z11) {
        String str;
        try {
            this.f135102t.f148908v = z11;
            if (z11) {
                mo138262L9(c.f135115q);
                ((InterfaceC26863h) m103742Dp()).mo138357Oo(false, false);
                ((InterfaceC26863h) m103742Dp()).mo138349Lf(false);
                ((InterfaceC26863h) m103742Dp()).mo138342JH();
                if (((InterfaceC26863h) m103742Dp()).mo138329DF()) {
                    this.f135094J = true;
                    ((InterfaceC26863h) m103742Dp()).mo138364Sv(false);
                }
                C0815e1 m2075D = C0815e1.m2075D();
                C23648e c23648e = new C23648e(33, "in_call", 1, "call_miniview", new String[0]);
                String[] strArr = new String[2];
                if (mo138314xj()) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr[0] = str;
                strArr[1] = "1";
                m2075D.m2100V(c23648e.m123926s(strArr), false);
                if (mo138314xj()) {
                    this.f135102t.mo155917s1(3);
                }
            } else {
                ((InterfaceC26863h) m103742Dp()).mo138350Lm(mo138300mg());
                ((InterfaceC26863h) m103742Dp()).mo138364Sv(this.f135094J);
                this.f135094J = false;
                mo138262L9(c.f135114p);
                this.f135102t.m155906p0();
                if (mo138314xj() && AbstractC3096i0.f13167k < 5) {
                    this.f135102t.mo155917s1(2);
                }
            }
            mo138279Uf();
            ((InterfaceC26863h) m103742Dp()).mo138398iE(mo138263Lh());
            ((InterfaceC26863h) m103742Dp()).mo138396gu(mo138247C8(), false);
            ((InterfaceC26863h) m103742Dp()).mo138416s9(mo138306rp(), false);
            ((InterfaceC26863h) m103742Dp()).mo138384Zo(mo138309v4());
            ((InterfaceC26863h) m103742Dp()).mo138339Hb(mo138250Dl());
            ((InterfaceC26863h) m103742Dp()).mo138328DB(m145615ur(), false);
            ((InterfaceC26863h) m103742Dp()).mo138427wA(mo138301mn(), false);
            ((InterfaceC26863h) m103742Dp()).mo138423vj(mo138260Kd(), false);
            ((InterfaceC26863h) m103742Dp()).mo138352Me(mo138265Pd(), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Sb */
    public void mo138275Sb(boolean z11) {
        CharSequence m127168X0;
        if (!z11) {
            try {
                if (!m145523Iq()) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        }
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        String m117007A = c22626t.m117007A();
        AbstractC19074t.m100207e(m117007A, "getPeerAvatarUrl(...)");
        m127168X0 = AbstractC24342w.m127168X0(m117007A);
        String obj = m127168X0.toString();
        this.f135089E = obj;
        if (obj.length() > 0) {
            if (C23302b.f113247a.m120523d(this.f135089E)) {
                m145516Er();
                return;
            }
            ((InterfaceC26863h) m103742Dp()).mo138345Kf(this.f135089E);
            if (mo138314xj()) {
                ((InterfaceC26863h) m103742Dp()).mo138388bp(this.f135089E);
                return;
            }
            return;
        }
        ((InterfaceC26863h) m103742Dp()).mo138390c5();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    @Override // to0.InterfaceC26862g
    /* renamed from: Sk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo138276Sk() {
        int i11;
        C22626t c22626t;
        C22626t c22626t2;
        if (mo138314xj()) {
            return;
        }
        C22626t c22626t3 = this.f135085A;
        C22626t c22626t4 = null;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t3 = null;
        }
        if (c22626t3.f110945q0) {
            C22626t c22626t5 = this.f135085A;
            if (c22626t5 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t5 = null;
            }
            if (c22626t5.f110947r0) {
                i11 = 5;
                String mo138296ka = mo138296ka(i11);
                InterfaceC26863h interfaceC26863h = (InterfaceC26863h) m103742Dp();
                c22626t = this.f135085A;
                if (c22626t == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t = null;
                }
                boolean z11 = c22626t.f110945q0;
                c22626t2 = this.f135085A;
                if (c22626t2 != null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t4 = c22626t2;
                }
                interfaceC26863h.mo138340Hc(z11, c22626t4.f110947r0, mo138296ka);
                mo138316z8();
            }
        }
        i11 = 10;
        String mo138296ka2 = mo138296ka(i11);
        InterfaceC26863h interfaceC26863h2 = (InterfaceC26863h) m103742Dp();
        c22626t = this.f135085A;
        if (c22626t == null) {
        }
        boolean z112 = c22626t.f110945q0;
        c22626t2 = this.f135085A;
        if (c22626t2 != null) {
        }
        interfaceC26863h2.mo138340Hc(z112, c22626t4.f110947r0, mo138296ka2);
        mo138316z8();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: T4 */
    public void mo138277T4(boolean z11, long j11) {
        this.f135093I = z11;
        if (z11 && j11 > 0) {
            AbstractC17927b.Companion.m94536b().mo94530d("requestLockUIMode", new Runnable() { // from class: wo0.g1
                public /* synthetic */ RunnableC29137g1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29161o1.m145580jr(C29161o1.this);
                }
            }, j11);
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: U */
    public void mo138278U(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 1000) {
            if (i11 != 1001) {
                if (i11 != 1007) {
                    if (i11 != 10023) {
                        if (i11 != 10033) {
                            if (i11 != 10041) {
                                if (i11 != 40018) {
                                    switch (i11) {
                                        case 10028:
                                            m145520Gr();
                                            return;
                                        case 10029:
                                            m145576hr(Arrays.copyOf(objArr, objArr.length));
                                            return;
                                        case 10030:
                                            m145553Ur(Arrays.copyOf(objArr, objArr.length));
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                mo138291ja(true);
                                return;
                            }
                            m145556Wq(Arrays.copyOf(objArr, objArr.length));
                            return;
                        }
                        m145558Xq(Arrays.copyOf(objArr, objArr.length));
                        return;
                    }
                    m145554Vq();
                    return;
                }
                m145545Rq(Arrays.copyOf(objArr, objArr.length));
                return;
            }
            mo138297l5(Arrays.copyOf(objArr, objArr.length));
            return;
        }
        AbstractC3082b0.m15424f("SingleCallPresenter", "received ACTION_FORCE_QUIT_ACTIVITY");
        mo138257Hl();
        ((InterfaceC26863h) m103742Dp()).mo138380Z2();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Uf */
    public void mo138279Uf() {
        String str;
        String str2;
        String str3;
        if (!mo138314xj()) {
            return;
        }
        C22626t c22626t = null;
        if (m145515Eq()) {
            ((InterfaceC26863h) m103742Dp()).mo138360PH(false, false, false, null);
        } else {
            C22626t c22626t2 = this.f135085A;
            if (c22626t2 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t2 = null;
            }
            if (c22626t2.m117114h0()) {
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t3 = null;
                }
                if (c22626t3.f110947r0) {
                    InterfaceC26863h interfaceC26863h = (InterfaceC26863h) m103742Dp();
                    if (this.f135090F) {
                        str3 = ((InterfaceC26863h) m103742Dp()).mo138385a9(((InterfaceC26863h) m103742Dp()).mo138397hC());
                    } else {
                        str3 = null;
                    }
                    interfaceC26863h.mo138360PH(true, true, true, str3);
                }
            }
            C22626t c22626t4 = this.f135085A;
            if (c22626t4 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t4 = null;
            }
            if (c22626t4.m117114h0()) {
                InterfaceC26863h interfaceC26863h2 = (InterfaceC26863h) m103742Dp();
                if (this.f135090F) {
                    str2 = ((InterfaceC26863h) m103742Dp()).mo138400j7(((InterfaceC26863h) m103742Dp()).mo138397hC());
                } else {
                    str2 = null;
                }
                interfaceC26863h2.mo138360PH(true, true, false, str2);
            } else {
                C22626t c22626t5 = this.f135085A;
                if (c22626t5 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t5 = null;
                }
                if (c22626t5.f110947r0) {
                    InterfaceC26863h interfaceC26863h3 = (InterfaceC26863h) m103742Dp();
                    if (this.f135090F) {
                        str = ((InterfaceC26863h) m103742Dp()).mo138337FG(((InterfaceC26863h) m103742Dp()).mo138397hC());
                    } else {
                        str = null;
                    }
                    interfaceC26863h3.mo138360PH(true, true, false, str);
                } else {
                    ((InterfaceC26863h) m103742Dp()).mo138360PH(false, false, false, null);
                }
            }
        }
        InterfaceC26863h interfaceC26863h4 = (InterfaceC26863h) m103742Dp();
        C22626t c22626t6 = this.f135085A;
        if (c22626t6 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t = c22626t6;
        }
        interfaceC26863h4.mo138411q6(c22626t.m117114h0());
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Ul */
    public boolean mo138280Ul() {
        if (mo138314xj()) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117085a()) {
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Vd */
    public boolean mo138281Vd() {
        if (mo138314xj()) {
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117126k0()) {
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t3 = null;
                }
                if (!c22626t3.m117176y0()) {
                    C22626t c22626t4 = this.f135085A;
                    if (c22626t4 == null) {
                        AbstractC19074t.m100223u("callInfo");
                    } else {
                        c22626t2 = c22626t4;
                    }
                    if (!c22626t2.m117130l0()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: W6 */
    public void mo138282W6(String str) {
        AbstractC19074t.m100208f(str, "keypad");
        this.f135102t.mo155839P1(str);
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: W8 */
    public boolean mo138283W8() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        return c22626t.m117126k0();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Xo */
    public void mo138284Xo() {
        AbstractC17930e.Companion.m94551d().mo94527a("loadStickers", new Runnable() { // from class: wo0.y0
            public /* synthetic */ RunnableC29181y0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145517Fq(C29161o1.this);
            }
        }, 1000L);
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: Y6 */
    public void mo138285Y6(boolean z11) {
        m145587or(0L, z11);
    }

    /* renamed from: Yq */
    public void m145610Yq() {
        C22626t c22626t = null;
        if (((InterfaceC26863h) m103742Dp()).mo138392ep()) {
            InterfaceC26862g.a.m138318b(this, false, 1, null);
            return;
        }
        if (((InterfaceC26863h) m103742Dp()).mo138418sk()) {
            mo138307tf(37);
            return;
        }
        C22626t c22626t2 = this.f135085A;
        if (c22626t2 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t2 = null;
        }
        if (c22626t2.m117126k0()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t = c22626t3;
            }
            if (!c22626t.m117038K0()) {
                mo138262L9(m145598vq());
            }
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: bm */
    public void mo138286bm(EnumC23411b enumC23411b) {
        AbstractC19074t.m100208f(enumC23411b, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f135086B = enumC23411b;
        ((InterfaceC26863h) m103742Dp()).mo138387be(this.f135086B);
        m145583lr(m145591rq(enumC23411b));
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: c1 */
    public boolean mo138287c1() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        return c22626t.m117090b0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:            if (r1.m117122j0() != false) goto L70;     */
    @Override // to0.InterfaceC26862g
    /* renamed from: c8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo138288c8() {
        if (mo138314xj() && mo138312wg() && !((InterfaceC26863h) m103742Dp()).mo138347L4() && !mo138271Qd()) {
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if ((!c22626t.m117082Z() || mo138287c1()) && m145588pq() != 2) {
                if (!mo138287c1()) {
                    C22626t c22626t3 = this.f135085A;
                    if (c22626t3 == null) {
                        AbstractC19074t.m100223u("callInfo");
                        c22626t3 = null;
                    }
                    if (c22626t3.m117067U()) {
                        C22626t c22626t4 = this.f135085A;
                        if (c22626t4 == null) {
                            AbstractC19074t.m100223u("callInfo");
                        } else {
                            c22626t2 = c22626t4;
                        }
                    }
                }
                if (!((InterfaceC26863h) m103742Dp()).mo138335F2()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: dk */
    public void mo138289dk() {
        if (AbstractC3096i0.m15536f() && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
            ((InterfaceC26863h) m103742Dp()).mo138330Db();
            m145592rr(this, false, 0L, 2, null);
            ((InterfaceC26863h) m103742Dp()).mo138351MG(AbstractC3104p.m15687s0(true), AbstractC3104p.m15636M(true));
            InterfaceC26862g.a.m138321e(this, false, false, 2, null);
            m145602xq(this, 0L, 1, null);
            ((InterfaceC26863h) m103742Dp()).mo138414rx();
            ((InterfaceC26863h) m103742Dp()).mo138332Eo();
            ((InterfaceC26863h) m103742Dp()).mo138433yE();
            if (((InterfaceC26863h) m103742Dp()).mo138392ep()) {
                mo138285Y6(true);
            }
        }
    }

    /* renamed from: fq */
    public boolean m145611fq() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117086a0()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t3 = null;
            }
            if (!c22626t3.m117134m0()) {
                return false;
            }
        }
        C22626t c22626t4 = this.f135085A;
        if (c22626t4 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t4;
        }
        return c22626t2.m117126k0();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: h2 */
    public void mo138290h2(int i11) {
        this.f135097M = i11;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: ja */
    public void mo138291ja(boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: wo0.c1

            /* renamed from: q */
            public final /* synthetic */ boolean f135033q;

            public /* synthetic */ RunnableC29125c1(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145548Sr(C29161o1.this, r2);
            }
        });
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: jd */
    public void mo138292jd() {
        m145587or(30000L, false);
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: jf */
    public void mo138293jf() {
        this.f135099O = true;
        if (AbstractC3096i0.m15536f()) {
            mo138289dk();
        } else {
            ((InterfaceC26863h) m103742Dp()).mo138410pd();
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: ji */
    public boolean mo138294ji() {
        if (!((InterfaceC26863h) m103742Dp()).mo138347L4() && !mo138271Qd() && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: jj */
    public void mo138295jj() {
        int i11;
        int i12;
        int i13 = d.f135120b[this.f135086B.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                if (C23055e5.m118272g(true)) {
                    if (mo138314xj()) {
                        i12 = 62;
                    } else {
                        i12 = 61;
                    }
                    mo138254Gg(i12);
                    return;
                }
                m145583lr(0);
                return;
            }
            return;
        }
        if (C23055e5.m118272g(true)) {
            if (mo138314xj()) {
                i11 = 64;
            } else {
                i11 = 63;
            }
            mo138254Gg(i11);
            return;
        }
        m145583lr(0);
        m145572fr();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: ka */
    public String mo138296ka(int i11) {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117086a0()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t3;
            }
            String m117010B = c22626t2.m117010B();
            AbstractC19074t.m100207e(m117010B, "getPeerDisplayName(...)");
            return m117010B;
        }
        C22626t c22626t4 = this.f135085A;
        if (c22626t4 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t4 = null;
        }
        if (c22626t4.m117010B().length() > i11) {
            C22626t c22626t5 = this.f135085A;
            if (c22626t5 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t2 = c22626t5;
            }
            String m117010B2 = c22626t2.m117010B();
            AbstractC19074t.m100207e(m117010B2, "getPeerDisplayName(...)");
            String substring = m117010B2.substring(0, i11);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring + "...";
        }
        C22626t c22626t6 = this.f135085A;
        if (c22626t6 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t6;
        }
        String m117010B3 = c22626t2.m117010B();
        AbstractC19074t.m100207e(m117010B3, "getPeerDisplayName(...)");
        return m117010B3;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: l5 */
    public void mo138297l5(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        AbstractC19444a.m101697e(new Runnable() { // from class: wo0.h1

            /* renamed from: p */
            public final /* synthetic */ Object[] f135049p;

            /* renamed from: q */
            public final /* synthetic */ C29161o1 f135050q;

            public /* synthetic */ RunnableC29140h1(Object[] objArr2, C29161o1 this) {
                r1 = objArr2;
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29161o1.m145529Lq(r1, r2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
    @Override // to0.InterfaceC26862g
    /* renamed from: l9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo138298l9() {
        boolean z11;
        C22626t c22626t;
        if (!mo138314xj()) {
            return;
        }
        C22626t c22626t2 = this.f135085A;
        C22626t c22626t3 = null;
        if (c22626t2 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t2 = null;
        }
        boolean z12 = false;
        boolean z13 = true;
        if (c22626t2.m117176y0()) {
            C22626t c22626t4 = this.f135085A;
            if (c22626t4 == null) {
                AbstractC19074t.m100223u("callInfo");
            } else {
                c22626t3 = c22626t4;
            }
            int m117178z = c22626t3.m117178z();
            if (m117178z != 1) {
                if (m117178z != 2) {
                    if (m117178z != 3) {
                        if (m117178z != 9) {
                        }
                    }
                    z12 = true;
                }
            }
        } else {
            C22626t c22626t5 = this.f135085A;
            if (c22626t5 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t5 = null;
            }
            if (c22626t5.m117130l0()) {
                C22626t c22626t6 = this.f135085A;
                if (c22626t6 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t6 = null;
                }
                if (c22626t6.m117046N() != 1) {
                    C22626t c22626t7 = this.f135085A;
                    if (c22626t7 == null) {
                        AbstractC19074t.m100223u("callInfo");
                        c22626t7 = null;
                    }
                    if (c22626t7.m117046N() != 2) {
                        z11 = true;
                        c22626t = this.f135085A;
                        if (c22626t == null) {
                            AbstractC19074t.m100223u("callInfo");
                            c22626t = null;
                        }
                        if (c22626t.m117125k() != EnumC17860s.POOR) {
                            C22626t c22626t8 = this.f135085A;
                            if (c22626t8 == null) {
                                AbstractC19074t.m100223u("callInfo");
                            } else {
                                c22626t3 = c22626t8;
                            }
                            if (c22626t3.m117125k() != EnumC17860s.VERY_POOR) {
                                z12 = true;
                            }
                        }
                        z13 = z12;
                        z12 = z11;
                    }
                }
                z11 = false;
                c22626t = this.f135085A;
                if (c22626t == null) {
                }
                if (c22626t.m117125k() != EnumC17860s.POOR) {
                }
                z13 = z12;
                z12 = z11;
            } else {
                z13 = false;
            }
        }
        ((InterfaceC26863h) m103742Dp()).mo138434yH(z12);
        if (z13) {
            ((InterfaceC26863h) m103742Dp()).mo138341Iu();
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: lh */
    public void mo138299lh(int i11) {
        AbstractC3096i0.f13168l = true;
        this.f135087C = true;
        AbstractC3082b0.m15424f("SingleCallPresenter", "scheduleFinishView delay " + i11);
        m145578ir();
        if (this.f135095K) {
            this.f135107y.m157197c(0);
        }
        long j11 = i11;
        ((InterfaceC26863h) m103742Dp()).mo78955kl(this.f135100P, j11);
        ((InterfaceC26863h) m103742Dp()).mo78955kl(this.f135101Q, j11 + 1000);
    }

    /* renamed from: lq */
    public void m145612lq(String str) {
        AbstractC19074t.m100208f(str, "tipCat");
        ((InterfaceC26863h) m103742Dp()).mo138401jn(str, m145512Br(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:            if (r1.m117134m0() != false) goto L42;     */
    @Override // to0.InterfaceC26862g
    /* renamed from: mg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo138300mg() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117126k0()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t3 = null;
            }
            if (c22626t3.m117086a0()) {
                C22626t c22626t4 = this.f135085A;
                if (c22626t4 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t4;
                }
            }
        }
        if (!mo138271Qd()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: mn */
    public boolean mo138301mn() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117086a0() && mo138312wg()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t3 = null;
            }
            if (c22626t3.m117026G0()) {
                C22626t c22626t4 = this.f135085A;
                if (c22626t4 == null) {
                    AbstractC19074t.m100223u("callInfo");
                    c22626t4 = null;
                }
                if (c22626t4.m117113h() != 2) {
                    C22626t c22626t5 = this.f135085A;
                    if (c22626t5 == null) {
                        AbstractC19074t.m100223u("callInfo");
                    } else {
                        c22626t2 = c22626t5;
                    }
                    if ((!c22626t2.m117082Z() || mo138287c1() || ((InterfaceC26863h) m103742Dp()).mo138392ep()) && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: mq */
    public void m145613mq(String str) {
        AbstractC19074t.m100208f(str, "tipCat");
        C28212v6 m141453i = AbstractC28025b8.m141453i(str);
        if (m141453i != null && m141453i.m142167f() && m141453i.f131579e) {
            ((InterfaceC26863h) m103742Dp()).mo138415s6(m141453i);
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: n5 */
    public boolean mo138302n5() {
        if (mo138314xj() && !m145604Aq()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    public void onPause() {
        m145590qr(false, 0L);
        if (((InterfaceC26863h) m103742Dp()).mo138392ep()) {
            mo138285Y6(true);
        }
        if (!AbstractC3096i0.m15538g() && !AbstractC3103o.m15623l() && mo138314xj()) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117126k0()) {
                if (this.f135099O) {
                    m145609Rr("Minimize", 1);
                } else {
                    m145609Rr("HomeApp", 2);
                }
            }
        }
    }

    @Override // to0.InterfaceC26862g
    public void onResume() {
        this.f135099O = false;
        m145608Or();
        if (mo138314xj()) {
            this.f135102t.m155906p0();
        }
    }

    @Override // to0.InterfaceC26862g
    public void onStart() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117090b0()) {
            this.f135103u.m155737l().m117180z1(158);
        }
        this.f135099O = false;
        this.f135104v.m156254M(false);
        m145608Or();
        if ((AbstractC3096i0.f13170n || AbstractC3096i0.f13171o) && mo138314xj()) {
            ((InterfaceC26863h) m103742Dp()).mo138419sr();
            m145582kr();
        }
        if (mo138314xj() && this.f135102t.mo155855W().f123737b) {
            mo138261L4("onResume", 8);
        }
        this.f135102t.mo155855W().f123737b = false;
        m145520Gr();
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t3;
        }
        if (c22626t2.m117038K0()) {
            this.f135102t.mo155911q2();
        }
        if (mo138314xj()) {
            this.f135102t.m155784B1();
            mo138245A8();
            this.f135102t.mo155917s1(2);
        }
    }

    @Override // to0.InterfaceC26862g
    public void onStop() {
        m145586oq();
        m145602xq(this, 0L, 1, null);
        if (mo138314xj()) {
            this.f135102t.mo155917s1(1);
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: pl */
    public void mo138303pl() {
        if (this.f135095K) {
            this.f135107y.m157200f();
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: q6 */
    public void mo138304q6() {
        if (!mo138314xj()) {
            return;
        }
        InterfaceC26863h interfaceC26863h = (InterfaceC26863h) m103742Dp();
        boolean mo138263Lh = mo138263Lh();
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        boolean z11 = c22626t.f110945q0;
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t3;
        }
        interfaceC26863h.mo138344KF(mo138263Lh, z11, c22626t2.m117176y0(), m145597uq());
    }

    /* renamed from: qq */
    public String m145614qq() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        String m117040L = c22626t.m117040L(((InterfaceC26863h) m103742Dp()).getContext());
        AbstractC19074t.m100207e(m117040L, "getStatusText(...)");
        return m117040L;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: r4 */
    public boolean mo138305r4() {
        if (mo138314xj() || VoipAudioHelper.m155579X() || VoipAudioHelper.m155575V()) {
            return false;
        }
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117067U()) {
            return false;
        }
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t3 = null;
        }
        if (c22626t3.m117082Z()) {
            C22626t c22626t4 = this.f135085A;
            if (c22626t4 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t4 = null;
            }
            if (!c22626t4.m117090b0()) {
                C22626t c22626t5 = this.f135085A;
                if (c22626t5 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t5;
                }
                if (c22626t2.m117113h() != 4) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: rp */
    public boolean mo138306rp() {
        if (mo138312wg() && !mo138271Qd()) {
            C22626t c22626t = this.f135085A;
            C22626t c22626t2 = null;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c22626t.m117086a0() && !((InterfaceC26863h) m103742Dp()).mo138347L4() && ((!((InterfaceC26863h) m103742Dp()).mo138421th() || ((InterfaceC26863h) m103742Dp()).mo138399ib(AbstractC3104p.m15650a(500.0f))) && !((InterfaceC26863h) m103742Dp()).mo138335F2())) {
                C22626t c22626t3 = this.f135085A;
                if (c22626t3 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t3;
                }
                if (!c22626t2.m117082Z()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0023. Please report as an issue. */
    @Override // to0.InterfaceC26862g
    /* renamed from: tf */
    public boolean mo138307tf(int i11) {
        try {
            mo138267Pl(7000L);
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 18) {
                        if (i11 != 19) {
                            if (i11 != 22) {
                                if (i11 != 35) {
                                    if (i11 != 37) {
                                        if (i11 != 38) {
                                            switch (i11) {
                                                case 10:
                                                    m145610Yq();
                                                    break;
                                                case 11:
                                                    m145565br();
                                                    break;
                                                case 12:
                                                    m145535Nq();
                                                    break;
                                                case 13:
                                                    m145567cr();
                                                    break;
                                                default:
                                                    return false;
                                            }
                                        } else {
                                            m145571er();
                                        }
                                    } else {
                                        m145569dr();
                                    }
                                } else {
                                    m145552Uq();
                                }
                            } else {
                                m145542Qq();
                            }
                        } else {
                            m145561Zq();
                        }
                    } else {
                        m145563ar();
                    }
                } else {
                    m145539Pq(9);
                }
            } else {
                m145539Pq(1);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return true;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: ue */
    public int mo138308ue() {
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (!c22626t.m117164u0()) {
            return -1;
        }
        C22626t c22626t3 = this.f135085A;
        if (c22626t3 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t3 = null;
        }
        int m117022F = c22626t3.m117022F();
        C22626t c22626t4 = this.f135085A;
        if (c22626t4 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t4 = null;
        }
        int m117019E = c22626t4.m117019E();
        C22626t c22626t5 = this.f135085A;
        if (c22626t5 == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t5 = null;
        }
        if (m117019E > c22626t5.m117022F() || m117022F == 0) {
            return -1;
        }
        C22626t c22626t6 = this.f135085A;
        if (c22626t6 == null) {
            AbstractC19074t.m100223u("callInfo");
        } else {
            c22626t2 = c22626t6;
        }
        return (c22626t2.m117019E() * 100) / m117022F;
    }

    /* renamed from: ur */
    public boolean m145615ur() {
        if (mo138312wg() && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: v4 */
    public boolean mo138309v4() {
        if (mo138312wg() && ((InterfaceC26863h) m103742Dp()).mo138418sk() && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: vb */
    public void mo138310vb(boolean z11, boolean z12) {
        if ((z11 != this.f135090F || z12) && m145611fq() && mo138314xj() && !((InterfaceC26863h) m103742Dp()).mo138417sh()) {
            this.f135090F = z11;
            ((InterfaceC26863h) m103742Dp()).mo138394fs(z11, z12);
        }
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: wf */
    public void mo138311wf() {
        if (!m145618zq()) {
            return;
        }
        C22626t c22626t = this.f135085A;
        C22626t c22626t2 = null;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        if (c22626t.m117067U()) {
            C22626t c22626t3 = this.f135085A;
            if (c22626t3 == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t3 = null;
            }
            if (!c22626t3.m117076X()) {
                C22626t c22626t4 = this.f135085A;
                if (c22626t4 == null) {
                    AbstractC19074t.m100223u("callInfo");
                } else {
                    c22626t2 = c22626t4;
                }
                if (!c22626t2.m117158s0()) {
                    ((InterfaceC26863h) m103742Dp()).mo138381Z7();
                    return;
                }
                return;
            }
            return;
        }
        ((InterfaceC26863h) m103742Dp()).mo138413ri();
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: wg */
    public boolean mo138312wg() {
        if (this.f135092H == c.f135114p) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: xg */
    public boolean mo138313xg() {
        if (mo138314xj()) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c22626t.m117067U()) {
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: xj */
    public boolean mo138314xj() {
        C22626t c22626t = this.f135085A;
        if (c22626t == null) {
            AbstractC19074t.m100223u("callInfo");
            c22626t = null;
        }
        return c22626t.m117047N0();
    }

    /* renamed from: xr */
    public boolean m145616xr() {
        if (mo138312wg() && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
            return true;
        }
        return false;
    }

    /* renamed from: yr */
    public boolean m145617yr() {
        if (mo138314xj()) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117126k0()) {
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: z7 */
    public boolean mo138315z7() {
        if (mo138314xj() && !((InterfaceC26863h) m103742Dp()).mo138347L4() && !mo138271Qd()) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if ((!c22626t.m117082Z() || mo138287c1()) && m145588pq() != 2 && !((InterfaceC26863h) m103742Dp()).mo138335F2()) {
                return true;
            }
        }
        return false;
    }

    @Override // to0.InterfaceC26862g
    /* renamed from: z8 */
    public void mo138316z8() {
        if (mo138314xj()) {
            return;
        }
        ((InterfaceC26863h) m103742Dp()).mo138371Vo(m145599vr());
    }

    /* renamed from: zq */
    public boolean m145618zq() {
        if (mo138314xj() && C19172a.m100600k("features@voip@enable_rotation", 1) == 1) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (!c22626t.m117086a0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: zr */
    public boolean m145619zr() {
        if (mo138314xj()) {
            C22626t c22626t = this.f135085A;
            if (c22626t == null) {
                AbstractC19074t.m100223u("callInfo");
                c22626t = null;
            }
            if (c22626t.m117126k0()) {
                return true;
            }
        }
        return false;
    }
}
