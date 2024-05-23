package p373nx;

import android.media.MediaRecorder;
import android.os.SystemClock;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalocore.CoreUtility;
import h40.AbstractC19783c;
import p042bx.AbstractC3152g;
import p171fx.AbstractC19164e;
import p248iy.AbstractC20887g;

/* renamed from: nx.b */
/* loaded from: classes4.dex */
public class C23956b extends MediaRecorder {

    /* renamed from: f */
    private SensitiveData f115944f;

    /* renamed from: b */
    private long f115940b = 0;

    /* renamed from: c */
    private long f115941c = 0;

    /* renamed from: d */
    private boolean f115942d = false;

    /* renamed from: e */
    private boolean f115943e = AbstractC19164e.m100511C();

    /* renamed from: a */
    private Exception f115939a = new Exception();

    /* renamed from: g */
    private Runnable f115945g = new Runnable() { // from class: nx.a
        @Override // java.lang.Runnable
        public final void run() {
            C23956b.this.m125362b();
        }
    };

    public C23956b(SensitiveData sensitiveData) {
        this.f115944f = sensitiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m125362b() {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC20887g.m109246x(21050, currentTimeMillis);
        if (this.f115942d) {
            AbstractC20887g.m109246x(21051, currentTimeMillis);
        }
        if (this.f115943e) {
            AbstractC19164e.m100539y(this.f115941c, this.f115939a, true, this.f115942d);
        }
        AbstractC3152g.m15868a().removeCallbacks(this.f115945g);
    }

    @Override // android.media.MediaRecorder
    public void release() {
        super.release();
        AbstractC3152g.m15868a().removeCallbacks(this.f115945g);
        if (this.f115942d) {
            AbstractC20887g.m109246x(21051, System.currentTimeMillis());
        }
        if (this.f115943e) {
            AbstractC19164e.m100539y(this.f115941c, this.f115939a, false, this.f115942d);
        }
    }

    @Override // android.media.MediaRecorder
    public void reset() {
        super.reset();
    }

    @Override // android.media.MediaRecorder
    public void start() {
        boolean z11;
        super.start();
        C8937j0.m47660i().m49661d(this.f115944f);
        this.f115940b = SystemClock.elapsedRealtime();
        if (CoreUtility.f89235k.get() && !AbstractC19783c.m103531b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f115942d = z11;
    }

    @Override // android.media.MediaRecorder
    public void stop() {
        super.stop();
        C8937j0.m47660i().m49660b();
        this.f115941c = SystemClock.elapsedRealtime() - this.f115940b;
        AbstractC3152g.m15868a().postDelayed(this.f115945g, 5000L);
    }
}
