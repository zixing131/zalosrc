package gw;

import ae.C0766k;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7959d;
import dj.C17945a0;
import eg0.C18427b;
import gw.C19610a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kw.C21956b;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import p348mi.AbstractC23306f;
import p716zh.C31986k3;
import tj.C26711c;

/* renamed from: gw.a */
/* loaded from: classes4.dex */
public class C19610a {

    /* renamed from: d */
    private static volatile C19610a f97398d;

    /* renamed from: e */
    private static final LinkedList f97399e = new LinkedList();

    /* renamed from: a */
    private boolean f97400a = false;

    /* renamed from: b */
    private int f97401b = 0;

    /* renamed from: c */
    public Handler f97402c = new a(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gw.a$a */
    /* loaded from: classes4.dex */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 12345) {
                C19610a.this.m102632i();
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: gw.a$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f97404a;

        b(List list) {
            this.f97404a = list;
        }

        /* renamed from: d */
        public static /* synthetic */ void m102643d(C26711c c26711c) {
            try {
                C7959d.m41638d1().m41728M2(c26711c);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C21956b.m114655e("Delete failed - errorMessage: " + c20096c, C21956b.d.f108095r);
                C19610a.this.f97400a = false;
                C19610a c19610a = C19610a.this;
                c19610a.f97401b = c19610a.f97401b + 1;
                if (System.currentTimeMillis() - ((C26711c) this.f97404a.get(0)).f126658f > 86400000) {
                    C19610a.this.f97401b = 0;
                    C19610a.this.m102636p();
                    for (C26711c c26711c : this.f97404a) {
                        C23288a.f113033a.mo13474a(new C18427b(c26711c.f126657e, new Runnable() { // from class: gw.b
                            public /* synthetic */ RunnableC19613b() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C19610a.b.m102643d(C26711c.this);
                            }
                        }));
                    }
                    C19610a.this.m102635m(10L);
                    return;
                }
                C19610a.this.m102635m(r6.f97401b * 1000);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C21956b.m114655e("Delete success", C21956b.d.f108095r);
                C19610a.this.f97400a = false;
                C19610a.this.f97401b = 0;
                C19610a.this.m102636p();
                Iterator it = this.f97404a.iterator();
                while (it.hasNext()) {
                    C7959d.m41638d1().m41728M2((C26711c) it.next());
                }
                C19610a.this.m102635m(10L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    private C19610a() {
    }

    /* renamed from: i */
    public void m102632i() {
        if (this.f97400a) {
            return;
        }
        this.f97400a = true;
        try {
            List m102634k = m102634k();
            if (m102634k != null && !m102634k.isEmpty()) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new b(m102634k));
                c0766k.mo1648gb(m102634k, false, C31986k3.f147083a.m154105P1(((C26711c) m102634k.get(0)).f126657e));
                return;
            }
            this.f97400a = false;
            m102636p();
        } catch (Exception unused) {
            this.f97400a = false;
        }
    }

    /* renamed from: j */
    public static synchronized C19610a m102633j() {
        C19610a c19610a;
        synchronized (C19610a.class) {
            try {
                if (f97398d == null) {
                    synchronized (C19610a.class) {
                        try {
                            if (f97398d == null) {
                                f97398d = new C19610a();
                            }
                        } finally {
                        }
                    }
                }
                c19610a = f97398d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c19610a;
    }

    /* renamed from: k */
    private List m102634k() {
        LinkedList linkedList = f97399e;
        synchronized (linkedList) {
            try {
                if (linkedList.size() > 0) {
                    return (List) linkedList.get(0);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public void m102635m(long j11) {
        try {
            Handler handler = this.f97402c;
            if (handler != null && !handler.hasMessages(12345)) {
                this.f97402c.sendEmptyMessageDelayed(12345, j11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m102636p() {
        LinkedList linkedList = f97399e;
        synchronized (linkedList) {
            try {
                if (linkedList.size() > 0) {
                    linkedList.remove(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public void m102637g() {
        try {
            LinkedList linkedList = f97399e;
            synchronized (linkedList) {
                linkedList.clear();
                C7959d.m41638d1().m41715J2();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h */
    public C26711c m102638h(C17945a0 c17945a0, int i11) {
        if (c17945a0 == null || !c17945a0.m95029V3().m41052p() || TextUtils.isEmpty(c17945a0.m94862C4()) || TextUtils.isEmpty(c17945a0.mo95039W2())) {
            return null;
        }
        C26711c c26711c = new C26711c();
        c26711c.f126653a = AbstractC23306f.m120599M0().m103086b();
        c26711c.f126654b = c17945a0.m95029V3();
        c26711c.f126655c = c17945a0.m95041W4();
        c26711c.f126656d = c17945a0.m94862C4();
        c26711c.f126657e = c17945a0.mo95039W2();
        c26711c.f126658f = C23793c.m124316k().mo124314i();
        c26711c.f126659g = i11;
        return c26711c;
    }

    /* renamed from: l */
    public void m102639l() {
        try {
            ArrayList m41806m1 = C7959d.m41638d1().m41806m1();
            synchronized (f97399e) {
                for (int i11 = 0; i11 < m41806m1.size(); i11++) {
                    try {
                        f97399e.add(Collections.singletonList((C26711c) m41806m1.get(i11)));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (f97399e.size() > 0) {
                    m102635m(10L);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public void m102640n(C17945a0 c17945a0) {
        int i11;
        synchronized (f97399e) {
            if (c17945a0.m94847A6()) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            C26711c m102638h = m102638h(c17945a0, i11);
            if (m102638h != null) {
                try {
                    C7959d.m41638d1().m41714J1(m102638h);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                f97399e.add(Collections.singletonList(m102638h));
            }
            if (i11 == 4 || c17945a0.m94889F6()) {
                try {
                    C7959d.m41638d1().m41788h0(c17945a0.mo95039W2());
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
            }
        }
        m102635m(10L);
    }

    /* renamed from: o */
    public void m102641o(List list) {
        int i11;
        if (list != null && !list.isEmpty()) {
            synchronized (f97399e) {
                if (((C17945a0) list.get(0)).m94847A6()) {
                    i11 = 3;
                } else {
                    i11 = 1;
                }
                LinkedList linkedList = new LinkedList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C26711c m102638h = m102638h((C17945a0) it.next(), i11);
                    if (m102638h != null) {
                        try {
                            C7959d.m41638d1().m41714J1(m102638h);
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                        linkedList.add(m102638h);
                    }
                }
                if (!linkedList.isEmpty()) {
                    f97399e.add(linkedList);
                }
            }
            m102635m(10L);
        }
    }
}
