package p705z5;

/* renamed from: z5.e */
/* loaded from: classes2.dex */
final class C31351e implements InterfaceC31421j {

    /* renamed from: a */
    private final int f144447a;

    /* renamed from: b */
    private final EnumC31407i f144448b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31351e(int i11, EnumC31407i enumC31407i) {
        this.f144447a = i11;
        this.f144448b = enumC31407i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC31421j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC31421j)) {
            return false;
        }
        InterfaceC31421j interfaceC31421j = (InterfaceC31421j) obj;
        if (this.f144447a == interfaceC31421j.zza() && this.f144448b.equals(interfaceC31421j.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f144447a ^ 14552422) + (this.f144448b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f144447a + "intEncoding=" + this.f144448b + ')';
    }

    @Override // p705z5.InterfaceC31421j
    public final int zza() {
        return this.f144447a;
    }

    @Override // p705z5.InterfaceC31421j
    public final EnumC31407i zzb() {
        return this.f144448b;
    }
}
