package p056cj;

import ag0.C0814e0;
import android.text.TextUtils;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17958e1;
import dj.C17969i0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import mw.AbstractC23463h;
import p019aj.C0877k;
import p279jw.C21373a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p511sw.C26394c;
import pm0.C24848g0;

/* renamed from: cj.c */
/* loaded from: classes3.dex */
public final class C3535c extends C26394c {
    public static final a Companion = new a(null);

    /* renamed from: i */
    private Conversation f14900i;

    /* renamed from: j */
    private final boolean f14901j;

    /* renamed from: k */
    private boolean f14902k;

    /* renamed from: l */
    private MessageId f14903l;

    /* renamed from: m */
    private boolean f14904m;

    /* renamed from: n */
    private boolean f14905n;

    /* renamed from: o */
    private int f14906o;

    /* renamed from: p */
    private int f14907p;

    /* renamed from: q */
    private long f14908q;

    /* renamed from: r */
    private boolean f14909r;

    /* renamed from: s */
    private int f14910s;

    /* renamed from: t */
    private C17945a0 f14911t;

    /* renamed from: cj.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: cj.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f14912q = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m17973a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            c17945a0.m94928K1();
            C0814e0.m2069o(c17945a0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m17973a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: cj.c$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f14913q = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m17974a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            c17945a0.m95115e1();
            c17945a0.m94920J1();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m17974a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: cj.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ MessageId f14914q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MessageId messageId) {
            super(1);
            this.f14914q = messageId;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(c17945a0.m95029V3(), this.f14914q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj.c$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f14915q = new e();

        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            return Boolean.valueOf(c17945a0.m95009T0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj.c$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f14916q = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m17977a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            c17945a0.m95172ja(true);
            c17945a0.f90748u2 = false;
            if (c17945a0.m95100c8()) {
                if (c17945a0.m95219o8()) {
                    C17969i0 m94929K2 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentUndo");
                    ((C17958e1) m94929K2).m95434x(-1L);
                } else if (c17945a0.m95110d8()) {
                    C17969i0 m94929K22 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentSticker");
                    ((C17949b1) m94929K22).m95404o(-1L);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m17977a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj.c$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final g f14917q = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m17978a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            c17945a0.m94928K1();
            C0814e0.m2069o(c17945a0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m17978a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3535c(Conversation conversation) {
        this(conversation, false, 2, null);
        AbstractC19074t.m100208f(conversation, "conversation");
    }

    /* renamed from: Y0 */
    private final void m17933Y0(C17945a0 c17945a0) {
        if (c17945a0.m94896G4() == 3) {
            c17945a0.m95211nb((byte) AbstractC23304d.f113432r2);
        }
    }

    /* renamed from: q0 */
    public static /* synthetic */ boolean m17934q0(C3535c c3535c, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c3535c.m17964p0(c17945a0, z11);
    }

    /* renamed from: u0 */
    public static /* synthetic */ boolean m17935u0(C3535c c3535c, C17945a0 c17945a0, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return c3535c.m17967t0(c17945a0, z11, z12);
    }

    /* renamed from: A0 */
    public final C17945a0 m17936A0() {
        return this.f14911t;
    }

    /* renamed from: B0 */
    public final boolean m17937B0() {
        return this.f14904m;
    }

    /* renamed from: C0 */
    public final int m17938C0() {
        return this.f14907p;
    }

    /* renamed from: D0 */
    public final MessageId m17939D0() {
        return this.f14903l;
    }

    /* renamed from: E0 */
    public final C17945a0 m17940E0() {
        return (C17945a0) m136074t(e.f14915q);
    }

    /* renamed from: F0 */
    public final List m17941F0() {
        return m136039B();
    }

    /* renamed from: G0 */
    public final int m17942G0() {
        return this.f14906o;
    }

    /* renamed from: H0 */
    public final long m17943H0() {
        return this.f14908q;
    }

    /* renamed from: I0 */
    public final String m17944I0() {
        return this.f14900i.f42893q;
    }

    /* renamed from: J0 */
    public final boolean m17945J0() {
        return this.f14902k;
    }

    /* renamed from: K0 */
    public final boolean m17946K0() {
        return this.f14909r;
    }

    /* renamed from: L0 */
    public final boolean m17947L0() {
        return this.f14905n;
    }

    @Override // p511sw.C26394c
    /* renamed from: M0 */
    public C17945a0 mo17960Z(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "item");
        C17945a0 c17945a02 = (C17945a0) super.mo17960Z(c17945a0);
        if (c17945a02 == null) {
            AbstractC23306f.m120584H0().m2632o(this);
            m136057a0(AbstractC23306f.m120584H0().m2642z(c17945a0));
        }
        return c17945a02;
    }

    /* renamed from: N0 */
    public final void m17949N0() {
        m136075u(f.f14916q);
    }

    /* renamed from: O0 */
    public final void m17950O0(int i11) {
        this.f14910s = i11;
    }

    /* renamed from: P0 */
    public final void m17951P0(C17945a0 c17945a0) {
        this.f14911t = c17945a0;
    }

    /* renamed from: Q0 */
    public final void m17952Q0(boolean z11) {
        this.f14902k = z11;
    }

    /* renamed from: R0 */
    public final void m17953R0(boolean z11) {
        this.f14904m = z11;
    }

    /* renamed from: S0 */
    public final void m17954S0(int i11) {
        this.f14907p = i11;
    }

    /* renamed from: T0 */
    public final void m17955T0(boolean z11) {
        this.f14909r = z11;
    }

    /* renamed from: U0 */
    public final void m17956U0(MessageId messageId) {
        this.f14903l = messageId;
    }

    /* renamed from: V0 */
    public final void m17957V0(boolean z11) {
        this.f14905n = z11;
    }

    /* renamed from: W0 */
    public final void m17958W0(int i11) {
        this.f14906o = i11;
    }

    /* renamed from: X0 */
    public final void m17959X0(long j11) {
        this.f14908q = j11;
    }

    /* renamed from: Z0 */
    public final synchronized void m17961Z0() {
        m136066k0(g.f14917q);
        this.f14903l = null;
        this.f14904m = true;
        this.f14902k = false;
    }

    /* renamed from: o0 */
    public final boolean m17963o0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatLine");
        return m17934q0(this, c17945a0, false, 2, null);
    }

    /* renamed from: p0 */
    public final boolean m17964p0(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "chatLine");
        return super.m136058b(C0877k.f3256a.m2660a(c17945a0), z11);
    }

    @Override // p511sw.C26394c
    /* renamed from: r0 */
    public void mo17962d(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "item");
        m17933Y0(c17945a0);
        super.mo17962d(C0877k.f3256a.m2660a(c17945a0), z11);
    }

    /* renamed from: s0 */
    public final boolean m17966s0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatLine");
        return m17935u0(this, c17945a0, false, false, 6, null);
    }

    /* renamed from: t0 */
    public final boolean m17967t0(C17945a0 c17945a0, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(c17945a0, "chatLine");
        m17933Y0(c17945a0);
        boolean m136058b = super.m136058b(C0877k.f3256a.m2660a(c17945a0), z12);
        if (m136058b && this.f14901j) {
            if (z11) {
                C23744a.Companion.m124119a().m124116d(3, m17944I0());
            } else if (AbstractC25495a.m132079d(m17944I0()) && !TextUtils.isEmpty(c17945a0.m94862C4())) {
                C23744a.Companion.m124119a().m124116d(2, m17944I0(), c17945a0.m94862C4());
            } else {
                C23744a.Companion.m124119a().m124116d(2, m17944I0());
            }
        }
        if (m136058b && c17945a0.m94889F6() && C21373a.f104231a.m110802n()) {
            if (c17945a0.m94976P6()) {
                C23744a.Companion.m124119a().m124116d(6023, c17945a0);
            }
            if (AbstractC23463h.m123190r(c17945a0)) {
                C23744a.Companion.m124119a().m124116d(6052, c17945a0);
            }
        }
        return m136058b;
    }

    /* renamed from: v0 */
    public final void m17968v0(boolean z11) {
        if (z11) {
            m136075u(b.f14912q);
        }
        this.f14911t = null;
        super.m136069m();
        C23744a.Companion.m124119a().m124116d(2, m17944I0());
    }

    /* renamed from: w0 */
    public final void m17969w0() {
        m136075u(c.f14913q);
    }

    /* renamed from: x0 */
    public final C17945a0 m17970x0(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "msgId");
        return (C17945a0) m136072r(new d(messageId));
    }

    /* renamed from: y0 */
    public final Conversation m17971y0() {
        return this.f14900i;
    }

    /* renamed from: z0 */
    public final int m17972z0() {
        return this.f14910s;
    }

    public /* synthetic */ C3535c(Conversation conversation, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this(conversation, (i11 & 2) != 0 ? true : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3535c(Conversation conversation, boolean z11) {
        super(conversation.f42893q);
        AbstractC19074t.m100208f(conversation, "conversation");
        this.f14900i = conversation;
        this.f14901j = z11;
        this.f14904m = true;
        this.f14907p = -1;
        this.f14909r = true;
    }
}
