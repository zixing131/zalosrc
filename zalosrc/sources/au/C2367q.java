package au;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;
import pm0.C24865v;
import ui0.C27280g;
import ui0.EnumC27277d;

/* renamed from: au.q */
/* loaded from: classes4.dex */
public final class C2367q {

    /* renamed from: a */
    public static final C2367q f9902a = new C2367q();

    /* renamed from: au.q$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9903a;

        static {
            int[] iArr = new int[EnumC27277d.values().length];
            try {
                iArr[EnumC27277d.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27277d.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27277d.DIAGONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9903a = iArr;
        }
    }

    private C2367q() {
    }

    /* renamed from: a */
    public static final Bitmap m12384a(Context context, int i11, int i12) {
        C24865v m12385b;
        int i13;
        AbstractC19074t.m100208f(context, "context");
        Drawable m139658a = C27280g.m139658a(context, i11);
        LinearGradient linearGradient = null;
        if (m139658a == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(m139658a.getIntrinsicWidth(), m139658a.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        m139658a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        m139658a.draw(canvas);
        float intrinsicWidth = m139658a.getIntrinsicWidth();
        float intrinsicHeight = m139658a.getIntrinsicHeight();
        Paint paint = new Paint();
        try {
            m12385b = m12385b(context, i12);
        } catch (Exception unused) {
        }
        if (m12385b == null) {
            return createBitmap;
        }
        EnumC27277d enumC27277d = (EnumC27277d) m12385b.m129234f();
        if (enumC27277d == null) {
            i13 = -1;
        } else {
            i13 = a.f9903a[enumC27277d.ordinal()];
        }
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    linearGradient = new LinearGradient(0.0f, intrinsicHeight, intrinsicWidth, 0.0f, ((Number) m12385b.m129232d()).intValue(), ((Number) m12385b.m129233e()).intValue(), Shader.TileMode.MIRROR);
                }
            } else {
                float f11 = intrinsicHeight / 2;
                linearGradient = new LinearGradient(0.0f, f11, intrinsicHeight, f11, ((Number) m12385b.m129232d()).intValue(), ((Number) m12385b.m129233e()).intValue(), Shader.TileMode.MIRROR);
            }
        } else {
            float f12 = intrinsicWidth / 2;
            linearGradient = new LinearGradient(f12, intrinsicHeight, f12, 0.0f, ((Number) m12385b.m129232d()).intValue(), ((Number) m12385b.m129233e()).intValue(), Shader.TileMode.MIRROR);
        }
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, intrinsicHeight, paint);
        return createBitmap;
    }

    /* renamed from: b */
    public static final C24865v m12385b(Context context, int i11) {
        EnumC27277d enumC27277d;
        AbstractC19074t.m100208f(context, "context");
        XmlResourceParser xml = context.getResources().getXml(i11);
        AbstractC19074t.m100207e(xml, "getXml(...)");
        double d11 = 0.0d;
        int i12 = 0;
        int i13 = 0;
        while (xml.getEventType() != 1) {
            try {
                if (xml.getEventType() == 2 && AbstractC19074t.m100204b(xml.getName(), "gradient")) {
                    i12 = Color.parseColor(xml.getAttributeValue(0));
                    i13 = Color.parseColor(xml.getAttributeValue(1));
                    String attributeValue = xml.getAttributeValue(2);
                    AbstractC19074t.m100207e(attributeValue, "getAttributeValue(...)");
                    d11 = Double.parseDouble(attributeValue);
                }
                xml.next();
            } catch (Exception unused) {
                xml.close();
                return null;
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        }
        if (d11 == 0.0d) {
            enumC27277d = EnumC27277d.HORIZONTAL;
        } else if (d11 == 45.0d) {
            enumC27277d = EnumC27277d.DIAGONAL;
        } else {
            enumC27277d = EnumC27277d.VERTICAL;
        }
        C24865v c24865v = new C24865v(Integer.valueOf(i12), Integer.valueOf(i13), enumC27277d);
        xml.close();
        return c24865v;
    }
}
