package l50;

import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import i50.C20304a;
import k50.C21475c;
import k50.C21477e;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import me0.C23055e5;
import p185gc.AbstractC19384h;
import p426pp.AbstractC24900c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.d */
/* loaded from: classes5.dex */
public final class C22082d extends AbstractC19384h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l50.d$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f108693t;

        /* renamed from: u */
        private /* synthetic */ Object f108694u;

        /* renamed from: v */
        final /* synthetic */ String f108695v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation continuation) {
            super(2, continuation);
            this.f108695v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(this.f108695v, continuation);
            aVar.f108694u = obj;
            return aVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:11:0x001c, B:13:0x0028, B:14:0x00a1, B:18:0x0031, B:19:0x0091, B:23:0x0039, B:24:0x0075, B:29:0x005b, B:31:0x0061, B:34:0x00b4, B:35:0x00b6), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:11:0x001c, B:13:0x0028, B:14:0x00a1, B:18:0x0031, B:19:0x0091, B:23:0x0039, B:24:0x0075, B:29:0x005b, B:31:0x0061, B:34:0x00b4, B:35:0x00b6), top: B:2:0x0008 }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            AbstractC24900c.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f108693t;
            try {
            } catch (Exception e11) {
                AbstractC24900c.a aVar = new AbstractC24900c.a(e11);
                this.f108694u = null;
                this.f108693t = 6;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            switch (r12) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.f108694u;
                    AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                    this.f108694u = flowCollector2;
                    this.f108693t = 1;
                    if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    flowCollector = flowCollector2;
                    if (!C23055e5.m118273h(false, 1, null)) {
                        C20304a m106001a = C20304a.Companion.m106001a();
                        String str = this.f108695v;
                        this.f108694u = flowCollector;
                        this.f108693t = 2;
                        obj = m106001a.mo105986f(str, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        C21475c c21475c = (C21475c) obj;
                        C20304a m106001a2 = C20304a.Companion.m106001a();
                        String m111085b = c21475c.m111085b();
                        String m111087d = c21475c.m111087d();
                        this.f108694u = flowCollector;
                        this.f108693t = 3;
                        obj = m106001a2.mo105989i(m111085b, m111087d, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        C22090l c22090l = C22090l.f108732a;
                        this.f108694u = flowCollector;
                        this.f108693t = 4;
                        obj = c22090l.m115263e((C21477e) obj, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        cVar = new AbstractC24900c.c((String) obj);
                        this.f108694u = flowCollector;
                        this.f108693t = 5;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    throw ExceptionNoNetwork.f56345p;
                case 1:
                    flowCollector = (FlowCollector) this.f108694u;
                    AbstractC24862s.m129228b(obj);
                    if (!C23055e5.m118273h(false, 1, null)) {
                    }
                    break;
                case 2:
                    flowCollector = (FlowCollector) this.f108694u;
                    AbstractC24862s.m129228b(obj);
                    C21475c c21475c2 = (C21475c) obj;
                    C20304a m106001a22 = C20304a.Companion.m106001a();
                    String m111085b2 = c21475c2.m111085b();
                    String m111087d2 = c21475c2.m111087d();
                    this.f108694u = flowCollector;
                    this.f108693t = 3;
                    obj = m106001a22.mo105989i(m111085b2, m111087d2, this);
                    if (obj == m142578e) {
                    }
                    C22090l c22090l2 = C22090l.f108732a;
                    this.f108694u = flowCollector;
                    this.f108693t = 4;
                    obj = c22090l2.m115263e((C21477e) obj, this);
                    if (obj == m142578e) {
                    }
                    cVar = new AbstractC24900c.c((String) obj);
                    this.f108694u = flowCollector;
                    this.f108693t = 5;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 3:
                    flowCollector = (FlowCollector) this.f108694u;
                    AbstractC24862s.m129228b(obj);
                    C22090l c22090l22 = C22090l.f108732a;
                    this.f108694u = flowCollector;
                    this.f108693t = 4;
                    obj = c22090l22.m115263e((C21477e) obj, this);
                    if (obj == m142578e) {
                    }
                    cVar = new AbstractC24900c.c((String) obj);
                    this.f108694u = flowCollector;
                    this.f108693t = 5;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 4:
                    flowCollector = (FlowCollector) this.f108694u;
                    AbstractC24862s.m129228b(obj);
                    cVar = new AbstractC24900c.c((String) obj);
                    this.f108694u = flowCollector;
                    this.f108693t = 5;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
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
            return ((a) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(String str) {
        AbstractC19074t.m100208f(str, "params");
        return FlowKt.m113265A(new a(str, null));
    }
}
