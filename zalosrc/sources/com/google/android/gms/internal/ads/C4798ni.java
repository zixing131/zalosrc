package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ni */
/* loaded from: classes2.dex */
final class C4798ni implements InterfaceC5094vh {

    /* renamed from: b */
    private int f25192b;

    /* renamed from: c */
    private int f25193c;

    /* renamed from: d */
    private int[] f25194d;

    /* renamed from: e */
    private boolean f25195e;

    /* renamed from: f */
    private int[] f25196f;

    /* renamed from: g */
    private ByteBuffer f25197g;

    /* renamed from: h */
    private ByteBuffer f25198h;

    /* renamed from: i */
    private boolean f25199i;

    public C4798ni() {
        ByteBuffer byteBuffer = InterfaceC5094vh.f29313a;
        this.f25197g = byteBuffer;
        this.f25198h = byteBuffer;
        this.f25192b = -1;
        this.f25193c = -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    /* renamed from: a */
    public final void mo24926a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = this.f25192b;
        int length = ((limit - position) / (i11 + i11)) * this.f25196f.length;
        int i12 = length + length;
        if (this.f25197g.capacity() < i12) {
            this.f25197g = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
        } else {
            this.f25197g.clear();
        }
        while (position < limit) {
            for (int i13 : this.f25196f) {
                this.f25197g.putShort(byteBuffer.getShort(i13 + i13 + position));
            }
            int i14 = this.f25192b;
            position += i14 + i14;
        }
        byteBuffer.position(limit);
        this.f25197g.flip();
        this.f25198h = this.f25197g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    /* renamed from: b */
    public final boolean mo24927b(int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13 = !Arrays.equals(this.f25194d, this.f25196f);
        int[] iArr = this.f25194d;
        this.f25196f = iArr;
        if (iArr == null) {
            this.f25195e = false;
            return z13;
        }
        if (i13 == 2) {
            if (!z13 && this.f25193c == i11 && this.f25192b == i12) {
                return false;
            }
            this.f25193c = i11;
            this.f25192b = i12;
            if (i12 != iArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f25195e = z11;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f25196f;
                if (i14 >= iArr2.length) {
                    return true;
                }
                int i15 = iArr2[i14];
                if (i15 < i12) {
                    boolean z14 = this.f25195e;
                    if (i15 != i14) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f25195e = z12 | z14;
                    i14++;
                } else {
                    throw new zzatk(i11, i12, 2);
                }
            }
        } else {
            throw new zzatk(i11, i12, i13);
        }
    }

    /* renamed from: c */
    public final void m24928c(int[] iArr) {
        this.f25194d = iArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final int zza() {
        int[] iArr = this.f25196f;
        return iArr == null ? this.f25192b : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f25198h;
        this.f25198h = InterfaceC5094vh.f29313a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zzd() {
        this.f25198h = InterfaceC5094vh.f29313a;
        this.f25199i = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zze() {
        this.f25199i = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zzg() {
        zzd();
        this.f25197g = InterfaceC5094vh.f29313a;
        this.f25192b = -1;
        this.f25193c = -1;
        this.f25196f = null;
        this.f25195e = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final boolean zzi() {
        return this.f25195e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final boolean zzj() {
        return this.f25199i && this.f25198h == InterfaceC5094vh.f29313a;
    }
}
