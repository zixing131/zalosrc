package p455qo;

import com.zing.zalo.feed.mvp.feed.data.ExceptionFeed;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeedAPI;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import is.C20830x0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19379c;
import p248iy.AbstractC20887g;
import p398oo.C24355e0;
import p398oo.C24362i;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import p455qo.AbstractC25425o;
import p455qo.C25440x;
import p458qr.C25487t;
import p688yo.EnumC31036b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import tn.C26747f0;
import tr.C26883g;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.l */
/* loaded from: classes4.dex */
public final class C25419l extends AbstractC19379c {

    /* renamed from: a */
    private final InterfaceC24374o f121685a;

    /* renamed from: b */
    private final C25440x f121686b;

    /* renamed from: qo.l$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121687t;

        /* renamed from: u */
        long f121688u;

        /* renamed from: v */
        int f121689v;

        /* renamed from: w */
        private /* synthetic */ Object f121690w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qo.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32955a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f121692t;

            C32955a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32955a(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f121692t == 0) {
                    AbstractC24862s.m129228b(obj);
                    C26747f0.m137582I().m137669U0();
                    C26883g.Companion.m138535a(EnumC31036b.f143137p.m150864c()).m138528k();
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32955a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f121690w = obj;
            return aVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0059: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:90), block:B:89:0x0059 */
        /* JADX WARN: Removed duplicated region for block: B:18:0x01a4 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:11:0x001b, B:14:0x002e, B:16:0x0190, B:18:0x01a4, B:21:0x01c3, B:25:0x0039, B:26:0x017f, B:30:0x0044, B:31:0x015f, B:51:0x0109, B:58:0x00f7, B:67:0x0092, B:68:0x00ca, B:73:0x009c, B:74:0x00bc, B:78:0x00a8), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x01c3 A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:11:0x001b, B:14:0x002e, B:16:0x0190, B:18:0x01a4, B:21:0x01c3, B:25:0x0039, B:26:0x017f, B:30:0x0044, B:31:0x015f, B:51:0x0109, B:58:0x00f7, B:67:0x0092, B:68:0x00ca, B:73:0x009c, B:74:0x00bc, B:78:0x00a8), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x018f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x017e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x015d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0121 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0108 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00f6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00c9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01f0 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object obj2;
            AbstractC25425o.a aVar;
            FlowCollector flowCollector;
            long currentTimeMillis;
            C24362i mo127472d;
            FlowCollector flowCollector2;
            C24362i c24362i;
            C24362i c24362i2;
            FlowCollector flowCollector3;
            AbstractC25425o.b bVar;
            CoroutineDispatcher m112680b;
            C32955a c32955a;
            FlowCollector flowCollector4;
            C24362i c24362i3;
            FlowCollector flowCollector5;
            C25440x c25440x;
            C25440x.a aVar2;
            AbstractC25425o.c cVar;
            C24355e0 c24355e0;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121689v;
            try {
                try {
                } catch (Exception e11) {
                    e = e11;
                    r12 = obj2;
                    if (!(e instanceof ExceptionFeed)) {
                    }
                    aVar = new AbstractC25425o.a(e);
                    this.f121690w = null;
                    this.f121687t = null;
                    this.f121689v = 12;
                    if (r12.mo12109b(aVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            } catch (Exception e12) {
                e = e12;
                if (!(e instanceof ExceptionFeed)) {
                    AbstractC20110a.f98889a.mo104552e(e);
                }
                aVar = new AbstractC25425o.a(e);
                this.f121690w = null;
                this.f121687t = null;
                this.f121689v = 12;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            switch (r12) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    flowCollector = (FlowCollector) this.f121690w;
                    currentTimeMillis = System.currentTimeMillis();
                    AbstractC25425o.d dVar = AbstractC25425o.d.f121727a;
                    this.f121690w = flowCollector;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 1;
                    if (flowCollector.mo12109b(dVar, this) == m142578e) {
                        return m142578e;
                    }
                    this.f121690w = flowCollector;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 2;
                    if (AbstractC25423n.m131697a(this) == m142578e) {
                        return m142578e;
                    }
                    mo127472d = C25419l.this.f121685a.mo127472d(0);
                    this.f121690w = flowCollector;
                    this.f121687t = mo127472d;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 3;
                    if (mo127472d.m127409p(this) == m142578e) {
                        return m142578e;
                    }
                    flowCollector2 = flowCollector;
                    c24362i = mo127472d;
                    this.f121690w = flowCollector2;
                    this.f121687t = c24362i;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 4;
                    if (c24362i.m127415v(this) == m142578e) {
                        return m142578e;
                    }
                    c24362i2 = c24362i;
                    flowCollector3 = flowCollector2;
                    bVar = AbstractC25425o.b.f121725a;
                    this.f121690w = flowCollector3;
                    this.f121687t = c24362i2;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 5;
                    if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    m112680b = Dispatchers.m112680b();
                    c32955a = new C32955a(null);
                    this.f121690w = flowCollector3;
                    this.f121687t = c24362i2;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 6;
                    if (BuildersKt.m112534g(m112680b, c32955a, this) != m142578e) {
                        return m142578e;
                    }
                    flowCollector4 = flowCollector3;
                    c24362i3 = c24362i2;
                    if (!c24362i3.m127405l().isEmpty() && C20830x0.f102390a.m108867k(EnumC31036b.f143137p) <= 0 && !c24362i3.m127410q()) {
                        C25419l.this.m131677f();
                        flowCollector5 = flowCollector4;
                        AbstractC20887g.m109215B(500000, "", currentTimeMillis, System.currentTimeMillis());
                        c24355e0 = C24355e0.f117560a;
                        if (c24355e0.m127361o()) {
                            AbstractC25425o.a aVar3 = new AbstractC25425o.a(new ExceptionFeedAPI(18028, c24355e0.m127359g()));
                            this.f121690w = flowCollector5;
                            this.f121687t = null;
                            this.f121689v = 10;
                            if (flowCollector5.mo12109b(aVar3, this) == m142578e) {
                                return m142578e;
                            }
                        } else {
                            AbstractC25425o.f fVar = AbstractC25425o.f.f121729a;
                            this.f121690w = flowCollector5;
                            this.f121687t = null;
                            this.f121689v = 11;
                            if (flowCollector5.mo12109b(fVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    C25487t.f122084a.m132028c(C25487t.a.f122096t);
                    this.f121690w = flowCollector4;
                    this.f121687t = null;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 7;
                    if (c24362i3.m127401h(this) != m142578e) {
                        return m142578e;
                    }
                    flowCollector5 = flowCollector4;
                    c25440x = C25419l.this.f121686b;
                    aVar2 = new C25440x.a(EnumC31036b.f143137p.m150864c());
                    this.f121690w = flowCollector5;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 8;
                    if (c25440x.m101498a(aVar2, this) == m142578e) {
                        return m142578e;
                    }
                    cVar = AbstractC25425o.c.f121726a;
                    this.f121690w = flowCollector5;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 9;
                    if (flowCollector5.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    AbstractC20887g.m109215B(500000, "", currentTimeMillis, System.currentTimeMillis());
                    c24355e0 = C24355e0.f117560a;
                    if (c24355e0.m127361o()) {
                    }
                    return C24848g0.f119245a;
                case 1:
                    currentTimeMillis = this.f121688u;
                    flowCollector = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    this.f121690w = flowCollector;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 2;
                    if (AbstractC25423n.m131697a(this) == m142578e) {
                    }
                    mo127472d = C25419l.this.f121685a.mo127472d(0);
                    this.f121690w = flowCollector;
                    this.f121687t = mo127472d;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 3;
                    if (mo127472d.m127409p(this) == m142578e) {
                    }
                    break;
                case 2:
                    currentTimeMillis = this.f121688u;
                    flowCollector = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    mo127472d = C25419l.this.f121685a.mo127472d(0);
                    this.f121690w = flowCollector;
                    this.f121687t = mo127472d;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 3;
                    if (mo127472d.m127409p(this) == m142578e) {
                    }
                    break;
                case 3:
                    currentTimeMillis = this.f121688u;
                    c24362i = (C24362i) this.f121687t;
                    flowCollector2 = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    this.f121690w = flowCollector2;
                    this.f121687t = c24362i;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 4;
                    if (c24362i.m127415v(this) == m142578e) {
                    }
                    c24362i2 = c24362i;
                    flowCollector3 = flowCollector2;
                    bVar = AbstractC25425o.b.f121725a;
                    this.f121690w = flowCollector3;
                    this.f121687t = c24362i2;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 5;
                    if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    }
                    m112680b = Dispatchers.m112680b();
                    c32955a = new C32955a(null);
                    this.f121690w = flowCollector3;
                    this.f121687t = c24362i2;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 6;
                    if (BuildersKt.m112534g(m112680b, c32955a, this) != m142578e) {
                    }
                    break;
                case 4:
                    currentTimeMillis = this.f121688u;
                    c24362i = (C24362i) this.f121687t;
                    flowCollector2 = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    c24362i2 = c24362i;
                    flowCollector3 = flowCollector2;
                    bVar = AbstractC25425o.b.f121725a;
                    this.f121690w = flowCollector3;
                    this.f121687t = c24362i2;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 5;
                    if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    }
                    m112680b = Dispatchers.m112680b();
                    c32955a = new C32955a(null);
                    this.f121690w = flowCollector3;
                    this.f121687t = c24362i2;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 6;
                    if (BuildersKt.m112534g(m112680b, c32955a, this) != m142578e) {
                    }
                    break;
                case 5:
                    currentTimeMillis = this.f121688u;
                    C24362i c24362i4 = (C24362i) this.f121687t;
                    FlowCollector flowCollector6 = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    c24362i2 = c24362i4;
                    flowCollector3 = flowCollector6;
                    m112680b = Dispatchers.m112680b();
                    c32955a = new C32955a(null);
                    this.f121690w = flowCollector3;
                    this.f121687t = c24362i2;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 6;
                    if (BuildersKt.m112534g(m112680b, c32955a, this) != m142578e) {
                    }
                    break;
                case 6:
                    currentTimeMillis = this.f121688u;
                    c24362i3 = (C24362i) this.f121687t;
                    flowCollector4 = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    if (!c24362i3.m127405l().isEmpty()) {
                        C25419l.this.m131677f();
                        flowCollector5 = flowCollector4;
                        AbstractC20887g.m109215B(500000, "", currentTimeMillis, System.currentTimeMillis());
                        c24355e0 = C24355e0.f117560a;
                        if (c24355e0.m127361o()) {
                        }
                        return C24848g0.f119245a;
                    }
                    C25487t.f122084a.m132028c(C25487t.a.f122096t);
                    this.f121690w = flowCollector4;
                    this.f121687t = null;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 7;
                    if (c24362i3.m127401h(this) != m142578e) {
                    }
                    break;
                case 7:
                    currentTimeMillis = this.f121688u;
                    flowCollector5 = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    c25440x = C25419l.this.f121686b;
                    aVar2 = new C25440x.a(EnumC31036b.f143137p.m150864c());
                    this.f121690w = flowCollector5;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 8;
                    if (c25440x.m101498a(aVar2, this) == m142578e) {
                    }
                    cVar = AbstractC25425o.c.f121726a;
                    this.f121690w = flowCollector5;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 9;
                    if (flowCollector5.mo12109b(cVar, this) == m142578e) {
                    }
                    AbstractC20887g.m109215B(500000, "", currentTimeMillis, System.currentTimeMillis());
                    c24355e0 = C24355e0.f117560a;
                    if (c24355e0.m127361o()) {
                    }
                    return C24848g0.f119245a;
                case 8:
                    currentTimeMillis = this.f121688u;
                    flowCollector5 = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    cVar = AbstractC25425o.c.f121726a;
                    this.f121690w = flowCollector5;
                    this.f121688u = currentTimeMillis;
                    this.f121689v = 9;
                    if (flowCollector5.mo12109b(cVar, this) == m142578e) {
                    }
                    AbstractC20887g.m109215B(500000, "", currentTimeMillis, System.currentTimeMillis());
                    c24355e0 = C24355e0.f117560a;
                    if (c24355e0.m127361o()) {
                    }
                    return C24848g0.f119245a;
                case 9:
                    currentTimeMillis = this.f121688u;
                    flowCollector5 = (FlowCollector) this.f121690w;
                    AbstractC24862s.m129228b(obj);
                    AbstractC20887g.m109215B(500000, "", currentTimeMillis, System.currentTimeMillis());
                    c24355e0 = C24355e0.f117560a;
                    if (c24355e0.m127361o()) {
                    }
                    return C24848g0.f119245a;
                case 10:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 11:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 12:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((a) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C25419l(InterfaceC24374o interfaceC24374o, C25440x c25440x, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o, c25440x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m131677f() {
        try {
            if (C20830x0.f102390a.m108865i() > 0) {
                C26747f0.m137582I().m137677p0(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        return FlowKt.m113265A(new a(null));
    }

    public C25419l(InterfaceC24374o interfaceC24374o, C25440x c25440x) {
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        AbstractC19074t.m100208f(c25440x, "preloadFeedAdsUseCase");
        this.f121685a = interfaceC24374o;
        this.f121686b = c25440x;
    }
}
