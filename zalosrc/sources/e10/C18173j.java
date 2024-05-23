package e10;

import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.config.VideoNativeCompressConfig;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.VideoEditConfig;
import com.zing.zalo.shortvideo.data.p071db.entities.LogUpload;
import com.zing.zalo.shortvideo.data.remote.common.AlreadyExistsException;
import com.zing.zalo.shortvideo.data.remote.common.EncoderException;
import com.zing.zalo.shortvideo.data.remote.common.RestException;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import f10.C18691c;
import f10.C18692d;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import hn0.AbstractC20104d;
import hu.AbstractC20130d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p021an.AbstractC0955d;
import p390of.EnumC24245a;
import p559uv.C27373c;
import p576vh.C28251a;
import p576vh.C28252b;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;
import sh.InterfaceC26248a;
import th.AbstractC26689j;
import th.AbstractC26693n;
import th.C26692m;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;

/* renamed from: e10.j */
/* loaded from: classes5.dex */
public final class C18173j {

    /* renamed from: o */
    private static C18173j f92273o;

    /* renamed from: a */
    private final String f92275a;

    /* renamed from: b */
    private final InterfaceC24854k f92276b;

    /* renamed from: c */
    private final InterfaceC24854k f92277c;

    /* renamed from: d */
    private final CoroutineScope f92278d;

    /* renamed from: e */
    private final ArrayList f92279e;

    /* renamed from: f */
    private boolean f92280f;

    /* renamed from: g */
    private boolean f92281g;

    /* renamed from: h */
    private Long f92282h;

    /* renamed from: i */
    private boolean f92283i;

    /* renamed from: j */
    private boolean f92284j;

    /* renamed from: k */
    private boolean f92285k;

    /* renamed from: l */
    private final ArrayList f92286l;

    /* renamed from: m */
    private C24860q f92287m;

    /* renamed from: n */
    private C24860q f92288n;
    public static final a Companion = new a(null);

    /* renamed from: p */
    private static final ReentrantLock f92274p = new ReentrantLock();

    /* renamed from: e10.j$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        private final C18173j m96884c() {
            String str;
            ReentrantLock reentrantLock = C18173j.f92274p;
            reentrantLock.lock();
            try {
                String str2 = CoreUtility.f89233i;
                if (C18173j.f92273o != null) {
                    C18173j c18173j = C18173j.f92273o;
                    if (c18173j != null) {
                        str = c18173j.m96883s();
                    } else {
                        str = null;
                    }
                    if (!AbstractC19074t.m100204b(str, str2)) {
                        C18173j c18173j2 = C18173j.f92273o;
                        if (c18173j2 != null) {
                            c18173j2.m96882r();
                        }
                        AbstractC19074t.m100205c(str2);
                        C18173j.f92273o = new C18173j(str2);
                    }
                } else {
                    AbstractC19074t.m100205c(str2);
                    C18173j.f92273o = new C18173j(str2);
                }
                C18173j c18173j3 = C18173j.f92273o;
                AbstractC19074t.m100205c(c18173j3);
                reentrantLock.unlock();
                return c18173j3;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        /* renamed from: a */
        public final void m96885a() {
            VideoEditConfig m51430g;
            String str;
            String l11;
            String l12;
            String l13;
            ChannelConfig m140381e = C27417l.f129055a.m140381e();
            if (m140381e != null && (m51430g = m140381e.m51430g()) != null) {
                C28252b m137081H = AbstractC26689j.m137081H(4);
                AbstractC19074t.m100206d(m137081H, "null cannot be cast to non-null type com.zing.zalo.config.media.video.MutableVideoConfig");
                C28251a c28251a = (C28251a) m137081H;
                Long m51516q = m51430g.m51516q();
                if (m51516q != null) {
                    int longValue = (int) m51516q.longValue();
                    c28251a.mo142258w(longValue);
                    c28251a.mo142256u(longValue);
                }
                Long m51514o = m51430g.m51514o();
                if (m51514o != null) {
                    int longValue2 = (int) m51514o.longValue();
                    c28251a.mo142257v(longValue2);
                    c28251a.mo142254s(longValue2);
                }
                Long m51515p = m51430g.m51515p();
                if (m51515p != null) {
                    int longValue3 = (int) m51515p.longValue();
                    c28251a.mo142255t(longValue3);
                    c28251a.mo142253r(longValue3);
                    c28251a.mo142252q(longValue3);
                }
                C26692m mo142238a = c28251a.mo142238a();
                List m51506g = m51430g.m51506g();
                if (m51506g != null) {
                    Iterator it = m51506g.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (AbstractC26693n.m137176a().contains(Integer.valueOf(intValue)) && !mo142238a.m137160a().contains(Integer.valueOf(intValue))) {
                            mo142238a.m137160a().add(Integer.valueOf(intValue));
                        }
                    }
                }
                Long m51502c = m51430g.m51502c();
                if (m51502c != null) {
                    mo142238a.m137170k(m51502c.longValue());
                }
                Long m51505f = m51430g.m51505f();
                if (m51505f != null) {
                    mo142238a.m137173n((float) m51505f.longValue());
                }
                Long m51501b = m51430g.m51501b();
                if (m51501b != null) {
                    mo142238a.m137169j((int) m51501b.longValue());
                }
                Long m51507h = m51430g.m51507h();
                if (m51507h != null) {
                    mo142238a.m137174o((int) m51507h.longValue());
                }
                Long m51504e = m51430g.m51504e();
                if (m51504e != null) {
                    mo142238a.m137172m(m51504e.longValue());
                }
                Long m51503d = m51430g.m51503d();
                if (m51503d != null) {
                    mo142238a.m137171l((int) m51503d.longValue());
                }
                VideoNativeCompressConfig mo142240c = c28251a.mo142240c();
                Long m51509j = m51430g.m51509j();
                if (m51509j != null && (l13 = m51509j.toString()) != null) {
                    mo142240c.m40337k(l13);
                }
                String m51511l = m51430g.m51511l();
                if (m51511l != null) {
                    mo142240c.m40339m(m51511l);
                }
                String m51512m = m51430g.m51512m();
                if (m51512m != null) {
                    mo142240c.m40340n(m51512m);
                }
                Long m51508i = m51430g.m51508i();
                if (m51508i != null && (l12 = m51508i.toString()) != null) {
                    mo142240c.m40336j(l12);
                }
                Long m51510k = m51430g.m51510k();
                if (m51510k != null && (l11 = m51510k.toString()) != null) {
                    mo142240c.m40338l(l11);
                }
                Long m51513n = m51430g.m51513n();
                if (m51513n != null) {
                    int longValue4 = (int) m51513n.longValue();
                    if (longValue4 <= 360) {
                        str = "360p";
                    } else {
                        if (361 > longValue4 || longValue4 >= 481) {
                            if (481 <= longValue4 && longValue4 < 721) {
                                str = "720p";
                            } else if (721 <= longValue4 && longValue4 < 1081) {
                                str = "1080p";
                            }
                        }
                        str = "480p";
                    }
                    mo142240c.m40341o(str);
                }
            }
        }

        /* renamed from: b */
        public final C18173j m96886b() {
            return m96884c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f92289t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f92290u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f92291v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f92292w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18505l interfaceC18505l3, Continuation continuation) {
            super(2, continuation);
            this.f92290u = interfaceC18505l;
            this.f92291v = interfaceC18505l2;
            this.f92292w = interfaceC18505l3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f92290u, this.f92291v, this.f92292w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92289t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18505l interfaceC18505l = this.f92290u;
                    this.f92289t = 1;
                    obj = interfaceC18505l.mo205i9(this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                this.f92291v.mo205i9(obj);
            } catch (Exception e11) {
                this.f92292w.mo205i9(e11);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f92293t;

        /* renamed from: u */
        final /* synthetic */ Flow f92294u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f92295v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f92296w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e10.j$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f92297t;

            /* renamed from: u */
            /* synthetic */ Object f92298u;

            /* renamed from: v */
            final /* synthetic */ InterfaceC18505l f92299v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l, Continuation continuation) {
                super(3, continuation);
                this.f92299v = interfaceC18505l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f92297t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f92299v.mo205i9((Throwable) this.f92298u);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f92299v, continuation);
                aVar.f92298u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e10.j$c$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ InterfaceC18505l f92300p;

            b(InterfaceC18505l interfaceC18505l) {
                this.f92300p = interfaceC18505l;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public final Object mo12109b(Object obj, Continuation continuation) {
                this.f92300p.mo205i9(obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Flow flow, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, Continuation continuation) {
            super(2, continuation);
            this.f92294u = flow;
            this.f92295v = interfaceC18505l;
            this.f92296w = interfaceC18505l2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f92294u, this.f92295v, this.f92296w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92293t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow m113288f = FlowKt.m113288f(this.f92294u, new a(this.f92295v, null));
                    b bVar = new b(this.f92296w);
                    this.f92293t = 1;
                    if (m113288f.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            } catch (Exception e11) {
                this.f92295v.mo205i9(e11);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C18174k f92302r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C18174k c18174k) {
            super(1);
            this.f92302r = c18174k;
        }

        /* renamed from: a */
        public final void m96890a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            C18173j.this.m96852L(this.f92302r, EnumC18172i.f92270t, th2, 0);
            C18173j.m96851K(C18173j.this, null, false, 1, null);
            C18173j.this.m96849I();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96890a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C18174k f92303q;

        /* renamed from: r */
        final /* synthetic */ C18173j f92304r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C18174k c18174k, C18173j c18173j) {
            super(1);
            this.f92303q = c18174k;
            this.f92304r = c18173j;
        }

        /* renamed from: a */
        public final void m96891a(C18692d c18692d) {
            int m104529e;
            AbstractC19074t.m100208f(c18692d, "event");
            if (!(c18692d instanceof C18691c)) {
                m104529e = AbstractC20104d.m104529e(c18692d.m98595a() * 70);
                this.f92304r.f92287m = new C24860q(Long.valueOf(this.f92303q.m96902b()), Integer.valueOf(m104529e));
                this.f92304r.m96847C(this.f92303q.m96902b(), m104529e);
                return;
            }
            this.f92303q.m96908h(((C18691c) c18692d).m98594b());
            C18173j.m96853M(this.f92304r, this.f92303q, EnumC18172i.f92267q, null, null, 6, null);
            this.f92304r.f92287m = new C24860q(Long.valueOf(this.f92303q.m96902b()), 70);
            this.f92304r.m96847C(this.f92303q.m96902b(), 70);
            C18173j.m96851K(this.f92304r, null, false, 1, null);
            this.f92304r.m96849I();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96891a((C18692d) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C18174k f92306r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C18174k c18174k) {
            super(1);
            this.f92306r = c18174k;
        }

        /* renamed from: a */
        public final void m96892a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            C18173j.this.m96852L(this.f92306r, EnumC18172i.f92270t, th2, 1);
            C18173j.this.f92283i = false;
            C18173j.this.m96849I();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96892a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C18174k f92307q;

        /* renamed from: r */
        final /* synthetic */ C18173j f92308r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C18174k c18174k, C18173j c18173j) {
            super(1);
            this.f92307q = c18174k;
            this.f92308r = c18173j;
        }

        /* renamed from: a */
        public final void m96893a(C18692d c18692d) {
            int m104529e;
            AbstractC19074t.m100208f(c18692d, "event");
            if (!(c18692d instanceof C18691c)) {
                m104529e = AbstractC20104d.m104529e(30 * c18692d.m98595a());
                int i11 = m104529e + 70;
                this.f92308r.f92288n = new C24860q(Long.valueOf(this.f92307q.m96902b()), Integer.valueOf(i11));
                this.f92308r.m96847C(this.f92307q.m96902b(), i11);
                return;
            }
            this.f92307q.m96911k(((C18691c) c18692d).m98594b());
            C18173j.m96853M(this.f92308r, this.f92307q, EnumC18172i.f92268r, null, null, 6, null);
            this.f92308r.m96847C(this.f92307q.m96902b(), 100);
            this.f92308r.f92283i = false;
            this.f92308r.m96849I();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96893a((C18692d) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92309t;

        /* renamed from: v */
        final /* synthetic */ C18174k f92311v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C18174k c18174k, Continuation continuation) {
            super(1, continuation);
            this.f92311v = c18174k;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92309t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g m96870t = C18173j.this.m96870t();
                String m96907g = this.f92311v.m96907g();
                String m96901a = this.f92311v.m96901a();
                boolean m96903c = this.f92311v.m96903c();
                this.f92309t = 1;
                obj = m96870t.mo96599j0(m96907g, m96901a, m96903c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96894r(Continuation continuation) {
            return new h(this.f92311v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((h) m96894r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C18174k f92313r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C18174k c18174k) {
            super(1);
            this.f92313r = c18174k;
        }

        /* renamed from: a */
        public final void m96896a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            C18173j.this.m96852L(this.f92313r, EnumC18172i.f92270t, th2, 2);
            C18173j.this.f92284j = false;
            C18173j.this.m96849I();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96896a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C18174k f92315r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C18174k c18174k) {
            super(1);
            this.f92315r = c18174k;
        }

        /* renamed from: a */
        public final void m96897a(Video video) {
            AbstractC19074t.m100208f(video, "result");
            C18173j.m96853M(C18173j.this, this.f92315r, EnumC18172i.f92269s, null, null, 6, null);
            C18173j.m96875y(C18173j.this, this.f92315r, video.m52911t(), null, null, 12, null);
            C18173j.this.m96880G(this.f92315r);
            C18173j.this.m96845A(this.f92315r.m96902b(), video);
            C18173j.this.f92284j = false;
            C18173j.this.m96849I();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96897a((Video) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.j$k */
    /* loaded from: classes5.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f92316t;

        /* renamed from: u */
        private /* synthetic */ Object f92317u;

        /* renamed from: w */
        final /* synthetic */ long f92319w;

        /* renamed from: x */
        final /* synthetic */ VideoBlendingParam f92320x;

        /* renamed from: e10.j$k$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC7761b.c {

            /* renamed from: a */
            final /* synthetic */ ProducerScope f92321a;

            /* renamed from: b */
            final /* synthetic */ C18173j f92322b;

            /* renamed from: c */
            final /* synthetic */ long f92323c;

            a(ProducerScope producerScope, C18173j c18173j, long j11) {
                this.f92321a = producerScope;
                this.f92322b = c18173j;
                this.f92323c = j11;
            }

            @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
            /* renamed from: a */
            public void mo39571a(int i11) {
                ChannelsKt.m113129w(this.f92321a, new C18692d(i11 / 100.0f));
            }

            @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
            /* renamed from: b */
            public void mo39572b(InterfaceC7761b interfaceC7761b) {
                int i11;
                EnumC24245a mo39541e;
                InterfaceC26248a m96872v = this.f92322b.m96872v();
                if (m96872v != null) {
                    m96872v.mo39563a(this.f92323c);
                }
                ProducerScope producerScope = this.f92321a;
                if (interfaceC7761b != null && (mo39541e = interfaceC7761b.mo39541e()) != null) {
                    i11 = mo39541e.m126581c();
                } else {
                    i11 = -1;
                }
                CoroutineScopeKt.m112638b(producerScope, new EncoderException(i11));
            }

            @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
            /* renamed from: c */
            public void mo39573c(InterfaceC7761b interfaceC7761b) {
                AbstractC19074t.m100208f(interfaceC7761b, "task");
                ChannelsKt.m113129w(this.f92321a, new C18692d(0.0f));
            }

            @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
            /* renamed from: d */
            public void mo39574d(InterfaceC7761b interfaceC7761b, String str) {
                AbstractC19074t.m100208f(interfaceC7761b, "task");
                AbstractC19074t.m100208f(str, "outputPath");
                ChannelsKt.m113129w(this.f92321a, new C18691c(str));
                SendChannel.DefaultImpls.m113195a(this.f92321a.mo112918q(), null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j11, VideoBlendingParam videoBlendingParam, Continuation continuation) {
            super(2, continuation);
            this.f92319w = j11;
            this.f92320x = videoBlendingParam;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            k kVar = new k(this.f92319w, this.f92320x, continuation);
            kVar.f92317u = obj;
            return kVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92316t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f92317u;
                InterfaceC26248a m96872v = C18173j.this.m96872v();
                if (m96872v != null) {
                    InterfaceC26248a.a.m134974a(m96872v, this.f92319w, AbstractC20130d.m104906y0() + File.separator, this.f92320x, new a(producerScope, C18173j.this, this.f92319w), 5, null, 32, null);
                }
                this.f92316t = 1;
                if (ProduceKt.m113185b(producerScope, null, this, 1, null) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((k) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.j$l */
    /* loaded from: classes5.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f92324q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18170g mo12V4() {
            return AbstractC28684a.Companion.m143667D();
        }
    }

    /* renamed from: e10.j$m */
    /* loaded from: classes5.dex */
    static final class m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final m f92325q = new m();

        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC26248a mo12V4() {
            return (InterfaceC26248a) AbstractC0955d.m4496a(CoreUtility.getAppContext(), AbstractC19061k0.m100169b(InterfaceC26248a.class));
        }
    }

    public C18173j(String str) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(str, "id");
        this.f92275a = str;
        m129210a = AbstractC24856m.m129210a(l.f92324q);
        this.f92276b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(m.f92325q);
        this.f92277c = m129210a2;
        this.f92278d = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
        this.f92279e = new ArrayList();
        this.f92286l = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m96845A(long j11, Video video) {
        Iterator it = this.f92286l.iterator();
        while (it.hasNext()) {
            InterfaceC18175l interfaceC18175l = (InterfaceC18175l) ((WeakReference) it.next()).get();
            if (interfaceC18175l != null) {
                interfaceC18175l.mo54105b(j11, video);
            }
        }
    }

    /* renamed from: B */
    static /* synthetic */ void m96846B(C18173j c18173j, long j11, Video video, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            video = null;
        }
        c18173j.m96845A(j11, video);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m96847C(long j11, int i11) {
        Iterator it = this.f92286l.iterator();
        while (it.hasNext()) {
            InterfaceC18175l interfaceC18175l = (InterfaceC18175l) ((WeakReference) it.next()).get();
            if (interfaceC18175l != null) {
                interfaceC18175l.mo54106c(j11, i11);
            }
        }
    }

    /* renamed from: H */
    private final boolean m96848H(C24860q c24860q) {
        if (c24860q == null) {
            return true;
        }
        Iterator it = this.f92279e.iterator();
        while (it.hasNext()) {
            if (((C18174k) it.next()).m96902b() == ((Number) c24860q.m129215c()).longValue()) {
                m96847C(((Number) c24860q.m129215c()).longValue(), ((Number) c24860q.m129216d()).intValue());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m96849I() {
        if (!this.f92280f) {
            m96869q();
        }
    }

    /* renamed from: J */
    private final void m96850J(Long l11, boolean z11) {
        this.f92282h = l11;
        this.f92281g = z11;
    }

    /* renamed from: K */
    static /* synthetic */ void m96851K(C18173j c18173j, Long l11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        c18173j.m96850J(l11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m96852L(C18174k c18174k, EnumC18172i enumC18172i, Throwable th2, Integer num) {
        c18174k.m96909i(c18174k.m96905e());
        c18174k.m96910j(enumC18172i);
        if (enumC18172i == EnumC18172i.f92270t) {
            m96875y(this, c18174k, null, th2, num, 2, null);
            if (th2 instanceof AlreadyExistsException) {
                m96880G(c18174k);
                m96846B(this, c18174k.m96902b(), null, 2, null);
            } else {
                m96847C(c18174k.m96902b(), -1);
            }
        }
    }

    /* renamed from: M */
    static /* synthetic */ void m96853M(C18173j c18173j, C18174k c18174k, EnumC18172i enumC18172i, Throwable th2, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        c18173j.m96852L(c18174k, enumC18172i, th2, num);
    }

    /* renamed from: n */
    private final void m96867n(InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18505l interfaceC18505l3) {
        BuildersKt__Builders_commonKt.m112540d(this.f92278d, null, null, new b(interfaceC18505l, interfaceC18505l3, interfaceC18505l2, null), 3, null);
    }

    /* renamed from: o */
    private final void m96868o(Flow flow, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
        BuildersKt__Builders_commonKt.m112540d(this.f92278d, null, null, new c(flow, interfaceC18505l, interfaceC18505l2, null), 3, null);
    }

    /* renamed from: q */
    private final void m96869q() {
        C18174k m96871u;
        C18174k m96871u2;
        C18174k m96871u3;
        if (this.f92285k) {
            return;
        }
        if (!AbstractC19074t.m100204b(this.f92275a, CoreUtility.f89233i)) {
            m96882r();
            return;
        }
        this.f92280f = true;
        if (!this.f92281g && (m96871u3 = m96871u(EnumC18172i.f92266p)) != null) {
            m96850J(Long.valueOf(m96871u3.m96902b()), true);
            long m96902b = m96871u3.m96902b();
            VideoBlendingParam videoBlendingParam = m96871u3.m96906f().f128947T;
            AbstractC19074t.m100205c(videoBlendingParam);
            m96868o(m96873w(m96902b, videoBlendingParam), new d(m96871u3), new e(m96871u3, this));
        }
        if (!this.f92283i && (m96871u2 = m96871u(EnumC18172i.f92267q)) != null) {
            this.f92283i = true;
            this.f92288n = new C24860q(Long.valueOf(m96871u2.m96902b()), 70);
            m96868o(m96870t().mo96575V(m96871u2.m96904d()), new f(m96871u2), new g(m96871u2, this));
        }
        if (!this.f92284j && (m96871u = m96871u(EnumC18172i.f92268r)) != null) {
            this.f92284j = true;
            m96867n(new h(m96871u, null), new i(m96871u), new j(m96871u));
        }
        this.f92280f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final InterfaceC18170g m96870t() {
        return (InterfaceC18170g) this.f92276b.getValue();
    }

    /* renamed from: u */
    private final C18174k m96871u(EnumC18172i enumC18172i) {
        Iterator it = this.f92279e.iterator();
        while (it.hasNext()) {
            C18174k c18174k = (C18174k) it.next();
            if (c18174k.m96905e() == enumC18172i) {
                return c18174k;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final InterfaceC26248a m96872v() {
        return (InterfaceC26248a) this.f92277c.getValue();
    }

    /* renamed from: w */
    private final Flow m96873w(long j11, VideoBlendingParam videoBlendingParam) {
        return FlowKt.m113287e(new k(j11, videoBlendingParam, null));
    }

    /* renamed from: x */
    private final void m96874x(C18174k c18174k, String str, Throwable th2, Integer num) {
        int i11;
        String str2;
        String str3;
        int i12;
        C27373c m96906f = c18174k.m96906f();
        C19205a c19205a = C19205a.f95429a;
        Integer valueOf = Integer.valueOf((int) m96906f.m140254h());
        String valueOf2 = String.valueOf(m96906f.m140257k());
        String str4 = m96906f.m140218C() + "x" + m96906f.m140217B();
        Long valueOf3 = Long.valueOf(System.currentTimeMillis() - c18174k.m96902b());
        if (th2 != null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        Integer valueOf4 = Integer.valueOf(i11);
        if (th2 != null) {
            String simpleName = th2.getClass().getSimpleName();
            String message = th2.getMessage();
            if (th2 instanceof RestException) {
                i12 = ((RestException) th2).m51529a();
            } else {
                i12 = -1;
            }
            str2 = simpleName + ": " + message + " (" + i12 + ":" + num + ")";
        } else {
            str2 = null;
        }
        String m96901a = c18174k.m96901a();
        VideoBlendingParam videoBlendingParam = m96906f.f128947T;
        if (videoBlendingParam != null) {
            str3 = videoBlendingParam.f48280t;
        } else {
            str3 = null;
        }
        c19205a.m100724a0(new LogUpload(valueOf, valueOf2, str4, valueOf3, valueOf4, str2, m96901a, str, str3, (String) null, 512, (AbstractC19060k) null));
    }

    /* renamed from: y */
    static /* synthetic */ void m96875y(C18173j c18173j, C18174k c18174k, String str, Throwable th2, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        if ((i11 & 8) != 0) {
            num = 0;
        }
        c18173j.m96874x(c18174k, str, th2, num);
    }

    /* renamed from: z */
    private final void m96876z(C18174k c18174k) {
        Iterator it = this.f92286l.iterator();
        while (it.hasNext()) {
            InterfaceC18175l interfaceC18175l = (InterfaceC18175l) ((WeakReference) it.next()).get();
            if (interfaceC18175l != null) {
                interfaceC18175l.mo54104a(c18174k);
            }
        }
    }

    /* renamed from: D */
    public final void m96877D(C27373c c27373c, String str, Long l11, boolean z11) {
        AbstractC19074t.m100208f(c27373c, "input");
        AbstractC19074t.m100208f(str, "desc");
        if (l11 != null) {
            m96879F(l11.longValue(), true);
        }
        C18174k c18174k = new C18174k(c27373c, str, z11);
        if (!c27373c.f128943P && !c27373c.f128942O) {
            String m140220E = c18174k.m96906f().m140220E();
            if (m140220E == null) {
                m140220E = "";
            }
            c18174k.m96908h(m140220E);
            m96853M(this, c18174k, EnumC18172i.f92267q, null, null, 6, null);
        }
        this.f92279e.add(c18174k);
        m96876z(c18174k);
        m96849I();
    }

    /* renamed from: E */
    public final void m96878E(InterfaceC18175l interfaceC18175l) {
        AbstractC19074t.m100208f(interfaceC18175l, "listener");
        interfaceC18175l.mo54107d(this.f92279e);
        if (!m96848H(this.f92287m)) {
            this.f92287m = null;
        }
        if (!m96848H(this.f92288n)) {
            this.f92287m = null;
        }
        Iterator it = this.f92279e.iterator();
        while (it.hasNext()) {
            C18174k c18174k = (C18174k) it.next();
            if (c18174k.m96905e() == EnumC18172i.f92268r) {
                m96847C(c18174k.m96902b(), 100);
            }
        }
        if (!this.f92279e.isEmpty()) {
            m96849I();
        }
        this.f92286l.add(new WeakReference(interfaceC18175l));
    }

    /* renamed from: F */
    public final void m96879F(long j11, boolean z11) {
        boolean m131390w;
        Iterator it = this.f92279e.iterator();
        while (it.hasNext()) {
            C18174k c18174k = (C18174k) it.next();
            if (c18174k.m96902b() == j11) {
                m131390w = AbstractC25358n.m131390w(new EnumC18172i[]{EnumC18172i.f92269s, EnumC18172i.f92270t}, c18174k.m96905e());
                if (m131390w) {
                    this.f92279e.remove(c18174k);
                    if (z11) {
                        m96846B(this, j11, null, 2, null);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: G */
    public final void m96880G(C18174k c18174k) {
        AbstractC19074t.m100208f(c18174k, "task");
        m96879F(c18174k.m96902b(), false);
    }

    /* renamed from: p */
    public final void m96881p(InterfaceC18175l interfaceC18175l) {
        AbstractC19074t.m100208f(interfaceC18175l, "listener");
        Iterator it = this.f92286l.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (AbstractC19074t.m100204b(weakReference.get(), interfaceC18175l)) {
                this.f92286l.remove(weakReference);
                return;
            }
        }
    }

    /* renamed from: r */
    public final void m96882r() {
        this.f92285k = true;
        if (this.f92281g) {
            Long l11 = this.f92282h;
            if (l11 != null) {
                long longValue = l11.longValue();
                InterfaceC26248a m96872v = m96872v();
                if (m96872v != null) {
                    m96872v.mo39563a(longValue);
                }
            }
            this.f92281g = false;
            this.f92282h = null;
        }
        if (this.f92283i) {
            this.f92283i = false;
        }
        if (this.f92284j) {
            this.f92284j = false;
        }
        this.f92280f = false;
        this.f92279e.clear();
        this.f92285k = false;
    }

    /* renamed from: s */
    public final String m96883s() {
        return this.f92275a;
    }
}
