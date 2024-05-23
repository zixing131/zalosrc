package p012a6;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC4214r;
import com.google.android.gms.common.internal.C4220t;
import com.google.android.gms.common.internal.InterfaceC4217s;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p342m6.InterfaceC22880f;

/* renamed from: a6.qg */
/* loaded from: classes2.dex */
public final class C0465qg {

    /* renamed from: a */
    private final InterfaceC4217s f1831a;

    /* renamed from: b */
    private final AtomicLong f1832b = new AtomicLong(-1);

    C0465qg(Context context, String str) {
        this.f1831a = AbstractC4214r.m19745b(context, C4220t.m19794a().m19797b("mlkit:vision").m19796a());
    }

    /* renamed from: a */
    public static C0465qg m856a(Context context) {
        return new C0465qg(context, "mlkit:vision");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m857b(long j11, Exception exc) {
        this.f1832b.set(j11);
    }

    /* renamed from: c */
    public final synchronized void m858c(int i11, int i12, long j11, long j12) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f1832b.get() != -1 && elapsedRealtime - this.f1832b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f1831a.mo16707a(new TelemetryData(0, Arrays.asList(new MethodInvocation(i11, i12, 0, j11, j12, null, null, 0)))).mo117576e(new InterfaceC22880f() { // from class: a6.pg
            @Override // p342m6.InterfaceC22880f
            /* renamed from: b */
            public final void mo839b(Exception exc) {
                C0465qg.this.m857b(elapsedRealtime, exc);
            }
        });
    }
}
