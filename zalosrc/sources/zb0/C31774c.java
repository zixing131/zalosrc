package zb0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import bh0.C2801a;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.zalocloud.recover.C16888a;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import dj.C17945a0;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19057i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k30.C21459a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import nl.C23870a;
import p019aj.C0876j;
import p205hc.C19964c;
import p348mi.AbstractC23306f;
import p487rl.C25821b;
import p613wl.AbstractC29087c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import zb0.AbstractC31773b;

/* renamed from: zb0.c */
/* loaded from: classes6.dex */
public final class C31774c extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C23870a f145883s;

    /* renamed from: t */
    private final C0876j f145884t;

    /* renamed from: u */
    private final C16888a f145885u;

    /* renamed from: v */
    private final C1761c0 f145886v;

    /* renamed from: w */
    private final C1761c0 f145887w;

    /* renamed from: x */
    private final AtomicBoolean f145888x;

    /* renamed from: y */
    private final AtomicBoolean f145889y;

    /* renamed from: zb0.c$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zb0.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f145890t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zb0.c$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31774c f145892q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31774c c31774c) {
                super(1);
                this.f145892q = c31774c;
            }

            /* renamed from: a */
            public final void m152791a(ZCloudQuotaUsage zCloudQuotaUsage) {
                AbstractC19074t.m100208f(zCloudQuotaUsage, "usage");
                if (zCloudQuotaUsage.m41257o() && !this.f145892q.f145888x.getAndSet(true)) {
                    this.f145892q.m152782W(zCloudQuotaUsage);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m152791a((ZCloudQuotaUsage) obj);
                return C24848g0.f119245a;
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f145890t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    C23870a.m124718I0(C31774c.this.f145883s, false, null, new a(C31774c.this), 2, null);
                } catch (Exception e11) {
                    C26676b.m136954d("ZCloudGPContainerViewModel", e11);
                    C31774c.this.f145887w.mo9221n(new C19964c(AbstractC31773b.b.f145876a));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zb0.c$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f145893t;

        /* renamed from: u */
        Object f145894u;

        /* renamed from: v */
        int f145895v;

        /* renamed from: w */
        private /* synthetic */ Object f145896w;

        /* renamed from: y */
        final /* synthetic */ ZCloudQuotaUsage f145898y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zb0.c$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: A */
            final /* synthetic */ C19057i0 f145899A;

            /* renamed from: t */
            Object f145900t;

            /* renamed from: u */
            int f145901u;

            /* renamed from: v */
            final /* synthetic */ C31774c f145902v;

            /* renamed from: w */
            final /* synthetic */ C25821b f145903w;

            /* renamed from: x */
            final /* synthetic */ Object f145904x;

            /* renamed from: y */
            final /* synthetic */ C19057i0 f145905y;

            /* renamed from: z */
            final /* synthetic */ ArrayList f145906z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31774c c31774c, C25821b c25821b, Object obj, C19057i0 c19057i0, ArrayList arrayList, C19057i0 c19057i02, Continuation continuation) {
                super(2, continuation);
                this.f145902v = c31774c;
                this.f145903w = c25821b;
                this.f145904x = obj;
                this.f145905y = c19057i0;
                this.f145906z = arrayList;
                this.f145899A = c19057i02;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f145902v, this.f145903w, this.f145904x, this.f145905y, this.f145906z, this.f145899A, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C17945a0 m2635r;
                C17945a0 c17945a0;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f145901u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        c17945a0 = (C17945a0) this.f145900t;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m2635r = this.f145902v.f145884t.m2635r(this.f145903w.m133146i());
                    if (m2635r == null) {
                        return C24848g0.f119245a;
                    }
                    if (AbstractC29087c.m145335c(this.f145903w.m133146i())) {
                        if (AbstractC16893a.m90331h(this.f145903w)) {
                            Object obj2 = this.f145904x;
                            C19057i0 c19057i0 = this.f145905y;
                            C25821b c25821b = this.f145903w;
                            synchronized (obj2) {
                                c19057i0.f94939p += c25821b.m133145h().m133166c();
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            }
                        } else {
                            C2801a m13526a = C2801a.Companion.m13526a();
                            this.f145900t = m2635r;
                            this.f145901u = 1;
                            Object m13524b = m13526a.m13524b(m2635r, this);
                            if (m13524b == m142578e) {
                                return m142578e;
                            }
                            c17945a0 = m2635r;
                            obj = m13524b;
                        }
                    }
                    if (AbstractC23041d2.m118194A(m2635r.m94983Q3())) {
                        Object obj3 = this.f145904x;
                        C19057i0 c19057i02 = this.f145899A;
                        C25821b c25821b2 = this.f145903w;
                        synchronized (obj3) {
                            c19057i02.f94939p += c25821b2.m133145h().m133166c();
                            C24848g0 c24848g02 = C24848g0.f119245a;
                        }
                    }
                    return C24848g0.f119245a;
                }
                if (!(!((Boolean) obj).booleanValue())) {
                    Object obj4 = this.f145904x;
                    ArrayList arrayList = this.f145906z;
                    C25821b c25821b3 = this.f145903w;
                    synchronized (obj4) {
                        arrayList.add(c25821b3.m133146i());
                    }
                    return C24848g0.f119245a;
                }
                Object obj5 = this.f145904x;
                C19057i0 c19057i03 = this.f145905y;
                C25821b c25821b4 = this.f145903w;
                synchronized (obj5) {
                    c19057i03.f94939p += c25821b4.m133145h().m133166c();
                    C24848g0 c24848g03 = C24848g0.f119245a;
                }
                m2635r = c17945a0;
                if (AbstractC23041d2.m118194A(m2635r.m94983Q3())) {
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ZCloudQuotaUsage zCloudQuotaUsage, Continuation continuation) {
            super(2, continuation);
            this.f145898y = zCloudQuotaUsage;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f145898y, continuation);
            cVar.f145896w = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            C19057i0 c19057i0;
            ArrayList<MessageId> arrayList;
            C19057i0 c19057i02;
            Deferred m112538b;
            long m116581d;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f145895v;
            if (i11 != 0) {
                if (i11 == 1) {
                    c19057i02 = (C19057i0) this.f145894u;
                    arrayList = (ArrayList) this.f145893t;
                    c19057i0 = (C19057i0) this.f145896w;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f145896w;
                C31774c.this.f145883s.m124772I();
                C31774c.this.f145883s.m124759B();
                List m124808f0 = C31774c.this.f145883s.m124808f0();
                C19057i0 c19057i03 = new C19057i0();
                ArrayList arrayList2 = new ArrayList();
                C19057i0 c19057i04 = new C19057i0();
                Object obj2 = new Object();
                List list = m124808f0;
                C31774c c31774c = C31774c.this;
                m131511r = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList3 = new ArrayList(m131511r);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList4 = arrayList3;
                    m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope, Dispatchers.m112679a(), null, new a(c31774c, (C25821b) it.next(), obj2, c19057i04, arrayList2, c19057i03, null), 2, null);
                    arrayList4.add(m112538b);
                    arrayList3 = arrayList4;
                    c31774c = c31774c;
                }
                this.f145896w = c19057i03;
                this.f145893t = arrayList2;
                this.f145894u = c19057i04;
                this.f145895v = 1;
                if (AwaitKt.m112521a(arrayList3, this) == m142578e) {
                    return m142578e;
                }
                c19057i0 = c19057i03;
                arrayList = arrayList2;
                c19057i02 = c19057i04;
            }
            C31774c c31774c2 = C31774c.this;
            for (MessageId messageId : arrayList) {
                C23870a c23870a = c31774c2.f145883s;
                if (messageId != null) {
                    c23870a.m124762D(messageId);
                }
            }
            long m41265a = this.f145898y.m41251i().m41265a() + c19057i02.f94939p;
            m116581d = AbstractC22543l.m116581d(m41265a - c19057i0.f94939p, 0L);
            if (m116581d == 0) {
                ZaloCloudRecoverCloudMediaWorker.Companion.m90207s(new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d(5));
                C31774c.this.f145887w.mo9221n(new C19964c(AbstractC31773b.d.f145880a));
                return C24848g0.f119245a;
            }
            C31774c.this.f145885u.m90221D(m116581d);
            C31774c.this.f145887w.mo9221n(new C19964c(new AbstractC31773b.c(C21459a.m111034b(m41265a), C21459a.m111034b(m116581d), C21459a.m111034b(c19057i0.f94939p))));
            C31774c.this.f145886v.mo9221n(C31775d.m152794b(C31774c.this.m152781V(), false, new C31772a(m41265a, c19057i0.f94939p, m116581d, this.f145898y.m41251i().m41265a(), c19057i02.f94939p), 1, null));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C31774c(C23870a c23870a, C0876j c0876j, C16888a c16888a) {
        AbstractC19074t.m100208f(c23870a, "cloudRepository");
        AbstractC19074t.m100208f(c0876j, "messageRepository");
        AbstractC19074t.m100208f(c16888a, "zCloudGracePeriodManager");
        this.f145883s = c23870a;
        this.f145884t = c0876j;
        this.f145885u = c16888a;
        this.f145886v = new C1761c0(new C31775d(false, null, 3, null));
        this.f145887w = new C1761c0(new C19964c(AbstractC31773b.a.f145875a));
        this.f145888x = new AtomicBoolean(false);
        this.f145889y = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final C31775d m152781V() {
        C31775d c31775d = (C31775d) m152785Y().mo9215f();
        if (c31775d == null) {
            return new C31775d(false, null, 3, null);
        }
        return c31775d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m152782W(ZCloudQuotaUsage zCloudQuotaUsage) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new c(zCloudQuotaUsage, null), 2, null);
    }

    /* renamed from: U */
    public final void m152783U() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new b(null), 2, null);
    }

    /* renamed from: X */
    public final LiveData m152784X() {
        return this.f145887w;
    }

    /* renamed from: Y */
    public final LiveData m152785Y() {
        return this.f145886v;
    }

    /* renamed from: Z */
    public final void m152786Z() {
        this.f145886v.mo9221n(m152781V());
    }

    /* renamed from: a0 */
    public final void m152787a0() {
        this.f145887w.mo9221n(new C19964c(AbstractC31773b.e.f145881a));
    }

    /* renamed from: b0 */
    public final void m152788b0(int i11) {
        this.f145887w.mo9221n(new C19964c(new AbstractC31773b.f(i11)));
    }

    /* renamed from: i */
    public final void m152789i() {
        if (!AbstractC23306f.m120655d2().m112079n() && !this.f145889y.getAndSet(true)) {
            m152783U();
        }
    }
}
