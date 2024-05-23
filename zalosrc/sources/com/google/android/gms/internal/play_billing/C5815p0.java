package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.p0 */
/* loaded from: classes2.dex */
final class C5815p0 extends AbstractC5827r0 {

    /* renamed from: b */
    private final byte[] f33401b;

    /* renamed from: c */
    private int f33402c;

    /* renamed from: d */
    private int f33403d;

    /* renamed from: e */
    private int f33404e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5815p0(byte[] bArr, int i11, int i12, boolean z11, AbstractC5809o0 abstractC5809o0) {
        super(null);
        this.f33404e = Integer.MAX_VALUE;
        this.f33401b = bArr;
        this.f33402c = 0;
    }

    /* renamed from: c */
    public final int m30425c(int i11) {
        int i12 = this.f33404e;
        this.f33404e = 0;
        int i13 = this.f33402c + this.f33403d;
        this.f33402c = i13;
        if (i13 > 0) {
            this.f33403d = i13;
            this.f33402c = i13 - i13;
        } else {
            this.f33403d = 0;
        }
        return i12;
    }
}
