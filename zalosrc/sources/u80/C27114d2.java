package u80;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import dj.C17945a0;
import eg0.AbstractC18428c;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.C21459a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mg.C23288a;
import nl.C23870a;
import p019aj.C0876j;
import p348mi.AbstractC23306f;
import p487rl.C25821b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;
import ta0.AbstractC26611a;
import vm0.AbstractC28298d;
import wa0.AbstractC28862a;
import wm0.AbstractC29104l;
import xd0.C29588d;

/* renamed from: u80.d2 */
/* loaded from: classes6.dex */
public final class C27114d2 extends AbstractC26611a {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final C23870a f127801I;

    /* renamed from: J */
    private final C0876j f127802J;

    /* renamed from: K */
    private final C1761c0 f127803K;

    /* renamed from: L */
    private final LiveData f127804L;

    /* renamed from: M */
    private ThreadStorageInfo f127805M;

    /* renamed from: u80.d2$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: u80.d2$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f127806t;

        /* renamed from: u */
        int f127807u;

        /* renamed from: v */
        private /* synthetic */ Object f127808v;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f127808v = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m124806d0;
            ThreadStorageInfo threadStorageInfo;
            C13380a c13380a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f127807u;
            if (i11 != 0) {
                if (i11 == 1) {
                    threadStorageInfo = (ThreadStorageInfo) this.f127806t;
                    AbstractC24862s.m129228b(obj);
                    m124806d0 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f127808v;
                C21459a.m111041j();
                ThreadStorageInfo threadStorageInfo2 = new ThreadStorageInfo("204278670", null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 262142, null);
                C23870a c23870a = C27114d2.this.f127801I;
                this.f127808v = coroutineScope;
                this.f127806t = threadStorageInfo2;
                this.f127807u = 1;
                m124806d0 = c23870a.m124806d0("204278670", this);
                if (m124806d0 == m142578e) {
                    return m142578e;
                }
                threadStorageInfo = threadStorageInfo2;
            }
            List<C25821b> list = (List) m124806d0;
            C27114d2 c27114d2 = C27114d2.this;
            ArrayList arrayList = new ArrayList();
            for (C25821b c25821b : list) {
                C17945a0 m2635r = c27114d2.f127802J.m2635r(c25821b.m133146i());
                if (m2635r != null) {
                    c13380a = new C13380a(0, null, false, false, m2635r, null, 0L, 111, null);
                    c13380a.m75077G(c25821b.m133145h().m133166c());
                } else {
                    AbstractC20110a.f98889a.m104564x("SMLMyCloudQuotaManagementViewModel").mo104551d("CHAT CONTENT NOT FOUND " + c25821b, new Object[0]);
                    c13380a = null;
                }
                if (c13380a != null) {
                    arrayList.add(c13380a);
                }
            }
            C27114d2.this.m136599l0(arrayList);
            if (threadStorageInfo.m74776N() <= 0 && (!r2.isEmpty())) {
                threadStorageInfo.m74790e();
                C27114d2 c27114d22 = C27114d2.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c27114d22.m139225F0((C25821b) it.next(), threadStorageInfo);
                }
            }
            C27114d2.this.f127805M = threadStorageInfo;
            C27114d2.this.f127803K.mo9221n(threadStorageInfo);
            C27114d2.this.m136605u0(false);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: u80.d2$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f127810q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17945a0 c17945a0) {
            super(1);
            this.f127810q = c17945a0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            String str;
            MessageId m95029V3;
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null && (m95029V3 = m75089k.m95029V3()) != null) {
                str = m95029V3.m41044h();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f127810q.m95029V3().m41044h()));
        }
    }

    /* renamed from: u80.d2$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f127811q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C17945a0 c17945a0) {
            super(1);
            this.f127811q = c17945a0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            String str;
            MessageId m95029V3;
            AbstractC19074t.m100208f(c13380a, "it");
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null && (m95029V3 = m75089k.m95029V3()) != null) {
                str = m95029V3.m41044h();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f127811q.m95029V3().m41044h()));
        }
    }

    /* renamed from: u80.d2$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f127812q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C17945a0 c17945a0) {
            super(1);
            this.f127812q = c17945a0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            String str;
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null) {
                str = m75089k.m94983Q3();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f127812q.m94983Q3()));
        }
    }

    /* renamed from: u80.d2$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f127813q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C17945a0 c17945a0) {
            super(1);
            this.f127813q = c17945a0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            String str;
            AbstractC19074t.m100208f(c13380a, "it");
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null) {
                str = m75089k.m94983Q3();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f127813q.m94983Q3()));
        }
    }

    public C27114d2(C23870a c23870a, C0876j c0876j) {
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        this.f127801I = c23870a;
        this.f127802J = c0876j;
        C1761c0 c1761c0 = new C1761c0();
        this.f127803K = c1761c0;
        this.f127804L = c1761c0;
    }

    /* renamed from: F0 */
    public final void m139225F0(C25821b c25821b, ThreadStorageInfo threadStorageInfo) {
        if (!AbstractC19646n0.m103031t1(c25821b.m133147j()) && !AbstractC19646n0.m102995k1(c25821b.m133147j())) {
            if (AbstractC19646n0.m102886D1(c25821b.m133147j())) {
                threadStorageInfo.m74814q0(threadStorageInfo.m74781T() + c25821b.m133145h().m133166c());
                threadStorageInfo.m74812p0(threadStorageInfo.m74780S() + 1);
                return;
            } else if (AbstractC19646n0.m103003m1(c25821b.m133147j())) {
                threadStorageInfo.m74787Z(threadStorageInfo.m74816t() + c25821b.m133145h().m133166c());
                threadStorageInfo.m74786Y(threadStorageInfo.m74813q() + 1);
                return;
            } else if (AbstractC19646n0.m102889E1(c25821b.m133147j())) {
                threadStorageInfo.m74817t0(threadStorageInfo.m74783V() + c25821b.m133145h().m133166c());
                threadStorageInfo.m74815r0(threadStorageInfo.m74782U() + 1);
                return;
            } else {
                threadStorageInfo.m74794g0(threadStorageInfo.m74821y() + c25821b.m133145h().m133166c());
                threadStorageInfo.m74791e0(threadStorageInfo.m74820x() + 1);
                return;
            }
        }
        threadStorageInfo.m74798i0(threadStorageInfo.m74768C() + c25821b.m133145h().m133166c());
        threadStorageInfo.m74796h0(threadStorageInfo.m74767B() + 1);
    }

    /* renamed from: I0 */
    public static final void m139226I0(List list, String str) {
        List<List> m131195U;
        AbstractC19074t.m100208f(list, "$selectedChatContents");
        AbstractC19074t.m100208f(str, "$uid");
        m131195U = AbstractC25332a0.m131195U(list, 50);
        for (List list2 : m131195U) {
            AbstractC23306f.m120604O().m101508a(new C29588d.c(str, list2, null, 4, null));
            AbstractC23306f.m120607P().m102641o(list2);
        }
    }

    /* renamed from: K0 */
    private final List m139227K0(List list, List list2) {
        String str;
        Object obj;
        ArrayList arrayList = new ArrayList(m136587Y());
        Iterator it = arrayList.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((C13380a) obj).m75072B()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C13380a c13380a = (C13380a) obj;
        if (c13380a != null) {
            str = c13380a.m75081a();
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it2.next();
            if (AbstractC19074t.m100204b(str, c17945a0.m95029V3().m41044h())) {
                C7853b.Companion.m40150a().m40136j1();
            }
            if (TextUtils.isEmpty(c17945a0.m94983Q3())) {
                AbstractC25378x.m131542D(arrayList, new c(c17945a0));
                AbstractC25378x.m131541C(m136590b0(), new d(c17945a0));
            } else {
                AbstractC25378x.m131542D(arrayList, new e(c17945a0));
                AbstractC25378x.m131541C(m136590b0(), new f(c17945a0));
            }
        }
        ThreadStorageInfo threadStorageInfo = this.f127805M;
        if (threadStorageInfo != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C13380a c13380a2 = (C13380a) it3.next();
                if (!c13380a2.m75071A() && !c13380a2.m75097s()) {
                    if (c13380a2.m75075E()) {
                        threadStorageInfo.m74814q0(threadStorageInfo.m74781T() - c13380a2.m75087i());
                    } else if (c13380a2.m75100v()) {
                        threadStorageInfo.m74787Z(threadStorageInfo.m74816t() - c13380a2.m75087i());
                    } else if (c13380a2.m75076F()) {
                        threadStorageInfo.m74817t0(threadStorageInfo.m74783V() - c13380a2.m75087i());
                    } else {
                        threadStorageInfo.m74794g0(threadStorageInfo.m74821y() - c13380a2.m75087i());
                    }
                } else {
                    threadStorageInfo.m74798i0(threadStorageInfo.m74768C() - c13380a2.m75087i());
                }
            }
            this.f127803K.mo9221n(threadStorageInfo);
        }
        return arrayList;
    }

    /* renamed from: G0 */
    public final void m139229G0() {
        m136605u0(true);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new b(null), 2, null);
    }

    /* renamed from: J0 */
    public final LiveData m139230J0() {
        return this.f127804L;
    }

    @Override // ta0.AbstractC26611a
    /* renamed from: R */
    public List mo111798R(List list) {
        AbstractC19074t.m100208f(list, "selectedStorageUsageItems");
        if (list.isEmpty()) {
            return m136587Y();
        }
        List m144302a = AbstractC28862a.m144302a(list);
        AbstractC18428c.m97659b(C23288a.f113033a, "204278670", 0, new Runnable() { // from class: u80.c2

            /* renamed from: p */
            public final /* synthetic */ List f127796p;

            /* renamed from: q */
            public final /* synthetic */ String f127797q;

            public /* synthetic */ RunnableC27110c2(List m144302a2, String str) {
                r1 = m144302a2;
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C27114d2.m139226I0(r1, r2);
            }
        }, 2, null);
        return m139227K0(list, m144302a2);
    }

    @Override // ta0.AbstractC26611a
    /* renamed from: w0 */
    public List mo111806w0(List list) {
        AbstractC19074t.m100208f(list, "selectedStorageUsageItems");
        return m139227K0(list, AbstractC28862a.m144302a(list));
    }
}
