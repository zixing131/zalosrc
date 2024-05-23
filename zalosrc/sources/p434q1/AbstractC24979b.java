package p434q1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.AbstractC1579n0;
import java.util.ArrayList;
import p434q1.C24978a;
import p664y.AbstractC30228a;

/* renamed from: q1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC24979b implements C24978a.b {

    /* renamed from: m */
    public static final p f119662m = new f("translationX");

    /* renamed from: n */
    public static final p f119663n = new g("translationY");

    /* renamed from: o */
    public static final p f119664o = new h("translationZ");

    /* renamed from: p */
    public static final p f119665p = new i("scaleX");

    /* renamed from: q */
    public static final p f119666q = new j("scaleY");

    /* renamed from: r */
    public static final p f119667r = new k("rotation");

    /* renamed from: s */
    public static final p f119668s = new l("rotationX");

    /* renamed from: t */
    public static final p f119669t = new m("rotationY");

    /* renamed from: u */
    public static final p f119670u = new n("x");

    /* renamed from: v */
    public static final p f119671v = new a("y");

    /* renamed from: w */
    public static final p f119672w = new b("z");

    /* renamed from: x */
    public static final p f119673x = new c("alpha");

    /* renamed from: y */
    public static final p f119674y = new d("scrollX");

    /* renamed from: z */
    public static final p f119675z = new e("scrollY");

    /* renamed from: d */
    final Object f119679d;

    /* renamed from: e */
    final AbstractC24980c f119680e;

    /* renamed from: j */
    private float f119685j;

    /* renamed from: a */
    float f119676a = 0.0f;

    /* renamed from: b */
    float f119677b = Float.MAX_VALUE;

    /* renamed from: c */
    boolean f119678c = false;

    /* renamed from: f */
    boolean f119681f = false;

    /* renamed from: g */
    float f119682g = Float.MAX_VALUE;

    /* renamed from: h */
    float f119683h = -Float.MAX_VALUE;

    /* renamed from: i */
    private long f119684i = 0;

    /* renamed from: k */
    private final ArrayList f119686k = new ArrayList();

    /* renamed from: l */
    private final ArrayList f119687l = new ArrayList();

    /* renamed from: q1.b$a */
    /* loaded from: classes2.dex */
    static class a extends p {
        a(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getY();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setY(f11);
        }
    }

    /* renamed from: q1.b$b */
    /* loaded from: classes2.dex */
    static class b extends p {
        b(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return AbstractC1579n0.m7848Y(view);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            AbstractC1579n0.m7875h1(view, f11);
        }
    }

    /* renamed from: q1.b$c */
    /* loaded from: classes2.dex */
    static class c extends p {
        c(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getAlpha();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setAlpha(f11);
        }
    }

    /* renamed from: q1.b$d */
    /* loaded from: classes2.dex */
    static class d extends p {
        d(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getScrollX();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setScrollX((int) f11);
        }
    }

    /* renamed from: q1.b$e */
    /* loaded from: classes2.dex */
    static class e extends p {
        e(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getScrollY();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setScrollY((int) f11);
        }
    }

    /* renamed from: q1.b$f */
    /* loaded from: classes2.dex */
    static class f extends p {
        f(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getTranslationX();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setTranslationX(f11);
        }
    }

    /* renamed from: q1.b$g */
    /* loaded from: classes2.dex */
    static class g extends p {
        g(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getTranslationY();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setTranslationY(f11);
        }
    }

    /* renamed from: q1.b$h */
    /* loaded from: classes2.dex */
    static class h extends p {
        h(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return AbstractC1579n0.m7838T(view);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            AbstractC1579n0.m7860c1(view, f11);
        }
    }

    /* renamed from: q1.b$i */
    /* loaded from: classes2.dex */
    static class i extends p {
        i(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getScaleX();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setScaleX(f11);
        }
    }

    /* renamed from: q1.b$j */
    /* loaded from: classes2.dex */
    static class j extends p {
        j(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getScaleY();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setScaleY(f11);
        }
    }

    /* renamed from: q1.b$k */
    /* loaded from: classes2.dex */
    static class k extends p {
        k(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getRotation();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setRotation(f11);
        }
    }

    /* renamed from: q1.b$l */
    /* loaded from: classes2.dex */
    static class l extends p {
        l(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getRotationX();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setRotationX(f11);
        }
    }

    /* renamed from: q1.b$m */
    /* loaded from: classes2.dex */
    static class m extends p {
        m(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getRotationY();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setRotationY(f11);
        }
    }

    /* renamed from: q1.b$n */
    /* loaded from: classes2.dex */
    static class n extends p {
        n(String str) {
            super(str, null);
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo32786a(View view) {
            return view.getX();
        }

        @Override // p434q1.AbstractC24980c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo32787b(View view, float f11) {
            view.setX(f11);
        }
    }

    /* renamed from: q1.b$o */
    /* loaded from: classes2.dex */
    static class o {

        /* renamed from: a */
        float f119688a;

        /* renamed from: b */
        float f119689b;
    }

    /* renamed from: q1.b$p */
    /* loaded from: classes2.dex */
    public static abstract class p extends AbstractC24980c {
        /* synthetic */ p(String str, f fVar) {
            this(str);
        }

        private p(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC24979b(Object obj, AbstractC24980c abstractC24980c) {
        this.f119679d = obj;
        this.f119680e = abstractC24980c;
        if (abstractC24980c != f119667r && abstractC24980c != f119668s && abstractC24980c != f119669t) {
            if (abstractC24980c == f119673x) {
                this.f119685j = 0.00390625f;
                return;
            } else if (abstractC24980c != f119665p && abstractC24980c != f119666q) {
                this.f119685j = 1.0f;
                return;
            } else {
                this.f119685j = 0.00390625f;
                return;
            }
        }
        this.f119685j = 0.1f;
    }

    /* renamed from: c */
    private void m129696c(boolean z11) {
        this.f119681f = false;
        C24978a.m129687d().m129692g(this);
        this.f119684i = 0L;
        this.f119678c = false;
        for (int i11 = 0; i11 < this.f119686k.size(); i11++) {
            if (this.f119686k.get(i11) != null) {
                AbstractC30228a.m149044a(this.f119686k.get(i11));
                throw null;
            }
        }
        m129698g(this.f119686k);
    }

    /* renamed from: d */
    private float m129697d() {
        return this.f119680e.mo32786a(this.f119679d);
    }

    /* renamed from: g */
    private static void m129698g(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: k */
    private void m129699k() {
        if (!this.f119681f) {
            this.f119681f = true;
            if (!this.f119678c) {
                this.f119677b = m129697d();
            }
            float f11 = this.f119677b;
            if (f11 <= this.f119682g && f11 >= this.f119683h) {
                C24978a.m129687d().m129689a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    @Override // p434q1.C24978a.b
    /* renamed from: a */
    public boolean mo129694a(long j11) {
        long j12 = this.f119684i;
        if (j12 == 0) {
            this.f119684i = j11;
            m129703h(this.f119677b);
            return false;
        }
        this.f119684i = j11;
        boolean mo129706l = mo129706l(j11 - j12);
        float min = Math.min(this.f119677b, this.f119682g);
        this.f119677b = min;
        float max = Math.max(min, this.f119683h);
        this.f119677b = max;
        m129703h(max);
        if (mo129706l) {
            m129696c(false);
        }
        return mo129706l;
    }

    /* renamed from: b */
    public void m129700b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f119681f) {
                m129696c(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m129701e() {
        return this.f119685j * 0.75f;
    }

    /* renamed from: f */
    public boolean m129702f() {
        return this.f119681f;
    }

    /* renamed from: h */
    void m129703h(float f11) {
        this.f119680e.mo32787b(this.f119679d, f11);
        for (int i11 = 0; i11 < this.f119687l.size(); i11++) {
            if (this.f119687l.get(i11) != null) {
                AbstractC30228a.m149044a(this.f119687l.get(i11));
                throw null;
            }
        }
        m129698g(this.f119687l);
    }

    /* renamed from: i */
    public AbstractC24979b m129704i(float f11) {
        this.f119677b = f11;
        this.f119678c = true;
        return this;
    }

    /* renamed from: j */
    public void mo129705j() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f119681f) {
                m129699k();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    /* renamed from: l */
    abstract boolean mo129706l(long j11);
}
