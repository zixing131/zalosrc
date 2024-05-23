package com.zing.zalo.zinstant.zom.model;

import com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.ZOMTransformElement;
import fn0.AbstractC19074t;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public final class DataDrawing {
    private TransformDrawing transformDrawing;
    private OpacityDrawing opacityDrawing = new OpacityDrawing();
    private ColorDrawing backgroundColorDrawing = new ColorDrawing();

    private final TransformDrawing getOrDefaultTransform() {
        if (this.transformDrawing == null) {
            this.transformDrawing = new TransformDrawing();
        }
        TransformDrawing transformDrawing = this.transformDrawing;
        AbstractC19074t.m100205c(transformDrawing);
        return transformDrawing;
    }

    public final int getAlpha() {
        return this.opacityDrawing.getAlpha();
    }

    public final int getBackgroundColor() {
        return this.backgroundColorDrawing.getBackgroundColor();
    }

    public final float getCurTransformFraction() {
        TransformDrawing transformDrawing = this.transformDrawing;
        if (transformDrawing != null) {
            return transformDrawing.getCurrentFraction();
        }
        return 1.0f;
    }

    public final float getOpacity() {
        return this.opacityDrawing.getOpacity();
    }

    public final TransformDrawing getTransformDrawing() {
        return this.transformDrawing;
    }

    public final LinkedList<ZOMTransformElement> getTransformElements() {
        TransformDrawing transformDrawing = this.transformDrawing;
        if (transformDrawing != null) {
            return transformDrawing.getDrawElements();
        }
        return null;
    }

    public final ZOMMatrix2D getTransformInverseMatrixPosition() {
        TransformDrawing transformDrawing = this.transformDrawing;
        if (transformDrawing != null) {
            return transformDrawing.getInverseMatrixPosition();
        }
        return null;
    }

    public final boolean hasTransform() {
        LinkedList<ZOMTransformElement> drawElements;
        TransformDrawing transformDrawing = this.transformDrawing;
        if (transformDrawing != null && (drawElements = transformDrawing.getDrawElements()) != null) {
            return !drawElements.isEmpty();
        }
        return false;
    }

    public final boolean setBackgroundColorFraction(float f11) {
        return this.backgroundColorDrawing.setFraction(f11);
    }

    public final boolean setNewBackgroundColor(int i11) {
        return this.backgroundColorDrawing.handleNewBackgroundColor(i11);
    }

    public final boolean setNewOpacity(float f11) {
        return this.opacityDrawing.handleNewOpacity(f11);
    }

    public final void setNewTransform(ZOMTransform zOMTransform) {
        AbstractC19074t.m100208f(zOMTransform, "transform");
        getOrDefaultTransform().handleNewTransform(zOMTransform);
    }

    public final boolean setOpacityFraction(float f11) {
        return this.opacityDrawing.setFraction(f11);
    }

    public final boolean setOpacityOuter(float f11) {
        return this.opacityDrawing.setOuterOpacity(f11);
    }

    public final boolean setTransformFraction(float f11) {
        return getOrDefaultTransform().setFraction(f11);
    }

    public final boolean setTransformOriginIfNeeded(float f11, float f12) {
        return getOrDefaultTransform().updateOrigin(f11, f12);
    }

    public final boolean setTransformOuter(TransformDrawing transformDrawing) {
        if (transformDrawing == null && this.transformDrawing == null) {
            return false;
        }
        return getOrDefaultTransform().setOuter(transformDrawing);
    }
}
