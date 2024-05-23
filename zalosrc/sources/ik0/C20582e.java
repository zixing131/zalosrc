package ik0;

import ik0.AbstractC20601x;
import jk0.C21282a;

/* renamed from: ik0.e */
/* loaded from: classes7.dex */
final class C20582e extends AbstractC20601x {

    /* renamed from: a */
    private final AbstractC20597t f101223a;

    /* renamed from: b */
    private final AbstractC20595r f101224b;

    /* renamed from: c */
    private final int f101225c;

    /* renamed from: d */
    private final boolean f101226d;

    /* renamed from: e */
    private final boolean f101227e;

    /* renamed from: f */
    private final int f101228f;

    /* renamed from: g */
    private final boolean f101229g;

    /* renamed from: h */
    private final boolean f101230h;

    /* renamed from: i */
    private final String f101231i;

    /* renamed from: j */
    private final AbstractC20601x.b f101232j;

    /* renamed from: k */
    private final C21282a f101233k;

    /* renamed from: l */
    private final EnumC20598u f101234l;

    /* renamed from: m */
    private final String f101235m;

    /* renamed from: n */
    private final String f101236n;

    /* renamed from: o */
    private final InterfaceC20578a0 f101237o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ik0.e$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC20601x.a {

        /* renamed from: a */
        private AbstractC20597t f101238a;

        /* renamed from: b */
        private AbstractC20595r f101239b;

        /* renamed from: c */
        private Integer f101240c;

        /* renamed from: d */
        private Boolean f101241d;

        /* renamed from: e */
        private Boolean f101242e;

        /* renamed from: f */
        private Integer f101243f;

        /* renamed from: g */
        private Boolean f101244g;

        /* renamed from: h */
        private Boolean f101245h;

        /* renamed from: i */
        private String f101246i;

        /* renamed from: j */
        private AbstractC20601x.b f101247j;

        /* renamed from: k */
        private C21282a f101248k;

        /* renamed from: l */
        private EnumC20598u f101249l;

        /* renamed from: m */
        private String f101250m;

        /* renamed from: n */
        private String f101251n;

        /* renamed from: o */
        private InterfaceC20578a0 f101252o;

        @Override // ik0.AbstractC20601x.a
        /* renamed from: a */
        AbstractC20601x.a mo107101a(boolean z11) {
            this.f101242e = Boolean.valueOf(z11);
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: b */
        public AbstractC20601x.a mo107102b(boolean z11) {
            this.f101244g = Boolean.valueOf(z11);
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: c */
        public AbstractC20601x mo107103c() {
            String str = "";
            if (this.f101240c == null) {
                str = " requestType";
            }
            if (this.f101241d == null) {
                str = str + " skipCache";
            }
            if (this.f101242e == null) {
                str = str + " __skipChecksum";
            }
            if (this.f101243f == null) {
                str = str + " featureType";
            }
            if (this.f101244g == null) {
                str = str + " allowAccessNetwork";
            }
            if (this.f101245h == null) {
                str = str + " includeExpiredLayout";
            }
            if (this.f101246i == null) {
                str = str + " zinstantDataId";
            }
            if (this.f101249l == null) {
                str = str + " expiredTimeStrategy";
            }
            if (str.isEmpty()) {
                return new C20582e(this.f101238a, this.f101239b, this.f101240c.intValue(), this.f101241d.booleanValue(), this.f101242e.booleanValue(), this.f101243f.intValue(), this.f101244g.booleanValue(), this.f101245h.booleanValue(), this.f101246i, this.f101247j, this.f101248k, this.f101249l, this.f101250m, this.f101251n, this.f101252o);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: d */
        public AbstractC20601x.a mo107104d(InterfaceC20578a0 interfaceC20578a0) {
            this.f101252o = interfaceC20578a0;
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: e */
        public AbstractC20601x.a mo107105e(String str) {
            this.f101251n = str;
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: f */
        public AbstractC20601x.a mo107106f(EnumC20598u enumC20598u) {
            if (enumC20598u != null) {
                this.f101249l = enumC20598u;
                return this;
            }
            throw new NullPointerException("Null expiredTimeStrategy");
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: g */
        public AbstractC20601x.a mo107107g(int i11) {
            this.f101243f = Integer.valueOf(i11);
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: h */
        public AbstractC20601x.a mo107108h(String str) {
            this.f101250m = str;
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: i */
        public AbstractC20601x.a mo107109i(boolean z11) {
            this.f101245h = Boolean.valueOf(z11);
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: j */
        AbstractC20601x.a mo107110j(int i11) {
            this.f101240c = Integer.valueOf(i11);
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: k */
        public AbstractC20601x.a mo107111k(boolean z11) {
            this.f101241d = Boolean.valueOf(z11);
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: l */
        public AbstractC20601x.a mo107112l(AbstractC20601x.b bVar) {
            this.f101247j = bVar;
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: m */
        public AbstractC20601x.a mo107113m(C21282a c21282a) {
            this.f101248k = c21282a;
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: n */
        public AbstractC20601x.a mo107114n(AbstractC20595r abstractC20595r) {
            this.f101239b = abstractC20595r;
            return this;
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: o */
        public AbstractC20601x.a mo107115o(String str) {
            if (str != null) {
                this.f101246i = str;
                return this;
            }
            throw new NullPointerException("Null zinstantDataId");
        }

        @Override // ik0.AbstractC20601x.a
        /* renamed from: p */
        public AbstractC20601x.a mo107116p(AbstractC20597t abstractC20597t) {
            this.f101238a = abstractC20597t;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC20601x abstractC20601x) {
            this.f101238a = abstractC20601x.mo107100s();
            this.f101239b = abstractC20601x.mo107098q();
            this.f101240c = Integer.valueOf(abstractC20601x.mo107094m());
            this.f101241d = Boolean.valueOf(abstractC20601x.mo107095n());
            this.f101242e = Boolean.valueOf(abstractC20601x.mo107085a());
            this.f101243f = Integer.valueOf(abstractC20601x.mo107090i());
            this.f101244g = Boolean.valueOf(abstractC20601x.mo107086b());
            this.f101245h = Boolean.valueOf(abstractC20601x.mo107092k());
            this.f101246i = abstractC20601x.mo107099r();
            this.f101247j = abstractC20601x.mo107096o();
            this.f101248k = abstractC20601x.mo107097p();
            this.f101249l = abstractC20601x.mo107089h();
            this.f101250m = abstractC20601x.mo107091j();
            this.f101251n = abstractC20601x.mo107088f();
            this.f101252o = abstractC20601x.mo107087e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ik0.AbstractC20601x
    /* renamed from: a */
    public boolean mo107085a() {
        return this.f101227e;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: b */
    public boolean mo107086b() {
        return this.f101229g;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: e */
    public InterfaceC20578a0 mo107087e() {
        return this.f101237o;
    }

    public boolean equals(Object obj) {
        AbstractC20601x.b bVar;
        C21282a c21282a;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20601x)) {
            return false;
        }
        AbstractC20601x abstractC20601x = (AbstractC20601x) obj;
        AbstractC20597t abstractC20597t = this.f101223a;
        if (abstractC20597t != null ? abstractC20597t.equals(abstractC20601x.mo107100s()) : abstractC20601x.mo107100s() == null) {
            AbstractC20595r abstractC20595r = this.f101224b;
            if (abstractC20595r != null ? abstractC20595r.equals(abstractC20601x.mo107098q()) : abstractC20601x.mo107098q() == null) {
                if (this.f101225c == abstractC20601x.mo107094m() && this.f101226d == abstractC20601x.mo107095n() && this.f101227e == abstractC20601x.mo107085a() && this.f101228f == abstractC20601x.mo107090i() && this.f101229g == abstractC20601x.mo107086b() && this.f101230h == abstractC20601x.mo107092k() && this.f101231i.equals(abstractC20601x.mo107099r()) && ((bVar = this.f101232j) != null ? bVar.equals(abstractC20601x.mo107096o()) : abstractC20601x.mo107096o() == null) && ((c21282a = this.f101233k) != null ? c21282a.equals(abstractC20601x.mo107097p()) : abstractC20601x.mo107097p() == null) && this.f101234l.equals(abstractC20601x.mo107089h()) && ((str = this.f101235m) != null ? str.equals(abstractC20601x.mo107091j()) : abstractC20601x.mo107091j() == null) && ((str2 = this.f101236n) != null ? str2.equals(abstractC20601x.mo107088f()) : abstractC20601x.mo107088f() == null)) {
                    InterfaceC20578a0 interfaceC20578a0 = this.f101237o;
                    if (interfaceC20578a0 == null) {
                        if (abstractC20601x.mo107087e() == null) {
                            return true;
                        }
                    } else if (interfaceC20578a0.equals(abstractC20601x.mo107087e())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: f */
    public String mo107088f() {
        return this.f101236n;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: h */
    public EnumC20598u mo107089h() {
        return this.f101234l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i11;
        int i12;
        int i13;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        AbstractC20597t abstractC20597t = this.f101223a;
        int i14 = 0;
        if (abstractC20597t == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC20597t.hashCode();
        }
        int i15 = (hashCode ^ 1000003) * 1000003;
        AbstractC20595r abstractC20595r = this.f101224b;
        if (abstractC20595r == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC20595r.hashCode();
        }
        int i16 = (((i15 ^ hashCode2) * 1000003) ^ this.f101225c) * 1000003;
        int i17 = 1237;
        if (this.f101226d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i18 = (i16 ^ i11) * 1000003;
        if (this.f101227e) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i19 = (((i18 ^ i12) * 1000003) ^ this.f101228f) * 1000003;
        if (this.f101229g) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i21 = (i19 ^ i13) * 1000003;
        if (this.f101230h) {
            i17 = 1231;
        }
        int hashCode7 = (((i21 ^ i17) * 1000003) ^ this.f101231i.hashCode()) * 1000003;
        AbstractC20601x.b bVar = this.f101232j;
        if (bVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bVar.hashCode();
        }
        int i22 = (hashCode7 ^ hashCode3) * 1000003;
        C21282a c21282a = this.f101233k;
        if (c21282a == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c21282a.hashCode();
        }
        int hashCode8 = (((i22 ^ hashCode4) * 1000003) ^ this.f101234l.hashCode()) * 1000003;
        String str = this.f101235m;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i23 = (hashCode8 ^ hashCode5) * 1000003;
        String str2 = this.f101236n;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i24 = (i23 ^ hashCode6) * 1000003;
        InterfaceC20578a0 interfaceC20578a0 = this.f101237o;
        if (interfaceC20578a0 != null) {
            i14 = interfaceC20578a0.hashCode();
        }
        return i24 ^ i14;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: i */
    public int mo107090i() {
        return this.f101228f;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: j */
    public String mo107091j() {
        return this.f101235m;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: k */
    public boolean mo107092k() {
        return this.f101230h;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: l */
    public AbstractC20601x.a mo107093l() {
        return new b(this);
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: m */
    public int mo107094m() {
        return this.f101225c;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: n */
    public boolean mo107095n() {
        return this.f101226d;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: o */
    public AbstractC20601x.b mo107096o() {
        return this.f101232j;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: p */
    public C21282a mo107097p() {
        return this.f101233k;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: q */
    public AbstractC20595r mo107098q() {
        return this.f101224b;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: r */
    public String mo107099r() {
        return this.f101231i;
    }

    @Override // ik0.AbstractC20601x
    /* renamed from: s */
    public AbstractC20597t mo107100s() {
        return this.f101223a;
    }

    public String toString() {
        return "ZinstantRequest{zinstantDataRequest=" + this.f101223a + ", zinstantDataConfigRequest=" + this.f101224b + ", requestType=" + this.f101225c + ", skipCache=" + this.f101226d + ", __skipChecksum=" + this.f101227e + ", featureType=" + this.f101228f + ", allowAccessNetwork=" + this.f101229g + ", includeExpiredLayout=" + this.f101230h + ", zinstantDataId=" + this.f101231i + ", target=" + this.f101232j + ", targetDevice=" + this.f101233k + ", expiredTimeStrategy=" + this.f101234l + ", identifyKey=" + this.f101235m + ", customPath=" + this.f101236n + ", currentTree=" + this.f101237o + "}";
    }

    private C20582e(AbstractC20597t abstractC20597t, AbstractC20595r abstractC20595r, int i11, boolean z11, boolean z12, int i12, boolean z13, boolean z14, String str, AbstractC20601x.b bVar, C21282a c21282a, EnumC20598u enumC20598u, String str2, String str3, InterfaceC20578a0 interfaceC20578a0) {
        this.f101223a = abstractC20597t;
        this.f101224b = abstractC20595r;
        this.f101225c = i11;
        this.f101226d = z11;
        this.f101227e = z12;
        this.f101228f = i12;
        this.f101229g = z13;
        this.f101230h = z14;
        this.f101231i = str;
        this.f101232j = bVar;
        this.f101233k = c21282a;
        this.f101234l = enumC20598u;
        this.f101235m = str2;
        this.f101236n = str3;
        this.f101237o = interfaceC20578a0;
    }
}
