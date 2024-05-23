package com.zing.zalo.p077ui.zviews;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import fn0.AbstractC19074t;
import p189gv.C19609h;

/* loaded from: classes6.dex */
public abstract class MPLoadingView extends TrackingRelativeLayout {

    /* renamed from: q */
    private ObjectAnimator f74816q;

    /* renamed from: r */
    private View.OnClickListener f74817r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        setClickable(true);
    }

    public final ObjectAnimator getAnimBrandAvatar() {
        return this.f74816q;
    }

    public final View.OnClickListener getOnBtnExitClickListener() {
        return this.f74817r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f74816q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void setAnimBrandAvatar(ObjectAnimator objectAnimator) {
        this.f74816q = objectAnimator;
    }

    public abstract void setMPInfo(C19609h c19609h);

    public final void setOnBtnExitClickListener(View.OnClickListener onClickListener) {
        this.f74817r = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPLoadingView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        setClickable(true);
    }
}
