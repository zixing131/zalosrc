package ki;

import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.NoWebviewInstalledActivity;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import java.lang.Thread;
import li.AbstractC22490a;
import on0.AbstractC24342w;
import p248iy.AbstractC20887g;
import p307kv.AbstractC21954k;
import pm0.AbstractC24845f;

/* renamed from: ki.c */
/* loaded from: classes.dex */
public final class C21731c implements Thread.UncaughtExceptionHandler {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f105519a;

    /* renamed from: ki.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m112155a() {
            Thread.setDefaultUncaughtExceptionHandler(new C21731c(null, 1, 0 == true ? 1 : 0));
        }
    }

    public C21731c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f105519a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private final String m112153a(long j11) {
        long m104530f;
        m104530f = AbstractC20104d.m104530f(j11 / 1048576.0d);
        return m104530f + " MB";
    }

    /* renamed from: b */
    private final void m112154b() {
        String m112153a = m112153a(Runtime.getRuntime().maxMemory());
        String m112153a2 = m112153a(Runtime.getRuntime().totalMemory());
        String m112153a3 = m112153a(Runtime.getRuntime().freeMemory());
        String m112153a4 = m112153a(Debug.getNativeHeapAllocatedSize());
        AbstractC22490a.m116283f("MEMORY_MAX_JAVA_HEAP", m112153a);
        AbstractC22490a.m116283f("MEMORY_TOTAL_JAVA_HEAP", m112153a2);
        AbstractC22490a.m116283f("MEMORY_FREE_JAVA_HEAP", m112153a3);
        AbstractC22490a.m116283f("MEMORY_NATIVE_HEAP_ALLOCATED", m112153a4);
        AbstractC20887g.m109217D(120012, null, 2, null);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
        String m129183b;
        boolean m127149O;
        AbstractC19074t.m100208f(thread, "thread");
        AbstractC19074t.m100208f(th2, "throwable");
        boolean z11 = true;
        try {
            try {
                if (th2 instanceof OutOfMemoryError) {
                    m112154b();
                }
                m129183b = AbstractC24845f.m129183b(th2);
                m127149O = AbstractC24342w.m127149O(m129183b, "MissingWebViewPackageException", false, 2, null);
                if (m127149O) {
                    AbstractC21954k.a aVar = AbstractC21954k.Companion;
                    MainApplication.C6895a c6895a = MainApplication.Companion;
                    if (aVar.m114619l(c6895a.m35500c()) == null) {
                        Context m35500c = c6895a.m35500c();
                        Intent intent = new Intent(m35500c, (Class<?>) NoWebviewInstalledActivity.class);
                        intent.setFlags(268533760);
                        m35500c.startActivity(intent);
                        try {
                            System.exit(1);
                            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                        } catch (Exception e11) {
                            e = e11;
                            z11 = false;
                            e.printStackTrace();
                            if (!z11 || (uncaughtExceptionHandler2 = this.f105519a) == null) {
                                return;
                            }
                            uncaughtExceptionHandler2.uncaughtException(thread, th2);
                        } catch (Throwable th3) {
                            th = th3;
                            z11 = false;
                            if (z11 && (uncaughtExceptionHandler = this.f105519a) != null) {
                                uncaughtExceptionHandler.uncaughtException(thread, th2);
                            }
                            throw th;
                        }
                    }
                }
                uncaughtExceptionHandler2 = this.f105519a;
                if (uncaughtExceptionHandler2 == null) {
                    return;
                }
            } catch (Exception e12) {
                e = e12;
            }
            uncaughtExceptionHandler2.uncaughtException(thread, th2);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public /* synthetic */ C21731c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Thread.getDefaultUncaughtExceptionHandler() : uncaughtExceptionHandler);
    }
}
