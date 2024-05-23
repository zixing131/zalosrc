package p381o5;

import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import p342m6.C22890k;
import p355n4.C23538c;
import p704z4.AbstractC31238l;

/* renamed from: o5.o */
/* loaded from: classes2.dex */
final class BinderC24033o extends AbstractBinderC24023e {

    /* renamed from: p */
    final /* synthetic */ C22890k f116343p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC24033o(C24034p c24034p, C22890k c22890k) {
        this.f116343p = c22890k;
    }

    @Override // p381o5.InterfaceC24024f
    /* renamed from: n1 */
    public final void mo125900n1(Status status, zzc zzcVar) {
        C23538c c23538c;
        if (zzcVar != null) {
            c23538c = new C23538c(zzcVar.m19023t(), zzcVar.zza());
        } else {
            c23538c = null;
        }
        AbstractC31238l.m152112a(status, c23538c, this.f116343p);
    }
}
