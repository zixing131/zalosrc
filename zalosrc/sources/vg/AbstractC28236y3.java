package vg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import java.io.IOException;
import java.io.InputStream;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;

/* renamed from: vg.y3 */
/* loaded from: classes.dex */
public abstract class AbstractC28236y3 {

    /* renamed from: a */
    static Drawable f131656a;

    /* renamed from: b */
    static Drawable f131657b;

    /* renamed from: vg.y3$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f131658a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f131658a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f131658a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f131658a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f131658a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f131658a[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f131658a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f131658a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:            if ((r7 * r6) > (r8 * r5)) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:            r6 = r6;        r9 = r9 * (r6 / r2);        r5 = (r5 - r9) * 0.5f;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:            r5 = r5;        r2 = r2 * (r5 / r9);        r6 = (r6 - r2) * 0.5f;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:            if ((r7 * r6) > (r8 * r5)) goto L22;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m142190a(int i11, int i12, int i13, int i14, Rect rect, Rect rect2, ImageView.ScaleType scaleType) {
        int i15;
        int i16;
        int i17;
        int i18;
        float f11;
        int round;
        if (rect != null) {
            i15 = rect.left;
            i17 = rect.top;
            i18 = rect.right;
            i16 = rect.bottom;
        } else {
            i15 = 0;
            i16 = 0;
            i17 = 0;
            i18 = 0;
        }
        int i19 = (i11 - i15) - i18;
        int i21 = (i12 - i17) - i16;
        if (i13 == 0 || i14 == 0) {
            i13 = i19;
            i14 = i21;
        }
        float f12 = i13;
        float f13 = i14;
        float f14 = 0.0f;
        switch (a.f131658a[scaleType.ordinal()]) {
            case 1:
                f12 = i19;
                f13 = i21;
                f11 = 0.0f;
                break;
            case 2:
                if (i13 * i21 > i14 * i19) {
                    float f15 = i19;
                    f13 *= f15 / f12;
                    f12 = f15;
                } else {
                    float f16 = i21;
                    f12 *= f16 / f13;
                    f13 = f16;
                }
                f11 = 0.0f;
                break;
            case 3:
                break;
            case 4:
                if (i13 * i21 > i14 * i19) {
                    float f17 = i19;
                    f13 *= f17 / f12;
                    f11 = i21 - f13;
                    f12 = f17;
                    break;
                } else {
                    float f18 = i21;
                    f12 *= f18 / f13;
                    float f19 = i19 - f12;
                    f14 = f19;
                    f13 = f18;
                    f11 = 0.0f;
                    break;
                }
            case 5:
                f14 = Math.round((i19 - i13) * 0.5f);
                round = Math.round((i21 - i14) * 0.5f);
                f11 = round;
                break;
            case 6:
                break;
            case 7:
                if (i13 > i19 || i14 > i21) {
                    float min = Math.min(i19 / f12, i21 / f13);
                    f12 *= min;
                    f13 *= min;
                }
                f14 = Math.round((i19 - f12) * 0.5f);
                round = Math.round((i21 - f13) * 0.5f);
                f11 = round;
                break;
            default:
                f11 = 0.0f;
                break;
        }
        rect2.set(((int) f14) + i15, ((int) f11) + i17, i15 + ((int) (f14 + f12)), i17 + ((int) (f11 + f13)));
    }

    /* renamed from: b */
    public static Drawable m142191b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return drawable.getConstantState().newDrawable();
    }

    /* renamed from: c */
    public static Bitmap m142192c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: d */
    public static Bitmap m142193d(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (context == null) {
            return null;
        }
        try {
            inputStream = context.getAssets().open(str);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                return decodeStream;
            } catch (IOException unused) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e12) {
                        AbstractC23350e.m122778h(e12);
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e13) {
                        AbstractC23350e.m122778h(e13);
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: e */
    public static Bitmap m142194e(String str) {
        return m142193d(MainApplication.getAppContext(), str);
    }

    /* renamed from: f */
    public static Bitmap m142195f(String str) {
        try {
            return BitmapFactory.decodeFile(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            MainApplication.m35468b0();
            return null;
        }
    }

    /* renamed from: g */
    public static Drawable m142196g(Context context) {
        if (f131656a == null) {
            f131656a = AbstractC23136l9.m118665N(context, AbstractC16803z.feed_location_thumb);
        }
        return f131656a;
    }

    /* renamed from: h */
    public static Drawable m142197h(Context context, String str) {
        return AbstractC23136l9.m118665N(context, m142203n(str));
    }

    /* renamed from: i */
    public static Drawable m142198i(Context context, Bitmap bitmap) {
        if (context == null) {
            return null;
        }
        try {
            return new BitmapDrawable(context.getResources(), bitmap);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            MainApplication.m35468b0();
            return null;
        }
    }

    /* renamed from: j */
    public static Drawable m142199j(Bitmap bitmap) {
        return m142198i(MainApplication.getAppContext(), bitmap);
    }

    /* renamed from: k */
    public static Drawable m142200k(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return new BitmapDrawable(context.getResources(), BitmapFactory.decodeFile(str));
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            MainApplication.m35468b0();
            return null;
        }
    }

    /* renamed from: l */
    public static Drawable m142201l(String str) {
        return m142200k(MainApplication.getAppContext(), str);
    }

    /* renamed from: m */
    public static Drawable m142202m(Context context) {
        if (f131657b == null) {
            f131657b = AbstractC23136l9.m118665N(context, AbstractC16803z.bg_feed);
        }
        return f131657b;
    }

    /* renamed from: n */
    public static int m142203n(String str) {
        int i11 = AbstractC23322a.zds_ffic_attachment_colored_48;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("flv") || lowerCase.startsWith("ogg") || lowerCase.startsWith("mov") || lowerCase.startsWith("mpg") || lowerCase.startsWith("mkv") || lowerCase.startsWith("avi") || lowerCase.startsWith("asf") || lowerCase.startsWith("wmv") || lowerCase.startsWith("mp4") || lowerCase.startsWith("3gp")) {
                i11 = AbstractC23322a.zds_ffic_mov_colored_48;
            }
            if (lowerCase.startsWith("gif") || lowerCase.startsWith("bmp") || lowerCase.startsWith("png") || lowerCase.startsWith("jpg") || lowerCase.startsWith("jpeg") || lowerCase.startsWith("webp") || lowerCase.startsWith("heic") || lowerCase.startsWith("heif")) {
                i11 = AbstractC23322a.zds_ffic_image_colored_48;
            }
            if (lowerCase.startsWith("mp3") || lowerCase.startsWith("m4a") || lowerCase.startsWith("aac") || lowerCase.startsWith("wma") || lowerCase.startsWith("wav")) {
                i11 = AbstractC23322a.zds_ffic_music_colored_48;
            }
            if (lowerCase.startsWith("htm")) {
                i11 = AbstractC23322a.zds_ffic_code_colored_48;
            }
            if (lowerCase.startsWith("doc")) {
                i11 = AbstractC23322a.zds_ffic_word_colored_48;
            }
            if (lowerCase.startsWith("xls")) {
                i11 = AbstractC23322a.zds_ffic_excel_colored_48;
            }
            if (lowerCase.startsWith("ppt")) {
                i11 = AbstractC23322a.zds_ffic_pptx_colored_48;
            }
            if (lowerCase.startsWith("pdf")) {
                i11 = AbstractC23322a.zds_ffic_pdf_colored_48;
            }
            if (lowerCase.startsWith("txt")) {
                i11 = AbstractC23322a.zds_ffic_txt_colored_48;
            }
            if (lowerCase.startsWith("zip")) {
                i11 = AbstractC23322a.zds_ffic_zip_colored_48;
            }
            if (lowerCase.startsWith("rar")) {
                i11 = AbstractC23322a.zds_ffic_zip_colored_48;
            }
            if (lowerCase.startsWith("xml")) {
                i11 = AbstractC23322a.zds_ffic_xml_colored_48;
            }
            if (lowerCase.startsWith("ai")) {
                i11 = AbstractC23322a.zds_ffic_ai_colored_48;
            }
            if (lowerCase.startsWith("psd")) {
                i11 = AbstractC23322a.zds_ffic_ps_colored_48;
            }
            if (lowerCase.startsWith("sketch")) {
                return AbstractC23322a.zds_ffic_sketch_colored_48;
            }
            return i11;
        }
        return i11;
    }

    /* renamed from: o */
    public static Drawable m142204o(Drawable drawable, int i11, int i12) {
        drawable.setBounds(i11, i12, drawable.getIntrinsicWidth() + i11, drawable.getIntrinsicHeight() + i12);
        return drawable;
    }
}
