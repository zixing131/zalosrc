package com.showingphotolib.view;

import android.graphics.Rect;
import android.view.View;
import com.zing.zalo.zview.animation.AnimationTarget;

/* loaded from: classes3.dex */
public class ViewAnimationTarget implements AnimationTarget {
    View mTarget;
    Rect mTargetRect = new Rect();
    int[] mTargetLocationOnScreen = new int[2];

    public ViewAnimationTarget(View view) {
        this.mTarget = view;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        int[] iArr = this.mTargetLocationOnScreen;
        iArr[0] = 0;
        iArr[1] = 0;
        this.mTargetRect.setEmpty();
        View view = this.mTarget;
        if (view != null) {
            int width = view.getWidth();
            int height = this.mTarget.getHeight();
            float scaleX = this.mTarget.getScaleX();
            float scaleY = this.mTarget.getScaleY();
            this.mTarget.getLocationOnScreen(this.mTargetLocationOnScreen);
            Rect rect = this.mTargetRect;
            int[] iArr2 = this.mTargetLocationOnScreen;
            int i11 = iArr2[0];
            rect.left = i11;
            int i12 = iArr2[1];
            rect.top = i12;
            rect.right = i11 + width;
            rect.bottom = i12 + height;
            if (scaleX != 1.0f || scaleY != 1.0f) {
                rect.right = i11 + ((int) (width * scaleX));
                rect.bottom = i12 + ((int) (height * scaleY));
            }
        }
        return this.mTargetRect;
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
        View view = this.mTarget;
        if (view != null) {
            view.setVisibility(i11);
        }
    }
}
