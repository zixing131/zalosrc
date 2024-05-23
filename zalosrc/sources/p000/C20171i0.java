package p000;

import android.content.Context;
import android.content.Intent;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* renamed from: i0 */
/* loaded from: classes2.dex */
public final class C20171i0 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public final /* synthetic */ C24592p0 f99632q;

    /* renamed from: r */
    public final /* synthetic */ Context f99633r;

    /* renamed from: s */
    public final /* synthetic */ boolean f99634s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20171i0(C24592p0 c24592p0, Context context, boolean z11) {
        super(0);
        this.f99632q = c24592p0;
        this.f99633r = context;
        this.f99634s = z11;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public final Object mo12V4() {
        C24592p0 c24592p0 = this.f99632q;
        Context context = this.f99633r;
        Intent intent = new Intent("com.zing.mp3.action.CONNECT");
        if (this.f99634s) {
            intent.putExtra("start_session", true);
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        c24592p0.getClass();
        C24592p0.m128069e(context, intent);
        this.f99632q.f118363m = C19692h0.f97700q;
        return C24848g0.f119245a;
    }
}
