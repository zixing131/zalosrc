package p258j7;

import android.content.Context;
import android.content.Intent;
import p291k7.AbstractC21530o1;
import p291k7.C21536q1;

/* renamed from: j7.v0 */
/* loaded from: classes3.dex */
final class C20981v0 implements InterfaceC20949f0 {

    /* renamed from: a */
    final /* synthetic */ AbstractC20944d f102892a;

    /* renamed from: b */
    final /* synthetic */ Intent f102893b;

    /* renamed from: c */
    final /* synthetic */ Context f102894c;

    /* renamed from: d */
    final /* synthetic */ C20985x0 f102895d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20981v0(C20985x0 c20985x0, AbstractC20944d abstractC20944d, Intent intent, Context context) {
        this.f102895d = c20985x0;
        this.f102892a = abstractC20944d;
        this.f102893b = intent;
        this.f102894c = context;
    }

    @Override // p258j7.InterfaceC20949f0
    public final void zza() {
        r0.f102907g.post(new RunnableC20983w0(this.f102895d, this.f102892a, 5, 0));
    }

    @Override // p258j7.InterfaceC20949f0
    public final void zzb(int i11) {
        r0.f102907g.post(new RunnableC20983w0(this.f102895d, this.f102892a, 6, i11));
    }

    @Override // p258j7.InterfaceC20949f0
    public final void zzc() {
        C21536q1 c21536q1;
        if (this.f102893b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            c21536q1 = ((AbstractC21530o1) this.f102895d).f104566a;
            c21536q1.m111195b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f102893b.putExtra("triggered_from_app_after_verification", true);
            this.f102894c.sendBroadcast(this.f102893b);
        }
    }
}
