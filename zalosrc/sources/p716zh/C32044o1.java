package p716zh;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.chathead.ChatHeadUI.ChatHead;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p161fg.C18922m;
import p161fg.C18927r;
import p209hg.C20052c;
import p241ij.C20566c;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import wd0.C28926f;
import wd0.C28928h;
import ws.C29210k;

/* renamed from: zh.o1 */
/* loaded from: classes.dex */
public final class C32044o1 {
    public static final b Companion = new b(null);

    /* renamed from: j */
    public static long f147550j = AbstractC0924m0.m3653a7();

    /* renamed from: k */
    private static final Object f147551k = new Object();

    /* renamed from: l */
    private static final InterfaceC24854k f147552l;

    /* renamed from: a */
    private Handler f147553a;

    /* renamed from: b */
    private List f147554b;

    /* renamed from: c */
    private List f147555c;

    /* renamed from: d */
    private long f147556d;

    /* renamed from: e */
    private long f147557e;

    /* renamed from: f */
    private int f147558f;

    /* renamed from: g */
    private int f147559g;

    /* renamed from: h */
    private final InterfaceC24854k f147560h;

    /* renamed from: i */
    private final InterfaceC24854k f147561i;

    /* renamed from: zh.o1$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f147562q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C32044o1 mo12V4() {
            return c.f147563a.m154640a();
        }
    }

    /* renamed from: zh.o1$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C32044o1 m154639a() {
            return (C32044o1) C32044o1.f147552l.getValue();
        }
    }

    /* renamed from: zh.o1$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f147563a = new c();

        /* renamed from: b */
        private static final C32044o1 f147564b = new C32044o1(null);

        private c() {
        }

        /* renamed from: a */
        public final C32044o1 m154640a() {
            return f147564b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.o1$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f147565q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C28926f mo12V4() {
            return AbstractC23306f.m120613R();
        }
    }

    /* renamed from: zh.o1$e */
    /* loaded from: classes3.dex */
    public static final class e extends Handler {

        /* renamed from: a */
        final /* synthetic */ HandlerThread f147566a;

        /* renamed from: b */
        final /* synthetic */ C32044o1 f147567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HandlerThread handlerThread, C32044o1 c32044o1, Looper looper) {
            super(looper);
            this.f147566a = handlerThread;
            this.f147567b = c32044o1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            super.handleMessage(message);
            try {
                switch (message.what) {
                    case 1:
                        this.f147567b.m154594D(message.obj);
                        return;
                    case 2:
                        this.f147567b.m154596F();
                        return;
                    case 3:
                        this.f147567b.m154592B(message.obj);
                        return;
                    case 4:
                        this.f147567b.m154591A();
                        return;
                    case 5:
                        this.f147567b.m154595E(message.obj);
                        return;
                    case 6:
                        this.f147567b.m154593C(message.obj);
                        return;
                    case 7:
                        Object obj = C32044o1.f147551k;
                        C32044o1 c32044o1 = this.f147567b;
                        synchronized (obj) {
                            try {
                                if (c32044o1.m154633u() == this) {
                                    c32044o1.m154623R(null);
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            } finally {
                            }
                        }
                        this.f147566a.quitSafely();
                        return;
                    default:
                        return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DeleteConversationController", e11);
            }
            AbstractC23350e.m122776f("DeleteConversationController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.o1$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f147568q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C28928h mo12V4() {
            return AbstractC23306f.m120728y0();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f147562q);
        f147552l = m129210a;
    }

    public /* synthetic */ C32044o1(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: A */
    public final void m154591A() {
        Handler handler;
        Handler handler2 = this.f147553a;
        if (handler2 != null) {
            handler2.removeMessages(2);
        }
        List list = this.f147554b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29210k.Companion.m145896a().m145863c1(((C20566c) it.next()).m106988b(), null);
            }
        }
        this.f147554b = null;
        this.f147556d = 0L;
        this.f147557e = 0L;
        this.f147558f = 0;
        this.f147559g = 0;
        C19669z.Companion.m103232a().m103198O0();
        if (this.f147555c.isEmpty() && (handler = this.f147553a) != null) {
            handler.sendEmptyMessageDelayed(7, 5000L);
        }
    }

    /* renamed from: B */
    public final void m154592B(Object obj) {
        if (obj instanceof String) {
            List list = this.f147554b;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (AbstractC19074t.m100204b(((C20566c) it.next()).m106988b(), obj)) {
                        it.remove();
                        break;
                    }
                }
            }
            List list2 = this.f147554b;
            if (list2 == null || list2.isEmpty()) {
                C23744a.Companion.m124119a().m124116d(136, new Object[0]);
            }
        }
    }

    /* renamed from: C */
    public final void m154593C(Object obj) {
        if (obj == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (C20566c c20566c : (List) obj) {
            String m106988b = c20566c.m106988b();
            if (!AbstractC25495a.m132084i(m106988b) && !AbstractC25495a.m132081f(m106988b)) {
                if (c20566c.m106991e()) {
                    C18922m.m99141t().m99145O(m106988b);
                }
                linkedList.add(m106988b);
                C29210k.Companion.m145896a().m145863c1(m106988b, c20566c.m106989c());
            }
        }
        m154613v().m101508a(new C28928h.b(linkedList));
    }

    /* renamed from: D */
    public final void m154594D(Object obj) {
        if (obj == null) {
            return;
        }
        m154609l((List) obj);
    }

    /* renamed from: E */
    public final void m154595E(Object obj) {
        if (obj != null) {
            this.f147555c.removeAll((List) obj);
        }
        if (this.f147555c.isEmpty() && !m154614G()) {
            C23744a.Companion.m124119a().m124116d(135, new Object[0]);
            Handler handler = this.f147553a;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(7, 5000L);
            }
        }
    }

    /* renamed from: F */
    public final void m154596F() {
        List list = this.f147554b;
        this.f147554b = null;
        this.f147556d = 0L;
        this.f147557e = 0L;
        this.f147558f = 0;
        this.f147559g = 0;
        m154609l(list);
    }

    /* renamed from: I */
    private final Handler m154597I(HandlerThread handlerThread) {
        return new e(handlerThread, this, handlerThread.getLooper());
    }

    /* renamed from: J */
    private final void m154598J() {
        synchronized (f147551k) {
            try {
                Handler handler = this.f147553a;
                if (handler == null) {
                    HandlerThread handlerThread = new HandlerThread("DeletingConversationController");
                    handlerThread.start();
                    this.f147553a = m154597I(handlerThread);
                } else {
                    AbstractC19074t.m100205c(handler);
                    handler.removeMessages(7);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: U */
    public static /* synthetic */ void m154599U(C32044o1 c32044o1, String str, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c32044o1.m154625T(str, list, z11);
    }

    /* renamed from: l */
    private final void m154609l(List list) {
        if (list != null && !list.isEmpty()) {
            this.f147555c.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C20566c c20566c = (C20566c) it.next();
                String m106988b = c20566c.m106988b();
                AbstractC18428c.m97659b(C23288a.f113033a, m106988b, 0, new Runnable() { // from class: zh.n1

                    /* renamed from: q */
                    public final /* synthetic */ String f147486q;

                    /* renamed from: r */
                    public final /* synthetic */ C20566c f147487r;

                    public /* synthetic */ RunnableC32029n1(String m106988b2, C20566c c20566c2) {
                        r2 = m106988b2;
                        r3 = c20566c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C32044o1.m154610m(C32044o1.this, r2, r3);
                    }
                }, 2, null);
            }
            Handler handler = this.f147553a;
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(5, list));
            }
        }
    }

    /* renamed from: m */
    public static final void m154610m(C32044o1 c32044o1, String str, C20566c c20566c) {
        AbstractC19074t.m100208f(c32044o1, "this$0");
        AbstractC19074t.m100208f(str, "$conversationId");
        AbstractC19074t.m100208f(c20566c, "$conversation");
        try {
            c32044o1.m154611o().m101508a(new C28926f.b(str, c20566c.m106989c(), c20566c.m106990d(), c20566c.m106987a()));
            C19669z.Companion.m103232a().m103198O0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteConversationController", e11);
        }
    }

    /* renamed from: o */
    private final C28926f m154611o() {
        return (C28926f) this.f147560h.getValue();
    }

    /* renamed from: r */
    public static final C32044o1 m154612r() {
        return Companion.m154639a();
    }

    /* renamed from: v */
    private final C28928h m154613v() {
        return (C28928h) this.f147561i.getValue();
    }

    /* renamed from: G */
    public final boolean m154614G() {
        boolean z11;
        List list = this.f147554b;
        if (list != null && !list.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /* renamed from: H */
    public final boolean m154615H(List list) {
        List list2;
        AbstractC19074t.m100208f(list, "deletingConversation");
        try {
            if (C18922m.m99141t().m99165z()) {
                C20052c m99159s = C18922m.m99141t().m99159s();
                AbstractC19074t.m100205c(m99159s);
                list2 = m99159s.m104165n();
            } else {
                list2 = null;
            }
            if (list2 == null || list2.size() - 1 > list.size()) {
                return false;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C18927r user = ((ChatHead) it.next()).getUser();
                if (!user.m99173b()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (AbstractC19074t.m100204b(((C20566c) it2.next()).m106988b(), user.f94425p)) {
                            break;
                        }
                    }
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteConversationController", e11);
            return false;
        }
    }

    /* renamed from: K */
    public final void m154616K(String str, List list, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(list, "deletedUidList");
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "chat_delete_withdraw", C0815e1.m2075D().m2088B(list, "chat_delete_withdraw")), z11);
    }

    /* renamed from: L */
    public final void m154617L(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        long max = Math.max(0L, C23793c.Companion.m124321a().mo124319c() - m154630q());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dur", max);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteConversationController", e11);
        }
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, "inbox_chat_delete_undo", C0815e1.m2075D().m2088B(m154635x(), "inbox_chat_delete_undo"), jSONObject.toString()), z11);
    }

    /* renamed from: M */
    public final void m154618M(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        C0815e1.m2075D().m2100V(new C23648e(1, str, 1, "inbox_chat_delete_undo_toast", C0815e1.m2075D().m2088B(m154635x(), "inbox_chat_delete_undo_toast")), z11);
    }

    /* renamed from: N */
    public final boolean m154619N() {
        return AbstractC0924m0.m3194Kc();
    }

    /* renamed from: O */
    public final boolean m154620O() {
        List list = this.f147554b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC25495a.m132081f(((C20566c) it.next()).m106988b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m154621P() {
        List list = this.f147554b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC25495a.m132084i(((C20566c) it.next()).m106988b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: Q */
    public final void m154622Q(List list) {
        AbstractC19074t.m100208f(list, "conversations");
        try {
            m154598J();
            Handler handler = this.f147553a;
            if (handler == null) {
                return;
            }
            boolean z11 = !m154615H(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C20566c c20566c = (C20566c) it.next();
                c20566c.m106992f(z11);
                if (AbstractC25495a.m132081f(c20566c.m106988b())) {
                    this.f147558f = C19669z.Companion.m103232a().m103223i0();
                } else if (AbstractC25495a.m132084i(c20566c.m106988b())) {
                    this.f147559g = C19669z.Companion.m103232a().m103222h0();
                }
            }
            List list2 = this.f147554b;
            if (list2 != null && !list2.isEmpty()) {
                handler.sendMessage(handler.obtainMessage(1, this.f147554b));
            }
            this.f147554b = new ArrayList(list);
            this.f147556d = C23793c.Companion.m124321a().mo124319c();
            this.f147557e = f147550j;
            handler.sendMessage(handler.obtainMessage(6, this.f147554b));
            handler.removeMessages(7);
            handler.removeMessages(2);
            handler.sendEmptyMessageDelayed(2, this.f147557e);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteConversationController", e11);
        }
    }

    /* renamed from: R */
    public final void m154623R(Handler handler) {
        this.f147553a = handler;
    }

    /* renamed from: S */
    public final void m154624S(String str, List list) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(list, "deletedUidList");
        m154599U(this, str, list, false, 4, null);
    }

    /* renamed from: T */
    public final void m154625T(String str, List list, boolean z11) {
        String str2;
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(list, "deletedUidList");
        if (list.isEmpty()) {
            return;
        }
        if (z11) {
            str2 = "chat_delete_media_only";
        } else {
            str2 = "chat_delete";
        }
        String str3 = str2;
        C0815e1.m2075D().m2100V(new C23648e(1, str, 0, str3, C0815e1.m2075D().m2088B(list, str3)), false);
    }

    /* renamed from: j */
    public final void m154626j() {
        try {
            Handler handler = this.f147553a;
            if (handler != null) {
                handler.sendEmptyMessage(4);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteConversationController", e11);
        }
    }

    /* renamed from: k */
    public final void m154627k(String str) {
        Handler handler;
        AbstractC19074t.m100208f(str, "ownerId");
        try {
            if (this.f147554b != null && (handler = this.f147553a) != null) {
                handler.sendMessage(handler.obtainMessage(3, str));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteConversationController", e11);
        }
    }

    /* renamed from: n */
    public final void m154628n() {
        try {
            Handler handler = this.f147553a;
            if (handler != null) {
                handler.removeMessages(2);
            }
            Handler handler2 = this.f147553a;
            if (handler2 != null) {
                handler2.sendEmptyMessage(2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteConversationController", e11);
        }
    }

    /* renamed from: p */
    public final C20566c m154629p(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        for (C20566c c20566c : this.f147555c) {
            if (AbstractC19074t.m100204b(c20566c.m106988b(), str)) {
                return c20566c;
            }
        }
        return null;
    }

    /* renamed from: q */
    public final long m154630q() {
        return this.f147556d;
    }

    /* renamed from: s */
    public final int m154631s() {
        return this.f147558f;
    }

    /* renamed from: t */
    public final int m154632t() {
        return this.f147559g;
    }

    /* renamed from: u */
    public final Handler m154633u() {
        return this.f147553a;
    }

    /* renamed from: w */
    public final int m154634w() {
        List list = this.f147554b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: x */
    public final List m154635x() {
        ArrayList arrayList = new ArrayList();
        List list = this.f147554b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C20566c) it.next()).m106988b());
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public final C20566c m154636y(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        List<C20566c> list = this.f147554b;
        if (list != null) {
            for (C20566c c20566c : list) {
                if (AbstractC19074t.m100204b(c20566c.m106988b(), str)) {
                    return c20566c;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: z */
    public final C20566c m154637z(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        C20566c m154636y = m154636y(str);
        if (m154636y == null) {
            return m154629p(str);
        }
        return m154636y;
    }

    private C32044o1() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        this.f147555c = new LinkedList();
        m129210a = AbstractC24856m.m129210a(d.f147565q);
        this.f147560h = m129210a;
        m129210a2 = AbstractC24856m.m129210a(f.f147568q);
        this.f147561i = m129210a2;
    }
}
