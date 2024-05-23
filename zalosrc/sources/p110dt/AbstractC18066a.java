package p110dt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.List;
import p169fu.AbstractC19146a;
import p276jt.C21357l;

/* renamed from: dt.a */
/* loaded from: classes4.dex */
public abstract class AbstractC18066a {

    /* renamed from: a */
    private static final int f91469a = Color.parseColor("#33000000");

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m96055a(Layout layout, List list, int i11, Path path, float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        if (m96063i(layout, i11)) {
            return;
        }
        C18067b c18067b = (C18067b) list.get(i11);
        float m96068c = c18067b.m96068c();
        float m96069d = c18067b.m96069d();
        float m96070e = c18067b.m96070e();
        float m96066a = c18067b.m96066a();
        float f19 = m96068c + f11;
        path.moveTo(f19, m96070e);
        float f21 = m96069d - f11;
        path.lineTo(f21, m96070e);
        if (!AbstractC18068c.m96075c(i11)) {
            int i12 = i11 - 1;
            if (!AbstractC18068c.m96079g(c18067b, (C18067b) list.get(i12)) && !m96065k(layout, i11)) {
                if (!AbstractC18068c.m96075c(i11) && AbstractC18068c.m96080h(c18067b, (C18067b) list.get(i12))) {
                    float f22 = m96069d + f11;
                    path.lineTo(f22, m96070e);
                    f12 = f21;
                    f13 = f19;
                    f14 = m96068c;
                    f15 = m96066a;
                    path.arcTo(m96069d, m96070e, f22, m96070e + f11, -90.0f, -90.0f, false);
                } else {
                    f12 = f21;
                    f13 = f19;
                    f14 = m96068c;
                    f15 = m96066a;
                    path.lineTo(m96069d, m96070e);
                    path.lineTo(m96069d, m96070e + f11);
                }
                float f23 = f15 - f11;
                path.lineTo(m96069d, f23);
                if (!AbstractC18068c.m96076d(i11, list.size())) {
                    int i13 = i11 + 1;
                    if (!AbstractC18068c.m96079g(c18067b, (C18067b) list.get(i13)) && !m96064j(layout, i11)) {
                        if (!AbstractC18068c.m96076d(i11, list.size()) && AbstractC18068c.m96080h(c18067b, (C18067b) list.get(i13))) {
                            f16 = f23;
                            path.arcTo(m96069d, f23, m96069d + f11, f15, 180.0f, -90.0f, false);
                        } else {
                            path.lineTo(m96069d, f15);
                            f16 = f23;
                        }
                        float f24 = f14 - f11;
                        path.lineTo(f24, f15);
                        if (!AbstractC18068c.m96076d(i11, list.size())) {
                            int i14 = i11 + 1;
                            if (!AbstractC18068c.m96078f(c18067b, (C18067b) list.get(i14)) && !m96064j(layout, i11)) {
                                if (!AbstractC18068c.m96076d(i11, list.size()) && AbstractC18068c.m96077e(c18067b, (C18067b) list.get(i14))) {
                                    path.lineTo(f24, f15);
                                    f17 = f24;
                                    path.arcTo(f24, f16, f14, f15, 90.0f, -90.0f, false);
                                    f18 = f14;
                                } else {
                                    f17 = f24;
                                    float f25 = f14;
                                    path.lineTo(f25, f15);
                                    path.lineTo(f25, f16);
                                    f18 = f25;
                                }
                                path.lineTo(f18, m96070e - f11);
                                if (!AbstractC18068c.m96075c(i11)) {
                                    int i15 = i11 - 1;
                                    if (!AbstractC18068c.m96078f(c18067b, (C18067b) list.get(i15)) && !m96065k(layout, i11)) {
                                        if (!AbstractC18068c.m96075c(i11) && AbstractC18068c.m96077e(c18067b, (C18067b) list.get(i15))) {
                                            path.arcTo(f17, m96070e, f18, m96070e + f11, 0.0f, -90.0f, false);
                                            return;
                                        } else {
                                            path.lineTo(f18, m96070e);
                                            path.lineTo(f13, m96070e);
                                            return;
                                        }
                                    }
                                }
                                path.arcTo(f18, m96070e, f13, m96070e + f11, 180.0f, 90.0f, false);
                            }
                        }
                        f17 = f24;
                        float f26 = f14;
                        float f27 = f15;
                        f18 = f26;
                        path.arcTo(f26, f16, f13, f27, 90.0f, 90.0f, false);
                        path.lineTo(f18, m96070e - f11);
                        if (!AbstractC18068c.m96075c(i11)) {
                        }
                        path.arcTo(f18, m96070e, f13, m96070e + f11, 180.0f, 90.0f, false);
                    }
                }
                f16 = f23;
                path.arcTo(f12, f23, m96069d, f15, 0.0f, 90.0f, false);
                float f242 = f14 - f11;
                path.lineTo(f242, f15);
                if (!AbstractC18068c.m96076d(i11, list.size())) {
                }
                f17 = f242;
                float f262 = f14;
                float f272 = f15;
                f18 = f262;
                path.arcTo(f262, f16, f13, f272, 90.0f, 90.0f, false);
                path.lineTo(f18, m96070e - f11);
                if (!AbstractC18068c.m96075c(i11)) {
                }
                path.arcTo(f18, m96070e, f13, m96070e + f11, 180.0f, 90.0f, false);
            }
        }
        f12 = f21;
        f13 = f19;
        f14 = m96068c;
        f15 = m96066a;
        path.arcTo(f12, m96070e, m96069d, m96070e + f11, -90.0f, 90.0f, false);
        float f232 = f15 - f11;
        path.lineTo(m96069d, f232);
        if (!AbstractC18068c.m96076d(i11, list.size())) {
        }
        f16 = f232;
        path.arcTo(f12, f232, m96069d, f15, 0.0f, 90.0f, false);
        float f2422 = f14 - f11;
        path.lineTo(f2422, f15);
        if (!AbstractC18068c.m96076d(i11, list.size())) {
        }
        f17 = f2422;
        float f2622 = f14;
        float f2722 = f15;
        f18 = f2622;
        path.arcTo(f2622, f16, f13, f2722, 90.0f, 90.0f, false);
        path.lineTo(f18, m96070e - f11);
        if (!AbstractC18068c.m96075c(i11)) {
        }
        path.arcTo(f18, m96070e, f13, m96070e + f11, 180.0f, 90.0f, false);
    }

    /* renamed from: b */
    public static final Bitmap m96056b(Context context, C21357l.b bVar, Path path, Layout layout, float f11) {
        int m104529e;
        int m104529e2;
        int i11;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(bVar, "textStyle");
        AbstractC19074t.m100208f(path, "path");
        AbstractC19074t.m100208f(layout, "layout");
        int m96059e = m96059e(context, 32);
        int width = layout.getWidth() + m96059e + m96059e(context, 32);
        int height = layout.getHeight();
        m104529e = AbstractC20104d.m104529e(width * f11);
        m104529e2 = AbstractC20104d.m104529e(height * f11);
        Bitmap createBitmap = Bitmap.createBitmap(m104529e, m104529e2, Bitmap.Config.ARGB_8888);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        if (bVar.f104104k) {
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, createBitmap.getHeight() / f11, bVar.f104100g, bVar.f104101h, Shader.TileMode.CLAMP));
        } else {
            paint.setColor(bVar.f104099f);
        }
        if (bVar.f104103j) {
            i11 = 127;
        } else {
            i11 = 255;
        }
        paint.setAlpha(i11);
        canvas.scale(f11, f11);
        float f12 = m96059e;
        canvas.translate(f12, 0.0f);
        canvas.save();
        canvas.translate(-f12, 0.0f);
        canvas.drawPath(path, paint);
        canvas.restore();
        layout.draw(canvas);
        Bitmap m100470i = AbstractC19146a.m100470i(createBitmap);
        createBitmap.recycle();
        AbstractC19074t.m100205c(m100470i);
        return m100470i;
    }

    /* renamed from: c */
    public static final Bitmap m96057c(Layout layout, float f11) {
        int m104529e;
        int m104529e2;
        AbstractC19074t.m100208f(layout, "layout");
        int width = layout.getWidth();
        int height = layout.getHeight();
        m104529e = AbstractC20104d.m104529e(width * f11);
        m104529e2 = AbstractC20104d.m104529e(height * f11);
        Bitmap createBitmap = Bitmap.createBitmap(m104529e, m104529e2, Bitmap.Config.ARGB_8888);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f11, f11);
        layout.draw(canvas);
        canvas.restore();
        Bitmap m100470i = AbstractC19146a.m100470i(createBitmap);
        AbstractC19074t.m100207e(m100470i, "trim(...)");
        return m100470i;
    }

    /* renamed from: d */
    public static final Layout m96058d(Context context, C21357l.b bVar, String str, int i11, boolean z11, int i12) {
        Typeface typeface;
        int i13;
        float f11;
        Layout.Alignment alignment;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder breakStrategy;
        StaticLayout build;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(bVar, "textStyle");
        AbstractC19074t.m100208f(str, "text");
        if (!TextUtils.isEmpty(bVar.f104095b)) {
            typeface = Typeface.createFromAsset(context.getAssets(), bVar.f104095b);
        } else {
            typeface = null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(bVar.f104106m);
        textPaint.setColor(bVar.f104097d);
        if (bVar.f104103j && !z11) {
            i13 = 127;
        } else {
            i13 = 255;
        }
        textPaint.setAlpha(i13);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setShadowLayer(m96059e(context, 3), 0.0f, 0.0f, f91469a);
        float f12 = i12;
        if (bVar.f104096c != 0) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            f11 = bVar.f104096c - ((int) (fontMetrics.descent - fontMetrics.ascent));
        } else {
            f11 = 0.0f;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        valueOf.setSpan(new RelativeSizeSpan(bVar.f104109p), 0, str.length(), 18);
        if (i11 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i11 == 2) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment3 = alignment;
        if (Build.VERSION.SDK_INT >= 23) {
            obtain = StaticLayout.Builder.obtain(valueOf, 0, str.length(), textPaint, (int) f12);
            lineSpacing = obtain.setLineSpacing(f11, 1.0f);
            alignment2 = lineSpacing.setAlignment(alignment3);
            breakStrategy = alignment2.setBreakStrategy(1);
            build = breakStrategy.build();
            AbstractC19074t.m100205c(build);
            return build;
        }
        return new StaticLayout(valueOf, textPaint, (int) f12, alignment3, 1.0f, f11, false);
    }

    /* renamed from: e */
    private static final int m96059e(Context context, int i11) {
        return (int) ((i11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: f */
    public static final float m96060f(Layout layout) {
        AbstractC19074t.m100208f(layout, "layout");
        float lineLeft = layout.getLineLeft(0);
        float lineRight = layout.getLineRight(0);
        int lineCount = layout.getLineCount();
        for (int i11 = 1; i11 < lineCount; i11++) {
            lineLeft = Math.min(lineLeft, layout.getLineLeft(i11));
            lineRight = Math.max(lineRight, layout.getLineRight(i11));
        }
        return lineRight - lineLeft;
    }

    /* renamed from: g */
    public static final Path m96061g(Layout layout, int i11, int i12) {
        AbstractC19074t.m100208f(layout, "layout");
        Path path = new Path();
        float height = layout.getHeight() / (layout.getLineCount() * 3.0f);
        List m96062h = m96062h(layout, i11, i12, height);
        int lineCount = layout.getLineCount();
        for (int i13 = 0; i13 < lineCount; i13++) {
            m96055a(layout, m96062h, i13, path, height);
        }
        return path;
    }

    /* renamed from: h */
    private static final List m96062h(Layout layout, int i11, int i12, float f11) {
        float f12;
        float f13;
        ArrayList arrayList = new ArrayList();
        float height = layout.getHeight() / (layout.getLineCount() * 6.0f);
        int lineCount = layout.getLineCount();
        for (int i13 = 0; i13 < lineCount; i13++) {
            float lineLeft = layout.getLineLeft(i13);
            float lineRight = layout.getLineRight(i13);
            int lineTop = layout.getLineTop(i13);
            int lineBottom = layout.getLineBottom(i13);
            float f14 = lineRight - lineLeft;
            if (f14 == 0.0f) {
                f12 = i11 + lineLeft;
            } else {
                f12 = (lineLeft - height) + i11;
            }
            if (f14 == 0.0f) {
                f13 = lineLeft + i11;
            } else {
                f13 = lineRight + height + i11;
            }
            float f15 = lineTop;
            float f16 = i12;
            arrayList.add(new C18067b(f12, f13, f15 + f16, lineBottom + f16, f11));
        }
        AbstractC18068c.m96081i(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static final boolean m96063i(Layout layout, int i11) {
        if (i11 >= 0 && i11 < layout.getLineCount() && layout.getLineRight(i11) - layout.getLineLeft(i11) == 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static final boolean m96064j(Layout layout, int i11) {
        if (i11 >= 0 && i11 < layout.getLineCount() - 1) {
            int i12 = i11 + 1;
            if (layout.getLineRight(i12) - layout.getLineLeft(i12) == 0.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private static final boolean m96065k(Layout layout, int i11) {
        if (i11 > 0 && i11 < layout.getLineCount()) {
            int i12 = i11 - 1;
            if (layout.getLineRight(i12) - layout.getLineLeft(i12) == 0.0f) {
                return true;
            }
        }
        return false;
    }
}
