package p141ex;

import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.UUID;
import p042bx.AbstractC3152g;

/* renamed from: ex.b */
/* loaded from: classes4.dex */
public class C18627b implements InvocationHandler {

    /* renamed from: a */
    private Object f93724a;

    /* renamed from: c */
    private final Exception f93726c;

    /* renamed from: d */
    private final String f93727d;

    /* renamed from: e */
    private long f93728e;

    /* renamed from: f */
    private final Runnable f93729f = new a();

    /* renamed from: b */
    private final long f93725b = SystemClock.elapsedRealtime();

    /* renamed from: ex.b$a */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC18630e.m98439b(-1, C18627b.this.f93726c, C18627b.this.f93728e, 30000L, UUID.randomUUID().toString(), true, "-");
            AbstractC3152g.m15868a().removeCallbacks(C18627b.this.f93729f);
        }
    }

    public C18627b(Object obj, Exception exc, String str) {
        this.f93724a = obj;
        this.f93726c = exc;
        this.f93727d = str;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC3152g.m15868a().postDelayed(this.f93729f, 30000L);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f93728e = elapsedRealtime - this.f93725b;
        Object invoke = method.invoke(this.f93724a, objArr);
        AbstractC18630e.m98439b(-1, this.f93726c, this.f93728e, SystemClock.elapsedRealtime() - elapsedRealtime, this.f93727d, false, "-");
        AbstractC3152g.m15868a().removeCallbacks(this.f93729f);
        return invoke;
    }
}
