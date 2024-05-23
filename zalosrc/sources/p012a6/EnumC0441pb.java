package p012a6;

/* renamed from: a6.pb */
/* loaded from: classes2.dex */
public enum EnumC0441pb implements InterfaceC0147a2 {
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
    private final int f1791p;

    EnumC0441pb(int i11) {
        this.f1791p = i11;
    }

    @Override // p012a6.InterfaceC0147a2
    public final int zza() {
        return this.f1791p;
    }
}
