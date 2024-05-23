package ky;

import android.util.SparseBooleanArray;
import com.zing.zalo.zqrcode.Result;
import fn0.AbstractC19074t;
import java.util.Timer;
import java.util.TimerTask;
import p248iy.AbstractC20887g;
import pm0.C24848g0;

/* renamed from: ky.b */
/* loaded from: classes4.dex */
public final class C21969b {

    /* renamed from: b */
    private static long f108147b;

    /* renamed from: c */
    private static long f108148c;

    /* renamed from: d */
    private static volatile boolean f108149d;

    /* renamed from: e */
    private static Timer f108150e;

    /* renamed from: a */
    public static final C21969b f108146a = new C21969b();

    /* renamed from: f */
    private static final SparseBooleanArray f108151f = new SparseBooleanArray(10);

    /* renamed from: ky.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C21969b.f108149d = true;
        }
    }

    private C21969b() {
    }

    /* renamed from: c */
    private final void m114722c() {
        Integer[] numArr = {16200, 16201, 16202, 16203, 16205, 16204};
        synchronized (f108151f) {
            for (int i11 = 0; i11 < 6; i11++) {
                try {
                    f108151f.put(numArr[i11].intValue(), false);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: d */
    private final void m114723d() {
        Timer timer = f108150e;
        if (timer != null) {
            timer.cancel();
        }
        f108149d = false;
        Timer timer2 = new Timer();
        timer2.schedule(new a(), 3000L);
        f108150e = timer2;
    }

    /* renamed from: g */
    private final void m114724g(int i11, long j11, long j12, long j13) {
        SparseBooleanArray sparseBooleanArray = f108151f;
        synchronized (sparseBooleanArray) {
            try {
                if (!sparseBooleanArray.get(i11)) {
                    AbstractC20887g.m109236n(i11, "{\"start_time\": " + j11 + ",\"end_time\": " + j12 + "}", null, 0, j13, 0, 44, null);
                    sparseBooleanArray.put(i11, true);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    private final void m114725h(long j11, long j12, long j13) {
        SparseBooleanArray sparseBooleanArray = f108151f;
        synchronized (sparseBooleanArray) {
            try {
                if (!sparseBooleanArray.get(16202) && !sparseBooleanArray.get(16201)) {
                    AbstractC20887g.m109236n(16202, "{\"start_time\": " + j11 + ",\"end_time\": " + j12 + "}", null, 0, j13, 0, 44, null);
                    sparseBooleanArray.put(16202, true);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    private final void m114726j(int i11, long j11, long j12, long j13) {
        SparseBooleanArray sparseBooleanArray = f108151f;
        synchronized (sparseBooleanArray) {
            try {
                if (!sparseBooleanArray.get(16205) && !sparseBooleanArray.get(16204)) {
                    AbstractC20887g.m109236n(i11, "{\"start_time\": " + j11 + ",\"end_time\": " + j12 + "}", null, 0, j13, 0, 44, null);
                    sparseBooleanArray.put(i11, true);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m114727b() {
        C21968a c21968a = C21968a.f108143a;
        c21968a.m114720b();
        f108147b = c21968a.m114719a();
        f108148c = 0L;
        m114723d();
        m114722c();
    }

    /* renamed from: e */
    public final void m114728e(Result result) {
        AbstractC19074t.m100208f(result, "result");
        long m114719a = C21968a.f108143a.m114719a();
        long j11 = f108148c;
        long j12 = m114719a - j11;
        if (result instanceof Result.Success) {
            m114724g(16201, j11, m114719a, j12);
        }
        if (result instanceof Result.Failed) {
            Result.Failed failed = (Result.Failed) result;
            if (failed.getReason() == Result.Failed.EnumC17397a.NotFound && f108149d) {
                m114725h(f108148c, m114719a, j12);
            }
            if (failed.getReason() == Result.Failed.EnumC17397a.CheckSumError) {
                m114724g(16203, f108148c, m114719a, j12);
            }
        }
    }

    /* renamed from: f */
    public final void m114729f() {
        long m114719a = C21968a.f108143a.m114719a();
        long j11 = f108148c;
        m114726j(16205, j11, m114719a, m114719a - j11);
    }

    /* renamed from: i */
    public final void m114730i() {
        if (f108148c == 0) {
            f108148c = C21968a.f108143a.m114719a();
        }
        long j11 = f108148c;
        long j12 = f108147b;
        m114724g(16200, j12, j11, j11 - j12);
    }

    /* renamed from: k */
    public final void m114731k() {
        long m114719a = C21968a.f108143a.m114719a();
        long j11 = f108148c;
        m114726j(16204, j11, m114719a, m114719a - j11);
    }
}
