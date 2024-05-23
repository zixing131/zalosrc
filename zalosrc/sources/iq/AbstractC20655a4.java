package iq;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import p236ic.AbstractC20504a;
import p304ks.C21937w;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import to.C26852b;
import to.C26854d;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: iq.a4 */
/* loaded from: classes4.dex */
public abstract class AbstractC20655a4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.a4$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101607t;

        /* renamed from: u */
        final /* synthetic */ ContactProfile f101608u;

        /* renamed from: v */
        final /* synthetic */ TrackingSource f101609v;

        /* renamed from: w */
        final /* synthetic */ C20765w2 f101610w;

        /* renamed from: iq.a4$a$a */
        /* loaded from: classes4.dex */
        public static final class C32843a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20765w2 f101611p;

            C32843a(C20765w2 c20765w2) {
                this.f101611p = c20765w2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f101611p.f101966Q.mo49315c4();
                    InterfaceC20659b2 interfaceC20659b2 = this.f101611p.f101966Q;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_unsubcribed_friend_successfully);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC20659b2.mo78936E(m118743r0);
                    C21937w.f108027a.m114568f(this.f101611p.f101963N0);
                    this.f101611p.m108332rt(false);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f101611p.f101966Q.mo49315c4();
                    InterfaceC20659b2 interfaceC20659b22 = this.f101611p.f101966Q;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    interfaceC20659b22.mo78936E(m118743r02);
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f101611p.f101966Q.mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ContactProfile contactProfile, TrackingSource trackingSource, C20765w2 c20765w2, Continuation continuation) {
            super(2, continuation);
            this.f101608u = contactProfile;
            this.f101609v = trackingSource;
            this.f101610w = c20765w2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f101608u, this.f101609v, this.f101610w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131496e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101607t;
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
                C26852b c26852b = new C26852b(null, 1, null);
                m131496e = AbstractC25366r.m131496e(this.f101608u.f42434r);
                C26852b.a aVar = new C26852b.a(m131496e, this.f101609v);
                this.f101607t = 1;
                obj = c26852b.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                C32843a c32843a = new C32843a(this.f101610w);
                this.f101607t = 2;
                if (flow.mo97893a(c32843a, this) == m142578e) {
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
    /* renamed from: iq.a4$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f101612t;

        /* renamed from: u */
        final /* synthetic */ C20765w2 f101613u;

        /* renamed from: v */
        final /* synthetic */ TrackingSource f101614v;

        /* renamed from: iq.a4$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20765w2 f101615p;

            a(C20765w2 c20765w2) {
                this.f101615p = c20765w2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f101615p.f101966Q.mo49315c4();
                    C20765w2 c20765w2 = this.f101615p;
                    c20765w2.f101998g0 = false;
                    C21937w.f108027a.m114576o(c20765w2.f102021r1);
                    C20765w2 c20765w22 = this.f101615p;
                    c20765w22.f101966Q.mo86272n6(c20765w22.f101998g0);
                    this.f101615p.m108332rt(false);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f101615p.f101966Q.mo49315c4();
                    InterfaceC20659b2 interfaceC20659b2 = this.f101615p.f101966Q;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC20659b2.mo78936E(m118743r0);
                    this.f101615p.m108332rt(false);
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f101615p.f101966Q.mo46829Y();
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C20765w2 c20765w2, TrackingSource trackingSource, Continuation continuation) {
            super(2, continuation);
            this.f101613u = c20765w2;
            this.f101614v = trackingSource;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f101613u, this.f101614v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f101612t;
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
                C26854d c26854d = new C26854d(null, 1, null);
                ContactProfile contactProfile = this.f101613u.f101963N0;
                AbstractC19074t.m100207e(contactProfile, "contactprofile");
                C26854d.a aVar = new C26854d.a(contactProfile, this.f101614v);
                this.f101612t = 1;
                obj = c26854d.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f101613u);
                this.f101612t = 2;
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

    /* renamed from: a */
    public static final void m107740a(C20765w2 c20765w2, ContactProfile contactProfile, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(c20765w2, "<this>");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        if (contactProfile != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c20765w2), null, null, new a(contactProfile, trackingSource, c20765w2, null), 3, null);
        }
    }

    /* renamed from: b */
    public static final void m107741b(C20765w2 c20765w2, ContactProfile contactProfile, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(c20765w2, "<this>");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        if (contactProfile != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC20504a.m106544a(c20765w2), null, null, new b(c20765w2, trackingSource, null), 3, null);
        }
    }
}
