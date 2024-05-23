package p000;

import android.content.Context;
import android.content.Intent;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: p */
/* loaded from: classes2.dex */
public final class C24586p extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public final /* synthetic */ Context f118337q;

    /* renamed from: r */
    public final /* synthetic */ Intent f118338r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24586p(Context context, Intent intent) {
        super(0);
        this.f118337q = context;
        this.f118338r = intent;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public final Object mo12V4() {
        this.f118337q.startActivity(this.f118338r);
        return C24848g0.f119245a;
    }
}
