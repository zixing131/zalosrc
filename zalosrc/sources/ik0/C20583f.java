package ik0;

import com.zing.zalo.zinstant.InterfaceC17139d;
import ik0.AbstractC20601x;

/* renamed from: ik0.f */
/* loaded from: classes7.dex */
final class C20583f extends AbstractC20601x.b {

    /* renamed from: a */
    private final String f101253a;

    /* renamed from: b */
    private final int f101254b;

    /* renamed from: c */
    private final int f101255c;

    /* renamed from: d */
    private final int f101256d;

    /* renamed from: e */
    private final int f101257e;

    /* renamed from: f */
    private final int f101258f;

    /* renamed from: g */
    private final String f101259g;

    /* renamed from: h */
    private final InterfaceC17139d f101260h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ik0.f$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC20601x.b.a {

        /* renamed from: a */
        private String f101261a;

        /* renamed from: b */
        private Integer f101262b;

        /* renamed from: c */
        private Integer f101263c;

        /* renamed from: d */
        private Integer f101264d;

        /* renamed from: e */
        private Integer f101265e;

        /* renamed from: f */
        private Integer f101266f;

        /* renamed from: g */
        private String f101267g;

        /* renamed from: h */
        private InterfaceC17139d f101268h;

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: a */
        public AbstractC20601x.b mo107126a() {
            String str = "";
            if (this.f101262b == null) {
                str = " width";
            }
            if (this.f101263c == null) {
                str = str + " height";
            }
            if (this.f101264d == null) {
                str = str + " offsetX";
            }
            if (this.f101265e == null) {
                str = str + " offsetY";
            }
            if (this.f101266f == null) {
                str = str + " theme";
            }
            if (this.f101267g == null) {
                str = str + " originalId";
            }
            if (str.isEmpty()) {
                return new C20583f(this.f101261a, this.f101262b.intValue(), this.f101263c.intValue(), this.f101264d.intValue(), this.f101265e.intValue(), this.f101266f.intValue(), this.f101267g, this.f101268h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: b */
        public AbstractC20601x.b.a mo107127b(int i11) {
            this.f101263c = Integer.valueOf(i11);
            return this;
        }

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: c */
        public AbstractC20601x.b.a mo107128c(InterfaceC17139d interfaceC17139d) {
            this.f101268h = interfaceC17139d;
            return this;
        }

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: d */
        public AbstractC20601x.b.a mo107129d(String str) {
            this.f101261a = str;
            return this;
        }

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: e */
        public AbstractC20601x.b.a mo107130e(int i11) {
            this.f101264d = Integer.valueOf(i11);
            return this;
        }

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: f */
        public AbstractC20601x.b.a mo107131f(int i11) {
            this.f101265e = Integer.valueOf(i11);
            return this;
        }

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: g */
        public AbstractC20601x.b.a mo107132g(String str) {
            if (str != null) {
                this.f101267g = str;
                return this;
            }
            throw new NullPointerException("Null originalId");
        }

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: h */
        public AbstractC20601x.b.a mo107133h(int i11) {
            this.f101266f = Integer.valueOf(i11);
            return this;
        }

        @Override // ik0.AbstractC20601x.b.a
        /* renamed from: i */
        public AbstractC20601x.b.a mo107134i(int i11) {
            this.f101262b = Integer.valueOf(i11);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC20601x.b bVar) {
            this.f101261a = bVar.mo107119d();
            this.f101262b = Integer.valueOf(bVar.mo107125j());
            this.f101263c = Integer.valueOf(bVar.mo107117b());
            this.f101264d = Integer.valueOf(bVar.mo107121f());
            this.f101265e = Integer.valueOf(bVar.mo107122g());
            this.f101266f = Integer.valueOf(bVar.mo107124i());
            this.f101267g = bVar.mo107123h();
            this.f101268h = bVar.mo107118c();
        }
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: b */
    public int mo107117b() {
        return this.f101255c;
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: c */
    public InterfaceC17139d mo107118c() {
        return this.f101260h;
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: d */
    public String mo107119d() {
        return this.f101253a;
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: e */
    public AbstractC20601x.b.a mo107120e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20601x.b)) {
            return false;
        }
        AbstractC20601x.b bVar = (AbstractC20601x.b) obj;
        String str = this.f101253a;
        if (str != null ? str.equals(bVar.mo107119d()) : bVar.mo107119d() == null) {
            if (this.f101254b == bVar.mo107125j() && this.f101255c == bVar.mo107117b() && this.f101256d == bVar.mo107121f() && this.f101257e == bVar.mo107122g() && this.f101258f == bVar.mo107124i() && this.f101259g.equals(bVar.mo107123h())) {
                InterfaceC17139d interfaceC17139d = this.f101260h;
                if (interfaceC17139d == null) {
                    if (bVar.mo107118c() == null) {
                        return true;
                    }
                } else if (interfaceC17139d.equals(bVar.mo107118c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: f */
    public int mo107121f() {
        return this.f101256d;
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: g */
    public int mo107122g() {
        return this.f101257e;
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: h */
    public String mo107123h() {
        return this.f101259g;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f101253a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (((((((((((((hashCode ^ 1000003) * 1000003) ^ this.f101254b) * 1000003) ^ this.f101255c) * 1000003) ^ this.f101256d) * 1000003) ^ this.f101257e) * 1000003) ^ this.f101258f) * 1000003) ^ this.f101259g.hashCode()) * 1000003;
        InterfaceC17139d interfaceC17139d = this.f101260h;
        if (interfaceC17139d != null) {
            i11 = interfaceC17139d.hashCode();
        }
        return hashCode2 ^ i11;
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: i */
    public int mo107124i() {
        return this.f101258f;
    }

    @Override // ik0.AbstractC20601x.b
    /* renamed from: j */
    public int mo107125j() {
        return this.f101254b;
    }

    public String toString() {
        return "Target{locale=" + this.f101253a + ", width=" + this.f101254b + ", height=" + this.f101255c + ", offsetX=" + this.f101256d + ", offsetY=" + this.f101257e + ", theme=" + this.f101258f + ", originalId=" + this.f101259g + ", layoutGateway=" + this.f101260h + "}";
    }

    private C20583f(String str, int i11, int i12, int i13, int i14, int i15, String str2, InterfaceC17139d interfaceC17139d) {
        this.f101253a = str;
        this.f101254b = i11;
        this.f101255c = i12;
        this.f101256d = i13;
        this.f101257e = i14;
        this.f101258f = i15;
        this.f101259g = str2;
        this.f101260h = interfaceC17139d;
    }
}
