package com.zing.zalo.client;

import android.content.Context;
import com.zing.zalo.nativebridge.ZaloNativeBridge;
import gm0.AbstractC19512f;
import gm0.C19508b;
import gm0.InterfaceC19510d;
import gm0.InterfaceC19511e;
import ho0.AbstractC20110a;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class AESUtils {

    /* renamed from: a */
    public String f42108a;

    /* renamed from: b */
    public String f42109b;

    /* renamed from: c */
    public String f42110c;

    /* renamed from: d */
    public String f42111d;

    /* renamed from: e */
    public String f42112e;

    /* renamed from: f */
    public String f42113f;

    /* renamed from: g */
    public String f42114g;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x001d -> B:6:0x002c). Please report as a decompilation issue!!! */
    public AESUtils(Context context, int i11) {
        InputStream inputStream = null;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            try {
                inputStream = context.getResources().openRawResource(i11);
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                ZaloNativeBridge.initAESUtils(context, this, bArr);
                inputStream.close();
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            throw th2;
        }
    }

    /* renamed from: a */
    public static byte[] m39915a(String str, byte[] bArr) {
        InterfaceC19510d m101976m = C19508b.m101976m(AbstractC19512f.m101984c(str));
        int length = bArr.length;
        if (length % 16 != 0) {
            return null;
        }
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        while (true) {
            int i12 = i11 + 16;
            if (i12 <= length) {
                m101976m.m101980b(bArr, i11, bArr2, i11);
                i11 = i12;
            } else {
                return bArr2;
            }
        }
    }

    /* renamed from: b */
    public static byte[] m39916b(String str, byte[] bArr) {
        InterfaceC19511e m101977n = C19508b.m101977n(AbstractC19512f.m101984c(str));
        int length = bArr.length;
        if (length % 16 > 0) {
            length = ((length / 16) + 1) * 16;
        }
        byte[] m39917j = m39917j(bArr, length);
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        while (true) {
            int i12 = i11 + 16;
            if (i12 > length) {
                break;
            }
            m101977n.m101981a(m39917j, i11, bArr2, i11);
            i11 = i12;
        }
        int i13 = length % 16;
        if (i13 > 0) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(m39917j, i11, bArr3, 0, i13);
            m101977n.m101981a(bArr3, 0, bArr2, 0);
        }
        return bArr2;
    }

    /* renamed from: j */
    static byte[] m39917j(byte[] bArr, int i11) {
        if (bArr.length < i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return bArr;
    }

    /* renamed from: c */
    public String m39918c() {
        return this.f42108a;
    }

    /* renamed from: d */
    public String m39919d() {
        return this.f42109b;
    }

    /* renamed from: e */
    public String m39920e() {
        return this.f42110c;
    }

    /* renamed from: f */
    public String m39921f() {
        return this.f42114g;
    }

    /* renamed from: g */
    public String m39922g() {
        return this.f42113f;
    }

    /* renamed from: h */
    public String m39923h() {
        return this.f42112e;
    }

    /* renamed from: i */
    public String m39924i() {
        return this.f42111d;
    }
}
