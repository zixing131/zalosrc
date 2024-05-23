package p248iy;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import bf0.C2793a;
import bn0.AbstractC2933b;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fm0.AbstractC19026c;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19047d0;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.C20097d;
import hm0.InterfaceC20098e;
import ho0.AbstractC20110a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km0.AbstractC21770e;
import me0.AbstractC23041d2;
import mn0.InterfaceC23370h;
import p248iy.C20882b;
import pm0.AbstractC24856m;
import pm0.EnumC24858o;
import pm0.InterfaceC24854k;

/* renamed from: iy.b */
/* loaded from: classes.dex */
public final class C20882b implements Handler.Callback {
    public static final b Companion = new b(null);

    /* renamed from: v */
    private static final InterfaceC24854k f102580v;

    /* renamed from: p */
    private final InterfaceC24854k f102581p;

    /* renamed from: q */
    private List f102582q;

    /* renamed from: r */
    private SparseArray f102583r;

    /* renamed from: s */
    private SparseArray f102584s;

    /* renamed from: t */
    private long f102585t;

    /* renamed from: u */
    private boolean f102586u;

    /* renamed from: iy.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f102587q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C20882b mo12V4() {
            return new C20882b(null);
        }
    }

    /* renamed from: iy.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        static final /* synthetic */ InterfaceC23370h[] f102588a = {AbstractC19061k0.m100173f(new C19047d0(AbstractC19061k0.m100169b(b.class), "instance", "getInstance()Lcom/zing/zalo/qos/QOSBackgroundWorker;"))};

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m109143a() {
            AbstractC20110a.f98889a.mo104548a("forceSaveAllQOS", new Object[0]);
            m109144b().m109137h();
        }

        /* renamed from: b */
        public final C20882b m109144b() {
            return (C20882b) C20882b.f102580v.getValue();
        }
    }

    /* renamed from: iy.b$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20098e {

        /* renamed from: a */
        final /* synthetic */ File f102589a;

        /* renamed from: b */
        final /* synthetic */ C20882b f102590b;

        c(File file, C20882b c20882b) {
            this.f102589a = file;
            this.f102590b = c20882b;
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC20110a.f98889a.mo104548a("upload qos (size " + this.f102589a.length() + ") error " + c20096c, new Object[0]);
            AbstractC23041d2.m118208g(AbstractC20886f.m109203c());
            this.f102590b.m109141o(false);
            AbstractC19026c.m100084b(CoreUtility.getAppContext(), (System.currentTimeMillis() - AbstractC20886f.m109205e()) + 300000);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC20110a.f98889a.mo104548a("upload qos (size " + this.f102589a.length() + ") success " + obj, new Object[0]);
            AbstractC23041d2.m118208g(AbstractC20886f.m109202b());
            AbstractC23041d2.m118208g(AbstractC20886f.m109203c());
            this.f102590b.m109141o(false);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
            AbstractC19074t.m100208f(str, "des");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iy.b$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Handler mo12V4() {
            Handler handler = new Handler(C2793a.f11144a.m13457b(), C20882b.this);
            handler.sendEmptyMessageDelayed(106, 300000L);
            return handler;
        }
    }

    static {
        InterfaceC24854k m129211b;
        m129211b = AbstractC24856m.m129211b(EnumC24858o.f119258q, a.f102587q);
        f102580v = m129211b;
    }

    public /* synthetic */ C20882b(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    private final void m109129c(boolean z11) {
        try {
            m109135k().sendMessage(m109135k().obtainMessage(104, z11 ? 1 : 0, 0));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d */
    private final void m109130d(boolean z11) {
        if (!z11 && Math.abs(System.currentTimeMillis() - this.f102585t) < 60000 && this.f102582q.size() < 10) {
            return;
        }
        m109136n(this.f102582q);
        this.f102582q.clear();
        m109135k().sendEmptyMessage(105);
    }

    /* renamed from: e */
    static /* synthetic */ void m109131e(C20882b c20882b, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c20882b.m109130d(z11);
    }

    /* renamed from: f */
    private final void m109132f() {
        try {
            if (this.f102586u || !AbstractC21770e.f105722d.m112304a().mo112303e()) {
                return;
            }
            File file = new File(AbstractC20886f.m109202b());
            if (file.length() <= 102400 && Math.abs(System.currentTimeMillis() - AbstractC19026c.m100083a(CoreUtility.getAppContext())) <= AbstractC20886f.m109205e()) {
                return;
            }
            if (file.exists()) {
                this.f102586u = true;
                AbstractC19026c.m100084b(CoreUtility.getAppContext(), System.currentTimeMillis());
                C20097d c20097d = new C20097d();
                AbstractC20887g.m109227e(AbstractC20886f.m109202b(), AbstractC20886f.m109203c());
                c cVar = new c(file, this);
                c20097d.m104500f(cVar);
                new Thread(new Runnable() { // from class: iy.a

                    /* renamed from: q */
                    public final /* synthetic */ C20882b.c f102579q;

                    public /* synthetic */ RunnableC20881a(C20882b.c cVar2) {
                        r2 = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20882b.m109133g(C20097d.this, r2);
                    }
                }).start();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            this.f102586u = false;
        }
    }

    /* renamed from: g */
    public static final void m109133g(C20097d c20097d, c cVar) {
        AbstractC19074t.m100208f(c20097d, "$resUpload");
        AbstractC19074t.m100208f(cVar, "$uploadListener");
        try {
            c20097d.m104498d(AbstractC20886f.m109206f(), AbstractC20886f.m109203c(), null, CoreUtility.f89232h, CoreUtility.f89226b, CoreUtility.f89227c);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            cVar.mo2128a(new C20096c(112, AbstractC20095b.f98833e));
        }
    }

    /* renamed from: j */
    public static final void m109134j() {
        Companion.m109143a();
    }

    /* renamed from: k */
    private final Handler m109135k() {
        return (Handler) this.f102581p.getValue();
    }

    /* renamed from: n */
    private final void m109136n(List list) {
        try {
            if (list.size() == 0) {
                return;
            }
            File file = new File(AbstractC20886f.m109202b());
            if (file.length() > 1048576) {
                file.delete();
                file.createNewFile();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                try {
                    List list2 = list;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String m109197x = ((C20885e) it.next()).m109197x();
                        if (m109197x.length() > 0) {
                            bufferedWriter.write(m109197x);
                        }
                    }
                    List list3 = list2;
                    AbstractC2933b.m13890a(bufferedWriter, null);
                    AbstractC2933b.m13890a(fileWriter, null);
                    AbstractC20110a.f98889a.mo104548a("saveQOSToFileInternal: " + list.size() + " items", new Object[0]);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2933b.m13890a(fileWriter, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: h */
    public final void m109137h() {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        m109138i(str, CoreUtility.f89236l);
        m109129c(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C20883c c20883c;
        boolean z11;
        int i11;
        AbstractC19074t.m100208f(message, "msg");
        try {
            c20883c = null;
            z11 = true;
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
        switch (message.what) {
            case 101:
                Object obj = message.obj;
                if (obj != null) {
                    C20885e c20885e = (C20885e) obj;
                    AbstractC20110a.f98889a.m104564x("QOS-Detail").mo104556o(8, "command(" + c20885e.m109174a() + "), subcommand(" + c20885e.m109180g() + "), retCode(" + c20885e.m109178e() + "), format(" + ((int) c20885e.m109176c()) + "), exeTime(" + c20885e.m109175b() + "), startTime(" + c20885e.m109179f() + "), param:" + c20885e.m109177d(), new Object[0]);
                    this.f102582q.add(c20885e);
                    m109131e(this, false, 1, null);
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.qos.QOSPacket");
            case 102:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    C20883c c20883c2 = (C20883c) obj2;
                    AbstractC20110a.f98889a.m104564x("QOS-Action").mo104556o(8, "isSuccess(" + c20883c2.m109154h() + "), retCodeQOS(" + c20883c2.m109156j() + "), command(" + c20883c2.m109148b() + "), subcommand(" + c20883c2.m109158l() + "), exeTime(" + c20883c2.m109159m() + "), startTime(" + c20883c2.m109157k() + "), param:" + c20883c2.m109150d(), new Object[0]);
                    if (c20883c2.m109151e() == 0) {
                        if (this.f102584s.indexOfKey(c20883c2.m109148b()) >= 0) {
                            c20883c = (C20883c) this.f102584s.get(c20883c2.m109148b());
                        } else {
                            this.f102584s.put(c20883c2.m109148b(), c20883c2);
                        }
                    } else if (this.f102583r.indexOfKey(c20883c2.m109148b()) >= 0) {
                        c20883c = (C20883c) this.f102583r.get(c20883c2.m109148b());
                    } else {
                        this.f102583r.put(c20883c2.m109148b(), c20883c2);
                    }
                    if (c20883c != null && !AbstractC19074t.m100204b(c20883c, c20883c2)) {
                        c20883c.m109160n(c20883c2);
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.qos.QOSItemInfo");
            case 103:
                if (this.f102583r.size() != 0) {
                    i11 = this.f102583r.size();
                    AbstractC20887g.m109219F(this.f102583r, this.f102582q, message.arg1, message.arg2);
                } else {
                    i11 = 0;
                }
                if (this.f102584s.size() != 0) {
                    i11 += this.f102584s.size();
                    AbstractC20887g.m109219F(this.f102584s, this.f102582q, message.arg1, message.arg2);
                }
                AbstractC20110a.f98889a.mo104548a(AbstractC19074t.m100216n("push action to qos: ", Integer.valueOf(i11)), new Object[0]);
                return false;
            case 104:
                if (message.arg1 != 1) {
                    z11 = false;
                }
                m109130d(z11);
                return false;
            case 105:
                m109132f();
                return false;
            case 106:
                m109137h();
                m109135k().removeMessages(106);
                m109135k().sendEmptyMessageDelayed(106, 300000L);
                return false;
            default:
                return false;
        }
    }

    /* renamed from: i */
    public final void m109138i(String str, int i11) {
        int parseInt;
        AbstractC19074t.m100208f(str, "uid");
        try {
            Message obtainMessage = m109135k().obtainMessage();
            AbstractC19074t.m100207e(obtainMessage, "handler.obtainMessage()");
            obtainMessage.what = 103;
            if (str.length() == 0) {
                parseInt = 0;
            } else {
                parseInt = Integer.parseInt(str);
            }
            obtainMessage.arg1 = parseInt;
            obtainMessage.arg2 = i11;
            m109135k().sendMessage(obtainMessage);
            m109129c(false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: l */
    public final void m109139l(boolean z11, int i11, int i12, int i13, long j11, String str, long j12, long j13) {
        String str2;
        try {
            if (!AbstractC20887g.m109220G(str)) {
                return;
            }
            C20883c c20883c = new C20883c(0, 0, 0, 0, 0L, 0L, null, 0, 0, 0, 0, 0L, 0L, 8191, null);
            c20883c.m109162p(i12);
            c20883c.m109169w(AbstractC20887g.m109224b());
            c20883c.m109165s(AbstractC20887g.m109225c());
            if (z11) {
                c20883c.m109146A(c20883c.m109159m() + j11);
                c20883c.m109168v(c20883c.m109154h() + 1);
                c20883c.m109161o(c20883c.m109159m());
            } else {
                c20883c.m109167u(c20883c.m109153g() + 1);
            }
            c20883c.m109171y(j12);
            c20883c.m109163q(j13);
            c20883c.m109166t(c20883c.m109152f() + 1);
            c20883c.m109170x(i11);
            c20883c.m109162p(i12);
            c20883c.m109172z(i13);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            c20883c.m109164r(str2);
            Message obtainMessage = m109135k().obtainMessage();
            AbstractC19074t.m100207e(obtainMessage, "handler.obtainMessage()");
            obtainMessage.what = 102;
            obtainMessage.obj = c20883c;
            m109135k().sendMessage(obtainMessage);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: m */
    public final void m109140m(C20885e c20885e) {
        AbstractC19074t.m100208f(c20885e, "packet");
        Message obtainMessage = m109135k().obtainMessage();
        AbstractC19074t.m100207e(obtainMessage, "handler.obtainMessage()");
        obtainMessage.what = 101;
        obtainMessage.obj = c20885e;
        m109135k().sendMessage(obtainMessage);
    }

    /* renamed from: o */
    public final void m109141o(boolean z11) {
        this.f102586u = z11;
    }

    private C20882b() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new d());
        this.f102581p = m129210a;
        this.f102582q = new ArrayList();
        this.f102583r = new SparseArray();
        this.f102584s = new SparseArray();
        this.f102585t = System.currentTimeMillis();
        AbstractC20110a.f98889a.mo104548a("init QOSBackgroundWorker", new Object[0]);
    }
}
