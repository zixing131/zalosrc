package com.zing.zalo.zinstant;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.C17191c;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import com.zing.zalo.zinstant.zom.node.ZOMFontFace;
import com.zing.zalo.zinstant.zom.text.ZOMNativeInputText;
import com.zing.zalo.zinstant.zom.text.ZOMParagraph;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import ho0.AbstractC20110a;
import ik0.C20589l;
import ik0.C20590m;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p620wt.AbstractC29238m;
import vj0.AbstractC28268b;
import vj0.AbstractC28274h;
import vj0.C28273g;

/* loaded from: classes.dex */
public class ZinstantNativeBase {
    private static ZinstantNativeBase INSTANCE = null;
    private static final String TAG = "ZinstantNativeBase";
    private float density = 1.0f;
    private float scaledDensity = 1.0f;

    public ZinstantNativeBase() {
        initScaleFactor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m91450b(ZOMDocument zOMDocument, InterfaceC17139d interfaceC17139d, String str, int i11, int i12, int i13, int i14, int i15, float f11, boolean z11, String str2, String str3, float f12, float f13, int i16) {
        layoutWithCachedDocument(zOMDocument.mNativePointer, interfaceC17139d, str, i11, i12, i13, i14, i15, f11, z11, str2, str3, f12, f13, i16);
    }

    private native int checkCondition(String str, String str2);

    public static ZinstantNativeBase getInstance() {
        return INSTANCE;
    }

    protected int checkCondition(Object obj, byte[] bArr, byte[] bArr2) {
        try {
            if (!(obj instanceof InterfaceC17139d)) {
                return -1;
            }
            return ((InterfaceC17139d) obj).mo91643b(AbstractC28268b.m142407b(bArr), AbstractC28268b.m142407b(bArr2), false);
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public native int getZinstantClientVersion();

    public void initNativeScaleFactorIfNeeded() {
        if (C17191c.m91798a(this.density, AbstractC17158i1.f87696f) && C17191c.m91798a(this.scaledDensity, AbstractC17158i1.f87695e)) {
            return;
        }
        synchronized (this) {
            this.density = AbstractC17158i1.f87696f;
            this.scaledDensity = AbstractC17158i1.f87695e;
            ZinstantNative.getInstance().initScaleFactor();
        }
    }

    public void initScaleFactor() {
        setSpToPxFactor(AbstractC17201m.m91817i());
        setDpToPxFactor(AbstractC17201m.m91813e());
        setDpToEmFactor(AbstractC17201m.m91812d());
        setDefaultTextSize(AbstractC17201m.m91827s(14.0f));
    }

    protected native Object layout(Object obj, String str, byte[] bArr, int i11, int i12, int i13, int i14, int i15, float f11, String str2, String str3, float f12, float f13, int i16);

    public ZOMDocument layoutWithCache(ZOMDocument zOMDocument, InterfaceC17139d interfaceC17139d, String str, int i11, int i12, int i13, int i14, int i15, float f11, boolean z11, String str2, String str3, float f12, float f13, int i16) {
        if (zOMDocument != null) {
            return (ZOMDocument) layoutWithCachedDocument(zOMDocument.mNativePointer, interfaceC17139d, str, i11, i12, i13, i14, i15, f11, z11, str2, str3, f12, f13, i16);
        }
        return null;
    }

    protected native Object layoutWithCachedDocument(long j11, Object obj, String str, int i11, int i12, int i13, int i14, int i15, float f11, boolean z11, String str2, String str3, float f12, float f13, int i16);

    protected native Object layoutWithPath(Object obj, String str, String str2, int i11, int i12, int i13, int i14, int i15, float f11, String str3, String str4, float f12, float f13, int i16);

    protected float measureEditTextHeight(long j11, float f11, float f12, int i11) {
        try {
            ZOMParagraph zOMParagraph = new ZOMParagraph(new ZOMNativeInputText(j11).getValuePointer());
            zOMParagraph.resetIterator();
            ZOMTextSpan nextTextSpan = zOMParagraph.getNextTextSpan();
            TextPaint textPaint = new TextPaint();
            if (nextTextSpan != null) {
                int round = Math.round(AbstractC17201m.m91828t(nextTextSpan.textSize));
                Typeface m142458x = C28273g.m142439i().m142458x(nextTextSpan);
                textPaint.setTextSize(round);
                textPaint.setTypeface(m142458x);
            }
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            double d11 = ((fontMetrics.descent - fontMetrics.ascent) * f12) + f11;
            if (i11 > 1) {
                d11 *= i11;
            }
            return (float) (d11 + (r0 - fontMetrics.top) + (fontMetrics.bottom - r5));
        } catch (Exception e11) {
            AbstractC20110a.m104543l(TAG).mo104552e(e11);
            return 0.0f;
        }
    }

    protected long measureText(long j11, float f11, int i11, float f12, int i12, int i13, float f13, float f14, float f15, int i14) {
        long j12;
        long j13 = 0;
        if (j11 == 0) {
            return 0L;
        }
        Layout m142463c = AbstractC28274h.m142463c(new ZOMParagraph(j11), f11, i11, f12, i12, i13, f13, f14, f15, i14);
        if (m142463c != null) {
            j12 = m142463c.getWidth() << 32;
        } else {
            j12 = 0;
        }
        if (m142463c != null) {
            j13 = m142463c.getHeight();
        }
        return j12 | j13;
    }

    public ZOMDocument nativeLayout(final InterfaceC17139d interfaceC17139d, final String str, String str2, byte[] bArr, final int i11, final int i12, final int i13, final int i14, final ZOMDocument zOMDocument, final int i15, final float f11, final boolean z11, final String str3, final String str4, final float f12, final float f13, final int i16) {
        ZOMDocument zOMDocument2;
        AbstractC20110a.m104543l(TAG).mo104548a("layoutGateway=%s locale=%s path=%s width=%s height=%s offsetX=%s offsetY=%s", interfaceC17139d, str, str2, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        if (zOMDocument != null) {
            zOMDocument.queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.e1
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantNativeBase.this.m91450b(zOMDocument, interfaceC17139d, str, i11, i12, i13, i14, i15, f11, z11, str3, str4, f12, f13, i16);
                }
            });
            return zOMDocument;
        }
        if (str2 != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                AbstractC29238m.m145998b(new FileInputStream(str2), byteArrayOutputStream);
                zOMDocument2 = (ZOMDocument) layout(interfaceC17139d, str, byteArrayOutputStream.toByteArray(), i11, i12, i13, i14, i15, f11, str3, str4, f12, f13, i16);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            return (zOMDocument2 != null || bArr == null) ? zOMDocument2 : (ZOMDocument) layout(interfaceC17139d, str, bArr, i11, i12, i13, i14, i15, f11, str3, str4, f12, f13, i16);
        }
        zOMDocument2 = null;
        if (zOMDocument2 != null) {
            return zOMDocument2;
        }
    }

    protected void preload(Object obj) {
        if (obj instanceof ZOMFontFace) {
            C28273g.m142439i().m142455f((ZOMFontFace) obj);
        }
    }

    protected void preloadResources(byte[] bArr, int i11, byte[] bArr2) {
        String m142407b = AbstractC28268b.m142407b(bArr);
        String m142407b2 = AbstractC28268b.m142407b(bArr2);
        if (m142407b != null) {
            JSONObject jSONObject = null;
            try {
                if (!TextUtils.isEmpty(m142407b2)) {
                    jSONObject = new JSONObject(m142407b2);
                }
            } catch (JSONException unused) {
            }
            C20590m.m107142c(new C20589l(m142407b, i11, jSONObject));
        }
    }

    protected String resolveParam(Object obj, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String mo91644c;
        try {
            if (!(obj instanceof InterfaceC17139d) || (mo91644c = ((InterfaceC17139d) obj).mo91644c(AbstractC28268b.m142407b(bArr), AbstractC28268b.m142407b(bArr2), AbstractC28268b.m142407b(bArr3))) == null) {
                return null;
            }
            return AbstractC28268b.m142406a(mo91644c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    protected native void setDefaultTextSize(float f11);

    protected native void setDpToEmFactor(float f11);

    protected native void setDpToPxFactor(float f11);

    protected native void setSpToPxFactor(float f11);

    protected String utf8Substring(byte[] bArr, int i11, int i12) {
        try {
            String m142407b = AbstractC28268b.m142407b(bArr);
            if (m142407b == null) {
                return "";
            }
            return AbstractC28268b.m142406a(m142407b.substring(Math.min(Math.max(i11, 0), m142407b.length()), Math.min(Math.max(i11 + i12, 0), m142407b.length())));
        } catch (Exception e11) {
            AbstractC20110a.m104543l(TAG).mo104549b(e11);
            return "";
        }
    }

    public int checkCondition(InterfaceC17139d interfaceC17139d, String str, String str2, boolean z11) {
        int i11 = -1;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.startsWith("__zinstant__.condition")) {
            int checkCondition = checkCondition(str, str2);
            if (checkCondition != -1) {
                return checkCondition;
            }
            i11 = checkCondition;
        }
        return interfaceC17139d != null ? interfaceC17139d.mo91643b(str, str2, z11) : i11;
    }
}
