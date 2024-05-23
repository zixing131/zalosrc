package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;

/* loaded from: classes6.dex */
public final class ChatInfoHighLightSettingView extends HightLightSettingView {

    /* renamed from: x */
    private int f69038x;

    /* renamed from: y */
    private int f69039y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInfoHighLightSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attributeSet");
    }

    @Override // com.zing.zalo.p077ui.widget.HightLightSettingView
    /* renamed from: e */
    public void mo75614e(View view) {
        if (view != null) {
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                this.f69312p = (iArr[1] + this.f69038x) - this.f69039y;
                this.f69313q = view.getHeight() - this.f69038x;
                int m118713h0 = AbstractC23136l9.m118713h0();
                int i11 = this.f69312p;
                if (i11 >= 0 && i11 + this.f69313q <= m118713h0) {
                    setVisibility(0);
                    invalidate();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    startAnimation(alphaAnimation);
                }
                AbstractC23350e.m122772b("ChatInfoHighLightSettingView mY=" + this.f69312p + " mDy=" + this.f69313q + " offset=" + this.f69038x + " screenHeight=" + m118713h0, new Object[0]);
            } catch (Resources.NotFoundException e11) {
                e11.printStackTrace();
            }
        }
    }

    public final int getMYGlobalView() {
        return this.f69039y;
    }

    public final int getOffset() {
        return this.f69038x;
    }

    public final void setMYGlobalView(int i11) {
        this.f69039y = i11;
    }

    public final void setOffset(int i11) {
        this.f69038x = i11;
    }
}
