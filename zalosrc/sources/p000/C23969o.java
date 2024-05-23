package p000;

import android.content.Context;
import android.content.Intent;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: o */
/* loaded from: classes2.dex */
public final class C23969o extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public final /* synthetic */ Context f116011q;

    /* renamed from: r */
    public final /* synthetic */ Intent f116012r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23969o(Context context, Intent intent) {
        super(0);
        this.f116011q = context;
        this.f116012r = intent;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public final Object mo12V4() {
        this.f116011q.startActivity(this.f116012r);
        return C24848g0.f119245a;
    }
}
