package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import bi0.AbstractC2807a;
import bi0.AbstractC2816j;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25807a;
import ui0.C27276c;

/* renamed from: com.zing.zalo.zdesign.component.z */
/* loaded from: classes7.dex */
public final class C17075z extends C16719g implements InterfaceC16976f1 {

    /* renamed from: D0 */
    private C25807a f87365D0;

    /* renamed from: E0 */
    private int f87366E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17075z(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m89085A0(AbstractC2816j.Companion.m13594c(context, AbstractC2807a.divider_01));
        this.f87365D0 = new C25807a(new WeakReference(this));
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        if (this.f87366E0 == 1) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            m89097G0(C27276c.m139648a(context, 0.5f), i13);
        } else {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            m89097G0(i11, C27276c.m139648a(context2, 0.5f));
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f87365D0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f87365D0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }
}
