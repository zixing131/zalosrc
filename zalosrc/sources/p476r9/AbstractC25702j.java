package p476r9;

import com.google.firebase.perf.metrics.Trace;
import p319l9.C22152a;
import p345m9.AbstractC22960g;

/* renamed from: r9.j */
/* loaded from: classes3.dex */
public abstract class AbstractC25702j {

    /* renamed from: a */
    private static final C22152a f122719a = C22152a.m115524e();

    /* renamed from: a */
    public static Trace m132616a(Trace trace, AbstractC22960g.a aVar) {
        if (aVar.m117691d() > 0) {
            trace.putMetric(EnumC25694b.FRAMES_TOTAL.toString(), aVar.m117691d());
        }
        if (aVar.m117690c() > 0) {
            trace.putMetric(EnumC25694b.FRAMES_SLOW.toString(), aVar.m117690c());
        }
        if (aVar.m117689b() > 0) {
            trace.putMetric(EnumC25694b.FRAMES_FROZEN.toString(), aVar.m117689b());
        }
        f122719a.m115525a("Screen trace: " + trace.m34165e() + " _fr_tot:" + aVar.m117691d() + " _fr_slo:" + aVar.m117690c() + " _fr_fzn:" + aVar.m117689b());
        return trace;
    }
}
