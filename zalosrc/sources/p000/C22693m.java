package p000;

import android.content.Context;
import android.content.Intent;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: m */
/* loaded from: classes2.dex */
public final class C22693m extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public final /* synthetic */ Context f111179q;

    /* renamed from: r */
    public final /* synthetic */ Intent f111180r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22693m(Context context, Intent intent) {
        super(0);
        this.f111179q = context;
        this.f111180r = intent;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public final Object mo12V4() {
        this.f111179q.startActivity(this.f111180r);
        return C24848g0.f119245a;
    }
}
