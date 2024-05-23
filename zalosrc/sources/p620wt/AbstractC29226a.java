package p620wt;

import android.content.Context;
import bn0.AbstractC2933b;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: wt.a */
/* loaded from: classes4.dex */
public abstract class AbstractC29226a {
    /* renamed from: a */
    public static final void m145976a(Context context, String str, File file) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "assetPath");
        try {
            InputStream open = context.getAssets().open(str);
            AbstractC19074t.m100207e(open, "context.assets.open(assetPath)");
            AbstractC29238m.m145998b(open, new FileOutputStream(file));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public static final String m145977b(String str, Context context) {
        AbstractC19074t.m100208f(str, "assetName");
        AbstractC19074t.m100208f(context, "context");
        try {
            InputStream open = context.getAssets().open(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        AbstractC19074t.m100207e(byteArrayOutputStream2, "baos.toString()");
                        AbstractC2933b.m13890a(open, null);
                        return byteArrayOutputStream2;
                    }
                }
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }
}
