package p234ia;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p633x5.HandlerC29332a;

/* renamed from: ia.g */
/* loaded from: classes3.dex */
public class C20460g {

    /* renamed from: b */
    private static final Object f100662b = new Object();

    /* renamed from: c */
    private static C20460g f100663c;

    /* renamed from: a */
    private final Handler f100664a;

    private C20460g(Looper looper) {
        this.f100664a = new HandlerC29332a(looper);
    }

    /* renamed from: a */
    public static C20460g m106488a() {
        C20460g c20460g;
        synchronized (f100662b) {
            try {
                if (f100663c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f100663c = new C20460g(handlerThread.getLooper());
                }
                c20460g = f100663c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20460g;
    }

    /* renamed from: d */
    public static Executor m106489d() {
        return EnumC20477t.f100713p;
    }

    /* renamed from: b */
    public AbstractC22888j m106491b(final Callable callable) {
        final C22890k c22890k = new C22890k();
        m106492c(new Runnable() { // from class: ia.s
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C22890k c22890k2 = c22890k;
                try {
                    c22890k2.m117596c(callable2.call());
                } catch (MlKitException e11) {
                    c22890k2.m117595b(e11);
                } catch (Exception e12) {
                    c22890k2.m117595b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e12));
                }
            }
        });
        return c22890k.m117594a();
    }

    /* renamed from: c */
    public void m106492c(Runnable runnable) {
        m106489d().execute(runnable);
    }
}
