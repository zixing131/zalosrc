package p298kf;

import android.graphics.Typeface;

/* renamed from: kf.a */
/* loaded from: classes3.dex */
public final class C21700a {

    /* renamed from: a */
    private final int f105394a;

    /* renamed from: b */
    private final String f105395b;

    /* renamed from: c */
    private final String f105396c;

    /* renamed from: d */
    private final Typeface f105397d;

    /* renamed from: e */
    private final int f105398e;

    /* renamed from: f */
    private boolean f105399f;

    /* renamed from: kf.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        int f105400a;

        /* renamed from: b */
        String f105401b;

        /* renamed from: c */
        String f105402c;

        /* renamed from: d */
        Typeface f105403d;

        /* renamed from: e */
        int f105404e;

        a() {
        }

        /* renamed from: a */
        public C21700a m111998a() {
            return new C21700a(this);
        }

        /* renamed from: b */
        public a m111999b(String str) {
            this.f105402c = str;
            return this;
        }

        /* renamed from: c */
        public a m112000c(int i11) {
            this.f105400a = i11;
            return this;
        }

        /* renamed from: d */
        public a m112001d(int i11) {
            this.f105404e = i11;
            return this;
        }

        /* renamed from: e */
        public a m112002e(String str) {
            this.f105401b = str;
            return this;
        }

        /* renamed from: f */
        public a m112003f(Typeface typeface) {
            this.f105403d = typeface;
            return this;
        }
    }

    /* renamed from: a */
    public static a m111990a() {
        return new a();
    }

    /* renamed from: b */
    public String m111991b() {
        return this.f105396c;
    }

    /* renamed from: c */
    public int m111992c() {
        return this.f105394a;
    }

    /* renamed from: d */
    public int m111993d() {
        return this.f105398e;
    }

    /* renamed from: e */
    public String m111994e() {
        return this.f105395b;
    }

    /* renamed from: f */
    public Typeface m111995f() {
        return this.f105397d;
    }

    /* renamed from: g */
    public boolean m111996g() {
        return this.f105399f;
    }

    /* renamed from: h */
    public void m111997h(boolean z11) {
        this.f105399f = z11;
    }

    private C21700a(a aVar) {
        this.f105399f = false;
        this.f105394a = aVar.f105400a;
        this.f105395b = aVar.f105401b;
        this.f105396c = aVar.f105402c;
        this.f105397d = aVar.f105403d;
        this.f105398e = aVar.f105404e;
    }
}
