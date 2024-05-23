package p361nb;

import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import fg0.ThreadFactoryC18928a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p420pb.C24709a;
import p442qb.AbstractC25211a;
import p478rb.C25720a;
import p478rb.C25722c;
import p523tb.C26614a;
import sb.AbstractC26215a;
import sb.AbstractC26216b;

/* renamed from: nb.d */
/* loaded from: classes.dex */
public abstract class AbstractC23647d {

    /* renamed from: g */
    public static long f114553g;

    /* renamed from: a */
    public static int f114547a = AbstractC25211a.m130467b(CoreUtility.getAppContext());

    /* renamed from: b */
    public static String f114548b = "";

    /* renamed from: c */
    private static C23643a f114549c = null;

    /* renamed from: d */
    private static b f114550d = b.ZALO_PROCESS;

    /* renamed from: e */
    private static final Map f114551e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    private static final Random f114552f = new Random();

    /* renamed from: h */
    private static boolean f114554h = false;

    /* renamed from: i */
    private static final ExecutorService f114555i = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("ActionLog"));

    /* renamed from: j */
    static boolean f114556j = false;

    /* renamed from: nb.d$a */
    /* loaded from: classes3.dex */
    public class a implements C25722c.a {

        /* renamed from: a */
        final /* synthetic */ String f114557a;

        /* renamed from: b */
        final /* synthetic */ File f114558b;

        a(String str, File file) {
            this.f114557a = str;
            this.f114558b = file;
        }

        @Override // p478rb.C25722c.a
        /* renamed from: a */
        public void mo123909a(C25720a c25720a) {
            int m132628a;
            if (c25720a != null) {
                try {
                    m132628a = c25720a.m132628a();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else {
                m132628a = -1;
            }
            int m130473h = AbstractC25211a.m130473h(CoreUtility.getAppContext());
            AbstractC23647d.m123901k("Retry Count: " + m130473h);
            if (m130473h > 5 && m132628a != 502) {
                AbstractC23647d.m123901k("Fail!!! Clear file : " + this.f114557a);
                AbstractC25211a.m130478m("");
                AbstractC25211a.m130479n(0);
                m130473h = 0;
            }
            C26614a.m136643c(CoreUtility.getAppContext()).m136646d(AbstractC26216b.m134775c(m130473h, 300000L));
            AbstractC23647d.f114556j = false;
        }

        @Override // p478rb.C25722c.a
        /* renamed from: b */
        public void mo123910b(Object obj) {
            try {
                AbstractC23647d.m123901k("Upload success : " + this.f114557a);
                if (this.f114558b.exists()) {
                    this.f114558b.delete();
                }
                AbstractC25211a.m130478m("");
                AbstractC25211a.m130475j(System.currentTimeMillis());
                C26614a.m136643c(CoreUtility.getAppContext()).m136646d(AbstractC23647d.f114553g);
                AbstractC25211a.m130479n(0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            AbstractC23647d.f114556j = false;
        }

        @Override // p478rb.C25722c.a
        /* renamed from: c */
        public void mo123911c(long j11, String str) {
        }
    }

    /* renamed from: nb.d$b */
    /* loaded from: classes.dex */
    public enum b {
        ZALO_PROCESS
    }

    /* renamed from: b */
    public static void m123892b(long j11) {
        try {
            Map map = f114551e;
            if (map.containsKey(Long.valueOf(j11))) {
                C23643a c23643a = (C23643a) map.get(Long.valueOf(j11));
                c23643a.m123887a();
                map.remove(Long.valueOf(j11));
                m123899i(c23643a);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m123893c() {
        try {
            C23643a c23643a = f114549c;
            if (c23643a != null) {
                c23643a.m123887a();
                m123899i(f114549c);
                f114549c = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    private static void m123894d() {
        try {
            if (f114554h) {
                return;
            }
            f114554h = true;
            m123901k("Exporting report.......");
            String m134772b = AbstractC26215a.m134772b(CoreUtility.getAppContext(), C24709a.m128299t(CoreUtility.getAppContext()).m128316v());
            C24709a.m128299t(CoreUtility.getAppContext()).m128310b();
            AbstractC25211a.m130478m(m134772b);
            f114554h = false;
        } catch (Exception unused) {
            f114554h = false;
        }
    }

    /* renamed from: e */
    public static void m123895e() {
        C26614a.m136643c(CoreUtility.getAppContext()).m136644a();
    }

    /* renamed from: f */
    public static void m123896f(String str) {
        f114550d = b.ZALO_PROCESS;
        f114548b = str;
        f114553g = AbstractC25211a.m130468c(CoreUtility.getAppContext());
        C26614a.m136643c(CoreUtility.getAppContext()).m136647e();
    }

    /* renamed from: g */
    public static void m123897g(String str) {
        C23643a c23643a = new C23643a(str, "");
        c23643a.f114537e = true;
        m123899i(c23643a);
    }

    /* renamed from: h */
    public static void m123898h(String str, String str2) {
        C23643a c23643a = new C23643a(str, "", str2);
        c23643a.f114537e = true;
        m123899i(c23643a);
    }

    /* renamed from: i */
    private static void m123899i(C23643a c23643a) {
        try {
            if (f114547a == 0) {
                return;
            }
            if (c23643a != null) {
                AbstractC23660q.f114615a.add(c23643a);
            }
            if (AbstractC23660q.f114615a.size() >= 20) {
                f114555i.execute(new Runnable() { // from class: nb.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC23647d.m123902l();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m123900j() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (TextUtils.isEmpty(AbstractC25211a.m130469d(CoreUtility.getAppContext()))) {
                m123894d();
            }
            String m130469d = AbstractC25211a.m130469d(CoreUtility.getAppContext());
            if (TextUtils.isEmpty(m130469d)) {
                m123901k("Empty file!!!");
                AbstractC25211a.m130475j(System.currentTimeMillis());
                C26614a.m136643c(CoreUtility.getAppContext()).m136646d(f114553g);
                f114556j = false;
                return;
            }
            File file = new File(m130469d);
            if (file.exists()) {
                m123901k("Uploading file : " + m130469d);
                new C25722c(CoreUtility.getAppContext(), CoreUtility.f89236l).m132643o(f114548b, m130469d, new a(m130469d, file), CoreUtility.f89232h, CoreUtility.f89226b, CoreUtility.f89227c);
            } else {
                AbstractC25211a.m130478m("");
                int m130473h = AbstractC25211a.m130473h(CoreUtility.getAppContext());
                m123901k("Retry Count: " + m130473h);
                C26614a.m136643c(CoreUtility.getAppContext()).m136646d(AbstractC26216b.m134775c(m130473h, 300000L));
                f114556j = false;
            }
            m123901k("Total submit time:" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e11) {
            e11.printStackTrace();
            f114556j = false;
        }
    }

    /* renamed from: k */
    public static void m123901k(String str) {
    }

    /* renamed from: l */
    public static void m123902l() {
        try {
            if (f114554h) {
                return;
            }
            if (f114549c != null) {
                AbstractC23660q.f114615a.add(f114549c);
                f114549c = null;
            }
            if (AbstractC23660q.f114615a.size() > 0) {
                C24709a.m128299t(CoreUtility.getAppContext()).m128302F();
            }
            if (f114550d == b.ZALO_PROCESS) {
                long m130466a = AbstractC25211a.m130466a(CoreUtility.getAppContext());
                long currentTimeMillis = System.currentTimeMillis();
                if (m130466a != 0 && currentTimeMillis - m130466a > f114553g * 1.5d) {
                    m123908r();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m123903m(int i11) {
        AbstractC25211a.m130476k(i11);
    }

    /* renamed from: n */
    public static void m123904n(int i11) {
        AbstractC25211a.m130477l(i11 * 60000);
    }

    /* renamed from: o */
    public static long m123905o(String str) {
        long j11 = -1;
        try {
            j11 = f114552f.nextLong();
            C23643a c23643a = new C23643a(str, "");
            c23643a.m123888b();
            f114551e.put(Long.valueOf(j11), c23643a);
            return j11;
        } catch (Exception e11) {
            e11.printStackTrace();
            return j11;
        }
    }

    /* renamed from: p */
    public static void m123906p(String str) {
        try {
            m123907q(str, "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public static void m123907q(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C23643a c23643a = f114549c;
            if (c23643a != null) {
                m123899i(c23643a);
            }
            C23643a c23643a2 = new C23643a(str, str2);
            f114549c = c23643a2;
            c23643a2.m123888b();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    public static synchronized void m123908r() {
        synchronized (AbstractC23647d.class) {
            if (f114556j) {
                return;
            }
            f114556j = true;
            f114555i.execute(new Runnable() { // from class: nb.b
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23647d.m123900j();
                }
            });
        }
    }
}
