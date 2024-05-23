package p280jx;

import android.os.Process;
import com.zing.zalo.perf.presentation.batterymonitor.core.ProcFileReader;
import java.nio.CharBuffer;
import java.util.Arrays;
import mm0.AbstractC23350e;
import p171fx.AbstractC19166g;

/* renamed from: jx.q */
/* loaded from: classes4.dex */
public class C21392q extends AbstractC21378c {

    /* renamed from: c */
    private static final long f104270c = Process.myUid();

    /* renamed from: d */
    private static final CharBuffer f104271d = CharBuffer.wrap("wlan0");

    /* renamed from: e */
    private static final CharBuffer f104272e = CharBuffer.wrap("dummy0");

    /* renamed from: f */
    private static final CharBuffer f104273f = CharBuffer.wrap("lo");

    /* renamed from: a */
    private final CharBuffer f104274a = CharBuffer.allocate(128);

    /* renamed from: b */
    private ProcFileReader f104275b;

    @Override // p280jx.AbstractC21378c
    /* renamed from: c */
    public boolean mo110833c(long[] jArr) {
        boolean z11;
        char c11;
        char c12;
        try {
            if (this.f104275b == null) {
                this.f104275b = new ProcFileReader(m110851g());
            }
            this.f104275b.m48327g();
            if (this.f104275b.m48324c() && this.f104275b.m48323b()) {
                Arrays.fill(jArr, 0L);
                this.f104275b.m48328i();
                while (true) {
                    boolean z12 = true;
                    if (!this.f104275b.m48323b()) {
                        return true;
                    }
                    this.f104275b.m48330k();
                    this.f104275b.m48326f(this.f104274a);
                    this.f104275b.m48330k();
                    this.f104275b.m48330k();
                    long m48325e = this.f104275b.m48325e();
                    this.f104275b.m48330k();
                    if (f104271d.compareTo(this.f104274a) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 || f104272e.compareTo(this.f104274a) == 0 || f104273f.compareTo(this.f104274a) == 0) {
                        z12 = false;
                    }
                    if (m48325e == f104270c && (z11 || z12)) {
                        long m48325e2 = this.f104275b.m48325e();
                        this.f104275b.m48330k();
                        if (z11) {
                            c11 = 0;
                        } else {
                            c11 = 2;
                        }
                        if (m48325e2 == 0) {
                            c12 = 4;
                        } else {
                            c12 = 0;
                        }
                        int i11 = c11 | c12;
                        jArr[i11] = jArr[i11] + this.f104275b.m48325e();
                        this.f104275b.m48330k();
                        this.f104275b.m48330k();
                        int i12 = i11 | 1;
                        jArr[i12] = jArr[i12] + this.f104275b.m48325e();
                        this.f104275b.m48328i();
                    }
                    this.f104275b.m48328i();
                }
            }
            return false;
        } catch (ProcFileReader.ParseException e11) {
            AbstractC23350e.m122775e("QTagUidNwoBCollector", "Unable to parse file", e11);
            return false;
        }
    }

    @Override // p280jx.AbstractC21378c
    /* renamed from: d */
    public long mo110834d(C21377b c21377b, C21376a c21376a, long j11, long j12) {
        if (c21377b.m110829b(c21376a)) {
            C21379d c21379d = c21376a.f104257r;
            long j13 = c21379d.f104263q + c21379d.f104262p + c21379d.f104265s + c21379d.f104264r;
            long m100561k = AbstractC19166g.m100561k();
            long m100565o = AbstractC19166g.m100565o();
            if (j13 > m100561k) {
                m100565o += j13 - m100561k;
            } else if (j13 < m100561k) {
                m100565o += j13;
            }
            AbstractC19166g.m100547A(j13);
            AbstractC19166g.m100550D(m100565o);
            AbstractC19166g.m100549C(j12);
            long j14 = j12 - j11;
            if (j14 > 86400000) {
                return (j13 * 86400000) / j14;
            }
            return m100565o;
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
        if (c21377b.m110829b(c21376a)) {
            C21379d c21379d = c21376a.f104257r;
            long j11 = c21379d.f104263q + c21379d.f104262p + c21379d.f104265s + c21379d.f104264r;
            long m100561k = AbstractC19166g.m100561k();
            long m100565o = AbstractC19166g.m100565o();
            if (j11 > m100561k) {
                m100565o += j11 - m100561k;
            } else if (j11 < m100561k) {
                m100565o += j11;
            }
            AbstractC19166g.m100547A(j11);
            AbstractC19166g.m100550D(m100565o);
        }
    }

    /* renamed from: g */
    protected String m110851g() {
        return "/proc/net/xt_qtaguid/stats";
    }
}
