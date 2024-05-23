package pa;

import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4184h;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import p385oa.C24141a;

/* renamed from: pa.a */
/* loaded from: classes3.dex */
public class C24701a {

    /* renamed from: c */
    private static final C4184h f118666c = new C4184h("StreamingFormatChecker", "");

    /* renamed from: a */
    private final LinkedList f118667a = new LinkedList();

    /* renamed from: b */
    private long f118668b = -1;

    /* renamed from: a */
    public void m128271a(C24141a c24141a) {
        if (c24141a.m126122g() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f118667a.add(Long.valueOf(elapsedRealtime));
        if (this.f118667a.size() > 5) {
            this.f118667a.removeFirst();
        }
        if (this.f118667a.size() == 5 && elapsedRealtime - ((Long) AbstractC4205o.m19722k((Long) this.f118667a.peekFirst())).longValue() < 5000) {
            long j11 = this.f118668b;
            if (j11 == -1 || elapsedRealtime - j11 >= TimeUnit.SECONDS.toMillis(5L)) {
                this.f118668b = elapsedRealtime;
                f118666c.m19694f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
            }
        }
    }
}
