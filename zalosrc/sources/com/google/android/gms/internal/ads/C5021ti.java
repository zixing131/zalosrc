package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.ti */
/* loaded from: classes2.dex */
public final class C5021ti implements InterfaceC5094vh {

    /* renamed from: d */
    private C4984si f28365d;

    /* renamed from: g */
    private ByteBuffer f28368g;

    /* renamed from: h */
    private ShortBuffer f28369h;

    /* renamed from: i */
    private ByteBuffer f28370i;

    /* renamed from: j */
    private long f28371j;

    /* renamed from: k */
    private long f28372k;

    /* renamed from: l */
    private boolean f28373l;

    /* renamed from: e */
    private float f28366e = 1.0f;

    /* renamed from: f */
    private float f28367f = 1.0f;

    /* renamed from: b */
    private int f28363b = -1;

    /* renamed from: c */
    private int f28364c = -1;

    public C5021ti() {
        ByteBuffer byteBuffer = InterfaceC5094vh.f29313a;
        this.f28368g = byteBuffer;
        this.f28369h = byteBuffer.asShortBuffer();
        this.f28370i = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    /* renamed from: a */
    public final void mo24926a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f28371j += remaining;
            this.f28365d.m26321d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int m26318a = this.f28365d.m26318a() * this.f28363b;
        int i11 = m26318a + m26318a;
        if (i11 > 0) {
            if (this.f28368g.capacity() < i11) {
                ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                this.f28368g = order;
                this.f28369h = order.asShortBuffer();
            } else {
                this.f28368g.clear();
                this.f28369h.clear();
            }
            this.f28365d.m26319b(this.f28369h);
            this.f28372k += i11;
            this.f28368g.limit(i11);
            this.f28370i = this.f28368g;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    /* renamed from: b */
    public final boolean mo24927b(int i11, int i12, int i13) {
        if (i13 == 2) {
            if (this.f28364c == i11 && this.f28363b == i12) {
                return false;
            }
            this.f28364c = i11;
            this.f28363b = i12;
            return true;
        }
        throw new zzatk(i11, i12, i13);
    }

    /* renamed from: c */
    public final float m26615c(float f11) {
        this.f28367f = AbstractC4916qo.m25825a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    /* renamed from: d */
    public final float m26616d(float f11) {
        float m25825a = AbstractC4916qo.m25825a(f11, 0.1f, 8.0f);
        this.f28366e = m25825a;
        return m25825a;
    }

    /* renamed from: e */
    public final long m26617e() {
        return this.f28371j;
    }

    /* renamed from: f */
    public final long m26618f() {
        return this.f28372k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final int zza() {
        return this.f28363b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f28370i;
        this.f28370i = InterfaceC5094vh.f29313a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zzd() {
        C4984si c4984si = new C4984si(this.f28364c, this.f28363b);
        this.f28365d = c4984si;
        c4984si.m26323f(this.f28366e);
        this.f28365d.m26322e(this.f28367f);
        this.f28370i = InterfaceC5094vh.f29313a;
        this.f28371j = 0L;
        this.f28372k = 0L;
        this.f28373l = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zze() {
        this.f28365d.m26320c();
        this.f28373l = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final void zzg() {
        this.f28365d = null;
        ByteBuffer byteBuffer = InterfaceC5094vh.f29313a;
        this.f28368g = byteBuffer;
        this.f28369h = byteBuffer.asShortBuffer();
        this.f28370i = byteBuffer;
        this.f28363b = -1;
        this.f28364c = -1;
        this.f28371j = 0L;
        this.f28372k = 0L;
        this.f28373l = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final boolean zzi() {
        if (Math.abs(this.f28366e - 1.0f) < 0.01f && Math.abs(this.f28367f - 1.0f) < 0.01f) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5094vh
    public final boolean zzj() {
        if (!this.f28373l) {
            return false;
        }
        C4984si c4984si = this.f28365d;
        return c4984si == null || c4984si.m26318a() == 0;
    }
}
