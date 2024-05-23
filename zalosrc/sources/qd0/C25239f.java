package qd0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me0.AbstractC23041d2;
import p248iy.AbstractC20887g;
import p716zh.C31986k3;
import pm0.C24848g0;

/* renamed from: qd0.f */
/* loaded from: classes4.dex */
public final class C25239f {

    /* renamed from: a */
    public static final C25239f f121027a = new C25239f();

    /* renamed from: b */
    private static final List f121028b = new LinkedList();

    /* renamed from: c */
    private static final Object f121029c = new Object();

    /* renamed from: d */
    private static final Handler f121030d;

    static {
        HandlerThread handlerThread = new HandlerThread("InstantUploadThread", 5);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: qd0.a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m130550i;
                m130550i = C25239f.m130550i(message);
                return m130550i;
            }
        });
        f121030d = handler;
        handler.sendEmptyMessage(2);
    }

    private C25239f() {
    }

    /* renamed from: i */
    public static final boolean m130550i(Message message) {
        AbstractC19074t.m100208f(message, "msg");
        try {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC23041d2.m118211j(new File(AbstractC20130d.m104861V()));
                }
            } else {
                f121027a.m130551j();
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: j */
    private final void m130551j() {
        C25240g c25240g;
        synchronized (f121029c) {
            try {
                c25240g = null;
                for (C25240g c25240g2 : f121028b) {
                    if (c25240g2.m130601r() == EnumC25241h.f121059p) {
                        if (c25240g != null && c25240g.m130608y() >= c25240g2.m130608y()) {
                        }
                        c25240g = c25240g2;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c25240g != null) {
            c25240g.m130586Q(f121029c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m130552m(String str, String str2, EnumC25242i enumC25242i) {
        boolean z11;
        AbstractC19074t.m100208f(str, "$receiverUid");
        AbstractC19074t.m100208f(str2, "$path");
        AbstractC19074t.m100208f(enumC25242i, "$type");
        try {
            if (!C25243j.m130612a()) {
                return;
            }
            C31986k3 c31986k3 = C31986k3.f147083a;
            if (!c31986k3.m154108R1(str) && (!c31986k3.m154121a2(str) || !c31986k3.m154098K2(str))) {
                z11 = false;
                synchronized (f121029c) {
                    try {
                        Iterator it = f121028b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C25240g) it.next()).m130591h(str2, enumC25242i, str, z11)) {
                                    break;
                                }
                            } else {
                                f121028b.add(new C25240g(str2, enumC25242i, str, z11));
                                String str3 = CoreUtility.f89233i;
                                AbstractC19074t.m100207e(str3, "currentUserUid");
                                AbstractC20887g.m109231i(str3, 19201, "", 0L, 19200, CoreUtility.f89236l);
                                break;
                            }
                        }
                        f121030d.sendEmptyMessage(1);
                    } finally {
                    }
                }
                return;
            }
            z11 = true;
            synchronized (f121029c) {
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: o */
    public static final void m130553o() {
        try {
            synchronized (f121029c) {
                try {
                    Iterator it = f121028b.iterator();
                    while (it.hasNext()) {
                        C25240g c25240g = (C25240g) it.next();
                        it.remove();
                        c25240g.m130588e();
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    public static final void m130554r(String str, EnumC25242i enumC25242i, String str2, boolean z11) {
        AbstractC19074t.m100208f(enumC25242i, "$type");
        try {
            synchronized (f121029c) {
                try {
                    Iterator it = f121028b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C25240g c25240g = (C25240g) it.next();
                        if (c25240g.m130590g(str, enumC25242i, str2, z11)) {
                            c25240g.m130588e();
                            it.remove();
                            break;
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: t */
    public static final void m130555t(String str) {
        AbstractC19074t.m100208f(str, "$receiverUid");
        try {
            synchronized (f121029c) {
                try {
                    Iterator it = f121028b.iterator();
                    while (it.hasNext()) {
                        C25240g c25240g = (C25240g) it.next();
                        if (AbstractC19074t.m100204b(c25240g.m130599p(), str)) {
                            it.remove();
                            c25240g.m130588e();
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    public final boolean m130556f(C25240g c25240g) {
        AbstractC19074t.m100208f(c25240g, "value");
        synchronized (f121029c) {
            Iterator it = f121028b.iterator();
            while (it.hasNext()) {
                if (AbstractC19074t.m100204b(c25240g, (C25240g) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    public final void m130557g() {
        Handler handler = f121030d;
        handler.removeMessages(1);
        handler.sendEmptyMessage(1);
    }

    /* renamed from: h */
    public final C25240g m130558h(String str, EnumC25242i enumC25242i, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str2, "receiverUid");
        try {
            synchronized (f121029c) {
                for (C25240g c25240g : f121028b) {
                    if (c25240g.m130591h(str, enumC25242i, str2, z11)) {
                        return c25240g;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                return null;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: k */
    public final C25240g m130559k(String str, EnumC25242i enumC25242i, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str2, "receiverUid");
        try {
            synchronized (f121029c) {
                Iterator it = f121028b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C25240g c25240g = (C25240g) it.next();
                    if (c25240g.m130591h(str, enumC25242i, str2, z11)) {
                        it.remove();
                        if (c25240g.m130601r() == EnumC25241h.f121061r) {
                            String str3 = CoreUtility.f89233i;
                            AbstractC19074t.m100207e(str3, "currentUserUid");
                            AbstractC20887g.m109231i(str3, 19205, "", 0L, 19200, CoreUtility.f89236l);
                            return c25240g;
                        }
                        c25240g.m130588e();
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                return null;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: l */
    public final void m130560l(String str, EnumC25242i enumC25242i, String str2) {
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str2, "receiverUid");
        f121030d.post(new Runnable() { // from class: qd0.e

            /* renamed from: p */
            public final /* synthetic */ String f121024p;

            /* renamed from: q */
            public final /* synthetic */ String f121025q;

            /* renamed from: r */
            public final /* synthetic */ EnumC25242i f121026r;

            public /* synthetic */ RunnableC25238e(String str22, String str3, EnumC25242i enumC25242i2) {
                r1 = str22;
                r2 = str3;
                r3 = enumC25242i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25239f.m130552m(r1, r2, r3);
            }
        });
    }

    /* renamed from: n */
    public final void m130561n() {
        f121030d.post(new Runnable() { // from class: qd0.c
            @Override // java.lang.Runnable
            public final void run() {
                C25239f.m130553o();
            }
        });
    }

    /* renamed from: p */
    public final void m130562p(C25240g c25240g) {
        synchronized (f121029c) {
            AbstractC19069o0.m100184a(f121028b).remove(c25240g);
        }
    }

    /* renamed from: q */
    public final void m130563q(String str, EnumC25242i enumC25242i, String str2, boolean z11) {
        AbstractC19074t.m100208f(enumC25242i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        f121030d.post(new Runnable() { // from class: qd0.d

            /* renamed from: p */
            public final /* synthetic */ String f121020p;

            /* renamed from: q */
            public final /* synthetic */ EnumC25242i f121021q;

            /* renamed from: r */
            public final /* synthetic */ String f121022r;

            /* renamed from: s */
            public final /* synthetic */ boolean f121023s;

            public /* synthetic */ RunnableC25237d(String str3, EnumC25242i enumC25242i2, String str22, boolean z112) {
                r1 = str3;
                r2 = enumC25242i2;
                r3 = str22;
                r4 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25239f.m130554r(r1, r2, r3, r4);
            }
        });
    }

    /* renamed from: s */
    public final void m130564s(String str) {
        AbstractC19074t.m100208f(str, "receiverUid");
        f121030d.post(new Runnable() { // from class: qd0.b

            /* renamed from: p */
            public final /* synthetic */ String f121019p;

            public /* synthetic */ RunnableC25235b(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25239f.m130555t(r1);
            }
        });
    }

    /* renamed from: u */
    public final void m130565u(C25240g c25240g, long j11) {
        if (c25240g != null) {
            try {
                c25240g.m130587R(j11);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
