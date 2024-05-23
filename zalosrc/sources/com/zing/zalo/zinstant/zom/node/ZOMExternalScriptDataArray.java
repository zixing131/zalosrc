package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.model.ExternalScriptData;

/* loaded from: classes7.dex */
public class ZOMExternalScriptDataArray {
    public ExternalScriptData[] mScript;

    private ZOMExternalScriptDataArray(ExternalScriptData[] externalScriptDataArr) {
        this.mScript = externalScriptDataArr;
    }

    public static ZOMExternalScriptDataArray create(ExternalScriptData[] externalScriptDataArr) {
        if (externalScriptDataArr != null) {
            return new ZOMExternalScriptDataArray(externalScriptDataArr);
        }
        return null;
    }
}
