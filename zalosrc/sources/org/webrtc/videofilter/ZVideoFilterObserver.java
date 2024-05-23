package org.webrtc.videofilter;

import org.webrtc.VideoRenderer;
import org.webrtc.videofilter.ZVideoFilterAgent;
import p097db.AbstractC17849h;

/* loaded from: classes7.dex */
public class ZVideoFilterObserver implements ZVideoFilterAgent.FilterObserver {
    @Override // org.webrtc.videofilter.ZVideoFilterAgent.FilterObserver
    public boolean OnAppliedFilter(byte[] bArr, int i11, int i12, int i13, long j11) {
        AbstractC17849h.m94298g(bArr, i11, i12, i13, j11);
        return true;
    }

    @Override // org.webrtc.videofilter.ZVideoFilterAgent.FilterObserver
    public boolean OnAppliedFilterWithTex2D(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        AbstractC17849h.m94299h(i11, i12, i13, fArr, i14, j11, VideoRenderer.I420Frame.TextureType.TEXTURE_2D.ordinal());
        return true;
    }

    @Override // org.webrtc.videofilter.ZVideoFilterAgent.FilterObserver
    public boolean OnAppliedFilter(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        AbstractC17849h.m94299h(i11, i12, i13, fArr, i14, j11, VideoRenderer.I420Frame.TextureType.OES_TEXTURE.ordinal());
        return true;
    }
}
