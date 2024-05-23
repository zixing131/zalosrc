package p704z4;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: z4.k0 */
/* loaded from: classes2.dex */
public final class C31237k0 implements AbstractC4073c.b, AbstractC4073c.c {

    /* renamed from: p */
    public final C4071a f144257p;

    /* renamed from: q */
    private final boolean f144258q;

    /* renamed from: r */
    private InterfaceC31239l0 f144259r;

    public C31237k0(C4071a c4071a, boolean z11) {
        this.f144257p = c4071a;
        this.f144258q = z11;
    }

    /* renamed from: b */
    private final InterfaceC31239l0 m152110b() {
        AbstractC4205o.m19723l(this.f144259r, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f144259r;
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: E */
    public final void mo19480E(Bundle bundle) {
        m152110b().mo19480E(bundle);
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: N */
    public final void mo19482N(int i11) {
        m152110b().mo19482N(i11);
    }

    @Override // p704z4.InterfaceC31228g
    /* renamed from: Q */
    public final void mo19443Q(ConnectionResult connectionResult) {
        m152110b().mo19481I3(connectionResult, this.f144257p, this.f144258q);
    }

    /* renamed from: a */
    public final void m152111a(InterfaceC31239l0 interfaceC31239l0) {
        this.f144259r = interfaceC31239l0;
    }
}
