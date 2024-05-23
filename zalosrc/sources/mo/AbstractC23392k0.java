package mo;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase;
import en0.InterfaceC18509p;
import es.AbstractC18591b;
import es.C18593d;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import p167fs.C19137b;
import p167fs.C19140e;
import p236ic.AbstractC20504a;
import p361nb.AbstractC23647d;
import p455qo.C25407f;
import p458qr.AbstractC25468a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: mo.k0 */
/* loaded from: classes4.dex */
public abstract class AbstractC23392k0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.k0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113620t;

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
            int i11 = this.f113620t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25407f c25407f = new C25407f(null, null, 3, null);
                this.f113620t = 1;
                if (c25407f.m101503a(this) == m142578e) {
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
    /* renamed from: mo.k0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113621t;

        /* renamed from: u */
        final /* synthetic */ ItemAlbumMobile f113622u;

        /* renamed from: v */
        final /* synthetic */ C32002l4 f113623v;

        /* renamed from: w */
        final /* synthetic */ C23407x f113624w;

        /* renamed from: mo.k0$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23407x f113625p;

            /* renamed from: q */
            final /* synthetic */ ItemAlbumMobile f113626q;

            a(C23407x c23407x, ItemAlbumMobile itemAlbumMobile) {
                this.f113625p = c23407x;
                this.f113626q = itemAlbumMobile;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                AbstractC23392k0.m122873c(this.f113625p, this.f113626q, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ItemAlbumMobile itemAlbumMobile, C32002l4 c32002l4, C23407x c23407x, Continuation continuation) {
            super(2, continuation);
            this.f113622u = itemAlbumMobile;
            this.f113623v = c32002l4;
            this.f113624w = c23407x;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f113622u, this.f113623v, this.f113624w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f113621t;
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
                boolean m100204b = AbstractC19074t.m100204b(this.f113622u.f42552E, "1");
                TrackingSource m154334F = C32017m4.m154326S().m154334F(this.f113623v, !m100204b);
                if (m154334F != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154334F, c19137b.m100441c(this.f113622u));
                }
                if (m100204b) {
                    AbstractC23647d.m123897g("188024");
                    ItemAlbumMobile itemAlbumMobile = this.f113622u;
                    AbstractC19074t.m100205c(m154334F);
                    bVar = new C18593d.d(itemAlbumMobile, m154334F);
                } else {
                    AbstractC23647d.m123897g("188023");
                    ItemAlbumMobile itemAlbumMobile2 = this.f113622u;
                    AbstractC19074t.m100205c(m154334F);
                    bVar = new C18593d.b(itemAlbumMobile2, 1, m154334F);
                }
                C18593d c18593d = new C18593d(null, 1, null);
                this.f113621t = 1;
                obj = c18593d.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f113624w, this.f113622u);
                this.f113621t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
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
    /* renamed from: mo.k0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113627t;

        /* renamed from: u */
        final /* synthetic */ ItemAlbumMobile f113628u;

        /* renamed from: v */
        final /* synthetic */ C32002l4 f113629v;

        /* renamed from: w */
        final /* synthetic */ int f113630w;

        /* renamed from: x */
        final /* synthetic */ C23407x f113631x;

        /* renamed from: mo.k0$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23407x f113632p;

            /* renamed from: q */
            final /* synthetic */ ItemAlbumMobile f113633q;

            a(C23407x c23407x, ItemAlbumMobile itemAlbumMobile) {
                this.f113632p = c23407x;
                this.f113633q = itemAlbumMobile;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                AbstractC23392k0.m122873c(this.f113632p, this.f113633q, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ItemAlbumMobile itemAlbumMobile, C32002l4 c32002l4, int i11, C23407x c23407x, Continuation continuation) {
            super(2, continuation);
            this.f113628u = itemAlbumMobile;
            this.f113629v = c32002l4;
            this.f113630w = i11;
            this.f113631x = c23407x;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f113628u, this.f113629v, this.f113630w, this.f113631x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f113627t;
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
                boolean m100204b = AbstractC19074t.m100204b(this.f113628u.f42552E, "1");
                TrackingSource m154334F = C32017m4.m154326S().m154334F(this.f113629v, !m100204b);
                if (m154334F != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154334F, c19137b.m100443e(this.f113628u, this.f113630w));
                }
                if (m100204b) {
                    ItemAlbumMobile itemAlbumMobile = this.f113628u;
                    int i12 = this.f113630w;
                    AbstractC19074t.m100205c(m154334F);
                    bVar = new C18593d.a(itemAlbumMobile, i12, m154334F);
                } else {
                    ItemAlbumMobile itemAlbumMobile2 = this.f113628u;
                    int i13 = this.f113630w;
                    AbstractC19074t.m100205c(m154334F);
                    bVar = new C18593d.b(itemAlbumMobile2, i13, m154334F);
                }
                C18593d c18593d = new C18593d(null, 1, null);
                this.f113627t = 1;
                obj = c18593d.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f113631x, this.f113628u);
                this.f113627t = 2;
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
    /* renamed from: mo.k0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113634t;

        /* renamed from: u */
        final /* synthetic */ ItemAlbumMobile f113635u;

        /* renamed from: v */
        final /* synthetic */ List f113636v;

        /* renamed from: w */
        final /* synthetic */ C23407x f113637w;

        /* renamed from: mo.k0$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23407x f113638p;

            /* renamed from: q */
            final /* synthetic */ ItemAlbumMobile f113639q;

            /* renamed from: r */
            final /* synthetic */ List f113640r;

            a(C23407x c23407x, ItemAlbumMobile itemAlbumMobile, List list) {
                this.f113638p = c23407x;
                this.f113639q = itemAlbumMobile;
                this.f113640r = list;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                String str;
                boolean m127128x;
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    ((InterfaceC23373b) this.f113638p.m103742Dp()).mo49315c4();
                    ((InterfaceC23373b) this.f113638p.m103742Dp()).mo78936E(((UnTagFeedUseCase.C8547c) ((AbstractC25468a.c) abstractC25468a).m131935a()).m45590a());
                    this.f113639q.m40522j0(new ArrayList(this.f113640r), true);
                    ((InterfaceC23373b) this.f113638p.m103742Dp()).mo80841Ue(this.f113638p.m122986Qq(false));
                    ((InterfaceC23373b) this.f113638p.m103742Dp()).invalidateOptionsMenu();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    ((InterfaceC23373b) this.f113638p.m103742Dp()).mo49315c4();
                    Exception m131934a = ((AbstractC25468a.a) abstractC25468a).m131934a();
                    if (m131934a instanceof UnTagFeedUseCase.ExceptionUnTagFeed) {
                        this.f113638p.m122987Yq(((UnTagFeedUseCase.ExceptionUnTagFeed) m131934a).m45586a());
                    } else {
                        if (m131934a == null || (str = m131934a.getMessage()) == null) {
                            str = "";
                        }
                        m127128x = AbstractC24341v.m127128x(str);
                        if (!m127128x) {
                            ((InterfaceC23373b) this.f113638p.m103742Dp()).mo78936E(str);
                        }
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    ((InterfaceC23373b) this.f113638p.m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ItemAlbumMobile itemAlbumMobile, List list, C23407x c23407x, Continuation continuation) {
            super(2, continuation);
            this.f113635u = itemAlbumMobile;
            this.f113636v = list;
            this.f113637w = c23407x;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f113635u, this.f113636v, this.f113637w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f113634t;
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
                String str = this.f113635u.f42599t;
                AbstractC19074t.m100207e(str, "feedid");
                UnTagFeedUseCase.C8546b c8546b = new UnTagFeedUseCase.C8546b(str, this.f113636v);
                this.f113634t = 1;
                obj = unTagFeedUseCase.m101498a(c8546b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f113637w, this.f113635u, this.f113636v);
                this.f113634t = 2;
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

    /* renamed from: c */
    public static final void m122873c(C23407x c23407x, ItemAlbumMobile itemAlbumMobile, AbstractC18591b.a aVar) {
        if (aVar instanceof AbstractC18591b.a.c) {
            return;
        }
        C19140e.f95172a.m100457i(itemAlbumMobile, aVar.mo98147a());
        ((InterfaceC23373b) c23407x.m103742Dp()).mo80861se(itemAlbumMobile, c23407x.f113697X);
        if (aVar instanceof AbstractC18591b.a.C32819a) {
            AbstractC19444a.m101697e(new Runnable() { // from class: mo.j0

                /* renamed from: q */
                public final /* synthetic */ AbstractC18591b.a f113617q;

                public /* synthetic */ RunnableC23390j0(AbstractC18591b.a aVar2) {
                    r2 = aVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23392k0.m122874d(C23407x.this, r2);
                }
            });
        }
    }

    /* renamed from: d */
    public static final void m122874d(C23407x c23407x, AbstractC18591b.a aVar) {
        AbstractC19074t.m100208f(c23407x, "$this_handleReactResult");
        AbstractC19074t.m100208f(aVar, "$result");
        ((InterfaceC23373b) c23407x.m103742Dp()).mo78936E(C19140e.f95172a.m100452b(((AbstractC18591b.a.C32819a) aVar).m98148b()));
    }

    /* renamed from: e */
    public static final void m122875e(C23407x c23407x) {
        AbstractC19074t.m100208f(c23407x, "<this>");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c23407x), null, null, new a(null), 3, null);
    }

    /* renamed from: f */
    public static final void m122876f(C23407x c23407x, ItemAlbumMobile itemAlbumMobile, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c23407x, "<this>");
        AbstractC19074t.m100208f(itemAlbumMobile, "itemAlbumMobile");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c23407x), null, null, new b(itemAlbumMobile, c32002l4, c23407x, null), 3, null);
    }

    /* renamed from: g */
    public static final void m122877g(C23407x c23407x, ItemAlbumMobile itemAlbumMobile, int i11, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c23407x, "<this>");
        AbstractC19074t.m100208f(itemAlbumMobile, "itemAlbumMobile");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c23407x), null, null, new c(itemAlbumMobile, c32002l4, i11, c23407x, null), 3, null);
    }

    /* renamed from: h */
    public static final void m122878h(C23407x c23407x, List list) {
        AbstractC19074t.m100208f(c23407x, "<this>");
        AbstractC19074t.m100208f(list, "uids");
        ItemAlbumMobile itemAlbumMobile = c23407x.f113715x;
        if (itemAlbumMobile != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c23407x), null, null, new d(itemAlbumMobile, list, c23407x, null), 3, null);
        }
    }
}
