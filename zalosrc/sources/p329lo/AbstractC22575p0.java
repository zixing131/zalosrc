package p329lo;

import bo.C3020p0;
import bo.C3054x;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8549a;
import com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase;
import en0.InterfaceC18509p;
import es.AbstractC18591b;
import es.C18592c;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import on0.AbstractC24341v;
import p167fs.C19137b;
import p167fs.C19140e;
import p236ic.AbstractC20504a;
import p348mi.AbstractC23304d;
import p425po.C24879a;
import p425po.C24880b;
import p455qo.C25407f;
import p455qo.C25441y;
import p458qr.AbstractC25468a;
import p615wn.C29110f;
import p716zh.C31965ic;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import to.C26851a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: lo.p0 */
/* loaded from: classes4.dex */
public abstract class AbstractC22575p0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.p0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f110442t;

        /* renamed from: u */
        final /* synthetic */ String f110443u;

        /* renamed from: v */
        final /* synthetic */ List f110444v;

        /* renamed from: w */
        final /* synthetic */ C22547b0 f110445w;

        /* renamed from: x */
        final /* synthetic */ C3020p0 f110446x;

        /* renamed from: lo.p0$a$a */
        /* loaded from: classes4.dex */
        public static final class C32890a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C22547b0 f110447p;

            /* renamed from: q */
            final /* synthetic */ C3020p0 f110448q;

            /* renamed from: r */
            final /* synthetic */ List f110449r;

            C32890a(C22547b0 c22547b0, C3020p0 c3020p0, List list) {
                this.f110447p = c22547b0;
                this.f110448q = c3020p0;
                this.f110449r = list;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                String str;
                boolean m127128x;
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    ((InterfaceC22546b) this.f110447p.m103742Dp()).mo49315c4();
                    ((InterfaceC22546b) this.f110447p.m103742Dp()).mo78936E(((UnTagFeedUseCase.C8547c) ((AbstractC25468a.c) abstractC25468a).m131935a()).m45590a());
                    this.f110448q.m14530v0(this.f110449r, true);
                    ((InterfaceC22546b) this.f110447p.m103742Dp()).mo79654tf(this.f110447p.m116773Mq(false));
                    ((InterfaceC22546b) this.f110447p.m103742Dp()).mo79612Qa(this.f110447p.m116774Pq(true));
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    ((InterfaceC22546b) this.f110447p.m103742Dp()).mo49315c4();
                    AbstractC25468a.a aVar = (AbstractC25468a.a) abstractC25468a;
                    if (aVar.m131934a() instanceof UnTagFeedUseCase.ExceptionUnTagFeed) {
                        this.f110447p.m116775Sq(false);
                    } else {
                        Exception m131934a = aVar.m131934a();
                        if (m131934a == null || (str = m131934a.getMessage()) == null) {
                            str = "";
                        }
                        m127128x = AbstractC24341v.m127128x(str);
                        if (!m127128x) {
                            ((InterfaceC22546b) this.f110447p.m103742Dp()).mo78936E(str);
                        }
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    ((InterfaceC22546b) this.f110447p.m103742Dp()).mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, List list, C22547b0 c22547b0, C3020p0 c3020p0, Continuation continuation) {
            super(2, continuation);
            this.f110443u = str;
            this.f110444v = list;
            this.f110445w = c22547b0;
            this.f110446x = c3020p0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f110443u, this.f110444v, this.f110445w, this.f110446x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f110442t;
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
                UnTagFeedUseCase unTagFeedUseCase = new UnTagFeedUseCase(null, null, 3, null);
                String str = this.f110443u;
                AbstractC19074t.m100207e(str, "$feedId");
                UnTagFeedUseCase.C8546b c8546b = new UnTagFeedUseCase.C8546b(str, this.f110444v);
                this.f110442t = 1;
                obj = unTagFeedUseCase.m101498a(c8546b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                C32890a c32890a = new C32890a(this.f110445w, this.f110446x, this.f110444v);
                this.f110442t = 2;
                if (flow.mo97893a(c32890a, this) == m142578e) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.p0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f110450t;

        /* renamed from: u */
        final /* synthetic */ String f110451u;

        /* renamed from: v */
        final /* synthetic */ String f110452v;

        /* renamed from: w */
        final /* synthetic */ C22547b0 f110453w;

        /* renamed from: lo.p0$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C22547b0 f110454p;

            a(C22547b0 c22547b0) {
                this.f110454p = c22547b0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    ((InterfaceC22546b) this.f110454p.m103742Dp()).mo49315c4();
                    ((InterfaceC22546b) this.f110454p.m103742Dp()).mo79607Dm();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    ((InterfaceC22546b) this.f110454p.m103742Dp()).mo49315c4();
                    InterfaceC22546b interfaceC22546b = (InterfaceC22546b) this.f110454p.m103742Dp();
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC22546b.mo78936E(m118743r0);
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    ((InterfaceC22546b) this.f110454p.m103742Dp()).mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, C22547b0 c22547b0, Continuation continuation) {
            super(2, continuation);
            this.f110451u = str;
            this.f110452v = str2;
            this.f110453w = c22547b0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f110451u, this.f110452v, this.f110453w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f110450t;
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
                C26851a c26851a = new C26851a(null, 1, null);
                C26851a.a aVar = new C26851a.a(this.f110451u, this.f110452v, null, false);
                this.f110450t = 1;
                obj = c26851a.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f110453w);
                this.f110450t = 2;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.p0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f110455t;

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
            int i11 = this.f110455t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25407f c25407f = new C25407f(null, null, 3, null);
                this.f110455t = 1;
                if (c25407f.m101503a(this) == m142578e) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.p0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f110456t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f110457u;

        /* renamed from: v */
        final /* synthetic */ C32002l4 f110458v;

        /* renamed from: w */
        final /* synthetic */ C22547b0 f110459w;

        /* renamed from: lo.p0$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C22547b0 f110460p;

            /* renamed from: q */
            final /* synthetic */ C3020p0 f110461q;

            a(C22547b0 c22547b0, C3020p0 c3020p0) {
                this.f110460p = c22547b0;
                this.f110461q = c3020p0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                AbstractC22575p0.m116813d(this.f110460p, this.f110461q, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3020p0 c3020p0, C32002l4 c32002l4, C22547b0 c22547b0, Continuation continuation) {
            super(2, continuation);
            this.f110457u = c3020p0;
            this.f110458v = c32002l4;
            this.f110459w = c22547b0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f110457u, this.f110458v, this.f110459w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f110456t;
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
                boolean z11 = this.f110457u.f12064w;
                TrackingSource m154333E = C32017m4.m154326S().m154333E(this.f110458v, !z11);
                if (m154333E != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154333E, c19137b.m100440b(this.f110457u));
                }
                if (z11) {
                    C3020p0 c3020p0 = this.f110457u;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.d(c3020p0, m154333E);
                } else {
                    C3020p0 c3020p02 = this.f110457u;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.b(c3020p02, 1, m154333E);
                }
                C18592c c18592c = new C18592c(null, 1, null);
                this.f110456t = 1;
                obj = c18592c.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f110459w, this.f110457u);
                this.f110456t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.p0$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f110462t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f110463u;

        /* renamed from: v */
        final /* synthetic */ C22547b0 f110464v;

        /* renamed from: lo.p0$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C22547b0 f110465p;

            a(C22547b0 c22547b0) {
                this.f110465p = c22547b0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                int i11;
                int m153682b;
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    C3020p0 c3020p0 = this.f110465p.f110365v;
                    if (c3020p0 != null && ((i11 = c3020p0.f12058q) == 2 || i11 == 3)) {
                        Map map = AbstractC23304d.f113405l;
                        C31965ic c31965ic = (C31965ic) map.get(c3020p0.f12022B.f12280b);
                        if (c31965ic != null && (m153682b = c31965ic.m153682b()) > 0) {
                            Object obj = map.get(c3020p0.f12022B.f12280b);
                            AbstractC19074t.m100205c(obj);
                            ((C31965ic) obj).m153686f(m153682b - 1);
                        }
                    }
                    this.f110465p.m116775Sq(true);
                    ((InterfaceC22546b) this.f110465p.m103742Dp()).mo49315c4();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    ((InterfaceC22546b) this.f110465p.m103742Dp()).mo59032jx(AbstractC8020f0.error_message);
                    ((InterfaceC22546b) this.f110465p.m103742Dp()).mo49315c4();
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    ((InterfaceC22546b) this.f110465p.m103742Dp()).mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3020p0 c3020p0, C22547b0 c22547b0, Continuation continuation) {
            super(2, continuation);
            this.f110463u = c3020p0;
            this.f110464v = c22547b0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f110463u, this.f110464v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f110462t;
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
                C8549a c8549a = new C8549a(null, 1, null);
                String str = this.f110463u.f12057p;
                AbstractC19074t.m100207e(str, "fid");
                C8549a.a aVar = new C8549a.a(str, false);
                this.f110462t = 1;
                obj = c8549a.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f110464v);
                this.f110462t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.p0$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f110466t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f110467u;

        /* renamed from: v */
        final /* synthetic */ C32002l4 f110468v;

        /* renamed from: w */
        final /* synthetic */ int f110469w;

        /* renamed from: x */
        final /* synthetic */ C22547b0 f110470x;

        /* renamed from: lo.p0$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C22547b0 f110471p;

            /* renamed from: q */
            final /* synthetic */ C3020p0 f110472q;

            a(C22547b0 c22547b0, C3020p0 c3020p0) {
                this.f110471p = c22547b0;
                this.f110472q = c3020p0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                AbstractC22575p0.m116813d(this.f110471p, this.f110472q, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3020p0 c3020p0, C32002l4 c32002l4, int i11, C22547b0 c22547b0, Continuation continuation) {
            super(2, continuation);
            this.f110467u = c3020p0;
            this.f110468v = c32002l4;
            this.f110469w = i11;
            this.f110470x = c22547b0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f110467u, this.f110468v, this.f110469w, this.f110470x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f110466t;
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
                boolean z11 = this.f110467u.f12064w;
                TrackingSource m154333E = C32017m4.m154326S().m154333E(this.f110468v, !z11);
                if (m154333E != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154333E, c19137b.m100442d(this.f110467u, this.f110469w));
                }
                if (z11) {
                    C3020p0 c3020p0 = this.f110467u;
                    int i12 = this.f110469w;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.a(c3020p0, i12, m154333E);
                } else {
                    C3020p0 c3020p02 = this.f110467u;
                    int i13 = this.f110469w;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.b(c3020p02, i13, m154333E);
                }
                C18592c c18592c = new C18592c(null, 1, null);
                this.f110466t = 1;
                obj = c18592c.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f110470x, this.f110467u);
                this.f110466t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: c */
    public static final void m116812c(C22547b0 c22547b0, List list) {
        String str;
        AbstractC19074t.m100208f(c22547b0, "<this>");
        AbstractC19074t.m100208f(list, "uids");
        C3020p0 c3020p0 = c22547b0.f110365v;
        if (c3020p0 != null && (str = c22547b0.f110363t) != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c22547b0), null, null, new a(str, list, c22547b0, c3020p0, null), 3, null);
        }
    }

    /* renamed from: d */
    public static final void m116813d(C22547b0 c22547b0, C3020p0 c3020p0, AbstractC18591b.a aVar) {
        if (!(aVar instanceof AbstractC18591b.a.c)) {
            C19140e.f95172a.m100456h(c3020p0, aVar.mo98147a());
            ((InterfaceC22546b) c22547b0.m103742Dp()).mo79630bh(c3020p0);
            C25441y c25441y = new C25441y(null, 1, null);
            String str = c3020p0.f12057p;
            AbstractC19074t.m100207e(str, "fid");
            c25441y.m101508a(new C25441y.a(str));
        }
        if (aVar instanceof AbstractC18591b.a.C32819a) {
            AbstractC19444a.m101697e(new Runnable() { // from class: lo.o0

                /* renamed from: q */
                public final /* synthetic */ AbstractC18591b.a f110440q;

                public /* synthetic */ RunnableC22573o0(AbstractC18591b.a aVar2) {
                    r2 = aVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC22575p0.m116814e(C22547b0.this, r2);
                }
            });
        }
    }

    /* renamed from: e */
    public static final void m116814e(C22547b0 c22547b0, AbstractC18591b.a aVar) {
        AbstractC19074t.m100208f(c22547b0, "$this_handleReactFeedResult");
        AbstractC19074t.m100208f(aVar, "$result");
        ((InterfaceC22546b) c22547b0.m103742Dp()).mo78936E(C19140e.f95172a.m100452b(((AbstractC18591b.a.C32819a) aVar).m98148b()));
    }

    /* renamed from: f */
    public static final void m116815f(C22547b0 c22547b0, String str, String str2) {
        AbstractC19074t.m100208f(c22547b0, "<this>");
        if (str != null && str2 != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c22547b0), null, null, new b(str, str2, c22547b0, null), 3, null);
        }
    }

    /* renamed from: g */
    public static final void m116816g(C22547b0 c22547b0) {
        AbstractC19074t.m100208f(c22547b0, "<this>");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c22547b0), null, null, new c(null), 3, null);
    }

    /* renamed from: h */
    public static final void m116817h(C22547b0 c22547b0, C3020p0 c3020p0, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c22547b0, "<this>");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        if (!c22547b0.m116778cr()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c22547b0), null, null, new d(c3020p0, c32002l4, c22547b0, null), 3, null);
            return;
        }
        InterfaceC22546b interfaceC22546b = (InterfaceC22546b) c22547b0.m103742Dp();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_retry_feed_fail);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        interfaceC22546b.mo78936E(m118743r0);
    }

    /* renamed from: i */
    public static final void m116818i(C22547b0 c22547b0, C3020p0 c3020p0) {
        AbstractC19074t.m100208f(c22547b0, "<this>");
        if (c3020p0 != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c22547b0), null, null, new e(c3020p0, c22547b0, null), 3, null);
        }
    }

    /* renamed from: j */
    public static final void m116819j(C22547b0 c22547b0, C3020p0 c3020p0, int i11, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c22547b0, "<this>");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        if (!c22547b0.m116778cr()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c22547b0), null, null, new f(c3020p0, c32002l4, i11, c22547b0, null), 3, null);
            return;
        }
        InterfaceC22546b interfaceC22546b = (InterfaceC22546b) c22547b0.m103742Dp();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notify_retry_feed_fail);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        interfaceC22546b.mo78936E(m118743r0);
    }

    /* renamed from: k */
    public static final C3054x m116820k(C24880b c24880b) {
        CharSequence charSequence;
        CharSequence m118743r0;
        String str;
        String str2;
        C24879a m129380b;
        String m129373b;
        C24879a m129380b2;
        TextLocalization m129372a;
        C24879a m129380b3;
        StringTheme m129375d;
        C24879a m129380b4;
        C29110f m129374c;
        C24879a m129380b5;
        C29110f m129376e;
        C3054x c3054x = new C3054x(false, 1, null);
        String str3 = "";
        if (c24880b == null || (m129380b5 = c24880b.m129380b()) == null || (m129376e = m129380b5.m129376e()) == null || (charSequence = m129376e.m145359a()) == null) {
            charSequence = "";
        }
        c3054x.m14666X(charSequence);
        if (c24880b == null || (m129380b4 = c24880b.m129380b()) == null || (m129374c = m129380b4.m129374c()) == null || (m118743r0 = m129374c.m145359a()) == null) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
        }
        c3054x.m14650H(m118743r0);
        if (c24880b == null || (m129380b3 = c24880b.m129380b()) == null || (m129375d = m129380b3.m129375d()) == null || (str = m129375d.getValue()) == null) {
            str = "";
        }
        c3054x.m14659Q(str);
        if (c24880b == null || (m129380b2 = c24880b.m129380b()) == null || (m129372a = m129380b2.m129372a()) == null || (str2 = m129372a.m44977b()) == null) {
            str2 = "";
        }
        c3054x.m14667Y(str2);
        if (c24880b != null && (m129380b = c24880b.m129380b()) != null && (m129373b = m129380b.m129373b()) != null) {
            str3 = m129373b;
        }
        c3054x.m14647E(str3);
        if (c24880b != null && c24880b.m129379a() == 18028) {
            c3054x.m14657O(C23212s8.m119610r(AbstractC16781w.SocialKycErrorIllustrator));
        } else {
            c3054x.m14657O(AbstractC16803z.ic_unavailable_post);
        }
        c3054x.m14661S(AbstractC23136l9.m118742r(40.0f));
        c3054x.m14648F(C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor));
        c3054x.m14658P(AbstractC23222t7.f112597y0);
        return c3054x;
    }
}
