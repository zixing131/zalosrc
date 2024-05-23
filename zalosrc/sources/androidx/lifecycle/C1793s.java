package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public final class C1793s {

    /* renamed from: a */
    public static final C1793s f7393a = new C1793s();

    /* renamed from: b */
    private static final AtomicBoolean f7394b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.s$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1773i {
        @Override // androidx.lifecycle.AbstractC1773i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
            ReportFragment.f7278q.m9248c(activity);
        }
    }

    private C1793s() {
    }

    /* renamed from: a */
    public static final void m9363a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        if (f7394b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC19074t.m100206d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
