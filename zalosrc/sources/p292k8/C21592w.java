package p292k8;

import p292k8.AbstractC21569b0;

/* renamed from: k8.w */
/* loaded from: classes.dex */
final class C21592w extends AbstractC21569b0.e.f {

    /* renamed from: a */
    private final String f104924a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.w$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC21569b0.e.f.a {

        /* renamed from: a */
        private String f104925a;

        @Override // p292k8.AbstractC21569b0.e.f.a
        /* renamed from: a */
        public AbstractC21569b0.e.f mo111493a() {
            String str = "";
            if (this.f104925a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new C21592w(this.f104925a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.e.f.a
        /* renamed from: b */
        public AbstractC21569b0.e.f.a mo111494b(String str) {
            if (str != null) {
                this.f104925a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // p292k8.AbstractC21569b0.e.f
    /* renamed from: b */
    public String mo111492b() {
        return this.f104924a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC21569b0.e.f) {
            return this.f104924a.equals(((AbstractC21569b0.e.f) obj).mo111492b());
        }
        return false;
    }

    public int hashCode() {
        return this.f104924a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f104924a + "}";
    }

    private C21592w(String str) {
        this.f104924a = str;
    }
}
