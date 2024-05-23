package com.zing.zalo.uicontrol;

import android.animation.ValueAnimator;
import android.content.Context;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.uicontrol.u0 */
/* loaded from: classes4.dex */
public final class C16662u0 extends C16658t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16662u0(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // com.zing.zalo.uicontrol.C16658t0
    /* renamed from: j */
    public void mo88784j() {
        ValueAnimator valueAnimator = this.f84455r;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.mo88784j();
        }
    }
}
