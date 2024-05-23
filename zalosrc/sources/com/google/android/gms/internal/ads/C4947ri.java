package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.ri */
/* loaded from: classes2.dex */
final class C4947ri implements InterfaceC5094vh {

    /* renamed from: b */
    private int f27220b = -1;

    /* renamed from: c */
    private int f27221c = -1;

    /* renamed from: d */
    private int f27222d = 0;

    /* renamed from: e */
    private ByteBuffer f27223e;

    /* renamed from: f */
    private ByteBuffer f27224f;

    /* renamed from: g */
    private boolean f27225g;

    public C4947ri() {
        ByteBuffer byteBuffer = InterfaceC5094vh.f29313a;
        this.f27223e = byteBuffer;
        this.f27224f = byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[ADDED_TO_REGION, LOOP:2: B:24:0x0082->B:25:0x0084, LOOP_START, PHI: r0
  0x0082: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0042, B:25:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo24926a(ByteBuffer byteBuffer) {
        int i11;
        int i12;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i13 = limit - position;
        int i14 = this.f27222d;
        if (i14 != Integer.MIN_VALUE) {
            if (i14 != 3) {
                if (i14 == 1073741824) {
                    i11 = i13 / 2;
                    if (this.f27223e.capacity() >= i11) {
                        this.f27223e = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    } else {
                        this.f27223e.clear();
                    }
                    i12 = this.f27222d;
                    if (i12 == Integer.MIN_VALUE) {
                        if (i12 != 3) {
                            if (i12 == 1073741824) {
                                while (position < limit) {
                                    this.f27223e.put(byteBuffer.get(position + 2));
                                    this.f27223e.put(byteBuffer.get(position + 3));
                                    position += 4;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            while (position < limit) {
                                this.f27223e.put((byte) 0);
                                this.f27223e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        }
                    } else {
                        while (position < limit) {
                            this.f27223e.put(byteBuffer.get(position + 1));
                            this.f27223e.put(byteBuffer.get(position + 2));
                            position += 3;
                        }
                    }
                    byteBuffer.position(byteBuffer.limit());
                    this.f27223e.flip();
                    this.f27224f = this.f27223e;
                }
                throw new IllegalStateException();
            }
        } else {
            i13 /= 3;
        }
        i11 = i13 + i13;
        if (this.f27223e.capacity() >= i11) {
        }
        i12 = this.f27222d;
        if (i12 == Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.f27223e.flip();
        this.f27224f = this.f27223e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    /* renamed from: b */
    public final boolean mo24927b(int i11, int i12, int i13) {
        if (i13 != 3 && i13 != 2 && i13 != Integer.MIN_VALUE && i13 != 1073741824) {
            throw new zzatk(i11, i12, i13);
        }
        if (this.f27220b == i11 && this.f27221c == i12 && this.f27222d == i13) {
            return false;
        }
        this.f27220b = i11;
        this.f27221c = i12;
        this.f27222d = i13;
        if (i13 == 2) {
            this.f27223e = InterfaceC5094vh.f29313a;
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final int zza() {
        return this.f27221c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f27224f;
        this.f27224f = InterfaceC5094vh.f29313a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zzd() {
        this.f27224f = InterfaceC5094vh.f29313a;
        this.f27225g = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zze() {
        this.f27225g = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zzg() {
        zzd();
        this.f27223e = InterfaceC5094vh.f29313a;
        this.f27220b = -1;
        this.f27221c = -1;
        this.f27222d = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final boolean zzi() {
        int i11 = this.f27222d;
        return (i11 == 0 || i11 == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final boolean zzj() {
        return this.f27225g && this.f27224f == InterfaceC5094vh.f29313a;
    }
}
