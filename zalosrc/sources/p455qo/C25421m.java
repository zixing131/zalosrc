package p455qo;

import com.zing.zalo.feed.mvp.feed.data.ExceptionFeed;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeedAPI;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import is.C20834z0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19379c;
import p398oo.C24355e0;
import p398oo.C24362i;
import p398oo.C24371m0;
import p398oo.C24380u;
import p398oo.InterfaceC24374o;
import p398oo.InterfaceC24379t;
import p455qo.AbstractC25425o;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.m */
/* loaded from: classes4.dex */
public final class C25421m extends AbstractC19379c {

    /* renamed from: a */
    private final InterfaceC24379t f121698a;

    /* renamed from: b */
    private final InterfaceC24374o f121699b;

    /* renamed from: qo.m$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121700t;

        /* renamed from: u */
        int f121701u;

        /* renamed from: v */
        private /* synthetic */ Object f121702v;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f121702v = obj;
            return aVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x003c: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:61), block:B:60:0x003c */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00db A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:15:0x0036, B:16:0x00d1, B:18:0x00db, B:19:0x00e0, B:21:0x00e8, B:24:0x0106, B:28:0x0047, B:35:0x0056, B:36:0x00b1), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00e8 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:15:0x0036, B:16:0x00d1, B:18:0x00db, B:19:0x00e0, B:21:0x00e8, B:24:0x0106, B:28:0x0047, B:35:0x0056, B:36:0x00b1), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0106 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:15:0x0036, B:16:0x00d1, B:18:0x00db, B:19:0x00e0, B:21:0x00e8, B:24:0x0106, B:28:0x0047, B:35:0x0056, B:36:0x00b1), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ce A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[Catch: Exception -> 0x0021, TRY_LEAVE, TryCatch #1 {Exception -> 0x0021, blocks: (B:11:0x001c, B:30:0x00bf, B:40:0x005e, B:41:0x008b, B:43:0x00a1, B:47:0x0116, B:51:0x0066, B:52:0x007f, B:56:0x0072), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0116 A[Catch: Exception -> 0x0021, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0021, blocks: (B:11:0x001c, B:30:0x00bf, B:40:0x005e, B:41:0x008b, B:43:0x00a1, B:47:0x0116, B:51:0x0066, B:52:0x007f, B:56:0x0072), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0141 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC25425o.a aVar;
            Object obj2;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            C24362i c24362i;
            FlowCollector flowCollector3;
            AbstractC25425o.b bVar;
            FlowCollector flowCollector4;
            C24362i c24362i2;
            C24355e0 c24355e0;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121701u;
            try {
                try {
                } catch (Exception e11) {
                    e = e11;
                    if (!(e instanceof ExceptionFeed)) {
                    }
                    aVar = new AbstractC25425o.a(e);
                    this.f121702v = null;
                    this.f121700t = null;
                    this.f121701u = 9;
                    if (r12.mo12109b(aVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            } catch (Exception e12) {
                e = e12;
                r12 = obj2;
                if (!(e instanceof ExceptionFeed)) {
                    AbstractC20110a.f98889a.mo104552e(e);
                }
                aVar = new AbstractC25425o.a(e);
                this.f121702v = null;
                this.f121700t = null;
                this.f121701u = 9;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            switch (r12) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    flowCollector = (FlowCollector) this.f121702v;
                    AbstractC25425o.d dVar = AbstractC25425o.d.f121727a;
                    this.f121702v = flowCollector;
                    this.f121701u = 1;
                    if (flowCollector.mo12109b(dVar, this) == m142578e) {
                        return m142578e;
                    }
                    this.f121702v = flowCollector;
                    this.f121701u = 2;
                    if (AbstractC25423n.m131697a(this) == m142578e) {
                        return m142578e;
                    }
                    C24362i mo127472d = C25421m.this.f121699b.mo127472d(1);
                    if (C25421m.this.f121698a.mo127507a()) {
                        this.f121702v = flowCollector;
                        this.f121700t = mo127472d;
                        this.f121701u = 3;
                        if (mo127472d.m127409p(this) == m142578e) {
                            return m142578e;
                        }
                        flowCollector2 = flowCollector;
                        c24362i = mo127472d;
                        this.f121702v = flowCollector2;
                        this.f121700t = c24362i;
                        this.f121701u = 4;
                        if (c24362i.m127415v(this) == m142578e) {
                            return m142578e;
                        }
                        C24362i c24362i3 = c24362i;
                        flowCollector3 = flowCollector2;
                        bVar = AbstractC25425o.b.f121725a;
                        this.f121702v = flowCollector3;
                        this.f121700t = c24362i3;
                        this.f121701u = 5;
                        if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                            return m142578e;
                        }
                        flowCollector4 = flowCollector3;
                        c24362i2 = c24362i3;
                        if (c24362i2.m127405l().isEmpty()) {
                            C20834z0.f102412a.m108926e(true);
                        }
                        c24355e0 = C24355e0.f117560a;
                        if (c24355e0.m127361o()) {
                            AbstractC25425o.a aVar2 = new AbstractC25425o.a(new ExceptionFeedAPI(18028, c24355e0.m127359g()));
                            this.f121702v = flowCollector4;
                            this.f121700t = null;
                            this.f121701u = 6;
                            if (flowCollector4.mo12109b(aVar2, this) == m142578e) {
                                return m142578e;
                            }
                        } else {
                            AbstractC25425o.f fVar = AbstractC25425o.f.f121729a;
                            this.f121702v = flowCollector4;
                            this.f121700t = null;
                            this.f121701u = 7;
                            if (flowCollector4.mo12109b(fVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC25425o.e eVar = AbstractC25425o.e.f121728a;
                    this.f121702v = flowCollector;
                    this.f121701u = 8;
                    if (flowCollector.mo12109b(eVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                case 1:
                    flowCollector = (FlowCollector) this.f121702v;
                    AbstractC24862s.m129228b(obj);
                    this.f121702v = flowCollector;
                    this.f121701u = 2;
                    if (AbstractC25423n.m131697a(this) == m142578e) {
                    }
                    C24362i mo127472d2 = C25421m.this.f121699b.mo127472d(1);
                    if (C25421m.this.f121698a.mo127507a()) {
                    }
                    break;
                case 2:
                    flowCollector = (FlowCollector) this.f121702v;
                    AbstractC24862s.m129228b(obj);
                    C24362i mo127472d22 = C25421m.this.f121699b.mo127472d(1);
                    if (C25421m.this.f121698a.mo127507a()) {
                    }
                    break;
                case 3:
                    c24362i = (C24362i) this.f121700t;
                    flowCollector2 = (FlowCollector) this.f121702v;
                    AbstractC24862s.m129228b(obj);
                    this.f121702v = flowCollector2;
                    this.f121700t = c24362i;
                    this.f121701u = 4;
                    if (c24362i.m127415v(this) == m142578e) {
                    }
                    C24362i c24362i32 = c24362i;
                    flowCollector3 = flowCollector2;
                    bVar = AbstractC25425o.b.f121725a;
                    this.f121702v = flowCollector3;
                    this.f121700t = c24362i32;
                    this.f121701u = 5;
                    if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    }
                    break;
                case 4:
                    c24362i = (C24362i) this.f121700t;
                    flowCollector2 = (FlowCollector) this.f121702v;
                    AbstractC24862s.m129228b(obj);
                    C24362i c24362i322 = c24362i;
                    flowCollector3 = flowCollector2;
                    bVar = AbstractC25425o.b.f121725a;
                    this.f121702v = flowCollector3;
                    this.f121700t = c24362i322;
                    this.f121701u = 5;
                    if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    }
                    break;
                case 5:
                    c24362i2 = (C24362i) this.f121700t;
                    flowCollector4 = (FlowCollector) this.f121702v;
                    AbstractC24862s.m129228b(obj);
                    if (c24362i2.m127405l().isEmpty()) {
                    }
                    c24355e0 = C24355e0.f117560a;
                    if (c24355e0.m127361o()) {
                    }
                    return C24848g0.f119245a;
                case 6:
                    AbstractC24862s.m129228b(obj);
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
            return ((a) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C25421m(InterfaceC24379t interfaceC24379t, InterfaceC24374o interfaceC24374o, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24380u.f117739a : interfaceC24379t, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o);
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        return FlowKt.m113265A(new a(null));
    }

    public C25421m(InterfaceC24379t interfaceC24379t, InterfaceC24374o interfaceC24374o) {
        AbstractC19074t.m100208f(interfaceC24379t, "prioritizeTimelineConfig");
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        this.f121698a = interfaceC24379t;
        this.f121699b = interfaceC24374o;
    }
}
