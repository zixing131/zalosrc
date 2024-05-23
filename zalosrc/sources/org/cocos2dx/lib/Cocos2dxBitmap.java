package org.cocos2dx.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes7.dex */
public final class Cocos2dxBitmap {
    private static final int HORIZONTAL_ALIGN_CENTER = 3;
    private static final int HORIZONTAL_ALIGN_LEFT = 1;
    private static final int HORIZONTAL_ALIGN_RIGHT = 2;
    private static final int VERTICAL_ALIGN_BOTTOM = 2;
    private static final int VERTICAL_ALIGN_CENTER = 3;
    private static final int VERTICAL_ALIGN_TOP = 1;
    private static Context sContext;

    public static boolean createTextBitmapShadowStroke(byte[] bArr, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, float f11, float f12, float f13, float f14, boolean z12, int i19, int i21, int i22, int i23, float f15) {
        StaticLayout staticLayout;
        int i24;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        int i25 = 0;
        if (bArr != null && bArr.length != 0) {
            String str2 = new String(bArr);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            int i26 = i16 & 15;
            if (i26 == 2) {
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i26 == 3) {
                alignment2 = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment3 = alignment2;
            TextPaint newPaint = newPaint(str, i11);
            if (z12) {
                newPaint.setStyle(Paint.Style.STROKE);
                newPaint.setStrokeWidth(f15);
            }
            int ceil = i17 <= 0 ? (int) Math.ceil(Layout.getDesiredWidth(str2, newPaint)) : i17;
            if (Build.VERSION.SDK_INT >= 24) {
                obtain = StaticLayout.Builder.obtain(str2, 0, str2.length(), newPaint, ceil);
                lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
                alignment = lineSpacing.setAlignment(alignment3);
                includePad = alignment.setIncludePad(false);
                breakStrategy = includePad.setBreakStrategy(1);
                staticLayout = breakStrategy.build();
            } else {
                staticLayout = new StaticLayout(str2, newPaint, ceil, alignment3, 1.0f, 0.0f, false);
            }
            int width = staticLayout.getWidth();
            int lineTop = staticLayout.getLineTop(staticLayout.getLineCount());
            int max = Math.max(width, i17);
            int i27 = i18 > 0 ? i18 : lineTop;
            if (max != 0 && i27 != 0) {
                if (i26 == 3) {
                    i24 = (max - width) / 2;
                } else {
                    i24 = i26 == 2 ? max - width : 0;
                }
                int i28 = (i16 >> 4) & 15;
                if (i28 == 2) {
                    i25 = i27 - lineTop;
                } else if (i28 == 3) {
                    i25 = (i27 - lineTop) / 2;
                }
                Bitmap createBitmap = Bitmap.createBitmap(max, i27, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(i24, i25);
                if (z12) {
                    newPaint.setARGB(i23, i19, i21, i22);
                    staticLayout.draw(canvas);
                }
                newPaint.setStyle(Paint.Style.FILL);
                newPaint.setARGB(i15, i12, i13, i14);
                staticLayout.draw(canvas);
                initNativeObject(createBitmap);
                return true;
            }
        }
        return false;
    }

    public static int getFontSizeAccordingHeight(int i11) {
        TextPaint textPaint = new TextPaint();
        Rect rect = new Rect();
        textPaint.setTypeface(Typeface.DEFAULT);
        boolean z11 = false;
        int i12 = 1;
        while (!z11) {
            textPaint.setTextSize(i12);
            textPaint.getTextBounds("SghMNy", 0, 6, rect);
            i12++;
            if (i11 - rect.height() <= 2) {
                z11 = true;
            }
        }
        return i12;
    }

    private static byte[] getPixels(Bitmap bitmap) {
        if (bitmap != null) {
            byte[] bArr = new byte[bitmap.getWidth() * bitmap.getHeight() * 4];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.nativeOrder());
            bitmap.copyPixelsToBuffer(wrap);
            return bArr;
        }
        return null;
    }

    private static String getStringWithEllipsis(String str, float f11, float f12) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextSize(f12);
        return TextUtils.ellipsize(str, textPaint, f11, TextUtils.TruncateAt.END).toString();
    }

    private static void initNativeObject(Bitmap bitmap) {
        byte[] pixels = getPixels(bitmap);
        if (pixels == null) {
            return;
        }
        nativeInitBitmapDC(bitmap.getWidth(), bitmap.getHeight(), pixels);
    }

    private static native void nativeInitBitmapDC(int i11, int i12, byte[] bArr);

    private static TextPaint newPaint(String str, int i11) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(i11);
        textPaint.setAntiAlias(true);
        if (str.endsWith(".ttf")) {
            try {
                textPaint.setTypeface(Cocos2dxTypefaces.get(sContext, str));
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error to create ttf type face: ");
                sb2.append(str);
                textPaint.setTypeface(Typeface.create(str, 0));
            }
        } else {
            textPaint.setTypeface(Typeface.create(str, 0));
        }
        return textPaint;
    }

    public static void setContext(Context context) {
        sContext = context;
    }
}
