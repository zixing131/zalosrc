package com.zing.zalo.zalocloud.migration;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.CoroutineWorker;
import androidx.work.EnumC2254v;
import androidx.work.WorkerParameters;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import tg0.C26676b;
import ug0.C27257l;
import ug0.C27259n;
import ug0.EnumC27248c;
import vm0.AbstractC28298d;
import wg0.C28988k;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* loaded from: classes7.dex */
public final class ZaloCloudMigrationWorker extends CoroutineWorker {
    public static final C16856a Companion = new C16856a(null);

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationWorker$a */
    /* loaded from: classes7.dex */
    public static final class C16856a {
        private C16856a() {
        }

        public /* synthetic */ C16856a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationWorker$b */
    /* loaded from: classes7.dex */
    public static final class C16857b extends AbstractC29096d {

        /* renamed from: s */
        Object f85707s;

        /* renamed from: t */
        Object f85708t;

        /* renamed from: u */
        Object f85709u;

        /* renamed from: v */
        /* synthetic */ Object f85710v;

        /* renamed from: x */
        int f85712x;

        C16857b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85710v = obj;
            this.f85712x |= Integer.MIN_VALUE;
            return ZaloCloudMigrationWorker.this.mo11443d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationWorker$c */
    /* loaded from: classes7.dex */
    public static final class C16858c extends AbstractC29096d {

        /* renamed from: s */
        Object f85713s;

        /* renamed from: t */
        Object f85714t;

        /* renamed from: u */
        Object f85715u;

        /* renamed from: v */
        /* synthetic */ Object f85716v;

        /* renamed from: x */
        int f85718x;

        C16858c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85716v = obj;
            this.f85718x |= Integer.MIN_VALUE;
            return ZaloCloudMigrationWorker.this.m89996l(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationWorker$d */
    /* loaded from: classes7.dex */
    public static final class C16859d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85719t;

        /* renamed from: u */
        final /* synthetic */ C16862b f85720u;

        /* renamed from: v */
        final /* synthetic */ ZaloCloudMigrationWorker f85721v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationWorker$d$a */
        /* loaded from: classes7.dex */
        public /* synthetic */ class a implements FlowCollector, InterfaceC19066n {

            /* renamed from: p */
            final /* synthetic */ ZaloCloudMigrationWorker f85722p;

            a(ZaloCloudMigrationWorker zaloCloudMigrationWorker) {
                this.f85722p = zaloCloudMigrationWorker;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC16864d abstractC16864d, Continuation continuation) {
                Object m142578e;
                Object m89998n = this.f85722p.m89998n(abstractC16864d, continuation);
                m142578e = AbstractC28298d.m142578e();
                if (m89998n == m142578e) {
                    return m89998n;
                }
                return C24848g0.f119245a;
            }

            @Override // fn0.InterfaceC19066n
            /* renamed from: c */
            public final InterfaceC24847g mo9368c() {
                return new C19071q(2, this.f85722p, ZaloCloudMigrationWorker.class, "updateForeground", "updateForeground(Lcom/zing/zalo/zalocloud/migration/ZaloCloudMigrationState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof InterfaceC19066n)) {
                    return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
                }
                return false;
            }

            public final int hashCode() {
                return mo9368c().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16859d(C16862b c16862b, ZaloCloudMigrationWorker zaloCloudMigrationWorker, Continuation continuation) {
            super(2, continuation);
            this.f85720u = c16862b;
            this.f85721v = zaloCloudMigrationWorker;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16859d(this.f85720u, this.f85721v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            boolean z11;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85719t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (this.f85720u.m90051L() && this.f85720u.m90052M()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C16862b c16862b = this.f85720u;
                a aVar = new a(this.f85721v);
                this.f85719t = 1;
                if (c16862b.m90056T(z11, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16859d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationWorker$e */
    /* loaded from: classes7.dex */
    public static final class C16860e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85723t;

        /* renamed from: u */
        final /* synthetic */ AbstractC16864d f85724u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16860e(AbstractC16864d abstractC16864d, Continuation continuation) {
            super(2, continuation);
            this.f85724u = abstractC16864d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16860e(this.f85724u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f85723t == 0) {
                AbstractC24862s.m129228b(obj);
                if (!(this.f85724u instanceof AbstractC16864d.f)) {
                    return C24848g0.f119245a;
                }
                C28988k.f134117p.m144721u();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16860e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZaloCloudMigrationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "appContext");
        AbstractC19074t.m100208f(workerParameters, "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89996l(String str, C16862b c16862b, Continuation continuation) {
        C16858c c16858c;
        Object m142578e;
        int i11;
        ZaloCloudMigrationWorker zaloCloudMigrationWorker;
        CoroutineDispatcher m112680b;
        C16859d c16859d;
        String str2;
        C16862b c16862b2;
        AbstractC16864d m90044D;
        if (continuation instanceof C16858c) {
            c16858c = (C16858c) continuation;
            int i12 = c16858c.f85718x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16858c.f85718x = i12 - Integer.MIN_VALUE;
                Object obj = c16858c.f85716v;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16858c.f85718x;
                boolean z11 = true;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c16862b2 = (C16862b) c16858c.f85714t;
                            str2 = (String) c16858c.f85713s;
                            AbstractC24862s.m129228b(obj);
                            m90044D = c16862b2.m90044D();
                            C26676b.m136957g("SMLZCloudMigrationWorker", "[" + str2 + "] Migration done with state: " + c16862b2.m90046F(), null, 4, null);
                            if (!(m90044D instanceof AbstractC16864d.j)) {
                                AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
                                AbstractC19074t.m100205c(m11891c);
                                return m11891c;
                            }
                            if (m90044D instanceof AbstractC16864d.e) {
                                AbstractC16864d.e eVar = (AbstractC16864d.e) m90044D;
                                if (eVar.m90094l() != EnumC27248c.f128036q && !eVar.m90092j()) {
                                    AbstractC2252t.a m11889a = AbstractC2252t.a.m11889a();
                                    AbstractC19074t.m100205c(m11889a);
                                    return m11889a;
                                }
                                return C27259n.m139500m(C27259n.f128166a, str2, false, 2, null);
                            }
                            if (m90044D instanceof AbstractC16864d.g) {
                                if (((AbstractC16864d.g) m90044D).m90097j()) {
                                    return C27259n.m139500m(C27259n.f128166a, str2, false, 2, null);
                                }
                                AbstractC2252t.a m11889a2 = AbstractC2252t.a.m11889a();
                                AbstractC19074t.m100205c(m11889a2);
                                return m11889a2;
                            }
                            if ((m90044D instanceof AbstractC16864d.f) && ((AbstractC16864d.f) m90044D).m90096k()) {
                                z11 = false;
                            }
                            return C27259n.f128166a.m139513l(str2, z11);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c16862b = (C16862b) c16858c.f85715u;
                    str = (String) c16858c.f85714t;
                    zaloCloudMigrationWorker = (ZaloCloudMigrationWorker) c16858c.f85713s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136957g("SMLZCloudMigrationWorker", "[" + str + "] Start migration worker with inputData=" + getInputData() + ", lastState=" + c16862b.m90046F(), null, 4, null);
                    AbstractC16864d m90044D2 = c16862b.m90044D();
                    c16858c.f85713s = this;
                    c16858c.f85714t = str;
                    c16858c.f85715u = c16862b;
                    c16858c.f85718x = 1;
                    if (m89998n(m90044D2, c16858c) == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationWorker = this;
                }
                m112680b = Dispatchers.m112680b();
                c16859d = new C16859d(c16862b, zaloCloudMigrationWorker, null);
                c16858c.f85713s = str;
                c16858c.f85714t = c16862b;
                c16858c.f85715u = null;
                c16858c.f85718x = 2;
                if (BuildersKt.m112534g(m112680b, c16859d, c16858c) != m142578e) {
                    return m142578e;
                }
                C16862b c16862b3 = c16862b;
                str2 = str;
                c16862b2 = c16862b3;
                m90044D = c16862b2.m90044D();
                C26676b.m136957g("SMLZCloudMigrationWorker", "[" + str2 + "] Migration done with state: " + c16862b2.m90046F(), null, 4, null);
                if (!(m90044D instanceof AbstractC16864d.j)) {
                }
            }
        }
        c16858c = new C16858c(continuation);
        Object obj2 = c16858c.f85716v;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16858c.f85718x;
        boolean z112 = true;
        if (i11 == 0) {
        }
        m112680b = Dispatchers.m112680b();
        c16859d = new C16859d(c16862b, zaloCloudMigrationWorker, null);
        c16858c.f85713s = str;
        c16858c.f85714t = c16862b;
        c16858c.f85715u = null;
        c16858c.f85718x = 2;
        if (BuildersKt.m112534g(m112680b, c16859d, c16858c) != m142578e) {
        }
    }

    /* renamed from: m */
    private final C16862b m89997m(String str, String str2) {
        return C27257l.f128129a.m139475f(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final Object m89998n(AbstractC16864d abstractC16864d, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new C16860e(abstractC16864d, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0140 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:13:0x003d, B:14:0x00b8, B:31:0x00e5, B:21:0x00f4, B:23:0x0140, B:25:0x017d, B:27:0x015c, B:29:0x0162), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015c A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:13:0x003d, B:14:0x00b8, B:31:0x00e5, B:21:0x00f4, B:23:0x0140, B:25:0x017d, B:27:0x015c, B:29:0x0162), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.zing.zalo.zalocloud.migration.ZaloCloudMigrationWorker$b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11443d(Continuation continuation) {
        String str;
        Object obj;
        C16862b m142578e;
        int i11;
        ZaloCloudMigrationWorker zaloCloudMigrationWorker;
        String str2;
        C16862b c16862b;
        C16862b c16862b2;
        String str3;
        AbstractC2252t.a m139500m;
        StringBuilder sb2;
        try {
            if (continuation instanceof C16857b) {
                C16857b c16857b = (C16857b) continuation;
                int i12 = c16857b.f85712x;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    c16857b.f85712x = i12 - Integer.MIN_VALUE;
                    str = c16857b;
                    obj = str.f85710v;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = str.f85712x;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                c16862b2 = (C16862b) str.f85708t;
                                str3 = (String) str.f85707s;
                                try {
                                    AbstractC24862s.m129228b(obj);
                                    m139500m = (AbstractC2252t.a) obj;
                                    sb2 = new StringBuilder();
                                } catch (CancellationException unused) {
                                    EnumC2254v m90047G = c16862b2.m90047G();
                                    String m90046F = c16862b2.m90046F();
                                    boolean z11 = CoreUtility.f89235k.get();
                                    C27259n c27259n = C27259n.f128166a;
                                    C26676b.m136957g("SMLZCloudMigrationWorker", "[" + str3 + "] onCancelled(): requiredNetworkType=" + m90047G + ", lastState=" + m90046F + ", isAppInBG=" + z11 + ", isBackgroundStartRestrictionVersion=" + c27259n.m139512k(), null, 4, null);
                                    if (c16862b2.m90053N()) {
                                    }
                                    m139500m = C27259n.m139500m(c27259n, str3, false, 2, null);
                                    sb2 = new StringBuilder();
                                    sb2.append("[");
                                    sb2.append(str3);
                                    sb2.append("] Migration worker completed");
                                    C26676b.m136952b("SMLZCloudMigrationWorker", sb2.toString());
                                    c16862b2.m90054P();
                                    C28988k.f134117p.m144721u();
                                    return m139500m;
                                } catch (Exception e11) {
                                    e = e11;
                                    C26676b.m136954d("SMLZCloudMigrationWorker", e);
                                    m139500m = C27259n.m139500m(C27259n.f128166a, str3, false, 2, null);
                                    sb2 = new StringBuilder();
                                    sb2.append("[");
                                    sb2.append(str3);
                                    sb2.append("] Migration worker completed");
                                    C26676b.m136952b("SMLZCloudMigrationWorker", sb2.toString());
                                    c16862b2.m90054P();
                                    C28988k.f134117p.m144721u();
                                    return m139500m;
                                }
                                sb2.append("[");
                                sb2.append(str3);
                                sb2.append("] Migration worker completed");
                                C26676b.m136952b("SMLZCloudMigrationWorker", sb2.toString());
                                c16862b2.m90054P();
                                C28988k.f134117p.m144721u();
                                return m139500m;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C16862b c16862b3 = (C16862b) str.f85709u;
                        str2 = (String) str.f85708t;
                        ZaloCloudMigrationWorker zaloCloudMigrationWorker2 = (ZaloCloudMigrationWorker) str.f85707s;
                        AbstractC24862s.m129228b(obj);
                        c16862b = c16862b3;
                        zaloCloudMigrationWorker = zaloCloudMigrationWorker2;
                    } else {
                        AbstractC24862s.m129228b(obj);
                        String m11532j = getInputData().m11532j("runner_id");
                        if (m11532j != null && m11532j.length() != 0) {
                            String str4 = CoreUtility.f89233i;
                            if (str4 != null && str4.length() != 0) {
                                AbstractC19074t.m100205c(str4);
                                C16862b m89997m = m89997m(str4, m11532j);
                                str.f85707s = this;
                                str.f85708t = m11532j;
                                str.f85709u = m89997m;
                                str.f85712x = 1;
                                Object m90049J = m89997m.m90049J(str);
                                if (m90049J == m142578e) {
                                    return m142578e;
                                }
                                zaloCloudMigrationWorker = this;
                                str2 = m11532j;
                                obj = m90049J;
                                c16862b = m89997m;
                            } else {
                                C26676b.m136957g("SMLZCloudMigrationWorker", "[" + m11532j + "] currentUserUid is null or empty", null, 4, null);
                                return C27259n.m139500m(C27259n.f128166a, m11532j, false, 2, null);
                            }
                        } else {
                            C26676b.m136957g("SMLZCloudMigrationWorker", "[" + m11532j + "] runnerId is null or empty", null, 4, null);
                            AbstractC2252t.a m11889a = AbstractC2252t.a.m11889a();
                            AbstractC19074t.m100207e(m11889a, "failure(...)");
                            return m11889a;
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        try {
                            str.f85707s = str2;
                            str.f85708t = c16862b;
                            str.f85709u = null;
                            str.f85712x = 2;
                            obj = zaloCloudMigrationWorker.m89996l(str2, c16862b, str);
                        } catch (CancellationException unused2) {
                            c16862b2 = c16862b;
                            str3 = str2;
                            EnumC2254v m90047G2 = c16862b2.m90047G();
                            String m90046F2 = c16862b2.m90046F();
                            boolean z112 = CoreUtility.f89235k.get();
                            C27259n c27259n2 = C27259n.f128166a;
                            C26676b.m136957g("SMLZCloudMigrationWorker", "[" + str3 + "] onCancelled(): requiredNetworkType=" + m90047G2 + ", lastState=" + m90046F2 + ", isAppInBG=" + z112 + ", isBackgroundStartRestrictionVersion=" + c27259n2.m139512k(), null, 4, null);
                            if (c16862b2.m90053N()) {
                                C26676b.m136957g("SMLZCloudMigrationWorker", "[" + str3 + "] Network is not satisfied", null, 4, null);
                                c16862b2.m90058X();
                            } else if (!c16862b2.m90050K()) {
                                C26676b.m136957g("SMLZCloudMigrationWorker", "[" + str3 + "] Battery level is low", null, 4, null);
                                c16862b2.m90057W();
                            }
                            m139500m = C27259n.m139500m(c27259n2, str3, false, 2, null);
                            sb2 = new StringBuilder();
                            sb2.append("[");
                            sb2.append(str3);
                            sb2.append("] Migration worker completed");
                            C26676b.m136952b("SMLZCloudMigrationWorker", sb2.toString());
                            c16862b2.m90054P();
                            C28988k.f134117p.m144721u();
                            return m139500m;
                        } catch (Exception e12) {
                            e = e12;
                            c16862b2 = c16862b;
                            str3 = str2;
                            C26676b.m136954d("SMLZCloudMigrationWorker", e);
                            m139500m = C27259n.m139500m(C27259n.f128166a, str3, false, 2, null);
                            sb2 = new StringBuilder();
                            sb2.append("[");
                            sb2.append(str3);
                            sb2.append("] Migration worker completed");
                            C26676b.m136952b("SMLZCloudMigrationWorker", sb2.toString());
                            c16862b2.m90054P();
                            C28988k.f134117p.m144721u();
                            return m139500m;
                        } catch (Throwable th2) {
                            th = th2;
                            m142578e = c16862b;
                            str = str2;
                            C26676b.m136952b("SMLZCloudMigrationWorker", "[" + str + "] Migration worker completed");
                            m142578e.m90054P();
                            C28988k.f134117p.m144721u();
                            throw th;
                        }
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c16862b2 = c16862b;
                        str3 = str2;
                        m139500m = (AbstractC2252t.a) obj;
                        sb2 = new StringBuilder();
                        sb2.append("[");
                        sb2.append(str3);
                        sb2.append("] Migration worker completed");
                        C26676b.m136952b("SMLZCloudMigrationWorker", sb2.toString());
                        c16862b2.m90054P();
                        C28988k.f134117p.m144721u();
                        return m139500m;
                    }
                    AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
                    AbstractC19074t.m100207e(m11891c, "success(...)");
                    return m11891c;
                }
            }
            if (i11 == 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        str = new C16857b(continuation);
        obj = str.f85710v;
        m142578e = AbstractC28298d.m142578e();
        i11 = str.f85712x;
    }
}
