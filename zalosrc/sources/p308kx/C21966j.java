package p308kx;

import android.os.PowerManager;
import android.os.SystemClock;
import com.zing.zalocore.CoreUtility;
import java.lang.ref.WeakReference;
import zw.AbstractC32562b;

/* renamed from: kx.j */
/* loaded from: classes4.dex */
public class C21966j extends AbstractC32562b {

    /* renamed from: f */
    final String f108125f;

    /* renamed from: g */
    final int f108126g;

    /* renamed from: h */
    final WeakReference f108127h;

    /* renamed from: l */
    private long f108131l;

    /* renamed from: n */
    private long f108133n;

    /* renamed from: i */
    private boolean f108128i = true;

    /* renamed from: j */
    private boolean f108129j = false;

    /* renamed from: k */
    private int f108130k = 0;

    /* renamed from: m */
    private long f108132m = Long.MAX_VALUE;

    /* renamed from: o */
    private long f108134o = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21966j(PowerManager.WakeLock wakeLock, String str, int i11, long j11) {
        this.f108125f = str;
        this.f108126g = i11;
        this.f108127h = new WeakReference(wakeLock);
        this.f150496a = j11;
        this.f150498c = CoreUtility.f89233i;
    }

    /* renamed from: j */
    private boolean m114702j() {
        if (this.f108129j && this.f108127h.get() == null) {
            return m114704q(SystemClock.uptimeMillis());
        }
        return false;
    }

    /* renamed from: k */
    private boolean m114703k() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.f108132m;
        if (uptimeMillis >= j11) {
            return m114704q(j11);
        }
        return false;
    }

    /* renamed from: q */
    private boolean m114704q(long j11) {
        if (!this.f108129j) {
            return false;
        }
        if (this.f108128i) {
            int i11 = this.f108130k - 1;
            this.f108130k = i11;
            if (i11 != 0) {
                return false;
            }
        }
        this.f108134o = j11;
        this.f108133n += j11 - this.f108131l;
        this.f108132m = Long.MAX_VALUE;
        this.f108129j = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m114705h(long j11) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (j11 >= 0) {
            this.f108132m = j11 + uptimeMillis;
        }
        if (this.f108128i) {
            int i11 = this.f108130k;
            this.f108130k = i11 + 1;
            if (i11 != 0) {
                return false;
            }
        }
        if (this.f108129j) {
            return false;
        }
        this.f108131l = uptimeMillis;
        this.f108129j = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m114706i() {
        boolean m114703k = m114703k();
        boolean m114702j = m114702j();
        if (!m114703k && !m114702j) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public long m114707l() {
        long j11;
        long j12 = this.f108133n;
        if (this.f108129j) {
            j11 = SystemClock.uptimeMillis() - this.f108131l;
        } else {
            j11 = 0;
        }
        return j12 + j11;
    }

    /* renamed from: m */
    public long m114708m() {
        return this.f108134o;
    }

    /* renamed from: n */
    public String m114709n() {
        return this.f108125f;
    }

    /* renamed from: o */
    public boolean m114710o() {
        return this.f108129j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m114711p() {
        return m114704q(SystemClock.uptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C21966j m114712r(boolean z11) {
        this.f108128i = z11;
        return this;
    }

    public String toString() {
        return "WakeLockDetails{tag='" + this.f108125f + "', levelAndFlags=" + this.f108126g + ", mHeldTimeMs=" + m114707l() + '}';
    }
}
