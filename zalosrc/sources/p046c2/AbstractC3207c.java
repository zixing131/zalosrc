package p046c2;

import android.os.Build;
import fn0.AbstractC19074t;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* renamed from: c2.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3207c {
    /* renamed from: a */
    public static final void m16308a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        AbstractC19074t.m100208f(readableByteChannel, "input");
        AbstractC19074t.m100208f(fileChannel, "output");
        try {
            if (Build.VERSION.SDK_INT > 23) {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            } else {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        newOutputStream.write(bArr, 0, read);
                    }
                }
            }
            fileChannel.force(false);
            readableByteChannel.close();
            fileChannel.close();
        } catch (Throwable th2) {
            readableByteChannel.close();
            fileChannel.close();
            throw th2;
        }
    }
}
