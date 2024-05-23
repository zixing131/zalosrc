package r20;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.AbstractC1579n0;
import java.util.ArrayList;
import r20.C25621a;

/* renamed from: r20.b */
/* loaded from: classes5.dex */
public abstract class AbstractC25622b implements C25621a.b {

    /* renamed from: m */
    public static final s f122500m = new g("translationX");

    /* renamed from: n */
    public static final s f122501n = new h("translationY");

    /* renamed from: o */
    public static final s f122502o = new i("translationZ");

    /* renamed from: p */
    public static final s f122503p = new j("scaleX");

    /* renamed from: q */
    public static final s f122504q = new k("scaleY");

    /* renamed from: r */
    public static final s f122505r = new l("rotation");

    /* renamed from: s */
    public static final s f122506s = new m("rotationX");

    /* renamed from: t */
    public static final s f122507t = new n("rotationY");

    /* renamed from: u */
    public static final s f122508u = new o("x");

    /* renamed from: v */
    public static final s f122509v = new a("y");

    /* renamed from: w */
    public static final s f122510w = new b("z");

    /* renamed from: x */
    public static final s f122511x = new c("alpha");

    /* renamed from: y */
    public static final s f122512y = new d("scrollX");

    /* renamed from: z */
    public static final s f122513z = new e("scrollY");

    /* renamed from: e */
    final AbstractC25625e f122518e;

    /* renamed from: a */
    float f122514a = 0.0f;

    /* renamed from: b */
    float f122515b = Float.MAX_VALUE;

    /* renamed from: c */
    boolean f122516c = false;

    /* renamed from: f */
    boolean f122519f = false;

    /* renamed from: g */
    float f122520g = Float.MAX_VALUE;

    /* renamed from: h */
    float f122521h = -Float.MAX_VALUE;

    /* renamed from: i */
    private long f122522i = 0;

    /* renamed from: k */
    private final ArrayList f122524k = new ArrayList();

    /* renamed from: l */
    private final ArrayList f122525l = new ArrayList();

    /* renamed from: d */
    final Object f122517d = null;

    /* renamed from: j */
    private float f122523j = 1.0f;

    /* renamed from: r20.b$a */
    /* loaded from: classes5.dex */
    class a extends s {
        a(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getY();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setY(f11);
        }
    }

    /* renamed from: r20.b$b */
    /* loaded from: classes5.dex */
    class b extends s {
        b(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return AbstractC1579n0.m7848Y(view);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            AbstractC1579n0.m7875h1(view, f11);
        }
    }

    /* renamed from: r20.b$c */
    /* loaded from: classes5.dex */
    class c extends s {
        c(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getAlpha();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setAlpha(f11);
        }
    }

    /* renamed from: r20.b$d */
    /* loaded from: classes5.dex */
    class d extends s {
        d(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getScrollX();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setScrollX((int) f11);
        }
    }

    /* renamed from: r20.b$e */
    /* loaded from: classes5.dex */
    class e extends s {
        e(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getScrollY();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setScrollY((int) f11);
        }
    }

    /* renamed from: r20.b$f */
    /* loaded from: classes5.dex */
    class f extends AbstractC25625e {

        /* renamed from: b */
        final /* synthetic */ C25626f f122526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, C25626f c25626f) {
            super(str);
            this.f122526b = c25626f;
        }

        @Override // r20.AbstractC25625e
        /* renamed from: a */
        public float mo132338a(Object obj) {
            return this.f122526b.m132377a();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: b */
        public void mo132339b(Object obj, float f11) {
            this.f122526b.m132378b(f11);
        }
    }

    /* renamed from: r20.b$g */
    /* loaded from: classes5.dex */
    class g extends s {
        g(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getTranslationX();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setTranslationX(f11);
        }
    }

    /* renamed from: r20.b$h */
    /* loaded from: classes5.dex */
    class h extends s {
        h(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getTranslationY();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setTranslationY(f11);
        }
    }

    /* renamed from: r20.b$i */
    /* loaded from: classes5.dex */
    class i extends s {
        i(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return AbstractC1579n0.m7838T(view);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            AbstractC1579n0.m7860c1(view, f11);
        }
    }

    /* renamed from: r20.b$j */
    /* loaded from: classes5.dex */
    class j extends s {
        j(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getScaleX();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setScaleX(f11);
        }
    }

    /* renamed from: r20.b$k */
    /* loaded from: classes5.dex */
    class k extends s {
        k(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getScaleY();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setScaleY(f11);
        }
    }

    /* renamed from: r20.b$l */
    /* loaded from: classes5.dex */
    class l extends s {
        l(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getRotation();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setRotation(f11);
        }
    }

    /* renamed from: r20.b$m */
    /* loaded from: classes5.dex */
    class m extends s {
        m(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getRotationX();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setRotationX(f11);
        }
    }

    /* renamed from: r20.b$n */
    /* loaded from: classes5.dex */
    class n extends s {
        n(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getRotationY();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setRotationY(f11);
        }
    }

    /* renamed from: r20.b$o */
    /* loaded from: classes5.dex */
    class o extends s {
        o(String str) {
            super(str);
        }

        @Override // r20.AbstractC25625e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo132338a(View view) {
            return view.getX();
        }

        @Override // r20.AbstractC25625e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo132339b(View view, float f11) {
            view.setX(f11);
        }
    }

    /* renamed from: r20.b$p */
    /* loaded from: classes5.dex */
    static class p {

        /* renamed from: a */
        float f122528a;

        /* renamed from: b */
        float f122529b;
    }

    /* renamed from: r20.b$q */
    /* loaded from: classes5.dex */
    public interface q {
        /* renamed from: a */
        void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f11, float f12);
    }

    /* renamed from: r20.b$r */
    /* loaded from: classes5.dex */
    public interface r {
        /* renamed from: a */
        void mo52475a(AbstractC25622b abstractC25622b, float f11, float f12);
    }

    /* renamed from: r20.b$s */
    /* loaded from: classes5.dex */
    public static abstract class s extends AbstractC25625e {
        private s(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC25622b(C25626f c25626f) {
        this.f122518e = new f("FloatValueHolder", c25626f);
    }

    /* renamed from: e */
    private void m132323e(boolean z11) {
        this.f122519f = false;
        C25621a.m132314d().m132319g(this);
        this.f122522i = 0L;
        this.f122516c = false;
        for (int i11 = 0; i11 < this.f122524k.size(); i11++) {
            if (this.f122524k.get(i11) != null) {
                ((q) this.f122524k.get(i11)).mo52476a(this, z11, this.f122515b, this.f122514a);
            }
        }
        m132325i(this.f122524k);
    }

    /* renamed from: f */
    private float m132324f() {
        return this.f122518e.mo132338a(this.f122517d);
    }

    /* renamed from: i */
    private static void m132325i(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: o */
    private void m132326o() {
        if (!this.f122519f) {
            this.f122519f = true;
            if (!this.f122516c) {
                this.f122515b = m132324f();
            }
            float f11 = this.f122515b;
            if (f11 <= this.f122520g && f11 >= this.f122521h) {
                C25621a.m132314d().m132316a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    @Override // r20.C25621a.b
    /* renamed from: a */
    public boolean mo132321a(long j11) {
        long j12 = this.f122522i;
        if (j12 == 0) {
            this.f122522i = j11;
            m132334l(this.f122515b);
            return false;
        }
        this.f122522i = j11;
        boolean mo132337p = mo132337p(j11 - j12);
        float min = Math.min(this.f122515b, this.f122520g);
        this.f122515b = min;
        float max = Math.max(min, this.f122521h);
        this.f122515b = max;
        m132334l(max);
        if (mo132337p) {
            m132323e(false);
        }
        return mo132337p;
    }

    /* renamed from: b */
    public AbstractC25622b m132327b(q qVar) {
        if (!this.f122524k.contains(qVar)) {
            this.f122524k.add(qVar);
        }
        return this;
    }

    /* renamed from: c */
    public AbstractC25622b m132328c(r rVar) {
        if (!m132331h()) {
            if (!this.f122525l.contains(rVar)) {
                this.f122525l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: d */
    public void m132329d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f122519f) {
                m132323e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m132330g() {
        return this.f122523j * 0.75f;
    }

    /* renamed from: h */
    public boolean m132331h() {
        return this.f122519f;
    }

    /* renamed from: j */
    public AbstractC25622b m132332j(float f11) {
        this.f122520g = f11;
        return this;
    }

    /* renamed from: k */
    public AbstractC25622b m132333k(float f11) {
        this.f122521h = f11;
        return this;
    }

    /* renamed from: l */
    void m132334l(float f11) {
        this.f122518e.mo132339b(this.f122517d, f11);
        for (int i11 = 0; i11 < this.f122525l.size(); i11++) {
            if (this.f122525l.get(i11) != null) {
                ((r) this.f122525l.get(i11)).mo52475a(this, this.f122515b, this.f122514a);
            }
        }
        m132325i(this.f122525l);
    }

    /* renamed from: m */
    public AbstractC25622b m132335m(float f11) {
        this.f122514a = f11;
        return this;
    }

    /* renamed from: n */
    public void mo132336n() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f122519f) {
                m132326o();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    /* renamed from: p */
    abstract boolean mo132337p(long j11);
}
