package p670y5;

/* renamed from: y5.g2 */
/* loaded from: classes2.dex */
final class C30414g2 implements InterfaceC30509l2 {

    /* renamed from: a */
    private final int f141163a;

    /* renamed from: b */
    private final EnumC30490k2 f141164b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30414g2(int i11, EnumC30490k2 enumC30490k2) {
        this.f141163a = i11;
        this.f141164b = enumC30490k2;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC30509l2.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC30509l2)) {
            return false;
        }
        InterfaceC30509l2 interfaceC30509l2 = (InterfaceC30509l2) obj;
        if (this.f141163a == interfaceC30509l2.zza() && this.f141164b.equals(interfaceC30509l2.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f141163a ^ 14552422) + (this.f141164b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f141163a + "intEncoding=" + this.f141164b + ')';
    }

    @Override // p670y5.InterfaceC30509l2
    public final int zza() {
        return this.f141163a;
    }

    @Override // p670y5.InterfaceC30509l2
    public final EnumC30490k2 zzb() {
        return this.f141164b;
    }
}
