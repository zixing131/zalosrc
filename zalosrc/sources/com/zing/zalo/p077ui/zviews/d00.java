package com.zing.zalo.p077ui.zviews;

import androidx.lifecycle.AbstractC1803x;
import bo.C3020p0;
import bo.C3054x;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8549a;
import en0.InterfaceC18509p;
import es.AbstractC18591b;
import es.C18592c;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p167fs.C19137b;
import p167fs.C19140e;
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
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes6.dex */
public abstract class d00 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.d00$a */
    /* loaded from: classes6.dex */
    public static final class C15531a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f80075t;

        C15531a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15531a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f80075t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25407f c25407f = new C25407f(null, null, 3, null);
                this.f80075t = 1;
                if (c25407f.m101503a(this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15531a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.d00$b */
    /* loaded from: classes6.dex */
    public static final class C15532b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f80076t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f80077u;

        /* renamed from: v */
        final /* synthetic */ C32002l4 f80078v;

        /* renamed from: w */
        final /* synthetic */ MutualFeedView f80079w;

        /* renamed from: com.zing.zalo.ui.zviews.d00$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MutualFeedView f80080p;

            /* renamed from: q */
            final /* synthetic */ C3020p0 f80081q;

            a(MutualFeedView mutualFeedView, C3020p0 c3020p0) {
                this.f80080p = mutualFeedView;
                this.f80081q = c3020p0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                d00.m87281a(this.f80080p, this.f80081q, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15532b(C3020p0 c3020p0, C32002l4 c32002l4, MutualFeedView mutualFeedView, Continuation continuation) {
            super(2, continuation);
            this.f80077u = c3020p0;
            this.f80078v = c32002l4;
            this.f80079w = mutualFeedView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15532b(this.f80077u, this.f80078v, this.f80079w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f80076t;
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
                boolean z11 = this.f80077u.f12064w;
                TrackingSource m154333E = C32017m4.m154326S().m154333E(this.f80078v, !z11);
                if (m154333E != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154333E, c19137b.m100440b(this.f80077u));
                }
                if (z11) {
                    C3020p0 c3020p0 = this.f80077u;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.d(c3020p0, m154333E);
                } else {
                    C3020p0 c3020p02 = this.f80077u;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.b(c3020p02, 1, m154333E);
                }
                C18592c c18592c = new C18592c(null, 1, null);
                this.f80076t = 1;
                obj = c18592c.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f80079w, this.f80077u);
                this.f80076t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15532b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.d00$c */
    /* loaded from: classes6.dex */
    public static final class C15533c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f80082t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f80083u;

        /* renamed from: v */
        final /* synthetic */ MutualFeedView f80084v;

        /* renamed from: com.zing.zalo.ui.zviews.d00$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MutualFeedView f80085p;

            /* renamed from: q */
            final /* synthetic */ C3020p0 f80086q;

            a(MutualFeedView mutualFeedView, C3020p0 c3020p0) {
                this.f80085p = mutualFeedView;
                this.f80086q = c3020p0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f80085p.m82041pN(this.f80086q);
                    this.f80085p.m82036mO();
                    this.f80085p.mo59032jx(AbstractC8020f0.profile_deletefeedsuccess);
                    this.f80085p.mo49315c4();
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f80085p.mo59032jx(AbstractC8020f0.error_message);
                    this.f80085p.mo49315c4();
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f80085p.mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15533c(C3020p0 c3020p0, MutualFeedView mutualFeedView, Continuation continuation) {
            super(2, continuation);
            this.f80083u = c3020p0;
            this.f80084v = mutualFeedView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15533c(this.f80083u, this.f80084v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f80082t;
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
                String str = this.f80083u.f12057p;
                AbstractC19074t.m100207e(str, "fid");
                C8549a.a aVar = new C8549a.a(str, false);
                this.f80082t = 1;
                obj = c8549a.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f80084v, this.f80083u);
                this.f80082t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15533c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.d00$d */
    /* loaded from: classes6.dex */
    public static final class C15534d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f80087t;

        /* renamed from: u */
        final /* synthetic */ C3020p0 f80088u;

        /* renamed from: v */
        final /* synthetic */ int f80089v;

        /* renamed from: w */
        final /* synthetic */ C32002l4 f80090w;

        /* renamed from: x */
        final /* synthetic */ MutualFeedView f80091x;

        /* renamed from: com.zing.zalo.ui.zviews.d00$d$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ MutualFeedView f80092p;

            /* renamed from: q */
            final /* synthetic */ C3020p0 f80093q;

            a(MutualFeedView mutualFeedView, C3020p0 c3020p0) {
                this.f80092p = mutualFeedView;
                this.f80093q = c3020p0;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                d00.m87281a(this.f80092p, this.f80093q, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15534d(C3020p0 c3020p0, int i11, C32002l4 c32002l4, MutualFeedView mutualFeedView, Continuation continuation) {
            super(2, continuation);
            this.f80088u = c3020p0;
            this.f80089v = i11;
            this.f80090w = c32002l4;
            this.f80091x = mutualFeedView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15534d(this.f80088u, this.f80089v, this.f80090w, this.f80091x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f80087t;
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
                boolean z11 = this.f80088u.f12064w;
                int m150930F = C31060j.f143193a.m150930F(this.f80089v);
                TrackingSource m154333E = C32017m4.m154326S().m154333E(this.f80090w, !z11);
                if (m154333E != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154333E, c19137b.m100442d(this.f80088u, m150930F));
                }
                if (z11) {
                    C3020p0 c3020p0 = this.f80088u;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.a(c3020p0, m150930F, m154333E);
                } else {
                    C3020p0 c3020p02 = this.f80088u;
                    if (m154333E == null) {
                        m154333E = new TrackingSource(-1);
                    }
                    bVar = new C18592c.b(c3020p02, m150930F, m154333E);
                }
                C18592c c18592c = new C18592c(null, 1, null);
                this.f80087t = 1;
                obj = c18592c.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f80091x, this.f80088u);
                this.f80087t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15534d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final void m87281a(MutualFeedView mutualFeedView, C3020p0 c3020p0, AbstractC18591b.a aVar) {
        AbstractC19074t.m100208f(mutualFeedView, "<this>");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        AbstractC19074t.m100208f(aVar, "result");
        if (!(aVar instanceof AbstractC18591b.a.c)) {
            C19140e.f95172a.m100456h(c3020p0, aVar.mo98147a());
            mutualFeedView.f75388Z0.m43296O0(c3020p0.f12057p, aVar.mo98147a());
        }
        if (aVar instanceof AbstractC18591b.a.C32819a) {
            mutualFeedView.mo78936E(C19140e.f95172a.m100452b(((AbstractC18591b.a.C32819a) aVar).m98148b()));
        }
    }

    /* renamed from: b */
    public static final void m87282b(MutualFeedView mutualFeedView) {
        AbstractC19074t.m100208f(mutualFeedView, "<this>");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C15531a(null), 3, null);
    }

    /* renamed from: c */
    public static final void m87283c(MutualFeedView mutualFeedView, C3020p0 c3020p0, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(mutualFeedView, "<this>");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(mutualFeedView), null, null, new C15532b(c3020p0, c32002l4, mutualFeedView, null), 3, null);
    }

    /* renamed from: d */
    public static final void m87284d(MutualFeedView mutualFeedView, C3020p0 c3020p0) {
        AbstractC19074t.m100208f(mutualFeedView, "<this>");
        if (c3020p0 != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(mutualFeedView), null, null, new C15533c(c3020p0, mutualFeedView, null), 3, null);
        }
    }

    /* renamed from: e */
    public static final void m87285e(MutualFeedView mutualFeedView, C3020p0 c3020p0, int i11, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(mutualFeedView, "<this>");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(mutualFeedView), null, null, new C15534d(c3020p0, i11, c32002l4, mutualFeedView, null), 3, null);
    }

    /* renamed from: f */
    public static final C3054x m87286f(C24880b c24880b) {
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
