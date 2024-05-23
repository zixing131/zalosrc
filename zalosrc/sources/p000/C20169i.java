package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: i */
/* loaded from: classes2.dex */
public final class C20169i extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public final /* synthetic */ Context f99630q;

    /* renamed from: r */
    public final /* synthetic */ Intent f99631r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20169i(Context context, Intent intent) {
        super(0);
        this.f99630q = context;
        this.f99631r = intent;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public final Object mo12V4() {
        Activity m134146a = AbstractC26054s.m134146a(this.f99630q);
        if (m134146a != null) {
            m134146a.startActivityForResult(this.f99631r, 123456);
        }
        return C24848g0.f119245a;
    }
}
