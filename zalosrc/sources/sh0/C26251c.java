package sh0;

import android.util.LruCache;
import com.zing.zalo.zmedia.zanimation.ZAnimation;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: sh0.c */
/* loaded from: classes7.dex */
public final class C26251c {

    /* renamed from: a */
    public static final C26251c f124664a = new C26251c();

    /* renamed from: b */
    private static final InterfaceC24854k f124665b;

    /* renamed from: c */
    private static boolean f124666c;

    /* renamed from: sh0.c$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f124667q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LruCache mo12V4() {
            return new LruCache(20);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f124667q);
        f124665b = m129210a;
        synchronized (C26251c.class) {
            try {
                if (ZAnimation.isLibraryLoaded()) {
                    f124666c = true;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C26251c() {
    }

    /* renamed from: b */
    private final LruCache m134982b() {
        return (LruCache) f124665b.getValue();
    }

    /* renamed from: c */
    private final void m134983c(String str, byte[] bArr) {
        if (m134982b().get(str) == null) {
            m134982b().put(str, bArr);
        }
    }

    /* renamed from: a */
    public final void m134984a() {
        m134982b().evictAll();
    }

    /* renamed from: d */
    public final byte[] m134985d(String str, InputStream inputStream) {
        AbstractC19074t.m100208f(str, "cacheKey");
        AbstractC19074t.m100208f(inputStream, "input");
        byte[] bArr = (byte[]) m134982b().get(str);
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr2);
            C24848g0 c24848g0 = C24848g0.f119245a;
            if (-1 != read) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC19074t.m100205c(byteArray);
                m134983c(str, byteArray);
                return byteArray;
            }
        }
    }
}
