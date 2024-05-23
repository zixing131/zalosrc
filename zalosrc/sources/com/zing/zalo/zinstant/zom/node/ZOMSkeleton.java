package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.adapter.AbstractC6921a;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;

/* loaded from: classes7.dex */
public class ZOMSkeleton extends ZOM {
    public ZOM[] mChildren;
    public int mSkeletonBackgroundColor;

    /* loaded from: classes7.dex */
    public static class ZOMSkeletonFactory extends AbstractC6921a {
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMSkeleton create() {
            return ZOMSkeleton.access$000();
        }
    }

    static /* synthetic */ ZOMSkeleton access$000() {
        return requireNewObject();
    }

    public static ZOMSkeleton createObject() {
        return requireNewObject();
    }

    private static ZOMSkeleton requireNewObject() {
        return new ZOMSkeleton();
    }

    public void setChildren(Object[] objArr) {
        this.mChildren = (ZOM[]) objArr;
    }

    public void setData(int i11, int i12, int i13) {
        super.setBaseData(7, null, null, null, null, null, i11, i12, null, null, null, false, null, null, null, null, 0, 1.0f, null, null, null);
        this.mSkeletonBackgroundColor = i13;
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        ZOM[] zomArr = this.mChildren;
        if (zomArr != null) {
            for (ZOM zom : zomArr) {
                sb2.append(zom.toString());
            }
        }
        return sb2.toString();
    }

    public void updateData(ZOMRect zOMRect, int i11, int i12, int i13, ZOMRect zOMRect2) {
        super.updateBaseData(i11, i12, i13, zOMRect2, 0, zOMRect, null, zOMRect2);
    }
}
