package b40;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.InterfaceC0806b1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b40.AbstractC2551z;
import bg0.C2797c;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p361nb.C23648e;
import p405ov.C24559a;
import p667y2.C30268e;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25367r0;

/* renamed from: b40.s */
/* loaded from: classes5.dex */
public final class C2544s {

    /* renamed from: c */
    private static long f10355c;

    /* renamed from: e */
    private static long f10357e;

    /* renamed from: g */
    private static long f10359g;

    /* renamed from: a */
    public static final C2544s f10353a = new C2544s();

    /* renamed from: b */
    private static final Map f10354b = new LinkedHashMap();

    /* renamed from: d */
    private static final Map f10356d = new LinkedHashMap();

    /* renamed from: f */
    private static final Map f10358f = new LinkedHashMap();

    /* renamed from: h */
    private static final a f10360h = new a(AbstractC0837p0.Companion.m2237f());

    /* renamed from: i */
    private static final Handler f10361i = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: b40.l
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m12795j;
            m12795j = C2544s.m12795j(message);
            return m12795j;
        }
    });

    /* renamed from: b40.s$a */
    /* loaded from: classes5.dex */
    public static final class a extends C2797c {
        a(InterfaceC0806b1 interfaceC0806b1) {
            super(interfaceC0806b1);
        }

        @Override // bg0.C2797c
        /* renamed from: i */
        public void mo12810i(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            AbstractC23350e.m122776f("ActionLogE2ee", exc);
        }
    }

    private C2544s() {
    }

    /* renamed from: i */
    private final String m12794i(String str, List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C24860q c24860q = (C24860q) it.next();
                C2525c0 c2525c0 = (C2525c0) c24860q.m129213a();
                List list2 = (List) c24860q.m129214b();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tid", C0815e1.m2076E(str, c2525c0.m12646b()));
                if (c2525c0.m12645a() != null) {
                    jSONObject.put("di", c2525c0.m12645a());
                }
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((AbstractC2551z) it2.next()).mo12899b());
                }
                jSONObject.put("msg", jSONArray2);
                jSONArray.put(jSONObject);
            }
            String jSONArray3 = jSONArray.toString();
            AbstractC19074t.m100207e(jSONArray3, "toString(...)");
            return jSONArray3;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ActionLogE2ee", e11);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final boolean m12795j(Message message) {
        AbstractC19074t.m100208f(message, "it");
        int i11 = message.what;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    f10360h.mo13474a(new Runnable() { // from class: b40.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2544s.m12798m();
                        }
                    });
                    return false;
                }
                return false;
            }
            f10360h.mo13474a(new Runnable() { // from class: b40.n
                @Override // java.lang.Runnable
                public final void run() {
                    C2544s.m12797l();
                }
            });
            return false;
        }
        f10360h.mo13474a(new Runnable() { // from class: b40.m
            @Override // java.lang.Runnable
            public final void run() {
                C2544s.m12796k();
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m12796k() {
        f10353a.m12807v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m12797l() {
        f10353a.m12806u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m12798m() {
        f10353a.m12805t();
    }

    /* renamed from: n */
    public static final void m12799n(final String str, final String str2, final int i11, final String str3, final long j11, final long j12, final boolean z11, final AbstractC2521a0 abstractC2521a0) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(str2, "senderId");
        AbstractC19074t.m100208f(str3, "chatType");
        AbstractC19074t.m100208f(abstractC2521a0, "reason");
        f10360h.mo13474a(new Runnable() { // from class: b40.r
            @Override // java.lang.Runnable
            public final void run() {
                C2544s.m12800o(str, j11, j12, str2, i11, z11, abstractC2521a0, str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m12800o(String str, long j11, long j12, String str2, int i11, boolean z11, AbstractC2521a0 abstractC2521a0, String str3) {
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(str2, "$senderId");
        AbstractC19074t.m100208f(abstractC2521a0, "$reason");
        AbstractC19074t.m100208f(str3, "$chatType");
        AbstractC2551z.b bVar = new AbstractC2551z.b(str, j11, j12, new AbstractC2551z.d(str2, i11), z11, abstractC2521a0);
        Map map = f10358f;
        Object obj = map.get(str3);
        if (obj == null) {
            f10359g = System.currentTimeMillis();
            obj = new ArrayList();
            map.put(str3, obj);
        }
        List list = (List) obj;
        list.add(bVar);
        if (list.size() >= 50 || System.currentTimeMillis() - f10359g > 5000) {
            f10353a.m12805t();
        } else {
            f10361i.sendEmptyMessageDelayed(3, 1000L);
        }
    }

    /* renamed from: p */
    public static final void m12801p(final String str, final String str2, final String str3, final int i11, final String str4, final String str5, final long j11, final int i12) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(str2, "receiverId");
        AbstractC19074t.m100208f(str3, "requestedUid");
        AbstractC19074t.m100208f(str4, "entryPoint");
        AbstractC19074t.m100208f(str5, "chatType");
        f10360h.mo13474a(new Runnable() { // from class: b40.q
            @Override // java.lang.Runnable
            public final void run() {
                C2544s.m12802q(str, str2, j11, str4, str3, i11, i12, str5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m12802q(String str, String str2, long j11, String str3, String str4, int i11, int i12, String str5) {
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(str2, "$receiverId");
        AbstractC19074t.m100208f(str3, "$entryPoint");
        AbstractC19074t.m100208f(str4, "$requestedUid");
        AbstractC19074t.m100208f(str5, "$chatType");
        AbstractC2551z.c cVar = new AbstractC2551z.c(str, str2, j11, 0L, str3, new AbstractC2551z.d(str4, i11), i12);
        Map map = f10356d;
        Object obj = map.get(str5);
        if (obj == null) {
            f10357e = System.currentTimeMillis();
            obj = new ArrayList();
            map.put(str5, obj);
        }
        List list = (List) obj;
        list.add(cVar);
        if (list.size() >= 50 || System.currentTimeMillis() - f10357e > 5000) {
            f10353a.m12806u();
        } else {
            f10361i.sendEmptyMessageDelayed(2, 1000L);
        }
    }

    /* renamed from: r */
    public static final void m12803r(final String str, final String str2, final String str3, final int i11, final String str4, final String str5, final AbstractC2531f0 abstractC2531f0, final long j11, final int i12) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(str2, "receiverId");
        AbstractC19074t.m100208f(str3, "uid");
        AbstractC19074t.m100208f(str4, "entryPoint");
        AbstractC19074t.m100208f(str5, "chatType");
        AbstractC19074t.m100208f(abstractC2531f0, "reason");
        f10360h.mo13474a(new Runnable() { // from class: b40.k
            @Override // java.lang.Runnable
            public final void run() {
                C2544s.m12804s(str, str2, j11, str4, abstractC2531f0, str3, i11, i12, str5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m12804s(String str, String str2, long j11, String str3, AbstractC2531f0 abstractC2531f0, String str4, int i11, int i12, String str5) {
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(str2, "$receiverId");
        AbstractC19074t.m100208f(str3, "$entryPoint");
        AbstractC19074t.m100208f(abstractC2531f0, "$reason");
        AbstractC19074t.m100208f(str4, "$uid");
        AbstractC19074t.m100208f(str5, "$chatType");
        Handler handler = f10361i;
        handler.removeMessages(1);
        AbstractC2551z.a aVar = new AbstractC2551z.a(str, str2, j11, str3, abstractC2531f0, new AbstractC2551z.d(str4, i11), i12);
        Map map = f10354b;
        Object obj = map.get(str5);
        if (obj == null) {
            f10355c = System.currentTimeMillis();
            obj = new ArrayList();
            map.put(str5, obj);
        }
        List list = (List) obj;
        list.add(aVar);
        if (list.size() >= 50 || System.currentTimeMillis() - f10355c > 5000) {
            f10353a.m12807v();
        } else {
            handler.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* renamed from: t */
    private final void m12805t() {
        List m131499w;
        for (Map.Entry entry : f10358f.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                C2525c0 c2525c0 = new C2525c0(((AbstractC2551z.b) obj).m12902c(), null, 2, null);
                Object obj2 = linkedHashMap.get(c2525c0);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(c2525c0, obj2);
                }
                ((List) obj2).add(obj);
            }
            m131499w = AbstractC25367r0.m131499w(linkedHashMap);
            String m12794i = f10353a.m12794i(str, m131499w);
            C24559a.m127933c("ActionLogE2ee", "not request resend " + m12794i);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0815e1.m2075D().m2100V(new C23648e(39, "", 1, "e2ee_msg_resend_fail", str, m12794i), false);
        }
        f10358f.clear();
    }

    /* renamed from: u */
    private final void m12806u() {
        List m131499w;
        for (Map.Entry entry : f10356d.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                AbstractC2551z.c cVar = (AbstractC2551z.c) obj;
                C2525c0 c2525c0 = new C2525c0(cVar.m12904d(), cVar.m12903c());
                Object obj2 = linkedHashMap.get(c2525c0);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(c2525c0, obj2);
                }
                ((List) obj2).add(obj);
            }
            m131499w = AbstractC25367r0.m131499w(linkedHashMap);
            String m12794i = f10353a.m12794i(str, m131499w);
            C24559a.m127933c("ActionLogE2ee", "receive resend request " + m12794i);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0815e1.m2075D().m2100V(new C23648e(39, "", 1, "e2ee_msg_receive_resend", str, m12794i), false);
        }
        f10356d.clear();
    }

    /* renamed from: v */
    private final void m12807v() {
        List m131499w;
        for (Map.Entry entry : f10354b.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                AbstractC2551z.a aVar = (AbstractC2551z.a) obj;
                C2525c0 c2525c0 = new C2525c0(aVar.m12901d(), aVar.m12900c());
                Object obj2 = linkedHashMap.get(c2525c0);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(c2525c0, obj2);
                }
                ((List) obj2).add(obj);
            }
            m131499w = AbstractC25367r0.m131499w(linkedHashMap);
            String m12794i = f10353a.m12794i(str, m131499w);
            C24559a.m127933c("ActionLogE2ee", "send failed " + m12794i);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0815e1.m2075D().m2100V(new C23648e(39, "", 1, "e2ee_msg_send_fail", str, m12794i), false);
        }
        f10354b.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m12808x() {
        C2544s c2544s = f10353a;
        c2544s.m12807v();
        c2544s.m12805t();
        c2544s.m12806u();
    }

    /* renamed from: w */
    public final void m12809w() {
        f10360h.mo13474a(new Runnable() { // from class: b40.p
            @Override // java.lang.Runnable
            public final void run() {
                C2544s.m12808x();
            }
        });
    }
}
