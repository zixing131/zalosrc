package p232i8;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p153f8.C18821f;
import p153f8.InterfaceC18816a;
import p153f8.InterfaceC18822g;
import p183g8.InterfaceC19291a;
import p232i8.C20413q;
import p259j8.C21089c;
import p259j8.C21095i;
import p292k8.AbstractC21569b0;
import p292k8.AbstractC21573d0;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;
import p342m6.InterfaceC22886i;
import p359n8.C23620g;
import p418p8.C24668d;
import p418p8.InterfaceC24673i;

/* renamed from: i8.k */
/* loaded from: classes.dex */
public class C20401k {

    /* renamed from: s */
    static final FilenameFilter f100461s = new FilenameFilter() { // from class: i8.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m106251K;
            m106251K = C20401k.m106251K(file, str);
            return m106251K;
        }
    };

    /* renamed from: a */
    private final Context f100462a;

    /* renamed from: b */
    private final C20417s f100463b;

    /* renamed from: c */
    private final C20407n f100464c;

    /* renamed from: d */
    private final C21095i f100465d;

    /* renamed from: e */
    private final C20397i f100466e;

    /* renamed from: f */
    private final C20422w f100467f;

    /* renamed from: g */
    private final C23620g f100468g;

    /* renamed from: h */
    private final C20381a f100469h;

    /* renamed from: i */
    private final C21089c f100470i;

    /* renamed from: j */
    private final InterfaceC18816a f100471j;

    /* renamed from: k */
    private final InterfaceC19291a f100472k;

    /* renamed from: l */
    private final C20404l0 f100473l;

    /* renamed from: m */
    private C20413q f100474m;

    /* renamed from: n */
    private InterfaceC24673i f100475n = null;

    /* renamed from: o */
    final C22890k f100476o = new C22890k();

    /* renamed from: p */
    final C22890k f100477p = new C22890k();

    /* renamed from: q */
    final C22890k f100478q = new C22890k();

    /* renamed from: r */
    final AtomicBoolean f100479r = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.k$a */
    /* loaded from: classes.dex */
    public class a implements C20413q.a {
        a() {
        }

        @Override // p232i8.C20413q.a
        /* renamed from: a */
        public void mo106296a(InterfaceC24673i interfaceC24673i, Thread thread, Throwable th2) {
            C20401k.this.m106280H(interfaceC24673i, thread, th2);
        }
    }

    /* renamed from: i8.k$b */
    /* loaded from: classes3.dex */
    public class b implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f100481a;

        /* renamed from: b */
        final /* synthetic */ Throwable f100482b;

        /* renamed from: c */
        final /* synthetic */ Thread f100483c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC24673i f100484d;

        /* renamed from: e */
        final /* synthetic */ boolean f100485e;

        /* renamed from: i8.k$b$a */
        /* loaded from: classes3.dex */
        public class a implements InterfaceC22886i {

            /* renamed from: a */
            final /* synthetic */ Executor f100487a;

            /* renamed from: b */
            final /* synthetic */ String f100488b;

            a(Executor executor, String str) {
                this.f100487a = executor;
                this.f100488b = str;
            }

            @Override // p342m6.InterfaceC22886i
            /* renamed from: b */
            public AbstractC22888j mo33968a(C24668d c24668d) {
                String str = null;
                if (c24668d == null) {
                    C18821f.m98795f().m98804k("Received null app settings, cannot send reports at crash time.");
                    return AbstractC22894m.m117604f(null);
                }
                AbstractC22888j[] abstractC22888jArr = new AbstractC22888j[2];
                abstractC22888jArr[0] = C20401k.this.m106253N();
                C20404l0 c20404l0 = C20401k.this.f100473l;
                Executor executor = this.f100487a;
                if (b.this.f100485e) {
                    str = this.f100488b;
                }
                abstractC22888jArr[1] = c20404l0.m106328w(executor, str);
                return AbstractC22894m.m117606h(abstractC22888jArr);
            }
        }

        b(long j11, Throwable th2, Thread thread, InterfaceC24673i interfaceC24673i, boolean z11) {
            this.f100481a = j11;
            this.f100482b = th2;
            this.f100483c = thread;
            this.f100484d = interfaceC24673i;
            this.f100485e = z11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC22888j call() {
            long m106250G = C20401k.m106250G(this.f100481a);
            String m106247D = C20401k.this.m106247D();
            if (m106247D == null) {
                C18821f.m98795f().m98798d("Tried to write a fatal exception while no session was open.");
                return AbstractC22894m.m117604f(null);
            }
            C20401k.this.f100464c.m106356a();
            C20401k.this.f100473l.m106323r(this.f100482b, this.f100483c, m106247D, m106250G);
            C20401k.this.m106278y(this.f100481a);
            C20401k.this.m106294v(this.f100484d);
            C20401k.this.m106277x(new C20393g(C20401k.this.f100467f).toString());
            if (!C20401k.this.f100463b.m106393d()) {
                return AbstractC22894m.m117604f(null);
            }
            Executor m106238c = C20401k.this.f100466e.m106238c();
            return this.f100484d.mo128224a().mo117589r(m106238c, new a(m106238c, m106247D));
        }
    }

    /* renamed from: i8.k$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC22886i {
        c() {
        }

        @Override // p342m6.InterfaceC22886i
        /* renamed from: b */
        public AbstractC22888j mo33968a(Void r12) {
            return AbstractC22894m.m117604f(Boolean.TRUE);
        }
    }

    /* renamed from: i8.k$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC22886i {

        /* renamed from: a */
        final /* synthetic */ AbstractC22888j f100491a;

        /* renamed from: i8.k$d$a */
        /* loaded from: classes.dex */
        public class a implements Callable {

            /* renamed from: a */
            final /* synthetic */ Boolean f100493a;

            /* renamed from: i8.k$d$a$a */
            /* loaded from: classes.dex */
            public class C32840a implements InterfaceC22886i {

                /* renamed from: a */
                final /* synthetic */ Executor f100495a;

                C32840a(Executor executor) {
                    this.f100495a = executor;
                }

                @Override // p342m6.InterfaceC22886i
                /* renamed from: b */
                public AbstractC22888j mo33968a(C24668d c24668d) {
                    if (c24668d != null) {
                        C20401k.this.m106253N();
                        C20401k.this.f100473l.m106327v(this.f100495a);
                        C20401k.this.f100478q.m117598e(null);
                        return AbstractC22894m.m117604f(null);
                    }
                    C18821f.m98795f().m98804k("Received null app settings at app startup. Cannot send cached reports");
                    return AbstractC22894m.m117604f(null);
                }
            }

            a(Boolean bool) {
                this.f100493a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public AbstractC22888j call() {
                if (!this.f100493a.booleanValue()) {
                    C18821f.m98795f().m98802i("Deleting cached crash reports...");
                    C20401k.m106275s(C20401k.this.m106283L());
                    C20401k.this.f100473l.m106326u();
                    C20401k.this.f100478q.m117598e(null);
                    return AbstractC22894m.m117604f(null);
                }
                C18821f.m98795f().m98796b("Sending cached crash reports...");
                C20401k.this.f100463b.m106392c(this.f100493a.booleanValue());
                Executor m106238c = C20401k.this.f100466e.m106238c();
                return d.this.f100491a.mo117589r(m106238c, new C32840a(m106238c));
            }
        }

        d(AbstractC22888j abstractC22888j) {
            this.f100491a = abstractC22888j;
        }

        @Override // p342m6.InterfaceC22886i
        /* renamed from: b */
        public AbstractC22888j mo33968a(Boolean bool) {
            return C20401k.this.f100466e.m106241i(new a(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.k$e */
    /* loaded from: classes.dex */
    public class e implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f100497a;

        /* renamed from: b */
        final /* synthetic */ String f100498b;

        e(long j11, String str) {
            this.f100497a = j11;
            this.f100498b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (!C20401k.this.m106282J()) {
                C20401k.this.f100470i.m109562g(this.f100497a, this.f100498b);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.k$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: p */
        final /* synthetic */ long f100500p;

        /* renamed from: q */
        final /* synthetic */ Throwable f100501q;

        /* renamed from: r */
        final /* synthetic */ Thread f100502r;

        f(long j11, Throwable th2, Thread thread) {
            this.f100500p = j11;
            this.f100501q = th2;
            this.f100502r = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C20401k.this.m106282J()) {
                long m106250G = C20401k.m106250G(this.f100500p);
                String m106247D = C20401k.this.m106247D();
                if (m106247D == null) {
                    C18821f.m98795f().m98804k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C20401k.this.f100473l.m106324s(this.f100501q, this.f100502r, m106247D, m106250G);
                }
            }
        }
    }

    /* renamed from: i8.k$g */
    /* loaded from: classes.dex */
    public class g implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f100504a;

        g(String str) {
            this.f100504a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            C20401k.this.m106277x(this.f100504a);
            return null;
        }
    }

    /* renamed from: i8.k$h */
    /* loaded from: classes3.dex */
    public class h implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f100506a;

        h(long j11) {
            this.f100506a = j11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f100506a);
            C20401k.this.f100472k.mo97167a("_ae", bundle);
            return null;
        }
    }

    public C20401k(Context context, C20397i c20397i, C20422w c20422w, C20417s c20417s, C23620g c23620g, C20407n c20407n, C20381a c20381a, C21095i c21095i, C21089c c21089c, C20404l0 c20404l0, InterfaceC18816a interfaceC18816a, InterfaceC19291a interfaceC19291a) {
        this.f100462a = context;
        this.f100466e = c20397i;
        this.f100467f = c20422w;
        this.f100463b = c20417s;
        this.f100468g = c23620g;
        this.f100464c = c20407n;
        this.f100469h = c20381a;
        this.f100465d = c21095i;
        this.f100470i = c21089c;
        this.f100471j = interfaceC18816a;
        this.f100472k = interfaceC19291a;
        this.f100473l = c20404l0;
    }

    /* renamed from: A */
    private void m106245A(String str) {
        C18821f.m98795f().m98802i("Finalizing native report for session " + str);
        InterfaceC18822g mo33561a = this.f100471j.mo33561a(str);
        File mo33582c = mo33561a.mo33582c();
        AbstractC21569b0.a mo33581b = mo33561a.mo33581b();
        if (m106254O(str, mo33582c, mo33581b)) {
            C18821f.m98795f().m98804k("No native core present");
            return;
        }
        long lastModified = mo33582c.lastModified();
        C21089c c21089c = new C21089c(this.f100468g, str);
        File m123829i = this.f100468g.m123829i(str);
        if (!m123829i.isDirectory()) {
            C18821f.m98795f().m98804k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m106278y(lastModified);
        List m106249F = m106249F(mo33561a, str, this.f100468g, c21089c.m109558b());
        AbstractC20382a0.m106170b(m123829i, m106249F);
        C18821f.m98795f().m98796b("CrashlyticsController#finalizePreviousNativeSession");
        this.f100473l.m106318h(str, m106249F, mo33581b);
        c21089c.m109557a();
    }

    /* renamed from: C */
    private static boolean m106246C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: D */
    public String m106247D() {
        SortedSet m106321n = this.f100473l.m106321n();
        if (!m106321n.isEmpty()) {
            return (String) m106321n.first();
        }
        return null;
    }

    /* renamed from: E */
    private static long m106248E() {
        return m106250G(System.currentTimeMillis());
    }

    /* renamed from: F */
    static List m106249F(InterfaceC18822g interfaceC18822g, String str, C23620g c23620g, byte[] bArr) {
        File m123834o = c23620g.m123834o(str, "user-data");
        File m123834o2 = c23620g.m123834o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20391f("logs_file", "logs", bArr));
        arrayList.add(new C20421v("crash_meta_file", "metadata", interfaceC18822g.mo33583d()));
        arrayList.add(new C20421v("session_meta_file", "session", interfaceC18822g.mo33586g()));
        arrayList.add(new C20421v("app_meta_file", "app", interfaceC18822g.mo33584e()));
        arrayList.add(new C20421v("device_meta_file", "device", interfaceC18822g.mo33580a()));
        arrayList.add(new C20421v("os_meta_file", "os", interfaceC18822g.mo33585f()));
        arrayList.add(m106255P(interfaceC18822g));
        arrayList.add(new C20421v("user_meta_file", "user", m123834o));
        arrayList.add(new C20421v("keys_file", "keys", m123834o2));
        return arrayList;
    }

    /* renamed from: G */
    public static long m106250G(long j11) {
        return j11 / 1000;
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m106251K(File file, String str) {
        return str.startsWith(".ae");
    }

    /* renamed from: M */
    private AbstractC22888j m106252M(long j11) {
        if (m106246C()) {
            C18821f.m98795f().m98804k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return AbstractC22894m.m117604f(null);
        }
        C18821f.m98795f().m98796b("Logging app exception event to Firebase Analytics");
        return AbstractC22894m.m117601c(new ScheduledThreadPoolExecutor(1), new h(j11));
    }

    /* renamed from: N */
    public AbstractC22888j m106253N() {
        ArrayList arrayList = new ArrayList();
        for (File file : m106283L()) {
            try {
                arrayList.add(m106252M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C18821f.m98795f().m98804k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return AbstractC22894m.m117605g(arrayList);
    }

    /* renamed from: O */
    private static boolean m106254O(String str, File file, AbstractC21569b0.a aVar) {
        if (file == null || !file.exists()) {
            C18821f.m98795f().m98804k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C18821f.m98795f().m98800g("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && aVar == null) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private static InterfaceC20425z m106255P(InterfaceC18822g interfaceC18822g) {
        File mo33582c = interfaceC18822g.mo33582c();
        if (mo33582c != null && mo33582c.exists()) {
            return new C20421v("minidump_file", "minidump", mo33582c);
        }
        return new C20391f("minidump_file", "minidump", new byte[]{0});
    }

    /* renamed from: V */
    private AbstractC22888j m106256V() {
        if (this.f100463b.m106393d()) {
            C18821f.m98795f().m98796b("Automatic data collection is enabled. Allowing upload.");
            this.f100476o.m117598e(Boolean.FALSE);
            return AbstractC22894m.m117604f(Boolean.TRUE);
        }
        C18821f.m98795f().m98796b("Automatic data collection is disabled.");
        C18821f.m98795f().m98802i("Notifying that unsent reports are available.");
        this.f100476o.m117598e(Boolean.TRUE);
        AbstractC22888j mo117590s = this.f100463b.m106395i().mo117590s(new c());
        C18821f.m98795f().m98796b("Waiting for send/deleteUnsentReports to be called.");
        return AbstractC20418s0.m106411o(mo117590s, this.f100477p.m117594a());
    }

    /* renamed from: W */
    private void m106257W(String str) {
        List historicalProcessExitReasons;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f100462a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f100473l.m106325t(str, historicalProcessExitReasons, new C21089c(this.f100468g, str), C21095i.m109611i(str, this.f100468g, this.f100466e));
                return;
            } else {
                C18821f.m98795f().m98802i("No ApplicationExitInfo available. Session: " + str);
                return;
            }
        }
        C18821f.m98795f().m98802i("ANR feature enabled, but device is API " + i11);
    }

    /* renamed from: p */
    private static AbstractC21573d0.a m106272p(C20422w c20422w, C20381a c20381a) {
        return AbstractC21573d0.a.m111501b(c20422w.m106428f(), c20381a.f100419f, c20381a.f100420g, c20422w.mo106427a(), EnumC20419t.m106412b(c20381a.f100417d).m106413c(), c20381a.f100421h);
    }

    /* renamed from: q */
    private static AbstractC21573d0.b m106273q() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC21573d0.b.m111508c(AbstractC20395h.m106217m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC20395h.m106224t(), statFs.getBlockCount() * statFs.getBlockSize(), AbstractC20395h.m106230z(), AbstractC20395h.m106218n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: r */
    private static AbstractC21573d0.c m106274r() {
        return AbstractC21573d0.c.m111518a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC20395h.m106201A());
    }

    /* renamed from: s */
    public static void m106275s(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private void m106276w(boolean z11, InterfaceC24673i interfaceC24673i) {
        String str;
        ArrayList arrayList = new ArrayList(this.f100473l.m106321n());
        if (arrayList.size() <= z11) {
            C18821f.m98795f().m98802i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z11 ? 1 : 0);
        if (interfaceC24673i.mo128225b().f118586b.f118594b) {
            m106257W(str2);
        } else {
            C18821f.m98795f().m98802i("ANR feature disabled.");
        }
        if (this.f100471j.mo33564d(str2)) {
            m106245A(str2);
        }
        if (z11 != 0) {
            str = (String) arrayList.get(0);
        } else {
            str = null;
        }
        this.f100473l.m106319i(m106248E(), str);
    }

    /* renamed from: x */
    public void m106277x(String str) {
        long m106248E = m106248E();
        C18821f.m98795f().m98796b("Opening a new session with ID " + str);
        this.f100471j.mo33563c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C20405m.m106335l()), m106248E, AbstractC21573d0.m111497b(m106272p(this.f100467f, this.f100469h), m106274r(), m106273q()));
        this.f100470i.m109560e(str);
        this.f100473l.m106322o(str, m106248E);
    }

    /* renamed from: y */
    public void m106278y(long j11) {
        try {
            if (!this.f100468g.m123825e(".ae" + j11).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e11) {
            C18821f.m98795f().m98805l("Could not create app exception marker file.", e11);
        }
    }

    /* renamed from: B */
    public boolean m106279B(InterfaceC24673i interfaceC24673i) {
        this.f100466e.m106237b();
        if (m106282J()) {
            C18821f.m98795f().m98804k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C18821f.m98795f().m98802i("Finalizing previously open sessions.");
        try {
            m106276w(true, interfaceC24673i);
            C18821f.m98795f().m98802i("Closed all previously open sessions.");
            return true;
        } catch (Exception e11) {
            C18821f.m98795f().m98799e("Unable to finalize previously open sessions.", e11);
            return false;
        }
    }

    /* renamed from: H */
    void m106280H(InterfaceC24673i interfaceC24673i, Thread thread, Throwable th2) {
        m106281I(interfaceC24673i, thread, th2, false);
    }

    /* renamed from: I */
    synchronized void m106281I(InterfaceC24673i interfaceC24673i, Thread thread, Throwable th2, boolean z11) {
        C18821f.m98795f().m98796b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        try {
            AbstractC20418s0.m106402f(this.f100466e.m106241i(new b(System.currentTimeMillis(), th2, thread, interfaceC24673i, z11)));
        } catch (TimeoutException unused) {
            C18821f.m98795f().m98798d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e11) {
            C18821f.m98795f().m98799e("Error handling uncaught exception", e11);
        }
    }

    /* renamed from: J */
    boolean m106282J() {
        C20413q c20413q = this.f100474m;
        if (c20413q != null && c20413q.m106386a()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    List m106283L() {
        return this.f100468g.m123826f(f100461s);
    }

    /* renamed from: Q */
    void m106284Q(String str) {
        this.f100466e.m106240h(new g(str));
    }

    /* renamed from: R */
    public AbstractC22888j m106285R() {
        this.f100477p.m117598e(Boolean.TRUE);
        return this.f100478q.m117594a();
    }

    /* renamed from: S */
    public void m106286S(String str, String str2) {
        try {
            this.f100465d.m109617l(str, str2);
        } catch (IllegalArgumentException e11) {
            Context context = this.f100462a;
            if (context != null && AbstractC20395h.m106228x(context)) {
                throw e11;
            }
            C18821f.m98795f().m98798d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* renamed from: T */
    public void m106287T(String str) {
        this.f100465d.m109618m(str);
    }

    /* renamed from: U */
    public AbstractC22888j m106288U(AbstractC22888j abstractC22888j) {
        if (!this.f100473l.m106320l()) {
            C18821f.m98795f().m98802i("No crash reports are available to be sent.");
            this.f100476o.m117598e(Boolean.FALSE);
            return AbstractC22894m.m117604f(null);
        }
        C18821f.m98795f().m98802i("Crash reports are available to be sent.");
        return m106256V().mo117590s(new d(abstractC22888j));
    }

    /* renamed from: X */
    public void m106289X(Thread thread, Throwable th2) {
        this.f100466e.m106239g(new f(System.currentTimeMillis(), th2, thread));
    }

    /* renamed from: Y */
    public void m106290Y(long j11, String str) {
        this.f100466e.m106240h(new e(j11, str));
    }

    /* renamed from: o */
    public AbstractC22888j m106291o() {
        if (!this.f100479r.compareAndSet(false, true)) {
            C18821f.m98795f().m98804k("checkForUnsentReports should only be called once per execution.");
            return AbstractC22894m.m117604f(Boolean.FALSE);
        }
        return this.f100476o.m117594a();
    }

    /* renamed from: t */
    public AbstractC22888j m106292t() {
        this.f100477p.m117598e(Boolean.FALSE);
        return this.f100478q.m117594a();
    }

    /* renamed from: u */
    public boolean m106293u() {
        if (!this.f100464c.m106357c()) {
            String m106247D = m106247D();
            if (m106247D != null && this.f100471j.mo33564d(m106247D)) {
                return true;
            }
            return false;
        }
        C18821f.m98795f().m98802i("Found previous crash marker.");
        this.f100464c.m106358d();
        return true;
    }

    /* renamed from: v */
    void m106294v(InterfaceC24673i interfaceC24673i) {
        m106276w(false, interfaceC24673i);
    }

    /* renamed from: z */
    public void m106295z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC24673i interfaceC24673i) {
        this.f100475n = interfaceC24673i;
        m106284Q(str);
        C20413q c20413q = new C20413q(new a(), interfaceC24673i, uncaughtExceptionHandler, this.f100471j);
        this.f100474m = c20413q;
        Thread.setDefaultUncaughtExceptionHandler(c20413q);
    }
}
