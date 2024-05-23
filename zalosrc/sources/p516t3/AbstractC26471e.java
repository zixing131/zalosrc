package p516t3;

import android.view.Choreographer;
import com.zing.zalocore.CoreUtility;
import java.lang.ref.WeakReference;
import p566v3.C27508p;

/* renamed from: t3.e */
/* loaded from: classes2.dex */
public abstract class AbstractC26471e {

    /* renamed from: p */
    private final WeakReference f125703p;

    /* renamed from: q */
    private final int f125704q;

    /* renamed from: r */
    private final int f125705r;

    /* renamed from: s */
    private long f125706s;

    /* renamed from: t */
    private boolean f125707t;

    /* renamed from: u */
    private boolean f125708u;

    /* renamed from: v */
    private int f125709v;

    /* renamed from: w */
    private long f125710w;

    /* renamed from: x */
    private long f125711x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t3.e$a */
    /* loaded from: classes2.dex */
    public static class a extends AbstractC26471e implements Choreographer.FrameCallback {

        /* renamed from: y */
        private static Choreographer f125712y;

        @Override // p516t3.AbstractC26471e
        /* renamed from: b */
        protected void mo136440b() {
            if (f125712y == null) {
                f125712y = Choreographer.getInstance();
            }
            f125712y.removeFrameCallback(this);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            m136439a(j11 / 1000000);
        }

        @Override // p516t3.AbstractC26471e
        /* renamed from: f */
        protected void mo136443f() {
            if (f125712y == null) {
                f125712y = Choreographer.getInstance();
            }
            if (!CoreUtility.m93148a().mo100080h() && !CoreUtility.f89239o) {
                m136446i();
            } else {
                f125712y.postFrameCallback(this);
            }
        }

        private a(b bVar, int i11, int i12) {
            super(bVar, i11, i12);
        }
    }

    /* renamed from: t3.e$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo136400a(float f11);

        void onStop();
    }

    /* renamed from: c */
    public static AbstractC26471e m136438c(b bVar, C27508p c27508p) {
        return new a(bVar, c27508p.m140652g(), c27508p.m140651f());
    }

    /* renamed from: a */
    protected void m136439a(long j11) {
        boolean z11;
        b bVar = (b) this.f125703p.get();
        if (bVar == null) {
            mo136440b();
            this.f125706s = 0L;
            this.f125711x = 0L;
            this.f125709v = -1;
            return;
        }
        long j12 = this.f125706s;
        if (j12 == 0) {
            this.f125706s = j11;
        } else if (j12 < 0) {
            long j13 = this.f125711x;
            long j14 = j11 - j13;
            this.f125706s = (j12 * (-1)) + j14;
            this.f125711x = j13 + j14;
        }
        long j15 = this.f125706s;
        int i11 = (int) (j11 - j15);
        int i12 = this.f125705r;
        if (i11 / i12 > this.f125709v) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f125707t && z11) {
            bVar.mo136400a(this.f125704q);
            m136446i();
            return;
        }
        long j16 = (j11 - j15) % i12;
        if (j11 - this.f125711x >= this.f125710w) {
            this.f125711x = j11;
            bVar.mo136400a((((float) j16) / i12) * this.f125704q);
        }
        this.f125709v = ((int) (j11 - this.f125706s)) / this.f125705r;
        if (!this.f125708u) {
            mo136443f();
        }
    }

    /* renamed from: b */
    protected abstract void mo136440b();

    /* renamed from: d */
    public boolean m136441d() {
        return this.f125708u;
    }

    /* renamed from: e */
    public void m136442e() {
        this.f125708u = false;
        this.f125707t = true;
        this.f125706s = 0L;
        this.f125709v = 0;
        mo136440b();
        mo136443f();
    }

    /* renamed from: f */
    protected abstract void mo136443f();

    /* renamed from: g */
    public void m136444g(int i11) {
        this.f125710w = 1000 / i11;
    }

    /* renamed from: h */
    public void m136445h() {
        this.f125708u = false;
        this.f125707t = false;
        this.f125706s = 0L;
        this.f125709v = 0;
        mo136440b();
        mo136443f();
    }

    /* renamed from: i */
    public void m136446i() {
        this.f125708u = true;
        mo136440b();
        this.f125706s = 0L;
        this.f125709v = -1;
        ((b) this.f125703p.get()).onStop();
    }

    private AbstractC26471e(b bVar, int i11, int i12) {
        this.f125710w = -1L;
        this.f125711x = 0L;
        this.f125703p = new WeakReference(bVar);
        this.f125704q = i12;
        this.f125705r = Math.round((i12 / i11) * 1000.0f);
    }
}
