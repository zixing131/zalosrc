package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g8 */
/* loaded from: classes.dex */
public abstract class AbstractC5390g8 implements InterfaceC5630ua {
    @Override // com.google.android.gms.internal.measurement.InterfaceC5630ua
    /* renamed from: K */
    public final /* synthetic */ InterfaceC5630ua mo29151K(byte[] bArr) {
        return mo29152e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public abstract AbstractC5390g8 mo29152e(byte[] bArr, int i11, int i12);

    /* renamed from: f */
    public abstract AbstractC5390g8 mo29153f(byte[] bArr, int i11, int i12, C5425i9 c5425i9);

    @Override // com.google.android.gms.internal.measurement.InterfaceC5630ua
    /* renamed from: o0 */
    public final /* synthetic */ InterfaceC5630ua mo29154o0(byte[] bArr, C5425i9 c5425i9) {
        return mo29153f(bArr, 0, bArr.length, c5425i9);
    }
}
