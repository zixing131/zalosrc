package p670y5;

/* renamed from: y5.pb */
/* loaded from: classes2.dex */
public enum EnumC30594pb implements InterfaceC30471j2 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    /* renamed from: p */
    private final int f141653p;

    EnumC30594pb(int i11) {
        this.f141653p = i11;
    }

    @Override // p670y5.InterfaceC30471j2
    public final int zza() {
        return this.f141653p;
    }
}
