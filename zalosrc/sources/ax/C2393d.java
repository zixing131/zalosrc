package ax;

import android.os.Handler;
import android.os.Looper;
import fg0.ThreadFactoryC18928a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ax.d */
/* loaded from: classes4.dex */
public class C2393d implements InterfaceC2392c {

    /* renamed from: a */
    private final Handler f9965a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    ThreadPoolExecutor f9966b = new ThreadPoolExecutor(4, 8, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(1000), new ThreadFactoryC18928a("UseCaseThreadPoolScheduler"));
}
