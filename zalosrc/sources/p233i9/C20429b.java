package p233i9;

import android.content.Context;
import com.google.firebase.AbstractC6596l;
import com.google.firebase.C6576e;
import com.google.firebase.perf.application.C6658a;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* renamed from: i9.b */
/* loaded from: classes3.dex */
public class C20429b {
    public C20429b(C6576e c6576e, AbstractC6596l abstractC6596l, Executor executor) {
        Context m33612j = c6576e.m33612j();
        C6662a.m34042g().m34060O(m33612j);
        C6658a m34003b = C6658a.m34003b();
        m34003b.m34016i(m33612j);
        m34003b.m34017j(new C20433f());
        if (abstractC6596l != null) {
            AppStartTrace m34141n = AppStartTrace.m34141n();
            m34141n.m34151C(m33612j);
            executor.execute(new AppStartTrace.RunnableC6690c(m34141n));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
