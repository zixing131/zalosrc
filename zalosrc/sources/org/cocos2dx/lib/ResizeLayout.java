package org.cocos2dx.lib;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class ResizeLayout extends FrameLayout {
    private boolean mEnableForceDoLayout;

    public ResizeLayout(Context context) {
        super(context);
        this.mEnableForceDoLayout = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.mEnableForceDoLayout) {
            new Handler().postDelayed(new Runnable() { // from class: org.cocos2dx.lib.ResizeLayout.1
                @Override // java.lang.Runnable
                public void run() {
                    ResizeLayout.this.requestLayout();
                    ResizeLayout.this.invalidate();
                }
            }, 41L);
        }
    }

    public void setEnableForceDoLayout(boolean z11) {
        this.mEnableForceDoLayout = z11;
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEnableForceDoLayout = false;
    }
}
