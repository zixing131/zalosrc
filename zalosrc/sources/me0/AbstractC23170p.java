package me0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13703p0;
import ho0.AbstractC20110a;
import p181g6.AbstractC19237c;
import p181g6.C19236b;
import p379o3.C23999j;

/* renamed from: me0.p */
/* loaded from: classes4.dex */
public abstract class AbstractC23170p {

    /* renamed from: a */
    private static Drawable f112352a = null;

    /* renamed from: b */
    private static Drawable f112353b = null;

    /* renamed from: c */
    private static Drawable f112354c = null;

    /* renamed from: d */
    private static Drawable f112355d = null;

    /* renamed from: e */
    private static Drawable f112356e = null;

    /* renamed from: f */
    private static int f112357f = -1;

    /* renamed from: a */
    public static void m119343a(int i11) {
        if (f112357f != i11) {
            f112357f = i11;
            m119344b();
        }
    }

    /* renamed from: b */
    private static void m119344b() {
        f112353b = null;
        f112354c = null;
        f112356e = null;
    }

    /* renamed from: c */
    public static void m119345c(Bitmap bitmap, Bitmap bitmap2) {
        Canvas canvas = new Canvas(bitmap);
        float width = bitmap.getWidth() / bitmap.getHeight();
        float width2 = bitmap2.getWidth() / bitmap2.getHeight();
        Matrix matrix = new Matrix();
        if (width2 <= width) {
            float width3 = bitmap.getWidth() / bitmap2.getWidth();
            matrix.setScale(width3, width3);
            matrix.postTranslate(0.0f, (-((bitmap.getWidth() / width2) - bitmap.getHeight())) / 2.0f);
        } else {
            float height = bitmap.getHeight() / bitmap2.getHeight();
            matrix.setScale(height, height);
            matrix.postTranslate((-((width2 * bitmap.getHeight()) - bitmap.getWidth())) / 2.0f, 0.0f);
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.drawBitmap(bitmap2, matrix, null);
        AbstractC20110a.m104535d("drawBitmapCenterCrop", new Object[0]);
    }

    /* renamed from: d */
    public static void m119346d(Bitmap bitmap, Bitmap bitmap2) {
        RectF rectF;
        Canvas canvas = new Canvas(bitmap);
        float width = bitmap2.getWidth() / bitmap2.getHeight();
        if (width <= bitmap.getWidth() / bitmap.getHeight()) {
            rectF = new RectF((bitmap.getWidth() - (width * bitmap.getHeight())) / 2.0f, 0.0f, 0.0f, bitmap.getHeight());
            rectF.right = bitmap.getWidth() - rectF.left;
        } else {
            RectF rectF2 = new RectF(0.0f, (bitmap.getHeight() - (bitmap.getWidth() / width)) / 2.0f, bitmap.getWidth(), 0.0f);
            rectF2.bottom = bitmap.getHeight() - rectF2.top;
            rectF = rectF2;
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.drawBitmap(bitmap2, (Rect) null, rectF, (Paint) null);
    }

    /* renamed from: e */
    public static Bitmap m119347e(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float width = bitmap.getWidth() / 2.0f;
        paint.setAntiAlias(true);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, width, width, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: f */
    public static void m119348f(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, int i11, boolean z11) {
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if (i11 == 0) {
            m119350h(canvas, z11, 4, 4, bitmap2, bitmap3, bitmap4, bitmap5);
            return;
        }
        if (i11 == 1) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            int i12 = (int) width;
            int i13 = (int) height;
            Rect rect = new Rect(0, 0, i12, i13);
            int i14 = (int) (width * 2.0f);
            Rect rect2 = new Rect(i12, 0, i14, i13);
            int i15 = (int) (height * 2.0f);
            Rect rect3 = new Rect(0, i13, i12, i15);
            Rect rect4 = new Rect(i12, i13, i14, i15);
            canvas.drawARGB(255, 201, 212, 229);
            canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), rect, paint);
            canvas.drawBitmap(bitmap3, new Rect(0, 0, bitmap3.getWidth(), bitmap3.getHeight()), rect2, paint);
            canvas.drawBitmap(bitmap4, new Rect(0, 0, bitmap4.getWidth(), bitmap4.getHeight()), rect3, paint);
            canvas.drawBitmap(bitmap5, new Rect(0, 0, bitmap5.getWidth(), bitmap5.getHeight()), rect4, paint);
        }
    }

    /* renamed from: g */
    public static void m119349g(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, String str, int i11, boolean z11) {
        int i12;
        if (i11 == 0) {
            bitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (!TextUtils.isEmpty(str)) {
                i12 = Integer.parseInt(str);
                m119350h(canvas, z11, 4, i12, bitmap2, bitmap3, bitmap4, bitmap5);
                return;
            }
            i12 = 4;
            m119350h(canvas, z11, 4, i12, bitmap2, bitmap3, bitmap4, bitmap5);
            return;
        }
        if (i11 == 1) {
            m119348f(bitmap, bitmap2, bitmap3, bitmap4, bitmap5, i11, z11);
            float width = bitmap.getWidth() / 2.0f;
            float height = bitmap.getHeight() / 2.0f;
            Canvas canvas2 = new Canvas(bitmap);
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            double d11 = height;
            textPaint.setTextSize((int) (0.6d * d11));
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            Rect rect = new Rect((int) width, (int) height, (int) (width * 2.0f), (int) (height * 2.0f));
            int breakText = textPaint.breakText(str, true, rect.width(), null);
            int length = (str.length() - breakText) / 2;
            canvas2.drawText(str, length, length + breakText, rect.exactCenterX() - ((int) (width * 0.05d)), rect.exactCenterY() + ((int) (d11 * 0.23d)), (Paint) textPaint);
        }
    }

    /* renamed from: h */
    private static void m119350h(Canvas canvas, boolean z11, int i11, int i12, Bitmap... bitmapArr) {
        Drawable.ConstantState constantState;
        if (z11) {
            try {
                canvas.drawColor(-1);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Context appContext = MainApplication.getAppContext();
        Resources resources = appContext.getResources();
        int length = bitmapArr.length;
        Drawable[] drawableArr = new Drawable[length];
        for (int i13 = 0; i13 < length; i13++) {
            Bitmap bitmap = bitmapArr[i13];
            if (bitmap != null && !bitmap.isRecycled()) {
                drawableArr[i13] = new BitmapDrawable(resources, C23999j.m125743s2(bitmapArr[i13]));
            } else {
                if (f112352a == null) {
                    f112352a = C23212s8.m119608p(AbstractC16781w.default_avatar);
                }
                Drawable drawable = f112352a;
                if (drawable != null && (constantState = drawable.getConstantState()) != null) {
                    drawableArr[i13] = constantState.newDrawable();
                }
            }
        }
        C13703p0 c13703p0 = new C13703p0(new RecyclingImageView(appContext), width, height, z11, z11);
        c13703p0.m76606f(1.0f);
        if (z11) {
            c13703p0.m76609i(-1);
        }
        c13703p0.m76607g(i11, i12, drawableArr);
        c13703p0.m76603a(canvas);
    }

    /* renamed from: i */
    public static void m119351i(Bitmap bitmap, Bitmap bitmap2, boolean z11) {
        int i11;
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        if (z11) {
            i11 = (int) (bitmap.getWidth() * 0.15f);
        } else {
            i11 = 0;
        }
        Rect rect = new Rect(i11, i11, bitmap.getWidth() - i11, bitmap.getHeight() - i11);
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), rect, paint);
    }

    /* renamed from: j */
    public static void m119352j(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, int i11, boolean z11) {
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if (i11 == 0) {
            m119350h(canvas, z11, 3, 3, bitmap2, bitmap3, bitmap4);
            return;
        }
        if (i11 == 1) {
            float width = bitmap.getWidth() / 4.0f;
            if ((Math.sqrt(3.0d) + 2.0d) * width > bitmap.getHeight()) {
                return;
            }
            float width2 = bitmap.getWidth() / 2.0f;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Rect rect = new Rect((int) (-width), 0, (int) (bitmap.getWidth() - width), bitmap.getHeight());
            int i12 = (int) width2;
            Rect rect2 = new Rect(i12, 0, (int) (bitmap.getWidth() + width2), bitmap.getHeight());
            Rect rect3 = new Rect(i12, i12, (int) (bitmap.getWidth() + width2), (int) (bitmap.getHeight() + width2));
            canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), rect, paint);
            canvas.drawBitmap(bitmap3, new Rect(0, 0, bitmap3.getWidth(), bitmap3.getHeight()), rect2, paint);
            canvas.drawBitmap(bitmap4, new Rect(0, 0, bitmap4.getWidth(), bitmap4.getHeight()), rect3, paint);
        }
    }

    /* renamed from: k */
    public static void m119353k(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i11, boolean z11) {
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if (i11 == 0) {
            m119350h(canvas, z11, 2, 2, bitmap2, bitmap3);
            return;
        }
        if (i11 == 1) {
            float width = bitmap.getWidth() / 2.0f;
            float width2 = bitmap.getWidth() / 4.0f;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Rect rect = new Rect((int) (-width2), 0, (int) (bitmap.getWidth() - width2), bitmap.getHeight());
            Rect rect2 = new Rect((int) width, 0, (int) (bitmap.getWidth() + width), bitmap.getHeight());
            canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), rect, paint);
            Path path = new Path();
            path.addRect(new RectF(rect2), Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.drawBitmap(bitmap3, new Rect(0, 0, bitmap3.getWidth(), bitmap3.getHeight()), new Rect((int) (width - width2), 0, (int) ((bitmap.getWidth() + width) - width2), bitmap.getHeight()), paint);
        }
    }

    /* renamed from: l */
    public static Drawable m119354l() {
        if (f112355d == null) {
            f112355d = AbstractC23136l9.m118663M(AbstractC16803z.feed_location_thumb);
        }
        return f112355d;
    }

    /* renamed from: m */
    public static Drawable m119355m(Context context) {
        if (f112354c == null) {
            f112354c = new BitmapDrawable(context.getResources(), AbstractC23136l9.m118751u(AbstractC23136l9.m118663M(AbstractC16803z.bg_thumb_action), 100, 100));
        }
        return f112354c;
    }

    /* renamed from: n */
    public static Drawable m119356n() {
        if (f112353b == null) {
            f112353b = AbstractC23136l9.m118663M(AbstractC16803z.chat_icloud_default);
        }
        return f112353b;
    }

    /* renamed from: o */
    public static Drawable m119357o() {
        return m119358p(MainApplication.getAppContext());
    }

    /* renamed from: p */
    public static Drawable m119358p(Context context) {
        if (f112354c == null) {
            f112354c = new BitmapDrawable(context.getResources(), AbstractC23136l9.m118751u(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_feed), 100, 100));
        }
        return f112354c;
    }

    /* renamed from: q */
    public static Drawable m119359q() {
        return m119360r(MainApplication.getAppContext());
    }

    /* renamed from: r */
    public static Drawable m119360r(Context context) {
        if (f112356e == null) {
            f112356e = new BitmapDrawable(context.getResources(), AbstractC23136l9.m118751u(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_suggest_photo_expand_item), AbstractC23136l9.m118742r(50.0f), AbstractC23136l9.m118742r(110.0f)));
        }
        return f112356e;
    }

    /* renamed from: s */
    public static float m119361s(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: t */
    public static float m119362t(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: u */
    public static float m119363u(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: v */
    public static float m119364v(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: w */
    public static boolean m119365w(Bitmap bitmap) {
        boolean z11 = false;
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return false;
        }
        if (bitmap.getWidth() > 10 && bitmap.getHeight() > 10) {
            try {
                int[] iArr = new int[100];
                bitmap.getPixels(iArr, 0, 10, bitmap.getWidth() - 10, bitmap.getHeight() - 10, 10, 10);
                int i11 = 0;
                while (true) {
                    if (i11 < 100) {
                        if ((iArr[i11] ^ (-16777216)) != 0) {
                            break;
                        }
                        i11++;
                    } else {
                        z11 = true;
                        break;
                    }
                }
                return !z11;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return true;
    }

    /* renamed from: x */
    public static Bitmap m119366x(Bitmap bitmap, int i11) {
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * (i11 / bitmap.getHeight())), i11, false);
    }

    /* renamed from: y */
    public static Bitmap m119367y(Bitmap bitmap, int i11) {
        return Bitmap.createScaledBitmap(bitmap, i11, (int) (bitmap.getHeight() * (i11 / bitmap.getWidth())), false);
    }

    /* renamed from: z */
    public static C19236b m119368z(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return AbstractC19237c.m100919a(createBitmap);
    }
}
