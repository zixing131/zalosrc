package p166fq;

import android.view.Choreographer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import java.lang.ref.WeakReference;
import kd0.C21697g;
import p227i3.C20218v;

/* renamed from: fq.n */
/* loaded from: classes4.dex */
public final class C19117n {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final WeakReference f95117a;

    /* renamed from: b */
    private Choreographer f95118b;

    /* renamed from: c */
    private byte f95119c;

    /* renamed from: d */
    private final float f95120d;

    /* renamed from: e */
    private float f95121e;

    /* renamed from: f */
    private float f95122f;

    /* renamed from: g */
    private float f95123g;

    /* renamed from: h */
    private float f95124h;

    /* renamed from: i */
    private float f95125i;

    /* renamed from: j */
    private int f95126j;

    /* renamed from: k */
    private float f95127k;

    /* renamed from: l */
    private long f95128l;

    /* renamed from: m */
    private final Choreographer.FrameCallback f95129m;

    /* renamed from: n */
    private final Choreographer.FrameCallback f95130n;

    /* renamed from: o */
    private final Choreographer.FrameCallback f95131o;

    /* renamed from: fq.n$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C19117n(C21697g c21697g) {
        AbstractC19074t.m100208f(c21697g, C20218v.f100059b);
        this.f95129m = new Choreographer.FrameCallback() { // from class: fq.k
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                C19117n.m100361k(C19117n.this, j11);
            }
        };
        this.f95130n = new Choreographer.FrameCallback() { // from class: fq.l
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                C19117n.m100360j(C19117n.this, j11);
            }
        };
        this.f95131o = new Choreographer.FrameCallback() { // from class: fq.m
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                C19117n.m100359i(C19117n.this, j11);
            }
        };
        this.f95120d = (30 * c21697g.getContext().getResources().getDisplayMetrics().density) / 1000.0f;
        this.f95117a = new WeakReference(c21697g);
        Choreographer choreographer = Choreographer.getInstance();
        AbstractC19074t.m100207e(choreographer, "getInstance(...)");
        this.f95118b = choreographer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m100359i(C19117n c19117n, long j11) {
        AbstractC19074t.m100208f(c19117n, "this$0");
        if (c19117n.f95119c == 2) {
            int i11 = c19117n.f95126j;
            if (i11 >= 0) {
                c19117n.f95126j = i11 - 1;
            }
            c19117n.m100369n(c19117n.f95126j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m100360j(C19117n c19117n, long j11) {
        AbstractC19074t.m100208f(c19117n, "this$0");
        c19117n.f95119c = (byte) 2;
        c19117n.f95128l = c19117n.m100363d();
        c19117n.m100371p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m100361k(C19117n c19117n, long j11) {
        AbstractC19074t.m100208f(c19117n, "this$0");
        c19117n.m100371p();
    }

    /* renamed from: l */
    private final void m100362l() {
        this.f95127k = 0.0f;
        C21697g c21697g = (C21697g) this.f95117a.get();
        if (c21697g != null) {
            c21697g.invalidate();
        }
    }

    /* renamed from: d */
    public final long m100363d() {
        return System.currentTimeMillis();
    }

    /* renamed from: e */
    public final float m100364e() {
        return this.f95124h;
    }

    /* renamed from: f */
    public final float m100365f() {
        return this.f95127k;
    }

    /* renamed from: g */
    public final boolean m100366g() {
        return this.f95119c == 2;
    }

    /* renamed from: h */
    public final boolean m100367h() {
        return this.f95119c == 0;
    }

    /* renamed from: m */
    public final boolean m100368m() {
        return this.f95119c == 2 && this.f95127k > this.f95123g;
    }

    /* renamed from: n */
    public final void m100369n(int i11) {
        if (i11 == 0) {
            m100370o();
            return;
        }
        this.f95126j = i11;
        C21697g c21697g = (C21697g) this.f95117a.get();
        if (c21697g != null && c21697g.m111975o1() != null) {
            this.f95119c = (byte) 1;
            this.f95127k = 0.0f;
            int m89114P = c21697g.m89114P();
            float lineWidth = c21697g.m111975o1().getLineWidth(0);
            float f11 = m89114P;
            float f12 = f11 / 3.0f;
            float f13 = (lineWidth - f11) + f12;
            this.f95123g = f13;
            this.f95121e = f13 + f11;
            this.f95124h = f12 + lineWidth;
            this.f95125i = (f11 / 6.0f) + lineWidth;
            this.f95122f = f13 + lineWidth + lineWidth;
            c21697g.invalidate();
            this.f95118b.postFrameCallback(this.f95130n);
        }
    }

    /* renamed from: o */
    public final void m100370o() {
        this.f95119c = (byte) 0;
        this.f95118b.removeFrameCallback(this.f95130n);
        this.f95118b.removeFrameCallback(this.f95131o);
        this.f95118b.removeFrameCallback(this.f95129m);
        m100362l();
    }

    /* renamed from: p */
    public final void m100371p() {
        if (this.f95119c != 2) {
            return;
        }
        this.f95118b.removeFrameCallback(this.f95129m);
        C21697g c21697g = (C21697g) this.f95117a.get();
        if (c21697g != null) {
            long m100363d = m100363d();
            long j11 = m100363d - this.f95128l;
            this.f95128l = m100363d;
            this.f95127k += ((float) j11) * this.f95120d;
            c21697g.invalidate();
            if (!AbstractC20826v0.m108838u0(c21697g)) {
                m100370o();
                return;
            }
            float f11 = this.f95127k;
            float f12 = this.f95121e;
            if (f11 > f12) {
                this.f95127k = f12;
                this.f95118b.postFrameCallbackDelayed(this.f95131o, 1200L);
            } else {
                this.f95118b.postFrameCallback(this.f95129m);
            }
        }
    }
}
