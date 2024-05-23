package p000;

import android.content.Context;
import android.content.Intent;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: r */
/* loaded from: classes2.dex */
public final class C25577r extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public final /* synthetic */ Context f122265q;

    /* renamed from: r */
    public final /* synthetic */ Intent f122266r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25577r(Context context, Intent intent) {
        super(0);
        this.f122265q = context;
        this.f122266r = intent;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public final Object mo12V4() {
        this.f122265q.startActivity(this.f122266r);
        return C24848g0.f119245a;
    }
}
