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

/* renamed from: qo.c0 */
/* loaded from: classes4.dex */
public final class C25402c0 extends AbstractC19377a {

    /* renamed from: a */
    private final C24369l0 f121614a;

    /* renamed from: b */
    private final InterfaceC24374o f121615b;

    /* renamed from: qo.c0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121616a;

        /* renamed from: b */
        private final int f121617b;

        /* renamed from: c */
        private final int f121618c;

        public a(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "userId");
            this.f121616a = str;
            this.f121617b = i11;
            this.f121618c = i12;
        }

        /* renamed from: a */
        public final int m131621a() {
            return this.f121617b;
        }

        /* renamed from: b */
        public final int m131622b() {
            return this.f121618c;
        }

        /* renamed from: c */
        public final String m131623c() {
            return this.f121616a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121616a, aVar.f121616a) && this.f121617b == aVar.f121617b && this.f121618c == aVar.f121618c;
        }

        public int hashCode() {
            return (((this.f121616a.hashCode() * 31) + this.f121617b) * 31) + this.f121618c;
        }

        public String toString() {
            return "Param(userId=" + this.f121616a + ", currentTab=" + this.f121617b + ", srcType=" + this.f121618c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.c0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121619t;

        /* renamed from: u */
        int f121620u;

        /* renamed from: v */
        int f121621v;

        /* renamed from: w */
        private /* synthetic */ Object f121622w;

        /* renamed from: x */
        final /* synthetic */ a f121623x;

        /* renamed from: y */
        final /* synthetic */ C25402c0 f121624y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C25402c0 c25402c0, Continuation continuation) {
            super(2, continuation);
            this.f121623x = aVar;
            this.f121624y = c25402c0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f121623x, this.f121624y, continuation);
            bVar.f121622w = obj;
            return bVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0039: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:58), block:B:82:0x0039 */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x019c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0179 A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:11:0x001c, B:18:0x0173, B:19:0x017e, B:22:0x018a, B:25:0x0179, B:29:0x00ed, B:48:0x00db, B:54:0x0135, B:58:0x0123, B:62:0x009d, B:68:0x00b2, B:72:0x00fa), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x013e A[Catch: Exception -> 0x019d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x019d, blocks: (B:33:0x013e, B:37:0x01a2), top: B:31:0x013c }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01a2 A[Catch: Exception -> 0x019d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x019d, blocks: (B:33:0x013e, B:37:0x01a2), top: B:31:0x013c }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ec A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0134 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00fa A[Catch: Exception -> 0x0021, TryCatch #2 {Exception -> 0x0021, blocks: (B:11:0x001c, B:18:0x0173, B:19:0x017e, B:22:0x018a, B:25:0x0179, B:29:0x00ed, B:48:0x00db, B:54:0x0135, B:58:0x0123, B:62:0x009d, B:68:0x00b2, B:72:0x00fa), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00a7  */
        /* JADX WARN: Type inference failed for: r12v20, types: [boolean] */
        /* JADX WARN: Type inference failed for: r12v32, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v21 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object obj2;
            FlowCollector flowCollector;
            int m131621a;
            int i11;
            List m131496e;
            int i12;
            List m131496e2;
            int i13;
            int i14;
            FlowCollector flowCollector2;
            int i15;
            FlowCollector flowCollector3;
            int i16;
            int i17;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121621v;
            boolean z11 = false;
            try {
                try {
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                r12 = obj2;
            }
            switch (r12) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector4 = (FlowCollector) this.f121622w;
                    AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                    this.f121622w = flowCollector4;
                    this.f121621v = 1;
                    if (flowCollector4.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    flowCollector = flowCollector4;
                    m131621a = this.f121623x.m131621a();
                    if (m131621a == 0) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                    if (m131621a == 0) {
                        if (m131621a != 1) {
                            i13 = i11;
                            i14 = m131621a;
                            flowCollector2 = flowCollector;
                            i15 = 0;
                            try {
                            } catch (Exception e13) {
                                r12 = flowCollector2;
                                e = e13;
                                AbstractC25468a.a aVar = new AbstractC25468a.a(e);
                                this.f121622w = null;
                                this.f121621v = 9;
                                if (r12.mo12109b(aVar, this) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                            if (i15 != 0) {
                                C24362i mo127472d = this.f121624y.f121615b.mo127472d(i14);
                                C24362i mo127472d2 = this.f121624y.f121615b.mo127472d(i13);
                                String m131623c = this.f121623x.m131623c();
                                mo127472d.m127391A(m131623c);
                                this.f121622w = flowCollector2;
                                this.f121619t = i14;
                                this.f121620u = i15;
                                this.f121621v = 6;
                                if (mo127472d2.m127417y(m131623c, mo127472d, this) == m142578e) {
                                    return m142578e;
                                }
                                int i18 = i15;
                                flowCollector3 = flowCollector2;
                                i16 = i18;
                                if (i14 == 0) {
                                    if (i14 == 1) {
                                        C20834z0.f102412a.m108925d(true);
                                    }
                                } else {
                                    C20834z0.f102412a.m108926e(true);
                                }
                                C25487t.f122084a.m132028c(C25487t.a.f122087B);
                                if (i16 != 0) {
                                    z11 = true;
                                }
                                cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(z11));
                                this.f121622w = flowCollector3;
                                this.f121621v = 7;
                                if (flowCollector3.mo12109b(cVar, this) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                            AbstractC25468a.a aVar2 = new AbstractC25468a.a(new Exception());
                            this.f121622w = flowCollector2;
                            this.f121621v = 8;
                            if (flowCollector2.mo12109b(aVar2, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        C24369l0 m131619d = this.f121624y.m131619d();
                        m131496e2 = AbstractC25366r.m131496e(this.f121623x.m131623c());
                        int m131622b = this.f121623x.m131622b();
                        this.f121622w = flowCollector;
                        this.f121619t = m131621a;
                        this.f121620u = i11;
                        this.f121621v = 4;
                        Object m127452c = m131619d.m127452c(m131496e2, m131622b, this);
                        if (m127452c == m142578e) {
                            return m142578e;
                        }
                        i12 = m131621a;
                        obj = m127452c;
                        this.f121622w = flowCollector;
                        this.f121619t = i12;
                        this.f121620u = i11;
                        this.f121621v = 5;
                        obj = FlowKt.m113304v((Flow) obj, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        i17 = ((Boolean) obj).booleanValue();
                        FlowCollector flowCollector5 = flowCollector;
                        i15 = i17;
                        flowCollector2 = flowCollector5;
                        int i19 = i12;
                        i13 = i11;
                        i14 = i19;
                        if (i15 != 0) {
                        }
                    } else {
                        C24369l0 m131619d2 = this.f121624y.m131619d();
                        m131496e = AbstractC25366r.m131496e(this.f121623x.m131623c());
                        int m131622b2 = this.f121623x.m131622b();
                        this.f121622w = flowCollector;
                        this.f121619t = m131621a;
                        this.f121620u = i11;
                        this.f121621v = 2;
                        Object m127456g = m131619d2.m127456g(m131496e, m131622b2, this);
                        if (m127456g == m142578e) {
                            return m142578e;
                        }
                        i12 = m131621a;
                        obj = m127456g;
                        this.f121622w = flowCollector;
                        this.f121619t = i12;
                        this.f121620u = i11;
                        this.f121621v = 3;
                        obj = FlowKt.m113304v((Flow) obj, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        i17 = ((Boolean) obj).booleanValue();
                        FlowCollector flowCollector52 = flowCollector;
                        i15 = i17;
                        flowCollector2 = flowCollector52;
                        int i192 = i12;
                        i13 = i11;
                        i14 = i192;
                        if (i15 != 0) {
                        }
                    }
                case 1:
                    flowCollector = (FlowCollector) this.f121622w;
                    AbstractC24862s.m129228b(obj);
                    m131621a = this.f121623x.m131621a();
                    if (m131621a == 0) {
                    }
                    if (m131621a == 0) {
                    }
                    break;
                case 2:
                    int i21 = this.f121620u;
                    int i22 = this.f121619t;
                    FlowCollector flowCollector6 = (FlowCollector) this.f121622w;
                    AbstractC24862s.m129228b(obj);
                    i11 = i21;
                    flowCollector = flowCollector6;
                    i12 = i22;
                    this.f121622w = flowCollector;
                    this.f121619t = i12;
                    this.f121620u = i11;
                    this.f121621v = 3;
                    obj = FlowKt.m113304v((Flow) obj, this);
                    if (obj == m142578e) {
                    }
                    i17 = ((Boolean) obj).booleanValue();
                    FlowCollector flowCollector522 = flowCollector;
                    i15 = i17;
                    flowCollector2 = flowCollector522;
                    int i1922 = i12;
                    i13 = i11;
                    i14 = i1922;
                    if (i15 != 0) {
                    }
                    break;
                case 3:
                    int i23 = this.f121620u;
                    int i24 = this.f121619t;
                    FlowCollector flowCollector7 = (FlowCollector) this.f121622w;
                    AbstractC24862s.m129228b(obj);
                    i11 = i23;
                    flowCollector = flowCollector7;
                    i12 = i24;
                    i17 = ((Boolean) obj).booleanValue();
                    FlowCollector flowCollector5222 = flowCollector;
                    i15 = i17;
                    flowCollector2 = flowCollector5222;
                    int i19222 = i12;
                    i13 = i11;
                    i14 = i19222;
                    if (i15 != 0) {
                    }
                    break;
                case 4:
                    int i25 = this.f121620u;
                    int i26 = this.f121619t;
                    FlowCollector flowCollector8 = (FlowCollector) this.f121622w;
                    AbstractC24862s.m129228b(obj);
                    i11 = i25;
                    flowCollector = flowCollector8;
                    i12 = i26;
                    this.f121622w = flowCollector;
                    this.f121619t = i12;
                    this.f121620u = i11;
                    this.f121621v = 5;
                    obj = FlowKt.m113304v((Flow) obj, this);
                    if (obj == m142578e) {
                    }
                    i17 = ((Boolean) obj).booleanValue();
                    FlowCollector flowCollector52222 = flowCollector;
                    i15 = i17;
                    flowCollector2 = flowCollector52222;
                    int i192222 = i12;
                    i13 = i11;
                    i14 = i192222;
                    if (i15 != 0) {
                    }
                    break;
                case 5:
                    int i27 = this.f121620u;
                    int i28 = this.f121619t;
                    FlowCollector flowCollector9 = (FlowCollector) this.f121622w;
                    AbstractC24862s.m129228b(obj);
                    i11 = i27;
                    flowCollector = flowCollector9;
                    i12 = i28;
                    i17 = ((Boolean) obj).booleanValue();
                    FlowCollector flowCollector522222 = flowCollector;
                    i15 = i17;
                    flowCollector2 = flowCollector522222;
                    int i1922222 = i12;
                    i13 = i11;
                    i14 = i1922222;
                    if (i15 != 0) {
                    }
                    break;
                case 6:
                    int i29 = this.f121620u;
                    i14 = this.f121619t;
                    FlowCollector flowCollector10 = (FlowCollector) this.f121622w;
                    AbstractC24862s.m129228b(obj);
                    i16 = i29;
                    flowCollector3 = flowCollector10;
                    if (i14 == 0) {
                    }
                    C25487t.f122084a.m132028c(C25487t.a.f122087B);
                    if (i16 != 0) {
                    }
                    cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(z11));
                    this.f121622w = flowCollector3;
                    this.f121621v = 7;
                    if (flowCollector3.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 7:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 8:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 9:
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

    public /* synthetic */ C25402c0(C24369l0 c24369l0, InterfaceC24374o interfaceC24374o, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24369l0.Companion.m127457a() : c24369l0, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o);
    }

    /* renamed from: d */
    public final C24369l0 m131619d() {
        return this.f121614a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C25402c0(C24369l0 c24369l0, InterfaceC24374o interfaceC24374o) {
        AbstractC19074t.m100208f(c24369l0, "repo");
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        this.f121614a = c24369l0;
        this.f121615b = interfaceC24374o;
    }
}
