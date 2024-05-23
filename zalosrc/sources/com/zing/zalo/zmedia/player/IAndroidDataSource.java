package com.zing.zalo.zmedia.player;

import java.io.IOException;

/* loaded from: classes7.dex */
public interface IAndroidDataSource {
    void close() throws IOException;

    long getSize() throws IOException;

    int readAt(long j11, byte[] bArr, int i11, int i12) throws IOException;
}
