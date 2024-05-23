package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2151i0;
import androidx.work.AbstractC2253u;
import androidx.work.C2135a0;
import androidx.work.C2138c;
import androidx.work.EnumC2240j;
import androidx.work.EnumC2242k;
import androidx.work.InterfaceC2257y;
import androidx.work.impl.background.systemjob.C2182m;
import androidx.work.impl.utils.ForceStopRunnable;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p515t2.C26463n;
import p535u2.C26967n;
import p535u2.C26976w;
import p565v2.AbstractC27459m;
import p565v2.AbstractRunnableC27442b;
import p565v2.AbstractRunnableC27470x;
import p565v2.C27466t;
import p565v2.RunnableC27471y;
import p595w2.InterfaceC28696c;

/* renamed from: androidx.work.impl.r0 */
/* loaded from: classes.dex */
public class C2221r0 extends AbstractC2151i0 {

    /* renamed from: k */
    private static final String f9300k = AbstractC2253u.m11897i("WorkManagerImpl");

    /* renamed from: l */
    private static C2221r0 f9301l = null;

    /* renamed from: m */
    private static C2221r0 f9302m = null;

    /* renamed from: n */
    private static final Object f9303n = new Object();

    /* renamed from: a */
    private Context f9304a;

    /* renamed from: b */
    private C2138c f9305b;

    /* renamed from: c */
    private WorkDatabase f9306c;

    /* renamed from: d */
    private InterfaceC28696c f9307d;

    /* renamed from: e */
    private List f9308e;

    /* renamed from: f */
    private C2226u f9309f;

    /* renamed from: g */
    private C27466t f9310g;

    /* renamed from: h */
    private boolean f9311h = false;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f9312i;

    /* renamed from: j */
    private final C26463n f9313j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.r0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static boolean m11744a(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    public C2221r0(Context context, C2138c c2138c, InterfaceC28696c interfaceC28696c, WorkDatabase workDatabase, List list, C2226u c2226u, C26463n c26463n) {
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && a.m11744a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        AbstractC2253u.m11896h(new AbstractC2253u.a(c2138c.m11479j()));
        this.f9304a = applicationContext;
        this.f9307d = interfaceC28696c;
        this.f9306c = workDatabase;
        this.f9309f = c2226u;
        this.f9313j = c26463n;
        this.f9305b = c2138c;
        this.f9308e = list;
        this.f9310g = new C27466t(workDatabase);
        AbstractC2239z.m11854g(list, this.f9309f, interfaceC28696c.mo143751c(), this.f9306c, c2138c);
        this.f9307d.mo143752d(new ForceStopRunnable(applicationContext, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:            r3 = r3.getApplicationContext();     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:            if (androidx.work.impl.C2221r0.f9302m != null) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:            androidx.work.impl.C2221r0.f9302m = androidx.work.impl.AbstractC2223s0.m11747c(r3, r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:            androidx.work.impl.C2221r0.f9301l = androidx.work.impl.C2221r0.f9302m;     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m11727l(Context context, C2138c c2138c) {
        synchronized (f9303n) {
            try {
                C2221r0 c2221r0 = f9301l;
                if (c2221r0 != null && f9302m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    /* renamed from: q */
    public static C2221r0 m11728q() {
        synchronized (f9303n) {
            try {
                C2221r0 c2221r0 = f9301l;
                if (c2221r0 != null) {
                    return c2221r0;
                }
                return f9302m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public static C2221r0 m11729r(Context context) {
        C2221r0 m11728q;
        synchronized (f9303n) {
            try {
                m11728q = m11728q();
                if (m11728q == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m11728q;
    }

    /* renamed from: A */
    public void m11730A(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f9303n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f9312i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f9312i = pendingResult;
                if (this.f9311h) {
                    pendingResult.finish();
                    this.f9312i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: B */
    public void m11731B(C26967n c26967n) {
        this.f9307d.mo143752d(new RunnableC27471y(this.f9309f, new C2155a0(c26967n), true));
    }

    @Override // androidx.work.AbstractC2151i0
    /* renamed from: a */
    public InterfaceC2257y mo11549a(String str) {
        AbstractRunnableC27442b m140468d = AbstractRunnableC27442b.m140468d(str, this);
        this.f9307d.mo143752d(m140468d);
        return m140468d.m140471e();
    }

    @Override // androidx.work.AbstractC2151i0
    /* renamed from: b */
    public InterfaceC2257y mo11550b(String str) {
        AbstractRunnableC27442b m140467c = AbstractRunnableC27442b.m140467c(str, this, true);
        this.f9307d.mo143752d(m140467c);
        return m140467c.m140471e();
    }

    @Override // androidx.work.AbstractC2151i0
    /* renamed from: d */
    public InterfaceC2257y mo11552d(List list) {
        if (!list.isEmpty()) {
            return new C2184c0(this, list).m11673a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // androidx.work.AbstractC2151i0
    /* renamed from: e */
    public InterfaceC2257y mo11553e(String str, EnumC2240j enumC2240j, C2135a0 c2135a0) {
        if (enumC2240j == EnumC2240j.UPDATE) {
            return AbstractC2234w0.m11812c(this, str, c2135a0);
        }
        return m11733n(str, enumC2240j, c2135a0).m11673a();
    }

    @Override // androidx.work.AbstractC2151i0
    /* renamed from: g */
    public InterfaceC2257y mo11555g(String str, EnumC2242k enumC2242k, List list) {
        return new C2184c0(this, str, enumC2242k, list).m11673a();
    }

    @Override // androidx.work.AbstractC2151i0
    /* renamed from: i */
    public LiveData mo11556i(String str) {
        return AbstractC27459m.m140505a(this.f9306c.mo11565L().mo139023y(str), C26976w.f127496z, this.f9307d);
    }

    @Override // androidx.work.AbstractC2151i0
    /* renamed from: j */
    public InterfaceFutureC6534a mo11557j(String str) {
        AbstractRunnableC27470x m140525a = AbstractRunnableC27470x.m140525a(this, str);
        this.f9307d.mo143751c().execute(m140525a);
        return m140525a.m140526b();
    }

    @Override // androidx.work.AbstractC2151i0
    /* renamed from: k */
    public LiveData mo11558k(String str) {
        return AbstractC27459m.m140505a(this.f9306c.mo11565L().mo139020v(str), C26976w.f127496z, this.f9307d);
    }

    /* renamed from: m */
    public InterfaceC2257y m11732m(UUID uuid) {
        AbstractRunnableC27442b m140466b = AbstractRunnableC27442b.m140466b(uuid, this);
        this.f9307d.mo143752d(m140466b);
        return m140466b.m140471e();
    }

    /* renamed from: n */
    public C2184c0 m11733n(String str, EnumC2240j enumC2240j, C2135a0 c2135a0) {
        EnumC2242k enumC2242k;
        if (enumC2240j == EnumC2240j.KEEP) {
            enumC2242k = EnumC2242k.KEEP;
        } else {
            enumC2242k = EnumC2242k.REPLACE;
        }
        return new C2184c0(this, str, enumC2242k, Collections.singletonList(c2135a0));
    }

    /* renamed from: o */
    public Context m11734o() {
        return this.f9304a;
    }

    /* renamed from: p */
    public C2138c m11735p() {
        return this.f9305b;
    }

    /* renamed from: s */
    public C27466t m11736s() {
        return this.f9310g;
    }

    /* renamed from: t */
    public C2226u m11737t() {
        return this.f9309f;
    }

    /* renamed from: u */
    public List m11738u() {
        return this.f9308e;
    }

    /* renamed from: v */
    public C26463n m11739v() {
        return this.f9313j;
    }

    /* renamed from: w */
    public WorkDatabase m11740w() {
        return this.f9306c;
    }

    /* renamed from: x */
    public InterfaceC28696c m11741x() {
        return this.f9307d;
    }

    /* renamed from: y */
    public void m11742y() {
        synchronized (f9303n) {
            try {
                this.f9311h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f9312i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f9312i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public void m11743z() {
        if (Build.VERSION.SDK_INT >= 23) {
            C2182m.m11664b(m11734o());
        }
        m11740w().mo11565L().mo139014p();
        AbstractC2239z.m11855h(m11735p(), m11740w(), m11738u());
    }
}
