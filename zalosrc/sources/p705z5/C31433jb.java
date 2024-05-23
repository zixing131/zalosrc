package p705z5;

import android.os.SystemClock;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: z5.jb */
/* loaded from: classes2.dex */
public class C31433jb implements Closeable {

    /* renamed from: w */
    private static final Map f144849w = new HashMap();

    /* renamed from: p */
    private final String f144850p;

    /* renamed from: q */
    private int f144851q;

    /* renamed from: r */
    private double f144852r;

    /* renamed from: s */
    private long f144853s;

    /* renamed from: t */
    private long f144854t;

    /* renamed from: u */
    private long f144855u;

    /* renamed from: v */
    private long f144856v;

    /* JADX INFO: Access modifiers changed from: private */
    public C31433jb(String str) {
        this.f144855u = 2147483647L;
        this.f144856v = -2147483648L;
        this.f144850p = str;
    }

    /* renamed from: a */
    private final void m152277a() {
        this.f144851q = 0;
        this.f144852r = 0.0d;
        this.f144853s = 0L;
        this.f144855u = 2147483647L;
        this.f144856v = -2147483648L;
    }

    /* renamed from: f */
    public static C31433jb m152278f(String str) {
        C31405hb c31405hb;
        C31434jc.m152279a();
        if (!C31434jc.m152280b()) {
            c31405hb = C31405hb.f144776x;
            return c31405hb;
        }
        Map map = f144849w;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C31433jb("detectorTaskWithResource#run"));
        }
        return (C31433jb) map.get("detectorTaskWithResource#run");
    }

    /* renamed from: b */
    public C31433jb mo152245b() {
        this.f144853s = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    /* renamed from: c */
    public void mo152246c(long j11) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j12 = this.f144854t;
        if (j12 != 0 && elapsedRealtimeNanos - j12 >= 1000000) {
            m152277a();
        }
        this.f144854t = elapsedRealtimeNanos;
        this.f144851q++;
        this.f144852r += j11;
        this.f144855u = Math.min(this.f144855u, j11);
        this.f144856v = Math.max(this.f144856v, j11);
        if (this.f144851q % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f144850p, Long.valueOf(j11), Integer.valueOf(this.f144851q), Long.valueOf(this.f144855u), Long.valueOf(this.f144856v), Integer.valueOf((int) (this.f144852r / this.f144851q)));
            C31434jc.m152279a();
        }
        if (this.f144851q % ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE == 0) {
            m152277a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j11 = this.f144853s;
        if (j11 != 0) {
            mo152247d(j11);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    /* renamed from: d */
    public void mo152247d(long j11) {
        mo152246c((SystemClock.elapsedRealtimeNanos() / 1000) - j11);
    }

    public /* synthetic */ C31433jb(String str, AbstractC31419ib abstractC31419ib) {
        this("unusedTag");
    }
}
