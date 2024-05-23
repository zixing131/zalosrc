package p716zh;

import ag0.C0814e0;
import ag0.C0815e1;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import gw.C19610a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p019aj.C0876j;
import p173fz.C19172a;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p363nh.C23744a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25370t;
import s00.AbstractC26080o;
import xd0.C29588d;

/* renamed from: zh.hc */
/* loaded from: classes3.dex */
public final class C31950hc {

    /* renamed from: b */
    private static final long f146831b;

    /* renamed from: d */
    private static Handler f146833d;

    /* renamed from: e */
    private static final InterfaceC24854k f146834e;

    /* renamed from: f */
    private static final InterfaceC24854k f146835f;

    /* renamed from: g */
    private static final InterfaceC24854k f146836g;

    /* renamed from: h */
    private static List f146837h;

    /* renamed from: i */
    private static String f146838i;

    /* renamed from: j */
    private static long f146839j;

    /* renamed from: k */
    private static long f146840k;

    /* renamed from: a */
    public static final C31950hc f146830a = new C31950hc();

    /* renamed from: c */
    private static Object f146832c = new Object();

    /* renamed from: zh.hc$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f146841q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19610a mo12V4() {
            return AbstractC23306f.m120607P();
        }
    }

    /* renamed from: zh.hc$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f146842q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29588d mo12V4() {
            return AbstractC23306f.m120604O();
        }
    }

    /* renamed from: zh.hc$c */
    /* loaded from: classes3.dex */
    public static final class c extends Handler {

        /* renamed from: a */
        final /* synthetic */ HandlerThread f146843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HandlerThread handlerThread, Looper looper) {
            super(looper);
            this.f146843a = handlerThread;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            super.handleMessage(message);
            try {
                int i11 = message.what;
                if (i11 == 1) {
                    C31950hc.f146830a.m153611C(message.obj);
                    return;
                }
                if (i11 == 2) {
                    C31950hc.f146830a.m153610B();
                    return;
                }
                if (i11 == 3) {
                    C31950hc.f146830a.m153612D(message.obj);
                    return;
                }
                if (i11 == 4) {
                    C31950hc.f146830a.m153633z();
                    return;
                }
                if (i11 == 5) {
                    Object obj = C31950hc.f146832c;
                    HandlerThread handlerThread = this.f146843a;
                    synchronized (obj) {
                        try {
                            if (AbstractC19074t.m100204b(C31950hc.f146833d, this)) {
                                C31950hc.f146833d = null;
                            }
                            handlerThread.quitSafely();
                        } finally {
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("UndoDeletingMessageController", e11);
            }
        }
    }

    /* renamed from: zh.hc$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f146844q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0876j mo12V4() {
            return AbstractC23306f.m120584H0();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        f146831b = r0.m153645x();
        m129210a = AbstractC24856m.m129210a(b.f146842q);
        f146834e = m129210a;
        m129210a2 = AbstractC24856m.m129210a(a.f146841q);
        f146835f = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(d.f146844q);
        f146836g = m129210a3;
        f146838i = "";
    }

    private C31950hc() {
    }

    /* renamed from: A */
    public static final void m153609A(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$it");
        C0814e0.m2056b(c17945a0);
    }

    /* renamed from: B */
    public final void m153610B() {
        List list = f146837h;
        String str = f146838i;
        f146837h = null;
        f146838i = "";
        f146839j = 0L;
        f146840k = 0L;
        m153627m(str, list);
    }

    /* renamed from: C */
    public final void m153611C(Object obj) {
        if (obj == null) {
            return;
        }
        C24860q c24860q = (C24860q) obj;
        m153627m((String) c24860q.m129215c(), (List) c24860q.m129216d());
    }

    /* renamed from: D */
    public final void m153612D(Object obj) {
        Handler handler;
        if (obj != null) {
            List list = (List) obj;
            if (!list.isEmpty()) {
                C23744a.Companion.m124119a().m124116d(177, list);
            }
        }
        if (!m153634E() && (handler = f146833d) != null) {
            handler.sendEmptyMessageDelayed(5, 5000L);
        }
    }

    /* renamed from: F */
    private final Handler m153613F(HandlerThread handlerThread) {
        return new c(handlerThread, handlerThread.getLooper());
    }

    /* renamed from: G */
    private final void m153614G() {
        synchronized (f146832c) {
            try {
                Handler handler = f146833d;
                if (handler == null) {
                    HandlerThread handlerThread = new HandlerThread("UndoDeletingMessageController");
                    handlerThread.start();
                    f146833d = f146830a.m153613F(handlerThread);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } else if (handler != null) {
                    handler.removeMessages(5);
                    C24848g0 c24848g02 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: K */
    public static final void m153615K(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$it");
        C0814e0.m2069o(c17945a0);
        c17945a0.m94928K1();
        c17945a0.m95077Zb();
    }

    /* renamed from: k */
    private final void m153626k(HashMap hashMap, String str) {
        if (hashMap.containsKey(str) && hashMap.get(str) != null) {
            Object obj = hashMap.get(str);
            Objects.requireNonNull(obj);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            hashMap.put(str, Integer.valueOf(((Integer) obj).intValue() + 1));
            return;
        }
        hashMap.put(str, 1);
    }

    /* renamed from: m */
    private final void m153627m(String str, List list) {
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: zh.gc

                /* renamed from: p */
                public final /* synthetic */ String f146735p;

                /* renamed from: q */
                public final /* synthetic */ List f146736q;

                public /* synthetic */ RunnableC31935gc(String str2, List list3) {
                    r1 = str2;
                    r2 = list3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31950hc.m153628n(r1, r2);
                }
            }, 2, null);
            Handler handler = f146833d;
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(3, list3));
            }
        }
    }

    /* renamed from: n */
    public static final void m153628n(String str, List list) {
        AbstractC19074t.m100208f(str, "$threadId");
        try {
            C31950hc c31950hc = f146830a;
            c31950hc.m153631r().m101508a(new C29588d.c(str, list, C29588d.b.f136552p));
            c31950hc.m153630q().m102641o(list);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("UndoDeletingMessageController", e11);
        }
    }

    /* renamed from: p */
    private final String m153629p(List list) {
        if (list == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m153626k(hashMap, String.valueOf(AbstractC19646n0.m102878B(((C17945a0) it.next()).m95041W4(), false)));
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).intValue());
            }
            jSONObject.put("mt", jSONObject2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("UndoDeletingMessageController", e11);
        }
        return jSONObject.toString();
    }

    /* renamed from: q */
    private final C19610a m153630q() {
        return (C19610a) f146835f.getValue();
    }

    /* renamed from: r */
    private final C29588d m153631r() {
        return (C29588d) f146834e.getValue();
    }

    /* renamed from: u */
    private final C0876j m153632u() {
        return (C0876j) f146836g.getValue();
    }

    /* renamed from: z */
    public final void m153633z() {
        Handler handler = f146833d;
        if (handler != null) {
            handler.removeMessages(2);
        }
        List<C17945a0> list = f146837h;
        String str = f146838i;
        f146837h = null;
        f146838i = "";
        f146839j = 0L;
        f146840k = 0L;
        if (list != null) {
            for (C17945a0 c17945a0 : list) {
                c17945a0.m94900Ga(false);
                AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: zh.fc
                    public /* synthetic */ RunnableC31920fc() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C31950hc.m153609A(C17945a0.this);
                    }
                }, 2, null);
            }
        }
        C23744a.Companion.m124119a().m124116d(175, new Object[0]);
    }

    /* renamed from: E */
    public final boolean m153634E() {
        boolean z11;
        List list = f146837h;
        if (list != null && !list.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /* renamed from: H */
    public final boolean m153635H() {
        int i11;
        List<C17945a0> list = f146837h;
        if (list != null) {
            i11 = 0;
            for (C17945a0 c17945a0 : list) {
                C0876j m153632u = f146830a.m153632u();
                MessageId m95029V3 = c17945a0.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                if (m153632u.m2636s(m95029V3) == null) {
                    i11++;
                }
            }
        } else {
            i11 = 0;
        }
        List list2 = f146837h;
        if (list2 == null || i11 != list2.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public final boolean m153636I(List list) {
        int size;
        int i11;
        AbstractC19074t.m100208f(list, "deletedIdsList");
        List list2 = f146837h;
        if (list2 == null || list.size() < (size = list2.size())) {
            return false;
        }
        List list3 = f146837h;
        if (list3 != null) {
            Iterator it = list3.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (list.contains(((C17945a0) it.next()).m95029V3())) {
                    i11++;
                }
            }
        } else {
            i11 = 0;
        }
        if (i11 != size) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public final void m153637J(String str, List list) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "messagesList");
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17945a0 c17945a0 = (C17945a0) it.next();
                c17945a0.m94900Ga(true);
                AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: zh.ec
                    public /* synthetic */ RunnableC31905ec() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C31950hc.m153615K(C17945a0.this);
                    }
                }, 2, null);
            }
            m153614G();
            Handler handler = f146833d;
            if (handler == null) {
                return;
            }
            List list2 = f146837h;
            if (list2 != null && !list2.isEmpty()) {
                handler.sendMessage(handler.obtainMessage(1, new C24860q(str, f146837h)));
            }
            f146837h = list;
            f146838i = str;
            f146839j = C23793c.Companion.m124321a().mo124319c();
            f146840k = f146831b;
            C23744a.Companion.m124119a().m124116d(174, new Object[0]);
            handler.removeMessages(2);
            handler.sendEmptyMessageDelayed(2, f146840k);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("UndoDeletingMessageController", e11);
        }
    }

    /* renamed from: L */
    public final void m153638L(String str, int i11, String str2, List list, String str3) {
        C0815e1.m2075D().m2100V(new C23648e(1, str, i11, str2, m153629p(list), str3), false);
    }

    /* renamed from: l */
    public final void m153639l() {
        try {
            Handler handler = f146833d;
            if (handler != null) {
                handler.sendEmptyMessage(4);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("UndoDeletingMessageController", e11);
        }
    }

    /* renamed from: o */
    public final void m153640o() {
        try {
            Handler handler = f146833d;
            if (handler != null) {
                handler.removeMessages(2);
            }
            Handler handler2 = f146833d;
            if (handler2 != null) {
                handler2.sendEmptyMessage(2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("UndoDeletingMessageController", e11);
        }
    }

    /* renamed from: s */
    public final long m153641s() {
        return f146839j;
    }

    /* renamed from: t */
    public final List m153642t() {
        int m131511r;
        List list = f146837h;
        if (list != null) {
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C17945a0) it.next()).m95029V3());
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: v */
    public final int m153643v() {
        List list = f146837h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: w */
    public final boolean m153644w() {
        int m100600k = C19172a.m100600k("undo_delete_message@enable", 1);
        if (m100600k < 0 || m100600k > 1 || m100600k == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final int m153645x() {
        int m100600k = C19172a.m100600k("undo_delete_message@timeout", AbstractC26080o.a.f124275b);
        if (m100600k <= 0) {
            return AbstractC26080o.a.f124275b;
        }
        if (m100600k < 3000) {
            return 3000;
        }
        if (m100600k > 15000) {
            return 15000;
        }
        return m100600k;
    }

    /* renamed from: y */
    public final List m153646y() {
        return f146837h;
    }
}
