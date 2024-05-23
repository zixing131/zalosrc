package p705z5;

/* renamed from: z5.r7 */
/* loaded from: classes2.dex */
public enum EnumC31541r7 implements InterfaceC31393h {
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
    private final int f145098p;

    EnumC31541r7(int i11) {
        this.f145098p = i11;
    }

    @Override // p705z5.InterfaceC31393h
    public final int zza() {
        return this.f145098p;
    }
}
