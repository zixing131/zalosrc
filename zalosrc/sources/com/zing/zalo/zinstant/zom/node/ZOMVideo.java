package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.adapter.AbstractC6921a;
import com.zing.zalo.zinstant.InterfaceC17139d;
import tk0.C26730b;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMVideo extends ZOM {
    public boolean mAutoPlay = false;
    public boolean mControls = false;
    public boolean mLoop = false;
    public boolean mMuted = false;
    public String mSrc;
    public String mVideoType;

    /* loaded from: classes7.dex */
    public static class ZOMVideoFactory extends AbstractC6921a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMVideo create() {
            return ZOMVideo.access$000();
        }
    }

    static /* synthetic */ ZOMVideo access$000() {
        return requireNewObject();
    }

    public static ZOMVideo createObject() {
        return requireNewObject();
    }

    private static ZOMVideo requireNewObject() {
        return new ZOMVideo();
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public boolean checkIntegrityParam(InterfaceC17139d interfaceC17139d, C26730b c26730b) {
        return true;
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public String getContent() {
        return this.mSrc;
    }

    public void setData(byte[] bArr, byte[] bArr2, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        this.mSrc = AbstractC28268b.m142407b(bArr);
        this.mVideoType = AbstractC28268b.m142407b(bArr2);
        boolean z14 = true;
        if (((i11 >> 3) & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mAutoPlay = z11;
        if (((i11 >> 2) & 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.mControls = z12;
        if (((i11 >> 1) & 1) == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.mLoop = z13;
        if ((i11 & 1) != 1) {
            z14 = false;
        }
        this.mMuted = z14;
        onPropertyChange();
    }
}
