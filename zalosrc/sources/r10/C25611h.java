package r10;

import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import e10.InterfaceC18170g;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19384h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: r10.h */
/* loaded from: classes5.dex */
public final class C25611h extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC18170g f122441a;

    /* renamed from: r10.h$a */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: a */
        private final String f122442a;

        /* renamed from: r10.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32964a extends a {

            /* renamed from: b */
            private final String f122443b;

            /* renamed from: c */
            private final String f122444c;

            /* renamed from: d */
            private final Integer f122445d;

            /* renamed from: e */
            private final Integer f122446e;

            public /* synthetic */ C32964a(String str, String str2, String str3, Integer num, Integer num2, int i11, AbstractC19060k abstractC19060k) {
                this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2);
            }

            /* renamed from: b */
            public final String m132282b() {
                return this.f122443b;
            }

            /* renamed from: c */
            public final Integer m132283c() {
                return this.f122445d;
            }

            /* renamed from: d */
            public final String m132284d() {
                return this.f122444c;
            }

            /* renamed from: e */
            public final Integer m132285e() {
                return this.f122446e;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32964a(String str, String str2, String str3, Integer num, Integer num2) {
                super(str, null);
                AbstractC19074t.m100208f(str, "channelId");
                this.f122443b = str2;
                this.f122444c = str3;
                this.f122445d = num;
                this.f122446e = num2;
            }
        }

        /* renamed from: r10.h$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends a {

            /* renamed from: b */
            private final String f122447b;

            /* renamed from: c */
            private final String f122448c;

            public /* synthetic */ b(String str, String str2, String str3, int i11, AbstractC19060k abstractC19060k) {
                this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
            }

            /* renamed from: b */
            public final String m132286b() {
                return this.f122447b;
            }

            /* renamed from: c */
            public final String m132287c() {
                return this.f122448c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, String str3) {
                super(str, null);
                AbstractC19074t.m100208f(str, "channelId");
                this.f122447b = str2;
                this.f122448c = str3;
            }
        }

        public /* synthetic */ a(String str, AbstractC19060k abstractC19060k) {
            this(str);
        }

        /* renamed from: a */
        public final String m132281a() {
            return this.f122442a;
        }

        private a(String str) {
            this.f122442a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r10.h$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122449t;

        /* renamed from: u */
        private /* synthetic */ Object f122450u;

        /* renamed from: v */
        final /* synthetic */ a f122451v;

        /* renamed from: w */
        final /* synthetic */ C25611h f122452w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C25611h c25611h, Continuation continuation) {
            super(2, continuation);
            this.f122451v = aVar;
            this.f122452w = c25611h;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f122451v, this.f122452w, continuation);
            bVar.f122450u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            Object m96645o;
            Object m96631a;
            PersonalizeChannel personalizeChannel;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f122449t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    FlowCollector flowCollector2 = (FlowCollector) this.f122450u;
                    AbstractC24862s.m129228b(obj);
                    flowCollector = flowCollector2;
                    m96645o = obj;
                    personalizeChannel = (PersonalizeChannel) m96645o;
                } else {
                    FlowCollector flowCollector3 = (FlowCollector) this.f122450u;
                    AbstractC24862s.m129228b(obj);
                    flowCollector = flowCollector3;
                    m96631a = obj;
                    personalizeChannel = (PersonalizeChannel) m96631a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f122450u;
                a aVar = this.f122451v;
                if (aVar instanceof a.C32964a) {
                    InterfaceC18170g interfaceC18170g = this.f122452w.f122441a;
                    String m132281a = this.f122451v.m132281a();
                    String m132282b = ((a.C32964a) this.f122451v).m132282b();
                    String m132284d = ((a.C32964a) this.f122451v).m132284d();
                    Integer m132283c = ((a.C32964a) this.f122451v).m132283c();
                    Integer m132285e = ((a.C32964a) this.f122451v).m132285e();
                    this.f122450u = flowCollector;
                    this.f122449t = 1;
                    m96631a = InterfaceC18170g.a.m96631a(interfaceC18170g, m132281a, m132282b, m132284d, null, m132283c, m132285e, this, 8, null);
                    if (m96631a == m142578e) {
                        return m142578e;
                    }
                    personalizeChannel = (PersonalizeChannel) m96631a;
                } else if (aVar instanceof a.b) {
                    InterfaceC18170g interfaceC18170g2 = this.f122452w.f122441a;
                    String m132281a2 = this.f122451v.m132281a();
                    String m132286b = ((a.b) this.f122451v).m132286b();
                    String m132287c = ((a.b) this.f122451v).m132287c();
                    this.f122450u = flowCollector;
                    this.f122449t = 2;
                    m96645o = InterfaceC18170g.a.m96645o(interfaceC18170g2, m132281a2, m132286b, m132287c, null, this, 8, null);
                    if (m96645o == m142578e) {
                        return m142578e;
                    }
                    personalizeChannel = (PersonalizeChannel) m96645o;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.f122450u = null;
            this.f122449t = 3;
            if (flowCollector.mo12109b(personalizeChannel, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25611h(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f122441a = interfaceC18170g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        return FlowKt.m113265A(new b(aVar, this, null));
    }
}
