package p093d6;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4166b;
import com.google.android.gms.internal.location.zzaa;
import p342m6.C22890k;
import p568v5.AbstractBinderC27533d;

/* renamed from: d6.i */
/* loaded from: classes2.dex */
final class BinderC17772i extends AbstractBinderC27533d {

    /* renamed from: p */
    final /* synthetic */ C22890k f89952p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC17772i(C17758b c17758b, C22890k c22890k) {
        this.f89952p = c22890k;
    }

    @Override // p568v5.InterfaceC27534e
    /* renamed from: I4 */
    public final void mo93913I4(zzaa zzaaVar) {
        Status status = zzaaVar.getStatus();
        if (status == null) {
            this.f89952p.m117597d(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.m19220F() == 0) {
            this.f89952p.m117596c(Boolean.TRUE);
        } else {
            this.f89952p.m117597d(AbstractC4166b.m19628a(status));
        }
    }

    @Override // p568v5.InterfaceC27534e
    public final void zzc() {
    }
}
