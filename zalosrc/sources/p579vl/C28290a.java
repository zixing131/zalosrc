package p579vl;

import ah0.C0860a;
import am.AbstractC0924m0;
import ch0.AbstractC3488c;
import com.zing.zalo.data.zalocloud.model.api.EncryptInfo;
import com.zing.zalo.data.zalocloud.model.api.MediaExtEncryptInfo;
import com.zing.zalo.data.zalocloud.model.api.SubmitE2EEInfoParams;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.configs.ReSyncE2EEInfoConfig;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import dh0.C17933b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nl.C23870a;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p487rl.C25821b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import qg0.AbstractC25270e;
import qg0.C25268c;
import qg0.C25271f;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import sg0.AbstractC26246b;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: vl.a */
/* loaded from: classes3.dex */
public final class C28290a {

    /* renamed from: a */
    public static final C28290a f131979a = new C28290a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vl.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f131980t;

        /* renamed from: vl.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C33014a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C33014a f131981q = new C33014a();

            C33014a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CharSequence mo205i9(C25821b c25821b) {
                AbstractC19074t.m100208f(c25821b, "it");
                return c25821b.m133141d();
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m124765E0;
            String m127130z;
            String m131214n0;
            String m127130z2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f131980t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    m124765E0 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m142546h = C28290a.f131979a.m142546h();
                this.f131980t = 1;
                m124765E0 = m142546h.m124765E0(this);
                if (m124765E0 == m142578e) {
                    return m142578e;
                }
            }
            m127130z = AbstractC24341v.m127130z("─", 29);
            C28290a c28290a = C28290a.f131979a;
            int m89773b = c28290a.m142544f().m89773b();
            long m89774c = c28290a.m142544f().m89774c();
            int m89772a = c28290a.m142544f().m89772a();
            m131214n0 = AbstractC25332a0.m131214n0((List) m124765E0, null, null, null, 0, null, C33014a.f131981q, 31, null);
            long m142550e = c28290a.m142550e();
            m127130z2 = AbstractC24341v.m127130z("─", 50);
            AbstractC20110a.f98889a.m104564x("SMLZCloudExtInfoSync").mo104556o(8, m127130z + "\nresyncE2eeConfigs: enabled=" + m89773b + ", timeThreshold=" + m89774c + "ms, batchSize=" + m89772a + "\npendingSyncItems: " + m131214n0 + "\nlastSyncTimeStamp: " + m142550e + "\n" + m127130z2, new Object[0]);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: vl.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f131982t;

        /* renamed from: u */
        final /* synthetic */ boolean f131983u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f131983u = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f131983u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f131982t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        C28290a.f131979a.m142555n();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m142546h = C28290a.f131979a.m142546h();
                this.f131982t = 1;
                obj = m142546h.m124756A(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            int intValue = ((Number) obj).intValue();
            C28290a c28290a = C28290a.f131979a;
            if (intValue >= c28290a.m142544f().m89772a() || (this.f131983u && intValue > 0)) {
                C26676b.m136957g("SMLZCloudExtInfoSync", "requestSync(): Start sync worker on syncSize=" + intValue + ", batchSize=" + c28290a.m142544f().m89772a() + ", isForce=" + this.f131983u, null, 4, null);
                this.f131982t = 2;
                if (c28290a.m142548q(this) == m142578e) {
                    return m142578e;
                }
                C28290a.f131979a.m142555n();
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: vl.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f131984t;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f131984t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C28290a c28290a = C28290a.f131979a;
                this.f131984t = 1;
                if (c28290a.m142548q(this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: vl.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f131985t;

        /* renamed from: u */
        Object f131986u;

        /* renamed from: v */
        int f131987v;

        /* renamed from: w */
        int f131988w;

        /* renamed from: x */
        int f131989x;

        /* renamed from: vl.a$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f131990q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CharSequence mo205i9(C25821b c25821b) {
                AbstractC19074t.m100208f(c25821b, "it");
                return c25821b.m133141d();
            }
        }

        /* renamed from: vl.a$d$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f131991q = new b();

            b() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CharSequence mo205i9(SubmitE2EEInfoParams submitE2EEInfoParams) {
                AbstractC19074t.m100208f(submitE2EEInfoParams, "it");
                return submitE2EEInfoParams.m41385a();
            }
        }

        /* renamed from: vl.a$d$c */
        /* loaded from: classes3.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final c f131992q = new c();

            c() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CharSequence mo205i9(String str) {
                AbstractC19074t.m100208f(str, "it");
                return str;
            }
        }

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[Catch: all -> 0x0277, TRY_LEAVE, TryCatch #7 {all -> 0x0277, blocks: (B:24:0x00a5, B:26:0x00ab, B:29:0x00ba, B:30:0x00f9), top: B:23:0x00a5 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0192 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #9 {all -> 0x016b, blocks: (B:43:0x0135, B:46:0x0145, B:48:0x0192, B:54:0x0185, B:83:0x01ab), top: B:42:0x0135 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0195 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x02a6  */
        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x027a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01c1 -> B:22:0x0266). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x021d -> B:19:0x0220). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m124765E0;
            ArrayList arrayList;
            List m131195U;
            d dVar;
            int i11;
            Iterator it;
            Object obj2;
            int i12;
            String m131214n0;
            Object obj3;
            int i13;
            String m131214n02;
            int i14;
            Object m124832t1;
            Object obj4;
            Iterator it2;
            int i15;
            SubmitE2EEInfoParams submitE2EEInfoParams;
            byte[] bArr;
            AbstractC25270e abstractC25270e;
            String m133141d;
            C25271f c25271f;
            String m131214n03;
            m142578e = AbstractC28298d.m142578e();
            int i16 = this.f131989x;
            int i17 = 4;
            C26676b.b bVar = null;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) this.f131985t;
                            AbstractC24862s.m129228b(obj);
                            throw th2;
                        }
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    int i18 = this.f131988w;
                    int i19 = this.f131987v;
                    it = (Iterator) this.f131986u;
                    arrayList = (ArrayList) this.f131985t;
                    try {
                        AbstractC24862s.m129228b(obj);
                        dVar = this;
                        obj2 = m142578e;
                        i14 = i19;
                        i11 = i18;
                        m124832t1 = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        dVar = this;
                        if (!(!arrayList.isEmpty())) {
                        }
                    }
                    try {
                        try {
                            List list = (List) m124832t1;
                            int size = list.size();
                            m131214n03 = AbstractC25332a0.m131214n0(list, null, null, null, 0, null, c.f131992q, 31, null);
                            C26676b.m136957g("SMLZCloudExtInfoSync", "Synced: page=" + i11 + ", size=" + size + ", noiseIds=" + m131214n03, null, 4, null);
                            arrayList.addAll(list);
                            i11 = i14;
                            if (!it.hasNext()) {
                                try {
                                    Object next = it.next();
                                    i12 = i11 + 1;
                                    if (i11 < 0) {
                                        try {
                                            AbstractC25368s.m131509q();
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (!(!arrayList.isEmpty())) {
                                            }
                                        }
                                    }
                                    List list2 = (List) next;
                                    m131214n0 = AbstractC25332a0.m131214n0(list2, null, null, null, 0, null, a.f131990q, 31, null);
                                    C26676b.m136957g("SMLZCloudExtInfoSync", "Start process: page=" + i11 + ", noiseIds=" + m131214n0, bVar, i17, bVar);
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        try {
                                            C25821b c25821b = (C25821b) it3.next();
                                            AbstractC25270e m90325b = AbstractC16893a.m90325b(c25821b);
                                            MediaExtInfo m90326c = AbstractC16893a.m90326c(c25821b);
                                            if (m90325b != null && m90326c != null) {
                                                try {
                                                    C24860q m17479b = AbstractC3488c.m17479b(m90326c.m90306a());
                                                    bArr = (byte[]) m17479b.m129213a();
                                                    abstractC25270e = (AbstractC25270e) m17479b.m129214b();
                                                    m133141d = c25821b.m133141d();
                                                    it2 = it3;
                                                    try {
                                                        c25271f = C25271f.f121221a;
                                                        obj4 = m142578e;
                                                        try {
                                                            try {
                                                                i15 = i12;
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                i15 = i12;
                                                                C26676b.m136954d("SMLZCloudExtInfoSync", e);
                                                                submitE2EEInfoParams = null;
                                                                if (submitE2EEInfoParams == null) {
                                                                }
                                                                it3 = it2;
                                                                m142578e = obj4;
                                                                i12 = i15;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            m142578e = obj4;
                                                            if (!(!arrayList.isEmpty())) {
                                                            }
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        obj4 = m142578e;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    obj4 = m142578e;
                                                    it2 = it3;
                                                }
                                                try {
                                                    submitE2EEInfoParams = new SubmitE2EEInfoParams(m133141d, new EncryptInfo(c25271f.m130799g(m90325b), AbstractC29094b.m145341c(C25268c.Companion.m130771a().m130765r()), AbstractC29094b.m145341c(m90325b.m130786a())), new com.zing.zalo.data.zalocloud.model.api.MediaExtInfo(AbstractC26246b.m134963b(bArr), new MediaExtEncryptInfo(c25271f.m130799g(abstractC25270e), 1)));
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    C26676b.m136954d("SMLZCloudExtInfoSync", e);
                                                    submitE2EEInfoParams = null;
                                                    if (submitE2EEInfoParams == null) {
                                                    }
                                                    it3 = it2;
                                                    m142578e = obj4;
                                                    i12 = i15;
                                                }
                                                if (submitE2EEInfoParams == null) {
                                                    arrayList2.add(submitE2EEInfoParams);
                                                }
                                                it3 = it2;
                                                m142578e = obj4;
                                                i12 = i15;
                                            } else {
                                                obj4 = m142578e;
                                                it2 = it3;
                                                i15 = i12;
                                            }
                                            submitE2EEInfoParams = null;
                                            if (submitE2EEInfoParams == null) {
                                            }
                                            it3 = it2;
                                            m142578e = obj4;
                                            i12 = i15;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    }
                                    if (arrayList2.isEmpty()) {
                                        C26676b.m136957g("SMLZCloudExtInfoSync", "Empty page: page=" + i11, null, 4, null);
                                        obj2 = obj3;
                                        i11 = i13;
                                        m142578e = obj2;
                                        i17 = 4;
                                        bVar = null;
                                        if (!it.hasNext()) {
                                            Object obj5 = m142578e;
                                            if (!arrayList.isEmpty()) {
                                                C23870a m142546h = C28290a.f131979a.m142546h();
                                                dVar.f131985t = null;
                                                dVar.f131986u = null;
                                                dVar.f131989x = 3;
                                                if (m142546h.m124768G(arrayList, dVar) == obj5) {
                                                    return obj5;
                                                }
                                            }
                                            return C24848g0.f119245a;
                                        }
                                    } else {
                                        int size2 = arrayList2.size();
                                        m131214n02 = AbstractC25332a0.m131214n0(arrayList2, null, null, null, 0, null, b.f131991q, 31, null);
                                        C26676b.m136957g("SMLZCloudExtInfoSync", "Start sync: page=" + i11 + ", size=" + size2 + ", noiseIds=" + m131214n02, null, 4, null);
                                        C23870a m142546h2 = C28290a.f131979a.m142546h();
                                        dVar.f131985t = arrayList;
                                        dVar.f131986u = it;
                                        i14 = i13;
                                        dVar.f131987v = i14;
                                        dVar.f131988w = i11;
                                        dVar.f131989x = 2;
                                        m124832t1 = m142546h2.m124832t1(arrayList2, dVar);
                                        obj2 = obj3;
                                        if (m124832t1 == obj2) {
                                            return obj2;
                                        }
                                        List list3 = (List) m124832t1;
                                        int size3 = list3.size();
                                        m131214n03 = AbstractC25332a0.m131214n0(list3, null, null, null, 0, null, c.f131992q, 31, null);
                                        C26676b.m136957g("SMLZCloudExtInfoSync", "Synced: page=" + i11 + ", size=" + size3 + ", noiseIds=" + m131214n03, null, 4, null);
                                        arrayList.addAll(list3);
                                        i11 = i14;
                                        m142578e = obj2;
                                        i17 = 4;
                                        bVar = null;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj2 = obj3;
                                    m142578e = obj2;
                                    if (!(!arrayList.isEmpty())) {
                                    }
                                }
                                obj3 = m142578e;
                                i13 = i12;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                        m142578e = obj2;
                        i17 = 4;
                        bVar = null;
                    } catch (Throwable th9) {
                        th = th9;
                        m142578e = obj2;
                        if (!(!arrayList.isEmpty())) {
                            C23870a m142546h3 = C28290a.f131979a.m142546h();
                            dVar.f131985t = th;
                            dVar.f131986u = null;
                            dVar.f131989x = 4;
                            if (m142546h3.m124768G(arrayList, dVar) == m142578e) {
                                return m142578e;
                            }
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m124765E0 = obj;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m142546h4 = C28290a.f131979a.m142546h();
                this.f131989x = 1;
                m124765E0 = m142546h4.m124765E0(this);
                if (m124765E0 == m142578e) {
                    return m142578e;
                }
            }
            List list4 = (List) m124765E0;
            if (list4.isEmpty()) {
                return C24848g0.f119245a;
            }
            C26676b.m136957g("SMLZCloudExtInfoSync", "Sync cloud media ext info to SERVER: " + list4.size() + " item(s)", null, 4, null);
            arrayList = new ArrayList();
            m131195U = AbstractC25332a0.m131195U(list4, 10);
            try {
                i11 = 0;
                it = m131195U.iterator();
                dVar = this;
                if (!it.hasNext()) {
                }
            } catch (Throwable th10) {
                th = th10;
                dVar = this;
                if (!(!arrayList.isEmpty())) {
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    private C28290a() {
    }

    /* renamed from: f */
    public final ReSyncE2EEInfoConfig m142544f() {
        return m142545g().m89804l();
    }

    /* renamed from: g */
    private final C16805b m142545g() {
        C16805b m120633X1 = AbstractC23306f.m120633X1();
        AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
        return m120633X1;
    }

    /* renamed from: h */
    public final C23870a m142546h() {
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        return m120679j2;
    }

    /* renamed from: m */
    public static /* synthetic */ void m142547m(C28290a c28290a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c28290a.m142554l(z11);
    }

    /* renamed from: q */
    public final Object m142548q(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new d(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: d */
    public final void m142549d() {
        BuildersKt__BuildersKt.m112536b(null, new a(null), 1, null);
    }

    /* renamed from: e */
    public final long m142550e() {
        return AbstractC0924m0.m4194s8();
    }

    /* renamed from: i */
    public final boolean m142551i() {
        if (C0860a.Companion.m2473a().m2461l() && m142545g().m89807v() && m142544f().m89773b() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m142552j() {
        if (System.currentTimeMillis() - m142550e() >= m142544f().m89774c()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void m142553k() {
        if (m142551i() && m142552j()) {
            m142557p();
            m142555n();
        }
    }

    /* renamed from: l */
    public final void m142554l(boolean z11) {
        if (C0860a.Companion.m2473a().m2461l() && m142544f().m89773b() != 0) {
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new b(z11, null), 3, null);
        }
    }

    /* renamed from: n */
    public final void m142555n() {
        m142556o(System.currentTimeMillis());
    }

    /* renamed from: o */
    public final void m142556o(long j11) {
        AbstractC0924m0.m3151Ir(j11);
    }

    /* renamed from: p */
    public final void m142557p() {
        BuildersKt__BuildersKt.m112536b(null, new c(null), 1, null);
    }
}
