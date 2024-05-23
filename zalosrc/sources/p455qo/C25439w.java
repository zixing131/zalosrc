package p455qo;

import bo.C3020p0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
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
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: qo.w */
/* loaded from: classes4.dex */
public final class C25439w extends AbstractC19377a {

    /* renamed from: a */
    private final C24369l0 f121781a;

    /* renamed from: b */
    private final InterfaceC24374o f121782b;

    /* renamed from: qo.w$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final List f121783a;

        /* renamed from: b */
        private final C3020p0 f121784b;

        /* renamed from: c */
        private final int f121785c;

        /* renamed from: d */
        private final int f121786d;

        public a(List list, C3020p0 c3020p0, int i11, int i12) {
            AbstractC19074t.m100208f(list, "userIds");
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            this.f121783a = list;
            this.f121784b = c3020p0;
            this.f121785c = i11;
            this.f121786d = i12;
        }

        /* renamed from: a */
        public final int m131763a() {
            return this.f121785c;
        }

        /* renamed from: b */
        public final C3020p0 m131764b() {
            return this.f121784b;
        }

        /* renamed from: c */
        public final int m131765c() {
            return this.f121786d;
        }

        /* renamed from: d */
        public final List m131766d() {
            return this.f121783a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121783a, aVar.f121783a) && AbstractC19074t.m100204b(this.f121784b, aVar.f121784b) && this.f121785c == aVar.f121785c && this.f121786d == aVar.f121786d;
        }

        public int hashCode() {
            return (((((this.f121783a.hashCode() * 31) + this.f121784b.hashCode()) * 31) + this.f121785c) * 31) + this.f121786d;
        }

        public String toString() {
            return "Param(userIds=" + this.f121783a + ", feedItem=" + this.f121784b + ", currentTab=" + this.f121785c + ", srcType=" + this.f121786d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121787t;

        /* renamed from: u */
        int f121788u;

        /* renamed from: v */
        int f121789v;

        /* renamed from: w */
        private /* synthetic */ Object f121790w;

        /* renamed from: x */
        final /* synthetic */ a f121791x;

        /* renamed from: y */
        final /* synthetic */ C25439w f121792y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C25439w c25439w, Continuation continuation) {
            super(2, continuation);
            this.f121791x = aVar;
            this.f121792y = c25439w;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f121791x, this.f121792y, continuation);
            bVar.f121790w = obj;
            return bVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x004b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:76), block:B:94:0x004b */
        /* JADX WARN: Removed duplicated region for block: B:18:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0187 A[Catch: Exception -> 0x0021, TryCatch #3 {Exception -> 0x0021, blocks: (B:11:0x001c, B:19:0x0181, B:20:0x018c, B:23:0x0198, B:26:0x0187, B:36:0x00dc, B:60:0x00cc, B:66:0x0119, B:70:0x0109, B:74:0x0095, B:80:0x00a9, B:84:0x00e6), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x01de A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0122 A[Catch: Exception -> 0x01ab, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ab, blocks: (B:40:0x0122, B:44:0x014d, B:47:0x0159, B:52:0x01b0), top: B:38:0x0120 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01b0 A[Catch: Exception -> 0x01ab, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ab, blocks: (B:40:0x0122, B:44:0x014d, B:47:0x0159, B:52:0x01b0), top: B:38:0x0120 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0118 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e6 A[Catch: Exception -> 0x0021, TryCatch #3 {Exception -> 0x0021, blocks: (B:11:0x001c, B:19:0x0181, B:20:0x018c, B:23:0x0198, B:26:0x0187, B:36:0x00dc, B:60:0x00cc, B:66:0x0119, B:70:0x0109, B:74:0x0095, B:80:0x00a9, B:84:0x00e6), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x009f  */
        /* JADX WARN: Type inference failed for: r12v23, types: [boolean] */
        /* JADX WARN: Type inference failed for: r12v35, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v31 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object obj2;
            AbstractC25468a.a aVar;
            FlowCollector flowCollector;
            int i11;
            int i12;
            FlowCollector flowCollector2;
            int i13;
            Object m131206f0;
            FlowCollector flowCollector3;
            int i14;
            int i15;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121789v;
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
                    FlowCollector flowCollector4 = (FlowCollector) this.f121790w;
                    AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                    this.f121790w = flowCollector4;
                    this.f121789v = 1;
                    if (flowCollector4.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    flowCollector = flowCollector4;
                    if (this.f121791x.m131763a() == 0) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                    if (i11 == 0) {
                        if (i11 != 1) {
                            i12 = i11;
                            flowCollector2 = flowCollector;
                            i13 = 0;
                            try {
                            } catch (Exception e13) {
                                r12 = flowCollector2;
                                e = e13;
                                AbstractC20110a.f98889a.mo104552e(e);
                                aVar = new AbstractC25468a.a(e);
                                this.f121790w = null;
                                this.f121789v = 9;
                                if (r12.mo12109b(aVar, this) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                            if (i13 != 0) {
                                C24362i mo127472d = this.f121792y.f121782b.mo127472d(this.f121791x.m131763a());
                                C24362i mo127472d2 = this.f121792y.f121782b.mo127472d(i12);
                                m131206f0 = AbstractC25332a0.m131206f0(this.f121791x.m131766d());
                                String str = (String) m131206f0;
                                String str2 = "";
                                if (str == null) {
                                    str = "";
                                }
                                String str3 = this.f121791x.m131764b().f12057p;
                                if (str3 != null) {
                                    str2 = str3;
                                }
                                mo127472d.m127395b(str2, !this.f121791x.m131764b().f12021A.m129381a());
                                this.f121790w = flowCollector2;
                                this.f121787t = i12;
                                this.f121788u = i13;
                                this.f121789v = 6;
                                if (mo127472d.m127417y(str, mo127472d2, this) == m142578e) {
                                    return m142578e;
                                }
                                int i16 = i13;
                                flowCollector3 = flowCollector2;
                                i14 = i16;
                                if (i12 == 0) {
                                    if (i12 == 1) {
                                        C20834z0.f102412a.m108926e(true);
                                    }
                                } else {
                                    C20834z0.f102412a.m108925d(true);
                                }
                                C25487t.f122084a.m132028c(C25487t.a.f122087B);
                                if (i14 != 0) {
                                    z11 = true;
                                }
                                cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(z11));
                                this.f121790w = flowCollector3;
                                this.f121789v = 7;
                                if (flowCollector3.mo12109b(cVar, this) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                            AbstractC25468a.a aVar2 = new AbstractC25468a.a(new Exception());
                            this.f121790w = flowCollector2;
                            this.f121789v = 8;
                            if (flowCollector2.mo12109b(aVar2, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        C24369l0 m131761d = this.f121792y.m131761d();
                        List m131766d = this.f121791x.m131766d();
                        int m131765c = this.f121791x.m131765c();
                        this.f121790w = flowCollector;
                        this.f121787t = i11;
                        this.f121789v = 4;
                        Object m127452c = m131761d.m127452c(m131766d, m131765c, this);
                        if (m127452c == m142578e) {
                            return m142578e;
                        }
                        i12 = i11;
                        obj = m127452c;
                        this.f121790w = flowCollector;
                        this.f121787t = i12;
                        this.f121789v = 5;
                        obj = FlowKt.m113304v((Flow) obj, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        i15 = ((Boolean) obj).booleanValue();
                        FlowCollector flowCollector5 = flowCollector;
                        i13 = i15;
                        flowCollector2 = flowCollector5;
                        if (i13 != 0) {
                        }
                    } else {
                        C24369l0 m131761d2 = this.f121792y.m131761d();
                        List m131766d2 = this.f121791x.m131766d();
                        int m131765c2 = this.f121791x.m131765c();
                        this.f121790w = flowCollector;
                        this.f121787t = i11;
                        this.f121789v = 2;
                        Object m127456g = m131761d2.m127456g(m131766d2, m131765c2, this);
                        if (m127456g == m142578e) {
                            return m142578e;
                        }
                        i12 = i11;
                        obj = m127456g;
                        this.f121790w = flowCollector;
                        this.f121787t = i12;
                        this.f121789v = 3;
                        obj = FlowKt.m113304v((Flow) obj, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        i15 = ((Boolean) obj).booleanValue();
                        FlowCollector flowCollector52 = flowCollector;
                        i13 = i15;
                        flowCollector2 = flowCollector52;
                        if (i13 != 0) {
                        }
                    }
                case 1:
                    flowCollector = (FlowCollector) this.f121790w;
                    AbstractC24862s.m129228b(obj);
                    if (this.f121791x.m131763a() == 0) {
                    }
                    if (i11 == 0) {
                    }
                    break;
                case 2:
                    int i17 = this.f121787t;
                    FlowCollector flowCollector6 = (FlowCollector) this.f121790w;
                    AbstractC24862s.m129228b(obj);
                    i12 = i17;
                    flowCollector = flowCollector6;
                    this.f121790w = flowCollector;
                    this.f121787t = i12;
                    this.f121789v = 3;
                    obj = FlowKt.m113304v((Flow) obj, this);
                    if (obj == m142578e) {
                    }
                    i15 = ((Boolean) obj).booleanValue();
                    FlowCollector flowCollector522 = flowCollector;
                    i13 = i15;
                    flowCollector2 = flowCollector522;
                    if (i13 != 0) {
                    }
                    break;
                case 3:
                    int i18 = this.f121787t;
                    FlowCollector flowCollector7 = (FlowCollector) this.f121790w;
                    AbstractC24862s.m129228b(obj);
                    i12 = i18;
                    flowCollector = flowCollector7;
                    i15 = ((Boolean) obj).booleanValue();
                    FlowCollector flowCollector5222 = flowCollector;
                    i13 = i15;
                    flowCollector2 = flowCollector5222;
                    if (i13 != 0) {
                    }
                    break;
                case 4:
                    int i19 = this.f121787t;
                    FlowCollector flowCollector8 = (FlowCollector) this.f121790w;
                    AbstractC24862s.m129228b(obj);
                    i12 = i19;
                    flowCollector = flowCollector8;
                    this.f121790w = flowCollector;
                    this.f121787t = i12;
                    this.f121789v = 5;
                    obj = FlowKt.m113304v((Flow) obj, this);
                    if (obj == m142578e) {
                    }
                    i15 = ((Boolean) obj).booleanValue();
                    FlowCollector flowCollector52222 = flowCollector;
                    i13 = i15;
                    flowCollector2 = flowCollector52222;
                    if (i13 != 0) {
                    }
                    break;
                case 5:
                    int i21 = this.f121787t;
                    FlowCollector flowCollector9 = (FlowCollector) this.f121790w;
                    AbstractC24862s.m129228b(obj);
                    i12 = i21;
                    flowCollector = flowCollector9;
                    i15 = ((Boolean) obj).booleanValue();
                    FlowCollector flowCollector522222 = flowCollector;
                    i13 = i15;
                    flowCollector2 = flowCollector522222;
                    if (i13 != 0) {
                    }
                    break;
                case 6:
                    int i22 = this.f121788u;
                    i12 = this.f121787t;
                    FlowCollector flowCollector10 = (FlowCollector) this.f121790w;
                    try {
                        AbstractC24862s.m129228b(obj);
                        i14 = i22;
                        flowCollector3 = flowCollector10;
                        if (i12 == 0) {
                        }
                        C25487t.f122084a.m132028c(C25487t.a.f122087B);
                        if (i14 != 0) {
                        }
                        cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(z11));
                        this.f121790w = flowCollector3;
                        this.f121789v = 7;
                        if (flowCollector3.mo12109b(cVar, this) == m142578e) {
                        }
                    } catch (Exception e14) {
                        e = e14;
                        r12 = flowCollector10;
                        AbstractC20110a.f98889a.mo104552e(e);
                        aVar = new AbstractC25468a.a(e);
                        this.f121790w = null;
                        this.f121789v = 9;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
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

    public /* synthetic */ C25439w(C24369l0 c24369l0, InterfaceC24374o interfaceC24374o, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24369l0.Companion.m127457a() : c24369l0, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o);
    }

    /* renamed from: d */
    public final C24369l0 m131761d() {
        return this.f121781a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C25439w(C24369l0 c24369l0, InterfaceC24374o interfaceC24374o) {
        AbstractC19074t.m100208f(c24369l0, "repo");
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        this.f121781a = c24369l0;
        this.f121782b = interfaceC24374o;
    }
}
