package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p195h2.InterfaceC19715a;
import s00.AbstractC26080o;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC19715a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    /* loaded from: classes.dex */
    public static class C1842a {
        /* renamed from: c */
        public static void m9529c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.n
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j11) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    /* loaded from: classes.dex */
    public static class C1843b {
        /* renamed from: a */
        public static Handler m9530a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    /* loaded from: classes.dex */
    public static class C1844c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static void m9523l(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.m
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1854j.m9578i(context);
            }
        });
    }

    @Override // p195h2.InterfaceC19715a
    /* renamed from: a */
    public List mo8640a() {
        return Collections.emptyList();
    }

    @Override // p195h2.InterfaceC19715a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1844c mo8641b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1844c();
        }
        m9525g(context.getApplicationContext());
        return new C1844c();
    }

    /* renamed from: g */
    void m9525g(final Context context) {
        C1842a.m9529c(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.m9520i(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m9520i(final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C1843b.m9530a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: androidx.profileinstaller.l
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m9523l(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + AbstractC26080o.a.f124275b);
    }
}
