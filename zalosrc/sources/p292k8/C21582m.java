package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.m */
/* loaded from: classes.dex */
final class C21582m extends AbstractC21569b0.e.d.a {

    /* renamed from: a */
    private final AbstractC21569b0.e.d.a.b f104842a;

    /* renamed from: b */
    private final C21571c0 f104843b;

    /* renamed from: c */
    private final C21571c0 f104844c;

    /* renamed from: d */
    private final Boolean f104845d;

    /* renamed from: e */
    private final int f104846e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.m$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC21569b0.e.d.a.AbstractC32857a {

        /* renamed from: a */
        private AbstractC21569b0.e.d.a.b f104847a;

        /* renamed from: b */
        private C21571c0 f104848b;

        /* renamed from: c */
        private C21571c0 f104849c;

        /* renamed from: d */
        private Boolean f104850d;

        /* renamed from: e */
        private Integer f104851e;

        @Override // p292k8.AbstractC21569b0.e.d.a.AbstractC32857a
        /* renamed from: a */
        public AbstractC21569b0.e.d.a mo111387a() {
            String str = "";
            if (this.f104847a == null) {
                str = " execution";
            }
            if (this.f104851e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C21582m(this.f104847a, this.f104848b, this.f104849c, this.f104850d, this.f104851e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.AbstractC32857a
        /* renamed from: b */
        public AbstractC21569b0.e.d.a.AbstractC32857a mo111388b(Boolean bool) {
            this.f104850d = bool;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.AbstractC32857a
        /* renamed from: c */
        public AbstractC21569b0.e.d.a.AbstractC32857a mo111389c(C21571c0 c21571c0) {
            this.f104848b = c21571c0;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.AbstractC32857a
        /* renamed from: d */
        public AbstractC21569b0.e.d.a.AbstractC32857a mo111390d(AbstractC21569b0.e.d.a.b bVar) {
            if (bVar != null) {
                this.f104847a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.AbstractC32857a
        /* renamed from: e */
        public AbstractC21569b0.e.d.a.AbstractC32857a mo111391e(C21571c0 c21571c0) {
            this.f104849c = c21571c0;
            return this;
        }

        @Override // p292k8.AbstractC21569b0.e.d.a.AbstractC32857a
        /* renamed from: f */
        public AbstractC21569b0.e.d.a.AbstractC32857a mo111392f(int i11) {
            this.f104851e = Integer.valueOf(i11);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC21569b0.e.d.a aVar) {
            this.f104847a = aVar.mo111383d();
            this.f104848b = aVar.mo111382c();
            this.f104849c = aVar.mo111384e();
            this.f104850d = aVar.mo111381b();
            this.f104851e = Integer.valueOf(aVar.mo111385f());
        }
    }

    @Override // p292k8.AbstractC21569b0.e.d.a
    /* renamed from: b */
    public Boolean mo111381b() {
        return this.f104845d;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a
    /* renamed from: c */
    public C21571c0 mo111382c() {
        return this.f104843b;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a
    /* renamed from: d */
    public AbstractC21569b0.e.d.a.b mo111383d() {
        return this.f104842a;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a
    /* renamed from: e */
    public C21571c0 mo111384e() {
        return this.f104844c;
    }

    public boolean equals(Object obj) {
        C21571c0 c21571c0;
        C21571c0 c21571c02;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.e.d.a)) {
            return false;
        }
        AbstractC21569b0.e.d.a aVar = (AbstractC21569b0.e.d.a) obj;
        if (this.f104842a.equals(aVar.mo111383d()) && ((c21571c0 = this.f104843b) != null ? c21571c0.equals(aVar.mo111382c()) : aVar.mo111382c() == null) && ((c21571c02 = this.f104844c) != null ? c21571c02.equals(aVar.mo111384e()) : aVar.mo111384e() == null) && ((bool = this.f104845d) != null ? bool.equals(aVar.mo111381b()) : aVar.mo111381b() == null) && this.f104846e == aVar.mo111385f()) {
            return true;
        }
        return false;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a
    /* renamed from: f */
    public int mo111385f() {
        return this.f104846e;
    }

    @Override // p292k8.AbstractC21569b0.e.d.a
    /* renamed from: g */
    public AbstractC21569b0.e.d.a.AbstractC32857a mo111386g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f104842a.hashCode() ^ 1000003) * 1000003;
        C21571c0 c21571c0 = this.f104843b;
        int i11 = 0;
        if (c21571c0 == null) {
            hashCode = 0;
        } else {
            hashCode = c21571c0.hashCode();
        }
        int i12 = (hashCode3 ^ hashCode) * 1000003;
        C21571c0 c21571c02 = this.f104844c;
        if (c21571c02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c21571c02.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        Boolean bool = this.f104845d;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return ((i13 ^ i11) * 1000003) ^ this.f104846e;
    }

    public String toString() {
        return "Application{execution=" + this.f104842a + ", customAttributes=" + this.f104843b + ", internalKeys=" + this.f104844c + ", background=" + this.f104845d + ", uiOrientation=" + this.f104846e + "}";
    }

    private C21582m(AbstractC21569b0.e.d.a.b bVar, C21571c0 c21571c0, C21571c0 c21571c02, Boolean bool, int i11) {
        this.f104842a = bVar;
        this.f104843b = c21571c0;
        this.f104844c = c21571c02;
        this.f104845d = bool;
        this.f104846e = i11;
    }
}
