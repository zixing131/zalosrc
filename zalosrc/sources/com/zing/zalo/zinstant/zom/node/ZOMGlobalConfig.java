package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMSkeletonBackdropConfig;

/* loaded from: classes7.dex */
public class ZOMGlobalConfig {
    ZOMSkeletonBackdropConfig mSkeletonBackdropConfig;

    public ZOMSkeletonBackdropConfig getSkeletonBackdropConfig() {
        return this.mSkeletonBackdropConfig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSkeletonBackdropNode(ZOMSkeleton zOMSkeleton) {
        if (zOMSkeleton != null) {
            this.mSkeletonBackdropConfig = new ZOMSkeletonBackdropConfig(zOMSkeleton.mBound, zOMSkeleton.mWidth, zOMSkeleton.mHeight, zOMSkeleton.mRadius, zOMSkeleton.mCornersToggle, zOMSkeleton.mBorder, zOMSkeleton.mSkeletonBackgroundColor);
        }
    }
}
