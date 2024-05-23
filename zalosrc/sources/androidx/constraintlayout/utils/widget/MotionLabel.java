package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.AbstractC1261a;
import androidx.constraintlayout.motion.widget.InterfaceC1263c;
import androidx.constraintlayout.widget.AbstractC1298f;
import p175g0.AbstractC19178a;

/* loaded from: classes2.dex */
public class MotionLabel extends View implements InterfaceC1263c {

    /* renamed from: A */
    private int f5395A;

    /* renamed from: B */
    private int f5396B;

    /* renamed from: C */
    private float f5397C;

    /* renamed from: D */
    private String f5398D;

    /* renamed from: E */
    boolean f5399E;

    /* renamed from: F */
    private Rect f5400F;

    /* renamed from: G */
    private int f5401G;

    /* renamed from: H */
    private int f5402H;

    /* renamed from: I */
    private int f5403I;

    /* renamed from: J */
    private int f5404J;

    /* renamed from: K */
    private String f5405K;

    /* renamed from: L */
    private Layout f5406L;

    /* renamed from: M */
    private int f5407M;

    /* renamed from: N */
    private int f5408N;

    /* renamed from: O */
    private boolean f5409O;

    /* renamed from: P */
    private float f5410P;

    /* renamed from: Q */
    private float f5411Q;

    /* renamed from: R */
    private float f5412R;

    /* renamed from: S */
    private Drawable f5413S;

    /* renamed from: T */
    Matrix f5414T;

    /* renamed from: U */
    private Bitmap f5415U;

    /* renamed from: V */
    private BitmapShader f5416V;

    /* renamed from: W */
    private Matrix f5417W;

    /* renamed from: a0 */
    private float f5418a0;

    /* renamed from: b0 */
    private float f5419b0;

    /* renamed from: c0 */
    private float f5420c0;

    /* renamed from: d0 */
    private float f5421d0;

    /* renamed from: e0 */
    Paint f5422e0;

    /* renamed from: f0 */
    private int f5423f0;

    /* renamed from: g0 */
    Rect f5424g0;

    /* renamed from: h0 */
    Paint f5425h0;

    /* renamed from: i0 */
    float f5426i0;

    /* renamed from: j0 */
    float f5427j0;

    /* renamed from: k0 */
    float f5428k0;

    /* renamed from: l0 */
    float f5429l0;

    /* renamed from: m0 */
    float f5430m0;

    /* renamed from: p */
    TextPaint f5431p;

    /* renamed from: q */
    Path f5432q;

    /* renamed from: r */
    private int f5433r;

    /* renamed from: s */
    private int f5434s;

    /* renamed from: t */
    private boolean f5435t;

    /* renamed from: u */
    private float f5436u;

    /* renamed from: v */
    private float f5437v;

    /* renamed from: w */
    ViewOutlineProvider f5438w;

    /* renamed from: x */
    RectF f5439x;

    /* renamed from: y */
    private float f5440y;

    /* renamed from: z */
    private float f5441z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    /* loaded from: classes2.dex */
    public class C1288a extends ViewOutlineProvider {
        C1288a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.f5436u) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    /* loaded from: classes2.dex */
    public class C1289b extends ViewOutlineProvider {
        C1289b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f5437v);
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5431p = new TextPaint();
        this.f5432q = new Path();
        this.f5433r = 65535;
        this.f5434s = 65535;
        this.f5435t = false;
        this.f5436u = 0.0f;
        this.f5437v = Float.NaN;
        this.f5440y = 48.0f;
        this.f5441z = Float.NaN;
        this.f5397C = 0.0f;
        this.f5398D = "Hello World";
        this.f5399E = true;
        this.f5400F = new Rect();
        this.f5401G = 1;
        this.f5402H = 1;
        this.f5403I = 1;
        this.f5404J = 1;
        this.f5407M = 8388659;
        this.f5408N = 0;
        this.f5409O = false;
        this.f5418a0 = Float.NaN;
        this.f5419b0 = Float.NaN;
        this.f5420c0 = 0.0f;
        this.f5421d0 = 0.0f;
        this.f5422e0 = new Paint();
        this.f5423f0 = 0;
        this.f5427j0 = Float.NaN;
        this.f5428k0 = Float.NaN;
        this.f5429l0 = Float.NaN;
        this.f5430m0 = Float.NaN;
        m6347g(context, attributeSet);
    }

    /* renamed from: d */
    private void m6346d(float f11, float f12, float f13, float f14) {
        if (this.f5417W == null) {
            return;
        }
        this.f5411Q = f13 - f11;
        this.f5412R = f14 - f12;
        m6351l();
    }

    /* renamed from: g */
    private void m6347g(Context context, AttributeSet attributeSet) {
        m6349i(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == AbstractC1298f.MotionLabel_android_fontFamily) {
                    this.f5405K = obtainStyledAttributes.getString(index);
                } else if (index == AbstractC1298f.MotionLabel_scaleFromTextSize) {
                    this.f5441z = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f5441z);
                } else if (index == AbstractC1298f.MotionLabel_android_textSize) {
                    this.f5440y = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f5440y);
                } else if (index == AbstractC1298f.MotionLabel_android_textStyle) {
                    this.f5395A = obtainStyledAttributes.getInt(index, this.f5395A);
                } else if (index == AbstractC1298f.MotionLabel_android_typeface) {
                    this.f5396B = obtainStyledAttributes.getInt(index, this.f5396B);
                } else if (index == AbstractC1298f.MotionLabel_android_textColor) {
                    this.f5433r = obtainStyledAttributes.getColor(index, this.f5433r);
                } else if (index == AbstractC1298f.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f5437v);
                    this.f5437v = dimension;
                    setRound(dimension);
                } else if (index == AbstractC1298f.MotionLabel_borderRoundPercent) {
                    float f11 = obtainStyledAttributes.getFloat(index, this.f5436u);
                    this.f5436u = f11;
                    setRoundPercent(f11);
                } else if (index == AbstractC1298f.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == AbstractC1298f.MotionLabel_android_autoSizeTextType) {
                    this.f5408N = obtainStyledAttributes.getInt(index, 0);
                } else if (index == AbstractC1298f.MotionLabel_textOutlineColor) {
                    this.f5434s = obtainStyledAttributes.getInt(index, this.f5434s);
                    this.f5435t = true;
                } else if (index == AbstractC1298f.MotionLabel_textOutlineThickness) {
                    this.f5397C = obtainStyledAttributes.getDimension(index, this.f5397C);
                    this.f5435t = true;
                } else if (index == AbstractC1298f.MotionLabel_textBackground) {
                    this.f5413S = obtainStyledAttributes.getDrawable(index);
                    this.f5435t = true;
                } else if (index == AbstractC1298f.MotionLabel_textBackgroundPanX) {
                    this.f5427j0 = obtainStyledAttributes.getFloat(index, this.f5427j0);
                } else if (index == AbstractC1298f.MotionLabel_textBackgroundPanY) {
                    this.f5428k0 = obtainStyledAttributes.getFloat(index, this.f5428k0);
                } else if (index == AbstractC1298f.MotionLabel_textPanX) {
                    this.f5420c0 = obtainStyledAttributes.getFloat(index, this.f5420c0);
                } else if (index == AbstractC1298f.MotionLabel_textPanY) {
                    this.f5421d0 = obtainStyledAttributes.getFloat(index, this.f5421d0);
                } else if (index == AbstractC1298f.MotionLabel_textBackgroundRotate) {
                    this.f5430m0 = obtainStyledAttributes.getFloat(index, this.f5430m0);
                } else if (index == AbstractC1298f.MotionLabel_textBackgroundZoom) {
                    this.f5429l0 = obtainStyledAttributes.getFloat(index, this.f5429l0);
                } else if (index == AbstractC1298f.MotionLabel_textureHeight) {
                    this.f5418a0 = obtainStyledAttributes.getDimension(index, this.f5418a0);
                } else if (index == AbstractC1298f.MotionLabel_textureWidth) {
                    this.f5419b0 = obtainStyledAttributes.getDimension(index, this.f5419b0);
                } else if (index == AbstractC1298f.MotionLabel_textureEffect) {
                    this.f5423f0 = obtainStyledAttributes.getInt(index, this.f5423f0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        m6350k();
        m6354j();
    }

    private float getHorizontalOffset() {
        float f11;
        float f12;
        if (Float.isNaN(this.f5441z)) {
            f11 = 1.0f;
        } else {
            f11 = this.f5440y / this.f5441z;
        }
        TextPaint textPaint = this.f5431p;
        String str = this.f5398D;
        float measureText = f11 * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.f5411Q)) {
            f12 = getMeasuredWidth();
        } else {
            f12 = this.f5411Q;
        }
        return ((((f12 - getPaddingLeft()) - getPaddingRight()) - measureText) * (this.f5420c0 + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f11;
        float f12;
        if (Float.isNaN(this.f5441z)) {
            f11 = 1.0f;
        } else {
            f11 = this.f5440y / this.f5441z;
        }
        Paint.FontMetrics fontMetrics = this.f5431p.getFontMetrics();
        if (Float.isNaN(this.f5412R)) {
            f12 = getMeasuredHeight();
        } else {
            f12 = this.f5412R;
        }
        float paddingTop = (f12 - getPaddingTop()) - getPaddingBottom();
        float f13 = fontMetrics.descent;
        float f14 = fontMetrics.ascent;
        return (((paddingTop - ((f13 - f14) * f11)) * (1.0f - this.f5421d0)) / 2.0f) - (f11 * f14);
    }

    /* renamed from: h */
    private void m6348h(String str, int i11, int i12) {
        Typeface typeface;
        Typeface create;
        int i13;
        if (str != null) {
            typeface = Typeface.create(str, i12);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f11 = 0.0f;
        if (i12 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i12);
            } else {
                create = Typeface.create(typeface, i12);
            }
            setTypeface(create);
            if (create != null) {
                i13 = create.getStyle();
            } else {
                i13 = 0;
            }
            int i14 = (~i13) & i12;
            TextPaint textPaint = this.f5431p;
            if ((i14 & 1) == 0) {
                z11 = false;
            }
            textPaint.setFakeBoldText(z11);
            TextPaint textPaint2 = this.f5431p;
            if ((i14 & 2) != 0) {
                f11 = -0.25f;
            }
            textPaint2.setTextSkewX(f11);
            return;
        }
        this.f5431p.setFakeBoldText(false);
        this.f5431p.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    /* renamed from: i */
    private void m6349i(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC19178a.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f5431p;
        int i11 = typedValue.data;
        this.f5433r = i11;
        textPaint.setColor(i11);
    }

    /* renamed from: k */
    private void m6350k() {
        if (this.f5413S != null) {
            this.f5417W = new Matrix();
            int intrinsicWidth = this.f5413S.getIntrinsicWidth();
            int intrinsicHeight = this.f5413S.getIntrinsicHeight();
            int i11 = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.f5419b0)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.f5419b0;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f5418a0)) {
                    i11 = (int) this.f5418a0;
                }
                intrinsicHeight = i11;
            }
            if (this.f5423f0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f5415U = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f5415U);
            this.f5413S.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f5413S.setFilterBitmap(true);
            this.f5413S.draw(canvas);
            if (this.f5423f0 != 0) {
                this.f5415U = m6352e(this.f5415U, 4);
            }
            Bitmap bitmap = this.f5415U;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f5416V = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: l */
    private void m6351l() {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17 = 0.0f;
        if (Float.isNaN(this.f5427j0)) {
            f11 = 0.0f;
        } else {
            f11 = this.f5427j0;
        }
        if (Float.isNaN(this.f5428k0)) {
            f12 = 0.0f;
        } else {
            f12 = this.f5428k0;
        }
        if (Float.isNaN(this.f5429l0)) {
            f13 = 1.0f;
        } else {
            f13 = this.f5429l0;
        }
        if (!Float.isNaN(this.f5430m0)) {
            f17 = this.f5430m0;
        }
        this.f5417W.reset();
        float width = this.f5415U.getWidth();
        float height = this.f5415U.getHeight();
        if (Float.isNaN(this.f5419b0)) {
            f14 = this.f5411Q;
        } else {
            f14 = this.f5419b0;
        }
        if (Float.isNaN(this.f5418a0)) {
            f15 = this.f5412R;
        } else {
            f15 = this.f5418a0;
        }
        if (width * f15 < height * f14) {
            f16 = f14 / width;
        } else {
            f16 = f15 / height;
        }
        float f18 = f13 * f16;
        this.f5417W.postScale(f18, f18);
        float f19 = width * f18;
        float f21 = f14 - f19;
        float f22 = f18 * height;
        float f23 = f15 - f22;
        if (!Float.isNaN(this.f5418a0)) {
            f23 = this.f5418a0 / 2.0f;
        }
        if (!Float.isNaN(this.f5419b0)) {
            f21 = this.f5419b0 / 2.0f;
        }
        this.f5417W.postTranslate((((f11 * f21) + f14) - f19) * 0.5f, (((f12 * f23) + f15) - f22) * 0.5f);
        this.f5417W.postRotate(f17, f14 / 2.0f, f15 / 2.0f);
        this.f5416V.setLocalMatrix(this.f5417W);
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC1263c
    /* renamed from: a */
    public void mo6063a(float f11, float f12, float f13, float f14) {
        float f15;
        int i11 = (int) (f11 + 0.5f);
        this.f5410P = f11 - i11;
        int i12 = (int) (f13 + 0.5f);
        int i13 = i12 - i11;
        int i14 = (int) (f14 + 0.5f);
        int i15 = (int) (0.5f + f12);
        int i16 = i14 - i15;
        float f16 = f13 - f11;
        this.f5411Q = f16;
        float f17 = f14 - f12;
        this.f5412R = f17;
        m6346d(f11, f12, f13, f14);
        if (getMeasuredHeight() == i16 && getMeasuredWidth() == i13) {
            super.layout(i11, i15, i12, i14);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
            super.layout(i11, i15, i12, i14);
        }
        if (this.f5409O) {
            if (this.f5424g0 == null) {
                this.f5425h0 = new Paint();
                this.f5424g0 = new Rect();
                this.f5425h0.set(this.f5431p);
                this.f5426i0 = this.f5425h0.getTextSize();
            }
            this.f5411Q = f16;
            this.f5412R = f17;
            Paint paint = this.f5425h0;
            String str = this.f5398D;
            paint.getTextBounds(str, 0, str.length(), this.f5424g0);
            float height = this.f5424g0.height() * 1.3f;
            float f18 = (f16 - this.f5402H) - this.f5401G;
            float f19 = (f17 - this.f5404J) - this.f5403I;
            float width = this.f5424g0.width();
            if (width * f19 > height * f18) {
                this.f5431p.setTextSize((this.f5426i0 * f18) / width);
            } else {
                this.f5431p.setTextSize((this.f5426i0 * f19) / height);
            }
            if (this.f5435t || !Float.isNaN(this.f5441z)) {
                if (Float.isNaN(this.f5441z)) {
                    f15 = 1.0f;
                } else {
                    f15 = this.f5440y / this.f5441z;
                }
                m6353f(f15);
            }
        }
    }

    /* renamed from: e */
    Bitmap m6352e(Bitmap bitmap, int i11) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i12 = 0; i12 < i11 && width >= 32 && height >= 32; i12++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    /* renamed from: f */
    void m6353f(float f11) {
        if (!this.f5435t && f11 == 1.0f) {
            return;
        }
        this.f5432q.reset();
        String str = this.f5398D;
        int length = str.length();
        this.f5431p.getTextBounds(str, 0, length, this.f5400F);
        this.f5431p.getTextPath(str, 0, length, 0.0f, 0.0f, this.f5432q);
        if (f11 != 1.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC1261a.m6057a());
            sb2.append(" scale ");
            sb2.append(f11);
            Matrix matrix = new Matrix();
            matrix.postScale(f11, f11);
            this.f5432q.transform(matrix);
        }
        Rect rect = this.f5400F;
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.f5399E = false;
    }

    public float getRound() {
        return this.f5437v;
    }

    public float getRoundPercent() {
        return this.f5436u;
    }

    public float getScaleFromTextSize() {
        return this.f5441z;
    }

    public float getTextBackgroundPanX() {
        return this.f5427j0;
    }

    public float getTextBackgroundPanY() {
        return this.f5428k0;
    }

    public float getTextBackgroundRotate() {
        return this.f5430m0;
    }

    public float getTextBackgroundZoom() {
        return this.f5429l0;
    }

    public int getTextOutlineColor() {
        return this.f5434s;
    }

    public float getTextPanX() {
        return this.f5420c0;
    }

    public float getTextPanY() {
        return this.f5421d0;
    }

    public float getTextureHeight() {
        return this.f5418a0;
    }

    public float getTextureWidth() {
        return this.f5419b0;
    }

    public Typeface getTypeface() {
        return this.f5431p.getTypeface();
    }

    /* renamed from: j */
    void m6354j() {
        this.f5401G = getPaddingLeft();
        this.f5402H = getPaddingRight();
        this.f5403I = getPaddingTop();
        this.f5404J = getPaddingBottom();
        m6348h(this.f5405K, this.f5396B, this.f5395A);
        this.f5431p.setColor(this.f5433r);
        this.f5431p.setStrokeWidth(this.f5397C);
        this.f5431p.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5431p.setFlags(128);
        setTextSize(this.f5440y);
        this.f5431p.setAntiAlias(true);
    }

    @Override // android.view.View
    public void layout(int i11, int i12, int i13, int i14) {
        float f11;
        super.layout(i11, i12, i13, i14);
        boolean isNaN = Float.isNaN(this.f5441z);
        if (isNaN) {
            f11 = 1.0f;
        } else {
            f11 = this.f5440y / this.f5441z;
        }
        this.f5411Q = i13 - i11;
        this.f5412R = i14 - i12;
        if (this.f5409O) {
            if (this.f5424g0 == null) {
                this.f5425h0 = new Paint();
                this.f5424g0 = new Rect();
                this.f5425h0.set(this.f5431p);
                this.f5426i0 = this.f5425h0.getTextSize();
            }
            Paint paint = this.f5425h0;
            String str = this.f5398D;
            paint.getTextBounds(str, 0, str.length(), this.f5424g0);
            int width = this.f5424g0.width();
            int height = (int) (this.f5424g0.height() * 1.3f);
            float f12 = (this.f5411Q - this.f5402H) - this.f5401G;
            float f13 = (this.f5412R - this.f5404J) - this.f5403I;
            if (isNaN) {
                float f14 = width;
                float f15 = height;
                if (f14 * f13 > f15 * f12) {
                    this.f5431p.setTextSize((this.f5426i0 * f12) / f14);
                } else {
                    this.f5431p.setTextSize((this.f5426i0 * f13) / f15);
                }
            } else {
                float f16 = width;
                float f17 = height;
                if (f16 * f13 > f17 * f12) {
                    f11 = f12 / f16;
                } else {
                    f11 = f13 / f17;
                }
            }
        }
        if (this.f5435t || !isNaN) {
            m6346d(i11, i12, i13, i14);
            m6353f(f11);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f11;
        if (Float.isNaN(this.f5441z)) {
            f11 = 1.0f;
        } else {
            f11 = this.f5440y / this.f5441z;
        }
        super.onDraw(canvas);
        if (!this.f5435t && f11 == 1.0f) {
            canvas.drawText(this.f5398D, this.f5410P + this.f5401G + getHorizontalOffset(), this.f5403I + getVerticalOffset(), this.f5431p);
            return;
        }
        if (this.f5399E) {
            m6353f(f11);
        }
        if (this.f5414T == null) {
            this.f5414T = new Matrix();
        }
        if (this.f5435t) {
            this.f5422e0.set(this.f5431p);
            this.f5414T.reset();
            float horizontalOffset = this.f5401G + getHorizontalOffset();
            float verticalOffset = this.f5403I + getVerticalOffset();
            this.f5414T.postTranslate(horizontalOffset, verticalOffset);
            this.f5414T.preScale(f11, f11);
            this.f5432q.transform(this.f5414T);
            if (this.f5416V != null) {
                this.f5431p.setFilterBitmap(true);
                this.f5431p.setShader(this.f5416V);
            } else {
                this.f5431p.setColor(this.f5433r);
            }
            this.f5431p.setStyle(Paint.Style.FILL);
            this.f5431p.setStrokeWidth(this.f5397C);
            canvas.drawPath(this.f5432q, this.f5431p);
            if (this.f5416V != null) {
                this.f5431p.setShader(null);
            }
            this.f5431p.setColor(this.f5434s);
            this.f5431p.setStyle(Paint.Style.STROKE);
            this.f5431p.setStrokeWidth(this.f5397C);
            canvas.drawPath(this.f5432q, this.f5431p);
            this.f5414T.reset();
            this.f5414T.postTranslate(-horizontalOffset, -verticalOffset);
            this.f5432q.transform(this.f5414T);
            this.f5431p.set(this.f5422e0);
            return;
        }
        float horizontalOffset2 = this.f5401G + getHorizontalOffset();
        float verticalOffset2 = this.f5403I + getVerticalOffset();
        this.f5414T.reset();
        this.f5414T.preTranslate(horizontalOffset2, verticalOffset2);
        this.f5432q.transform(this.f5414T);
        this.f5431p.setColor(this.f5433r);
        this.f5431p.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5431p.setStrokeWidth(this.f5397C);
        canvas.drawPath(this.f5432q, this.f5431p);
        this.f5414T.reset();
        this.f5414T.preTranslate(-horizontalOffset2, -verticalOffset2);
        this.f5432q.transform(this.f5414T);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        this.f5409O = false;
        this.f5401G = getPaddingLeft();
        this.f5402H = getPaddingRight();
        this.f5403I = getPaddingTop();
        this.f5404J = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.f5408N != 0) {
                this.f5409O = true;
            }
        } else {
            TextPaint textPaint = this.f5431p;
            String str = this.f5398D;
            textPaint.getTextBounds(str, 0, str.length(), this.f5400F);
            if (mode != 1073741824) {
                size = (int) (this.f5400F.width() + 0.99999f);
            }
            size += this.f5401G + this.f5402H;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f5431p.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f5403I + this.f5404J + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i11) {
        if ((i11 & 8388615) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        if (i11 != this.f5407M) {
            invalidate();
        }
        this.f5407M = i11;
        int i12 = i11 & 112;
        if (i12 != 48) {
            if (i12 != 80) {
                this.f5421d0 = 0.0f;
            } else {
                this.f5421d0 = 1.0f;
            }
        } else {
            this.f5421d0 = -1.0f;
        }
        int i13 = i11 & 8388615;
        if (i13 != 3) {
            if (i13 != 5) {
                if (i13 != 8388611) {
                    if (i13 != 8388613) {
                        this.f5420c0 = 0.0f;
                        return;
                    }
                }
            }
            this.f5420c0 = 1.0f;
            return;
        }
        this.f5420c0 = -1.0f;
    }

    public void setRound(float f11) {
        boolean z11;
        if (Float.isNaN(f11)) {
            this.f5437v = f11;
            float f12 = this.f5436u;
            this.f5436u = -1.0f;
            setRoundPercent(f12);
            return;
        }
        if (this.f5437v != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5437v = f11;
        if (f11 != 0.0f) {
            if (this.f5432q == null) {
                this.f5432q = new Path();
            }
            if (this.f5439x == null) {
                this.f5439x = new RectF();
            }
            if (this.f5438w == null) {
                C1289b c1289b = new C1289b();
                this.f5438w = c1289b;
                setOutlineProvider(c1289b);
            }
            setClipToOutline(true);
            this.f5439x.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f5432q.reset();
            Path path = this.f5432q;
            RectF rectF = this.f5439x;
            float f13 = this.f5437v;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f11) {
        boolean z11;
        if (this.f5436u != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5436u = f11;
        if (f11 != 0.0f) {
            if (this.f5432q == null) {
                this.f5432q = new Path();
            }
            if (this.f5439x == null) {
                this.f5439x = new RectF();
            }
            if (this.f5438w == null) {
                C1288a c1288a = new C1288a();
                this.f5438w = c1288a;
                setOutlineProvider(c1288a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f5436u) / 2.0f;
            this.f5439x.set(0.0f, 0.0f, width, height);
            this.f5432q.reset();
            this.f5432q.addRoundRect(this.f5439x, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f11) {
        this.f5441z = f11;
    }

    public void setText(CharSequence charSequence) {
        this.f5398D = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f11) {
        this.f5427j0 = f11;
        m6351l();
        invalidate();
    }

    public void setTextBackgroundPanY(float f11) {
        this.f5428k0 = f11;
        m6351l();
        invalidate();
    }

    public void setTextBackgroundRotate(float f11) {
        this.f5430m0 = f11;
        m6351l();
        invalidate();
    }

    public void setTextBackgroundZoom(float f11) {
        this.f5429l0 = f11;
        m6351l();
        invalidate();
    }

    public void setTextFillColor(int i11) {
        this.f5433r = i11;
        invalidate();
    }

    public void setTextOutlineColor(int i11) {
        this.f5434s = i11;
        this.f5435t = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f11) {
        this.f5397C = f11;
        this.f5435t = true;
        if (Float.isNaN(f11)) {
            this.f5397C = 1.0f;
            this.f5435t = false;
        }
        invalidate();
    }

    public void setTextPanX(float f11) {
        this.f5420c0 = f11;
        invalidate();
    }

    public void setTextPanY(float f11) {
        this.f5421d0 = f11;
        invalidate();
    }

    public void setTextSize(float f11) {
        float f12;
        this.f5440y = f11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC1261a.m6057a());
        sb2.append("  ");
        sb2.append(f11);
        sb2.append(" / ");
        sb2.append(this.f5441z);
        TextPaint textPaint = this.f5431p;
        if (!Float.isNaN(this.f5441z)) {
            f11 = this.f5441z;
        }
        textPaint.setTextSize(f11);
        if (Float.isNaN(this.f5441z)) {
            f12 = 1.0f;
        } else {
            f12 = this.f5440y / this.f5441z;
        }
        m6353f(f12);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f11) {
        this.f5418a0 = f11;
        m6351l();
        invalidate();
    }

    public void setTextureWidth(float f11) {
        this.f5419b0 = f11;
        m6351l();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f5431p.getTypeface() != typeface) {
            this.f5431p.setTypeface(typeface);
            if (this.f5406L != null) {
                this.f5406L = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5431p = new TextPaint();
        this.f5432q = new Path();
        this.f5433r = 65535;
        this.f5434s = 65535;
        this.f5435t = false;
        this.f5436u = 0.0f;
        this.f5437v = Float.NaN;
        this.f5440y = 48.0f;
        this.f5441z = Float.NaN;
        this.f5397C = 0.0f;
        this.f5398D = "Hello World";
        this.f5399E = true;
        this.f5400F = new Rect();
        this.f5401G = 1;
        this.f5402H = 1;
        this.f5403I = 1;
        this.f5404J = 1;
        this.f5407M = 8388659;
        this.f5408N = 0;
        this.f5409O = false;
        this.f5418a0 = Float.NaN;
        this.f5419b0 = Float.NaN;
        this.f5420c0 = 0.0f;
        this.f5421d0 = 0.0f;
        this.f5422e0 = new Paint();
        this.f5423f0 = 0;
        this.f5427j0 = Float.NaN;
        this.f5428k0 = Float.NaN;
        this.f5429l0 = Float.NaN;
        this.f5430m0 = Float.NaN;
        m6347g(context, attributeSet);
    }
}
