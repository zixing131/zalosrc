package tg;

import android.os.Build;
import com.zing.zalo.MainApplication;
import fg0.ThreadFactoryC18928a;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p354n3.C23528a;

/* renamed from: tg.b */
/* loaded from: classes3.dex */
public abstract class AbstractC26651b {

    /* renamed from: c */
    protected static ExecutorService f126127c;

    /* renamed from: a */
    protected Map f126128a = new HashMap();

    /* renamed from: b */
    protected C23528a f126129b = new C23528a(MainApplication.getAppContext());

    static {
        int i11;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(100, new Comparator() { // from class: tg.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m136798c;
                m136798c = AbstractC26651b.m136798c((Runnable) obj, (Runnable) obj2);
                return m136798c;
            }
        });
        if (Build.VERSION.SDK_INT >= 24) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        f126127c = new ThreadPoolExecutor(1, i11, 60L, TimeUnit.SECONDS, priorityBlockingQueue, new ThreadFactoryC18928a("BaseDownloader"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ int m136798c(Runnable runnable, Runnable runnable2) {
        try {
            InterfaceC26654e interfaceC26654e = (InterfaceC26654e) runnable;
            InterfaceC26654e interfaceC26654e2 = (InterfaceC26654e) runnable2;
            if (interfaceC26654e.mo136808d() < interfaceC26654e2.mo136808d()) {
                return -1;
            }
            if (interfaceC26654e.mo136808d() > interfaceC26654e2.mo136808d()) {
                return 1;
            }
            return (int) (interfaceC26654e.mo136807a() - interfaceC26654e2.mo136807a());
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public boolean m136799b(String str) {
        return this.f126128a.containsKey(str);
    }
}
