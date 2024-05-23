package p150f5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.C4247c;
import p342m6.C22890k;
import p704z4.AbstractC31238l;

/* renamed from: f5.i */
/* loaded from: classes2.dex */
final class BinderC18728i extends AbstractBinderC18720a {

    /* renamed from: p */
    final /* synthetic */ C22890k f94044p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC18728i(C4247c c4247c, C22890k c22890k) {
        this.f94044p = c22890k;
    }

    @Override // p150f5.AbstractBinderC18720a, p150f5.InterfaceC18724e
    /* renamed from: T3 */
    public final void mo98723T3(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        AbstractC31238l.m152115d(status, moduleAvailabilityResponse, this.f94044p);
    }
}
