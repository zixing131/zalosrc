package p030b4;

import java.util.Arrays;
import p030b4.AbstractC2512f;

/* renamed from: b4.a */
/* loaded from: classes.dex */
final class C2507a extends AbstractC2512f {

    /* renamed from: a */
    private final Iterable f10207a;

    /* renamed from: b */
    private final byte[] f10208b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b4.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2512f.a {

        /* renamed from: a */
        private Iterable f10209a;

        /* renamed from: b */
        private byte[] f10210b;

        @Override // p030b4.AbstractC2512f.a
        /* renamed from: a */
        public AbstractC2512f mo12590a() {
            String str = "";
            if (this.f10209a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C2507a(this.f10209a, this.f10210b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p030b4.AbstractC2512f.a
        /* renamed from: b */
        public AbstractC2512f.a mo12591b(Iterable iterable) {
            if (iterable != null) {
                this.f10209a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // p030b4.AbstractC2512f.a
        /* renamed from: c */
        public AbstractC2512f.a mo12592c(byte[] bArr) {
            this.f10210b = bArr;
            return this;
        }
    }

    /* synthetic */ C2507a(Iterable iterable, byte[] bArr, a aVar) {
        this(iterable, bArr);
    }

    @Override // p030b4.AbstractC2512f
    /* renamed from: b */
    public Iterable mo12588b() {
        return this.f10207a;
    }

    @Override // p030b4.AbstractC2512f
    /* renamed from: c */
    public byte[] mo12589c() {
        return this.f10208b;
    }

    public boolean equals(Object obj) {
        byte[] mo12589c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2512f)) {
            return false;
        }
        AbstractC2512f abstractC2512f = (AbstractC2512f) obj;
        if (this.f10207a.equals(abstractC2512f.mo12588b())) {
            byte[] bArr = this.f10208b;
            if (abstractC2512f instanceof C2507a) {
                mo12589c = ((C2507a) abstractC2512f).f10208b;
            } else {
                mo12589c = abstractC2512f.mo12589c();
            }
            if (Arrays.equals(bArr, mo12589c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f10207a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10208b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f10207a + ", extras=" + Arrays.toString(this.f10208b) + "}";
    }

    private C2507a(Iterable iterable, byte[] bArr) {
        this.f10207a = iterable;
        this.f10208b = bArr;
    }
}
