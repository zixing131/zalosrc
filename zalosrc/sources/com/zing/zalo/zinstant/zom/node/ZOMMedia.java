package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.adapter.AbstractC6921a;
import com.zing.zalo.zinstant.InterfaceC17139d;
import tk0.C26730b;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMMedia extends ZOM {
    public String mSrc;
    public boolean mLoop = false;
    public boolean mStreaming = false;
    public boolean mAutoPlay = false;

    /* loaded from: classes7.dex */
    public static class ZOMMediaFactory extends AbstractC6921a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMMedia create() {
            return ZOMMedia.access$000();
        }
    }

    static /* synthetic */ ZOMMedia access$000() {
        return requireNewObject();
    }

    public static ZOMMedia createObject() {
        return requireNewObject();
    }

    private static ZOMMedia requireNewObject() {
        return new ZOMMedia();
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public boolean checkIntegrityParam(InterfaceC17139d interfaceC17139d, C26730b c26730b) {
        return true;
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public String getContent() {
        return this.mSrc;
    }

    public int getCurrentTimeMills() {
        return __ZOMMedia_zjni.getCurrentTimeMills(this);
    }

    public boolean isAutoPlay() {
        return this.mAutoPlay;
    }

    public void onComplete() {
        __ZOMMedia_zjni.onComplete(this);
    }

    public void onError(String str) {
        __ZOMMedia_zjni.onError(this, str);
    }

    public void onPause() {
        __ZOMMedia_zjni.onPause(this);
    }

    public void onPlay() {
        __ZOMMedia_zjni.onPlay(this);
    }

    public void onTimeChanged(int i11, int i12) {
        __ZOMMedia_zjni.onTimeChanged(this, i11, i12);
    }

    public void pause() {
    }

    public void play(int i11) {
    }

    public void seekTo(int i11) {
    }

    public void setData(byte[] bArr, int i11) {
        boolean z11;
        boolean z12;
        this.mSrc = AbstractC28268b.m142407b(bArr);
        boolean z13 = true;
        if (((i11 >> 2) & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mStreaming = z11;
        if (((i11 >> 1) & 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.mLoop = z12;
        if ((i11 & 1) != 1) {
            z13 = false;
        }
        this.mAutoPlay = z13;
    }

    public void setDuration(int i11) {
        __ZOMMedia_zjni.setDuration(this, i11);
    }
}
