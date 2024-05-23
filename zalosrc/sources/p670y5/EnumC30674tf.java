package p670y5;

/* renamed from: y5.tf */
/* loaded from: classes2.dex */
public enum EnumC30674tf implements InterfaceC30471j2 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);


    /* renamed from: p */
    private final int f141868p;

    EnumC30674tf(int i11) {
        this.f141868p = i11;
    }

    @Override // p670y5.InterfaceC30471j2
    public final int zza() {
        return this.f141868p;
    }
}
