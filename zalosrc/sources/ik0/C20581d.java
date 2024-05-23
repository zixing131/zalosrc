package ik0;

import ik0.AbstractC20597t;

/* renamed from: ik0.d */
/* loaded from: classes7.dex */
final class C20581d extends AbstractC20597t {

    /* renamed from: a */
    private final AbstractC20596s f101217a;

    /* renamed from: b */
    private final AbstractC20596s f101218b;

    /* renamed from: c */
    private final String f101219c;

    /* renamed from: ik0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC20597t.a {

        /* renamed from: a */
        private AbstractC20596s f101220a;

        /* renamed from: b */
        private AbstractC20596s f101221b;

        /* renamed from: c */
        private String f101222c;

        @Override // ik0.AbstractC20597t.a
        /* renamed from: a */
        public AbstractC20597t mo107081a() {
            String str = "";
            if (this.f101220a == null) {
                str = " rootLayoutRequest";
            }
            if (this.f101222c == null) {
                str = str + " zinstantDataId";
            }
            if (str.isEmpty()) {
                return new C20581d(this.f101220a, this.f101221b, this.f101222c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ik0.AbstractC20597t.a
        /* renamed from: b */
        public AbstractC20597t.a mo107082b(AbstractC20596s abstractC20596s) {
            if (abstractC20596s != null) {
                this.f101220a = abstractC20596s;
                return this;
            }
            throw new NullPointerException("Null rootLayoutRequest");
        }

        @Override // ik0.AbstractC20597t.a
        /* renamed from: c */
        public AbstractC20597t.a mo107083c(AbstractC20596s abstractC20596s) {
            this.f101221b = abstractC20596s;
            return this;
        }

        /* renamed from: d */
        public AbstractC20597t.a m107084d(String str) {
            if (str != null) {
                this.f101222c = str;
                return this;
            }
            throw new NullPointerException("Null zinstantDataId");
        }
    }

    /* synthetic */ C20581d(AbstractC20596s abstractC20596s, AbstractC20596s abstractC20596s2, String str, a aVar) {
        this(abstractC20596s, abstractC20596s2, str);
    }

    public boolean equals(Object obj) {
        AbstractC20596s abstractC20596s;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20597t)) {
            return false;
        }
        AbstractC20597t abstractC20597t = (AbstractC20597t) obj;
        if (this.f101217a.equals(abstractC20597t.mo107078f()) && ((abstractC20596s = this.f101218b) != null ? abstractC20596s.equals(abstractC20597t.mo107079g()) : abstractC20597t.mo107079g() == null) && this.f101219c.equals(abstractC20597t.mo107080h())) {
            return true;
        }
        return false;
    }

    @Override // ik0.AbstractC20597t
    /* renamed from: f */
    public AbstractC20596s mo107078f() {
        return this.f101217a;
    }

    @Override // ik0.AbstractC20597t
    /* renamed from: g */
    public AbstractC20596s mo107079g() {
        return this.f101218b;
    }

    @Override // ik0.AbstractC20597t
    /* renamed from: h */
    public String mo107080h() {
        return this.f101219c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f101217a.hashCode() ^ 1000003) * 1000003;
        AbstractC20596s abstractC20596s = this.f101218b;
        if (abstractC20596s == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC20596s.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f101219c.hashCode();
    }

    public String toString() {
        return "ZinstantDataRequest{rootLayoutRequest=" + this.f101217a + ", skeletonLayoutRequest=" + this.f101218b + ", zinstantDataId=" + this.f101219c + "}";
    }

    private C20581d(AbstractC20596s abstractC20596s, AbstractC20596s abstractC20596s2, String str) {
        this.f101217a = abstractC20596s;
        this.f101218b = abstractC20596s2;
        this.f101219c = str;
    }
}
