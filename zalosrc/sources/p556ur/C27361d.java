package p556ur;

import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.likedetail.model.ExceptionGetLikeDetail;
import com.zing.zalo.feed.reactions.bottomsheet.C8841b;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.AbstractC21339c;
import jp.C21337a;
import jp.C21338b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p205hc.AbstractC19963b;
import p243ip.C20649e;
import p304ks.AbstractC21935u;
import p330lp.C22633a;
import p330lp.C22634b;
import p330lp.C22635c;
import p542ub.InterfaceC27218a;
import p584vr.C28605b;
import p584vr.C28606c;
import p584vr.C28607d;
import p584vr.C28608e;
import p584vr.InterfaceC28604a;
import p619wr.C29198e;
import p619wr.InterfaceC29195b;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: ur.d */
/* loaded from: classes4.dex */
public final class C27361d extends AbstractC19963b {

    /* renamed from: A */
    private String f128890A;

    /* renamed from: B */
    private String f128891B;

    /* renamed from: C */
    private String f128892C;

    /* renamed from: D */
    private boolean f128893D;

    /* renamed from: E */
    private int f128894E;

    /* renamed from: F */
    private C21338b f128895F;

    /* renamed from: G */
    private C21337a f128896G;

    /* renamed from: H */
    private int f128897H;

    /* renamed from: I */
    private C32002l4 f128898I;

    /* renamed from: t */
    private final C22634b f128899t;

    /* renamed from: u */
    private final C22635c f128900u;

    /* renamed from: v */
    private final C22633a f128901v;

    /* renamed from: w */
    private final C1761c0 f128902w;

    /* renamed from: x */
    private final C1761c0 f128903x;

    /* renamed from: y */
    private final C1761c0 f128904y;

    /* renamed from: z */
    private String f128905z;

    /* renamed from: ur.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128906t;

        /* renamed from: ur.d$a$a */
        /* loaded from: classes4.dex */
        public static final class C33006a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C27361d f128908p;

            C33006a(C27361d c27361d) {
                this.f128908p = c27361d;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC21339c abstractC21339c, Continuation continuation) {
                if (abstractC21339c instanceof AbstractC21339c.c) {
                    this.f128908p.f128893D = false;
                    this.f128908p.f128896G = (C21337a) ((AbstractC21339c.c) abstractC21339c).m110544a();
                    this.f128908p.f128903x.mo9224q(AbstractC29094b.m145341c(this.f128908p.f128896G.m110520m()));
                    C1761c0 c1761c0 = this.f128908p.f128902w;
                    C27361d c27361d = this.f128908p;
                    c1761c0.mo9224q(C27361d.m140172h0(c27361d, false, false, c27361d.f128896G.m110515h(), null, 8, null));
                } else if (abstractC21339c instanceof AbstractC21339c.a) {
                    this.f128908p.f128893D = false;
                    C1761c0 c1761c02 = this.f128908p.f128902w;
                    C27361d c27361d2 = this.f128908p;
                    c1761c02.mo9224q(c27361d2.m140171g0(false, true, c27361d2.f128896G.m110515h(), this.f128908p.m140178q0(((AbstractC21339c.a) abstractC21339c).m110543a())));
                } else if (abstractC21339c instanceof AbstractC21339c.b) {
                    C1761c0 c1761c03 = this.f128908p.f128902w;
                    C27361d c27361d3 = this.f128908p;
                    c1761c03.mo9224q(C27361d.m140172h0(c27361d3, true, false, c27361d3.f128896G.m110515h(), null, 8, null));
                }
                return C24848g0.f119245a;
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128906t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C22633a c22633a = C27361d.this.f128901v;
                C22633a.a aVar = new C22633a.a(C27361d.this.f128896G);
                this.f128906t = 1;
                obj = c22633a.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                C33006a c33006a = new C33006a(C27361d.this);
                this.f128906t = 2;
                if (flow.mo97893a(c33006a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ur.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128909t;

        /* renamed from: ur.d$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C27361d f128911p;

            a(C27361d c27361d) {
                this.f128911p = c27361d;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC21339c abstractC21339c, Continuation continuation) {
                if (abstractC21339c instanceof AbstractC21339c.c) {
                    this.f128911p.f128893D = false;
                    this.f128911p.f128895F = (C21338b) ((AbstractC21339c.c) abstractC21339c).m110544a();
                    this.f128911p.f128903x.mo9224q(AbstractC29094b.m145341c(this.f128911p.f128895F.m110537j()));
                    C1761c0 c1761c0 = this.f128911p.f128902w;
                    C27361d c27361d = this.f128911p;
                    c1761c0.mo9224q(C27361d.m140172h0(c27361d, false, false, c27361d.f128895F.m110534g(), null, 8, null));
                } else if (abstractC21339c instanceof AbstractC21339c.a) {
                    this.f128911p.f128893D = false;
                    C1761c0 c1761c02 = this.f128911p.f128902w;
                    C27361d c27361d2 = this.f128911p;
                    c1761c02.mo9224q(c27361d2.m140171g0(false, true, c27361d2.f128895F.m110534g(), this.f128911p.m140178q0(((AbstractC21339c.a) abstractC21339c).m110543a())));
                } else if (abstractC21339c instanceof AbstractC21339c.b) {
                    C1761c0 c1761c03 = this.f128911p.f128902w;
                    C27361d c27361d3 = this.f128911p;
                    c1761c03.mo9224q(C27361d.m140172h0(c27361d3, true, false, c27361d3.f128895F.m110534g(), null, 8, null));
                }
                return C24848g0.f119245a;
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128909t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C22634b c22634b = C27361d.this.f128899t;
                C22634b.a aVar = new C22634b.a(C27361d.this.f128895F);
                this.f128909t = 1;
                obj = c22634b.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C27361d.this);
                this.f128909t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ur.d$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128912t;

        /* renamed from: ur.d$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C27361d f128914p;

            a(C27361d c27361d) {
                this.f128914p = c27361d;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC21339c abstractC21339c, Continuation continuation) {
                if (abstractC21339c instanceof AbstractC21339c.c) {
                    this.f128914p.f128893D = false;
                    this.f128914p.f128895F = (C21338b) ((AbstractC21339c.c) abstractC21339c).m110544a();
                    this.f128914p.f128903x.mo9224q(AbstractC29094b.m145341c(this.f128914p.f128895F.m110537j()));
                    C1761c0 c1761c0 = this.f128914p.f128902w;
                    C27361d c27361d = this.f128914p;
                    c1761c0.mo9224q(C27361d.m140172h0(c27361d, false, false, c27361d.f128895F.m110534g(), null, 8, null));
                } else if (abstractC21339c instanceof AbstractC21339c.a) {
                    this.f128914p.f128893D = false;
                    C1761c0 c1761c02 = this.f128914p.f128902w;
                    C27361d c27361d2 = this.f128914p;
                    c1761c02.mo9224q(c27361d2.m140171g0(false, true, c27361d2.f128895F.m110534g(), this.f128914p.m140178q0(((AbstractC21339c.a) abstractC21339c).m110543a())));
                } else if (abstractC21339c instanceof AbstractC21339c.b) {
                    C1761c0 c1761c03 = this.f128914p.f128902w;
                    C27361d c27361d3 = this.f128914p;
                    c1761c03.mo9224q(C27361d.m140172h0(c27361d3, true, false, c27361d3.f128895F.m110534g(), null, 8, null));
                }
                return C24848g0.f119245a;
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128912t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C22635c c22635c = C27361d.this.f128900u;
                C22635c.a aVar = new C22635c.a(C27361d.this.f128895F);
                this.f128912t = 1;
                obj = c22635c.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C27361d.this);
                this.f128912t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C27361d(C22634b c22634b, C22635c c22635c, C22633a c22633a) {
        AbstractC19074t.m100208f(c22634b, "getListLikeFeed");
        AbstractC19074t.m100208f(c22635c, "getListLikePhoto");
        AbstractC19074t.m100208f(c22633a, "getListLikeComment");
        this.f128899t = c22634b;
        this.f128900u = c22635c;
        this.f128901v = c22633a;
        this.f128902w = new C1761c0();
        this.f128903x = new C1761c0();
        this.f128904y = new C1761c0();
        this.f128905z = "";
        this.f128890A = "";
        this.f128891B = "";
        this.f128892C = "";
        this.f128895F = new C21338b(null, 0, null, 0, null, false, 0, 127, null);
        this.f128896G = new C21337a(null, 0, null, null, null, 0, 0, 0, null, false, 1023, null);
        this.f128897H = -1;
        this.f128898I = C32002l4.Companion.m154287a(10033);
    }

    /* renamed from: g0 */
    public final C20649e m140171g0(boolean z11, boolean z12, List list, String str) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z13 = false;
        if (!list.isEmpty()) {
            if (z11) {
                i14 = 1;
            } else if (z12) {
                i14 = 2;
            } else {
                i14 = 0;
            }
            i13 = i14;
            i12 = -1;
        } else {
            if (z11) {
                i11 = 11;
            } else if (z12) {
                i11 = 12;
            } else {
                i11 = 10;
            }
            i12 = i11;
            i13 = -1;
        }
        if ((m140173l0() || m140174m0()) && this.f128892C.length() > 0 && AbstractC19074t.m100204b(this.f128892C, CoreUtility.f89233i)) {
            z13 = true;
        }
        return new C20649e(i13, i12, "", list, str, !z13);
    }

    /* renamed from: h0 */
    static /* synthetic */ C20649e m140172h0(C27361d c27361d, boolean z11, boolean z12, List list, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = new ArrayList();
        }
        if ((i11 & 8) != 0) {
            str = "";
        }
        return c27361d.m140171g0(z11, z12, list, str);
    }

    /* renamed from: l0 */
    private final boolean m140173l0() {
        return this.f128894E == 0;
    }

    /* renamed from: m0 */
    private final boolean m140174m0() {
        return this.f128894E == 1;
    }

    /* renamed from: n0 */
    private final void m140175n0() {
        if (this.f128891B.length() == 0) {
            this.f128893D = false;
            this.f128902w.mo9224q(m140172h0(this, false, true, null, m140178q0(ExceptionGetLikeDetail.f46296p), 4, null));
        } else {
            this.f128896G.m110521n(this.f128891B);
            this.f128896G.m110522o(this.f128905z);
            this.f128896G.m110526s(this.f128890A);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new a(null), 3, null);
        }
    }

    /* renamed from: o0 */
    private final void m140176o0() {
        if (this.f128905z.length() == 0) {
            this.f128893D = false;
            this.f128902w.mo9224q(m140172h0(this, false, true, null, m140178q0(ExceptionGetLikeDetail.f46296p), 4, null));
        } else {
            this.f128895F.m110539l(this.f128905z);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b(null), 3, null);
        }
    }

    /* renamed from: p0 */
    private final void m140177p0() {
        if (this.f128890A.length() == 0) {
            this.f128893D = false;
            this.f128902w.mo9224q(m140172h0(this, false, true, null, m140178q0(ExceptionGetLikeDetail.f46296p), 4, null));
        } else {
            this.f128895F.m110539l(this.f128890A);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(null), 3, null);
        }
    }

    /* renamed from: q0 */
    public final String m140178q0(Exception exc) {
        int i11;
        if (exc instanceof ExceptionGetLikeDetail) {
            i11 = AbstractC8020f0.str_likes_dialog_error;
        } else {
            i11 = AbstractC8020f0.unknown_error;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100205c(m118743r0);
        return m118743r0;
    }

    /* renamed from: s0 */
    private final void m140179s0(InterfaceC27218a interfaceC27218a, InterfaceC29195b interfaceC29195b) {
        if (interfaceC29195b instanceof C29198e) {
            FeedActionZUtils.m47567y(interfaceC27218a, ((C29198e) interfaceC29195b).m145768f());
        }
    }

    /* renamed from: t0 */
    private final void m140180t0(InterfaceC27218a interfaceC27218a, InterfaceC29195b interfaceC29195b) {
        if (interfaceC29195b instanceof C29198e) {
            FeedActionZUtils.m47568z(interfaceC27218a, ((C29198e) interfaceC29195b).m145768f(), null, C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_AUDIO_SEEK_RENDERING_START));
        }
    }

    /* renamed from: u0 */
    private final void m140181u0(int i11, String str, AbstractC22055v0.l lVar) {
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        this.f128904y.mo9224q(Integer.valueOf(i11));
        lVar.mo47172c(m115161u, null, this.f128897H);
    }

    /* renamed from: a0 */
    public final C29198e m140182a0(LikeContactItem likeContactItem) {
        int i11;
        AbstractC19074t.m100208f(likeContactItem, "item");
        if (this.f128894E != 2 && likeContactItem.m56332c() != 0) {
            i11 = likeContactItem.m56332c();
        } else {
            i11 = 1;
        }
        String m56333d = likeContactItem.m56333d();
        AbstractC19074t.m100207e(m56333d, "getUserId(...)");
        String m56330a = likeContactItem.m56330a();
        AbstractC19074t.m100207e(m56330a, "getAvatar(...)");
        String m56331b = likeContactItem.m56331b();
        AbstractC19074t.m100207e(m56331b, "getDisplayName(...)");
        boolean m115116F = AbstractC22055v0.m115116F(likeContactItem.m56333d(), false);
        boolean m115115E = AbstractC22055v0.m115115E(likeContactItem.m56333d(), false);
        String m114542i = AbstractC21935u.m114542i(likeContactItem.m56333d(), likeContactItem.m56331b());
        AbstractC19074t.m100207e(m114542i, "convertZingNameToPhoneName(...)");
        return new C29198e(m56333d, m56330a, m56331b, i11, m115116F, m115115E, m114542i);
    }

    /* renamed from: b0 */
    public final boolean m140183b0() {
        C20649e c20649e;
        C20649e c20649e2 = (C20649e) this.f128902w.mo9215f();
        if ((c20649e2 != null && c20649e2.m107631c() == 2) || ((c20649e = (C20649e) this.f128902w.mo9215f()) != null && c20649e.m107629a() == 12)) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    public final int m140184c0() {
        TrackingSource m154341M = C32017m4.m154326S().m154341M(this.f128898I);
        if (m154341M != null) {
            return m154341M.m40683t();
        }
        return 0;
    }

    /* renamed from: e0 */
    public final int m140185e0() {
        int i11 = this.f128894E;
        if (i11 == 0 || i11 == 1) {
            return 1;
        }
        return i11 != 2 ? 0 : 2;
    }

    /* renamed from: f0 */
    public final LiveData m140186f0() {
        return this.f128902w;
    }

    /* renamed from: i0 */
    public final int m140187i0() {
        return this.f128894E;
    }

    /* renamed from: j0 */
    public final LiveData m140188j0() {
        return this.f128903x;
    }

    /* renamed from: k0 */
    public final LiveData m140189k0() {
        return this.f128904y;
    }

    /* renamed from: r0 */
    public final void m140190r0(InterfaceC28604a interfaceC28604a, InterfaceC27218a interfaceC27218a, AbstractC22055v0.l lVar) {
        AbstractC19074t.m100208f(interfaceC28604a, "event");
        AbstractC19074t.m100208f(lVar, "storyPopulateListener");
        if (interfaceC28604a instanceof C28608e) {
            m140194y0();
            return;
        }
        if (interfaceC28604a instanceof C28605b) {
            C28605b c28605b = (C28605b) interfaceC28604a;
            if (c28605b.m143020a() instanceof C29198e) {
                if (((C29198e) c28605b.m143020a()).m145765c()) {
                    m140181u0(c28605b.m143021b(), ((C29198e) c28605b.m143020a()).m145768f(), lVar);
                    return;
                } else {
                    m140180t0(interfaceC27218a, c28605b.m143020a());
                    return;
                }
            }
            return;
        }
        if (interfaceC28604a instanceof C28606c) {
            m140179s0(interfaceC27218a, ((C28606c) interfaceC28604a).m143022a());
        } else if (interfaceC28604a instanceof C28607d) {
            m140180t0(interfaceC27218a, ((C28607d) interfaceC28604a).m143023a());
        }
    }

    /* renamed from: v0 */
    public final void m140191v0(List list, String str) {
        AbstractC19074t.m100208f(list, "feedReactionDataList");
        AbstractC19074t.m100208f(str, "uid");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27360c c27360c = (C27360c) it.next();
            if ((c27360c.m140157a() instanceof C29198e) && AbstractC19074t.m100204b(((C29198e) c27360c.m140157a()).m145768f(), str)) {
                ((C29198e) c27360c.m140157a()).m145770h(AbstractC22055v0.m115116F(((C29198e) c27360c.m140157a()).m145768f(), false));
                ((C29198e) c27360c.m140157a()).m145769g(AbstractC22055v0.m115115E(((C29198e) c27360c.m140157a()).m145768f(), false));
                return;
            }
        }
    }

    /* renamed from: w0 */
    public void m140192w0(C8841b c8841b) {
        C32002l4 m154287a;
        super.m103748N(c8841b);
        if (c8841b != null) {
            try {
                this.f128905z = c8841b.m47204c();
                this.f128890A = c8841b.m47207f();
                this.f128891B = c8841b.m47202a();
                this.f128894E = c8841b.m47206e();
                this.f128897H = c8841b.m47208g();
                if (c8841b.m47203b().m154281r()) {
                    m154287a = c8841b.m47203b().m154271a(10033);
                } else {
                    m154287a = C32002l4.Companion.m154287a(10033);
                }
                this.f128898I = m154287a;
                this.f128892C = c8841b.m47205d();
                m140194y0();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: x0 */
    public final void m140193x0(List list, String str) {
        AbstractC19074t.m100208f(list, "listItem");
        AbstractC19074t.m100208f(str, "uid");
        try {
            Iterator it = list.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    C27360c c27360c = (C27360c) it.next();
                    if ((c27360c.m140157a() instanceof C29198e) && AbstractC19074t.m100204b(((C29198e) c27360c.m140157a()).m145768f(), str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f128904y.mo9224q(Integer.valueOf(i11));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: y0 */
    public final void m140194y0() {
        if (!this.f128893D) {
            this.f128893D = true;
            int i11 = this.f128894E;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        m140175n0();
                        return;
                    }
                    return;
                }
                m140177p0();
                return;
            }
            m140176o0();
        }
    }
}
