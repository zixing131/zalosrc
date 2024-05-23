package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25807a;

/* renamed from: com.zing.zalo.zdesign.component.g1 */
/* loaded from: classes7.dex */
public class C16979g1 extends C16716d implements InterfaceC16976f1 {

    /* renamed from: M0 */
    private C25807a f86781M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16979g1(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f86781M0 = new C25807a(new WeakReference(this));
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        C25807a c25807a = this.f86781M0;
        if (c25807a == null || !c25807a.m133070c(cVar)) {
            super.mo89109M0(cVar);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f86781M0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f86781M0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }
}
