package p000;

import android.content.Context;
import android.content.Intent;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: k */
/* loaded from: classes2.dex */
public final class C21419k extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public final /* synthetic */ Context f104403q;

    /* renamed from: r */
    public final /* synthetic */ Intent f104404r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21419k(Context context, Intent intent) {
        super(0);
        this.f104403q = context;
        this.f104404r = intent;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public final Object mo12V4() {
        this.f104403q.startActivity(this.f104404r);
        return C24848g0.f119245a;
    }
}
