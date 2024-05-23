package com.zing.zalo.zalocloud.offload;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19057i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import nh0.InterfaceC23792b;
import nl.C23870a;
import p019aj.C0876j;
import p239ih.C20556f;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import zg0.C31831a;

/* loaded from: classes7.dex */
public final class ZaloCloudOffloadWorker extends CoroutineWorker {
    public static final C16867a Companion = new C16867a(null);

    /* renamed from: s */
    private final InterfaceC24854k f85849s;

    /* renamed from: t */
    private final InterfaceC24854k f85850t;

    /* renamed from: u */
    private final InterfaceC24854k f85851u;

    /* renamed from: v */
    private final InterfaceC24854k f85852v;

    /* renamed from: com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker$a */
    /* loaded from: classes7.dex */
    public static final class C16867a {
        private C16867a() {
        }

        public /* synthetic */ C16867a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker$b */
    /* loaded from: classes7.dex */
    static final class C16868b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16868b f85853q = new C16868b();

        C16868b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23870a mo12V4() {
            return AbstractC23306f.m120679j2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker$c */
    /* loaded from: classes7.dex */
    public static final class C16869c extends AbstractC29096d {

        /* renamed from: s */
        Object f85854s;

        /* renamed from: t */
        Object f85855t;

        /* renamed from: u */
        long f85856u;

        /* renamed from: v */
        int f85857v;

        /* renamed from: w */
        int f85858w;

        /* renamed from: x */
        /* synthetic */ Object f85859x;

        /* renamed from: z */
        int f85861z;

        C16869c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85859x = obj;
            this.f85861z |= Integer.MIN_VALUE;
            return ZaloCloudOffloadWorker.this.mo11443d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker$d */
    /* loaded from: classes7.dex */
    public static final class C16870d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C19057i0 f85862q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16870d(C19057i0 c19057i0) {
            super(1);
            this.f85862q = c19057i0;
        }

        /* renamed from: a */
        public final void m90125a(long j11) {
            this.f85862q.f94939p += j11;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m90125a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker$e */
    /* loaded from: classes7.dex */
    static final class C16871e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16871e f85863q = new C16871e();

        C16871e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0876j mo12V4() {
            return AbstractC23306f.m120584H0();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker$f */
    /* loaded from: classes7.dex */
    static final class C16872f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16872f f85864q = new C16872f();

        C16872f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo12V4() {
            return Long.valueOf(C16805b.Companion.m89811a().m89803k().m89777b() * 86400000);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker$g */
    /* loaded from: classes7.dex */
    static final class C16873g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16873g f85865q = new C16873g();

        C16873g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZaloCloudOffloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "appContext");
        AbstractC19074t.m100208f(workerParameters, "params");
        m129210a = AbstractC24856m.m129210a(C16868b.f85853q);
        this.f85849s = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C16871e.f85863q);
        this.f85850t = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C16873g.f85865q);
        this.f85851u = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(C16872f.f85864q);
        this.f85852v = m129210a4;
    }

    /* renamed from: j */
    private final C23870a m90117j() {
        return (C23870a) this.f85849s.getValue();
    }

    /* renamed from: k */
    private final C0876j m90118k() {
        return (C0876j) this.f85850t.getValue();
    }

    /* renamed from: l */
    private final long m90119l() {
        return ((Number) this.f85852v.getValue()).longValue();
    }

    /* renamed from: m */
    private final InterfaceC23792b m90120m() {
        return (InterfaceC23792b) this.f85851u.getValue();
    }

    /* renamed from: p */
    private final int m90121p(String str, List list, InterfaceC18505l interfaceC18505l) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            try {
                m90122n("Start offload msg: msgId=" + c17945a0.m95029V3());
                ArrayList<String> arrayList2 = new ArrayList();
                arrayList2.add(c17945a0.m94983Q3());
                arrayList2.add(c17945a0.m94947M4());
                if (c17945a0.m95306y8()) {
                    arrayList2.add(c17945a0.m94945M2());
                    arrayList2.add(c17945a0.m95197m5());
                }
                for (String str2 : arrayList2) {
                    long m106845r = new C20556f(str2).m106845r();
                    if (new C20556f(str2).m106829a()) {
                        m90122n("Offloaded msg: msgId=" + c17945a0.m95029V3() + ", path=" + str2);
                        if (AbstractC19074t.m100204b(str2, c17945a0.m94983Q3())) {
                            arrayList.add(c17945a0);
                        }
                        interfaceC18505l.mo205i9(Long.valueOf(m106845r));
                        i11++;
                    }
                }
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudOffload", e11);
            }
        }
        if (!arrayList.isEmpty()) {
            m90118k().m2620X(str, arrayList, 4);
            m90118k().m2621Z(str, arrayList, "");
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008e  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [fn0.i0] */
    /* JADX WARN: Type inference failed for: r15v12, types: [fn0.i0] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, fn0.i0] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker] */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.zing.zalo.zalocloud.offload.ZaloCloudOffloadWorker] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x022b -> B:31:0x0136). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11443d(Continuation continuation) {
        C16869c c16869c;
        Object m142578e;
        int i11;
        ?? r15;
        ?? r7;
        String str;
        String str2;
        String str3;
        int i12;
        int i13;
        long j11;
        C16869c c16869c2;
        String str4;
        String str5;
        Object obj;
        C16869c c16869c3;
        long j12;
        int i14;
        ZaloCloudOffloadWorker zaloCloudOffloadWorker;
        C19057i0 c19057i0;
        List list;
        C19057i0 c19057i02;
        ZaloCloudOffloadWorker zaloCloudOffloadWorker2;
        int i15;
        int i16;
        long j13;
        Object obj2;
        try {
            if (continuation instanceof C16869c) {
                c16869c = (C16869c) continuation;
                int i17 = c16869c.f85861z;
                i13 = Integer.MIN_VALUE;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    c16869c.f85861z = i17 - Integer.MIN_VALUE;
                    Object obj3 = c16869c.f85859x;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = c16869c.f85861z;
                    r15 = 2;
                    r15 = 2;
                    r7 = 1;
                    r7 = 1;
                    if (i11 == 0) {
                        try {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    int i18 = c16869c.f85858w;
                                    i13 = c16869c.f85857v;
                                    long j14 = c16869c.f85856u;
                                    C19057i0 c19057i03 = (C19057i0) c16869c.f85855t;
                                    ZaloCloudOffloadWorker zaloCloudOffloadWorker3 = (ZaloCloudOffloadWorker) c16869c.f85854s;
                                    AbstractC24862s.m129228b(obj3);
                                    str4 = "Offload worker FINISHED: ";
                                    str5 = " bytes of ";
                                    obj = m142578e;
                                    c16869c3 = c16869c;
                                    str3 = " item(s) are offloaded";
                                    j12 = j14;
                                    i14 = i18;
                                    zaloCloudOffloadWorker = zaloCloudOffloadWorker3;
                                    c19057i0 = c19057i03;
                                    try {
                                        list = (List) obj3;
                                        if (!(!list.isEmpty())) {
                                            try {
                                                try {
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        Object next = it.next();
                                                        Iterator it2 = it;
                                                        String m41048l = ((MessageId) next).m41048l();
                                                        Object obj4 = linkedHashMap.get(m41048l);
                                                        if (obj4 == null) {
                                                            obj2 = obj;
                                                            ArrayList arrayList = new ArrayList();
                                                            linkedHashMap.put(m41048l, arrayList);
                                                            obj4 = arrayList;
                                                        } else {
                                                            obj2 = obj;
                                                        }
                                                        ((List) obj4).add(next);
                                                        it = it2;
                                                        obj = obj2;
                                                    }
                                                    Object obj5 = obj;
                                                    zaloCloudOffloadWorker.m90123o("Offloading: currentPage=" + i14);
                                                    i15 = i13;
                                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                        try {
                                                            try {
                                                                String str6 = (String) entry.getKey();
                                                                i15 += zaloCloudOffloadWorker.m90121p(str6, C7956b.Companion.m41573b().m41555r(str6, (List) entry.getValue()), new C16870d(c19057i0));
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                i13 = i15;
                                                                str = str4;
                                                                str2 = str5;
                                                                ZaloCloudOffloadWorker zaloCloudOffloadWorker4 = zaloCloudOffloadWorker;
                                                                r15 = c19057i0;
                                                                r7 = zaloCloudOffloadWorker4;
                                                                try {
                                                                    C26676b.m136954d("SMLZCloudOffload", e);
                                                                    AbstractC2252t.a m11889a = AbstractC2252t.a.m11889a();
                                                                    AbstractC19074t.m100207e(m11889a, "failure(...)");
                                                                    r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                                                    return m11889a;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                i13 = i15;
                                                                str = str4;
                                                                str2 = str5;
                                                                ZaloCloudOffloadWorker zaloCloudOffloadWorker5 = zaloCloudOffloadWorker;
                                                                r15 = c19057i0;
                                                                r7 = zaloCloudOffloadWorker5;
                                                                r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                                                throw th;
                                                            }
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            c19057i02 = c19057i0;
                                                            i16 = i15;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            c19057i02 = c19057i0;
                                                            i16 = i15;
                                                        }
                                                    }
                                                    C23870a m90117j = zaloCloudOffloadWorker.m90117j();
                                                    AbstractC19074t.m100207e(m90117j, "<get-cloudRepo>(...)");
                                                    int i19 = i14 + 1;
                                                    c16869c3.f85854s = zaloCloudOffloadWorker;
                                                    c16869c3.f85855t = c19057i0;
                                                    c16869c3.f85856u = j12;
                                                    c16869c3.f85857v = i15;
                                                    c16869c3.f85858w = i19;
                                                    c16869c3.f85861z = 2;
                                                    Object m124717B0 = C23870a.m124717B0(m90117j, j12, i14, 0, c16869c3, 4, null);
                                                    if (m124717B0 == obj5) {
                                                        return obj5;
                                                    }
                                                    i14 = i19;
                                                    obj3 = m124717B0;
                                                    obj = obj5;
                                                    i13 = i16;
                                                    c19057i0 = c19057i02;
                                                    j12 = j13;
                                                    list = (List) obj3;
                                                    if (!(!list.isEmpty())) {
                                                        zaloCloudOffloadWorker.m90123o(str4 + c19057i0.f94939p + str5 + i13 + str3);
                                                        AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
                                                        AbstractC19074t.m100207e(m11891c, "success(...)");
                                                        return m11891c;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    zaloCloudOffloadWorker2 = zaloCloudOffloadWorker;
                                                    i13 = i16;
                                                    str = str4;
                                                    str2 = str5;
                                                    r15 = c19057i02;
                                                    r7 = zaloCloudOffloadWorker2;
                                                    C26676b.m136954d("SMLZCloudOffload", e);
                                                    AbstractC2252t.a m11889a2 = AbstractC2252t.a.m11889a();
                                                    AbstractC19074t.m100207e(m11889a2, "failure(...)");
                                                    r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                                    return m11889a2;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    r7 = zaloCloudOffloadWorker;
                                                    i13 = i16;
                                                    str = str4;
                                                    str2 = str5;
                                                    r15 = c19057i02;
                                                    r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                                    throw th;
                                                }
                                                c19057i02 = c19057i0;
                                                i16 = i15;
                                                j13 = j12;
                                            } catch (Exception e14) {
                                                e = e14;
                                                c19057i02 = c19057i0;
                                                zaloCloudOffloadWorker2 = zaloCloudOffloadWorker;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                c19057i02 = c19057i0;
                                                r7 = zaloCloudOffloadWorker;
                                            }
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        str = str4;
                                        str2 = str5;
                                        ZaloCloudOffloadWorker zaloCloudOffloadWorker42 = zaloCloudOffloadWorker;
                                        r15 = c19057i0;
                                        r7 = zaloCloudOffloadWorker42;
                                        C26676b.m136954d("SMLZCloudOffload", e);
                                        AbstractC2252t.a m11889a22 = AbstractC2252t.a.m11889a();
                                        AbstractC19074t.m100207e(m11889a22, "failure(...)");
                                        r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                        return m11889a22;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        str = str4;
                                        str2 = str5;
                                        ZaloCloudOffloadWorker zaloCloudOffloadWorker52 = zaloCloudOffloadWorker;
                                        r15 = c19057i0;
                                        r7 = zaloCloudOffloadWorker52;
                                        r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                        throw th;
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                i12 = c16869c.f85858w;
                                i13 = c16869c.f85857v;
                                j11 = c16869c.f85856u;
                                C19057i0 c19057i04 = (C19057i0) c16869c.f85855t;
                                ZaloCloudOffloadWorker zaloCloudOffloadWorker6 = (ZaloCloudOffloadWorker) c16869c.f85854s;
                                AbstractC24862s.m129228b(obj3);
                                c16869c2 = c16869c;
                                str4 = "Offload worker FINISHED: ";
                                str5 = " bytes of ";
                                str3 = " item(s) are offloaded";
                                r7 = zaloCloudOffloadWorker6;
                                r15 = c19057i04;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str = "Offload worker FINISHED: ";
                            str2 = " bytes of ";
                            str3 = " item(s) are offloaded";
                            C26676b.m136954d("SMLZCloudOffload", e);
                            AbstractC2252t.a m11889a222 = AbstractC2252t.a.m11889a();
                            AbstractC19074t.m100207e(m11889a222, "failure(...)");
                            r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                            return m11889a222;
                        } catch (Throwable th8) {
                            th = th8;
                            str = "Offload worker FINISHED: ";
                            str2 = " bytes of ";
                            str3 = " item(s) are offloaded";
                            r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                            throw th;
                        }
                    } else {
                        AbstractC24862s.m129228b(obj3);
                        String str7 = CoreUtility.f89233i;
                        String m11532j = getInputData().m11532j("UserUid");
                        if (m11532j == null) {
                            m11532j = "";
                        }
                        if (str7 != null && AbstractC19074t.m100204b(m11532j, str7)) {
                            if (!C31831a.Companion.m152940a().m152937u()) {
                                m90123o("Feature disabled!");
                                AbstractC2252t.a m11891c2 = AbstractC2252t.a.m11891c();
                                AbstractC19074t.m100207e(m11891c2, "success(...)");
                                return m11891c2;
                            }
                            long mo124314i = m90120m().mo124314i() - m90119l();
                            m90123o("Offload worker START: pivotTS=" + mo124314i);
                            r15 = new C19057i0();
                            try {
                                C23870a m90117j2 = m90117j();
                                AbstractC19074t.m100207e(m90117j2, "<get-cloudRepo>(...)");
                                c16869c.f85854s = this;
                                c16869c.f85855t = r15;
                                c16869c.f85856u = mo124314i;
                                c16869c.f85857v = 0;
                                c16869c.f85858w = 0;
                                c16869c.f85861z = 1;
                                str4 = "Offload worker FINISHED: ";
                                C16869c c16869c4 = c16869c;
                                str5 = " bytes of ";
                                c16869c2 = c16869c;
                                str3 = " item(s) are offloaded";
                                try {
                                    Object m124717B02 = C23870a.m124717B0(m90117j2, mo124314i, 0, 0, c16869c4, 4, null);
                                    if (m124717B02 == m142578e) {
                                        return m142578e;
                                    }
                                    r7 = this;
                                    obj3 = m124717B02;
                                    j11 = mo124314i;
                                    i12 = 0;
                                    i13 = 0;
                                    r15 = r15;
                                } catch (Exception e17) {
                                    e = e17;
                                    str = str4;
                                    str2 = str5;
                                    r7 = this;
                                    i13 = 0;
                                    r15 = r15;
                                    C26676b.m136954d("SMLZCloudOffload", e);
                                    AbstractC2252t.a m11889a2222 = AbstractC2252t.a.m11889a();
                                    AbstractC19074t.m100207e(m11889a2222, "failure(...)");
                                    r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                    return m11889a2222;
                                } catch (Throwable th9) {
                                    th = th9;
                                    str = str4;
                                    str2 = str5;
                                    r7 = this;
                                    i13 = 0;
                                    r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
                                    throw th;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                str = "Offload worker FINISHED: ";
                                str2 = " bytes of ";
                                str3 = " item(s) are offloaded";
                            } catch (Throwable th10) {
                                th = th10;
                                str = "Offload worker FINISHED: ";
                                str2 = " bytes of ";
                                str3 = " item(s) are offloaded";
                            }
                        } else {
                            m90123o("UserUid is null or not match: currentUserUid=" + str7 + ", userUid=" + m11532j);
                            C16874a.Companion.m90147a().m90141e(m11532j);
                            AbstractC2252t.a m11889a3 = AbstractC2252t.a.m11889a();
                            AbstractC19074t.m100207e(m11889a3, "failure(...)");
                            return m11889a3;
                        }
                    }
                    list = (List) obj3;
                    j12 = j11;
                    obj = m142578e;
                    c16869c3 = c16869c2;
                    i14 = i12;
                    C19057i0 c19057i05 = r15;
                    zaloCloudOffloadWorker = r7;
                    c19057i0 = c19057i05;
                    if (!(!list.isEmpty())) {
                    }
                }
            }
            list = (List) obj3;
            j12 = j11;
            obj = m142578e;
            c16869c3 = c16869c2;
            i14 = i12;
            C19057i0 c19057i052 = r15;
            zaloCloudOffloadWorker = r7;
            c19057i0 = c19057i052;
            if (!(!list.isEmpty())) {
            }
        } catch (Exception e19) {
            e = e19;
            str = str4;
            str2 = str5;
            r7 = r7;
            r15 = r15;
            C26676b.m136954d("SMLZCloudOffload", e);
            AbstractC2252t.a m11889a22222 = AbstractC2252t.a.m11889a();
            AbstractC19074t.m100207e(m11889a22222, "failure(...)");
            r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
            return m11889a22222;
        } catch (Throwable th11) {
            th = th11;
            str = str4;
            str2 = str5;
            r7.m90123o(str + r15.f94939p + str2 + i13 + str3);
            throw th;
        }
        c16869c = new C16869c(continuation);
        Object obj32 = c16869c.f85859x;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16869c.f85861z;
        r15 = 2;
        r15 = 2;
        r7 = 1;
        r7 = 1;
        if (i11 == 0) {
        }
    }

    /* renamed from: n */
    public final void m90122n(String str) {
        AbstractC19074t.m100208f(str, "message");
        C26676b.m136952b("SMLZCloudOffload", "[" + getInputData().m11532j("UserUid") + "] " + str);
    }

    /* renamed from: o */
    public final void m90123o(String str) {
        AbstractC19074t.m100208f(str, "message");
        C26676b.m136955e("SMLZCloudOffload", "[" + getInputData().m11532j("UserUid") + "] " + str, C26676b.b.f126338w);
    }
}
