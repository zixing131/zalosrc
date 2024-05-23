package dj;

import android.view.animation.Interpolator;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import ln0.AbstractC22543l;
import p500s1.C26087b;
import pm0.AbstractC24856m;
import pm0.C24865v;
import pm0.InterfaceC24854k;

/* renamed from: dj.n1 */
/* loaded from: classes3.dex */
public class C17985n1 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final boolean f91091a;

    /* renamed from: b */
    private b f91092b;

    /* renamed from: c */
    private int f91093c = -1;

    /* renamed from: d */
    private int f91094d = -1;

    /* renamed from: e */
    private int f91095e;

    /* renamed from: f */
    private WeakReference f91096f;

    /* renamed from: g */
    private final InterfaceC24854k f91097g;

    /* renamed from: h */
    private long f91098h;

    /* renamed from: i */
    private int f91099i;

    /* renamed from: j */
    private long f91100j;

    /* renamed from: dj.n1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        private final int m95654c(boolean z11, int i11) {
            if (z11) {
                return 120;
            }
            return i11 < 100 ? 12 : 3;
        }

        /* renamed from: a */
        public final int m95655a(boolean z11, int i11, int i12) {
            int m116580c;
            m116580c = AbstractC22543l.m116580c(0, (i12 - i11) * m95654c(z11, i12));
            return m116580c;
        }

        /* renamed from: b */
        public final int m95656b(long j11, C17985n1 c17985n1) {
            int m116580c;
            AbstractC19074t.m100208f(c17985n1, "progressUIInfo");
            if (j11 >= c17985n1.m95641k()) {
                return c17985n1.m95640j();
            }
            if (j11 <= c17985n1.m95641k() - c17985n1.m95637g()) {
                return c17985n1.m95638h();
            }
            m116580c = AbstractC22543l.m116580c(0, (int) (c17985n1.m95638h() + (c17985n1.m95639i().getInterpolation((((float) ((c17985n1.m95637g() - c17985n1.m95641k()) + j11)) * 1.0f) / c17985n1.m95637g()) * (c17985n1.m95640j() - c17985n1.m95638h()))));
            return m116580c;
        }
    }

    /* renamed from: dj.n1$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: c */
        void mo95555c();
    }

    /* renamed from: dj.n1$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: c */
        void mo61045c();

        /* renamed from: g */
        void mo61060g();
    }

    /* renamed from: dj.n1$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f91101q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26087b mo12V4() {
            return new C26087b();
        }
    }

    public C17985n1(boolean z11, b bVar) {
        InterfaceC24854k m129210a;
        this.f91091a = z11;
        this.f91092b = bVar;
        m129210a = AbstractC24856m.m129210a(d.f91101q);
        this.f91097g = m129210a;
        this.f91099i = -1;
    }

    /* renamed from: f */
    public static /* synthetic */ int m95633f(C17985n1 c17985n1, C17945a0 c17945a0, int i11, int i12, int i13, boolean z11, int i14, Object obj) {
        boolean z12;
        if (obj == null) {
            if ((i14 & 16) != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            return c17985n1.mo95630e(c17945a0, i11, i12, i13, z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDisplayUploadProgress");
    }

    /* renamed from: a */
    public final void m95634a() {
        if (!m95643m()) {
            return;
        }
        m95648r(Companion.m95656b(System.currentTimeMillis(), this));
        if (!m95643m()) {
            m95647q();
            m95645o();
        }
    }

    /* renamed from: b */
    public final int m95635b() {
        return this.f91099i;
    }

    /* renamed from: c */
    public final C24865v m95636c() {
        long j11;
        boolean z11;
        long j12 = this.f91098h;
        if (j12 >= 0) {
            j11 = (255 * j12) / 200;
        } else {
            j11 = 255;
        }
        int i11 = this.f91099i;
        if (i11 >= this.f91094d && j12 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return new C24865v(Integer.valueOf(i11), Integer.valueOf((int) j11), Boolean.valueOf(z11));
    }

    /* renamed from: d */
    public int mo95629d(C17945a0 c17945a0, int i11) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        return i11;
    }

    /* renamed from: e */
    public int mo95630e(C17945a0 c17945a0, int i11, int i12, int i13, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        return i12;
    }

    /* renamed from: g */
    public final int m95637g() {
        return this.f91095e;
    }

    /* renamed from: h */
    public final int m95638h() {
        return this.f91093c;
    }

    /* renamed from: i */
    public final Interpolator m95639i() {
        return (Interpolator) this.f91097g.getValue();
    }

    /* renamed from: j */
    public final int m95640j() {
        return this.f91094d;
    }

    /* renamed from: k */
    public final long m95641k() {
        return this.f91100j;
    }

    /* renamed from: l */
    public final boolean m95642l() {
        return this.f91091a;
    }

    /* renamed from: m */
    public final boolean m95643m() {
        if (this.f91100j > 0) {
            int i11 = this.f91099i;
            int i12 = this.f91094d;
            if (i11 < i12 || i12 < 100 || this.f91098h > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m95644n() {
        return this.f91094d == 100;
    }

    /* renamed from: o */
    public final void m95645o() {
        c cVar;
        WeakReference weakReference = this.f91096f;
        if (weakReference != null && (cVar = (c) weakReference.get()) != null) {
            cVar.mo61045c();
        }
        this.f91096f = null;
        b bVar = this.f91092b;
        if (bVar != null) {
            bVar.mo95555c();
        }
    }

    /* renamed from: p */
    public final void m95646p() {
        c cVar;
        WeakReference weakReference = this.f91096f;
        if (weakReference != null && (cVar = (c) weakReference.get()) != null) {
            cVar.mo61060g();
        }
    }

    /* renamed from: q */
    public final void m95647q() {
        m95650t(-1);
        this.f91094d = -1;
        m95648r(-1);
        this.f91095e = 0;
        m95653w(0L);
    }

    /* renamed from: r */
    public final void m95648r(int i11) {
        long j11;
        this.f91099i = i11;
        long j12 = this.f91100j;
        if (j12 > 0 && i11 == 100) {
            j11 = (j12 + 200) - System.currentTimeMillis();
        } else {
            j11 = -1;
        }
        this.f91098h = j11;
    }

    /* renamed from: s */
    public final void m95649s(int i11) {
        this.f91095e = i11;
    }

    /* renamed from: t */
    public final void m95650t(int i11) {
        this.f91093c = i11;
        m95648r(i11);
    }

    /* renamed from: u */
    public final void m95651u(c cVar) {
        WeakReference weakReference;
        if (cVar != null) {
            weakReference = new WeakReference(cVar);
        } else {
            weakReference = null;
        }
        this.f91096f = weakReference;
    }

    /* renamed from: v */
    public final void m95652v(int i11) {
        this.f91094d = i11;
    }

    /* renamed from: w */
    public final void m95653w(long j11) {
        long j12;
        this.f91100j = j11;
        if (j11 > 0 && this.f91099i == 100) {
            j12 = (j11 + 200) - System.currentTimeMillis();
        } else {
            j12 = -1;
        }
        this.f91098h = j12;
    }
}
