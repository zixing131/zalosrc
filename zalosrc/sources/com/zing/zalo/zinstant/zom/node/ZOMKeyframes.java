package com.zing.zalo.zinstant.zom.node;

import java.util.Arrays;
import java.util.Comparator;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMKeyframes {
    public String mName;
    public ZOMKeyframesSelector[] mSelectors;

    ZOMKeyframes() {
    }

    public ZOMKeyframes(byte[] bArr, Object[] objArr) {
        this.mName = AbstractC28268b.m142407b(bArr);
        this.mSelectors = (ZOMKeyframesSelector[]) objArr;
    }

    public static ZOMKeyframes createObject() {
        return new ZOMKeyframes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortIfNeeded$0(ZOMKeyframesSelector zOMKeyframesSelector, ZOMKeyframesSelector zOMKeyframesSelector2) {
        if (zOMKeyframesSelector.mSelector < zOMKeyframesSelector2.mSelector) {
            return -1;
        }
        return 1;
    }

    public ZOMKeyframes sortIfNeeded() {
        Arrays.sort(this.mSelectors, new Comparator() { // from class: com.zing.zalo.zinstant.zom.node.x
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortIfNeeded$0;
                lambda$sortIfNeeded$0 = ZOMKeyframes.lambda$sortIfNeeded$0((ZOMKeyframesSelector) obj, (ZOMKeyframesSelector) obj2);
                return lambda$sortIfNeeded$0;
            }
        });
        return this;
    }
}
