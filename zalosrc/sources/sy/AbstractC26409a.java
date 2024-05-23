package sy;

import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import fn0.AbstractC19074t;

/* renamed from: sy.a */
/* loaded from: classes4.dex */
public abstract class AbstractC26409a {
    /* renamed from: a */
    public static final int[] m136209a(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "rect");
        int i11 = iArr[1];
        int i12 = iArr[0];
        int i13 = iArr[2] - i12;
        int i14 = iArr[3] - i11;
        if (i13 != 1 && i14 != 1) {
            if (i13 % 2 == 1) {
                i13--;
            }
            if (i14 % 2 == 1) {
                i14--;
            }
            if (i11 % 2 == 1) {
                i11--;
            }
            if (i12 % 2 == 1) {
                i12--;
            }
            return new int[]{i12, i11, i13 + i12, i14 + i11};
        }
        throw new IllegalArgumentException("rect size not valid to crop");
    }

    /* renamed from: b */
    public static final byte[] m136210b(int i11, int i12) {
        return new byte[(int) Math.floor(i11 * i12 * 1.5d)];
    }

    /* renamed from: c */
    public static final void m136211c(byte[] bArr, byte[] bArr2, int i11, int[] iArr) {
        AbstractC19074t.m100208f(bArr, "srcNV21Image");
        AbstractC19074t.m100208f(bArr2, "destNV21Image");
        AbstractC19074t.m100208f(iArr, "cropRect");
        if (iArr[1] % 2 != 1 && iArr[0] % 2 != 1) {
            ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
            if (scanQRUIUtils.m49623M(iArr) % 2 != 1 && scanQRUIUtils.m49637t(iArr) % 2 != 1) {
                int ceil = (int) Math.ceil(bArr.length / 1.5d);
                int m49623M = scanQRUIUtils.m49623M(iArr) * scanQRUIUtils.m49637t(iArr);
                int m49637t = scanQRUIUtils.m49637t(iArr);
                for (int i12 = 0; i12 < m49637t; i12++) {
                    int i13 = ((iArr[1] + i12) * i11) + iArr[0];
                    ScanQRUIUtils scanQRUIUtils2 = ScanQRUIUtils.f49155a;
                    System.arraycopy(bArr, i13, bArr2, scanQRUIUtils2.m49623M(iArr) * i12, scanQRUIUtils2.m49623M(iArr));
                }
                int floor = (int) Math.floor(ScanQRUIUtils.f49155a.m49637t(iArr) / 2.0d);
                for (int i14 = 0; i14 < floor; i14++) {
                    int i15 = (((iArr[1] / 2) + i14) * i11) + ceil + iArr[0];
                    ScanQRUIUtils scanQRUIUtils3 = ScanQRUIUtils.f49155a;
                    System.arraycopy(bArr, i15, bArr2, (scanQRUIUtils3.m49623M(iArr) * i14) + m49623M, scanQRUIUtils3.m49623M(iArr));
                }
                return;
            }
        }
        throw new IllegalArgumentException("cropRect must be in even size");
    }
}
