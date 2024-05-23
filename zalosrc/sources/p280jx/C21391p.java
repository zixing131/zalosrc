package p280jx;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.os.RemoteException;
import java.util.Arrays;
import mm0.AbstractC23350e;
import p171fx.AbstractC19166g;

/* renamed from: jx.p */
/* loaded from: classes4.dex */
public class C21391p extends AbstractC21378c {

    /* renamed from: a */
    private final NetworkStats.Bucket f104266a = AbstractC21381f.m110840a();

    /* renamed from: b */
    private final NetworkStatsManager f104267b;

    /* renamed from: c */
    private long f104268c;

    /* renamed from: d */
    private long f104269d;

    public C21391p(Context context) {
        Object systemService;
        systemService = context.getSystemService((Class<Object>) AbstractC21389n.m110848a());
        this.f104267b = AbstractC21390o.m110849a(systemService);
        this.f104268c = Long.MIN_VALUE;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000e */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m110850g(long[] jArr, int i11, int i12, long j11, long j12) {
        NetworkStats querySummary;
        boolean hasNextBucket;
        int state;
        int i13;
        long rxBytes;
        long txBytes;
        querySummary = this.f104267b.querySummary(i11, null, j11, j12);
        while (hasNextBucket) {
            querySummary.getNextBucket(this.f104266a);
            state = this.f104266a.getState();
            if (state == 2) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            int i14 = i12 | i13;
            long j13 = jArr[i14];
            rxBytes = this.f104266a.getRxBytes();
            jArr[i14] = j13 + rxBytes;
            int i15 = i13 | i12 | 1;
            long j14 = jArr[i15];
            txBytes = this.f104266a.getTxBytes();
            jArr[i15] = j14 + txBytes;
        }
        querySummary.close();
    }

    @Override // p280jx.AbstractC21378c
    /* renamed from: c */
    public boolean mo110833c(long[] jArr) {
        try {
            Arrays.fill(jArr, 0L);
            m110850g(jArr, 0, 2, this.f104268c, this.f104269d);
            m110850g(jArr, 1, 0, this.f104268c, this.f104269d);
            return true;
        } catch (RemoteException | NullPointerException e11) {
            AbstractC23350e.m122775e("NwStatsManagerBCol", "Unable to get bytes transferred", e11);
            return false;
        }
    }

    @Override // p280jx.AbstractC21378c
    /* renamed from: d */
    public long mo110834d(C21377b c21377b, C21376a c21376a, long j11, long j12) {
        this.f104268c = j11;
        if (j12 - j11 > 86400000) {
            this.f104269d = j11 + 86400000;
        } else {
            this.f104269d = j12;
        }
        if (c21377b.m110829b(c21376a)) {
            C21379d c21379d = c21376a.f104257r;
            long j13 = c21379d.f104263q + c21379d.f104262p + c21379d.f104265s + c21379d.f104264r;
            AbstractC19166g.m100550D(j13);
            AbstractC19166g.m100549C(j12);
            return j13;
        }
        return 0L;
    }

    @Override // p280jx.AbstractC21378c
    /* renamed from: e */
    public boolean mo110835e() {
        return true;
    }

    @Override // p280jx.AbstractC21378c
    /* renamed from: f */
    public void mo110836f(C21377b c21377b, C21376a c21376a) {
    }
}
