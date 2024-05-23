package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class ha4 implements n94 {

    /* renamed from: b */
    protected m94 f21595b;

    /* renamed from: c */
    protected m94 f21596c;

    /* renamed from: d */
    private m94 f21597d;

    /* renamed from: e */
    private m94 f21598e;

    /* renamed from: f */
    private ByteBuffer f21599f;

    /* renamed from: g */
    private ByteBuffer f21600g;

    /* renamed from: h */
    private boolean f21601h;

    public ha4() {
        ByteBuffer byteBuffer = n94.f25095a;
        this.f21599f = byteBuffer;
        this.f21600g = byteBuffer;
        m94 m94Var = m94.f24443e;
        this.f21597d = m94Var;
        this.f21598e = m94Var;
        this.f21595b = m94Var;
        this.f21596c = m94Var;
    }

    @Override // com.google.android.gms.internal.ads.n94
    /* renamed from: b */
    public final m94 mo22775b(m94 m94Var) {
        this.f21597d = m94Var;
        this.f21598e = mo20073c(m94Var);
        if (zzg()) {
            return this.f21598e;
        }
        return m94.f24443e;
    }

    /* renamed from: c */
    protected abstract m94 mo20073c(m94 m94Var);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final ByteBuffer m22776d(int i11) {
        if (this.f21599f.capacity() < i11) {
            this.f21599f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f21599f.clear();
        }
        ByteBuffer byteBuffer = this.f21599f;
        this.f21600g = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: e */
    protected void mo20074e() {
    }

    /* renamed from: f */
    protected void mo20075f() {
    }

    /* renamed from: g */
    protected void mo20076g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m22777h() {
        return this.f21600g.hasRemaining();
    }

    @Override // com.google.android.gms.internal.ads.n94
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f21600g;
        this.f21600g = n94.f25095a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final void zzc() {
        this.f21600g = n94.f25095a;
        this.f21601h = false;
        this.f21595b = this.f21597d;
        this.f21596c = this.f21598e;
        mo20074e();
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final void zzd() {
        this.f21601h = true;
        mo20075f();
    }

    @Override // com.google.android.gms.internal.ads.n94
    public final void zzf() {
        zzc();
        this.f21599f = n94.f25095a;
        m94 m94Var = m94.f24443e;
        this.f21597d = m94Var;
        this.f21598e = m94Var;
        this.f21595b = m94Var;
        this.f21596c = m94Var;
        mo20076g();
    }

    @Override // com.google.android.gms.internal.ads.n94
    public boolean zzg() {
        if (this.f21598e != m94.f24443e) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.n94
    public boolean zzh() {
        return this.f21601h && this.f21600g == n94.f25095a;
    }
}
