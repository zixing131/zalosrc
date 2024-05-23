package ad0;

import fg0.ThreadFactoryC18928a;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: ad0.p */
/* loaded from: classes4.dex */
public final class C0754p extends ScheduledThreadPoolExecutor {

    /* renamed from: p */
    public static final C0754p f2525p = new C0754p();

    private C0754p() {
        super(2, new ThreadFactoryC18928a("RenderLottieWorker"));
    }
}
