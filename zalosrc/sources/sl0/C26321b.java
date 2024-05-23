package sl0;

import android.graphics.Bitmap;
import android.graphics.Point;
import bm0.AbstractC2849c;
import cm0.C3595a;
import cm0.C3596b;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.zqrcode.QRCodeManager;
import com.zing.zalo.zqrcode.Result;
import com.zing.zalo.zqrcode.YuvImageHelperKt;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import me0.AbstractC23044d5;
import mm0.AbstractC23350e;
import pm0.C24848g0;
import qm0.AbstractC25332a0;

/* renamed from: sl0.b */
/* loaded from: classes7.dex */
public final class C26321b {

    /* renamed from: a */
    public static final C26321b f124994a = new C26321b();

    /* renamed from: b */
    private static final Object f124995b;

    /* renamed from: c */
    private static C3596b f124996c;

    /* renamed from: d */
    private static ByteBuffer f124997d;

    /* renamed from: e */
    private static ByteBuffer f124998e;

    static {
        try {
            EnumC16739a enumC16739a = EnumC16739a.f84859B;
            if (!AbstractC23044d5.m118229b(enumC16739a)) {
                AbstractC23044d5.m118231d(CoreUtility.getAppContext(), enumC16739a);
            }
        } catch (Throwable th2) {
            AbstractC23350e.m122774d(QRCodeManager.TAG, th2.getMessage());
        }
        f124995b = new Object();
        ByteBuffer order = ByteBuffer.allocateDirect(1).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order, "allocateDirect(1)\n      …(ByteOrder.nativeOrder())");
        f124997d = order;
        ByteBuffer order2 = ByteBuffer.allocateDirect(1).order(ByteOrder.nativeOrder());
        AbstractC19074t.m100207e(order2, "allocateDirect(1)\n      …(ByteOrder.nativeOrder())");
        f124998e = order2;
    }

    private C26321b() {
    }

    /* renamed from: a */
    private final Result m135464a(List list, float f11) {
        Object m131205e0;
        if (!list.isEmpty()) {
            m131205e0 = AbstractC25332a0.m131205e0(list);
            C3595a c3595a = (C3595a) m131205e0;
            float[] fArr = new float[c3595a.m18209a().length * 2];
            float f12 = 1.0f / f11;
            Point[] m18209a = c3595a.m18209a();
            int length = m18209a.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                Point point = m18209a[i11];
                int i13 = i12 + 1;
                int i14 = i12 * 2;
                fArr[i14] = point.x * f12;
                fArr[i14 + 1] = point.y * f12;
                i11++;
                i12 = i13;
            }
            return new Result.Success(0L, c3595a.m18211c(), c3595a.m18210b(), fArr, fArr);
        }
        return new Result.Failed(0L, 0, 3, null);
    }

    /* renamed from: e */
    private final C3596b m135465e() {
        C3596b c3596b;
        synchronized (f124995b) {
            try {
                if (f124996c == null) {
                    C3596b c3596b2 = new C3596b();
                    c3596b2.m18218o(C3595a.b.QR_CODE);
                    f124996c = c3596b2;
                }
                c3596b = f124996c;
                AbstractC19074t.m100205c(c3596b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3596b;
    }

    /* renamed from: b */
    public Result m135466b(Bitmap bitmap, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        List list = (List) AbstractC2849c.m13734d(m135465e(), bitmap, 0, 2, null);
        if (z12) {
            bitmap.recycle();
        }
        return m135464a(list, 1.0f);
    }

    /* renamed from: c */
    public Result m135467c(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, QRCodeManager.InterfaceC17396a interfaceC17396a, boolean z11, float f11) {
        AbstractC19074t.m100208f(bArr, "yuvData");
        int i17 = i11 * i12;
        if (bArr.length >= i17) {
            if ((i14 * i11) + i13 >= 0) {
                if (((i14 + (i16 - 1)) * i11) + (i15 - 1) + i13 < i17) {
                    Result m135464a = m135464a((List) m135465e().m13737c(bArr, i11, i12, 0), 1.0f);
                    if ((m135464a instanceof Result.Failed) && z11) {
                        int length = bArr.length;
                        int rint = (int) Math.rint(i11 * f11);
                        int rint2 = (int) Math.rint(i12 * f11);
                        if (f124997d.capacity() < length) {
                            ByteBuffer order = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
                            AbstractC19074t.m100207e(order, "allocateDirect(yuvImageS…(ByteOrder.nativeOrder())");
                            f124997d = order;
                            ByteBuffer order2 = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
                            AbstractC19074t.m100207e(order2, "allocateDirect(yuvImageS…(ByteOrder.nativeOrder())");
                            f124998e = order2;
                        }
                        f124998e.position(0);
                        f124998e.put(bArr);
                        f124998e.position(0);
                        YuvImageHelperKt.m92590c(f124998e, f124997d, i11, i12);
                        YuvImageHelperKt.m92588a(f124997d, i11, i12, f124998e, rint, rint2);
                        YuvImageHelperKt.m92589b(f124998e, f124997d, rint, rint2);
                        f124997d.position(0);
                        return m135464a((List) m135465e().m13736b(f124997d, rint, rint2, 0), f11);
                    }
                    return m135464a;
                }
                throw new IllegalArgumentException("Invalid crop param: max_y * row_stride + max_x >= width * height");
            }
            throw new IllegalArgumentException("Invalid crop param: min_y * row_stride + min_x < 0");
        }
        throw new IllegalArgumentException("width * height must greater or equal to yuvData.length");
    }

    /* renamed from: d */
    public void m135468d() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1);
        AbstractC19074t.m100207e(allocateDirect, "allocateDirect(1)");
        f124997d = allocateDirect;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(1);
        AbstractC19074t.m100207e(allocateDirect2, "allocateDirect(1)");
        f124998e = allocateDirect2;
        synchronized (f124995b) {
            try {
                C3596b c3596b = f124996c;
                if (c3596b != null) {
                    c3596b.close();
                }
                f124996c = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
