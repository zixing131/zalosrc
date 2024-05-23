package ug0;

import ah0.C0860a;
import androidx.work.C2149h0;
import androidx.work.InterfaceC2257y;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.migration.C16862b;
import com.zing.zalocore.CoreUtility;
import dh0.C17933b;
import en0.InterfaceC18509p;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: ug0.j */
/* loaded from: classes7.dex */
public final class C27255j {

    /* renamed from: a */
    public static final C27255j f128107a = new C27255j();

    /* renamed from: b */
    private static final C2149h0.c[] f128108b = {C2149h0.c.ENQUEUED, C2149h0.c.RUNNING, C2149h0.c.SUCCEEDED};

    /* renamed from: c */
    private static final CoroutineDispatcher f128109c = Dispatchers.m112680b();

    /* renamed from: d */
    private static Job f128110d;

    /* renamed from: ug0.j$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f128111t;

        /* renamed from: u */
        Object f128112u;

        /* renamed from: v */
        Object f128113v;

        /* renamed from: w */
        Object f128114w;

        /* renamed from: x */
        int f128115x;

        /* renamed from: y */
        final /* synthetic */ long f128116y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, Continuation continuation) {
            super(2, continuation);
            this.f128116y = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f128116y, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009d -> B:6:0x00a1). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Iterator it;
            String str;
            a aVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128115x;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        String str2 = (String) this.f128113v;
                        it = (Iterator) this.f128112u;
                        str = (String) this.f128111t;
                        AbstractC24862s.m129228b(obj);
                        String str3 = str2;
                        Object obj2 = m142578e;
                        a aVar2 = this;
                        if (((Boolean) obj).booleanValue()) {
                            C26676b.m136952b("SMLZCloudMigrationResumer", str + "(): Not available on id=" + str3);
                        } else {
                            C27259n c27259n = C27259n.f128166a;
                            if (c27259n.m139512k() && c27259n.m139505c(str3)) {
                                C26676b.m136957g("SMLZCloudMigrationResumer", "checkResumeOnAppEnterBackground(): Cancel current enqueued worker and reschedule when app foreground on id=" + str3, null, 4, null);
                                c27259n.m139516r(str3, true);
                            }
                        }
                        aVar = aVar2;
                        m142578e = obj2;
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            str3 = (String) entry.getKey();
                            C16862b c16862b = (C16862b) entry.getValue();
                            aVar.f128111t = str;
                            aVar.f128112u = it;
                            aVar.f128113v = str3;
                            aVar.f128114w = c16862b;
                            aVar.f128115x = 2;
                            Object m90049J = c16862b.m90049J(aVar);
                            if (m90049J == m142578e) {
                                return m142578e;
                            }
                            Object obj3 = m142578e;
                            aVar2 = aVar;
                            obj = m90049J;
                            obj2 = obj3;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            aVar = aVar2;
                            m142578e = obj2;
                            if (it.hasNext()) {
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                long j11 = this.f128116y;
                this.f128115x = 1;
                if (DelayKt.m112666b(j11, this) == m142578e) {
                    return m142578e;
                }
            }
            if (!C27255j.f128107a.m139462h()) {
                C26676b.m136952b("SMLZCloudMigrationResumer", "checkResumeOnAppEnterBackground(): Not available");
                return C24848g0.f119245a;
            }
            it = C27257l.m139471d(C27257l.f128129a, null, 1, null).entrySet().iterator();
            str = "checkResumeOnAppEnterBackground";
            aVar = this;
            if (it.hasNext()) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ug0.j$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f128117t;

        /* renamed from: u */
        Object f128118u;

        /* renamed from: v */
        Object f128119v;

        /* renamed from: w */
        Object f128120w;

        /* renamed from: x */
        int f128121x;

        /* renamed from: y */
        final /* synthetic */ long f128122y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, Continuation continuation) {
            super(2, continuation);
            this.f128122y = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f128122y, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x01e7, code lost:            r2 = r10;        r6 = r11;        r10 = r12;     */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0195  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00fd -> B:11:0x00c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01de -> B:9:0x01df). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01e5 -> B:10:0x01e7). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            Iterator it;
            b bVar;
            String str2;
            Object obj2;
            String str3;
            b bVar2;
            C16862b c16862b;
            C2149h0.c cVar;
            String str4;
            b bVar3;
            Iterator it2;
            Object obj3;
            String str5;
            Object obj4;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128121x;
            int i12 = 3;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    it = (Iterator) this.f128118u;
                                    String str6 = (String) this.f128117t;
                                    AbstractC24862s.m129228b(obj);
                                    bVar2 = this;
                                    b bVar4 = bVar2;
                                    str = str6;
                                    bVar = bVar4;
                                    i12 = 3;
                                    if (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        String str7 = (String) entry.getKey();
                                        C16862b c16862b2 = (C16862b) entry.getValue();
                                        bVar.f128117t = str;
                                        bVar.f128118u = it;
                                        bVar.f128119v = str7;
                                        bVar.f128120w = c16862b2;
                                        bVar.f128121x = 2;
                                        obj4 = c16862b2.m90049J(bVar);
                                        if (obj4 == m142578e) {
                                            return m142578e;
                                        }
                                        String str8 = str;
                                        it2 = it;
                                        str5 = str7;
                                        str4 = str8;
                                        bVar3 = bVar;
                                        c16862b = c16862b2;
                                        if (((Boolean) obj4).booleanValue()) {
                                            C26676b.m136952b("SMLZCloudMigrationResumer", str4 + "(): Not available on id=" + str5);
                                            it = it2;
                                            bVar = bVar3;
                                            str = str4;
                                            if (it.hasNext()) {
                                            }
                                        } else {
                                            C27259n c27259n = C27259n.f128166a;
                                            if (c27259n.m139517s(str5)) {
                                                C26676b.m136957g("SMLZCloudMigrationResumer", "checkResumeOnAppEnterForeground(): Reschedule worker on id=" + str5, null, 4, null);
                                                bVar3.f128117t = str4;
                                                bVar3.f128118u = it2;
                                                bVar3.f128119v = str5;
                                                bVar3.f128120w = null;
                                                bVar3.f128121x = i12;
                                                obj3 = C27259n.m139501o(c27259n, str5, null, 500L, bVar3, 2, null);
                                                if (obj3 == m142578e) {
                                                    return m142578e;
                                                }
                                                if (((InterfaceC2257y) obj3) != null) {
                                                    C27259n.f128166a.m139516r(str5, false);
                                                }
                                                it = it2;
                                                bVar = bVar3;
                                                str = str4;
                                                i12 = 3;
                                                if (it.hasNext()) {
                                                }
                                            } else {
                                                bVar3.f128117t = str4;
                                                bVar3.f128118u = it2;
                                                bVar3.f128119v = c16862b;
                                                bVar3.f128120w = str5;
                                                bVar3.f128121x = 4;
                                                obj2 = c16862b.m90055S(bVar3);
                                                if (obj2 == m142578e) {
                                                    return m142578e;
                                                }
                                                str2 = str5;
                                                it = it2;
                                                bVar2 = bVar3;
                                                str3 = str4;
                                                if (((Boolean) obj2).booleanValue() && !c16862b.m90051L()) {
                                                    if (!C16805b.Companion.m89811a().m89807v()) {
                                                        C27259n.f128166a.m139503a(str2);
                                                    } else {
                                                        C27259n c27259n2 = C27259n.f128166a;
                                                        C2149h0 m139509h = c27259n2.m139509h(str2);
                                                        if (m139509h != null) {
                                                            cVar = m139509h.m11542c();
                                                        } else {
                                                            cVar = null;
                                                        }
                                                        C26676b.m136957g("SMLZCloudMigrationResumer", "checkResumeOnAppEnterForeground(): Checking worker state to restart if needed, state=" + cVar, null, 4, null);
                                                        if (m139509h == null || m139509h.m11542c().m11545c()) {
                                                            bVar2.f128117t = str3;
                                                            bVar2.f128118u = it;
                                                            bVar2.f128119v = null;
                                                            bVar2.f128120w = null;
                                                            bVar2.f128121x = 5;
                                                            if (C27259n.m139501o(c27259n2, str2, null, 500L, bVar2, 2, null) == m142578e) {
                                                                return m142578e;
                                                            }
                                                            str6 = str3;
                                                            b bVar42 = bVar2;
                                                            str = str6;
                                                            bVar = bVar42;
                                                            i12 = 3;
                                                            if (it.hasNext()) {
                                                            }
                                                        }
                                                    }
                                                }
                                                bVar = bVar2;
                                                str = str3;
                                                i12 = 3;
                                                if (it.hasNext()) {
                                                }
                                            }
                                        }
                                    }
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str9 = (String) this.f128120w;
                            c16862b = (C16862b) this.f128119v;
                            Iterator it3 = (Iterator) this.f128118u;
                            str3 = (String) this.f128117t;
                            AbstractC24862s.m129228b(obj);
                            obj2 = obj;
                            str2 = str9;
                            it = it3;
                            bVar2 = this;
                            if (((Boolean) obj2).booleanValue()) {
                                if (!C16805b.Companion.m89811a().m89807v()) {
                                }
                            }
                            bVar = bVar2;
                            str = str3;
                            i12 = 3;
                            if (it.hasNext()) {
                            }
                            return C24848g0.f119245a;
                        }
                        str5 = (String) this.f128119v;
                        Iterator it4 = (Iterator) this.f128118u;
                        String str10 = (String) this.f128117t;
                        AbstractC24862s.m129228b(obj);
                        bVar3 = this;
                        str4 = str10;
                        it2 = it4;
                        obj3 = obj;
                        if (((InterfaceC2257y) obj3) != null) {
                        }
                        it = it2;
                        bVar = bVar3;
                        str = str4;
                        i12 = 3;
                        if (it.hasNext()) {
                        }
                        return C24848g0.f119245a;
                    }
                    C16862b c16862b3 = (C16862b) this.f128120w;
                    String str11 = (String) this.f128119v;
                    it2 = (Iterator) this.f128118u;
                    String str12 = (String) this.f128117t;
                    AbstractC24862s.m129228b(obj);
                    obj4 = obj;
                    str4 = str12;
                    bVar3 = this;
                    c16862b = c16862b3;
                    str5 = str11;
                    if (((Boolean) obj4).booleanValue()) {
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                }
            } else {
                AbstractC24862s.m129228b(obj);
                long j11 = this.f128122y;
                this.f128121x = 1;
                if (DelayKt.m112666b(j11, this) == m142578e) {
                    return m142578e;
                }
            }
            str = "checkResumeOnAppEnterForeground";
            if (!C27255j.f128107a.m139462h()) {
                C26676b.m136952b("SMLZCloudMigrationResumer", "checkResumeOnAppEnterForeground(): Not available");
                return C24848g0.f119245a;
            }
            it = C27257l.m139471d(C27257l.f128129a, null, 1, null).entrySet().iterator();
            bVar = this;
            if (it.hasNext()) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.j$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f128123t;

        /* renamed from: u */
        Object f128124u;

        /* renamed from: v */
        Object f128125v;

        /* renamed from: w */
        Object f128126w;

        /* renamed from: x */
        int f128127x;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ce -> B:9:0x0095). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0108 -> B:8:0x0149). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0147 -> B:7:0x0148). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Iterator it;
            String str;
            c cVar;
            String str2;
            Object obj2;
            c cVar2;
            C16862b c16862b;
            Iterator it2;
            Object obj3;
            String str3;
            Iterator it3;
            C16862b c16862b2;
            c cVar3;
            String str4;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128127x;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            it2 = (Iterator) this.f128124u;
                            String str5 = (String) this.f128123t;
                            AbstractC24862s.m129228b(obj);
                            cVar2 = this;
                            str = str5;
                            c cVar4 = cVar2;
                            it = it2;
                            cVar = cVar4;
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                String str6 = (String) entry.getKey();
                                C16862b c16862b3 = (C16862b) entry.getValue();
                                cVar.f128123t = str;
                                cVar.f128124u = it;
                                cVar.f128125v = str6;
                                cVar.f128126w = c16862b3;
                                cVar.f128127x = 1;
                                obj3 = c16862b3.m90049J(cVar);
                                if (obj3 == m142578e) {
                                    return m142578e;
                                }
                                cVar3 = cVar;
                                str4 = str6;
                                str3 = str;
                                it3 = it;
                                c16862b2 = c16862b3;
                                if (((Boolean) obj3).booleanValue()) {
                                    C26676b.m136952b("SMLZCloudMigrationResumer", str3 + "(): Not available on id=" + str4);
                                    cVar = cVar3;
                                    it = it3;
                                    str = str3;
                                    if (it.hasNext()) {
                                    }
                                } else {
                                    cVar3.f128123t = str3;
                                    cVar3.f128124u = it3;
                                    cVar3.f128125v = c16862b2;
                                    cVar3.f128126w = str4;
                                    cVar3.f128127x = 2;
                                    obj2 = c16862b2.m90055S(cVar3);
                                    if (obj2 == m142578e) {
                                        return m142578e;
                                    }
                                    str2 = str4;
                                    it2 = it3;
                                    str = str3;
                                    C16862b c16862b4 = c16862b2;
                                    cVar2 = cVar3;
                                    c16862b = c16862b4;
                                    if (((Boolean) obj2).booleanValue()) {
                                        C26676b.m136957g("SMLZCloudMigrationResumer", "checkResumeOnPostLogin(): Re-run last worker on id=" + str2 + ", lastState=" + c16862b.m90046F(), null, 4, null);
                                        C27259n c27259n = C27259n.f128166a;
                                        cVar2.f128123t = str;
                                        cVar2.f128124u = it2;
                                        cVar2.f128125v = null;
                                        cVar2.f128126w = null;
                                        cVar2.f128127x = 3;
                                        if (C27259n.m139501o(c27259n, str2, null, 0L, cVar2, 6, null) == m142578e) {
                                            return m142578e;
                                        }
                                        str5 = str;
                                        str = str5;
                                    }
                                    c cVar42 = cVar2;
                                    it = it2;
                                    cVar = cVar42;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str7 = (String) this.f128126w;
                    c16862b = (C16862b) this.f128125v;
                    Iterator it4 = (Iterator) this.f128124u;
                    str = (String) this.f128123t;
                    AbstractC24862s.m129228b(obj);
                    obj2 = obj;
                    str2 = str7;
                    it2 = it4;
                    cVar2 = this;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                    c cVar422 = cVar2;
                    it = it2;
                    cVar = cVar422;
                    if (it.hasNext()) {
                    }
                    return C24848g0.f119245a;
                }
                C16862b c16862b5 = (C16862b) this.f128126w;
                String str8 = (String) this.f128125v;
                Iterator it5 = (Iterator) this.f128124u;
                String str9 = (String) this.f128123t;
                AbstractC24862s.m129228b(obj);
                obj3 = obj;
                str3 = str9;
                it3 = it5;
                c16862b2 = c16862b5;
                str4 = str8;
                cVar3 = this;
                if (((Boolean) obj3).booleanValue()) {
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (!C27255j.f128107a.m139462h()) {
                    C26676b.m136952b("SMLZCloudMigrationResumer", "checkResumeOnPostLogin(): Not available");
                    return C24848g0.f119245a;
                }
                it = C27257l.m139471d(C27257l.f128129a, null, 1, null).entrySet().iterator();
                str = "checkResumeOnPostLogin";
                cVar = this;
                if (it.hasNext()) {
                }
                return C24848g0.f119245a;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    private C27255j() {
    }

    /* renamed from: c */
    public static /* synthetic */ void m139459c(C27255j c27255j, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        c27255j.m139463b(j11);
    }

    /* renamed from: e */
    public static /* synthetic */ void m139460e(C27255j c27255j, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        c27255j.m139464d(j11);
    }

    /* renamed from: g */
    private final CoroutineScope m139461g() {
        return C17933b.f90533a.m94579d();
    }

    /* renamed from: h */
    public final boolean m139462h() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            if (!C0860a.Companion.m2473a().m2461l()) {
                return false;
            }
            return true;
        }
        C26676b.m136957g("SMLZCloudMigrationResumer", "schedule(): currentUserUid is null or empty", null, 4, null);
        return false;
    }

    /* renamed from: b */
    public final void m139463b(long j11) {
        Job m112540d;
        Job job = f128110d;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(m139461g(), f128109c, null, new a(j11, null), 2, null);
        f128110d = m112540d;
    }

    /* renamed from: d */
    public final void m139464d(long j11) {
        Job m112540d;
        Job job = f128110d;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(m139461g(), f128109c, null, new b(j11, null), 2, null);
        f128110d = m112540d;
    }

    /* renamed from: f */
    public final void m139465f() {
        BuildersKt__Builders_commonKt.m112540d(m139461g(), f128109c, null, new c(null), 2, null);
    }
}
