package com.zing.zalo.zimageutil;

import com.zing.zalo.utils.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Keep
/* loaded from: classes7.dex */
public class ZJpegTranscoder extends AbstractC17092a {
    static {
        AbstractC17092a.m91415a();
    }

    @Keep
    private static native void _jpegTranscode(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) throws IOException;
}
