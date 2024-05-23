package com.zing.zalo.p077ui.imgdecor.caption.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;

@Deprecated
/* loaded from: classes5.dex */
public class BackgroundLineEditText extends AppCompatEditText {

    /* renamed from: C */
    public static float f63141C = AbstractC23222t7.f112558f;

    /* renamed from: D */
    public static float f63142D = AbstractC23222t7.f112572m;

    /* renamed from: A */
    int f63143A;

    /* renamed from: B */
    boolean f63144B;

    /* renamed from: s */
    int f63145s;

    /* renamed from: t */
    int f63146t;

    /* renamed from: u */
    Paint f63147u;

    /* renamed from: v */
    final ArrayList f63148v;

    /* renamed from: w */
    final ArrayList f63149w;

    /* renamed from: x */
    LinearGradient f63150x;

    /* renamed from: y */
    int f63151y;

    /* renamed from: z */
    int f63152z;

    public BackgroundLineEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63145s = AbstractC23222t7.f112552c;
        this.f63146t = AbstractC23222t7.f112562h;
        this.f63147u = new Paint();
        this.f63148v = new ArrayList();
        this.f63149w = new ArrayList();
        this.f63150x = null;
        this.f63151y = 0;
        this.f63152z = 0;
        this.f63143A = 0;
        this.f63144B = false;
        m67498h();
    }

    /* renamed from: j */
    private float m67496j(float f11) {
        float abs = Math.abs(f11);
        float f12 = f63141C;
        if (abs > f12) {
            return (f12 * f11) / Math.abs(f11);
        }
        return f11;
    }

    /* renamed from: k */
    private Path m67497k(RectF rectF, float f11, float f12, float f13, float f14) {
        String.format("roundedRect(%s, %s, %s, %s, %s)", rectF, Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13), Float.valueOf(f14));
        Path path = new Path();
        path.moveTo(rectF.right, rectF.top + Math.abs(f12));
        if (f12 > 0.0f) {
            float f15 = rectF.right;
            float f16 = f12 * 2.0f;
            float f17 = rectF.top;
            path.arcTo(new RectF(f15 - f16, f17, f15, f16 + f17), 0.0f, -90.0f, false);
        } else if (f12 < 0.0f) {
            float f18 = rectF.right;
            float f19 = rectF.top;
            float f21 = f12 * 2.0f;
            path.arcTo(new RectF(f18, f19, f18 - f21, f19 - f21), 180.0f, 90.0f, false);
        }
        path.lineTo(rectF.left + (Math.abs(f11) * 2.0f), rectF.top);
        if (f11 > 0.0f) {
            float f22 = rectF.left;
            float f23 = rectF.top;
            float f24 = f11 * 2.0f;
            path.arcTo(new RectF(f22, f23, f22 + f24, f24 + f23), 270.0f, -90.0f, false);
        } else if (f11 < 0.0f) {
            float f25 = rectF.left;
            float f26 = f11 * 2.0f;
            float f27 = rectF.top;
            path.arcTo(new RectF(f25 + f26, f27, f25, f27 - f26), 270.0f, 90.0f, false);
        }
        path.lineTo(rectF.left, rectF.bottom - (Math.abs(f13) * 2.0f));
        if (f13 > 0.0f) {
            float f28 = rectF.left;
            float f29 = rectF.bottom;
            float f31 = f13 * 2.0f;
            path.arcTo(new RectF(f28, f29 - f31, f31 + f28, f29), 180.0f, -90.0f, false);
        } else if (f13 < 0.0f) {
            float f32 = rectF.left;
            float f33 = f13 * 2.0f;
            float f34 = rectF.bottom;
            path.arcTo(new RectF(f32 + f33, f33 + f34, f32, f34), 0.0f, 90.0f, false);
        }
        path.lineTo(rectF.right - (Math.abs(f14) * 2.0f), rectF.bottom);
        if (f14 > 0.0f) {
            float f35 = rectF.right;
            float f36 = 2.0f * f14;
            float f37 = rectF.bottom;
            path.arcTo(new RectF(f35 - f36, f37 - f36, f35, f37), 90.0f, -90.0f, false);
        } else if (f14 < 0.0f) {
            float f38 = rectF.right;
            float f39 = rectF.bottom;
            float f41 = 2.0f * f14;
            path.arcTo(new RectF(f38, f39 + f41, f38 - f41, f39), 90.0f, 90.0f, false);
        }
        path.lineTo(rectF.right, rectF.top + Math.abs(f12));
        return path;
    }

    /* renamed from: h */
    void m67498h() {
        f63141C = f63142D;
        this.f63147u.setColor(0);
        this.f63147u.setDither(true);
        this.f63147u.setAntiAlias(true);
        this.f63147u.setStyle(Paint.Style.FILL_AND_STROKE);
        setLineSpacing(AbstractC23222t7.f112556e, 1.0f);
        setLayerType(1, null);
    }

    /* renamed from: i */
    boolean m67499i() {
        return f63141C != f63142D;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d3  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        boolean z11;
        float f11;
        float width;
        float f12;
        float f13;
        float width2;
        float f14;
        float f15;
        float width3;
        float f16;
        float f17;
        RectF rectF;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        float f18;
        int i13;
        int i14;
        int i15;
        this.f63148v.clear();
        this.f63149w.clear();
        Paint paint = this.f63147u;
        if (paint != null && (paint.getColor() != 0 || this.f63147u.getShader() != null)) {
            int lineCount = getLayout().getLineCount();
            RectF rectF2 = null;
            if (this.f63143A != lineCount && this.f63151y != 0 && this.f63152z != 0) {
                this.f63150x = null;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f63151y, this.f63152z, Shader.TileMode.CLAMP);
                this.f63150x = linearGradient;
                this.f63147u.setShader(linearGradient);
                this.f63143A = lineCount;
            }
            int paddingTop = getPaddingTop() - this.f63145s;
            if ((getGravity() & 7) == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i16 = 0;
            while (i16 < lineCount) {
                RectF rectF3 = new RectF(getLayout().getLineLeft(i16), getLayout().getLineTop(i16), getLayout().getLineRight(i16), getLayout().getLineBottom(i16));
                if (i16 != 0) {
                    rectF = (RectF) this.f63149w.get(i16 - 1);
                } else {
                    rectF = rectF2;
                }
                if (i16 != 0 && rectF != null && rectF.height() == 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (rectF3.width() != 0.0f && rectF3.height() != 0.0f && Math.abs(rectF3.right - rectF3.left) > 1.0f) {
                    if (!z11) {
                        if (i16 != 0 && rectF != null && Math.abs(rectF3.left - rectF.left) <= 20.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i16 != 0 && rectF != null && Math.abs(rectF.right - rectF3.right) <= 20.0f) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z13) {
                            float f19 = rectF3.left;
                            float f21 = rectF.left;
                            if (f19 < f21 && Math.abs(f19 - f21) > AbstractC23136l9.m118742r(1.0f)) {
                                rectF.set(rectF3.left, rectF.top, rectF.right, rectF.bottom);
                                float abs = Math.abs(rectF3.left - rectF.left);
                                rectF.set(rectF.left, rectF.top, rectF.right + abs, rectF.bottom);
                                rectF3.set(rectF3.left, rectF3.top, rectF3.right + abs, rectF3.bottom);
                            }
                        }
                        if (z14) {
                            float f22 = rectF.right;
                            float f23 = rectF3.right;
                            if (f22 < f23) {
                                rectF.set(rectF.left, rectF.top, f23, rectF.bottom);
                            }
                        }
                        if (!z13) {
                            f18 = rectF3.left;
                        } else {
                            f18 = rectF.left;
                        }
                        float f24 = rectF3.top;
                        if (i16 != 0) {
                            if (m67499i()) {
                                i15 = this.f63146t;
                            } else {
                                i15 = 0;
                            }
                            i13 = paddingTop - i15;
                        } else if (z12) {
                            i13 = -paddingTop;
                        } else {
                            i13 = 0;
                        }
                        float f25 = f24 + i13;
                        float f26 = rectF3.right;
                        float f27 = rectF3.bottom;
                        if (z12) {
                            i14 = 3;
                        } else {
                            i14 = 1;
                        }
                        rectF3.set(f18, f25, f26, f27 + (i14 * paddingTop));
                        int paddingLeft = getPaddingLeft();
                        if (z11) {
                            paddingLeft += AbstractC23136l9.m118742r(1.0f);
                        }
                        rectF3.offset(paddingLeft, z12 ? -paddingTop : paddingTop);
                        rectF3.inset(!z11 ? -getPaddingLeft() : (r2 - AbstractC23136l9.m118742r(1.0f)) / 2.0f, 0.0f);
                        if (rectF != null && Math.abs(rectF.left - rectF3.left) <= 20.0f) {
                            rectF3.set(rectF.left, rectF3.top, rectF3.right, rectF3.bottom);
                        }
                        if (rectF != null && Math.abs(rectF.right - rectF3.right) <= 20.0f) {
                            rectF3.set(rectF3.left, rectF3.top, rectF.right, rectF3.bottom);
                        }
                    } else {
                        float f28 = rectF3.left - this.f63145s;
                        float f29 = rectF3.top;
                        if (i16 != 0 && !z12) {
                            int paddingTop2 = getPaddingTop() - this.f63145s;
                            if (m67499i()) {
                                i12 = this.f63146t;
                            } else {
                                i12 = 0;
                            }
                            i11 = paddingTop2 - i12;
                        } else {
                            i11 = 0;
                        }
                        rectF3.set(f28, f29 + i11, rectF3.right + getPaddingRight(), (rectF3.bottom + getPaddingTop()) - this.f63145s);
                        rectF3.offset(getPaddingLeft() / 2.0f, getPaddingTop() - this.f63145s);
                        rectF3.inset((-getPaddingLeft()) / 4.0f, 0.0f);
                    }
                    if (rectF != null && !z12 && this.f63144B) {
                        float f31 = rectF.bottom;
                        float f32 = rectF3.top;
                        if (f31 > f32) {
                            float f33 = (f31 - f32) / 2.0f;
                            rectF.set(rectF.left, rectF.top, rectF.right, f31 - f33);
                            rectF3.set(rectF3.left, rectF3.top + f33, rectF3.right, rectF3.bottom);
                        }
                    }
                } else {
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f63149w.add(rectF3);
                i16++;
                rectF2 = null;
            }
            for (int i17 = 0; i17 < this.f63149w.size(); i17++) {
                if (i17 != 0 && ((RectF) this.f63149w.get(i17)).width() != 0.0f) {
                    int i18 = i17 - 1;
                    if (((RectF) this.f63149w.get(i18)).width() != 0.0f) {
                        if (((RectF) this.f63149w.get(i18)).width() == 0.0f) {
                            f12 = ((RectF) this.f63149w.get(i17)).left;
                            float m67496j = m67496j(f12);
                            if (i17 != 0 || ((RectF) this.f63149w.get(i17)).width() == 0.0f) {
                                f13 = 2.0f;
                                width2 = ((RectF) this.f63149w.get(i17)).width();
                            } else {
                                int i19 = i17 - 1;
                                if (((RectF) this.f63149w.get(i19)).width() == 0.0f) {
                                    f14 = ((RectF) this.f63149w.get(i17)).right;
                                    float m67496j2 = m67496j(f14);
                                    if (i17 != this.f63149w.size() - 1) {
                                        int i21 = i17 + 1;
                                        if (((RectF) this.f63149w.get(i21)).width() != 0.0f) {
                                            if (((RectF) this.f63149w.get(i21)).width() == 0.0f) {
                                                f16 = ((RectF) this.f63149w.get(i17)).left;
                                                f15 = 2.0f;
                                                float m67496j3 = m67496j(f16);
                                                if (i17 != this.f63149w.size() - 1) {
                                                    f17 = ((RectF) this.f63149w.get(i17)).width() / f15;
                                                } else {
                                                    int i22 = i17 + 1;
                                                    if (((RectF) this.f63149w.get(i22)).width() == 0.0f) {
                                                        f17 = ((RectF) this.f63149w.get(i17)).right;
                                                    } else {
                                                        f17 = (((RectF) this.f63149w.get(i17)).right - ((RectF) this.f63149w.get(i22)).right) / 2.0f;
                                                        this.f63148v.add(m67497k((RectF) this.f63149w.get(i17), m67496j, m67496j2, m67496j3, m67496j(f17)));
                                                    }
                                                }
                                                this.f63148v.add(m67497k((RectF) this.f63149w.get(i17), m67496j, m67496j2, m67496j3, m67496j(f17)));
                                            } else {
                                                width3 = ((RectF) this.f63149w.get(i21)).left - ((RectF) this.f63149w.get(i17)).left;
                                                f15 = 2.0f;
                                                f16 = width3 / f15;
                                                float m67496j32 = m67496j(f16);
                                                if (i17 != this.f63149w.size() - 1) {
                                                }
                                                this.f63148v.add(m67497k((RectF) this.f63149w.get(i17), m67496j, m67496j2, m67496j32, m67496j(f17)));
                                            }
                                        }
                                    }
                                    f15 = 2.0f;
                                    width3 = ((RectF) this.f63149w.get(i17)).width();
                                    f16 = width3 / f15;
                                    float m67496j322 = m67496j(f16);
                                    if (i17 != this.f63149w.size() - 1) {
                                    }
                                    this.f63148v.add(m67497k((RectF) this.f63149w.get(i17), m67496j, m67496j2, m67496j322, m67496j(f17)));
                                } else {
                                    width2 = ((RectF) this.f63149w.get(i17)).right - ((RectF) this.f63149w.get(i19)).right;
                                    f13 = 2.0f;
                                }
                            }
                            f14 = width2 / f13;
                            float m67496j22 = m67496j(f14);
                            if (i17 != this.f63149w.size() - 1) {
                            }
                            f15 = 2.0f;
                            width3 = ((RectF) this.f63149w.get(i17)).width();
                            f16 = width3 / f15;
                            float m67496j3222 = m67496j(f16);
                            if (i17 != this.f63149w.size() - 1) {
                            }
                            this.f63148v.add(m67497k((RectF) this.f63149w.get(i17), m67496j, m67496j22, m67496j3222, m67496j(f17)));
                        } else {
                            width = ((RectF) this.f63149w.get(i18)).left - ((RectF) this.f63149w.get(i17)).left;
                            f11 = 2.0f;
                            f12 = width / f11;
                            float m67496j4 = m67496j(f12);
                            if (i17 != 0) {
                            }
                            f13 = 2.0f;
                            width2 = ((RectF) this.f63149w.get(i17)).width();
                            f14 = width2 / f13;
                            float m67496j222 = m67496j(f14);
                            if (i17 != this.f63149w.size() - 1) {
                            }
                            f15 = 2.0f;
                            width3 = ((RectF) this.f63149w.get(i17)).width();
                            f16 = width3 / f15;
                            float m67496j32222 = m67496j(f16);
                            if (i17 != this.f63149w.size() - 1) {
                            }
                            this.f63148v.add(m67497k((RectF) this.f63149w.get(i17), m67496j4, m67496j222, m67496j32222, m67496j(f17)));
                        }
                    }
                }
                f11 = 2.0f;
                width = ((RectF) this.f63149w.get(i17)).width();
                f12 = width / f11;
                float m67496j42 = m67496j(f12);
                if (i17 != 0) {
                }
                f13 = 2.0f;
                width2 = ((RectF) this.f63149w.get(i17)).width();
                f14 = width2 / f13;
                float m67496j2222 = m67496j(f14);
                if (i17 != this.f63149w.size() - 1) {
                }
                f15 = 2.0f;
                width3 = ((RectF) this.f63149w.get(i17)).width();
                f16 = width3 / f15;
                float m67496j322222 = m67496j(f16);
                if (i17 != this.f63149w.size() - 1) {
                }
                this.f63148v.add(m67497k((RectF) this.f63149w.get(i17), m67496j42, m67496j2222, m67496j322222, m67496j(f17)));
            }
            Iterator it = this.f63148v.iterator();
            while (it.hasNext()) {
                Path path = (Path) it.next();
                canvas.save();
                canvas.drawPath(path, this.f63147u);
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: r */
    public void m67500r(int i11, boolean z11) {
        float f11;
        int i12;
        Paint paint = this.f63147u;
        if (paint != null) {
            paint.setShader(null);
            this.f63151y = 0;
            this.f63152z = 0;
            this.f63147u.setColor(i11);
            if (i11 != 0) {
                Paint paint2 = this.f63147u;
                if (this.f63144B) {
                    i12 = 127;
                } else {
                    i12 = 255;
                }
                paint2.setAlpha(i12);
            }
            if (z11) {
                f11 = f63142D;
            } else {
                f11 = 0.0f;
            }
            f63141C = f11;
            invalidate();
        }
    }

    public void setBackgroundLineColor(int i11) {
        m67500r(i11, false);
    }

    public void setLightMode(boolean z11) {
        this.f63144B = z11;
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (typeface != null) {
            super.setTypeface(typeface);
            invalidate();
        }
    }

    public BackgroundLineEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f63145s = AbstractC23222t7.f112552c;
        this.f63146t = AbstractC23222t7.f112562h;
        this.f63147u = new Paint();
        this.f63148v = new ArrayList();
        this.f63149w = new ArrayList();
        this.f63150x = null;
        this.f63151y = 0;
        this.f63152z = 0;
        this.f63143A = 0;
        this.f63144B = false;
        m67498h();
    }
}
