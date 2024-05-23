package androidx.work;

import android.content.Context;

/* renamed from: androidx.work.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC2243k0 {

    /* renamed from: a */
    private static final String f9455a = AbstractC2253u.m11897i("WorkerFactory");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.k0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2243k0 {
        a() {
        }

        @Override // androidx.work.AbstractC2243k0
        /* renamed from: a */
        public AbstractC2252t mo11876a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static AbstractC2243k0 m11875c() {
        return new a();
    }

    /* renamed from: a */
    public abstract AbstractC2252t mo11876a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final AbstractC2252t m11877b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        AbstractC2252t mo11876a = mo11876a(context, str, workerParameters);
        if (mo11876a == null) {
            try {
                cls = Class.forName(str).asSubclass(AbstractC2252t.class);
            } catch (Throwable th2) {
                AbstractC2253u.m11895e().mo11901d(f9455a, "Invalid class: " + str, th2);
                cls = null;
            }
            if (cls != null) {
                try {
                    mo11876a = (AbstractC2252t) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th3) {
                    AbstractC2253u.m11895e().mo11901d(f9455a, "Could not instantiate " + str, th3);
                }
            }
        }
        if (mo11876a != null && mo11876a.isUsed()) {
            throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        return mo11876a;
    }
}
