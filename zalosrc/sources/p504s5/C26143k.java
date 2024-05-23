package p504s5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: s5.k */
/* loaded from: classes2.dex */
final class C26143k implements InterfaceC26141i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C26143k(AbstractC26142j abstractC26142j) {
    }

    @Override // p504s5.InterfaceC26141i
    /* renamed from: a */
    public final ExecutorService mo134508a(int i11, ThreadFactory threadFactory, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i11, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
