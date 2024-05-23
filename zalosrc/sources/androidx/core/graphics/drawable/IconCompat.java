package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.util.AbstractC1482d;
import androidx.core.util.AbstractC1487i;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f6202k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f6203a;

    /* renamed from: b */
    Object f6204b;

    /* renamed from: c */
    public byte[] f6205c;

    /* renamed from: d */
    public Parcelable f6206d;

    /* renamed from: e */
    public int f6207e;

    /* renamed from: f */
    public int f6208f;

    /* renamed from: g */
    public ColorStateList f6209g;

    /* renamed from: h */
    PorterDuff.Mode f6210h;

    /* renamed from: i */
    public String f6211i;

    /* renamed from: j */
    public String f6212j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: classes2.dex */
    public static class C1410a {
        /* renamed from: a */
        static IconCompat m7169a(Object obj) {
            AbstractC1487i.m7492g(obj);
            int m7172d = m7172d(obj);
            if (m7172d != 2) {
                if (m7172d != 4) {
                    if (m7172d != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f6204b = obj;
                        return iconCompat;
                    }
                    return IconCompat.m7151d(m7173e(obj));
                }
                return IconCompat.m7154g(m7173e(obj));
            }
            return IconCompat.m7156i(null, m7171c(obj), m7170b(obj));
        }

        /* renamed from: b */
        static int m7170b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C1412c.m7178a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        /* renamed from: c */
        static String m7171c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C1412c.m7179b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: d */
        static int m7172d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C1412c.m7180c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                return -1;
            } catch (NoSuchMethodException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to get icon type ");
                sb3.append(obj);
                return -1;
            } catch (InvocationTargetException unused3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unable to get icon type ");
                sb4.append(obj);
                return -1;
            }
        }

        /* renamed from: e */
        static Uri m7173e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C1412c.m7181d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: f */
        static Drawable m7174f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        static Icon m7175g(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f6203a) {
                case -1:
                    return (Icon) iconCompat.f6204b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f6204b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m7160l(), iconCompat.f6207e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f6204b, iconCompat.f6207e, iconCompat.f6208f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f6204b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = C1411b.m7177b((Bitmap) iconCompat.f6204b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m7149b((Bitmap) iconCompat.f6204b, false));
                        break;
                    }
                case 6:
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30) {
                        createWithBitmap = C1413d.m7182a(iconCompat.m7162n());
                        break;
                    } else if (context != null) {
                        InputStream m7163o = iconCompat.m7163o(context);
                        if (m7163o != null) {
                            if (i11 >= 26) {
                                createWithBitmap = C1411b.m7177b(BitmapFactory.decodeStream(m7163o));
                                break;
                            } else {
                                createWithBitmap = Icon.createWithBitmap(IconCompat.m7149b(BitmapFactory.decodeStream(m7163o), false));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m7162n());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m7162n());
                    }
            }
            ColorStateList colorStateList = iconCompat.f6209g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f6210h;
            if (mode != IconCompat.f6202k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: classes2.dex */
    public static class C1411b {
        /* renamed from: a */
        static Drawable m7176a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        static Icon m7177b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: classes2.dex */
    public static class C1412c {
        /* renamed from: a */
        static int m7178a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        static String m7179b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        static int m7180c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        static Uri m7181d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: classes2.dex */
    public static class C1413d {
        /* renamed from: a */
        static Icon m7182a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f6203a = -1;
        this.f6205c = null;
        this.f6206d = null;
        this.f6207e = 0;
        this.f6208f = 0;
        this.f6209g = null;
        this.f6210h = f6202k;
        this.f6211i = null;
    }

    /* renamed from: a */
    public static IconCompat m7148a(Icon icon) {
        return C1410a.m7169a(icon);
    }

    /* renamed from: b */
    static Bitmap m7149b(Bitmap bitmap, boolean z11) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f11 = min;
        float f12 = 0.5f * f11;
        float f13 = 0.9166667f * f12;
        if (z11) {
            float f14 = 0.010416667f * f11;
            paint.setColor(0);
            paint.setShadowLayer(f14, 0.0f, f11 * 0.020833334f, 1023410176);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.setShadowLayer(f14, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f12, f12, f13, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: c */
    public static IconCompat m7150c(Bitmap bitmap) {
        AbstractC1482d.m7477c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f6204b = bitmap;
        return iconCompat;
    }

    /* renamed from: d */
    public static IconCompat m7151d(Uri uri) {
        AbstractC1482d.m7477c(uri);
        return m7152e(uri.toString());
    }

    /* renamed from: e */
    public static IconCompat m7152e(String str) {
        AbstractC1482d.m7477c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f6204b = str;
        return iconCompat;
    }

    /* renamed from: f */
    public static IconCompat m7153f(Bitmap bitmap) {
        AbstractC1482d.m7477c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f6204b = bitmap;
        return iconCompat;
    }

    /* renamed from: g */
    public static IconCompat m7154g(Uri uri) {
        AbstractC1482d.m7477c(uri);
        return m7155h(uri.toString());
    }

    /* renamed from: h */
    public static IconCompat m7155h(String str) {
        AbstractC1482d.m7477c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f6204b = str;
        return iconCompat;
    }

    /* renamed from: i */
    public static IconCompat m7156i(Resources resources, String str, int i11) {
        AbstractC1482d.m7477c(str);
        if (i11 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f6207e = i11;
            if (resources != null) {
                try {
                    iconCompat.f6204b = resources.getResourceName(i11);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f6204b = str;
            }
            iconCompat.f6212j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: u */
    private static String m7157u(int i11) {
        switch (i11) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: j */
    public Bitmap m7158j() {
        int i11 = this.f6203a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f6204b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i11 == 1) {
            return (Bitmap) this.f6204b;
        }
        if (i11 == 5) {
            return m7149b((Bitmap) this.f6204b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: k */
    public int m7159k() {
        int i11 = this.f6203a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C1410a.m7170b(this.f6204b);
        }
        if (i11 == 2) {
            return this.f6207e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: l */
    public String m7160l() {
        int i11 = this.f6203a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C1410a.m7171c(this.f6204b);
        }
        if (i11 == 2) {
            String str = this.f6212j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f6212j;
            }
            return ((String) this.f6204b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: m */
    public int m7161m() {
        int i11 = this.f6203a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C1410a.m7172d(this.f6204b);
        }
        return i11;
    }

    /* renamed from: n */
    public Uri m7162n() {
        int i11 = this.f6203a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C1410a.m7173e(this.f6204b);
        }
        if (i11 != 4 && i11 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f6204b);
    }

    /* renamed from: o */
    public InputStream m7163o(Context context) {
        Uri m7162n = m7162n();
        String scheme = m7162n.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f6204b));
            } catch (FileNotFoundException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to load image from path: ");
                sb2.append(m7162n);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(m7162n);
        } catch (Exception unused2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to load image from URI: ");
            sb3.append(m7162n);
            return null;
        }
    }

    /* renamed from: p */
    public void m7164p() {
        this.f6210h = PorterDuff.Mode.valueOf(this.f6211i);
        switch (this.f6203a) {
            case -1:
                Parcelable parcelable = this.f6206d;
                if (parcelable != null) {
                    this.f6204b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f6206d;
                if (parcelable2 != null) {
                    this.f6204b = parcelable2;
                    return;
                }
                byte[] bArr = this.f6205c;
                this.f6204b = bArr;
                this.f6203a = 3;
                this.f6207e = 0;
                this.f6208f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f6205c, Charset.forName("UTF-16"));
                this.f6204b = str;
                if (this.f6203a == 2 && this.f6212j == null) {
                    this.f6212j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f6204b = this.f6205c;
                return;
        }
    }

    /* renamed from: q */
    public void m7165q(boolean z11) {
        this.f6211i = this.f6210h.name();
        switch (this.f6203a) {
            case -1:
                if (!z11) {
                    this.f6206d = (Parcelable) this.f6204b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z11) {
                    Bitmap bitmap = (Bitmap) this.f6204b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f6205c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f6206d = (Parcelable) this.f6204b;
                return;
            case 2:
                this.f6205c = ((String) this.f6204b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f6205c = (byte[]) this.f6204b;
                return;
            case 4:
            case 6:
                this.f6205c = this.f6204b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: r */
    public Bundle m7166r() {
        Bundle bundle = new Bundle();
        switch (this.f6203a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f6204b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f6204b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f6204b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f6204b);
                break;
        }
        bundle.putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f6203a);
        bundle.putInt("int1", this.f6207e);
        bundle.putInt("int2", this.f6208f);
        bundle.putString("string1", this.f6212j);
        ColorStateList colorStateList = this.f6209g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f6210h;
        if (mode != f6202k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    /* renamed from: s */
    public Icon m7167s() {
        return m7168t(null);
    }

    /* renamed from: t */
    public Icon m7168t(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1410a.m7175g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        if (this.f6203a == -1) {
            return String.valueOf(this.f6204b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m7157u(this.f6203a));
        switch (this.f6203a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f6204b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f6204b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f6212j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m7159k())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f6207e);
                if (this.f6208f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f6208f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f6204b);
                break;
        }
        if (this.f6209g != null) {
            sb2.append(" tint=");
            sb2.append(this.f6209g);
        }
        if (this.f6210h != f6202k) {
            sb2.append(" mode=");
            sb2.append(this.f6210h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i11) {
        this.f6205c = null;
        this.f6206d = null;
        this.f6207e = 0;
        this.f6208f = 0;
        this.f6209g = null;
        this.f6210h = f6202k;
        this.f6211i = null;
        this.f6203a = i11;
    }
}
