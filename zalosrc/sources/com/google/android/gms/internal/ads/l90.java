package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.List;
import java.util.Map;
import p199h6.C19882a;

/* loaded from: classes2.dex */
public final class l90 extends qs0 {

    /* renamed from: p */
    private final C19882a f23793p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l90(C19882a c19882a) {
        this.f23793p = c19882a;
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: D4 */
    public final Map mo24172D4(String str, String str2, boolean z11) {
        return this.f23793p.m103584m(str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: K4 */
    public final void mo24173K4(String str, String str2, Bundle bundle) {
        this.f23793p.m103574b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: P */
    public final void mo24174P(Bundle bundle) {
        this.f23793p.m103590s(bundle);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: U */
    public final void mo24175U(String str, String str2, InterfaceC4271b interfaceC4271b) {
        Object obj;
        C19882a c19882a = this.f23793p;
        if (interfaceC4271b != null) {
            obj = BinderC4273d.m19914Q(interfaceC4271b);
        } else {
            obj = null;
        }
        c19882a.m103592u(str, str2, obj);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: l4 */
    public final void mo24176l4(String str, String str2, Bundle bundle) {
        this.f23793p.m103585n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: p */
    public final void mo24177p(Bundle bundle) {
        this.f23793p.m103586o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: v */
    public final Bundle mo24178v(Bundle bundle) {
        return this.f23793p.m103587p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: v1 */
    public final List mo24179v1(String str, String str2) {
        return this.f23793p.m103579g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: x */
    public final void mo24180x(String str) {
        this.f23793p.m103573a(str);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    /* renamed from: x1 */
    public final void mo24181x1(InterfaceC4271b interfaceC4271b, String str, String str2) {
        Activity activity;
        C19882a c19882a = this.f23793p;
        if (interfaceC4271b != null) {
            activity = (Activity) BinderC4273d.m19914Q(interfaceC4271b);
        } else {
            activity = null;
        }
        c19882a.m103591t(activity, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final int zzb(String str) {
        return this.f23793p.m103583l(str);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final long zzc() {
        return this.f23793p.m103576d();
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final String zze() {
        return this.f23793p.m103577e();
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final String zzf() {
        return this.f23793p.m103578f();
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final String zzg() {
        return this.f23793p.m103580h();
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final String zzh() {
        return this.f23793p.m103581i();
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final String zzi() {
        return this.f23793p.m103582j();
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final void zzn(String str) {
        this.f23793p.m103575c(str);
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final void zzq(Bundle bundle) {
        this.f23793p.m103589r(bundle);
    }
}
