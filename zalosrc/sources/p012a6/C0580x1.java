package p012a6;

/* renamed from: a6.x1 */
/* loaded from: classes2.dex */
final class C0580x1 implements InterfaceC0185c2 {

    /* renamed from: a */
    private final int f2039a;

    /* renamed from: b */
    private final EnumC0166b2 f2040b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0580x1(int i11, EnumC0166b2 enumC0166b2) {
        this.f2039a = i11;
        this.f2040b = enumC0166b2;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC0185c2.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC0185c2)) {
            return false;
        }
        InterfaceC0185c2 interfaceC0185c2 = (InterfaceC0185c2) obj;
        if (this.f2039a == interfaceC0185c2.zza() && this.f2040b.equals(interfaceC0185c2.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f2039a ^ 14552422) + (this.f2040b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f2039a + "intEncoding=" + this.f2040b + ')';
    }

    @Override // p012a6.InterfaceC0185c2
    public final int zza() {
        return this.f2039a;
    }

    @Override // p012a6.InterfaceC0185c2
    public final EnumC0166b2 zzb() {
        return this.f2040b;
    }
}
