package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.adapter.AbstractC6921a;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import tk0.C26730b;

/* loaded from: classes7.dex */
public class ZOMContainer extends ZOM {
    public ZOM[] mChildren;
    public ZOMLoading mLoading;

    /* loaded from: classes7.dex */
    public static class ZOMContainerFactory extends AbstractC6921a {
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMContainer create() {
            return ZOMContainer.access$000();
        }
    }

    static /* synthetic */ ZOMContainer access$000() {
        return requireNewObject();
    }

    public static ZOMContainer createObject() {
        return requireNewObject();
    }

    private static ZOMContainer requireNewObject() {
        return new ZOMContainer();
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public boolean checkIntegrity(InterfaceC17139d interfaceC17139d, C26730b c26730b) {
        if (!super.checkIntegrity(interfaceC17139d, c26730b)) {
            return false;
        }
        ZOM[] zomArr = this.mChildren;
        if (zomArr != null) {
            for (ZOM zom : zomArr) {
                if (zom != null && !zom.checkIntegrity(interfaceC17139d, c26730b)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public ZOM findZOMById(String str) {
        if (super.findZOMById(str) != null) {
            return this;
        }
        ZOM[] zomArr = this.mChildren;
        if (zomArr != null && zomArr.length > 0) {
            for (ZOM zom : zomArr) {
                ZOM findZOMById = zom.findZOMById(str);
                if (findZOMById != null) {
                    return findZOMById;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public void prepareSyncUI() {
        super.prepareSyncUI();
        ZOM[] zomArr = this.mChildren;
        if (zomArr != null) {
            for (ZOM zom : zomArr) {
                if (zom != null) {
                    zom.prepareSyncUI();
                }
            }
        }
    }

    public void setData(Object[] objArr) {
        this.mChildren = (ZOM[]) objArr;
        this.layoutFlag |= 16;
    }

    public void setLoading(ZOMLoading zOMLoading) {
        this.mLoading = zOMLoading;
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public void syncUI() {
        super.syncUI();
        ZOM[] zomArr = this.mChildren;
        if (zomArr != null) {
            for (ZOM zom : zomArr) {
                if (zom != null) {
                    zom.syncUI();
                }
            }
        }
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
}
