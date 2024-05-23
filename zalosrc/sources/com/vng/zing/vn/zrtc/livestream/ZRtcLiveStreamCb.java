package com.vng.zing.vn.zrtc.livestream;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface ZRtcLiveStreamCb {
    int onCheckNwType();

    void onError(int i11);

    void onFinishFlushData();

    void onFlushData(int i11);

    void onFrameEncode(ByteBuffer byteBuffer);

    void onNetworkStateChange(int i11);

    void onRawAudio(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14);

    void onStats(String str);

    void onSwitchCameraDone(boolean z11);
}
