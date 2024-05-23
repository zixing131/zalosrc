package p171fx;

import android.content.Context;
import android.os.Debug;
import android.text.TextUtils;
import androidx.core.content.AbstractC1388a;
import androidx.core.util.C1483e;
import ax.AbstractC2390a;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import fg0.ThreadFactoryC18928a;
import hu.C20128b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23122k6;
import mx.AbstractC23466c;
import mx.AbstractC23473j;
import mx.AbstractC23474k;
import mx.AbstractC23477n;
import mx.C23464a;
import mx.C23470g;
import mx.C23475l;
import mx.C23476m;
import p042bx.C3148c;
import p114dx.C18075a;
import p190gx.AbstractC19676f;
import p333lx.AbstractC22665d;
import p333lx.C22662a;
import p371nv.C23952g;
import zw.AbstractC32562b;
import zw.C32561a;
import zw.C32566f;
import zw.C32567g;

/* renamed from: fx.e */
/* loaded from: classes.dex */
public abstract class AbstractC19164e {

    /* renamed from: a */
    private static InterfaceC19165f f95206a = null;

    /* renamed from: b */
    static Context f95207b = null;

    /* renamed from: c */
    private static ExecutorService f95208c = null;

    /* renamed from: d */
    private static ScheduledExecutorService f95209d = null;

    /* renamed from: e */
    static l f95210e = null;

    /* renamed from: f */
    static String f95211f = null;

    /* renamed from: g */
    static String f95212g = null;

    /* renamed from: h */
    private static boolean f95213h = false;

    /* renamed from: i */
    private static boolean f95214i = false;

    /* renamed from: j */
    private static boolean f95215j = false;

    /* renamed from: k */
    private static boolean f95216k = false;

    /* renamed from: l */
    private static boolean f95217l = false;

    /* renamed from: m */
    private static final List f95218m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    private static final List f95219n = Collections.synchronizedList(new ArrayList());

    /* renamed from: o */
    private static AtomicInteger f95220o = new AtomicInteger(0);

    /* renamed from: p */
    private static AtomicInteger f95221p = new AtomicInteger(0);

    /* renamed from: q */
    private static AtomicInteger f95222q = new AtomicInteger(0);

    /* renamed from: r */
    private static final Object f95223r = new Object();

    /* renamed from: s */
    private static final Runnable f95224s = new d();

    /* renamed from: t */
    private static final Runnable f95225t = new Runnable() { // from class: fx.b
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC19164e.m100532r();
        }
    };

    /* renamed from: u */
    private static Runnable f95226u = new e();

    /* renamed from: v */
    private static Runnable f95227v = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fx.e$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ int f95228b;

        /* renamed from: c */
        final /* synthetic */ byte f95229c;

        a(int i11, byte b11) {
            this.f95228b = i11;
            this.f95229c = b11;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            if (this.f95228b != AbstractC19166g.m100552b()) {
                AbstractC19164e.f95220o.set(0);
                AbstractC19164e.f95221p.set(0);
                AbstractC19164e.f95222q.set(0);
                AbstractC19166g.m100570t(this.f95228b);
            }
            byte b11 = this.f95229c;
            if (b11 != 0) {
                if (b11 != 1) {
                    if (b11 == 2) {
                        AbstractC19164e.f95222q.incrementAndGet();
                    }
                } else {
                    AbstractC19164e.f95221p.incrementAndGet();
                }
            } else {
                AbstractC19164e.f95220o.incrementAndGet();
            }
            if (AbstractC19164e.f95220o.get() > 200 || (System.currentTimeMillis() - AbstractC19166g.m100557g() > 300000 && AbstractC19164e.f95220o.get() > 0)) {
                try {
                    if (!AbstractC23473j.m123236a(AbstractC19164e.f95207b)) {
                        return;
                    }
                    AbstractC23466c.m123219v(((C32566f) AbstractC23477n.m123256d(System.currentTimeMillis(), AbstractC19164e.f95220o.get(), AbstractC19164e.f95221p.get(), AbstractC19164e.f95222q.get(), this.f95228b)).toString(), AbstractC23466c.m123212o("img_cache_io/"));
                    AbstractC19166g.m100574x(System.currentTimeMillis());
                    AbstractC19164e.f95220o.set(0);
                    AbstractC19164e.f95221p.set(0);
                    AbstractC19164e.f95222q.set(0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fx.e$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ long f95230b;

        b(long j11) {
            this.f95230b = j11;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            AbstractC23466c.m123219v(String.valueOf(this.f95230b) + "\n", AbstractC23466c.m123212o("cacheimg_life/"));
        }
    }

    /* renamed from: fx.e$c */
    /* loaded from: classes4.dex */
    class c extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ Object f95231b;

        /* renamed from: c */
        final /* synthetic */ long f95232c;

        /* renamed from: d */
        final /* synthetic */ long f95233d;

        /* renamed from: e */
        final /* synthetic */ boolean f95234e;

        /* renamed from: f */
        final /* synthetic */ boolean f95235f;

        c(Object obj, long j11, long j12, boolean z11, boolean z12) {
            this.f95231b = obj;
            this.f95232c = j11;
            this.f95233d = j12;
            this.f95234e = z11;
            this.f95235f = z12;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            AbstractC23466c.m123219v(new C32567g(this.f95232c, this.f95233d, AbstractC23474k.m123238b(this.f95231b, false), this.f95234e, this.f95235f, CoreUtility.f89233i, 14).toString(), AbstractC23466c.m123212o("media_recorder/"));
        }
    }

    /* renamed from: fx.e$d */
    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C23476m.m123247e() || AbstractC19164e.m100529o(AbstractC19164e.f95211f) || System.currentTimeMillis() - AbstractC19166g.m100559i() < 3000000) {
                return;
            }
            AbstractC19164e.m100514F();
        }
    }

    /* renamed from: fx.e$e */
    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: fx.e$e$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC19160a {
            a() {
            }

            @Override // p171fx.AbstractC19160a
            /* renamed from: a */
            public void mo98440a(List list) {
                long j11;
                long m123204g;
                ArrayList arrayList = new ArrayList();
                File m6963e = AbstractC1388a.m6963e(AbstractC19164e.f95207b);
                int i11 = 0;
                if (m6963e != null) {
                    long m123204g2 = AbstractC23466c.m123204g(m6963e);
                    arrayList.add(AbstractC23477n.m123255c(m6963e.getPath(), m123204g2, C20128b.m104766m(), 0, 1));
                    File[] listFiles = m6963e.listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            long m123204g3 = AbstractC23466c.m123204g(file);
                            arrayList.add(AbstractC23477n.m123255c(file.getPath(), m123204g3, m123204g2, 0, 2));
                            if (file.isDirectory()) {
                                if (ZinstantMetaConstant.MEMORY_CACHING_CONTENT_CACHE.equals(file.getName())) {
                                    arrayList.addAll(AbstractC23466c.m123213p(file, m123204g3, 0, 10));
                                } else {
                                    arrayList.addAll(AbstractC23466c.m123203f(file, m123204g3, 0));
                                }
                            }
                        }
                    }
                }
                File externalCacheDir = AbstractC19164e.f95207b.getExternalCacheDir();
                if (externalCacheDir != null && externalCacheDir.getParentFile() != null) {
                    File parentFile = externalCacheDir.getParentFile();
                    long m123204g4 = AbstractC23466c.m123204g(parentFile);
                    arrayList.add(AbstractC23477n.m123255c(parentFile.getPath(), m123204g4, C20128b.m104763j(), 1, 1));
                    File[] listFiles2 = parentFile.listFiles();
                    if (listFiles2 != null) {
                        int length = listFiles2.length;
                        while (i11 < length) {
                            File file2 = listFiles2[i11];
                            if (file2.isDirectory()) {
                                if ("cacheimg".equals(file2.getName())) {
                                    C1483e m123205h = AbstractC23466c.m123205h(file2);
                                    m123204g = ((Long) m123205h.f6374a).longValue();
                                    AbstractC19164e.m100536v(System.currentTimeMillis() - ((Long) m123205h.f6375b).longValue());
                                } else {
                                    m123204g = AbstractC23466c.m123204g(file2);
                                }
                                long j12 = m123204g;
                                j11 = m123204g4;
                                arrayList.add(AbstractC23477n.m123255c(file2.getPath(), j12, m123204g4, 1, 2));
                                if (file2.isDirectory() && "sticker".equals(file2.getName())) {
                                    arrayList.addAll(AbstractC23466c.m123213p(file2, j12, 1, 10));
                                }
                            } else {
                                j11 = m123204g4;
                            }
                            i11++;
                            m123204g4 = j11;
                        }
                    }
                }
                AbstractC23466c.m123218u(AbstractC19164e.f95207b, arrayList);
                AbstractC19166g.m100572v(System.currentTimeMillis());
            }
        }

        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C23476m.m123248f() || System.currentTimeMillis() - AbstractC19166g.m100555e() < 3000000) {
                return;
            }
            C19168i.m100579c(new a());
        }
    }

    /* renamed from: fx.e$f */
    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: fx.e$f$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC19160a {

            /* renamed from: fx.e$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            class C32821a implements AbstractC22665d.b {
                C32821a() {
                }

                @Override // p333lx.AbstractC22665d.b
                /* renamed from: a */
                public void mo100541a(C22662a c22662a) {
                    AbstractC23466c.m123219v(new C32561a(c22662a.m117281b(), c22662a.m117280a(), c22662a.m117282c(), c22662a.m117283d(), c22662a.m117284e()).toString(), AbstractC23466c.m123212o("sysinfo/"));
                    AbstractC19166g.m100548B(System.currentTimeMillis());
                }

                @Override // p333lx.AbstractC22665d.b
                /* renamed from: b */
                public void mo100542b() {
                }
            }

            a() {
            }

            @Override // p171fx.AbstractC19160a
            /* renamed from: a */
            public void mo98440a(List list) {
                boolean z11;
                if (C23470g.m123227f() && C23470g.m123225c().m123231e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (AbstractC23473j.m123236a(AbstractC19164e.f95207b) && !z11) {
                    AbstractC22665d.m117293b(new C32821a());
                }
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C23476m.m123248f() || Debug.isDebuggerConnected() || System.currentTimeMillis() - AbstractC19166g.m100562l() < 300000) {
                return;
            }
            C19168i.m100579c(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fx.e$g */
    /* loaded from: classes4.dex */
    public class g extends AbstractC19160a {

        /* renamed from: fx.e$g$a */
        /* loaded from: classes4.dex */
        class a implements m {
            a() {
            }

            @Override // p171fx.AbstractC19164e.m
            /* renamed from: a */
            public void mo100543a() {
                AbstractC19166g.m100576z(System.currentTimeMillis());
                AbstractC23466c.m123200c();
            }

            @Override // p171fx.AbstractC19164e.m
            /* renamed from: b */
            public void mo100544b(int i11) {
            }
        }

        g() {
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            l lVar = AbstractC19164e.f95210e;
            if (lVar != null) {
                lVar.mo100545a("", new a());
            }
        }
    }

    /* renamed from: fx.e$h */
    /* loaded from: classes4.dex */
    class h extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ Context f95240b;

        /* renamed from: c */
        final /* synthetic */ C18075a f95241c;

        /* renamed from: d */
        final /* synthetic */ long f95242d;

        /* renamed from: e */
        final /* synthetic */ byte f95243e;

        /* renamed from: f */
        final /* synthetic */ int f95244f;

        /* renamed from: g */
        final /* synthetic */ byte f95245g;

        /* renamed from: fx.e$h$a */
        /* loaded from: classes4.dex */
        class a implements AbstractC22665d.b {

            /* renamed from: a */
            final /* synthetic */ String[] f95246a;

            a(String[] strArr) {
                this.f95246a = strArr;
            }

            @Override // p333lx.AbstractC22665d.b
            /* renamed from: a */
            public void mo100541a(C22662a c22662a) {
                C32561a c32561a = new C32561a(c22662a.m117281b(), c22662a.m117280a(), c22662a.m117282c(), c22662a.m117283d(), c22662a.m117284e());
                String[] strArr = this.f95246a;
                h hVar = h.this;
                AbstractC19164e.m100535u(strArr, hVar.f95242d, hVar.f95241c, hVar.f95243e, hVar.f95244f, hVar.f95245g, c32561a);
            }

            @Override // p333lx.AbstractC22665d.b
            /* renamed from: b */
            public void mo100542b() {
                String[] strArr = this.f95246a;
                h hVar = h.this;
                AbstractC19164e.m100535u(strArr, hVar.f95242d, hVar.f95241c, hVar.f95243e, hVar.f95244f, hVar.f95245g, null);
            }
        }

        h(Context context, C18075a c18075a, long j11, byte b11, int i11, byte b12) {
            this.f95240b = context;
            this.f95241c = c18075a;
            this.f95242d = j11;
            this.f95243e = b11;
            this.f95244f = i11;
            this.f95245g = b12;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            String[] split;
            if (AbstractC23473j.m123236a(this.f95240b) && (split = this.f95241c.m96124a().split("\\[New_stack]")) != null && split.length != 0) {
                AbstractC22665d.m117293b(new a(split));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fx.e$i */
    /* loaded from: classes4.dex */
    public class i extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ C18075a f95248b;

        /* renamed from: c */
        final /* synthetic */ long f95249c;

        i(C18075a c18075a, long j11) {
            this.f95248b = c18075a;
            this.f95249c = j11;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            String[] split = this.f95248b.m96124a().split("\\[New_stack]");
            if (split != null && split.length != 0) {
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        C23952g.m125345j("ANR", AbstractC23477n.m123258f(this.f95249c, this.f95248b.m96126c(), str.replace("\n", "|"), this.f95248b.m96128e(), (byte) -1, -1, (byte) -1, null, this.f95248b.m96127d(), this.f95248b.m96125b()).toString());
                        C3148c.m15842c(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fx.e$j */
    /* loaded from: classes4.dex */
    public class j extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ byte f95250b;

        /* renamed from: c */
        final /* synthetic */ byte f95251c;

        /* renamed from: d */
        final /* synthetic */ String f95252d;

        /* renamed from: e */
        final /* synthetic */ String f95253e;

        /* renamed from: f */
        final /* synthetic */ long f95254f;

        /* renamed from: g */
        final /* synthetic */ long f95255g;

        j(byte b11, byte b12, String str, String str2, long j11, long j12) {
            this.f95250b = b11;
            this.f95251c = b12;
            this.f95252d = str;
            this.f95253e = str2;
            this.f95254f = j11;
            this.f95255g = j12;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            AbstractC19164e.f95218m.add(AbstractC23477n.m123253a(this.f95250b, this.f95251c, this.f95252d, this.f95253e, this.f95254f, this.f95255g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fx.e$k */
    /* loaded from: classes4.dex */
    public class k extends AbstractC19160a {
        k() {
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            if (!AbstractC23473j.m123236a(AbstractC19164e.f95207b)) {
                return;
            }
            int size = list.size();
            StringBuilder sb2 = new StringBuilder();
            synchronized (AbstractC19164e.f95223r) {
                for (int i11 = 0; i11 < size; i11++) {
                    try {
                        sb2.append(((AbstractC32562b) list.get(i11)).toString());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (sb2.length() > 0) {
                AbstractC23466c.m123219v(sb2.toString(), AbstractC23466c.m123212o("core_flow/"));
                AbstractC19166g.m100571u(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: fx.e$l */
    /* loaded from: classes4.dex */
    public interface l {
        /* renamed from: a */
        void mo100545a(String str, m mVar);
    }

    /* renamed from: fx.e$m */
    /* loaded from: classes4.dex */
    public interface m {
        /* renamed from: a */
        void mo100543a();

        /* renamed from: b */
        void mo100544b(int i11);
    }

    /* renamed from: A */
    public static void m100509A(InterfaceC19165f interfaceC19165f) {
        f95206a = (InterfaceC19165f) AbstractC23122k6.m118609a(interfaceC19165f);
    }

    /* renamed from: B */
    public static void m100510B(boolean z11) {
        f95215j = z11;
    }

    /* renamed from: C */
    public static boolean m100511C() {
        if (C23476m.m123248f() && !Debug.isDebuggerConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static void m100512D() {
        if (f95217l) {
            return;
        }
        f95217l = true;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC18928a("ZAM"));
        f95209d = newSingleThreadScheduledExecutor;
        Runnable runnable = f95224s;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(runnable, 60000L, 3600000L, timeUnit);
        f95209d.scheduleAtFixedRate(f95225t, 60000L, 3600000L, timeUnit);
        f95209d.scheduleAtFixedRate(f95226u, 60000L, 3600000L, timeUnit);
        f95209d.scheduleAtFixedRate(f95227v, 60000L, 300000L, timeUnit);
    }

    /* renamed from: E */
    public static void m100513E() {
        C19168i.m100579c(new g());
    }

    /* renamed from: F */
    public static void m100514F() {
        f95206a.mo100546a();
    }

    /* renamed from: i */
    public static void m100523i() {
        if (!C23476m.m123248f()) {
            return;
        }
        f95208c.execute(new Runnable() { // from class: fx.d
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23466c.m123200c();
            }
        });
    }

    /* renamed from: j */
    public static void m100524j() {
        f95213h = false;
    }

    /* renamed from: k */
    public static void m100525k() {
        ScheduledExecutorService scheduledExecutorService = f95209d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(f95227v, 0L, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: l */
    public static String m100526l(boolean z11, int i11, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        return new C23464a(AbstractC23466c.m123215r(z11), new File(AbstractC23466c.m123206i("/zalo/zam/")) + AbstractC23466c.m123216s(uuid, currentTimeMillis, i11, str, str2)).m123197a();
    }

    /* renamed from: m */
    public static void m100527m(Context context, l lVar, final String str, final String str2, boolean z11) {
        if (f95216k) {
            f95213h = true;
            return;
        }
        f95207b = (Context) AbstractC23122k6.m118609a(context);
        AbstractC19166g.m100566p(context);
        f95208c = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("ZAM"));
        new C19167h(AbstractC2390a.m12454a());
        f95210e = (l) AbstractC23122k6.m118609a(lVar);
        f95211f = str;
        f95212g = str2;
        f95214i = true;
        f95215j = z11;
        f95208c.execute(new Runnable() { // from class: fx.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19164e.m100531q(str2, str);
            }
        });
        f95216k = true;
        f95213h = true;
    }

    /* renamed from: n */
    public static boolean m100528n() {
        return f95213h;
    }

    /* renamed from: o */
    static boolean m100529o(String str) {
        String m100551a = AbstractC19166g.m100551a();
        if (m100551a != null && m100551a.equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m100530p() {
        return f95215j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m100531q(String str, String str2) {
        AbstractC23466c.m123199b();
        if (m100529o(str2)) {
            AbstractC23466c.m123200c();
            AbstractC19166g.m100569s(str2);
        }
        AbstractC22665d.m117292a(f95207b);
        AbstractC19676f.m103248k();
        m100512D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m100532r() {
        if (!C23476m.m123248f() || System.currentTimeMillis() - AbstractC19166g.m100558h() < 3000000) {
            return;
        }
        AbstractC23466c.m123201d("database/", false);
        AbstractC23466c.m123201d("uithread/", false);
        AbstractC23466c.m123201d("network/", false);
        AbstractC23466c.m123201d("chat_head_hit_io/", false);
        AbstractC23466c.m123201d("worker/", false);
        AbstractC23466c.m123201d("core_flow/", false);
        AbstractC23466c.m123201d("img_cache_io/", false);
        AbstractC23466c.m123201d("cacheimg_life/", false);
        AbstractC23466c.m123201d("sysinfo/", false);
        AbstractC23466c.m123201d("custom_log/", false);
        AbstractC23466c.m123201d("battery/wakelock/", false);
        AbstractC23466c.m123201d("battery/wakeup/", false);
        AbstractC23466c.m123201d("battery/bg_network/", false);
        AbstractC23466c.m123201d("media_recorder/", false);
        AbstractC23466c.m123201d("battery/gps/", false);
        AbstractC19166g.m100575y(System.currentTimeMillis());
    }

    /* renamed from: s */
    public static void m100533s(Context context, C18075a c18075a) {
        if (c18075a != null && !TextUtils.isEmpty(c18075a.m96124a().trim()) && !Debug.isDebuggerConnected() && c18075a.m96128e() != 0) {
            C19168i.m100579c(new i(c18075a, System.currentTimeMillis()));
        }
    }

    /* renamed from: t */
    public static void m100534t(Context context, C18075a c18075a, int i11) {
        byte b11;
        m100533s(context, c18075a);
        if (c18075a != null && !TextUtils.isEmpty(c18075a.m96124a().trim()) && C23476m.m123248f() && !Debug.isDebuggerConnected()) {
            if (C23470g.m123227f() && C23470g.m123225c().m123231e()) {
                b11 = 1;
            } else {
                b11 = 0;
            }
            C19168i.m100579c(new h(context, c18075a, System.currentTimeMillis(), b11, i11, C23475l.m123239c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static void m100535u(String[] strArr, long j11, C18075a c18075a, byte b11, int i11, byte b12, C32561a c32561a) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                AbstractC23466c.m123219v(AbstractC23477n.m123258f(j11, c18075a.m96126c(), str.replace("\n", "|"), c18075a.m96128e(), b11, i11, b12, c32561a, c18075a.m96127d(), c18075a.m96125b()).toString(), AbstractC23466c.m123212o("uithread/"));
            }
        }
    }

    /* renamed from: v */
    public static void m100536v(long j11) {
        if (C23476m.m123248f() && j11 >= 0) {
            C19168i.m100579c(new b(j11));
        }
    }

    /* renamed from: w */
    public static void m100537w(byte b11, byte b12, String str, String str2, long j11) {
        if (C23476m.m123248f() && !Debug.isDebuggerConnected()) {
            C19168i.m100579c(new j(b11, b12, str, str2, System.currentTimeMillis(), j11));
            List list = f95218m;
            if (list.size() > 50 || (!list.isEmpty() && System.currentTimeMillis() - AbstractC19166g.m100553c() > 30000)) {
                C19168i.m100580d(new k(), list);
            }
        }
    }

    /* renamed from: x */
    public static void m100538x(byte b11, int i11) {
        if (!C23476m.m123248f()) {
            return;
        }
        C19168i.m100579c(new a(i11, b11));
    }

    /* renamed from: y */
    public static void m100539y(long j11, Object obj, boolean z11, boolean z12) {
        if (!m100511C()) {
            return;
        }
        C19168i.m100579c(new c(obj, System.currentTimeMillis(), j11, z11, z12));
    }

    /* renamed from: z */
    public static void m100540z(boolean z11) {
        f95214i = z11;
    }
}
