package ik0;

import ik0.AbstractC20596s;

/* renamed from: ik0.c */
/* loaded from: classes7.dex */
final class C20580c extends AbstractC20596s.b {

    /* renamed from: a */
    private final int f101213a;

    /* renamed from: b */
    private final Object f101214b;

    /* renamed from: ik0.c$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC20596s.b.a {

        /* renamed from: a */
        private Integer f101215a;

        /* renamed from: b */
        private Object f101216b;

        @Override // ik0.AbstractC20596s.b.a
        /* renamed from: a */
        public AbstractC20596s.b mo107075a() {
            String str = "";
            if (this.f101215a == null) {
                str = " type";
            }
            if (this.f101216b == null) {
                str = str + " data";
            }
            if (str.isEmpty()) {
                return new C20580c(this.f101215a.intValue(), this.f101216b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ik0.AbstractC20596s.b.a
        /* renamed from: b */
        public AbstractC20596s.b.a mo107076b(Object obj) {
            if (obj != null) {
                this.f101216b = obj;
                return this;
            }
            throw new NullPointerException("Null data");
        }

        /* renamed from: c */
        public AbstractC20596s.b.a m107077c(int i11) {
            this.f101215a = Integer.valueOf(i11);
            return this;
        }
    }

    @Override // ik0.AbstractC20596s.b
    /* renamed from: b */
    public Object mo107073b() {
        return this.f101214b;
    }

    @Override // ik0.AbstractC20596s.b
    /* renamed from: c */
    public int mo107074c() {
        return this.f101213a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20596s.b)) {
            return false;
        }
        AbstractC20596s.b bVar = (AbstractC20596s.b) obj;
        if (this.f101213a == bVar.mo107074c() && this.f101214b.equals(bVar.mo107073b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f101213a ^ 1000003) * 1000003) ^ this.f101214b.hashCode();
    }

    public String toString() {
        return "ZinstantExtraDataRequest{type=" + this.f101213a + ", data=" + this.f101214b + "}";
    }

    private C20580c(int i11, Object obj) {
        this.f101213a = i11;
        this.f101214b = obj;
    }
}
