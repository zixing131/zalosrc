package bn0;

import fn0.AbstractC19074t;
import java.io.File;
import on0.AbstractC24342w;

/* renamed from: bn0.h */
/* loaded from: classes7.dex */
abstract class AbstractC2939h {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:            r0 = on0.AbstractC24342w.m127172a0(r8, r6, 2, false, 4, null);     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m13914a(String str) {
        int m127172a0;
        boolean m127155R;
        int m127172a02;
        int m127172a03;
        char c11 = File.separatorChar;
        m127172a0 = AbstractC24342w.m127172a0(str, c11, 0, false, 4, null);
        if (m127172a0 == 0) {
            if (str.length() > 1 && str.charAt(1) == c11 && m127172a02 >= 0) {
                m127172a03 = AbstractC24342w.m127172a0(str, c11, m127172a02 + 1, false, 4, null);
                if (m127172a03 >= 0) {
                    return m127172a03 + 1;
                }
                return str.length();
            }
            return 1;
        }
        if (m127172a0 > 0 && str.charAt(m127172a0 - 1) == ':') {
            return m127172a0 + 1;
        }
        if (m127172a0 == -1) {
            m127155R = AbstractC24342w.m127155R(str, ':', false, 2, null);
            if (m127155R) {
                return str.length();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static final boolean m13915b(File file) {
        AbstractC19074t.m100208f(file, "<this>");
        String path = file.getPath();
        AbstractC19074t.m100207e(path, "getPath(...)");
        if (m13914a(path) > 0) {
            return true;
        }
        return false;
    }
}
