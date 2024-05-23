package p455qo;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.C20834z0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p398oo.C24362i;
import p398oo.C24369l0;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import p458qr.AbstractC25468a;
import p458qr.C25487t;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: qo.a */
/* loaded from: classes4.dex */
public final class C25397a extends AbstractC19377a {

    /* renamed from: a */
    private final C24369l0 f121585a;

    /* renamed from: b */
    private final InterfaceC24374o f121586b;

    /* renamed from: qo.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121587a;

        /* renamed from: b */
        private final int f121588b;

        public a(String str, int i11) {
            AbstractC19074t.m100208f(str, "userId");
            this.f121587a = str;
            this.f121588b = i11;
        }

        /* renamed from: a */
        public final int m131601a() {
            return this.f121588b;
        }

        /* renamed from: b */
        public final String m131602b() {
            return this.f121587a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121587a, aVar.f121587a) && this.f121588b == aVar.f121588b;
        }

        public int hashCode() {
            return (this.f121587a.hashCode() * 31) + this.f121588b;
        }

        public String toString() {
            return "Param(userId=" + this.f121587a + ", srcType=" + this.f121588b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        boolean f121589t;

        /* renamed from: u */
        int f121590u;

        /* renamed from: v */
        private /* synthetic */ Object f121591v;

        /* renamed from: x */
        final /* synthetic */ a f121593x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f121593x = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f121593x, continuation);
            bVar.f121591v = obj;
            return bVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[Catch: Exception -> 0x0021, TryCatch #1 {Exception -> 0x0021, blocks: (B:11:0x001c, B:17:0x00c7, B:27:0x003e, B:28:0x0097, B:30:0x009f, B:33:0x00e8, B:37:0x0046, B:38:0x0089, B:42:0x0067), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[Catch: Exception -> 0x0021, TRY_LEAVE, TryCatch #1 {Exception -> 0x0021, blocks: (B:11:0x001c, B:17:0x00c7, B:27:0x003e, B:28:0x0097, B:30:0x009f, B:33:0x00e8, B:37:0x0046, B:38:0x0089, B:42:0x0067), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0088 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v16 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            List m131496e;
            boolean booleanValue;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121590u;
            try {
            } catch (Exception e11) {
                e = e11;
            }
            switch (r12) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.f121591v;
                    AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                    this.f121591v = flowCollector2;
                    this.f121590u = 1;
                    if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    flowCollector = flowCollector2;
                    C24369l0 m131599d = C25397a.this.m131599d();
                    m131496e = AbstractC25366r.m131496e(this.f121593x.m131602b());
                    int m131601a = this.f121593x.m131601a();
                    this.f121591v = flowCollector;
                    this.f121590u = 2;
                    obj = m131599d.m127452c(m131496e, m131601a, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    this.f121591v = flowCollector;
                    this.f121590u = 3;
                    obj = FlowKt.m113304v((Flow) obj, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (!booleanValue) {
                        C24362i mo127472d = C25397a.this.f121586b.mo127472d(0);
                        C24362i mo127472d2 = C25397a.this.f121586b.mo127472d(1);
                        String m131602b = this.f121593x.m131602b();
                        this.f121591v = flowCollector;
                        this.f121589t = booleanValue;
                        this.f121590u = 4;
                        if (mo127472d.m127417y(m131602b, mo127472d2, this) == m142578e) {
                            return m142578e;
                        }
                        C20834z0.f102412a.m108928g(true);
                        C25487t.f122084a.m132028c(C25487t.a.f122087B);
                        cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue));
                        this.f121591v = flowCollector;
                        this.f121590u = 5;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC25468a.a aVar = new AbstractC25468a.a(new Exception());
                    this.f121591v = flowCollector;
                    this.f121590u = 6;
                    if (flowCollector.mo12109b(aVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                case 1:
                    flowCollector = (FlowCollector) this.f121591v;
                    AbstractC24862s.m129228b(obj);
                    C24369l0 m131599d2 = C25397a.this.m131599d();
                    m131496e = AbstractC25366r.m131496e(this.f121593x.m131602b());
                    int m131601a2 = this.f121593x.m131601a();
                    this.f121591v = flowCollector;
                    this.f121590u = 2;
                    obj = m131599d2.m127452c(m131496e, m131601a2, this);
                    if (obj == m142578e) {
                    }
                    this.f121591v = flowCollector;
                    this.f121590u = 3;
                    obj = FlowKt.m113304v((Flow) obj, this);
                    if (obj == m142578e) {
                    }
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (!booleanValue) {
                    }
                    break;
                case 2:
                    flowCollector = (FlowCollector) this.f121591v;
                    AbstractC24862s.m129228b(obj);
                    this.f121591v = flowCollector;
                    this.f121590u = 3;
                    obj = FlowKt.m113304v((Flow) obj, this);
                    if (obj == m142578e) {
                    }
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (!booleanValue) {
                    }
                    break;
                case 3:
                    flowCollector = (FlowCollector) this.f121591v;
                    AbstractC24862s.m129228b(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (!booleanValue) {
                    }
                    break;
                case 4:
                    boolean z11 = this.f121589t;
                    FlowCollector flowCollector3 = (FlowCollector) this.f121591v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        booleanValue = z11;
                        flowCollector = flowCollector3;
                        C20834z0.f102412a.m108928g(true);
                        C25487t.f122084a.m132028c(C25487t.a.f122087B);
                        cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue));
                        this.f121591v = flowCollector;
                        this.f121590u = 5;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r12 = flowCollector3;
                        AbstractC25468a.a aVar2 = new AbstractC25468a.a(e);
                        this.f121591v = null;
                        this.f121590u = 7;
                        if (r12.mo12109b(aVar2, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                case 5:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 6:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 7:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C25397a(C24369l0 c24369l0, InterfaceC24374o interfaceC24374o, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24369l0.Companion.m127457a() : c24369l0, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o);
    }

    /* renamed from: d */
    public final C24369l0 m131599d() {
        return this.f121585a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, null));
    }

    public C25397a(C24369l0 c24369l0, InterfaceC24374o interfaceC24374o) {
        AbstractC19074t.m100208f(c24369l0, "repo");
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        this.f121585a = c24369l0;
        this.f121586b = interfaceC24374o;
    }
}
