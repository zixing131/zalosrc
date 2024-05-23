package iq;

import bo.C3000l0;
import bo.C3020p0;
import bo.C3054x;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8549a;
import com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import es.AbstractC18591b;
import es.C18592c;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24341v;
import p167fs.C19137b;
import p167fs.C19140e;
import p236ic.AbstractC20504a;
import p363nh.C23744a;
import p425po.C24879a;
import p425po.C24880b;
import p455qo.C25407f;
import p458qr.AbstractC25468a;
import p615wn.C29110f;
import p691yr.C31060j;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: iq.j */
/* loaded from: classes4.dex */
public abstract class AbstractC20697j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.j$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101719t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f101720u;

        /* renamed from: v */
        final /* synthetic */ List f101721v;

        /* renamed from: w */
        final /* synthetic */ AbstractC20677f f101722w;

        /* renamed from: iq.j$a$a */
        /* loaded from: classes4.dex */
        public static final class C32844a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C3020p0 f101723p;

            /* renamed from: q */
            final /* synthetic */ List f101724q;

            /* renamed from: r */
            final /* synthetic */ AbstractC20677f f101725r;

            C32844a(C3020p0 c3020p0, List list, AbstractC20677f abstractC20677f) {
                this.f101723p = c3020p0;
                this.f101724q = list;
                this.f101725r = abstractC20677f;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                String str;
                boolean m127128x;
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f101723p.m14530v0(this.f101724q, true);
                    ((InterfaceC20656b) this.f101725r.m103742Dp()).mo49315c4();
                    ((InterfaceC20656b) this.f101725r.m103742Dp()).mo78936E(((UnTagFeedUseCase.C8547c) ((AbstractC25468a.c) abstractC25468a).m131935a()).m45590a());
                    ((InterfaceC20656b) this.f101725r.m103742Dp()).mo82925B4();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    ((InterfaceC20656b) this.f101725r.m103742Dp()).mo49315c4();
                    Exception m131934a = ((AbstractC25468a.a) abstractC25468a).m131934a();
                    if (m131934a == null || (str = m131934a.getMessage()) == null) {
                        str = "";
                    }
                    m127128x = AbstractC24341v.m127128x(str);
                    if (!m127128x) {
                        ((InterfaceC20656b) this.f101725r.m103742Dp()).mo78936E(str);
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    ((InterfaceC20656b) this.f101725r.m103742Dp()).mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3020p0 c3020p0, List list, AbstractC20677f abstractC20677f, Continuation continuation) {
            super(2, continuation);
            this.f101720u = c3020p0;
            this.f101721v = list;
            this.f101722w = abstractC20677f;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f101720u, this.f101721v, this.f101722w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131202b0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101719t;
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
                String str = this.f101720u.f12057p;
                AbstractC19074t.m100207e(str, "fid");
                m131202b0 = AbstractC25332a0.m131202b0(this.f101721v);
                UnTagFeedUseCase.C8546b c8546b = new UnTagFeedUseCase.C8546b(str, m131202b0);
                this.f101719t = 1;
                obj = unTagFeedUseCase.m101498a(c8546b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                C32844a c32844a = new C32844a(this.f101720u, this.f101721v, this.f101722w);
                this.f101719t = 2;
                if (flow.mo97893a(c32844a, this) == m142578e) {
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
    /* renamed from: iq.j$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101726t;

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
            int i11 = this.f101726t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25407f c25407f = new C25407f(null, null, 3, null);
                this.f101726t = 1;
                if (c25407f.m101503a(this) == m142578e) {
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
    /* renamed from: iq.j$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101727t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f101728u;

        /* renamed from: v */
        final /* synthetic */ C32002l4 f101729v;

        /* renamed from: w */
        final /* synthetic */ AbstractC20677f f101730w;

        /* renamed from: iq.j$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ AbstractC20677f f101731p;

            /* renamed from: q */
            final /* synthetic */ C3020p0 f101732q;

            a(AbstractC20677f abstractC20677f, C3020p0 c3020p0) {
                this.f101731p = abstractC20677f;
                this.f101732q = c3020p0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                AbstractC20697j.m107825b(this.f101731p, this.f101732q, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3020p0 c3020p0, C32002l4 c32002l4, AbstractC20677f abstractC20677f, Continuation continuation) {
            super(2, continuation);
            this.f101728u = c3020p0;
            this.f101729v = c32002l4;
            this.f101730w = abstractC20677f;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f101728u, this.f101729v, this.f101730w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101727t;
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
                boolean z11 = this.f101728u.f12064w;
                TrackingSource m154333E = C32017m4.m154326S().m154333E(this.f101729v, !z11);
                if (m154333E != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154333E, c19137b.m100440b(this.f101728u));
                }
                if (z11) {
                    C3020p0 c3020p0 = this.f101728u;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.d(c3020p0, m154333E);
                } else {
                    C3020p0 c3020p02 = this.f101728u;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.b(c3020p02, 1, m154333E);
                }
                C18592c c18592c = new C18592c(null, 1, null);
                this.f101727t = 1;
                obj = c18592c.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f101730w, this.f101728u);
                this.f101727t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
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
    /* renamed from: iq.j$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101733t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f101734u;

        /* renamed from: v */
        final /* synthetic */ AbstractC20677f f101735v;

        /* renamed from: w */
        final /* synthetic */ C3000l0 f101736w;

        /* renamed from: iq.j$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ AbstractC20677f f101737p;

            /* renamed from: q */
            final /* synthetic */ C3000l0 f101738q;

            /* renamed from: r */
            final /* synthetic */ C3020p0 f101739r;

            a(AbstractC20677f abstractC20677f, C3000l0 c3000l0, C3020p0 c3020p0) {
                this.f101737p = abstractC20677f;
                this.f101738q = c3000l0;
                this.f101739r = c3020p0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f101737p.mo107773Yp(CoreUtility.f89233i);
                    this.f101737p.m107791wq(this.f101738q.f11895q, this.f101739r);
                    ((InterfaceC20656b) this.f101737p.m103742Dp()).mo82925B4();
                    ((InterfaceC20656b) this.f101737p.m103742Dp()).mo59032jx(AbstractC8020f0.profile_deletefeedsuccess);
                    ((InterfaceC20656b) this.f101737p.m103742Dp()).mo49315c4();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    ((InterfaceC20656b) this.f101737p.m103742Dp()).mo59032jx(AbstractC8020f0.error_message);
                    ((InterfaceC20656b) this.f101737p.m103742Dp()).mo49315c4();
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    ((InterfaceC20656b) this.f101737p.m103742Dp()).mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3020p0 c3020p0, AbstractC20677f abstractC20677f, C3000l0 c3000l0, Continuation continuation) {
            super(2, continuation);
            this.f101734u = c3020p0;
            this.f101735v = abstractC20677f;
            this.f101736w = c3000l0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f101734u, this.f101735v, this.f101736w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101733t;
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
                String str = this.f101734u.f12057p;
                AbstractC19074t.m100207e(str, "fid");
                C8549a.a aVar = new C8549a.a(str, false);
                this.f101733t = 1;
                obj = c8549a.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f101735v, this.f101736w, this.f101734u);
                this.f101733t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
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
    /* renamed from: iq.j$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101740t;

        /* renamed from: u */
        final /* synthetic */ int f101741u;

        /* renamed from: v */
        final /* synthetic */ C3020p0 f101742v;

        /* renamed from: w */
        final /* synthetic */ C32002l4 f101743w;

        /* renamed from: x */
        final /* synthetic */ AbstractC20677f f101744x;

        /* renamed from: iq.j$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ AbstractC20677f f101745p;

            /* renamed from: q */
            final /* synthetic */ C3020p0 f101746q;

            a(AbstractC20677f abstractC20677f, C3020p0 c3020p0) {
                this.f101745p = abstractC20677f;
                this.f101746q = c3020p0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                AbstractC20697j.m107825b(this.f101745p, this.f101746q, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, C3020p0 c3020p0, C32002l4 c32002l4, AbstractC20677f abstractC20677f, Continuation continuation) {
            super(2, continuation);
            this.f101741u = i11;
            this.f101742v = c3020p0;
            this.f101743w = c32002l4;
            this.f101744x = abstractC20677f;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f101741u, this.f101742v, this.f101743w, this.f101744x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101740t;
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
                int m150930F = C31060j.f143193a.m150930F(this.f101741u);
                boolean z11 = this.f101742v.f12064w;
                TrackingSource m154333E = C32017m4.m154326S().m154333E(this.f101743w, !z11);
                if (m154333E != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154333E, c19137b.m100442d(this.f101742v, m150930F));
                }
                if (z11) {
                    C3020p0 c3020p0 = this.f101742v;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.a(c3020p0, m150930F, m154333E);
                } else {
                    C3020p0 c3020p02 = this.f101742v;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.b(c3020p02, m150930F, m154333E);
                }
                C18592c c18592c = new C18592c(null, 1, null);
                this.f101740t = 1;
                obj = c18592c.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f101744x, this.f101742v);
                this.f101740t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
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

    /* renamed from: a */
    public static final void m107824a(AbstractC20677f abstractC20677f, C3000l0 c3000l0, List list) {
        C3020p0 c3020p0;
        AbstractC19074t.m100208f(abstractC20677f, "<this>");
        AbstractC19074t.m100208f(list, "uids");
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(abstractC20677f), null, null, new a(c3020p0, list, abstractC20677f, null), 3, null);
        }
    }

    /* renamed from: b */
    public static final void m107825b(AbstractC20677f abstractC20677f, C3020p0 c3020p0, AbstractC18591b.a aVar) {
        AbstractC19074t.m100208f(abstractC20677f, "<this>");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        AbstractC19074t.m100208f(aVar, "result");
        if (!(aVar instanceof AbstractC18591b.a.c)) {
            C19140e.f95172a.m100456h(c3020p0, aVar.mo98147a());
            C23744a.Companion.m124119a().m124116d(6101, c3020p0.f12057p);
            ((InterfaceC20656b) abstractC20677f.m103742Dp()).mo82999pk(c3020p0, aVar.mo98147a());
        }
        if (aVar instanceof AbstractC18591b.a.C32819a) {
            ((InterfaceC20656b) abstractC20677f.m103742Dp()).mo78936E(C19140e.f95172a.m100452b(((AbstractC18591b.a.C32819a) aVar).m98148b()));
        }
    }

    /* renamed from: c */
    public static final void m107826c(AbstractC20677f abstractC20677f) {
        AbstractC19074t.m100208f(abstractC20677f, "<this>");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(abstractC20677f), null, null, new b(null), 3, null);
    }

    /* renamed from: d */
    public static final void m107827d(AbstractC20677f abstractC20677f, C3020p0 c3020p0, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(abstractC20677f, "<this>");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(abstractC20677f), null, null, new c(c3020p0, c32002l4, abstractC20677f, null), 3, null);
    }

    /* renamed from: e */
    public static final void m107828e(AbstractC20677f abstractC20677f, C3000l0 c3000l0) {
        C3020p0 c3020p0;
        AbstractC19074t.m100208f(abstractC20677f, "<this>");
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(abstractC20677f), null, null, new d(c3020p0, abstractC20677f, c3000l0, null), 3, null);
        }
    }

    /* renamed from: f */
    public static final void m107829f(AbstractC20677f abstractC20677f, C3020p0 c3020p0, int i11, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(abstractC20677f, "<this>");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(abstractC20677f), null, null, new e(i11, c3020p0, c32002l4, abstractC20677f, null), 3, null);
    }

    /* renamed from: g */
    public static final C3054x m107830g(C24880b c24880b) {
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
        }
        c3054x.m14661S(AbstractC23136l9.m118742r(16.0f));
        c3054x.m14648F(C23212s8.m119606n(AbstractC16781w.ProfilePrimaryBackgroundColor));
        return c3054x;
    }
}
