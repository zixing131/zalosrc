package org.webrtc.videofilter;

import org.webrtc.videofilter.ZVideoFilter;

/* loaded from: classes7.dex */
public interface ZVideoFilterAgent {

    /* loaded from: classes7.dex */
    public interface FilterObserver {
        boolean OnAppliedFilter(int i11, int i12, int i13, float[] fArr, int i14, long j11);

        boolean OnAppliedFilter(byte[] bArr, int i11, int i12, int i13, long j11);

        boolean OnAppliedFilterWithTex2D(int i11, int i12, int i13, float[] fArr, int i14, long j11);
    }

    boolean applyFilter(int i11, int i12, int i13, float[] fArr, int i14, long j11);

    boolean applyFilter(byte[] bArr, int i11, int i12, int i13, long j11);

    ZVideoFilter.FilterType filterType();

    void onFallbackSoftwareEncoder();

    boolean start(FilterObserver filterObserver);

    boolean stop();
}
