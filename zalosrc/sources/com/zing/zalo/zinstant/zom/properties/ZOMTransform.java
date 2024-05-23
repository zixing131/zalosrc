package com.zing.zalo.zinstant.zom.properties;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class ZOMTransform {
    private static final ZOM3DValue ORIGIN_3D_DEFAULT = new ZOM3DValue(new ZOMValue(0, 50.0f), new ZOMValue(0, 50.0f), new ZOMValue(1, 0.0f));
    public ZOMTransformElement[] mTransformElements;
    public ZOM3DValue mTransformOrigin = null;
    public float valueOriginX = 0.0f;
    public float valueOriginY = 0.0f;
    private final AtomicBoolean isDirty = new AtomicBoolean(true);
    public boolean isNewTransform = true;

    public static ZOMTransform createObject() {
        return new ZOMTransform();
    }

    public boolean getAndResetDirty() {
        return this.isDirty.getAndSet(false);
    }

    public boolean isDirty() {
        return this.isDirty.get();
    }

    public void setData(Object[] objArr, ZOM3DValue zOM3DValue, boolean z11) {
        this.isNewTransform = z11;
        this.isDirty.set(true);
        this.mTransformElements = (ZOMTransformElement[]) objArr;
        this.mTransformOrigin = zOM3DValue;
        if (zOM3DValue == null) {
            this.mTransformOrigin = ORIGIN_3D_DEFAULT;
        }
        ZOM3DValue zOM3DValue2 = this.mTransformOrigin;
        if (zOM3DValue2.f88001mX == null) {
            zOM3DValue2.f88001mX = new ZOMValue(0, 50.0f);
        }
        ZOM3DValue zOM3DValue3 = this.mTransformOrigin;
        if (zOM3DValue3.f88002mY == null) {
            zOM3DValue3.f88002mY = new ZOMValue(0, 50.0f);
        }
        ZOM3DValue zOM3DValue4 = this.mTransformOrigin;
        if (zOM3DValue4.f88003mZ == null) {
            zOM3DValue4.f88003mZ = new ZOMValue(1, 0.0f);
        }
    }

    public void updateBoundOrigin(ZOMRect zOMRect) {
        if (this.mTransformOrigin == null) {
            this.mTransformOrigin = ORIGIN_3D_DEFAULT;
        }
        ZOMValue zOMValue = this.mTransformOrigin.f88001mX;
        if (zOMValue.mType == 0) {
            this.valueOriginX = zOMRect.left + ((zOMValue.mValue * zOMRect.getWidth()) / 100.0f);
        } else {
            this.valueOriginX = zOMRect.left + zOMValue.mValue;
        }
        ZOMValue zOMValue2 = this.mTransformOrigin.f88002mY;
        if (zOMValue2.mType == 0) {
            this.valueOriginY = zOMRect.top + ((zOMValue2.mValue * zOMRect.getHeight()) / 100.0f);
        } else {
            this.valueOriginY = zOMRect.top + zOMValue2.mValue;
        }
    }
}
