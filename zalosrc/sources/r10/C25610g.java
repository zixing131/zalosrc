package r10;

import e10.InterfaceC18170g;
import en0.InterfaceC18509p;
import f10.EnumC18694f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19384h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: r10.g */
/* loaded from: classes5.dex */
public final class C25610g extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC18170g f122435a;

    /* renamed from: r10.g$a */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: a */
        private final String f122436a;

        /* renamed from: r10.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32963a extends a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32963a(String str) {
                super(str, null);
                AbstractC19074t.m100208f(str, "userId");
            }
        }

        public /* synthetic */ a(String str, AbstractC19060k abstractC19060k) {
            this(str);
        }

        /* renamed from: a */
        public final String m132277a() {
            return this.f122436a;
        }

        private a(String str) {
            this.f122436a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r10.g$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122437t;

        /* renamed from: u */
        private /* synthetic */ Object f122438u;

        /* renamed from: v */
        final /* synthetic */ a f122439v;

        /* renamed from: w */
        final /* synthetic */ C25610g f122440w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C25610g c25610g, Continuation continuation) {
            super(2, continuation);
            this.f122439v = aVar;
            this.f122440w = c25610g;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f122439v, this.f122440w, continuation);
            bVar.f122438u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            EnumC18694f enumC18694f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f122437t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.f122438u;
                    AbstractC24862s.m129228b(obj);
                    enumC18694f = (EnumC18694f) obj;
                } else {
                    flowCollector = (FlowCollector) this.f122438u;
                    AbstractC24862s.m129228b(obj);
                    enumC18694f = (EnumC18694f) obj;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f122438u;
                if (this.f122439v instanceof a.C32963a) {
                    InterfaceC18170g interfaceC18170g = this.f122440w.f122435a;
                    String m132277a = this.f122439v.m132277a();
                    this.f122438u = flowCollector;
                    this.f122437t = 1;
                    obj = interfaceC18170g.mo96547A(m132277a, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    enumC18694f = (EnumC18694f) obj;
                } else {
                    InterfaceC18170g interfaceC18170g2 = this.f122440w.f122435a;
                    String m132277a2 = this.f122439v.m132277a();
                    this.f122438u = flowCollector;
                    this.f122437t = 2;
                    obj = interfaceC18170g2.mo96626x0(m132277a2, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    enumC18694f = (EnumC18694f) obj;
                }
            }
            this.f122438u = null;
            this.f122437t = 3;
            if (flowCollector.mo12109b(enumC18694f, this) == m142578e) {
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

    public C25610g(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        this.f122435a = interfaceC18170g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        return FlowKt.m113265A(new b(aVar, this, null));
    }
}
