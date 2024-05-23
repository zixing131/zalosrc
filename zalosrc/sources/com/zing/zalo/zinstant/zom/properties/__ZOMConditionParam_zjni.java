package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes.dex */
public class __ZOMConditionParam_zjni extends __ZOMConditional_zjni {
    private static ZOMConditionParam _$create(int i11) {
        return new ZOMConditionParam(i11);
    }

    public static ZOMConditionParam[] convertPointerArrayToZOMConditionParamArray(long[] jArr) {
        ZOMConditionParam[] zOMConditionParamArr = new ZOMConditionParam[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            zOMConditionParamArr[i11] = (ZOMConditionParam) __ZOMConditional_zjni.getObjectFromPointer(jArr[i11]);
        }
        return zOMConditionParamArr;
    }

    private static void setData(ZOMConditionParam zOMConditionParam, byte[] bArr, byte[] bArr2) {
        if (zOMConditionParam != null) {
            zOMConditionParam.setData(bArr, bArr2);
        }
    }
}
