package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z8 */
/* loaded from: classes.dex */
final class C5713z8 extends AbstractC5306b9 {

    /* renamed from: b */
    private final byte[] f32959b;

    /* renamed from: c */
    private int f32960c;

    /* renamed from: d */
    private int f32961d;

    /* renamed from: e */
    private int f32962e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5713z8(byte[] bArr, int i11, int i12, boolean z11, AbstractC5696y8 abstractC5696y8) {
        super(null);
        this.f32962e = Integer.MAX_VALUE;
        this.f32959b = bArr;
        this.f32960c = 0;
    }

    /* renamed from: c */
    public final int m30108c(int i11) {
        int i12 = this.f32962e;
        this.f32962e = 0;
        int i13 = this.f32960c + this.f32961d;
        this.f32960c = i13;
        if (i13 > 0) {
            this.f32961d = i13;
            this.f32960c = i13 - i13;
        } else {
            this.f32961d = 0;
        }
        return i12;
    }
}
