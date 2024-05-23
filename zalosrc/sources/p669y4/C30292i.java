package p669y4;

import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: y4.i */
/* loaded from: classes2.dex */
final class C30292i extends BasePendingResult {

    /* renamed from: n */
    private final InterfaceC30289f f140670n;

    public C30292i(AbstractC4073c abstractC4073c, InterfaceC30289f interfaceC30289f) {
        super(abstractC4073c);
        this.f140670n = interfaceC30289f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final InterfaceC30289f mo19279d(Status status) {
        return this.f140670n;
    }
}
