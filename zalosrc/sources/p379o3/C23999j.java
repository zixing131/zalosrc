package p379o3;

import ag0.AbstractC0837p0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.AbstractC3976i;
import com.androidquery.util.C3973f;
import com.androidquery.util.C3979l;
import com.androidquery.util.C3985r;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.androidquery.util.RunnableC3975h;
import com.zing.zalo.zimageutil.ZBitmap;
import com.zing.zalo.zmedia.zanimation.ZAnimation;
import com.zing.zalo.zmedia.zjxl.ZJXLDecoder;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import me0.AbstractC23009a3;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import me0.C23257x1;
import mm0.AbstractC23350e;
import p171fx.AbstractC19164e;
import p193h0.AbstractC19694b;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import p371nv.C23952g;
import p414p3.AbstractC24621a;
import p436q3.EnumC25103a;
import p471r3.EnumC25629a;
import p502s3.C26117c;
import p620wt.AbstractC29237l;
import sh0.C26251c;

/* renamed from: o3.j */
/* loaded from: classes.dex */
public class C23999j extends AbstractRunnableC23992c {

    /* renamed from: S0 */
    static boolean f116200S0 = false;

    /* renamed from: T0 */
    private static int f116201T0 = 20;

    /* renamed from: U0 */
    private static int f116202U0 = 20;

    /* renamed from: V0 */
    private static int f116203V0 = 20;

    /* renamed from: W0 */
    private static int f116204W0 = 2;

    /* renamed from: X0 */
    public static int f116205X0 = 2500;

    /* renamed from: Y0 */
    public static int f116206Y0 = 57600;

    /* renamed from: Z0 */
    public static int f116207Z0 = 160000;

    /* renamed from: a1 */
    private static int f116208a1 = 1000000;

    /* renamed from: b1 */
    private static int f116209b1 = 1000000;

    /* renamed from: c1 */
    private static int f116210c1 = 1000000;

    /* renamed from: d1 */
    private static boolean f116211d1 = false;

    /* renamed from: e1 */
    public static boolean f116212e1 = false;

    /* renamed from: f1 */
    public static boolean f116213f1 = false;

    /* renamed from: g1 */
    public static boolean f116214g1 = true;

    /* renamed from: h1 */
    private static final Map f116215h1 = new HashMap();

    /* renamed from: i1 */
    private static final HashMap f116216i1 = new HashMap();

    /* renamed from: j1 */
    private static final HashMap f116217j1 = new HashMap();

    /* renamed from: k1 */
    private static final Bitmap f116218k1 = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);

    /* renamed from: A0 */
    private int f116219A0;

    /* renamed from: C0 */
    private Drawable f116221C0;

    /* renamed from: D0 */
    private Drawable f116222D0;

    /* renamed from: E0 */
    private float f116223E0;

    /* renamed from: F0 */
    private int f116224F0;

    /* renamed from: I0 */
    private boolean f116227I0;

    /* renamed from: J0 */
    private boolean f116228J0;

    /* renamed from: K0 */
    private EnumC25629a f116229K0;

    /* renamed from: P0 */
    private Rect f116234P0;

    /* renamed from: v0 */
    private WeakReference f116237v0;

    /* renamed from: w0 */
    private int f116238w0;

    /* renamed from: x0 */
    private int f116239x0;

    /* renamed from: y0 */
    private File f116240y0;

    /* renamed from: z0 */
    private Drawable f116241z0;

    /* renamed from: B0 */
    private int f116220B0 = 1000;

    /* renamed from: G0 */
    private final boolean f116225G0 = false;

    /* renamed from: H0 */
    private float f116226H0 = Float.MAX_VALUE;

    /* renamed from: L0 */
    private boolean f116230L0 = false;

    /* renamed from: M0 */
    private boolean f116231M0 = false;

    /* renamed from: N0 */
    private boolean f116232N0 = true;

    /* renamed from: O0 */
    private boolean f116233O0 = false;

    /* renamed from: Q0 */
    private boolean f116235Q0 = false;

    /* renamed from: R0 */
    private C3979l.b f116236R0 = C3979l.b.UNKNOWN;

    /* renamed from: o3.j$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private String f116242a = "";

        /* renamed from: b */
        private Bitmap f116243b = null;

        /* renamed from: c */
        private long f116244c = -1;

        /* renamed from: d */
        private C3979l.a f116245d = C3979l.a.JPEG;

        /* renamed from: e */
        private C3979l.b f116246e = C3979l.b.UNKNOWN;

        /* renamed from: f */
        private long f116247f = -1;

        /* renamed from: g */
        private long f116248g = -1;

        /* renamed from: h */
        private long f116249h = -1;

        /* renamed from: i */
        private int f116250i = -1;

        /* renamed from: j */
        private long f116251j = 0;

        /* renamed from: k */
        private long f116252k = 0;

        /* renamed from: l */
        private long f116253l = 0;

        /* renamed from: A */
        public int m125807A() {
            return this.f116250i;
        }

        /* renamed from: B */
        public C3979l.a m125808B() {
            return this.f116245d;
        }

        /* renamed from: C */
        public long m125809C() {
            return this.f116249h;
        }

        /* renamed from: D */
        public C3979l.b m125810D() {
            return this.f116246e;
        }

        /* renamed from: E */
        public long m125811E() {
            return this.f116248g;
        }

        /* renamed from: F */
        public long m125812F() {
            return this.f116247f;
        }

        /* renamed from: G */
        public long m125813G() {
            return this.f116251j;
        }

        /* renamed from: H */
        public long m125814H() {
            return this.f116253l;
        }

        /* renamed from: x */
        public Bitmap m125815x() {
            return this.f116243b;
        }

        /* renamed from: y */
        public long m125816y() {
            return this.f116244c;
        }

        /* renamed from: z */
        public long m125817z() {
            return this.f116252k;
        }
    }

    public C23999j() {
        ((C23999j) ((C23999j) ((C23999j) m125628s1(C3979l.class)).m125596P0(true)).m125602Z(true)).m125635v1("");
    }

    /* renamed from: A2 */
    public static C3979l m125676A2(String str, int i11, EnumC25629a enumC25629a) {
        return m125712V2(str, i11, 0, enumC25629a);
    }

    /* renamed from: A3 */
    public static void m125677A3(int i11) {
        f116207Z0 = i11;
        m125713W1();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x020e  */
    /* renamed from: B2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3979l m125679B2(String str, C3979l.b bVar, long j11, String str2, byte[] bArr, int i11, boolean z11, boolean z12, int i12, boolean z13, boolean z14, Drawable drawable, Rect rect, EnumC25629a enumC25629a) {
        int i13;
        BitmapFactory.Options options;
        a aVar;
        C3979l m125726g2;
        m125702P2("Get resized image : " + str2 + "; round=" + i12 + "; memoryOption=" + enumC25629a);
        if (str2 == null && bArr == null) {
            return null;
        }
        if (i11 > 0 || (enumC25629a != null && enumC25629a.equals(EnumC25629a.IN_BITMAP))) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            m125729i2(str, bVar, str2, bArr, options2, z13, enumC25629a, i11, j11);
            if (i11 <= 0) {
                i13 = 1;
            } else if (f116200S0 && !z11) {
                i13 = AbstractC23009a3.m117970u(options2.outWidth, options2.outHeight, i11);
            } else {
                int i14 = options2.outWidth;
                if (!z12) {
                    i14 = Math.max(i14, options2.outHeight);
                }
                i13 = AbstractC23009a3.m117969t(i14, i11);
            }
            BitmapFactory.Options options3 = new BitmapFactory.Options();
            options3.inSampleSize = i13;
            options3.outWidth = options2.outWidth;
            options3.outHeight = options2.outHeight;
            options = options3;
        } else {
            options = null;
        }
        try {
            aVar = m125729i2(str, bVar, str2, bArr, options, z13, enumC25629a, i11, j11);
            if (aVar != null) {
                try {
                    if (aVar.f116243b != null) {
                        if (i12 != 1000 && i12 != 1002) {
                            if (i12 == 1008) {
                                Bitmap bitmap = aVar.f116243b;
                                aVar.f116243b = m125744t2(aVar.f116243b);
                                if (bitmap != aVar.f116243b) {
                                    bitmap.recycle();
                                }
                            } else if (i12 == 1003) {
                                Bitmap bitmap2 = aVar.f116243b;
                                aVar.f116243b = m125724e2(aVar.f116243b, AbstractC3972e.m18800p(drawable));
                                if (bitmap2 != aVar.f116243b) {
                                    bitmap2.recycle();
                                }
                            } else if (i12 == 1004) {
                                Bitmap bitmap3 = aVar.f116243b;
                                aVar.f116243b = m125722d2(aVar.f116243b);
                                if (bitmap3 != aVar.f116243b) {
                                    bitmap3.recycle();
                                }
                            } else if (i12 == 1005) {
                                Bitmap bitmap4 = aVar.f116243b;
                                aVar.f116243b = m125720c2(aVar.f116243b);
                                if (bitmap4 != aVar.f116243b) {
                                    bitmap4.recycle();
                                }
                            } else if (i12 == 1001) {
                                Bitmap bitmap5 = aVar.f116243b;
                                aVar.f116243b = m125746u2(aVar.f116243b);
                                if (bitmap5 != aVar.f116243b) {
                                    bitmap5.recycle();
                                }
                            } else if (i12 == 1006) {
                                Bitmap bitmap6 = aVar.f116243b;
                                ZBitmap.m91413b(aVar.f116243b, 7, true);
                                if (bitmap6 != aVar.f116243b) {
                                    bitmap6.recycle();
                                }
                            } else if (i12 == 1007) {
                                Bitmap bitmap7 = aVar.f116243b;
                                aVar.f116243b = m125743s2(aVar.f116243b);
                                ZBitmap.m91413b(aVar.f116243b, 7, true);
                                if (bitmap7 != aVar.f116243b) {
                                    bitmap7.recycle();
                                }
                            } else if (i12 == 1009) {
                                Bitmap bitmap8 = aVar.f116243b;
                                aVar.f116243b = m125748v2(aVar.f116243b, rect);
                                if (bitmap8 != aVar.f116243b) {
                                    bitmap8.recycle();
                                }
                            } else if (i12 > 0) {
                                Bitmap bitmap9 = aVar.f116243b;
                                aVar.f116243b = m125685D2(aVar.f116243b, i12);
                                if (bitmap9 != aVar.f116243b) {
                                    bitmap9.recycle();
                                }
                            } else if (z14) {
                                Bitmap bitmap10 = aVar.f116243b;
                                aVar.f116243b = m125721c3(aVar.f116243b);
                                if (bitmap10 != aVar.f116243b) {
                                    bitmap10.recycle();
                                }
                            }
                        }
                        Bitmap bitmap11 = aVar.f116243b;
                        aVar.f116243b = m125743s2(aVar.f116243b);
                        if (bitmap11 != aVar.f116243b) {
                            bitmap11.recycle();
                        }
                    }
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    m125713W1();
                    AbstractC3972e.m18779e0(e);
                    m125726g2 = m125726g2(aVar, enumC25629a);
                    if (m125726g2 != null) {
                    }
                    return m125726g2;
                }
            }
        } catch (OutOfMemoryError e12) {
            e = e12;
            aVar = null;
        }
        m125726g2 = m125726g2(aVar, enumC25629a);
        if (m125726g2 != null) {
            m125726g2.m18856t(str2);
        }
        return m125726g2;
    }

    /* renamed from: B3 */
    public static void m125680B3(int i11) {
        f116205X0 = i11;
        m125713W1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:            return r0;     */
    /* renamed from: C2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Matrix m125682C2(int i11) {
        Matrix matrix = new Matrix();
        switch (i11) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    /* renamed from: C3 */
    public static void m125683C3(boolean z11) {
        f116212e1 = z11;
    }

    /* renamed from: D2 */
    public static Bitmap m125685D2(Bitmap bitmap, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f11 = i11;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f11, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: E1 */
    public static void m125686E1(C3979l c3979l, String str, C24003n c24003n) {
        try {
            if (!TextUtils.isEmpty(str) && c3979l != null && c24003n != null) {
                m125714W2(str, c24003n.f116260a, c24003n.f116264e, c3979l, false, c24003n.f116266g, c24003n.f116281v, c24003n.f116272m);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E2 */
    public static Bitmap m125687E2(Bitmap bitmap, int i11, int i12, int i13, boolean z11) {
        int i14;
        int i15;
        Rect rect;
        int i16 = 100;
        if (i12 < 100) {
            i11 = 50;
            i14 = 100;
        } else {
            i16 = i12;
            i14 = i13;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i16, i14, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint();
        int i17 = 0;
        Rect rect2 = new Rect(0, 0, i16, i14);
        RectF rectF = new RectF(rect2);
        float f11 = i11;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f11, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        if (width > height) {
            i15 = (width - i12) / 2;
        } else {
            i15 = 0;
        }
        if (width < height) {
            i17 = (height - i13) / 2;
        }
        if (z11) {
            rect = new Rect(i15, i17, i12 + i15, i13 + i17);
        } else {
            rect = rect2;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }

    /* renamed from: F1 */
    private void m125688F1(String str, InterfaceC3968a interfaceC3968a, String str2) {
        m125703Q1(str2, interfaceC3968a);
        HashMap hashMap = f116216i1;
        WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(str);
        if (weakHashMap == null) {
            WeakHashMap weakHashMap2 = new WeakHashMap();
            weakHashMap2.put(interfaceC3968a, this);
            hashMap.put(str, weakHashMap2);
        } else {
            weakHashMap.put(interfaceC3968a, this);
            m125584A();
        }
        HashMap hashMap2 = f116217j1;
        WeakHashMap weakHashMap3 = (WeakHashMap) hashMap2.get(str);
        if (weakHashMap3 == null) {
            WeakHashMap weakHashMap4 = new WeakHashMap();
            weakHashMap4.put(interfaceC3968a, this);
            hashMap2.put(str, weakHashMap4);
            return;
        }
        weakHashMap3.put(interfaceC3968a, this);
    }

    /* renamed from: F3 */
    public static synchronized void m125689F3(int i11) {
        synchronized (C23999j.class) {
            try {
                if (i11 >= 60) {
                    m125713W1();
                } else if (i11 >= 40) {
                    Map map = f116215h1;
                    Map map2 = (Map) map.get(2);
                    if (map2 instanceof C3973f) {
                        ((C3973f) map2).m18819g(map2.size() / 2);
                    }
                    Map map3 = (Map) map.get(1);
                    if (map3 instanceof C3973f) {
                        int size = map3.size();
                        ((C3973f) map3).m18819g(map3.size() / 2);
                        C23952g.m125345j("trimAllCache MEDIUM", "sizeBeforeTrimming: " + size + ". sizeAfterTrimming: " + map3.size());
                    }
                    Map map4 = (Map) map.get(0);
                    if (map4 instanceof C3973f) {
                        ((C3973f) map4).m18819g(map4.size() / 2);
                    }
                    Map map5 = (Map) map.get(3);
                    if (map5 instanceof C3973f) {
                        ((C3973f) map5).m18819g(map5.size() / 2);
                    }
                    Map map6 = (Map) map.get(4);
                    if (map6 instanceof C3973f) {
                        ((C3973f) map6).m18819g(map6.size() / 2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: I2 */
    public static boolean m125690I2(String str) {
        if (!TextUtils.isEmpty(str) && f116216i1.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: J1 */
    public static void m125691J1(Activity activity, Context context, InterfaceC3968a interfaceC3968a, String str, Object obj, C24003n c24003n) {
        int i11;
        if (c24003n.f116265f) {
            c24003n.f116265f = false;
            i11 = 0;
        } else if (c24003n.f116284y) {
            c24003n.f116284y = false;
            i11 = 1;
        } else {
            i11 = -1;
        }
        m125697M1(activity, context, interfaceC3968a, str, c24003n.f116275p, c24003n.f116276q, c24003n.f116260a, c24003n.f116271l, c24003n.f116261b, c24003n.f116277r, c24003n.f116282w, c24003n.f116262c, c24003n.f116270k, c24003n.f116279t, obj, c24003n.f116278s, c24003n.f116264e, c24003n.f116274o, c24003n.f116263d, c24003n.f116266g, i11);
    }

    /* renamed from: J2 */
    public static boolean m125692J2(String str, InterfaceC3968a interfaceC3968a) {
        WeakHashMap weakHashMap = (WeakHashMap) f116217j1.get(str);
        if (weakHashMap == null) {
            return false;
        }
        return weakHashMap.keySet().contains(interfaceC3968a);
    }

    /* renamed from: K1 */
    public static void m125693K1(Activity activity, Context context, InterfaceC3968a interfaceC3968a, String str, Object obj, C24003n c24003n, int i11) {
        m125697M1(activity, context, interfaceC3968a, str, c24003n.f116275p, c24003n.f116276q, c24003n.f116260a, c24003n.f116271l, c24003n.f116261b, c24003n.f116277r, c24003n.f116282w, c24003n.f116262c, c24003n.f116270k, c24003n.f116279t, obj, c24003n.f116278s, c24003n.f116264e, i11, c24003n.f116263d, c24003n.f116266g, -1);
    }

    /* renamed from: K2 */
    public static boolean m125694K2(String str, int i11, int i12, EnumC25629a enumC25629a) {
        String m125752x2 = m125752x2(str, i11, i12, enumC25629a);
        if (m125742r2(2).containsKey(m125752x2) || m125742r2(1).containsKey(m125752x2) || m125742r2(0).containsKey(m125752x2) || m125742r2(3).containsKey(m125752x2) || m125742r2(4).containsKey(m125752x2)) {
            return true;
        }
        return false;
    }

    /* renamed from: L1 */
    public static void m125695L1(Activity activity, Context context, InterfaceC3968a interfaceC3968a, String str, boolean z11, boolean z12, int i11, int i12, Drawable drawable, Drawable drawable2, int i13, float f11, float f12, Object obj, int i14, int i15, int i16, EnumC25629a enumC25629a) {
        m125697M1(activity, context, interfaceC3968a, str, z11, z12, i11, i12, drawable, drawable2, null, i13, f11, f12, obj, i14, i15, i16, false, enumC25629a, -1);
    }

    /* renamed from: L2 */
    public static boolean m125696L2(String str, C24003n c24003n) {
        return m125694K2(str, c24003n.f116260a, c24003n.f116264e, c24003n.f116266g);
    }

    /* renamed from: M1 */
    public static void m125697M1(Activity activity, Context context, InterfaceC3968a interfaceC3968a, String str, boolean z11, boolean z12, int i11, int i12, Drawable drawable, Drawable drawable2, Rect rect, int i13, float f11, float f12, Object obj, int i14, int i15, int i16, boolean z13, EnumC25629a enumC25629a, int i17) {
        C3979l m125712V2 = z11 ? m125712V2(str, i11, i15, enumC25629a) : null;
        if (m125712V2 != null) {
            interfaceC3968a.setTag(1090453505, str);
            RunnableC3975h.m18829k(obj, str, false);
            m125730i3(interfaceC3968a, m125712V2, drawable, i12, i13, 1000, f11, f12, 4);
            return;
        }
        C23999j c23999j = new C23999j();
        if (i17 == 0) {
            c23999j.m125611h1(26005, 0);
        } else if (i17 == 1) {
            c23999j.m125611h1(26016, 99999);
        }
        ((C23999j) ((C23999j) ((C23999j) ((C23999j) ((C23999j) ((C23999j) c23999j.m125635v1(str)).m125763H2(interfaceC3968a).m125596P0(z11)).m125602Z(z12)).m125757D3(i11).m125777n2(i12).m125769Y2(drawable).m125766T2(drawable2).m125775h2(rect).m125762H1(i13).m125771a3(f11).m125760G1(f12).m125603Z0(obj)).m125600W0(i14)).m125774f3(i15).m125601Y0(i16)).m125773e3(z13).m125783y3(enumC25629a);
        if (activity != null) {
            c23999j.m125621p(activity);
        } else {
            c23999j.mo125623q(context);
        }
    }

    /* renamed from: M2 */
    public static /* synthetic */ void m125698M2(String str) {
        AbstractC20110a.m104535d("UPDATE PRIORITY: %s", str);
        AbstractRunnableC23992c.m125577u1(str);
    }

    /* renamed from: N1 */
    private C3979l m125699N1(String str, byte[] bArr) {
        return m125679B2(this.f116162u, this.f116236R0, this.f116127C.m125667r(), str, bArr, this.f116238w0, this.f116235Q0, false, this.f116224F0, this.f116228J0, this.f116233O0, this.f116222D0, this.f116234P0, this.f116229K0);
    }

    /* renamed from: N2 */
    public static /* synthetic */ void m125700N2(String str) {
        try {
            Thread.sleep(1000L);
            File m18745B = AbstractC3972e.m18745B(AbstractC3972e.m18807t(AbstractC3972e.m18812y(), 1), str);
            if (m18745B == null) {
                m18745B = AbstractC3972e.m18745B(AbstractC3972e.m18807t(AbstractC3972e.m18812y(), 0), str);
            }
            if (m18745B != null) {
                m18745B.delete();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O2 */
    public static /* synthetic */ void m125701O2(String str, int i11, int i12, EnumC25629a enumC25629a) {
        try {
            if (m125694K2(str, i11, i12, enumC25629a)) {
                m125709T1(str, i11, i12, enumC25629a);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P2 */
    private static void m125702P2(String str) {
    }

    /* renamed from: Q1 */
    private void m125703Q1(String str, InterfaceC3968a interfaceC3968a) {
        C23999j c23999j;
        WeakHashMap weakHashMap = (WeakHashMap) f116216i1.get(str);
        if (weakHashMap != null && weakHashMap.size() == 1 && (c23999j = (C23999j) weakHashMap.get(interfaceC3968a)) != null) {
            c23999j.m125586E();
        }
    }

    /* renamed from: Q2 */
    private static void m125704Q2(Map map, C3979l c3979l, String str) {
    }

    /* renamed from: R1 */
    private void m125705R1(C23999j c23999j, String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
        if (interfaceC3968a != null && c23999j != null) {
            if (str.equals(interfaceC3968a.getTag(1090453505))) {
                c23999j.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            }
            m125619m1(false);
        }
    }

    /* renamed from: R2 */
    private static Drawable m125706R2(Drawable drawable) {
        Drawable.ConstantState constantState;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: S1 */
    public static void m125707S1(String str, int i11, int i12, EnumC25629a enumC25629a) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: o3.h

            /* renamed from: p */
            public final /* synthetic */ String f116195p;

            public /* synthetic */ RunnableC23997h(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C23999j.m125700N2(r1);
            }
        });
        AbstractC3972e.m18777d0(new Runnable() { // from class: o3.i

            /* renamed from: p */
            public final /* synthetic */ String f116196p;

            /* renamed from: q */
            public final /* synthetic */ int f116197q;

            /* renamed from: r */
            public final /* synthetic */ int f116198r;

            /* renamed from: s */
            public final /* synthetic */ EnumC25629a f116199s;

            public /* synthetic */ RunnableC23998i(String str2, int i112, int i122, EnumC25629a enumC25629a2) {
                r1 = str2;
                r2 = i112;
                r3 = i122;
                r4 = enumC25629a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C23999j.m125701O2(r1, r2, r3, r4);
            }
        }, 10000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S2 */
    private static Drawable m125708S2(InterfaceC3968a interfaceC3968a, C3979l c3979l, float f11, float f12) {
        if (f11 > 0.0f && (interfaceC3968a instanceof ImageView)) {
            return new C3985r(interfaceC3968a.getResources(), c3979l.m18839c(), (ImageView) interfaceC3968a, f11, f12);
        }
        return new BitmapDrawable(interfaceC3968a.getResources(), c3979l.m18839c());
    }

    /* renamed from: T1 */
    static void m125709T1(String str, int i11, int i12, EnumC25629a enumC25629a) {
        String m125752x2 = m125752x2(str, i11, i12, enumC25629a);
        Map m125742r2 = m125742r2(2);
        if (m125742r2.containsKey(m125752x2)) {
            m125742r2.remove(m125752x2);
        }
        Map m125742r22 = m125742r2(3);
        if (m125742r22.containsKey(m125752x2)) {
            m125742r22.remove(m125752x2);
        }
        Map m125742r23 = m125742r2(1);
        if (m125742r23.containsKey(m125752x2)) {
            m125742r23.remove(m125752x2);
        }
        Map m125742r24 = m125742r2(0);
        if (m125742r24.containsKey(m125752x2)) {
            m125742r24.remove(m125752x2);
        }
        Map m125742r25 = m125742r2(4);
        if (m125742r25.containsKey(m125752x2)) {
            m125742r25.remove(m125752x2);
        }
    }

    /* renamed from: U1 */
    public static void m125710U1(String str, int i11, EnumC25629a enumC25629a) {
        m125709T1(str, i11, 0, enumC25629a);
    }

    /* renamed from: V1 */
    public static void m125711V1(String str, C24003n c24003n) {
        m125709T1(str, c24003n.f116260a, c24003n.f116264e, c24003n.f116266g);
    }

    /* renamed from: V2 */
    private static C3979l m125712V2(String str, int i11, int i12, EnumC25629a enumC25629a) {
        String m125752x2 = m125752x2(str, i11, i12, enumC25629a);
        Map m125742r2 = m125742r2(2);
        C3979l c3979l = (C3979l) m125742r2.get(m125752x2);
        if (c3979l == null) {
            m125742r2 = m125742r2(1);
            c3979l = (C3979l) m125742r2.get(m125752x2);
        }
        if (c3979l == null) {
            m125742r2 = m125742r2(0);
            c3979l = (C3979l) m125742r2.get(m125752x2);
        }
        if (c3979l == null) {
            Map m125742r22 = m125742r2(3);
            C3979l c3979l2 = (C3979l) m125742r22.get(m125752x2);
            if (c3979l2 != null && AbstractRunnableC23992c.m125568m0() == 200) {
                f116215h1.remove(3);
                c3979l = null;
                m125742r2 = m125742r22;
            } else {
                m125742r2 = m125742r22;
                c3979l = c3979l2;
            }
        }
        if (c3979l == null) {
            m125742r2 = m125742r2(4);
            c3979l = (C3979l) m125742r2.get(m125752x2);
        }
        m125704Q2(m125742r2, c3979l, m125752x2);
        return c3979l;
    }

    /* renamed from: W1 */
    public static void m125713W1() {
        m125715X1(2);
        m125715X1(1);
        m125715X1(0);
        m125715X1(3);
        m125715X1(4);
        C26117c.m134452a();
    }

    /* renamed from: W2 */
    public static void m125714W2(String str, int i11, int i12, C3979l c3979l, boolean z11, EnumC25629a enumC25629a, boolean z12, boolean z13) {
        Bitmap m18839c;
        Map m125742r2;
        if (c3979l == null || (m18839c = c3979l.m18839c()) == null) {
            return;
        }
        m125702P2("memPut: " + str + "\nbitmap=" + m18839c + "\ninvalid=" + z11);
        int width = m18839c.getWidth() * m18839c.getHeight();
        if (z12) {
            m125742r2 = m125742r2(2);
            m125702P2("memPut BCache");
        } else if (z13) {
            m125742r2 = m125742r2(4);
            m125702P2("memPut ICache");
        } else if (z11) {
            m125742r2 = m125742r2(3);
            m125702P2("memPut ICache");
        } else {
            int i13 = f116205X0;
            if (width <= i13 && i12 == 1002) {
                m125742r2 = m125742r2(1);
                m125702P2("memPut MCache");
            } else if (width <= i13) {
                m125742r2 = m125742r2(0);
                m125702P2("memPut SCache");
            } else if (width >= i13 && width <= f116206Y0) {
                m125742r2 = m125742r2(1);
                m125702P2("memPut MCache");
            } else {
                m125742r2 = m125742r2(2);
                m125702P2("memPut BCache");
            }
        }
        if (i11 <= 0 && i12 <= 0 && (enumC25629a == null || !enumC25629a.equals(EnumC25629a.IN_BITMAP))) {
            m125742r2.put(str, c3979l);
            m125702P2("memPut url: " + str);
        } else {
            String m125752x2 = m125752x2(str, i11, i12, enumC25629a);
            m125742r2.put(m125752x2, c3979l);
            m125702P2("memPut key: " + m125752x2);
            if (!m125742r2.containsKey(str)) {
                m125742r2.put(str, null);
            }
        }
        m125734l2();
    }

    /* renamed from: X1 */
    public static void m125715X1(int i11) {
        Map map = (Map) f116215h1.get(Integer.valueOf(i11));
        if (map != null) {
            m125716Y1(map);
        }
    }

    /* renamed from: Y1 */
    public static void m125716Y1(Map map) {
        try {
            ArrayList arrayList = new ArrayList();
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Map.Entry entry : map.entrySet()) {
                            C3979l c3979l = (C3979l) entry.getValue();
                            if (c3979l != null && c3979l.m18841e() <= 0) {
                                arrayList.add(entry);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            map.remove(((Map.Entry) it.next()).getKey());
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z2 */
    private String m125717Z2(String str, InterfaceC3968a interfaceC3968a) {
        String str2;
        Object tag = interfaceC3968a.getTag(1090453505);
        if (str.equals(tag) && this.f116221C0 == null) {
            return null;
        }
        if (tag != null && !str.equals(tag)) {
            str2 = tag.toString();
        } else {
            str2 = null;
        }
        interfaceC3968a.setTag(1090453505, str);
        if (this.f116221C0 != null) {
            m125594N0(interfaceC3968a.getContext());
            m125741q3(interfaceC3968a);
            AbstractC19164e.m100538x((byte) 2, AbstractC24621a.f118431a);
        } else if (this.f116232N0) {
            m125728h3(interfaceC3968a, null, true);
        }
        return str2;
    }

    /* renamed from: a2 */
    public static void m125718a2() {
        HashMap hashMap = f116216i1;
        synchronized (hashMap) {
            hashMap.clear();
            f116217j1.clear();
        }
    }

    /* renamed from: b2 */
    public static void m125719b2(String str, String str2, C24003n c24003n) {
        C3979l m125712V2;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && c24003n != null && (m125712V2 = m125712V2(str, c24003n.f116260a, c24003n.f116264e, c24003n.f116266g)) != null) {
                m125714W2(str2, c24003n.f116260a, c24003n.f116264e, m125712V2, false, c24003n.f116266g, c24003n.f116281v, c24003n.f116272m);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c2 */
    public static Bitmap m125720c2(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[width];
        int[] m18834b = AbstractC3976i.m18834b(-1, -16777216, height);
        for (int i11 = 0; i11 < height; i11++) {
            bitmap.getPixels(iArr, 0, width, 0, i11, width, 1);
            for (int i12 = 0; i12 < width; i12++) {
                iArr[i12] = (iArr[i12] & 16777215) | ((m18834b[i11] << 8) & (-16777216));
            }
            createBitmap.setPixels(iArr, 0, width, 0, i11, width, 1);
        }
        return createBitmap;
    }

    /* renamed from: c3 */
    public static Bitmap m125721c3(Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.getWidth() % 2 == 1 || bitmap.getHeight() % 2 == 1) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width % 2 == 1) {
                    width--;
                }
                if (height % 2 == 1) {
                    height--;
                }
                return Bitmap.createBitmap(bitmap, 0, 0, width, height);
            }
            return bitmap;
        }
        return bitmap;
    }

    /* renamed from: d2 */
    public static Bitmap m125722d2(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[width];
        int[] m18834b = AbstractC3976i.m18834b(-16777216, -8553091, width);
        for (int i11 = 0; i11 < height; i11++) {
            bitmap.getPixels(iArr, 0, width, 0, i11, width, 1);
            for (int i12 = 0; i12 < width; i12++) {
                iArr[i12] = (iArr[i12] & 16777215) | ((m18834b[i12] << 8) & (-16777216));
            }
            createBitmap.setPixels(iArr, 0, width, 0, i11, width, 1);
        }
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: d3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap m125723d3(String str, Bitmap bitmap) {
        int i11;
        C23257x1 m106833e;
        if (bitmap == null) {
            return null;
        }
        try {
            m106833e = new C20556f(str).m106833e();
        } catch (Exception e11) {
            AbstractC3972e.m18796n(e11);
        }
        if (m106833e != null) {
            i11 = m106833e.m119907h("Orientation", 1);
            if (i11 <= 1) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), m125682C2(i11), true);
                AbstractC3972e.m18794m("before", bitmap.getWidth() + ":" + bitmap.getHeight());
                AbstractC3972e.m18794m("after", createBitmap.getWidth() + ":" + createBitmap.getHeight());
                if (bitmap != createBitmap) {
                    bitmap.recycle();
                }
                return createBitmap;
            }
            return bitmap;
        }
        i11 = 1;
        if (i11 <= 1) {
        }
    }

    /* renamed from: e2 */
    public static Bitmap m125724e2(Bitmap bitmap, Bitmap bitmap2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == bitmap2.getWidth() && height == bitmap2.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            int[] iArr = new int[width];
            int[] iArr2 = new int[width];
            for (int i11 = 0; i11 < height; i11++) {
                int i12 = i11;
                bitmap.getPixels(iArr, 0, width, 0, i12, width, 1);
                bitmap2.getPixels(iArr2, 0, width, 0, i12, width, 1);
                for (int i13 = 0; i13 < width; i13++) {
                    iArr[i13] = (iArr[i13] & 16777215) | ((iArr2[i13] << 8) & (-16777216));
                }
                createBitmap.setPixels(iArr, 0, width, 0, i11, width, 1);
            }
            return createBitmap;
        }
        AbstractC3972e.m18794m("compositeBitmapWithMask", "image size mismatch!");
        throw new IllegalStateException("image size mismatch!");
    }

    /* renamed from: f2 */
    public static C3979l m125725f2(Bitmap bitmap, EnumC25629a enumC25629a) {
        if (bitmap == null) {
            return null;
        }
        return new C3979l(bitmap, enumC25629a);
    }

    /* renamed from: g2 */
    public static C3979l m125726g2(a aVar, EnumC25629a enumC25629a) {
        if (aVar != null && aVar.f116243b != null) {
            C3979l c3979l = new C3979l(aVar.m125815x(), aVar.m125816y(), aVar.m125808B(), aVar.m125810D(), aVar.m125812F(), aVar.m125811E(), aVar.m125809C(), enumC25629a);
            c3979l.m18851o(aVar.m125807A());
            c3979l.m18854r(aVar.m125813G());
            c3979l.m18850n(aVar.m125817z());
            c3979l.m18855s(aVar.m125814H());
            return c3979l;
        }
        return null;
    }

    /* renamed from: g3 */
    public static void m125727g3(int i11) {
        f116204W0 = i11;
        m125713W1();
    }

    /* renamed from: h3 */
    private void m125728h3(InterfaceC3968a interfaceC3968a, C3979l c3979l, boolean z11) {
        if (c3979l == null) {
            Drawable drawable = this.f116221C0;
            if (drawable == null) {
                interfaceC3968a.setImageDrawable(null);
                return;
            } else {
                interfaceC3968a.setImageDrawable(m125706R2(drawable));
                return;
            }
        }
        if (z11) {
            interfaceC3968a.setImageDrawable(m125708S2(interfaceC3968a, c3979l, this.f116223E0, this.f116226H0));
            return;
        }
        C23995f c23995f = this.f116127C;
        if (c23995f != null) {
            m125730i3(interfaceC3968a, c3979l, this.f116221C0, this.f116239x0, this.f116219A0, this.f116220B0, this.f116223E0, this.f116226H0, c23995f.m125666q());
        }
    }

    /* renamed from: i2 */
    private static a m125729i2(String str, C3979l.b bVar, String str2, byte[] bArr, BitmapFactory.Options options, boolean z11, EnumC25629a enumC25629a, int i11, long j11) {
        BitmapFactory.Options options2;
        a aVar;
        if (options == null) {
            options2 = new BitmapFactory.Options();
        } else {
            options2 = options;
        }
        if (!options2.inJustDecodeBounds && enumC25629a != null && enumC25629a.equals(EnumC25629a.IN_BITMAP)) {
            options2.inMutable = true;
            AbstractRunnableC23992c.m125569n(options2.outWidth, options2.outHeight, str2, options2);
        }
        if (str2 != null) {
            aVar = m125733k2(str, bVar, str2, options2, z11, i11, j11);
        } else if (bArr != null) {
            aVar = m125731j2(bArr, options2);
        } else {
            aVar = null;
        }
        if (aVar == null && !options2.inJustDecodeBounds) {
            AbstractC3972e.m18794m("decode image failed", str2);
        }
        return aVar;
    }

    /* renamed from: i3 */
    private static void m125730i3(InterfaceC3968a interfaceC3968a, C3979l c3979l, Drawable drawable, int i11, int i12, int i13, float f11, float f12, int i14) {
        Animation loadAnimation;
        Drawable drawable2;
        if (m125740q2(interfaceC3968a, c3979l, i11) == null) {
            interfaceC3968a.setImageBitmap(null);
            return;
        }
        Drawable m125708S2 = m125708S2(interfaceC3968a, c3979l, f11, f12);
        Drawable drawable3 = m125708S2;
        if (m125736m2(i12, i14)) {
            if (drawable == null) {
                loadAnimation = new AlphaAnimation(0.0f, 1.0f);
                loadAnimation.setInterpolator(new DecelerateInterpolator());
                loadAnimation.setDuration(i13);
                drawable2 = m125708S2;
            } else {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{m125706R2(drawable), m125708S2});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(i13);
                drawable3 = transitionDrawable;
                loadAnimation = null;
                drawable2 = drawable3;
            }
        } else {
            if (i12 > 0) {
                loadAnimation = AnimationUtils.loadAnimation(interfaceC3968a.getContext(), i12);
                drawable2 = m125708S2;
            }
            loadAnimation = null;
            drawable2 = drawable3;
        }
        if (interfaceC3968a instanceof RecyclingImageView) {
            interfaceC3968a.setImageInfo(c3979l, false);
        }
        interfaceC3968a.setImageDrawable(drawable2);
        if (loadAnimation != null) {
            loadAnimation.setStartTime(AnimationUtils.currentAnimationTimeMillis());
            interfaceC3968a.startAnimation(loadAnimation);
        } else {
            interfaceC3968a.setAnimation(null);
        }
    }

    /* renamed from: j2 */
    private static a m125731j2(byte[] bArr, BitmapFactory.Options options) {
        a aVar = new a();
        try {
            if (AbstractC23258x2.m119952k(bArr)) {
                aVar.f116245d = C3979l.a.JXL;
                long currentTimeMillis = System.currentTimeMillis();
                if (options.inJustDecodeBounds) {
                    ZJXLDecoder.Options options2 = new ZJXLDecoder.Options();
                    options2.f88636a = true;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    double m92546f = ZJXLDecoder.m92546f(bArr, options2);
                    int m92544d = ZJXLDecoder.m92544d(m92546f);
                    if (m92544d == 0) {
                        options.outWidth = options2.bmPreviewWidth;
                        options.outHeight = options2.bmPreviewHeight;
                        long m92547g = ZJXLDecoder.m92547g(m92546f);
                        AbstractC20887g.m109216C(16869, "", currentTimeMillis2, currentTimeMillis2 + m92547g, m92547g);
                    } else {
                        AbstractC20887g.m109241s(16869, "" + m92544d, currentTimeMillis2);
                        AbstractC20110a.m104543l("[JXL]").mo104548a("ZJXLDecoder.getInfoFromFile fail: %s", Integer.valueOf(m92544d));
                    }
                } else {
                    Bitmap bitmap = options.inBitmap;
                    if (bitmap == null) {
                        int i11 = options.outWidth;
                        int i12 = options.inSampleSize;
                        bitmap = Bitmap.createBitmap(i11 / i12, options.outHeight / i12, Bitmap.Config.ARGB_8888);
                    }
                    aVar.f116251j = System.currentTimeMillis();
                    double m92542b = ZJXLDecoder.m92542b(bArr, options.inSampleSize, bitmap);
                    aVar.f116250i = ZJXLDecoder.m92544d(m92542b);
                    if (aVar.f116250i == 0) {
                        long m92547g2 = ZJXLDecoder.m92547g(m92542b);
                        aVar.f116252k = aVar.f116251j + m92547g2;
                        aVar.f116244c = m92547g2;
                        aVar.f116249h = System.currentTimeMillis() - currentTimeMillis;
                        aVar.f116243b = bitmap;
                    } else {
                        return null;
                    }
                }
            } else {
                aVar.f116251j = System.currentTimeMillis();
                aVar.f116245d = C3979l.a.JPEG;
                aVar.f116243b = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                aVar.f116252k = System.currentTimeMillis();
                aVar.f116244c = aVar.f116252k - aVar.f116251j;
                aVar.f116249h = aVar.f116252k - aVar.f116251j;
            }
            aVar.f116248g = options.outWidth * options.outHeight;
            aVar.f116247f = bArr.length;
        } catch (Exception e11) {
            AbstractC3972e.m18779e0(e11);
        }
        return aVar;
    }

    /* renamed from: j3 */
    public static void m125732j3(int i11) {
        f116203V0 = i11;
        m125713W1();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|2|3|4|(3:108|109|(12:111|112|(3:114|(1:116)(1:119)|117)(4:120|(1:122)|123|(1:125)(3:126|127|128))|118|22|(2:26|(5:28|29|30|31|(2:33|(2:35|(4:39|40|41|(1:(2:43|(2:46|47)(1:45))(1:48)))(0))(1:54))(2:55|(1:57)(0)))(0))(0)|62|(1:65)|66|(1:70)|72|73))|6|7|8|(3:89|90|(2:92|93)(5:94|95|96|(1:100)|102))(4:12|13|(1:15)(1:88)|16)|17|18|(1:20)(1:75)|21|22|(3:24|26|(0)(0))(0)|62|(1:65)|66|(2:68|70)|72|73|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03fb, code lost:            p248iy.AbstractC20887g.m109229g(21100, -1, "detectDamagedPhoto: " + r30);        p248iy.AbstractC20887g.m109237o(21100);     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0304, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0305, code lost:            r1 = r0;        r7 = r16;     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x036d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: k2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a m125733k2(String str, C3979l.b bVar, String str2, BitmapFactory.Options options, boolean z11, int i11, long j11) {
        Throwable th2;
        ParcelFileDescriptor parcelFileDescriptor;
        Exception exc;
        String str3;
        BitmapFactory.Options options2;
        String str4;
        ParcelFileDescriptor parcelFileDescriptor2;
        File file;
        long nanoTime;
        String str5;
        String str6;
        String str7;
        String str8;
        a aVar = new a();
        try {
            aVar.f116242a = str;
            aVar.f116246e = bVar;
            aVar.f116247f = new C20556f(str2).m106845r();
        } catch (Exception e11) {
            exc = e11;
            parcelFileDescriptor = null;
        } catch (Throwable th3) {
            th2 = th3;
            parcelFileDescriptor = null;
        }
        try {
            if (!AbstractC23254w8.m119859g(str2)) {
                try {
                } catch (Exception e12) {
                    exc = e12;
                    parcelFileDescriptor = null;
                    try {
                        AbstractC3972e.m18779e0(exc);
                        AbstractC29237l.m145996a(parcelFileDescriptor);
                        return aVar;
                    } catch (Throwable th4) {
                        th2 = th4;
                        AbstractC29237l.m145996a(parcelFileDescriptor);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    parcelFileDescriptor = null;
                    AbstractC29237l.m145996a(parcelFileDescriptor);
                    throw th2;
                }
                if (AbstractC23258x2.m119952k(AbstractC23258x2.m119944c(new C20556f(str2).m106838k()))) {
                    aVar.f116245d = C3979l.a.JXL;
                    long nanoTime2 = System.nanoTime();
                    if (options.inJustDecodeBounds) {
                        ZJXLDecoder.Options options3 = new ZJXLDecoder.Options();
                        options3.f88636a = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        double m92545e = ZJXLDecoder.m92545e(str2, options3);
                        int m92544d = ZJXLDecoder.m92544d(m92545e);
                        if (m92544d == 0) {
                            int m92547g = ZJXLDecoder.m92547g(m92545e);
                            AbstractC20110a.m104543l("[JXL]").mo104548a(str + ", getInfoFromFile in : " + m92547g + "ms, width/height: " + options3.bmPreviewWidth + "/" + options3.bmPreviewHeight, new Object[0]);
                            long j12 = (long) m92547g;
                            AbstractC20887g.m109216C(16869, "", currentTimeMillis, currentTimeMillis + j12, j12);
                            options.outWidth = options3.bmPreviewWidth;
                            options.outHeight = options3.bmPreviewHeight;
                        } else {
                            AbstractC20110a.m104543l("[JXL]").mo104548a("ZJXLDecoder.getInfoFromFile fail: path=" + str2 + ", err=" + m92544d, new Object[0]);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("");
                            sb2.append(m92544d);
                            AbstractC20887g.m109241s(16869, sb2.toString(), currentTimeMillis);
                        }
                        str3 = "BitmapAjaxCallback";
                    } else {
                        Bitmap bitmap = options.inBitmap;
                        if (bitmap == null) {
                            int i12 = options.outWidth;
                            int i13 = options.inSampleSize;
                            bitmap = Bitmap.createBitmap(i12 / i13, options.outHeight / i13, Bitmap.Config.ARGB_8888);
                        }
                        double m92543c = ZJXLDecoder.m92543c(str2, options.inSampleSize, bitmap);
                        aVar.f116250i = ZJXLDecoder.m92544d(m92543c);
                        str3 = "BitmapAjaxCallback";
                        aVar.f116251j = System.currentTimeMillis();
                        if (aVar.f116250i == 0) {
                            int m92547g2 = ZJXLDecoder.m92547g(m92543c);
                            long j13 = m92547g2;
                            aVar.f116252k = aVar.f116251j + j13;
                            aVar.f116244c = j13;
                            aVar.f116249h = (System.nanoTime() - nanoTime2) / 1000000;
                            aVar.f116253l = System.currentTimeMillis() - j11;
                            AbstractC20110a.m104543l("[JXL]").mo104548a(str + ", decodeImageFile in : " + m92547g2 + "ms, fullDecodeTime = " + aVar.f116249h + "ms, size on Disk: " + aVar.f116247f + ", totalTime: " + aVar.f116253l, new Object[0]);
                            aVar.f116243b = bitmap;
                        } else {
                            AbstractC20887g.m109241s(16868, "" + aVar.f116250i, aVar.f116251j);
                            AbstractC20110a.m104543l("[JXL]").mo104548a("ZJXLDecoder.decodeImageFile fail: path=" + str2 + ", err=" + aVar.f116250i, new Object[0]);
                            AbstractC29237l.m145996a(null);
                            return null;
                        }
                    }
                    options2 = options;
                    str4 = str3;
                    parcelFileDescriptor2 = null;
                    aVar.f116248g = options2.outWidth * options2.outHeight;
                    if (!options2.inJustDecodeBounds && !str2.startsWith("content://")) {
                        file = new File(str2);
                        if (!AbstractC23258x2.m119957p(file, true)) {
                            try {
                                AbstractC20110a.m104543l(str4).mo104548a("Invalid image: " + str, new Object[0]);
                                Thread.sleep(10L);
                            } catch (InterruptedException e13) {
                                AbstractC20110a.m104539h(e13);
                            }
                            if (!AbstractC23258x2.m119957p(file, true)) {
                                AbstractC20110a.m104543l(str4).mo104548a("Still invalid image after retrying: " + str, new Object[0]);
                                Bitmap bitmap2 = aVar.f116243b;
                                if (bitmap2 != null) {
                                    if (bitmap2.getWidth() > 10 && bitmap2.getHeight() > 10) {
                                        try {
                                            int[] iArr = new int[100];
                                            bitmap2.getPixels(iArr, 0, 10, bitmap2.getWidth() - 10, bitmap2.getHeight() - 10, 10, 10);
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 >= 100) {
                                                    break;
                                                }
                                                if (((iArr[i14] | (-16777216)) ^ (-16777216)) != 0) {
                                                    break;
                                                }
                                                i14++;
                                            }
                                        } catch (Exception e14) {
                                            AbstractC23350e.m122778h(e14);
                                        }
                                    }
                                } else {
                                    AbstractC20887g.m109237o(21101);
                                }
                            } else if (aVar.f116243b == null) {
                                AbstractC20110a.m104535d("detectDamagedPhoto (can't decode): %s", str);
                                AbstractC20887g.m109237o(21101);
                            }
                        }
                    }
                    if (aVar.f116243b != null && z11) {
                        aVar.f116243b = m125723d3(str2, aVar.f116243b);
                    }
                    if (!bVar.equals(C3979l.b.UNKNOWN) && !options2.inJustDecodeBounds) {
                        AbstractC20110a.m104543l("BitmapDecodeFile").mo104554k("Url = %s, format = %s, type = %s, size on disk = %s, size in pixel = %s, decode time = %s, full decode time = %s", str, aVar.f116245d, aVar.f116246e, Long.valueOf(aVar.f116247f), Long.valueOf(aVar.f116248g), Long.valueOf(aVar.f116244c), Long.valueOf(aVar.f116249h));
                    }
                    AbstractC29237l.m145996a(parcelFileDescriptor2);
                    return aVar;
                }
            }
            long nanoTime3 = (System.nanoTime() - nanoTime) / 1000000;
            if (options2.inJustDecodeBounds) {
                AbstractC20110a.m104543l("[JPEG]").mo104548a(str + ", getInfoFromFile in : " + nanoTime3 + str8 + options2.outWidth + str7 + options2.outHeight, new Object[0]);
            } else {
                AbstractC20110a.m104543l("[JPEG]").mo104548a(str + str6 + nanoTime3 + str5 + aVar.f116247f, new Object[0]);
            }
            aVar.f116244c = nanoTime3;
            aVar.f116249h = nanoTime3;
            aVar.f116252k = System.currentTimeMillis();
            aVar.f116253l = System.currentTimeMillis() - j11;
            aVar.f116248g = options2.outWidth * options2.outHeight;
            if (!options2.inJustDecodeBounds) {
                file = new File(str2);
                if (!AbstractC23258x2.m119957p(file, true)) {
                }
            }
            if (aVar.f116243b != null) {
                aVar.f116243b = m125723d3(str2, aVar.f116243b);
            }
            if (!bVar.equals(C3979l.b.UNKNOWN)) {
                AbstractC20110a.m104543l("BitmapDecodeFile").mo104554k("Url = %s, format = %s, type = %s, size on disk = %s, size in pixel = %s, decode time = %s, full decode time = %s", str, aVar.f116245d, aVar.f116246e, Long.valueOf(aVar.f116247f), Long.valueOf(aVar.f116248g), Long.valueOf(aVar.f116244c), Long.valueOf(aVar.f116249h));
            }
            AbstractC29237l.m145996a(parcelFileDescriptor2);
            return aVar;
        } catch (Throwable th6) {
            th2 = th6;
            parcelFileDescriptor = parcelFileDescriptor2;
            AbstractC29237l.m145996a(parcelFileDescriptor);
            throw th2;
        }
        aVar.f116245d = C3979l.a.JPEG;
        nanoTime = System.nanoTime();
        aVar.f116251j = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 29 && !AbstractC23254w8.m119859g(str2)) {
            aVar.f116243b = BitmapFactory.decodeFile(str2, options);
            options2 = options;
            str4 = "BitmapAjaxCallback";
            if (!options2.inJustDecodeBounds) {
                str5 = "ms, size on Disk: ";
                str6 = ", decodeImageFile in : ";
                str7 = "/";
                AbstractC20110a.b m104543l = AbstractC20110a.m104543l("[JPEG]");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("url = ");
                sb3.append(str);
                sb3.append(", BitmapFactory.decodeFile in : ");
                str8 = "ms, width/height: ";
                sb3.append((System.nanoTime() - nanoTime) / 1000000);
                sb3.append("ms");
                m104543l.mo104548a(sb3.toString(), new Object[0]);
            } else {
                AbstractC20110a.b m104543l2 = AbstractC20110a.m104543l("[JPEG]");
                str5 = "ms, size on Disk: ";
                StringBuilder sb4 = new StringBuilder();
                sb4.append("url = ");
                sb4.append(str);
                sb4.append(", inJustDecodeBounds with BitmapFactory.decodeFile in : ");
                str6 = ", decodeImageFile in : ";
                str7 = "/";
                sb4.append((System.nanoTime() - nanoTime) / 1000000);
                sb4.append("ms");
                m104543l2.mo104548a(sb4.toString(), new Object[0]);
                str8 = "ms, width/height: ";
            }
            parcelFileDescriptor2 = null;
        } else {
            options2 = options;
            str4 = "BitmapAjaxCallback";
            str5 = "ms, size on Disk: ";
            str6 = ", decodeImageFile in : ";
            str7 = "/";
            str8 = "ms, width/height: ";
            ParcelFileDescriptor m106841n = new C20556f(str2).m106841n();
            if (m106841n != null) {
                try {
                    aVar.f116243b = BitmapFactory.decodeFileDescriptor(m106841n.getFileDescriptor(), null, options2);
                    if (aVar.f116243b == null && !options2.inJustDecodeBounds) {
                        aVar.f116243b = m125738o2(str2, i11);
                    }
                    parcelFileDescriptor2 = m106841n;
                } catch (Exception e15) {
                    exc = e15;
                    parcelFileDescriptor = m106841n;
                    AbstractC3972e.m18779e0(exc);
                    AbstractC29237l.m145996a(parcelFileDescriptor);
                    return aVar;
                } catch (Throwable th7) {
                    th2 = th7;
                    parcelFileDescriptor = m106841n;
                    AbstractC29237l.m145996a(parcelFileDescriptor);
                    throw th2;
                }
            } else {
                AbstractC29237l.m145996a(m106841n);
                return null;
            }
        }
    }

    /* renamed from: l2 */
    public static void m125734l2() {
    }

    /* renamed from: l3 */
    public static void m125735l3(boolean z11) {
        f116200S0 = z11;
    }

    /* renamed from: m2 */
    private static boolean m125736m2(int i11, int i12) {
        if (i11 != -4) {
            if (i11 != -3) {
                if (i11 != -2) {
                    return i11 == -1;
                }
            } else if (i12 == 3) {
                return true;
            }
            if (i12 == 1) {
                return true;
            }
        }
        return i12 == 1 || i12 == 3;
    }

    /* renamed from: m3 */
    public static void m125737m3(boolean z11) {
        f116213f1 = z11;
    }

    /* renamed from: o2 */
    private static Bitmap m125738o2(String str, int i11) {
        if (TextUtils.isEmpty(str) || !AbstractC3972e.m18776d(str)) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                Bitmap thumb = ZAnimation.getThumb(C26251c.f124664a.m134985d(str, fileInputStream), i11);
                fileInputStream.close();
                return thumb;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: p3 */
    public static void m125739p3(int i11) {
        f116201T0 = i11;
        m125713W1();
    }

    /* renamed from: q2 */
    private static Bitmap m125740q2(InterfaceC3968a interfaceC3968a, C3979l c3979l, int i11) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (c3979l != null) {
            bitmap = c3979l.m18839c();
        } else {
            bitmap = null;
        }
        if (bitmap == null || bitmap.getWidth() != 1 || bitmap.getHeight() != 1 || bitmap == f116218k1) {
            bitmap2 = bitmap;
        }
        if (bitmap2 != null) {
            interfaceC3968a.setVisibility(0);
        } else if (i11 == -2) {
            interfaceC3968a.setVisibility(8);
        } else if (i11 == -1) {
            interfaceC3968a.setVisibility(4);
        }
        return bitmap2;
    }

    /* renamed from: q3 */
    private void m125741q3(InterfaceC3968a interfaceC3968a) {
        interfaceC3968a.setImageDrawable(m125706R2(this.f116221C0));
    }

    /* renamed from: r2 */
    public static Map m125742r2(int i11) {
        Map map = f116215h1;
        Map map2 = (Map) map.get(Integer.valueOf(i11));
        if (map2 == null) {
            synchronized (C23999j.class) {
                try {
                    map2 = (Map) map.get(Integer.valueOf(i11));
                    if (map2 == null) {
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 == 4) {
                                            map2 = Collections.synchronizedMap(new C3973f(f116204W0, f116207Z0, f116210c1, EnumC25103a.BackgroundCache));
                                        }
                                    } else {
                                        map2 = Collections.synchronizedMap(new C3973f(100, f116207Z0, 250000, EnumC25103a.InvalidCache));
                                    }
                                } else {
                                    map2 = Collections.synchronizedMap(new C3973f(f116203V0, f116207Z0, f116210c1, EnumC25103a.BigCache));
                                }
                            } else {
                                map2 = Collections.synchronizedMap(new C3973f(f116202U0, f116206Y0, f116209b1, EnumC25103a.MediumCache));
                            }
                        } else {
                            map2 = Collections.synchronizedMap(new C3973f(f116201T0, f116205X0, f116208a1, EnumC25103a.SmallCache));
                        }
                        map.put(Integer.valueOf(i11), map2);
                    }
                } finally {
                }
            }
        }
        return map2;
    }

    /* renamed from: s2 */
    public static Bitmap m125743s2(Bitmap bitmap) {
        int width;
        int width2;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            width = bitmap.getHeight();
            width2 = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
            width2 = bitmap.getWidth();
        }
        return m125687E2(bitmap, width / 2, width, width2, true);
    }

    /* renamed from: t2 */
    public static Bitmap m125744t2(Bitmap bitmap) {
        int width;
        int width2;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            width = bitmap.getHeight();
            width2 = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
            width2 = bitmap.getWidth();
        }
        return m125687E2(bitmap, width / 2, width, width2, true);
    }

    /* renamed from: t3 */
    public static void m125745t3(int i11) {
        f116209b1 = i11;
        m125713W1();
    }

    /* renamed from: u2 */
    public static Bitmap m125746u2(Bitmap bitmap) {
        int width;
        int width2;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            width = bitmap.getHeight();
            width2 = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
            width2 = bitmap.getWidth();
        }
        Bitmap m125687E2 = m125687E2(bitmap, width / 2, width, width2, true);
        float f11 = width / 30.0f;
        float f12 = f11 / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(Math.round(width + r6), Math.round(width2 + r6), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int width3 = m125687E2.getWidth();
        int height = m125687E2.getHeight();
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(null);
        paint.setColor(-2143769641);
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.STROKE);
        float f13 = ((int) (f11 * 2.0f)) / 2.0f;
        RectF rectF = new RectF(f13, f13, width3, height);
        paint.setAlpha(48);
        paint.setShadowLayer(f11, f12, f12, -16777216);
        paint.setAlpha(255);
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, -16777216);
        canvas.drawBitmap(m125687E2, new Rect(0, 0, width3, height), rectF, paint);
        return createBitmap;
    }

    /* renamed from: u3 */
    public static void m125747u3(int i11) {
        f116210c1 = i11;
        m125713W1();
    }

    /* renamed from: v2 */
    public static Bitmap m125748v2(Bitmap bitmap, Rect rect) {
        if (bitmap != null && rect != null) {
            if (!new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()).contains(rect)) {
                return bitmap;
            }
            Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, rect, new Rect(0, 0, rect.width(), rect.height()), (Paint) null);
            return createBitmap;
        }
        return bitmap;
    }

    /* renamed from: v3 */
    public static void m125749v3(int i11) {
        f116208a1 = i11;
        m125713W1();
    }

    /* renamed from: w2 */
    private C3979l m125750w2() {
        if (((InterfaceC3968a) this.f116237v0.get()) != null) {
            String num = Integer.toString(this.f116239x0);
            C3979l mo125597Q0 = mo125597Q0(num);
            if (mo125597Q0 == null) {
                C3979l m125725f2 = m125725f2(AbstractC3972e.m18800p(AbstractC19694b.m103336d(AbstractC3972e.m18812y(), this.f116239x0)), EnumC25629a.DEFAULT);
                if (m125725f2 != null) {
                    mo125598R0(num, m125725f2);
                    return m125725f2;
                }
                return m125725f2;
            }
            return mo125597Q0;
        }
        return null;
    }

    /* renamed from: w3 */
    public static void m125751w3(int i11) {
        f116202U0 = i11;
        m125713W1();
    }

    /* renamed from: x2 */
    private static String m125752x2(String str, int i11, int i12, EnumC25629a enumC25629a) {
        int i13 = 20;
        if (str != null) {
            i13 = 20 + str.length();
        }
        StringBuilder sb2 = new StringBuilder(i13);
        sb2.append(str);
        if (i11 > 0) {
            sb2.append("#");
            sb2.append(i11);
        }
        if (i12 > 0) {
            sb2.append("#");
            sb2.append(i12);
        }
        if (enumC25629a == EnumC25629a.IN_BITMAP) {
            sb2.append("#reusable");
        }
        return sb2.toString();
    }

    /* renamed from: x3 */
    public static void m125753x3(int i11) {
        f116206Y0 = i11;
        m125713W1();
    }

    /* renamed from: y2 */
    public static int m125754y2() {
        return f116210c1 + f116209b1 + f116208a1;
    }

    /* renamed from: z2 */
    public static C3979l m125755z2(String str, int i11, int i12, EnumC25629a enumC25629a) {
        return m125712V2(str, i11, i12, enumC25629a);
    }

    /* renamed from: z3 */
    public static void m125756z3(boolean z11) {
        f116214g1 = z11;
    }

    /* renamed from: D3 */
    public C23999j m125757D3(int i11) {
        this.f116238w0 = i11;
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: E3 */
    public C3979l mo125625q1(String str, byte[] bArr, C23995f c23995f) {
        String str2;
        m125702P2("transform:" + str);
        File m125662m = c23995f.m125662m();
        if (m125662m != null) {
            str2 = m125662m.getAbsolutePath();
        } else {
            str2 = null;
        }
        C3979l m125699N1 = m125699N1(str2, bArr);
        if (m125699N1 == null) {
            if (this.f116239x0 > 0) {
                m125699N1 = m125750w2();
            }
            if (c23995f.m125657h() != 200) {
                this.f116227I0 = true;
            }
        }
        return m125699N1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:5:0x0003, B:7:0x0015, B:11:0x0023, B:12:0x002b, B:14:0x0031, B:17:0x003f, B:22:0x0043, B:27:0x001e), top: B:4:0x0003, outer: #0 }] */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void mo125587F() {
        try {
            HashMap hashMap = f116216i1;
            synchronized (hashMap) {
                try {
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(this.f116162u);
                    InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116237v0.get();
                    if (weakHashMap != null) {
                        if (!weakHashMap.containsKey(interfaceC3968a)) {
                        }
                        if (weakHashMap != null) {
                            Iterator it = weakHashMap.keySet().iterator();
                            while (it.hasNext()) {
                                C23999j c23999j = (C23999j) weakHashMap.get((InterfaceC3968a) it.next());
                                if (c23999j != null) {
                                    c23999j.m125638x();
                                }
                            }
                        }
                    }
                    m125638x();
                    if (weakHashMap != null) {
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: F2 */
    protected Bitmap m125759F2(String str) {
        BitmapFactory.Options options;
        int m117969t;
        if (this.f116238w0 > 0) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            m125729i2(null, C3979l.b.UNKNOWN, str, null, options2, false, EnumC25629a.DEFAULT, this.f116238w0, this.f116127C.m125667r());
            if (f116200S0 && !this.f116235Q0) {
                m117969t = AbstractC23009a3.m117970u(options2.outWidth, options2.outHeight, this.f116238w0);
            } else {
                m117969t = AbstractC23009a3.m117969t(Math.max(options2.outWidth, options2.outHeight), this.f116238w0);
            }
            BitmapFactory.Options options3 = new BitmapFactory.Options();
            options3.inSampleSize = m117969t;
            options = options3;
        } else {
            options = null;
        }
        try {
            a m125729i2 = m125729i2(null, C3979l.b.UNKNOWN, str, null, options, true, EnumC25629a.DEFAULT, this.f116238w0, this.f116127C.m125667r());
            if (m125729i2 == null) {
                return null;
            }
            return m125729i2.m125815x();
        } catch (OutOfMemoryError e11) {
            m125713W1();
            AbstractC3972e.m18779e0(e11);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x0003, B:7:0x0013, B:11:0x0021, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:22:0x0041, B:27:0x001c), top: B:4:0x0003, outer: #1 }] */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo125589G(String str, int i11) {
        try {
            HashMap hashMap = f116216i1;
            synchronized (hashMap) {
                try {
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(str);
                    InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116237v0.get();
                    if (weakHashMap != null) {
                        if (!weakHashMap.containsKey(interfaceC3968a)) {
                        }
                        if (weakHashMap != null) {
                            Iterator it = weakHashMap.keySet().iterator();
                            while (it.hasNext()) {
                                C23999j c23999j = (C23999j) weakHashMap.get((InterfaceC3968a) it.next());
                                if (c23999j != null) {
                                    c23999j.m125640y(str, i11);
                                }
                            }
                        }
                    }
                    m125640y(str, i11);
                    if (weakHashMap != null) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: G1 */
    public C23999j m125760G1(float f11) {
        this.f116226H0 = f11;
        return this;
    }

    /* renamed from: G2 */
    public C23999j m125761G2(C3979l.b bVar) {
        this.f116236R0 = bVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x0003, B:7:0x0013, B:11:0x0021, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:22:0x0041, B:27:0x001c), top: B:4:0x0003, outer: #1 }] */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo125591H(String str, int i11) {
        try {
            HashMap hashMap = f116216i1;
            synchronized (hashMap) {
                try {
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(str);
                    InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116237v0.get();
                    if (weakHashMap != null) {
                        if (!weakHashMap.containsKey(interfaceC3968a)) {
                        }
                        if (weakHashMap != null) {
                            Iterator it = weakHashMap.keySet().iterator();
                            while (it.hasNext()) {
                                C23999j c23999j = (C23999j) weakHashMap.get((InterfaceC3968a) it.next());
                                if (c23999j != null) {
                                    c23999j.m125641z(str, i11);
                                }
                            }
                        }
                    }
                    m125641z(str, i11);
                    if (weakHashMap != null) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: H1 */
    public C23999j m125762H1(int i11) {
        this.f116219A0 = i11;
        return this;
    }

    /* renamed from: H2 */
    public C23999j m125763H2(InterfaceC3968a interfaceC3968a) {
        this.f116237v0 = new WeakReference(interfaceC3968a);
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: I */
    public final void mo125592I(String str) {
        m125707S1(str, this.f116238w0, this.f116224F0, this.f116229K0);
    }

    /* renamed from: I1 */
    public C23999j m125764I1(int i11) {
        if (i11 <= 0) {
            i11 = 1000;
        }
        this.f116220B0 = i11;
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: J0 */
    protected boolean mo125593J0() {
        return !f116211d1;
    }

    /* renamed from: O1 */
    public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
        m125728h3(interfaceC3968a, c3979l, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:5:0x0003, B:7:0x0019, B:11:0x002d, B:12:0x0035, B:14:0x003b, B:17:0x004b, B:19:0x0051, B:30:0x0057, B:22:0x0061, B:25:0x008d, B:36:0x0097, B:37:0x009a, B:42:0x0023), top: B:4:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:5:0x0003, B:7:0x0019, B:11:0x002d, B:12:0x0035, B:14:0x003b, B:17:0x004b, B:19:0x0051, B:30:0x0057, B:22:0x0061, B:25:0x008d, B:36:0x0097, B:37:0x009a, B:42:0x0023), top: B:4:0x0003, outer: #1 }] */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: P1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1932C(String str, C3979l c3979l, C23995f c23995f) {
        try {
            HashMap hashMap = f116216i1;
            synchronized (hashMap) {
                try {
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.remove(str);
                    f116217j1.remove(str);
                    InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116237v0.get();
                    if (weakHashMap != null) {
                        if (!weakHashMap.containsKey(interfaceC3968a)) {
                        }
                        if (weakHashMap != null) {
                            for (InterfaceC3968a interfaceC3968a2 : weakHashMap.keySet()) {
                                C23999j c23999j = (C23999j) weakHashMap.get(interfaceC3968a2);
                                if (c23999j != null) {
                                    if (this.f116238w0 == c23999j.f116238w0 && this.f116224F0 == c23999j.f116224F0) {
                                        c23999j.f116127C = c23995f;
                                        m125705R1(c23999j, str, interfaceC3968a2, c3979l, c23995f);
                                    } else {
                                        AbstractC20110a.m104535d("** BITMAP ASYNC: " + str + " " + c23999j + " ", new Object[0]);
                                        if (!c23999j.f116149Y.get()) {
                                            c23999j.mo125623q(interfaceC3968a2.getContext());
                                        }
                                    }
                                }
                            }
                        }
                        if (c3979l != null) {
                            c3979l.m18838b();
                        }
                    }
                    m125705R1(this, str, interfaceC3968a, c3979l, c23995f);
                    if (weakHashMap != null) {
                    }
                    if (c3979l != null) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: T2 */
    public C23999j m125766T2(Drawable drawable) {
        this.f116222D0 = drawable;
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: U2 */
    public C3979l mo125597Q0(String str) {
        Drawable drawable = this.f116241z0;
        if (drawable != null) {
            return m125725f2(AbstractC3972e.m18800p(drawable), EnumC25629a.DEFAULT);
        }
        if (!this.f116131G) {
            return null;
        }
        return m125712V2(str, this.f116238w0, this.f116224F0, this.f116229K0);
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: X2 */
    public void mo125598R0(String str, C3979l c3979l) {
        m125714W2(str, this.f116238w0, this.f116224F0, c3979l, this.f116227I0, this.f116229K0, this.f116230L0, this.f116231M0);
    }

    /* renamed from: Y2 */
    public C23999j m125769Y2(Drawable drawable) {
        if (drawable != null) {
            this.f116221C0 = drawable;
        }
        return this;
    }

    /* renamed from: Z1 */
    public void m125770Z1() {
        C23995f c23995f;
        HashMap hashMap = f116216i1;
        synchronized (hashMap) {
            try {
                try {
                    m125702P2("clearTask:" + m125633u0());
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(m125633u0());
                    if (weakHashMap != null) {
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC3968a interfaceC3968a : weakHashMap.keySet()) {
                            C23999j c23999j = (C23999j) weakHashMap.get(interfaceC3968a);
                            if (c23999j != null && (c23995f = c23999j.f116127C) != null && c23995f.m125669t()) {
                            }
                            arrayList.add(interfaceC3968a);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            weakHashMap.remove((InterfaceC3968a) it.next());
                        }
                        if (weakHashMap.isEmpty()) {
                            f116216i1.remove(m125633u0());
                            f116217j1.remove(m125633u0());
                        }
                    } else {
                        hashMap.remove(m125633u0());
                        f116217j1.remove(m125633u0());
                    }
                } catch (Exception e11) {
                    f116216i1.remove(m125633u0());
                    f116217j1.remove(m125633u0());
                    AbstractC23350e.m122776f("BitmapAjaxCallback", e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a3 */
    public C23999j m125771a3(float f11) {
        this.f116223E0 = f11;
        return this;
    }

    /* renamed from: b3 */
    public boolean m125772b3(String str) {
        HashMap hashMap = f116216i1;
        synchronized (hashMap) {
            try {
                WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(str);
                if (weakHashMap != null && weakHashMap.size() > 1) {
                    InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116237v0.get();
                    if (interfaceC3968a != null) {
                        weakHashMap.remove(interfaceC3968a);
                    }
                    AbstractC20110a.m104535d("** REMOVE 1 CB: %s", str);
                    return false;
                }
                hashMap.remove(str);
                f116217j1.remove(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e3 */
    public C23999j m125773e3(boolean z11) {
        this.f116228J0 = z11;
        return this;
    }

    /* renamed from: f3 */
    public C23999j m125774f3(int i11) {
        this.f116224F0 = i11;
        return this;
    }

    /* renamed from: h2 */
    public C23999j m125775h2(Rect rect) {
        this.f116234P0 = rect;
        return this;
    }

    /* renamed from: k3 */
    public C23999j m125776k3(boolean z11) {
        this.f116232N0 = z11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: m */
    public File mo125618m(File file, String str) {
        File file2 = this.f116240y0;
        if (file2 != null && file2.exists()) {
            return this.f116240y0;
        }
        return super.mo125618m(file, str);
    }

    /* renamed from: n2 */
    public C23999j m125777n2(int i11) {
        this.f116239x0 = i11;
        return this;
    }

    /* renamed from: n3 */
    public C23999j m125778n3(boolean z11) {
        this.f116233O0 = z11;
        return this;
    }

    /* renamed from: o3 */
    public C23999j m125779o3(boolean z11) {
        this.f116235Q0 = z11;
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: p2 */
    public C3979l mo125604a0(String str, File file, C23995f c23995f) {
        m125702P2("File get: " + file.getAbsolutePath() + " (" + str + ")");
        return m125699N1(file.getAbsolutePath(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:            ho0.AbstractC20110a.m104535d("REQUEST NOT START:%d %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r2.longValue()), r12);     */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo125623q(Context context) {
        AbstractC19164e.m100538x((byte) 0, AbstractC24621a.f118431a);
        String m125633u0 = m125633u0();
        m125702P2("Async context : " + m125633u0);
        InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116237v0.get();
        if (TextUtils.isEmpty(m125633u0)) {
            m125619m1(false);
            m125728h3(interfaceC3968a, null, false);
            return;
        }
        C3979l mo125597Q0 = mo125597Q0(m125633u0);
        if (mo125597Q0 != null) {
            interfaceC3968a.setTag(1090453505, m125633u0);
            C23995f m125654e = new C23995f().m125647A(4).m125654e();
            this.f116127C = m125654e;
            mo1932C(m125633u0, mo125597Q0, m125654e);
            mo125587F();
            AbstractC19164e.m100538x((byte) 1, AbstractC24621a.f118431a);
            return;
        }
        String m125717Z2 = m125717Z2(m125633u0, interfaceC3968a);
        if (this.f116149Y.get()) {
            return;
        }
        HashMap hashMap = f116216i1;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(m125633u0)) {
                    m125688F1(m125633u0, interfaceC3968a, m125717Z2);
                    super.mo125623q(interfaceC3968a.getContext());
                } else {
                    m125619m1(true);
                    m125688F1(m125633u0, interfaceC3968a, m125717Z2);
                    if (URLUtil.isNetworkUrl(m125633u0)) {
                        Long l11 = (Long) AbstractRunnableC23992c.f116117n0.get(m125633u0);
                        if (l11 != null && System.currentTimeMillis() - l11.longValue() <= 60000) {
                            AbstractRunnableC23992c.m125537S(new Runnable() { // from class: o3.g

                                /* renamed from: p */
                                public final /* synthetic */ String f116194p;

                                public /* synthetic */ RunnableC23996g(String m125633u02) {
                                    r1 = m125633u02;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C23999j.m125698M2(r1);
                                }
                            });
                        }
                        AbstractC20110a.m104535d("REQUEST NOT START: %s", m125633u02);
                        super.mo125623q(interfaceC3968a.getContext());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: r0 */
    public int mo125626r0() {
        return this.f116238w0;
    }

    /* renamed from: r3 */
    public C23999j m125781r3(boolean z11) {
        this.f116231M0 = z11;
        return this;
    }

    /* renamed from: s3 */
    public C23999j m125782s3(boolean z11) {
        this.f116230L0 = z11;
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: t0 */
    protected Bitmap mo125630t0(String str) {
        return m125759F2(str);
    }

    /* renamed from: y3 */
    public C23999j m125783y3(EnumC25629a enumC25629a) {
        this.f116229K0 = enumC25629a;
        return this;
    }
}
