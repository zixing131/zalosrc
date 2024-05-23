package me0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import p716zh.C32006l8;

/* renamed from: me0.m6 */
/* loaded from: classes4.dex */
public abstract class AbstractC23144m6 {
    /* renamed from: a */
    static Bitmap m118820a(Bitmap bitmap, int i11) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-12434878);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = i11;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f11, f11, paint);
        canvas.drawRect(0.0f, bitmap.getHeight() - i11, bitmap.getWidth(), bitmap.getHeight(), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: b */
    public static String m118821b(String str, TextPaint textPaint, int i11, TextUtils.TruncateAt truncateAt, int i12) {
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        StringBuilder sb2 = new StringBuilder();
        try {
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 23) {
            obtain = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i11);
            alignment = obtain.setAlignment(Layout.Alignment.ALIGN_CENTER);
            lineSpacing = alignment.setLineSpacing(0.0f, 1.0f);
            includePad = lineSpacing.setIncludePad(false);
            staticLayout = includePad.build();
        } else {
            staticLayout = new StaticLayout(str, textPaint, i11, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        int lineCount = staticLayout.getLineCount();
        int min = Math.min(lineCount, i12);
        for (int i13 = 0; i13 < min; i13++) {
            String substring = str.substring(staticLayout.getLineStart(i13), staticLayout.getLineEnd(i13));
            if (i13 == i12 - 1 && lineCount > i12) {
                substring = TextUtils.ellipsize(substring.replace(System.getProperty("line.separator"), "").concat("…"), textPaint, i11, truncateAt, true, null).toString();
            }
            sb2.append(substring);
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static Bitmap m118822c(Bitmap bitmap, int i11, int i12, int i13) {
        return m118820a(ThumbnailUtils.extractThumbnail(bitmap, i11, i12), i13);
    }

    /* renamed from: d */
    public static void m118823d(C32006l8 c32006l8, C32006l8 c32006l82) {
        if (c32006l8 != null && c32006l82 != null) {
            c32006l8.f147277d = c32006l82.f147277d;
            c32006l8.f147276c = c32006l82.f147276c;
            c32006l8.f147274a = c32006l82.f147274a;
            c32006l8.f147275b = c32006l82.f147275b;
            c32006l8.f147283j = c32006l82.f147283j;
            c32006l8.f147284k = c32006l82.f147284k;
            c32006l8.f147282i = c32006l82.f147282i;
            c32006l8.f147287n = c32006l82.f147287n;
            c32006l8.f147286m = c32006l82.f147286m;
            c32006l8.f147288o = c32006l82.f147288o;
            c32006l8.f147289p = c32006l82.f147289p;
            c32006l8.f147281h = c32006l82.f147281h;
            c32006l8.f147291r = c32006l82.f147291r;
            c32006l8.f147293t = c32006l82.f147293t;
            c32006l8.f147294u = c32006l82.f147294u;
            c32006l8.f147285l = c32006l82.f147285l;
            c32006l8.f147292s = c32006l82.f147292s;
            c32006l8.f147297x = c32006l82.f147297x;
            c32006l8.f147298y = c32006l82.f147298y;
            c32006l8.f147295v = c32006l82.f147295v;
            c32006l8.f147296w = c32006l82.f147296w;
        }
    }
}
