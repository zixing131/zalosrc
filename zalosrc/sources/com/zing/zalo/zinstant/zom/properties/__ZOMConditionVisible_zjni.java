package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes.dex */
public class __ZOMConditionVisible_zjni extends __ZOMConditionParam_zjni {
    private static ZOMConditionVisible _$create(int i11) {
        return new ZOMConditionVisible(i11);
    }

    public static ZOMConditionVisible[] convertPointerArrayToZOMConditionVisibleArray(long[] jArr) {
        ZOMConditionVisible[] zOMConditionVisibleArr = new ZOMConditionVisible[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMConditionVisibleArr[i11] = (ZOMConditionVisible) __ZOMConditional_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMConditionVisibleArr;
    }

    private static void setData(ZOMConditionVisible zOMConditionVisible, int i11, int i12, int i13, byte[] bArr, byte[] bArr2) {
        if (zOMConditionVisible != null) {
            zOMConditionVisible.setData(i11, i12, i13, bArr, bArr2);
        }
    }
}
