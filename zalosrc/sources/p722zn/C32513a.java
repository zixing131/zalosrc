package p722zn;

import com.zing.zalo.feed.formpostfeed.data.C8453a;
import com.zing.zalo.feed.formpostfeed.data.PromotePostItem;
import com.zing.zalo.p077ui.showcase.C13306b;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p458qr.AbstractC25468a;
import p651xn.C30169a;
import p651xn.C30170b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: zn.a */
/* loaded from: classes4.dex */
public final class C32513a extends AbstractC19377a {

    /* renamed from: a */
    private final C30170b f150226a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: zn.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f150227p = new a("GET_CACHE_FIRST_BEFORE_GET_LATEST", 0);

        /* renamed from: q */
        public static final a f150228q = new a("ALWAYS_GET_LATEST_VALUE", 1);

        /* renamed from: r */
        private static final /* synthetic */ a[] f150229r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f150230s;

        static {
            a[] m157474b = m157474b();
            f150229r = m157474b;
            f150230s = AbstractC30166b.m148796a(m157474b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m157474b() {
            return new a[]{f150227p, f150228q};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f150229r.clone();
        }
    }

    /* renamed from: zn.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final a f150231a;

        public b(a aVar) {
            AbstractC19074t.m100208f(aVar, "strategy");
            this.f150231a = aVar;
        }

        /* renamed from: a */
        public final a m157475a() {
            return this.f150231a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f150231a == ((b) obj).f150231a;
        }

        public int hashCode() {
            return this.f150231a.hashCode();
        }

        public String toString() {
            return "Param(strategy=" + this.f150231a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zn.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f150232t;

        /* renamed from: u */
        private /* synthetic */ Object f150233u;

        /* renamed from: w */
        final /* synthetic */ b f150235w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f150235w = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f150235w, continuation);
            cVar.f150233u = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            AbstractC25468a.c cVar;
            AbstractC25468a.c cVar2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f150232t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            flowCollector = (FlowCollector) this.f150233u;
                            AbstractC24862s.m129228b(obj);
                            C8453a c8453a = (C8453a) obj;
                            C32513a.this.m157471f(c8453a);
                            cVar2 = new AbstractC25468a.c(c8453a.m44994b());
                            this.f150233u = null;
                            this.f150232t = 5;
                            if (flowCollector.mo12109b(cVar2, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        flowCollector = (FlowCollector) this.f150233u;
                        AbstractC24862s.m129228b(obj);
                        C30170b c30170b = C32513a.this.f150226a;
                        this.f150233u = flowCollector;
                        this.f150232t = 4;
                        obj = c30170b.m148805c(this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        C8453a c8453a2 = (C8453a) obj;
                        C32513a.this.m157471f(c8453a2);
                        cVar2 = new AbstractC25468a.c(c8453a2.m44994b());
                        this.f150233u = null;
                        this.f150232t = 5;
                        if (flowCollector.mo12109b(cVar2, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f150233u;
                    AbstractC24862s.m129228b(obj);
                    C8453a c8453a3 = (C8453a) obj;
                    C32513a.this.m157471f(c8453a3);
                    cVar = new AbstractC25468a.c(c8453a3.m44994b());
                    this.f150233u = flowCollector;
                    this.f150232t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    C30170b c30170b2 = C32513a.this.f150226a;
                    this.f150233u = flowCollector;
                    this.f150232t = 4;
                    obj = c30170b2.m148805c(this);
                    if (obj == m142578e) {
                    }
                    C8453a c8453a22 = (C8453a) obj;
                    C32513a.this.m157471f(c8453a22);
                    cVar2 = new AbstractC25468a.c(c8453a22.m44994b());
                    this.f150233u = null;
                    this.f150232t = 5;
                    if (flowCollector.mo12109b(cVar2, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f150233u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f150233u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f150233u = flowCollector;
                this.f150232t = 1;
                if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (C32513a.this.m157472h(this.f150235w.m157475a())) {
                C30170b c30170b3 = C32513a.this.f150226a;
                this.f150233u = flowCollector;
                this.f150232t = 2;
                obj = c30170b3.m148806d(this);
                if (obj == m142578e) {
                    return m142578e;
                }
                C8453a c8453a32 = (C8453a) obj;
                C32513a.this.m157471f(c8453a32);
                cVar = new AbstractC25468a.c(c8453a32.m44994b());
                this.f150233u = flowCollector;
                this.f150232t = 3;
                if (flowCollector.mo12109b(cVar, this) == m142578e) {
                }
            }
            C30170b c30170b22 = C32513a.this.f150226a;
            this.f150233u = flowCollector;
            this.f150232t = 4;
            obj = c30170b22.m148805c(this);
            if (obj == m142578e) {
            }
            C8453a c8453a222 = (C8453a) obj;
            C32513a.this.m157471f(c8453a222);
            cVar2 = new AbstractC25468a.c(c8453a222.m44994b());
            this.f150233u = null;
            this.f150232t = 5;
            if (flowCollector.mo12109b(cVar2, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zn.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f150236t;

        /* renamed from: u */
        private /* synthetic */ Object f150237u;

        d(Continuation continuation) {
            super(3, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f150236t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f150237u;
                C32513a.this.m157471f(new C8453a());
                AbstractC25468a.a aVar = new AbstractC25468a.a(null, 1, null);
                this.f150236t = 1;
                if (flowCollector.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f150237u = flowCollector;
            return dVar.mo239o(C24848g0.f119245a);
        }
    }

    public C32513a(C30170b c30170b) {
        AbstractC19074t.m100208f(c30170b, "repo");
        this.f150226a = c30170b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m157471f(C8453a c8453a) {
        int m131511r;
        List<PromotePostItem> promotePost = C30169a.f140177a.m148801a().m44994b().getPromotePost();
        m131511r = AbstractC25370t.m131511r(promotePost, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator<T> it = promotePost.iterator();
        while (it.hasNext()) {
            arrayList.add(((PromotePostItem) it.next()).getTipCat());
        }
        C13306b.m74679g((String[]) arrayList.toArray(new String[0]));
        C30169a.f140177a.m148802b(c8453a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final boolean m157472h(a aVar) {
        if (aVar == a.f150227p) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object mo451b(b bVar, Continuation continuation) {
        return FlowKt.m113288f(FlowKt.m113265A(new c(bVar, null)), new d(null));
    }

    public /* synthetic */ C32513a(C30170b c30170b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C30170b(null, null, null, 7, null) : c30170b);
    }
}
