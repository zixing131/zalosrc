package nl0;

import android.graphics.Bitmap;
import com.zing.zalo.zlottie.jni.ZLottieJNI;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.IOException;
import ol0.InterfaceC24305c;
import p098dc.InterfaceC17872f;

/* renamed from: nl0.g */
/* loaded from: classes7.dex */
public final class C23877g implements InterfaceC17872f {

    /* renamed from: a */
    private final long f115433a;

    /* renamed from: b */
    private final int f115434b;

    /* renamed from: c */
    private final int f115435c;

    /* renamed from: d */
    private final boolean f115436d;

    /* renamed from: e */
    private final int f115437e;

    /* renamed from: f */
    private final int f115438f;

    /* renamed from: j */
    private final a f115442j;

    /* renamed from: l */
    private final boolean f115444l;

    /* renamed from: g */
    private volatile b f115439g = b.WAITING;

    /* renamed from: h */
    private boolean f115440h = false;

    /* renamed from: i */
    private boolean f115441i = false;

    /* renamed from: k */
    private Runnable f115443k = null;

    /* renamed from: m */
    private int f115445m = 0;

    /* renamed from: n */
    private final Runnable f115446n = new Runnable() { // from class: nl0.f
        @Override // java.lang.Runnable
        public final void run() {
            C23877g.this.m124929k();
        }
    };

    /* renamed from: nl0.g$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        Bitmap mo124933a(int i11, int i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nl0.g$b */
    /* loaded from: classes7.dex */
    public enum b {
        WAITING,
        IN_PROGRESS,
        COMPLETE
    }

    public C23877g(File file, String str, int i11, int i12, boolean z11, boolean z12, a aVar) {
        String str2;
        boolean z13;
        int i13;
        if (file.exists()) {
            m124932n(str);
            int[] iArr = new int[5];
            if (z11) {
                str2 = C23874d.m124915i().m124920g();
            } else {
                str2 = "";
            }
            long m92125a = ZLottieJNI.m92125a(file.getAbsolutePath(), str, i11, i12, iArr, z11, str2, z12);
            this.f115433a = m92125a;
            this.f115434b = i11;
            this.f115435c = i12;
            if (m92125a != 0) {
                if (z12 && iArr[1] >= 60) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f115444l = z13;
                if (z13) {
                    i13 = 33;
                } else {
                    i13 = 16;
                }
                this.f115437e = Math.max(i13, 1000 / iArr[1]);
                this.f115438f = iArr[0];
                this.f115436d = z11;
                this.f115442j = aVar;
                return;
            }
            throw new C23878h("Cannot create lottie from native!");
        }
        throw new IOException("${jsonFile.absolutePath} is not found!");
    }

    /* renamed from: g */
    private void m124925g() {
        if (this.f115440h) {
            return;
        }
        this.f115440h = true;
        long j11 = this.f115433a;
        if (j11 != 0) {
            ZLottieJNI.m92128d(j11);
        }
    }

    /* renamed from: h */
    private void m124926h() {
        if (this.f115443k != null && C23874d.m124915i().m124921h().mo126932a(this.f115443k)) {
            this.f115443k = null;
        }
    }

    /* renamed from: i */
    private void m124927i() {
        m124926h();
        if (this.f115445m == 0 && this.f115443k == null) {
            m124925g();
        } else {
            this.f115441i = true;
        }
    }

    /* renamed from: j */
    private synchronized void m124928j() {
        int i11 = this.f115445m - 1;
        this.f115445m = i11;
        if (i11 == 0 && this.f115441i) {
            m124927i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m124929k() {
        synchronized (this) {
            if (!this.f115440h && !this.f115441i) {
                m124931m();
                if (this.f115439g == b.WAITING) {
                    this.f115439g = b.IN_PROGRESS;
                    ZLottieJNI.m92126b(this.f115433a, this.f115434b, this.f115435c);
                    this.f115443k = null;
                    this.f115439g = b.COMPLETE;
                }
                m124928j();
            }
        }
    }

    /* renamed from: l */
    private Bitmap m124930l(int i11) {
        synchronized (this) {
            if (!this.f115440h && !this.f115441i) {
                m124931m();
                if (this.f115444l) {
                    i11 = (i11 * 2) % mo88375b();
                }
                Bitmap mo124933a = this.f115442j.mo124933a(this.f115434b, this.f115435c);
                if (mo124933a != null && !mo124933a.isRecycled()) {
                    int m92129e = ZLottieJNI.m92129e(this.f115433a, i11 % this.f115438f, mo124933a, this.f115434b, this.f115435c, mo124933a.getRowBytes());
                    if (this.f115436d && this.f115439g == b.WAITING) {
                        InterfaceC24305c m124921h = C23874d.m124915i().m124921h();
                        Runnable runnable = this.f115446n;
                        this.f115443k = runnable;
                        m124921h.mo126933b(runnable);
                    }
                    m124928j();
                    if (m92129e == -1) {
                        return null;
                    }
                    return mo124933a;
                }
                AbstractC20110a.m104545n("Bit map is recycled when get frame", new Object[0]);
                m124928j();
                return null;
            }
            return null;
        }
    }

    /* renamed from: m */
    private void m124931m() {
        this.f115445m++;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: a */
    public synchronized void mo88374a() {
        m124927i();
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: b */
    public int mo88375b() {
        return this.f115438f;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: c */
    public int mo88376c(int i11) {
        return this.f115437e;
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: d */
    public Bitmap mo88377d(int i11) {
        return m124930l(i11);
    }

    @Override // p098dc.InterfaceC17872f
    /* renamed from: e */
    public Bitmap mo88378e(int i11, boolean z11) {
        return m124930l(i11);
    }

    protected void finalize() {
        try {
            mo88374a();
        } finally {
            super.finalize();
        }
    }

    @Override // p098dc.InterfaceC17872f
    public int getType() {
        return 0;
    }

    /* renamed from: n */
    public void m124932n(String str) {
        if (AbstractC23880j.m124939f(str)) {
        } else {
            throw new IllegalArgumentException("Unique name must only contains letters, numbers, underscores(\"_\"), points(\".\") and dashes(\"-\")");
        }
    }
}
