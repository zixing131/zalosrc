package md;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.zxing.C6849d;
import com.google.zxing.EnumC6846a;
import com.google.zxing.EnumC6848c;
import com.zing.zalo.zqrcode.QRCodeManager;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import on0.C24321d;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24861r;
import qm0.AbstractC25363p0;
import sl0.EnumC26320a;
import va.C27954b;

/* renamed from: md.b */
/* loaded from: classes.dex */
public final class C22986b {

    /* renamed from: a */
    public static final C22986b f111775a = new C22986b();

    /* renamed from: b */
    private static final Object f111776b = new Object();

    /* renamed from: c */
    private static final int f111777c = 1080;

    /* renamed from: d */
    private static final Map f111778d;

    /* renamed from: e */
    private static Context f111779e;

    /* renamed from: md.b$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f111780a;

        static {
            int[] iArr = new int[EnumC22985a.values().length];
            iArr[EnumC22985a.QR_CODE.ordinal()] = 1;
            f111780a = iArr;
        }
    }

    static {
        Map m131407l;
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a(EnumC22985a.QR_CODE, EnumC6846a.QR_CODE), AbstractC24866w.m129235a(EnumC22985a.AZTEC, EnumC6846a.AZTEC), AbstractC24866w.m129235a(EnumC22985a.PDF417, EnumC6846a.PDF_417), AbstractC24866w.m129235a(EnumC22985a.DATA_MATRIX, EnumC6846a.DATA_MATRIX), AbstractC24866w.m129235a(EnumC22985a.UPC_A, EnumC6846a.UPC_A), AbstractC24866w.m129235a(EnumC22985a.UPC_E, EnumC6846a.UPC_E), AbstractC24866w.m129235a(EnumC22985a.EAN_8, EnumC6846a.EAN_8), AbstractC24866w.m129235a(EnumC22985a.EAN_13, EnumC6846a.EAN_13), AbstractC24866w.m129235a(EnumC22985a.CODE_39, EnumC6846a.CODE_39), AbstractC24866w.m129235a(EnumC22985a.CODE_128, EnumC6846a.CODE_128), AbstractC24866w.m129235a(EnumC22985a.ITF, EnumC6846a.ITF), AbstractC24866w.m129235a(EnumC22985a.CODABAR, EnumC6846a.CODABAR), AbstractC24866w.m129235a(EnumC22985a.CODE_93, EnumC6846a.CODE_93));
        f111778d = m131407l;
    }

    private C22986b() {
    }

    /* renamed from: d */
    private final Bitmap m117751d(C27954b c27954b, int i11, int i12) {
        int[] iArr = new int[c27954b.m140892g() * c27954b.m140891f()];
        int m140892g = c27954b.m140892g();
        int m140891f = c27954b.m140891f();
        for (int i13 = 0; i13 < m140891f; i13++) {
            int m140892g2 = c27954b.m140892g();
            for (int i14 = 0; i14 < m140892g2; i14++) {
                if (c27954b.m140890e(i14, i13)) {
                    iArr[(i13 * m140892g) + i14] = i11;
                } else {
                    iArr[(i13 * m140892g) + i14] = i12;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, c27954b.m140892g(), c27954b.m140891f(), Bitmap.Config.ARGB_8888);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
        return createBitmap;
    }

    /* renamed from: a */
    public final Bitmap m117752a(String str, EnumC22985a enumC22985a, int i11, int i12, Map map) {
        Object m129218b;
        C27954b mo960a;
        int i13;
        EnumC26320a enumC26320a;
        Charset charset;
        Bitmap encode;
        AbstractC19074t.m100208f(str, "string");
        AbstractC19074t.m100208f(enumC22985a, "format");
        AbstractC19074t.m100208f(map, "hints");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC22987c enumC22987c = EnumC22987c.ERROR_CORRECTION;
        String str2 = (String) map.get(enumC22987c);
        if (str2 != null) {
            linkedHashMap.put(EnumC6848c.ERROR_CORRECTION, str2);
        }
        EnumC22987c enumC22987c2 = EnumC22987c.MARGIN;
        String str3 = (String) map.get(enumC22987c2);
        if (str3 != null) {
            linkedHashMap.put(EnumC6848c.MARGIN, str3);
        }
        EnumC22987c enumC22987c3 = EnumC22987c.CHARACTER_SET;
        String str4 = (String) map.get(enumC22987c3);
        if (str4 != null) {
            linkedHashMap.put(EnumC6848c.CHARACTER_SET, str4);
        }
        String str5 = (String) map.get(EnumC22987c.FOREGROUND_COLOR);
        if (str5 == null) {
            str5 = "#006AF5";
        }
        int parseColor = Color.parseColor(str5);
        String str6 = (String) map.get(EnumC22987c.BACKGROUND_COLOR);
        if (str6 == null) {
            str6 = "#FFFFFF";
        }
        int parseColor2 = Color.parseColor(str6);
        if (i11 >= 0 && i12 >= 0) {
            int i14 = f111777c;
            if (i11 <= i14 && i12 <= i14) {
                if (a.f111780a[enumC22985a.ordinal()] == 1) {
                    String str7 = (String) map.get(enumC22987c2);
                    if (str7 != null) {
                        i13 = Integer.parseInt(str7);
                    } else {
                        i13 = 2;
                    }
                    String str8 = (String) map.get(enumC22987c);
                    if (str8 == null || (enumC26320a = EnumC26320a.valueOf(str8)) == null) {
                        enumC26320a = EnumC26320a.Medium;
                    }
                    EnumC26320a enumC26320a2 = enumC26320a;
                    String str9 = (String) map.get(enumC22987c3);
                    if (str9 != null) {
                        charset = Charset.forName(str9);
                    } else {
                        charset = null;
                    }
                    if (charset == null) {
                        charset = C24321d.f117408b;
                    }
                    Charset charset2 = charset;
                    QRCodeManager companion = QRCodeManager.Companion.getInstance(f111779e);
                    if (companion == null || (encode = companion.encode(str, i11, i12, enumC26320a2, i13, parseColor, parseColor2, charset2)) == null) {
                        throw new IllegalStateException("Can not get QRCodeManger instance");
                    }
                    return encode;
                }
                try {
                    C24861r.a aVar = C24861r.f119264q;
                    synchronized (f111776b) {
                        C6849d c6849d = new C6849d();
                        Object obj = f111778d.get(enumC22985a);
                        AbstractC19074t.m100205c(obj);
                        mo960a = c6849d.mo960a(str, (EnumC6846a) obj, i11, i12, linkedHashMap);
                    }
                    m129218b = C24861r.m129218b(mo960a);
                } catch (Throwable th2) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                Throwable m129221e = C24861r.m129221e(m129218b);
                if (m129221e != null) {
                    AbstractC20110a.f98889a.mo104552e(m129221e);
                }
                AbstractC24862s.m129228b(m129218b);
                AbstractC19074t.m100207e(m129218b, "runCatching {\n          …            .getOrThrow()");
                return m117751d((C27954b) m129218b, parseColor, parseColor2);
            }
            throw new IllegalArgumentException("requestWidth or requestHeight too big");
        }
        throw new IllegalArgumentException("requestWidth or requestHeight too small");
    }

    /* renamed from: b */
    public final int m117753b() {
        return f111777c;
    }

    /* renamed from: c */
    public final void m117754c(Context context) {
        f111779e = context;
    }
}
