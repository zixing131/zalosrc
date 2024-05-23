package et;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import se0.AbstractC26236a;

/* renamed from: et.a */
/* loaded from: classes4.dex */
public abstract class AbstractC18594a {
    /* renamed from: a */
    private static int m98194a(int[] iArr, int i11, int i12) {
        int i13 = i12 - 1;
        while (true) {
            if (i13 <= -1) {
                return 0;
            }
            int i14 = i13 * i11;
            for (int i15 = 0; i15 < i11; i15 += 5) {
                if (iArr[i14 + i15] != 0) {
                    return i13;
                }
            }
            i13 -= 5;
        }
    }

    /* renamed from: b */
    private static int m98195b(int[] iArr, int i11, int i12) {
        int i13 = i11 * 5;
        for (int i14 = 0; i14 < i11; i14 += 5) {
            int i15 = i14;
            for (int i16 = 0; i16 < i12; i16 += 5) {
                if (iArr[i15] != 0) {
                    return i14;
                }
                i15 += i13;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private static int m98196c(int[] iArr, int i11, int i12) {
        int i13 = i11 * 5;
        int i14 = i11 - 1;
        while (true) {
            if (i14 <= -1) {
                return 0;
            }
            int i15 = i14;
            for (int i16 = 0; i16 < i12; i16 += 5) {
                if (iArr[i15] != 0) {
                    return i14;
                }
                i15 += i13;
            }
            i14 -= 5;
        }
    }

    /* renamed from: d */
    private static int m98197d(int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13 += 5) {
            int i14 = i13 * i11;
            for (int i15 = 0; i15 < i11; i15 += 5) {
                if (iArr[i14 + i15] != 0) {
                    return i13;
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static int m98198e(Bitmap bitmap, Rect rect) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Bitmap m98200g = m98200g(bitmap);
                int[] iArr = new int[1];
                AbstractC26236a.m134904k(iArr, 0, m98200g);
                if (iArr[0] > 0) {
                    if (rect != null) {
                        try {
                            int width = m98200g.getWidth();
                            int height = m98200g.getHeight();
                            int[] iArr2 = new int[width * height];
                            m98200g.getPixels(iArr2, 0, width, 0, 0, width, height);
                            rect.left = m98195b(iArr2, width, height) - (m98200g.getWidth() / 2);
                            rect.top = (m98200g.getHeight() / 2) - m98197d(iArr2, width, height);
                            rect.right = m98196c(iArr2, width, height) - (m98200g.getWidth() / 2);
                            rect.bottom = (m98200g.getHeight() / 2) - m98194a(iArr2, width, height);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    return iArr[0];
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static Bitmap m98199f(String str) {
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(60.0f);
        textPaint.setColor(-16777216);
        int measureText = (int) (textPaint.measureText(str) + 1.0f);
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, measureText);
            lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
            alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_CENTER);
            includePad = alignment.setIncludePad(false);
            breakStrategy = includePad.setBreakStrategy(1);
            staticLayout = breakStrategy.build();
        } else {
            staticLayout = new StaticLayout(str, textPaint, measureText, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        int max = Math.max(measureText, staticLayout.getHeight());
        if (max % 2 != 0) {
            max++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        createBitmap.eraseColor(0);
        canvas.translate((max - measureText) / 2, (max - r0) / 2);
        staticLayout.draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    /* renamed from: g */
    private static Bitmap m98200g(Bitmap bitmap) {
        if (bitmap != null && (bitmap.getWidth() % 2 == 1 || bitmap.getHeight() % 2 == 1)) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width % 2 == 1) {
                width--;
            }
            if (height % 2 == 1) {
                height--;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return createBitmap;
        }
        return bitmap;
    }

    /* renamed from: h */
    public static void m98201h(Bitmap bitmap, Rect rect) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Bitmap m98200g = m98200g(bitmap);
                if (rect != null) {
                    try {
                        int width = m98200g.getWidth();
                        int height = m98200g.getHeight();
                        int[] iArr = new int[width * height];
                        m98200g.getPixels(iArr, 0, width, 0, 0, width, height);
                        rect.left = m98195b(iArr, width, height) - (m98200g.getWidth() / 2);
                        rect.top = (m98200g.getHeight() / 2) - m98197d(iArr, width, height);
                        rect.right = m98196c(iArr, width, height) - (m98200g.getWidth() / 2);
                        rect.bottom = (m98200g.getHeight() / 2) - m98194a(iArr, width, height);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }
}
