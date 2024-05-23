package km0;

import java.io.File;
import java.util.Map;
import jm0.C21294d;
import jm0.C21295e;

/* renamed from: km0.a */
/* loaded from: classes.dex */
public interface InterfaceC21766a {

    /* renamed from: km0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m112290a(InterfaceC21766a interfaceC21766a, String str, int i11, boolean z11, Map map, InterfaceC21769d interfaceC21769d, int i12, Object obj) {
            int i13;
            boolean z12;
            if (obj == null) {
                if ((i12 & 2) != 0) {
                    i13 = -1;
                } else {
                    i13 = i11;
                }
                if ((i12 & 4) != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                interfaceC21766a.mo1367c(str, i13, z12, map, interfaceC21769d);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestHttpGet");
        }

        /* renamed from: b */
        public static /* synthetic */ void m112291b(InterfaceC21766a interfaceC21766a, String str, int i11, boolean z11, Map map, C21294d c21294d, C21295e c21295e, InterfaceC21769d interfaceC21769d, int i12, Object obj) {
            int i13;
            boolean z12;
            C21294d c21294d2;
            C21295e c21295e2;
            if (obj == null) {
                if ((i12 & 2) != 0) {
                    i13 = -1;
                } else {
                    i13 = i11;
                }
                if ((i12 & 4) != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i12 & 16) != 0) {
                    c21294d2 = null;
                } else {
                    c21294d2 = c21294d;
                }
                if ((i12 & 32) != 0) {
                    c21295e2 = null;
                } else {
                    c21295e2 = c21295e;
                }
                interfaceC21766a.mo1369e(str, i13, z12, map, c21294d2, c21295e2, interfaceC21769d);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestHttpPostMultipart");
        }

        /* renamed from: c */
        public static /* synthetic */ void m112292c(InterfaceC21766a interfaceC21766a, String str, int i11, boolean z11, Map map, byte[] bArr, File file, InterfaceC21769d interfaceC21769d, int i12, Object obj) {
            int i13;
            boolean z12;
            byte[] bArr2;
            File file2;
            if (obj == null) {
                if ((i12 & 2) != 0) {
                    i13 = -1;
                } else {
                    i13 = i11;
                }
                if ((i12 & 4) != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((i12 & 16) != 0) {
                    bArr2 = null;
                } else {
                    bArr2 = bArr;
                }
                if ((i12 & 32) != 0) {
                    file2 = null;
                } else {
                    file2 = file;
                }
                interfaceC21766a.mo1368d(str, i13, z12, map, bArr2, file2, interfaceC21769d);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestHttpPostMultipart");
        }
    }

    /* renamed from: a */
    void mo1365a(String str, int i11, boolean z11, Map map, InterfaceC21769d interfaceC21769d);

    /* renamed from: b */
    void mo1366b(int i11, int i12, byte[] bArr, InterfaceC21769d interfaceC21769d);

    /* renamed from: c */
    void mo1367c(String str, int i11, boolean z11, Map map, InterfaceC21769d interfaceC21769d);

    /* renamed from: d */
    void mo1368d(String str, int i11, boolean z11, Map map, byte[] bArr, File file, InterfaceC21769d interfaceC21769d);

    /* renamed from: e */
    void mo1369e(String str, int i11, boolean z11, Map map, C21294d c21294d, C21295e c21295e, InterfaceC21769d interfaceC21769d);

    /* renamed from: f */
    String mo1370f(String str);

    /* renamed from: g */
    Map mo1371g();
}
