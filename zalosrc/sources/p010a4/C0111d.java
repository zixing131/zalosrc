package p010a4;

import java.util.Arrays;
import p010a4.AbstractC0123p;
import p668y3.EnumC30278d;

/* renamed from: a4.d */
/* loaded from: classes.dex */
final class C0111d extends AbstractC0123p {

    /* renamed from: a */
    private final String f672a;

    /* renamed from: b */
    private final byte[] f673b;

    /* renamed from: c */
    private final EnumC30278d f674c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a4.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0123p.a {

        /* renamed from: a */
        private String f675a;

        /* renamed from: b */
        private byte[] f676b;

        /* renamed from: c */
        private EnumC30278d f677c;

        @Override // p010a4.AbstractC0123p.a
        /* renamed from: a */
        public AbstractC0123p mo516a() {
            String str = "";
            if (this.f675a == null) {
                str = " backendName";
            }
            if (this.f677c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C0111d(this.f675a, this.f676b, this.f677c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p010a4.AbstractC0123p.a
        /* renamed from: b */
        public AbstractC0123p.a mo517b(String str) {
            if (str != null) {
                this.f675a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // p010a4.AbstractC0123p.a
        /* renamed from: c */
        public AbstractC0123p.a mo518c(byte[] bArr) {
            this.f676b = bArr;
            return this;
        }

        @Override // p010a4.AbstractC0123p.a
        /* renamed from: d */
        public AbstractC0123p.a mo519d(EnumC30278d enumC30278d) {
            if (enumC30278d != null) {
                this.f677c = enumC30278d;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    /* synthetic */ C0111d(String str, byte[] bArr, EnumC30278d enumC30278d, a aVar) {
        this(str, bArr, enumC30278d);
    }

    @Override // p010a4.AbstractC0123p
    /* renamed from: b */
    public String mo513b() {
        return this.f672a;
    }

    @Override // p010a4.AbstractC0123p
    /* renamed from: c */
    public byte[] mo514c() {
        return this.f673b;
    }

    @Override // p010a4.AbstractC0123p
    /* renamed from: d */
    public EnumC30278d mo515d() {
        return this.f674c;
    }

    public boolean equals(Object obj) {
        byte[] mo514c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0123p)) {
            return false;
        }
        AbstractC0123p abstractC0123p = (AbstractC0123p) obj;
        if (this.f672a.equals(abstractC0123p.mo513b())) {
            byte[] bArr = this.f673b;
            if (abstractC0123p instanceof C0111d) {
                mo514c = ((C0111d) abstractC0123p).f673b;
            } else {
                mo514c = abstractC0123p.mo514c();
            }
            if (Arrays.equals(bArr, mo514c) && this.f674c.equals(abstractC0123p.mo515d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f672a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f673b)) * 1000003) ^ this.f674c.hashCode();
    }

    private C0111d(String str, byte[] bArr, EnumC30278d enumC30278d) {
        this.f672a = str;
        this.f673b = bArr;
        this.f674c = enumC30278d;
    }
}
