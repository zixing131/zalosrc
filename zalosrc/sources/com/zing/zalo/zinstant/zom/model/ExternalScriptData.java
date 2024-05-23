package com.zing.zalo.zinstant.zom.model;

import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ExternalScriptData {
    public String mChecksum;
    public String mContent;
    public boolean mIsEncrypted;
    public String mName;

    public ExternalScriptData(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z11) {
        this.mName = AbstractC28268b.m142407b(bArr);
        this.mContent = AbstractC28268b.m142407b(bArr2);
        this.mChecksum = AbstractC28268b.m142407b(bArr3);
        this.mIsEncrypted = z11;
    }
}
