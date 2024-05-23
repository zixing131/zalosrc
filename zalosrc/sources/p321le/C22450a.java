package p321le;

import ag0.C0815e1;
import bp0.AbstractC3082b0;
import com.zing.zalo.calls.ringbacktone.domain.exception.ExceptionRingBackToneNoNetwork;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19055h0;
import ie.C20525a;
import java.util.Iterator;
import je.C21228a;
import je.C21229b;
import ke.InterfaceC21698a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19381e;
import p361nb.C23648e;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: le.a */
/* loaded from: classes3.dex */
public final class C22450a extends AbstractC19381e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC21698a f109800a;

    /* renamed from: le.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: le.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        int f109801A;

        /* renamed from: B */
        private /* synthetic */ Object f109802B;

        /* renamed from: t */
        Object f109804t;

        /* renamed from: u */
        Object f109805u;

        /* renamed from: v */
        Object f109806v;

        /* renamed from: w */
        Object f109807w;

        /* renamed from: x */
        Object f109808x;

        /* renamed from: y */
        int f109809y;

        /* renamed from: z */
        int f109810z;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f109802B = obj;
            return bVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0158 A[Catch: Exception -> 0x0164, TryCatch #5 {Exception -> 0x0164, blocks: (B:17:0x0199, B:19:0x0152, B:21:0x0158, B:23:0x0160, B:24:0x0166, B:26:0x0178, B:29:0x019e), top: B:16:0x0199 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x019e A[Catch: Exception -> 0x0164, TRY_LEAVE, TryCatch #5 {Exception -> 0x0164, blocks: (B:17:0x0199, B:19:0x0152, B:21:0x0158, B:23:0x0160, B:24:0x0166, B:26:0x0178, B:29:0x019e), top: B:16:0x0199 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01d3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00de A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00b6  */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v3, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0176 -> B:18:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0196 -> B:16:0x0199). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            b bVar;
            ?? r32;
            AbstractC25468a.a aVar;
            FlowCollector flowCollector;
            Object mo106623d;
            FlowCollector flowCollector2;
            Object obj2;
            C22450a c22450a;
            C21229b c21229b;
            C19055h0 c19055h0;
            Exception exc;
            Object obj3;
            C19055h0 c19055h02;
            Object mo106625f;
            FlowCollector flowCollector3;
            C21229b c21229b2;
            Object obj4;
            String str;
            FlowCollector flowCollector4;
            Object obj5;
            C22450a c22450a2;
            C21229b c21229b3;
            C19055h0 c19055h03;
            Iterator it;
            int i11;
            FlowCollector flowCollector5;
            int i12;
            FlowCollector flowCollector6;
            m142578e = AbstractC28298d.m142578e();
            ?? r33 = 2;
            try {
                try {
                } catch (Exception e11) {
                    e = e11;
                    bVar = this;
                    r32 = obj2;
                }
            } catch (Exception e12) {
                e = e12;
            }
            switch (this.f109801A) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    flowCollector = (FlowCollector) this.f109802B;
                    AbstractC25468a.b bVar2 = AbstractC25468a.b.f122049a;
                    this.f109802B = flowCollector;
                    this.f109801A = 1;
                    if (flowCollector.mo12109b(bVar2, this) == m142578e) {
                        return m142578e;
                    }
                    FlowCollector flowCollector7 = flowCollector;
                    InterfaceC21698a interfaceC21698a = C22450a.this.f109800a;
                    this.f109802B = flowCollector7;
                    this.f109801A = 2;
                    mo106623d = interfaceC21698a.mo106623d(this);
                    if (mo106623d != m142578e) {
                        return m142578e;
                    }
                    flowCollector2 = flowCollector7;
                    obj2 = mo106623d;
                    try {
                        c22450a = C22450a.this;
                        c21229b = (C21229b) obj2;
                        c19055h0 = new C19055h0();
                        c19055h0.f94931p = -1;
                        try {
                            InterfaceC21698a interfaceC21698a2 = c22450a.f109800a;
                            this.f109802B = flowCollector2;
                            this.f109804t = obj2;
                            this.f109805u = c22450a;
                            this.f109806v = c21229b;
                            this.f109807w = c19055h0;
                            this.f109808x = c19055h0;
                            this.f109801A = 3;
                            mo106625f = interfaceC21698a2.mo106625f(2, this);
                        } catch (Exception e13) {
                            exc = e13;
                            obj3 = obj2;
                            c19055h02 = c19055h0;
                            AbstractC3082b0.m15424f("GetAllRingBackTonesUseCase", "getSelectedRingBackToneId failed with ex " + exc);
                            if (exc instanceof ExceptionRingBackToneNoNetwork) {
                            }
                            C22450a.m116084f(c22450a, str, null, 2, null);
                            flowCollector4 = flowCollector2;
                            c21229b2 = c21229b;
                            obj4 = obj3;
                            c21229b2.m110016c().add(0, c22450a.f109800a.mo106626g());
                            Iterator it2 = c21229b2.m110016c().iterator();
                            bVar = this;
                            obj5 = obj4;
                            c22450a2 = c22450a;
                            c21229b3 = c21229b2;
                            c19055h03 = c19055h02;
                            it = it2;
                            i11 = 0;
                            flowCollector5 = flowCollector4;
                            if (it.hasNext()) {
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        bVar = this;
                        r32 = flowCollector2;
                        aVar = new AbstractC25468a.a(e);
                        bVar.f109802B = null;
                        bVar.f109804t = null;
                        bVar.f109805u = null;
                        bVar.f109806v = null;
                        bVar.f109807w = null;
                        bVar.f109808x = null;
                        bVar.f109801A = 6;
                        if (r32.mo12109b(aVar, bVar) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    if (mo106625f != m142578e) {
                        return m142578e;
                    }
                    flowCollector3 = flowCollector2;
                    c21229b2 = c21229b;
                    obj4 = obj2;
                    c19055h02 = c19055h0;
                    try {
                        c19055h0.f94931p = Math.abs(Integer.parseInt((String) mo106625f));
                        c22450a.m116083e("0", String.valueOf(c19055h02.f94931p));
                        flowCollector4 = flowCollector3;
                    } catch (Exception e15) {
                        exc = e15;
                        obj3 = obj4;
                        c21229b = c21229b2;
                        flowCollector2 = flowCollector3;
                        AbstractC3082b0.m15424f("GetAllRingBackTonesUseCase", "getSelectedRingBackToneId failed with ex " + exc);
                        if (exc instanceof ExceptionRingBackToneNoNetwork) {
                        }
                        C22450a.m116084f(c22450a, str, null, 2, null);
                        flowCollector4 = flowCollector2;
                        c21229b2 = c21229b;
                        obj4 = obj3;
                        c21229b2.m110016c().add(0, c22450a.f109800a.mo106626g());
                        Iterator it22 = c21229b2.m110016c().iterator();
                        bVar = this;
                        obj5 = obj4;
                        c22450a2 = c22450a;
                        c21229b3 = c21229b2;
                        c19055h03 = c19055h02;
                        it = it22;
                        i11 = 0;
                        flowCollector5 = flowCollector4;
                        if (it.hasNext()) {
                        }
                    }
                    c21229b2.m110016c().add(0, c22450a.f109800a.mo106626g());
                    Iterator it222 = c21229b2.m110016c().iterator();
                    bVar = this;
                    obj5 = obj4;
                    c22450a2 = c22450a;
                    c21229b3 = c21229b2;
                    c19055h03 = c19055h02;
                    it = it222;
                    i11 = 0;
                    flowCollector5 = flowCollector4;
                    if (it.hasNext()) {
                        Object next = it.next();
                        i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC25368s.m131509q();
                        }
                        C21228a c21228a = (C21228a) next;
                        flowCollector6 = flowCollector5;
                        if (AbstractC19074t.m100204b(c21228a.m110002b(), String.valueOf(c19055h03.f94931p))) {
                            try {
                                c21228a.m110012l(true);
                                InterfaceC21698a interfaceC21698a3 = c22450a2.f109800a;
                                bVar.f109802B = flowCollector5;
                                bVar.f109804t = obj5;
                                bVar.f109805u = c22450a2;
                                bVar.f109806v = c21229b3;
                                bVar.f109807w = c19055h03;
                                bVar.f109808x = it;
                                bVar.f109809y = i12;
                                bVar.f109810z = i11;
                                bVar.f109801A = 4;
                                flowCollector5 = flowCollector5;
                                if (interfaceC21698a3.mo106627h(c21228a, bVar) == m142578e) {
                                    return m142578e;
                                }
                                c21229b3.m110018e(i11);
                                flowCollector6 = flowCollector5;
                            } catch (Exception e16) {
                                e = e16;
                                r32 = flowCollector5;
                                aVar = new AbstractC25468a.a(e);
                                bVar.f109802B = null;
                                bVar.f109804t = null;
                                bVar.f109805u = null;
                                bVar.f109806v = null;
                                bVar.f109807w = null;
                                bVar.f109808x = null;
                                bVar.f109801A = 6;
                                if (r32.mo12109b(aVar, bVar) == m142578e) {
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        i11 = i12;
                        flowCollector5 = flowCollector6;
                        if (it.hasNext()) {
                            AbstractC25468a.c cVar = new AbstractC25468a.c(c21229b3);
                            bVar.f109802B = flowCollector5;
                            bVar.f109804t = obj5;
                            bVar.f109805u = null;
                            bVar.f109806v = null;
                            bVar.f109807w = null;
                            bVar.f109808x = null;
                            bVar.f109801A = 5;
                            if (flowCollector5.mo12109b(cVar, bVar) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    break;
                case 1:
                    flowCollector = (FlowCollector) this.f109802B;
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector72 = flowCollector;
                    InterfaceC21698a interfaceC21698a4 = C22450a.this.f109800a;
                    this.f109802B = flowCollector72;
                    this.f109801A = 2;
                    mo106623d = interfaceC21698a4.mo106623d(this);
                    if (mo106623d != m142578e) {
                    }
                    break;
                case 2:
                    FlowCollector flowCollector8 = (FlowCollector) this.f109802B;
                    AbstractC24862s.m129228b(obj);
                    flowCollector2 = flowCollector8;
                    obj2 = obj;
                    c22450a = C22450a.this;
                    c21229b = (C21229b) obj2;
                    c19055h0 = new C19055h0();
                    c19055h0.f94931p = -1;
                    InterfaceC21698a interfaceC21698a22 = c22450a.f109800a;
                    this.f109802B = flowCollector2;
                    this.f109804t = obj2;
                    this.f109805u = c22450a;
                    this.f109806v = c21229b;
                    this.f109807w = c19055h0;
                    this.f109808x = c19055h0;
                    this.f109801A = 3;
                    mo106625f = interfaceC21698a22.mo106625f(2, this);
                    if (mo106625f != m142578e) {
                    }
                    break;
                case 3:
                    C19055h0 c19055h04 = (C19055h0) this.f109808x;
                    c19055h02 = (C19055h0) this.f109807w;
                    c21229b2 = (C21229b) this.f109806v;
                    c22450a = (C22450a) this.f109805u;
                    obj4 = this.f109804t;
                    FlowCollector flowCollector9 = (FlowCollector) this.f109802B;
                    try {
                        AbstractC24862s.m129228b(obj);
                        flowCollector3 = flowCollector9;
                        c19055h0 = c19055h04;
                        mo106625f = obj;
                        c19055h0.f94931p = Math.abs(Integer.parseInt((String) mo106625f));
                        c22450a.m116083e("0", String.valueOf(c19055h02.f94931p));
                        flowCollector4 = flowCollector3;
                    } catch (Exception e17) {
                        exc = e17;
                        obj3 = obj4;
                        c21229b = c21229b2;
                        flowCollector2 = flowCollector9;
                        AbstractC3082b0.m15424f("GetAllRingBackTonesUseCase", "getSelectedRingBackToneId failed with ex " + exc);
                        if (exc instanceof ExceptionRingBackToneNoNetwork) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        C22450a.m116084f(c22450a, str, null, 2, null);
                        flowCollector4 = flowCollector2;
                        c21229b2 = c21229b;
                        obj4 = obj3;
                        c21229b2.m110016c().add(0, c22450a.f109800a.mo106626g());
                        Iterator it2222 = c21229b2.m110016c().iterator();
                        bVar = this;
                        obj5 = obj4;
                        c22450a2 = c22450a;
                        c21229b3 = c21229b2;
                        c19055h03 = c19055h02;
                        it = it2222;
                        i11 = 0;
                        flowCollector5 = flowCollector4;
                        if (it.hasNext()) {
                        }
                    }
                    c21229b2.m110016c().add(0, c22450a.f109800a.mo106626g());
                    Iterator it22222 = c21229b2.m110016c().iterator();
                    bVar = this;
                    obj5 = obj4;
                    c22450a2 = c22450a;
                    c21229b3 = c21229b2;
                    c19055h03 = c19055h02;
                    it = it22222;
                    i11 = 0;
                    flowCollector5 = flowCollector4;
                    if (it.hasNext()) {
                    }
                    break;
                case 4:
                    i11 = this.f109810z;
                    int i13 = this.f109809y;
                    it = (Iterator) this.f109808x;
                    c19055h03 = (C19055h0) this.f109807w;
                    c21229b3 = (C21229b) this.f109806v;
                    c22450a2 = (C22450a) this.f109805u;
                    obj5 = this.f109804t;
                    FlowCollector flowCollector10 = (FlowCollector) this.f109802B;
                    try {
                        AbstractC24862s.m129228b(obj);
                        i12 = i13;
                        flowCollector5 = flowCollector10;
                        bVar = this;
                        c21229b3.m110018e(i11);
                        flowCollector6 = flowCollector5;
                        i11 = i12;
                        flowCollector5 = flowCollector6;
                        if (it.hasNext()) {
                        }
                    } catch (Exception e18) {
                        e = e18;
                        r33 = flowCollector10;
                        bVar = this;
                        r32 = r33;
                        aVar = new AbstractC25468a.a(e);
                        bVar.f109802B = null;
                        bVar.f109804t = null;
                        bVar.f109805u = null;
                        bVar.f109806v = null;
                        bVar.f109807w = null;
                        bVar.f109808x = null;
                        bVar.f109801A = 6;
                        if (r32.mo12109b(aVar, bVar) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    break;
                case 5:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 6:
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

    public C22450a(InterfaceC21698a interfaceC21698a) {
        AbstractC19074t.m100208f(interfaceC21698a, "repo");
        this.f109800a = interfaceC21698a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m116083e(String str, String str2) {
        C0815e1.m2075D().m2100V(new C23648e(45, "setting_call_rbt", 1, "call_current_rbt", str, str2), false);
    }

    /* renamed from: f */
    static /* synthetic */ void m116084f(C22450a c22450a, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        c22450a.m116083e(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19381e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Flow mo93498b() {
        return FlowKt.m113265A(new b(null));
    }

    public /* synthetic */ C22450a(InterfaceC21698a interfaceC21698a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C20525a() : interfaceC21698a);
    }
}
