package com.zing.zalo.data.zalocloud.syncing;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch0.AbstractC3488c;
import com.zing.zalo.data.zalocloud.model.api.EncryptInfo;
import com.zing.zalo.data.zalocloud.model.api.MediaExtEncryptInfo;
import com.zing.zalo.data.zalocloud.model.api.SubmitE2EEInfoParams;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import nl.C23870a;
import p348mi.AbstractC23306f;
import p487rl.C25821b;
import pm0.AbstractC24862s;
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
import wm0.AbstractC29096d;

/* loaded from: classes3.dex */
public final class CloudMediaExtInfoSyncWorker extends CoroutineWorker {
    public static final C7949a Companion = new C7949a(null);

    /* renamed from: s */
    private final C23870a f43153s;

    /* renamed from: com.zing.zalo.data.zalocloud.syncing.CloudMediaExtInfoSyncWorker$a */
    /* loaded from: classes3.dex */
    public static final class C7949a {
        private C7949a() {
        }

        public /* synthetic */ C7949a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.data.zalocloud.syncing.CloudMediaExtInfoSyncWorker$b */
    /* loaded from: classes3.dex */
    public static final class C7950b extends AbstractC29096d {

        /* renamed from: s */
        Object f43154s;

        /* renamed from: t */
        Object f43155t;

        /* renamed from: u */
        Object f43156u;

        /* renamed from: v */
        int f43157v;

        /* renamed from: w */
        int f43158w;

        /* renamed from: x */
        /* synthetic */ Object f43159x;

        /* renamed from: z */
        int f43161z;

        C7950b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f43159x = obj;
            this.f43161z |= Integer.MIN_VALUE;
            return CloudMediaExtInfoSyncWorker.this.mo11443d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudMediaExtInfoSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "appContext");
        AbstractC19074t.m100208f(workerParameters, "params");
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        this.f43153s = m120679j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:22:0x005b, B:24:0x018c, B:26:0x00b2, B:28:0x00b8, B:30:0x00c0, B:31:0x00c3, B:32:0x00d2, B:88:0x00aa), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0161 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:42:0x010c, B:45:0x011c, B:47:0x0161, B:53:0x0156, B:76:0x0170), top: B:41:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0189 -> B:24:0x018c). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11443d(Continuation continuation) {
        C7950b c7950b;
        Object m142578e;
        int i11;
        CloudMediaExtInfoSyncWorker cloudMediaExtInfoSyncWorker;
        ArrayList arrayList;
        List m131195U;
        int i12;
        Iterator it;
        Object obj;
        C23870a c23870a;
        SubmitE2EEInfoParams submitE2EEInfoParams;
        byte[] bArr;
        AbstractC25270e abstractC25270e;
        String m133141d;
        C25271f c25271f;
        try {
            if (continuation instanceof C7950b) {
                c7950b = (C7950b) continuation;
                int i13 = c7950b.f43161z;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c7950b.f43161z = i13 - Integer.MIN_VALUE;
                    Object obj2 = c7950b.f43159x;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = c7950b.f43161z;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Throwable th2 = (Throwable) c7950b.f43154s;
                                    AbstractC24862s.m129228b(obj2);
                                    throw th2;
                                }
                                AbstractC24862s.m129228b(obj2);
                                AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
                                AbstractC19074t.m100207e(m11891c, "success(...)");
                                return m11891c;
                            }
                            i12 = c7950b.f43158w;
                            int i14 = c7950b.f43157v;
                            it = (Iterator) c7950b.f43156u;
                            arrayList = (ArrayList) c7950b.f43155t;
                            cloudMediaExtInfoSyncWorker = (CloudMediaExtInfoSyncWorker) c7950b.f43154s;
                            AbstractC24862s.m129228b(obj2);
                            List list = (List) obj2;
                            C26676b.m136957g("SMLZCloudExtInfoSyncWorker", "Synced: page=" + i12 + ", size=" + list.size(), null, 4, null);
                            arrayList.addAll(list);
                            i12 = i14;
                            if (!it.hasNext()) {
                                Object next = it.next();
                                i14 = i12 + 1;
                                if (i12 < 0) {
                                    AbstractC25368s.m131509q();
                                }
                                C23870a c23870a2 = cloudMediaExtInfoSyncWorker.f43153s;
                                ArrayList arrayList2 = new ArrayList();
                                for (C25821b c25821b : (List) next) {
                                    try {
                                        AbstractC25270e m90325b = AbstractC16893a.m90325b(c25821b);
                                        MediaExtInfo m90326c = AbstractC16893a.m90326c(c25821b);
                                        if (m90325b != null && m90326c != null) {
                                            try {
                                                C24860q m17479b = AbstractC3488c.m17479b(m90326c.m90306a());
                                                bArr = (byte[]) m17479b.m129213a();
                                                abstractC25270e = (AbstractC25270e) m17479b.m129214b();
                                                m133141d = c25821b.m133141d();
                                                c25271f = C25271f.f121221a;
                                                obj = m142578e;
                                            } catch (Exception e11) {
                                                e = e11;
                                                obj = m142578e;
                                            }
                                            try {
                                                try {
                                                    c23870a = c23870a2;
                                                    try {
                                                        submitE2EEInfoParams = new SubmitE2EEInfoParams(m133141d, new EncryptInfo(c25271f.m130799g(m90325b), AbstractC29094b.m145341c(C25268c.Companion.m130771a().m130765r()), AbstractC29094b.m145341c(m90325b.m130786a())), new com.zing.zalo.data.zalocloud.model.api.MediaExtInfo(AbstractC26246b.m134963b(bArr), new MediaExtEncryptInfo(c25271f.m130799g(abstractC25270e), 1)));
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        C26676b.m136954d("SMLZCloudExtInfoSyncWorker", e);
                                                        submitE2EEInfoParams = null;
                                                        if (submitE2EEInfoParams == null) {
                                                        }
                                                        m142578e = obj;
                                                        c23870a2 = c23870a;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    c23870a = c23870a2;
                                                    C26676b.m136954d("SMLZCloudExtInfoSyncWorker", e);
                                                    submitE2EEInfoParams = null;
                                                    if (submitE2EEInfoParams == null) {
                                                    }
                                                    m142578e = obj;
                                                    c23870a2 = c23870a;
                                                }
                                                if (submitE2EEInfoParams == null) {
                                                    arrayList2.add(submitE2EEInfoParams);
                                                }
                                                m142578e = obj;
                                                c23870a2 = c23870a;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                m142578e = obj;
                                                C7950b c7950b2 = c7950b;
                                                Throwable th4 = th;
                                                if (!arrayList.isEmpty()) {
                                                    C23870a c23870a3 = cloudMediaExtInfoSyncWorker.f43153s;
                                                    c7950b2.f43154s = th4;
                                                    c7950b2.f43155t = null;
                                                    c7950b2.f43156u = null;
                                                    c7950b2.f43161z = 4;
                                                    if (c23870a3.m124768G(arrayList, c7950b2) == m142578e) {
                                                        return m142578e;
                                                    }
                                                    throw th4;
                                                }
                                                throw th4;
                                            }
                                        } else {
                                            obj = m142578e;
                                            c23870a = c23870a2;
                                        }
                                        submitE2EEInfoParams = null;
                                        if (submitE2EEInfoParams == null) {
                                        }
                                        m142578e = obj;
                                        c23870a2 = c23870a;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                                Object obj3 = m142578e;
                                c7950b.f43154s = cloudMediaExtInfoSyncWorker;
                                c7950b.f43155t = arrayList;
                                c7950b.f43156u = it;
                                c7950b.f43157v = i14;
                                c7950b.f43158w = i12;
                                c7950b.f43161z = 2;
                                obj2 = c23870a2.m124832t1(arrayList2, c7950b);
                                m142578e = obj3;
                                if (obj2 == m142578e) {
                                    return m142578e;
                                }
                                List list2 = (List) obj2;
                                C26676b.m136957g("SMLZCloudExtInfoSyncWorker", "Synced: page=" + i12 + ", size=" + list2.size(), null, 4, null);
                                arrayList.addAll(list2);
                                i12 = i14;
                                if (!it.hasNext()) {
                                    if (!arrayList.isEmpty()) {
                                        C23870a c23870a4 = cloudMediaExtInfoSyncWorker.f43153s;
                                        c7950b.f43154s = null;
                                        c7950b.f43155t = null;
                                        c7950b.f43156u = null;
                                        c7950b.f43161z = 3;
                                        if (c23870a4.m124768G(arrayList, c7950b) == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                    AbstractC2252t.a m11891c2 = AbstractC2252t.a.m11891c();
                                    AbstractC19074t.m100207e(m11891c2, "success(...)");
                                    return m11891c2;
                                }
                            }
                        } else {
                            CloudMediaExtInfoSyncWorker cloudMediaExtInfoSyncWorker2 = (CloudMediaExtInfoSyncWorker) c7950b.f43154s;
                            AbstractC24862s.m129228b(obj2);
                            cloudMediaExtInfoSyncWorker = cloudMediaExtInfoSyncWorker2;
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        C23870a c23870a5 = this.f43153s;
                        c7950b.f43154s = this;
                        c7950b.f43161z = 1;
                        obj2 = c23870a5.m124765E0(c7950b);
                        if (obj2 == m142578e) {
                            return m142578e;
                        }
                        cloudMediaExtInfoSyncWorker = this;
                    }
                    List list3 = (List) obj2;
                    C26676b.m136957g("SMLZCloudExtInfoSyncWorker", "Start sync cloud media ext info to server with sync size=" + list3.size(), null, 4, null);
                    arrayList = new ArrayList();
                    m131195U = AbstractC25332a0.m131195U(list3, 10);
                    i12 = 0;
                    it = m131195U.iterator();
                    if (!it.hasNext()) {
                    }
                }
            }
            if (i11 == 0) {
            }
            List list32 = (List) obj2;
            C26676b.m136957g("SMLZCloudExtInfoSyncWorker", "Start sync cloud media ext info to server with sync size=" + list32.size(), null, 4, null);
            arrayList = new ArrayList();
            m131195U = AbstractC25332a0.m131195U(list32, 10);
            i12 = 0;
            it = m131195U.iterator();
            if (!it.hasNext()) {
            }
        } catch (Throwable th6) {
            th = th6;
        }
        c7950b = new C7950b(continuation);
        Object obj22 = c7950b.f43159x;
        m142578e = AbstractC28298d.m142578e();
        i11 = c7950b.f43161z;
    }
}
