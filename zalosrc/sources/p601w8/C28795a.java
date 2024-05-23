package p601w8;

import p601w8.InterfaceC28798d;

/* renamed from: w8.a */
/* loaded from: classes.dex */
public final class C28795a {

    /* renamed from: a */
    private int f133450a;

    /* renamed from: b */
    private InterfaceC28798d.a f133451b = InterfaceC28798d.a.DEFAULT;

    /* renamed from: w8.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC28798d {

        /* renamed from: a */
        private final int f133452a;

        /* renamed from: b */
        private final InterfaceC28798d.a f133453b;

        a(int i11, InterfaceC28798d.a aVar) {
            this.f133452a = i11;
            this.f133453b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC28798d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC28798d)) {
                return false;
            }
            InterfaceC28798d interfaceC28798d = (InterfaceC28798d) obj;
            if (this.f133452a == interfaceC28798d.tag() && this.f133453b.equals(interfaceC28798d.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f133452a) + (this.f133453b.hashCode() ^ 2041407134);
        }

        @Override // p601w8.InterfaceC28798d
        public InterfaceC28798d.a intEncoding() {
            return this.f133453b;
        }

        @Override // p601w8.InterfaceC28798d
        public int tag() {
            return this.f133452a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f133452a + "intEncoding=" + this.f133453b + ')';
        }
    }

    /* renamed from: b */
    public static C28795a m144037b() {
        return new C28795a();
    }

    /* renamed from: a */
    public InterfaceC28798d m144038a() {
        return new a(this.f133450a, this.f133451b);
    }

    /* renamed from: c */
    public C28795a m144039c(int i11) {
        this.f133450a = i11;
        return this;
    }
}
