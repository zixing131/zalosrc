package p704z4;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22874c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z4.i0 */
/* loaded from: classes2.dex */
public final class C31233i0 implements InterfaceC22874c {
    @Override // p342m6.InterfaceC22874c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27439a(AbstractC22888j abstractC22888j) {
        if (((Boolean) abstractC22888j.mo117584m()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
