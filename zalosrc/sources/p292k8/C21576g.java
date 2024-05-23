package p292k8;

import java.util.Arrays;
import p292k8.AbstractC21569b0;

/* renamed from: k8.g */
/* loaded from: classes.dex */
final class C21576g extends AbstractC21569b0.d.b {

    /* renamed from: a */
    private final String f104776a;

    /* renamed from: b */
    private final byte[] f104777b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC21569b0.d.b.a {

        /* renamed from: a */
        private String f104778a;

        /* renamed from: b */
        private byte[] f104779b;

        @Override // p292k8.AbstractC21569b0.d.b.a
        /* renamed from: a */
        public AbstractC21569b0.d.b mo111306a() {
            String str = "";
            if (this.f104778a == null) {
                str = " filename";
            }
            if (this.f104779b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C21576g(this.f104778a, this.f104779b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p292k8.AbstractC21569b0.d.b.a
        /* renamed from: b */
        public AbstractC21569b0.d.b.a mo111307b(byte[] bArr) {
            if (bArr != null) {
                this.f104779b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // p292k8.AbstractC21569b0.d.b.a
        /* renamed from: c */
        public AbstractC21569b0.d.b.a mo111308c(String str) {
            if (str != null) {
                this.f104778a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // p292k8.AbstractC21569b0.d.b
    /* renamed from: b */
    public byte[] mo111304b() {
        return this.f104777b;
    }

    @Override // p292k8.AbstractC21569b0.d.b
    /* renamed from: c */
    public String mo111305c() {
        return this.f104776a;
    }

    public boolean equals(Object obj) {
        byte[] mo111304b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21569b0.d.b)) {
            return false;
        }
        AbstractC21569b0.d.b bVar = (AbstractC21569b0.d.b) obj;
        if (this.f104776a.equals(bVar.mo111305c())) {
            byte[] bArr = this.f104777b;
            if (bVar instanceof C21576g) {
                mo111304b = ((C21576g) bVar).f104777b;
            } else {
                mo111304b = bVar.mo111304b();
            }
            if (Arrays.equals(bArr, mo111304b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f104776a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f104777b);
    }

    public String toString() {
        return "File{filename=" + this.f104776a + ", contents=" + Arrays.toString(this.f104777b) + "}";
    }

    private C21576g(String str, byte[] bArr) {
        this.f104776a = str;
        this.f104777b = bArr;
    }
}
