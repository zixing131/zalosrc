package ug0;

import ah0.C0860a;
import am.AbstractC0924m0;
import android.os.Build;
import androidx.lifecycle.AbstractC1794s0;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2151i0;
import androidx.work.AbstractC2252t;
import androidx.work.C2142e;
import androidx.work.C2148h;
import androidx.work.C2149h0;
import androidx.work.C2256x;
import androidx.work.EnumC2134a;
import androidx.work.EnumC2242k;
import androidx.work.EnumC2254v;
import androidx.work.InterfaceC2257y;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.migration.C16862b;
import com.zing.zalo.zalocloud.migration.ZaloCloudMigrationWorker;
import com.zing.zalocore.CoreUtility;
import dh0.C17933b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jm.AbstractC21289a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import ln0.AbstractC22543l;
import me0.C23055e5;
import on0.AbstractC24341v;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25370t;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wg0.C28988k;
import wm0.AbstractC29104l;

/* renamed from: ug0.n */
/* loaded from: classes7.dex */
public final class C27259n {

    /* renamed from: a */
    public static final C27259n f128166a = new C27259n();

    /* renamed from: ug0.n$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f128167q = new a();

        /* renamed from: ug0.n$a$a */
        /* loaded from: classes7.dex */
        public static final class C32990a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32990a f128168q = new C32990a();

            C32990a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CharSequence mo205i9(C2149h0 c2149h0) {
                return c2149h0.toString();
            }
        }

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(Map.Entry entry) {
            String m131214n0;
            AbstractC19074t.m100208f(entry, "it");
            Object key = entry.getKey();
            Object value = entry.getValue();
            AbstractC19074t.m100207e(value, "<get-value>(...)");
            m131214n0 = AbstractC25332a0.m131214n0((Iterable) value, null, null, null, 0, null, C32990a.f128168q, 31, null);
            return key + "=" + m131214n0;
        }
    }

    /* renamed from: ug0.n$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f128169q = new b();

        /* renamed from: ug0.n$b$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f128170q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CharSequence mo205i9(C2149h0 c2149h0) {
                return c2149h0.m11542c().toString();
            }
        }

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(Map.Entry entry) {
            String m131214n0;
            AbstractC19074t.m100208f(entry, "it");
            Object key = entry.getKey();
            Object value = entry.getValue();
            AbstractC19074t.m100207e(value, "<get-value>(...)");
            m131214n0 = AbstractC25332a0.m131214n0((Iterable) value, null, null, null, 0, null, a.f128170q, 31, null);
            return key + "=" + m131214n0;
        }
    }

    /* renamed from: ug0.n$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f128171q = new c();

        /* renamed from: ug0.n$c$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f128172q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CharSequence mo205i9(C2149h0 c2149h0) {
                return String.valueOf(c2149h0.m11541b());
            }
        }

        c() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(Map.Entry entry) {
            String m131214n0;
            AbstractC19074t.m100208f(entry, "it");
            Object key = entry.getKey();
            Object value = entry.getValue();
            AbstractC19074t.m100207e(value, "<get-value>(...)");
            m131214n0 = AbstractC25332a0.m131214n0((Iterable) value, null, null, null, 0, null, a.f128172q, 31, null);
            return key + "=" + m131214n0;
        }
    }

    /* renamed from: ug0.n$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f128173q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(String str) {
            AbstractC19074t.m100208f(str, "it");
            return str + "=" + C27259n.f128166a.m139517s(str);
        }
    }

    /* renamed from: ug0.n$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f128174q = new e();

        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final C2149h0 mo205i9(List list) {
            Object m131206f0;
            AbstractC19074t.m100205c(list);
            m131206f0 = AbstractC25332a0.m131206f0(list);
            return (C2149h0) m131206f0;
        }
    }

    /* renamed from: ug0.n$f */
    /* loaded from: classes7.dex */
    public /* synthetic */ class f extends C19071q implements InterfaceC18505l {
        f(Object obj) {
            super(1, obj, C1755a0.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: h */
        public final void m139526h(C2149h0 c2149h0) {
            ((C1755a0) this.f94922q).mo9224q(c2149h0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139526h((C2149h0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ug0.n$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final g f128175q = new g();

        g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final C2149h0 mo205i9(List list) {
            Object m131206f0;
            AbstractC19074t.m100205c(list);
            m131206f0 = AbstractC25332a0.m131206f0(list);
            return (C2149h0) m131206f0;
        }
    }

    /* renamed from: ug0.n$h */
    /* loaded from: classes7.dex */
    public static final class h implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f128176p;

        h(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f128176p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f128176p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f128176p.mo205i9(obj);
        }
    }

    /* renamed from: ug0.n$i */
    /* loaded from: classes7.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f128177t;

        /* renamed from: u */
        int f128178u;

        /* renamed from: v */
        final /* synthetic */ String f128179v;

        /* renamed from: w */
        final /* synthetic */ long f128180w;

        /* renamed from: x */
        final /* synthetic */ EnumC2242k f128181x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j11, EnumC2242k enumC2242k, Continuation continuation) {
            super(2, continuation);
            this.f128179v = str;
            this.f128180w = j11;
            this.f128181x = enumC2242k;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f128179v, this.f128180w, this.f128181x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C16862b c16862b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128178u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c16862b = (C16862b) this.f128177t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = CoreUtility.f89233i;
                if (str != null && str.length() != 0) {
                    if (!C16805b.Companion.m89811a().m89807v()) {
                        C27259n.f128166a.m139503a(this.f128179v);
                        return null;
                    }
                    if (!C0860a.Companion.m2473a().m2461l()) {
                        return null;
                    }
                    C27257l c27257l = C27257l.f128129a;
                    AbstractC19074t.m100205c(str);
                    C16862b m139475f = c27257l.m139475f(str, this.f128179v);
                    this.f128177t = m139475f;
                    this.f128178u = 1;
                    Object m90049J = m139475f.m90049J(this);
                    if (m90049J == m142578e) {
                        return m142578e;
                    }
                    c16862b = m139475f;
                    obj = m90049J;
                } else {
                    C26676b.m136957g("SMLZCloudMigrationWorkerHelper", "schedule(): currentUserUid is null or empty on id=" + this.f128179v, null, 4, null);
                    return null;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                C26676b.m136957g("SMLZCloudMigrationWorkerHelper", "schedule(): Runner not available on id=" + this.f128179v, null, 4, null);
                return null;
            }
            if (!c16862b.m90053N()) {
                c16862b.m90058X();
                C28988k.f134117p.m144721u();
            } else if (!c16862b.m90050K()) {
                c16862b.m90057W();
                C28988k.f134117p.m144721u();
            }
            EnumC2254v m90047G = c16862b.m90047G();
            C2142e m11513a = new C2142e.a().m11514b(m90047G).m11515c(true).m11513a();
            C2256x.a aVar = new C2256x.a(ZaloCloudMigrationWorker.class);
            C24860q[] c24860qArr = {AbstractC24866w.m129235a("runner_id", this.f128179v)};
            C2148h.a aVar2 = new C2148h.a();
            C24860q c24860q = c24860qArr[0];
            aVar2.m11535b((String) c24860q.m129215c(), c24860q.m129216d());
            C2148h m11534a = aVar2.m11534a();
            AbstractC19074t.m100207e(m11534a, "dataBuilder.build()");
            C2256x.a aVar3 = (C2256x.a) aVar.m11873n(m11534a);
            EnumC2134a enumC2134a = EnumC2134a.LINEAR;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C2256x c2256x = (C2256x) ((C2256x.a) ((C2256x.a) ((C2256x.a) aVar3.m11868i(enumC2134a, 10000L, timeUnit)).m11869j(m11513a)).m11872m(this.f128180w, timeUnit)).m11863b();
            C26676b.m136957g("SMLZCloudMigrationWorkerHelper", "schedule(): Schedule worker on: id=" + this.f128179v + ", existingWorkPolicy=" + this.f128181x + ", requiredNetworkType=" + m90047G, null, 4, null);
            return AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).m11554f(this.f128179v, this.f128181x, c2256x);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ug0.n$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final j f128182q = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m139529a(InterfaceC2257y interfaceC2257y) {
            AbstractC19074t.m100208f(interfaceC2257y, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139529a((InterfaceC2257y) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ug0.n$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128183t;

        /* renamed from: u */
        final /* synthetic */ String f128184u;

        /* renamed from: v */
        final /* synthetic */ EnumC2242k f128185v;

        /* renamed from: w */
        final /* synthetic */ long f128186w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC18505l f128187x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, EnumC2242k enumC2242k, long j11, InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f128184u = str;
            this.f128185v = enumC2242k;
            this.f128186w = j11;
            this.f128187x = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f128184u, this.f128185v, this.f128186w, this.f128187x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128183t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C27259n c27259n = C27259n.f128166a;
                String str = this.f128184u;
                EnumC2242k enumC2242k = this.f128185v;
                long j11 = this.f128186w;
                this.f128183t = 1;
                obj = c27259n.m139514n(str, enumC2242k, j11, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC2257y interfaceC2257y = (InterfaceC2257y) obj;
            if (interfaceC2257y != null) {
                this.f128187x.mo205i9(interfaceC2257y);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    private C27259n() {
    }

    /* renamed from: g */
    private final CoroutineScope m139499g() {
        return C17933b.f90533a.m94579d();
    }

    /* renamed from: m */
    public static /* synthetic */ AbstractC2252t.a m139500m(C27259n c27259n, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c27259n.m139513l(str, z11);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m139501o(C27259n c27259n, String str, EnumC2242k enumC2242k, long j11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            enumC2242k = EnumC2242k.KEEP;
        }
        EnumC2242k enumC2242k2 = enumC2242k;
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        return c27259n.m139514n(str, enumC2242k2, j11, continuation);
    }

    /* renamed from: q */
    public static /* synthetic */ void m139502q(C27259n c27259n, String str, EnumC2242k enumC2242k, long j11, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            enumC2242k = EnumC2242k.KEEP;
        }
        EnumC2242k enumC2242k2 = enumC2242k;
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        if ((i11 & 8) != 0) {
            interfaceC18505l = j.f128182q;
        }
        c27259n.m139515p(str, enumC2242k2, j12, interfaceC18505l);
    }

    /* renamed from: a */
    public final void m139503a(String str) {
        AbstractC19074t.m100208f(str, "id");
        C26676b.m136957g("SMLZCloudMigrationWorkerHelper", "Cancel worker: id=" + str, null, 4, null);
        AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11550b(str);
    }

    /* renamed from: b */
    public final void m139504b() {
        Iterator it = C27257l.m139471d(C27257l.f128129a, null, 1, null).entrySet().iterator();
        while (it.hasNext()) {
            f128166a.m139503a((String) ((Map.Entry) it.next()).getKey());
        }
    }

    /* renamed from: c */
    public final boolean m139505c(String str) {
        Object m131206f0;
        AbstractC19074t.m100208f(str, "id");
        Object obj = AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11557j(str).get();
        AbstractC19074t.m100207e(obj, "get(...)");
        m131206f0 = AbstractC25332a0.m131206f0((List) obj);
        C2149h0 c2149h0 = (C2149h0) m131206f0;
        if (c2149h0 == null || c2149h0.m11542c() != C2149h0.c.ENQUEUED) {
            return false;
        }
        f128166a.m139503a(str);
        return true;
    }

    /* renamed from: d */
    public final void m139506d() {
        String str;
        int m131511r;
        int m131400e;
        int m116580c;
        String m127130z;
        String m131214n0;
        String m131214n02;
        String m131214n03;
        String m131214n04;
        String m127130z2;
        try {
            int m118267a = C23055e5.m118267a(MainApplication.Companion.m35500c());
            if (m118267a != 1) {
                if (m118267a != 2) {
                    if (m118267a != 3) {
                        if (m118267a != 4) {
                            if (m118267a != 5) {
                                str = "Unknown";
                            } else {
                                str = "4G";
                            }
                        } else {
                            str = "GPRS";
                        }
                    } else {
                        str = "EDGE";
                    }
                } else {
                    str = "3G";
                }
            } else {
                str = "Wifi";
            }
            List m139469a = AbstractC27256k.m139469a();
            m131511r = AbstractC25370t.m131511r(m139469a, 10);
            m131400e = AbstractC25361o0.m131400e(m131511r);
            m116580c = AbstractC22543l.m116580c(m131400e, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
            for (Object obj : m139469a) {
                linkedHashMap.put(obj, (List) AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11557j((String) obj).get());
            }
            m127130z = AbstractC24341v.m127130z("─", 19);
            m131214n0 = AbstractC25332a0.m131214n0(linkedHashMap.entrySet(), null, null, null, 0, null, a.f128167q, 31, null);
            m131214n02 = AbstractC25332a0.m131214n0(linkedHashMap.entrySet(), null, null, null, 0, null, b.f128169q, 31, null);
            m131214n03 = AbstractC25332a0.m131214n0(linkedHashMap.entrySet(), null, null, null, 0, null, c.f128171q, 31, null);
            boolean m118273h = C23055e5.m118273h(false, 1, null);
            boolean m118269d = C23055e5.m118269d();
            m131214n04 = AbstractC25332a0.m131214n0(AbstractC27256k.m139469a(), null, null, null, 0, null, d.f128173q, 31, null);
            m127130z2 = AbstractC24341v.m127130z("─", 50);
            AbstractC20110a.f98889a.m104564x("SMLZCloudMigrationWorkerHelper").mo104556o(8, m127130z + "\nworkInfos: " + m131214n0 + "\nworkerStates: " + m131214n02 + "\nworkerRunAttemptCount: " + m131214n03 + "\nisNetworkAvailable: " + m118273h + "\nisConnectedToUnmeteredNetwork: " + m118269d + "\nnetworkType: " + str + "\nrescheduleOnAppForeground: " + m131214n04 + "\n" + m127130z2, new Object[0]);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudMigrationWorkerHelper", e11);
        }
        Iterator it = C27257l.m139471d(C27257l.f128129a, null, 1, null).entrySet().iterator();
        while (it.hasNext()) {
            ((C16862b) ((Map.Entry) it.next()).getValue()).m90061v();
        }
    }

    /* renamed from: e */
    public final List m139507e() {
        List m139469a = AbstractC27256k.m139469a();
        ArrayList arrayList = new ArrayList();
        Iterator it = m139469a.iterator();
        while (it.hasNext()) {
            C2149h0.c m139511j = m139511j((String) it.next());
            if (m139511j != null) {
                arrayList.add(m139511j);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final LiveData m139508f() {
        int m131511r;
        AbstractC2151i0 m11547h = AbstractC2151i0.m11547h(MainApplication.Companion.m35500c());
        AbstractC19074t.m100207e(m11547h, "getInstance(...)");
        C1755a0 c1755a0 = new C1755a0();
        List m139469a = AbstractC27256k.m139469a();
        m131511r = AbstractC25370t.m131511r(m139469a, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m139469a.iterator();
        while (it.hasNext()) {
            LiveData mo11558k = m11547h.mo11558k((String) it.next());
            AbstractC19074t.m100207e(mo11558k, "getWorkInfosForUniqueWorkLiveData(...)");
            arrayList.add(AbstractC1794s0.m9365b(mo11558k, e.f128174q));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c1755a0.m9256r((LiveData) it2.next(), new h(new f(c1755a0)));
        }
        return c1755a0;
    }

    /* renamed from: h */
    public final C2149h0 m139509h(String str) {
        Object m131206f0;
        AbstractC19074t.m100208f(str, "id");
        Object obj = AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11557j(str).get();
        AbstractC19074t.m100207e(obj, "get(...)");
        m131206f0 = AbstractC25332a0.m131206f0((List) obj);
        return (C2149h0) m131206f0;
    }

    /* renamed from: i */
    public final LiveData m139510i(String str) {
        AbstractC19074t.m100208f(str, "id");
        LiveData mo11558k = AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11558k(str);
        AbstractC19074t.m100207e(mo11558k, "getWorkInfosForUniqueWorkLiveData(...)");
        return AbstractC1794s0.m9365b(mo11558k, g.f128175q);
    }

    /* renamed from: j */
    public final C2149h0.c m139511j(String str) {
        AbstractC19074t.m100208f(str, "id");
        C2149h0 m139509h = m139509h(str);
        if (m139509h != null) {
            return m139509h.m11542c();
        }
        return null;
    }

    /* renamed from: k */
    public final boolean m139512k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* renamed from: l */
    public final AbstractC2252t.a m139513l(String str, boolean z11) {
        AbstractC2252t.a m11889a;
        AbstractC19074t.m100208f(str, "id");
        C26676b.m136957g("SMLZCloudMigrationWorkerHelper", "retryOrFailureIfAppInBackground(): id=" + str + ", isRetryBackoffEnabled=" + z11, null, 4, null);
        if (!AbstractC21289a.Companion.m110248b().get() && m139512k()) {
            m139505c(str);
            m139516r(str, true);
            AbstractC2252t.a m11889a2 = AbstractC2252t.a.m11889a();
            AbstractC19074t.m100205c(m11889a2);
            return m11889a2;
        }
        if (z11) {
            m11889a = AbstractC2252t.a.m11890b();
        } else {
            m139502q(this, str, EnumC2242k.REPLACE, 0L, null, 12, null);
            m11889a = AbstractC2252t.a.m11889a();
        }
        AbstractC19074t.m100205c(m11889a);
        return m11889a;
    }

    /* renamed from: n */
    public final Object m139514n(String str, EnumC2242k enumC2242k, long j11, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new i(str, j11, enumC2242k, null), continuation);
    }

    /* renamed from: p */
    public final void m139515p(String str, EnumC2242k enumC2242k, long j11, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(enumC2242k, "existingWorkPolicy");
        AbstractC19074t.m100208f(interfaceC18505l, "onScheduled");
        BuildersKt__Builders_commonKt.m112540d(m139499g(), null, null, new k(str, enumC2242k, j11, interfaceC18505l, null), 3, null);
    }

    /* renamed from: r */
    public final void m139516r(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "id");
        C26676b.m136957g("SMLZCloudMigrationWorkerHelper", "setRescheduleOnAppForeground(): id=" + str + ", rescheduled=" + z11, null, 4, null);
        if (AbstractC19074t.m100204b(str, "my_cloud_migration")) {
            AbstractC0924m0.m3266Mq(z11);
        } else if (AbstractC19074t.m100204b(str, "cloud_media_migration")) {
            AbstractC0924m0.m3208Kq(z11);
        }
    }

    /* renamed from: s */
    public final boolean m139517s(String str) {
        AbstractC19074t.m100208f(str, "id");
        if (AbstractC19074t.m100204b(str, "my_cloud_migration")) {
            return AbstractC0924m0.m3542Wc();
        }
        if (AbstractC19074t.m100204b(str, "cloud_media_migration")) {
            return AbstractC0924m0.m3513Vc();
        }
        return false;
    }
}
