package bf;

import af.C0768a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.ImageView;
import bf.AbstractC2790b;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lt.AbstractC22647c;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import org.json.JSONObject;

/* renamed from: bf.a */
/* loaded from: classes3.dex */
public class C2789a extends AbstractC2790b {

    /* renamed from: s */
    private final int f11102s;

    /* renamed from: t */
    private final int f11103t;

    /* renamed from: u */
    private final int f11104u;

    /* renamed from: v */
    private Bitmap f11105v;

    /* renamed from: w */
    private final Object f11106w;

    public C2789a(JSONObject jSONObject) {
        super(jSONObject);
        this.f11106w = new Object();
        this.f11102s = AbstractC23136l9.m118742r(5.0f);
        this.f11103t = AbstractC23136l9.m118742r(12.0f);
        this.f11104u = (AbstractC23136l9.m118722k0() * 2) / 16;
    }

    /* renamed from: m */
    private void m13431m(Bitmap bitmap, ImageView imageView, int i11, int i12) {
        if (this.f11110b != 1 || bitmap == null) {
            return;
        }
        try {
            AbstractC2790b.b m13439r = m13439r(false);
            m13439r.f11127c = 50.0f;
            AbstractC2790b.m13440a(bitmap, m13439r, i11 / AbstractC23136l9.m118722k0(), imageView, i11, i12);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    private Bitmap m13432n(Bitmap bitmap, int i11) {
        try {
            int i12 = (i11 * 9) / 10;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            TextPaint textPaint = new TextPaint();
            Typeface typeface = Typeface.DEFAULT;
            textPaint.setTypeface(typeface);
            textPaint.setColor(-1);
            textPaint.setAntiAlias(true);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTypeface(typeface);
            textPaint2.setColor(-1);
            textPaint2.setAntiAlias(true);
            String str = this.f11118j;
            int i13 = this.f11117i;
            if ((i13 > 4 && i13 < 9) || i13 == 17) {
                str = new SimpleDateFormat("hh:mma MMM dd, yyyy", Locale.US).format(new Date(System.currentTimeMillis()));
            } else if (i13 > 8 && i13 < 13) {
                Date date = new Date(System.currentTimeMillis());
                str = new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(date) + ", " + str;
            }
            String str2 = str;
            switch (this.f11117i) {
                case 1:
                case 5:
                case 9:
                    int i14 = (i12 * 2) / 7;
                    Bitmap createBitmap = Bitmap.createBitmap(i12, i14, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    int width = i12 - ((bitmap.getWidth() * i14) / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(width, 0, i12, i14), paint);
                    textPaint.setTypeface(Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/UVNChimBien_R.TTF"));
                    int i15 = (width * 9) / 10;
                    int i16 = i15 + 1;
                    int i17 = i12 / 16;
                    int i18 = i16;
                    while (i18 > i15) {
                        textPaint.setTextSize(i17);
                        i18 = (int) textPaint.measureText(str2);
                        i17 -= 2;
                    }
                    StaticLayout m119624k = AbstractC23214t.m119624k(str2, textPaint, i18);
                    int width2 = m119624k.getWidth();
                    canvas.save();
                    canvas.translate(i15 - width2, i14 / 10);
                    m119624k.draw(canvas);
                    canvas.restore();
                    int i19 = i12 / 11;
                    while (i16 > i15) {
                        textPaint.setTextSize(i19);
                        i16 = (int) textPaint.measureText(this.f11119k);
                        i19 -= 2;
                    }
                    StaticLayout m119624k2 = AbstractC23214t.m119624k(this.f11119k, textPaint, i16);
                    int width3 = m119624k2.getWidth();
                    int height = m119624k2.getHeight();
                    canvas.save();
                    canvas.translate(i15 - width3, (i14 - height) - (i14 / 10));
                    m119624k2.draw(canvas);
                    canvas.restore();
                    return createBitmap;
                case 2:
                case 6:
                case 10:
                    int i21 = (i12 * 2) / 7;
                    Bitmap createBitmap2 = Bitmap.createBitmap(i12, i21, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    int i22 = i21 * 3;
                    int width4 = ((i22 / 4) * bitmap.getWidth()) / bitmap.getHeight();
                    textPaint.setTypeface(Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/UVNDaLat_R.TTF"));
                    int i23 = i12 - width4;
                    int i24 = (i23 * 9) / 10;
                    int i25 = i24 + 1;
                    int i26 = (i12 / 16) + 2;
                    int i27 = i25;
                    while (i27 > i24) {
                        i26 -= 2;
                        textPaint.setTextSize(i26);
                        i27 = (int) textPaint.measureText(str2);
                    }
                    int i28 = (i12 / 11) + 2;
                    while (i25 > i24) {
                        i28 -= 2;
                        textPaint.setTextSize(i28);
                        i25 = (int) textPaint.measureText(this.f11119k);
                    }
                    if (i27 < i25) {
                        i27 = i25;
                    }
                    textPaint.setTextSize(i26);
                    StaticLayout m119624k3 = AbstractC23214t.m119624k(str2, textPaint, i27);
                    int height2 = m119624k3.getHeight();
                    canvas2.save();
                    int i29 = i12 - i27;
                    float f11 = i29;
                    canvas2.translate(f11, ((i21 / 2) - height2) / 2);
                    m119624k3.draw(canvas2);
                    canvas2.restore();
                    textPaint.setTextSize(i28);
                    StaticLayout m119624k4 = AbstractC23214t.m119624k(this.f11119k, textPaint, i27);
                    int height3 = m119624k4.getHeight();
                    canvas2.save();
                    canvas2.translate(f11, (i21 / 2) + (((i21 / 2) - height3) / 2));
                    m119624k4.draw(canvas2);
                    canvas2.restore();
                    canvas2.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect((i29 - width4) - (i23 / 10), i21 / 8, i29 - (i23 / 10), i22 / 4), paint);
                    return createBitmap2;
                case 3:
                case 7:
                case 11:
                    int i31 = (i12 * 2) / 7;
                    Bitmap createBitmap3 = Bitmap.createBitmap(i12, i31, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap3);
                    int width5 = (bitmap.getWidth() * i31) / bitmap.getHeight();
                    canvas3.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, width5, i31), paint);
                    textPaint.setTypeface(Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/UVNTinTucHep.TTF"));
                    int i32 = ((i12 - width5) * 9) / 10;
                    int i33 = i32 + 1;
                    int i34 = i12 / 16;
                    int i35 = i33;
                    while (i35 > i32) {
                        textPaint.setTextSize(i34);
                        i35 = (int) textPaint.measureText(str2);
                        i34 -= 2;
                    }
                    StaticLayout m119624k5 = AbstractC23214t.m119624k(str2, textPaint, i35);
                    canvas3.save();
                    float f12 = i12 - i32;
                    canvas3.translate(f12, i31 / 10);
                    m119624k5.draw(canvas3);
                    canvas3.restore();
                    int i36 = i12 / 11;
                    while (i33 > i32) {
                        textPaint.setTextSize(i36);
                        i33 = (int) textPaint.measureText(this.f11119k);
                        i36 -= 2;
                    }
                    StaticLayout m119624k6 = AbstractC23214t.m119624k(this.f11119k, textPaint, i33);
                    int height4 = m119624k6.getHeight();
                    canvas3.save();
                    canvas3.translate(f12, (i31 - height4) - (i31 / 10));
                    m119624k6.draw(canvas3);
                    canvas3.restore();
                    return createBitmap3;
                case 4:
                case 8:
                case 12:
                    String str3 = str2;
                    int i37 = i12 / 3;
                    Bitmap createBitmap4 = Bitmap.createBitmap(i12, i37, Bitmap.Config.ARGB_8888);
                    Canvas canvas4 = new Canvas(createBitmap4);
                    canvas4.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i12 - ((bitmap.getWidth() * i37) / bitmap.getHeight()), 0, i12, i37), paint);
                    textPaint.setTypeface(Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/UVNChimBien_R.TTF"));
                    int i38 = (i12 * 14) / 15;
                    int i39 = i38 + 1;
                    int i41 = i12 / 15;
                    int i42 = i39;
                    while (i42 > i38) {
                        textPaint.setTextSize(i41);
                        String str4 = str3;
                        i42 = (int) textPaint.measureText(str4);
                        i41 -= 2;
                        str3 = str4;
                    }
                    StaticLayout m119624k7 = AbstractC23214t.m119624k(str3, textPaint, i42);
                    int width6 = m119624k7.getWidth();
                    int height5 = m119624k7.getHeight();
                    canvas4.save();
                    canvas4.translate(i38 - width6, (i37 / 3) + (((i37 / 3) - height5) / 2));
                    m119624k7.draw(canvas4);
                    canvas4.restore();
                    int i43 = i12 / 13;
                    while (i39 > i38) {
                        textPaint.setTextSize(i43);
                        i39 = (int) textPaint.measureText(this.f11119k);
                        i43 -= 2;
                    }
                    StaticLayout m119624k8 = AbstractC23214t.m119624k(this.f11119k, textPaint, i39);
                    int width7 = m119624k8.getWidth();
                    int height6 = m119624k8.getHeight();
                    canvas4.save();
                    canvas4.translate(i38 - width7, i37 - height6);
                    m119624k8.draw(canvas4);
                    canvas4.restore();
                    return createBitmap4;
                case 13:
                    int i44 = (i12 * 2) / 8;
                    Bitmap createBitmap5 = Bitmap.createBitmap(i12, i44, Bitmap.Config.ARGB_8888);
                    Canvas canvas5 = new Canvas(createBitmap5);
                    m13433o(i12, i44, 77, 204, new int[]{-16752129, -3641897}, this.f11102s, this.f11104u, canvas5, false);
                    int i45 = this.f11102s + this.f11103t;
                    int width8 = ((i44 - (i45 * 2)) * bitmap.getWidth()) / bitmap.getHeight();
                    canvas5.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i45, i45, i45 + width8, i44 - i45), paint);
                    m13434p(str2, this.f11119k, i12, i44, width8, i45, this.f11103t, textPaint, textPaint2, canvas5);
                    return createBitmap5;
                case 14:
                    int i46 = (i12 * 2) / 8;
                    Bitmap createBitmap6 = Bitmap.createBitmap(i12, i46, Bitmap.Config.ARGB_8888);
                    Canvas canvas6 = new Canvas(createBitmap6);
                    m13433o(i12, i46, 77, 128, new int[]{-1, -1}, this.f11102s, this.f11104u, canvas6, false);
                    int i47 = this.f11102s;
                    int i48 = this.f11103t;
                    int i49 = i47 + i48;
                    int i51 = i46 - (i48 * 2);
                    int i52 = (i51 / 2) + i49;
                    int i53 = i46 / 2;
                    Paint paint2 = new Paint(1);
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setAlpha(204);
                    paint2.setColor(-15695873);
                    canvas6.drawCircle(i52, i53, i51 / 2, paint2);
                    int i54 = i51 / 2;
                    int width9 = (bitmap.getWidth() * i54) / bitmap.getHeight();
                    canvas6.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i52 - (width9 / 2), i53 - (i54 / 2), i52 + (width9 / 2), i53 + (i54 / 2)), paint);
                    Typeface createFromAsset = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/Roboto-Medium.ttf");
                    textPaint.setTypeface(createFromAsset);
                    textPaint.setColor(-15695873);
                    textPaint2.setTypeface(createFromAsset);
                    textPaint2.setColor(-15695873);
                    m13434p(str2, this.f11119k, i12, i46, i51, i49, this.f11103t, textPaint, textPaint2, canvas6);
                    return createBitmap6;
                case 15:
                    int i55 = (i12 * 2) / 8;
                    Bitmap createBitmap7 = Bitmap.createBitmap(i12, i55, Bitmap.Config.ARGB_8888);
                    Canvas canvas7 = new Canvas(createBitmap7);
                    m13433o(i12, i55, 77, 204, new int[]{-16752129, -3641897}, this.f11102s, this.f11104u, canvas7, true);
                    int i56 = this.f11102s + this.f11103t;
                    int width10 = ((i55 - (i56 * 2)) * bitmap.getWidth()) / bitmap.getHeight();
                    canvas7.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i56, i56, i56 + width10, i55 - i56), paint);
                    Typeface createFromAsset2 = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/Roboto-Medium.ttf");
                    textPaint.setTypeface(createFromAsset2);
                    textPaint2.setTypeface(createFromAsset2);
                    m13434p(str2, this.f11119k, i12, i55, width10, i56, this.f11103t, textPaint, textPaint2, canvas7);
                    return createBitmap7;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    int i57 = (i12 * 2) / 8;
                    Bitmap createBitmap8 = Bitmap.createBitmap(i12, i57, Bitmap.Config.ARGB_8888);
                    Canvas canvas8 = new Canvas(createBitmap8);
                    m13433o(i12, i57, 179, 0, new int[]{-1, -1}, this.f11102s, this.f11104u, canvas8, false);
                    int i58 = this.f11102s;
                    int i59 = this.f11103t;
                    int i61 = i58 + i59;
                    int i62 = i57 - (i59 * 2);
                    int i63 = (i62 / 2) + i61;
                    int i64 = i57 / 2;
                    Paint paint3 = new Paint(1);
                    paint3.setStyle(Paint.Style.FILL);
                    paint3.setColor(1292926975);
                    float f13 = i63;
                    float f14 = i64;
                    canvas8.drawCircle(f13, f14, i62 / 2, paint3);
                    paint3.setColor(-1290764289);
                    canvas8.drawCircle(f13, f14, (i62 / 2) - this.f11102s, paint3);
                    int i65 = i62 / 2;
                    int width11 = (bitmap.getWidth() * i65) / bitmap.getHeight();
                    canvas8.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i63 - (width11 / 2), i64 - (i65 / 2), i63 + (width11 / 2), i64 + (i65 / 2)), paint);
                    Typeface createFromAsset3 = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/Roboto-Medium.ttf");
                    textPaint.setTypeface(createFromAsset3);
                    textPaint.setColor(-15695873);
                    textPaint2.setTypeface(createFromAsset3);
                    textPaint2.setColor(-15695873);
                    m13434p(str2, this.f11119k, i12, i57, i62, i61, this.f11103t, textPaint, textPaint2, canvas8);
                    return createBitmap8;
                case 17:
                    int i66 = (i12 * 2) / 8;
                    Bitmap createBitmap9 = Bitmap.createBitmap(i12, i66, Bitmap.Config.ARGB_8888);
                    Canvas canvas9 = new Canvas(createBitmap9);
                    m13433o(i12, i66, 204, 0, new int[]{-15695873, -15695873}, this.f11102s, this.f11104u, canvas9, false);
                    int i67 = this.f11102s + this.f11103t;
                    int width12 = ((i66 - (i67 * 2)) * bitmap.getWidth()) / bitmap.getHeight();
                    canvas9.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i67, i67, i67 + width12, i66 - i67), paint);
                    Typeface createFromAsset4 = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/Roboto-Medium.ttf");
                    textPaint.setTypeface(createFromAsset4);
                    textPaint2.setTypeface(createFromAsset4);
                    m13434p(str2, this.f11119k, i12, i66, width12, i67, this.f11103t, textPaint, textPaint2, canvas9);
                    return createBitmap9;
                default:
                    return null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    private static void m13433o(int i11, int i12, int i13, int i14, int[] iArr, int i15, int i16, Canvas canvas, boolean z11) {
        float f11;
        int i17 = i11;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        float f12 = i17;
        float f13 = i12;
        paint.setShader(new LinearGradient(0.0f, 0.0f, f12, f13, iArr, (float[]) null, Shader.TileMode.MIRROR));
        paint.setAlpha(i13);
        if (z11) {
            f11 = i17 + i16;
        } else {
            f11 = f12;
        }
        RectF rectF = new RectF(0.0f, 0.0f, f11, f13);
        float f14 = i16;
        canvas.drawRoundRect(rectF, f14, f14, paint);
        paint.setAlpha(i14);
        float f15 = i15;
        if (z11) {
            i17 += i16;
        }
        canvas.drawRoundRect(new RectF(f15, f15, i17 - i15, i12 - i15), f14, f14, paint);
    }

    /* renamed from: p */
    private static void m13434p(String str, String str2, int i11, int i12, int i13, int i14, int i15, TextPaint textPaint, TextPaint textPaint2, Canvas canvas) {
        int i16 = ((i11 - i13) - (i14 * 2)) - (i15 * 2);
        int i17 = i16 + 1;
        int i18 = i11 / 16;
        int i19 = i17;
        while (i19 > i16) {
            textPaint.setTextSize(i18);
            i19 = (int) textPaint.measureText(str);
            i18 -= 2;
        }
        StaticLayout m119624k = AbstractC23214t.m119624k(str, textPaint, i19);
        int height = m119624k.getHeight();
        int i21 = i11 / 14;
        while (i17 > i16) {
            textPaint2.setTextSize(i21);
            i17 = (int) textPaint2.measureText(str2);
            i21 -= 2;
        }
        StaticLayout m119624k2 = AbstractC23214t.m119624k(str2, textPaint2, i17);
        int height2 = m119624k2.getHeight();
        int m118742r = (((i12 - height) - height2) - AbstractC23136l9.m118742r(2.0f)) / 2;
        canvas.save();
        float f11 = i14 + i13 + i15;
        canvas.translate(f11, m118742r);
        m119624k.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f11, m118742r + height + r12);
        m119624k2.draw(canvas);
        canvas.restore();
    }

    /* renamed from: s */
    private void m13435s(ImageView imageView, int i11, int i12) {
        Bitmap m13438q = m13438q();
        if (m13438q != null) {
            imageView.setImageBitmap(m13438q);
            m13431m(m13438q, imageView, i11, i12);
        }
    }

    @Override // bf.AbstractC2790b
    /* renamed from: j */
    public void mo13436j(ViewGroup viewGroup, int i11, int i12, boolean z11, AbstractC2790b.a aVar) {
        if (this.f11110b != 1) {
            return;
        }
        RecyclingImageView recyclingImageView = new RecyclingImageView(viewGroup.getContext());
        recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewGroup.addView(recyclingImageView);
        m13435s(recyclingImageView, i11, i12);
        if (aVar != null) {
            aVar.mo13450a();
        }
    }

    @Override // bf.AbstractC2790b
    /* renamed from: k */
    AbstractC22647c mo13437k(boolean z11) {
        return new C0768a(this);
    }

    /* renamed from: q */
    public Bitmap m13438q() {
        Bitmap decodeResource;
        Bitmap m13432n;
        synchronized (this.f11106w) {
            try {
                Bitmap bitmap = this.f11105v;
                if (bitmap != null) {
                    return bitmap;
                }
                switch (this.f11117i) {
                    case 1:
                    case 5:
                    case 9:
                        decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.filter_loc_01);
                        break;
                    case 2:
                    case 6:
                    case 10:
                        decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.filter_loc_02);
                        break;
                    case 3:
                    case 7:
                    case 11:
                        decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.filter_loc_03);
                        break;
                    case 4:
                    case 8:
                    case 12:
                        decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.filter_loc_04);
                        break;
                    case 13:
                    case 15:
                    case 17:
                        decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.ic_loc_default_01);
                        break;
                    case 14:
                        decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.ic_loc_default_03);
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.ic_loc_default_02);
                        break;
                    default:
                        decodeResource = null;
                        break;
                }
                if (decodeResource == null || (m13432n = m13432n(decodeResource, AbstractC23136l9.m118722k0())) == null) {
                    return null;
                }
                synchronized (this.f11106w) {
                    this.f11105v = m13432n;
                }
                return m13432n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:            return r0;     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2790b.b m13439r(boolean z11) {
        AbstractC2790b.b bVar = new AbstractC2790b.b(null);
        int i11 = 90;
        int i12 = 85;
        switch (this.f11117i) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
                if (z11) {
                    i11 = 70;
                }
                bVar.f11127c = i11;
                bVar.f11128d = 9;
                bVar.f11125a = 96.0f;
                bVar.f11126b = 95.0f;
                break;
            case 3:
            case 7:
            case 11:
                if (z11) {
                    i11 = 70;
                }
                bVar.f11127c = i11;
                bVar.f11128d = 7;
                bVar.f11125a = 4.0f;
                bVar.f11126b = 95.0f;
                break;
            case 13:
            case 14:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            case 17:
                if (z11) {
                    i12 = 50;
                }
                bVar.f11127c = i12;
                bVar.f11128d = 8;
                bVar.f11125a = 50.0f;
                bVar.f11126b = 95.0f;
                break;
            case 15:
                if (z11) {
                    i12 = 50;
                }
                bVar.f11127c = i12;
                bVar.f11128d = 9;
                bVar.f11125a = 100.0f;
                bVar.f11126b = 90.0f;
                break;
        }
    }
}
