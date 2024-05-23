package p379o3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.AbstractC3987t;
import com.androidquery.util.C3973f;
import com.androidquery.util.C3979l;
import com.androidquery.util.C3985r;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.AbstractC17526e;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p171fx.AbstractC19164e;
import p248iy.AbstractC20887g;
import p414p3.AbstractC24621a;
import p436q3.EnumC25103a;
import p471r3.C25630b;
import p471r3.EnumC25629a;
import p620wt.AbstractC29237l;

/* renamed from: o3.q */
/* loaded from: classes.dex */
public abstract class AbstractC24006q extends AbstractRunnableC23992c {

    /* renamed from: F0 */
    static boolean f116286F0 = false;

    /* renamed from: G0 */
    private static final String f116287G0 = "q";

    /* renamed from: H0 */
    private static final Bitmap f116288H0 = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);

    /* renamed from: I0 */
    private static final HashMap f116289I0 = new HashMap();

    /* renamed from: J0 */
    private static int f116290J0 = 40;

    /* renamed from: K0 */
    private static int f116291K0 = 2000000;

    /* renamed from: L0 */
    private static Map f116292L0;

    /* renamed from: A0 */
    private int f116293A0;

    /* renamed from: B0 */
    private int f116294B0;

    /* renamed from: C0 */
    private final boolean f116295C0 = true;

    /* renamed from: D0 */
    private final float f116296D0 = Float.MAX_VALUE;

    /* renamed from: E0 */
    private boolean f116297E0 = false;

    /* renamed from: v0 */
    private WeakReference f116298v0;

    /* renamed from: w0 */
    private Drawable f116299w0;

    /* renamed from: x0 */
    private float f116300x0;

    /* renamed from: y0 */
    private int f116301y0;

    /* renamed from: z0 */
    private int f116302z0;

    public AbstractC24006q(C25630b c25630b, Drawable drawable, int i11) {
        if (!c25630b.m132448z()) {
            ((AbstractC24006q) ((AbstractC24006q) ((AbstractC24006q) ((AbstractC24006q) ((AbstractC24006q) ((AbstractC24006q) m125628s1(C3979l.class)).m125615k1(1)).m125613i1(c25630b)).m125596P0(true)).m125602Z(false)).m125876h2(drawable).m125870E1(i11).m125635v1(c25630b.m132446x())).m125877p2(c25630b.m132441s());
            return;
        }
        throw new RuntimeException("Not load sticker DEFAULT by Aquery, Gif info: id = " + c25630b.m132429g() + ", cateId = " + c25630b.m132427f());
    }

    /* renamed from: D1 */
    private void m125836D1(String str, InterfaceC3968a interfaceC3968a) {
        HashMap hashMap = f116289I0;
        WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(str);
        if (weakHashMap == null) {
            if (hashMap.containsKey(str)) {
                WeakHashMap weakHashMap2 = new WeakHashMap();
                weakHashMap2.put(interfaceC3968a, this);
                hashMap.put(str, weakHashMap2);
                return;
            }
            hashMap.put(str, null);
            return;
        }
        weakHashMap.put(interfaceC3968a, this);
    }

    /* renamed from: F1 */
    public static C3979l m125837F1(String str) {
        Map map = f116292L0;
        if (map != null) {
            return (C3979l) map.get(str);
        }
        return null;
    }

    /* renamed from: G1 */
    private C3979l m125838G1(String str, byte[] bArr) {
        return m125851X1(str, bArr, this.f116293A0, false, this.f116294B0, null, m125852Y1());
    }

    /* renamed from: J1 */
    private void m125839J1(AbstractC24006q abstractC24006q, String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
        if (interfaceC3968a != null && abstractC24006q != null) {
            if (str.equals(interfaceC3968a.getTag(1090453505))) {
                abstractC24006q.m125619m1(false);
                abstractC24006q.mo115390I1(str, this.f116145U, interfaceC3968a, c3979l, c23995f);
            }
            m125619m1(false);
        }
    }

    /* renamed from: K1 */
    public static void m125840K1(String str) {
        Map map = f116292L0;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: L1 */
    public static void m125841L1() {
        C23999j.m125716Y1(f116292L0);
    }

    /* renamed from: N1 */
    public static C3979l m125842N1(Bitmap bitmap, EnumC25629a enumC25629a) {
        if (bitmap == null) {
            return null;
        }
        return new C3979l(bitmap, enumC25629a);
    }

    /* renamed from: O1 */
    private static void m125843O1(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ZipHelper.createDir() - Creating directory: ");
        sb2.append(file.getName());
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new RuntimeException("Can't create directory " + file);
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ZipHelper.createDir() - Exists directory: ");
        sb3.append(file.getName());
    }

    /* renamed from: P1 */
    private static Bitmap m125844P1(String str, byte[] bArr, BitmapFactory.Options options, EnumC25629a enumC25629a) {
        Bitmap bitmap;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (!options.inJustDecodeBounds && enumC25629a != null && enumC25629a.equals(EnumC25629a.IN_BITMAP)) {
            options.inMutable = true;
            AbstractRunnableC23992c.m125569n(options.outWidth, options.outHeight, str, options);
        }
        if (str != null) {
            bitmap = m125845Q1(str, options);
        } else if (bArr != null) {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            bitmap = null;
        }
        if (bitmap == null && !options.inJustDecodeBounds) {
            AbstractC3972e.m18794m("decode image failed", str);
        }
        return bitmap;
    }

    /* renamed from: Q1 */
    private static Bitmap m125845Q1(String str, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        FileInputStream fileInputStream2 = null;
        Bitmap bitmap = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC29237l.m145996a(fileInputStream2);
            throw th;
        }
        try {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                AbstractC29237l.m145996a(fileInputStream2);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            AbstractC3972e.m18779e0(e);
            AbstractC29237l.m145996a(fileInputStream);
            return bitmap;
        }
        AbstractC29237l.m145996a(fileInputStream);
        return bitmap;
    }

    /* renamed from: R1 */
    public static boolean m125846R1(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    File file2 = new File(file, str);
                    if (file2.isDirectory()) {
                        m125846R1(file2);
                    }
                }
            }
            file.delete();
        }
        return file.delete();
    }

    /* renamed from: S1 */
    public static boolean m125847S1(String str) {
        return m125846R1(new File(str));
    }

    /* renamed from: T1 */
    private static boolean m125848T1(int i11, int i12) {
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

    /* renamed from: V1 */
    private static Bitmap m125849V1(View view, C3979l c3979l, int i11) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (c3979l != null) {
            bitmap = c3979l.m18839c();
        } else {
            bitmap = null;
        }
        if (bitmap == null || bitmap.getWidth() != 1 || bitmap.getHeight() != 1 || bitmap == f116288H0) {
            bitmap2 = bitmap;
        }
        if (bitmap2 != null) {
            view.setVisibility(0);
        } else if (i11 == -2) {
            view.setVisibility(8);
        } else if (i11 == -1) {
            view.setVisibility(4);
        }
        return bitmap2;
    }

    /* renamed from: W1 */
    public static String m125850W1(String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (z11) {
            return str + "_flipthumb";
        }
        return str;
    }

    /* renamed from: X1 */
    public static C3979l m125851X1(String str, byte[] bArr, int i11, boolean z11, int i12, Bitmap bitmap, EnumC25629a enumC25629a) {
        BitmapFactory.Options options;
        Bitmap bitmap2 = null;
        if (str == null && bArr == null) {
            return null;
        }
        if (i11 <= 0 && (enumC25629a == null || !enumC25629a.equals(EnumC25629a.IN_BITMAP))) {
            options = null;
        } else {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            int i13 = 1;
            options2.inJustDecodeBounds = true;
            m125844P1(str, bArr, options2, enumC25629a);
            if (i11 > 0) {
                if (!f116286F0) {
                    int i14 = options2.outWidth;
                    if (!z11) {
                        i14 = Math.max(i14, options2.outHeight);
                    }
                    i13 = AbstractC23009a3.m117969t(i14, i11);
                } else {
                    i13 = AbstractC23009a3.m117970u(options2.outWidth, options2.outHeight, i11);
                }
            }
            options = new BitmapFactory.Options();
            options.inSampleSize = i13;
            options.outWidth = options2.outWidth;
            options.outHeight = options2.outHeight;
            options.inDensity = Math.max(options2.outWidth, options2.outHeight);
            options.inTargetDensity = i11 * i13;
        }
        try {
            bitmap2 = m125844P1(str, bArr, options, enumC25629a);
        } catch (OutOfMemoryError e11) {
            m125841L1();
            AbstractC3972e.m18779e0(e11);
        }
        C3979l m125842N1 = m125842N1(bitmap2, enumC25629a);
        if (m125842N1 != null) {
            m125842N1.m18856t(str);
        }
        return m125842N1;
    }

    /* renamed from: Y1 */
    private static EnumC25629a m125852Y1() {
        if (AbstractC3972e.m18765V()) {
            return EnumC25629a.IN_BITMAP;
        }
        return EnumC25629a.DEFAULT;
    }

    /* renamed from: Z1 */
    public static boolean m125853Z1(String str) {
        Map map = f116292L0;
        if (map != null) {
            return map.containsKey(str);
        }
        return false;
    }

    /* renamed from: a2 */
    public static /* synthetic */ void m125854a2(String str) {
        AbstractC20110a.m104535d("UPDATE PRIORITY: %s", str);
        AbstractRunnableC23992c.m125577u1(str);
    }

    /* renamed from: b2 */
    public static /* synthetic */ boolean m125855b2(File file, String str) {
        return str.toLowerCase().endsWith(".json");
    }

    /* renamed from: c2 */
    private static void m125856c2(String str) {
    }

    /* renamed from: d2 */
    private static Drawable m125857d2(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return drawable.getConstantState().newDrawable();
    }

    /* renamed from: e2 */
    private static Drawable m125858e2(ImageView imageView, C3979l c3979l, float f11, float f12) {
        if (f11 > 0.0f) {
            return new C3985r(imageView.getResources(), c3979l.m18839c(), imageView, f11, f12);
        }
        return new BitmapDrawable(imageView.getResources(), c3979l.m18839c());
    }

    /* renamed from: i2 */
    private void m125859i2(String str, InterfaceC3968a interfaceC3968a) {
        if (!str.equals(interfaceC3968a.getTag(1090453505)) || this.f116299w0 != null) {
            interfaceC3968a.setTag(1090453505, str);
            if (this.f116299w0 != null && !m125632u(interfaceC3968a.getContext())) {
                m125864n2(interfaceC3968a);
                AbstractC19164e.m100538x((byte) 2, AbstractC24621a.f118431a);
            } else {
                m125860j2(str, interfaceC3968a, null, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j2 */
    private void m125860j2(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, boolean z11) {
        if (interfaceC3968a == 0) {
            return;
        }
        if (c3979l == null) {
            Drawable drawable = this.f116299w0;
            if (drawable == null) {
                interfaceC3968a.setImageDrawable(null);
                return;
            } else {
                interfaceC3968a.setImageDrawable(m125857d2(drawable));
                return;
            }
        }
        if (z11 && (interfaceC3968a instanceof ImageView)) {
            interfaceC3968a.setImageDrawable(m125858e2((ImageView) interfaceC3968a, c3979l, this.f116300x0, Float.MAX_VALUE));
            return;
        }
        C23995f c23995f = this.f116127C;
        if (c23995f != null && (interfaceC3968a instanceof ImageView)) {
            m125861k2((ImageView) interfaceC3968a, c3979l, this.f116299w0, this.f116301y0, this.f116302z0, this.f116300x0, Float.MAX_VALUE, c23995f.m125666q());
        }
    }

    /* renamed from: k2 */
    private static void m125861k2(ImageView imageView, C3979l c3979l, Drawable drawable, int i11, int i12, float f11, float f12, int i13) {
        Animation loadAnimation;
        Drawable drawable2;
        if (m125849V1(imageView, c3979l, i11) == null) {
            imageView.setImageBitmap(null);
            return;
        }
        Drawable m125858e2 = m125858e2(imageView, c3979l, f11, f12);
        Drawable drawable3 = m125858e2;
        if (m125848T1(i12, i13)) {
            if (drawable == null) {
                loadAnimation = new AlphaAnimation(0.0f, 1.0f);
                loadAnimation.setInterpolator(new DecelerateInterpolator());
                loadAnimation.setDuration(1000L);
                drawable2 = m125858e2;
            } else {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{m125857d2(drawable), m125858e2});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(1000);
                drawable3 = transitionDrawable;
                loadAnimation = null;
                drawable2 = drawable3;
            }
        } else {
            if (i12 > 0) {
                loadAnimation = AnimationUtils.loadAnimation(imageView.getContext(), i12);
                drawable2 = m125858e2;
            }
            loadAnimation = null;
            drawable2 = drawable3;
        }
        if (imageView instanceof RecyclingImageView) {
            ((RecyclingImageView) imageView).setImageInfo(c3979l, false);
        }
        imageView.setImageDrawable(drawable2);
        if (loadAnimation != null) {
            loadAnimation.setStartTime(AnimationUtils.currentAnimationTimeMillis());
            imageView.startAnimation(loadAnimation);
        } else {
            imageView.setAnimation(null);
        }
    }

    /* renamed from: l2 */
    public static void m125862l2(boolean z11) {
        f116286F0 = z11;
    }

    /* renamed from: m2 */
    public static void m125863m2(int i11) {
        m125856c2("Set max cache size: " + i11);
        f116290J0 = i11;
        m125841L1();
    }

    /* renamed from: n2 */
    private void m125864n2(InterfaceC3968a interfaceC3968a) {
        interfaceC3968a.setImageDrawable(m125857d2(this.f116299w0));
    }

    /* renamed from: o2 */
    public static void m125865o2(int i11) {
        m125856c2("Set max cache limit: " + i11);
        f116291K0 = i11;
        m125841L1();
    }

    /* renamed from: s2 */
    public static synchronized void m125866s2(int i11) {
        synchronized (AbstractC24006q.class) {
            try {
                if (i11 >= 60) {
                    m125841L1();
                } else if (i11 >= 40) {
                    Map map = f116292L0;
                    if (map instanceof C3973f) {
                        ((C3973f) map).m18819g(map.size() / 2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t2 */
    public static boolean m125867t2(String str, String str2) {
        try {
            m125847S1(str2);
            File file = new File(str2);
            file.mkdir();
            return m125868u2(new File(str), file);
        } catch (Exception e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unzip error: ");
            sb2.append(e11);
            return false;
        }
    }

    /* renamed from: u2 */
    public static boolean m125868u2(File file, File file2) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ZipHelper.unzip() - File: ");
            sb2.append(file.getPath());
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (!new File(file2, nextElement.getName()).getCanonicalPath().startsWith(file2.getCanonicalPath())) {
                        AbstractC20887g.m109237o(19003);
                        AbstractC20887g.m109230h(19003, "error unzip: " + file.getPath());
                    } else {
                        m125869v2(zipFile, nextElement, file2);
                    }
                }
                zipFile.close();
                return true;
            } finally {
            }
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ZipHelper.unzip() - Error extracting file ");
            sb3.append(file);
            sb3.append(": ");
            sb3.append(e11);
            return false;
        }
    }

    /* renamed from: v2 */
    private static void m125869v2(ZipFile zipFile, ZipEntry zipEntry, File file) {
        File file2 = new File(file, zipEntry.getName());
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            AbstractC20887g.m109237o(19003);
            AbstractC20887g.m109230h(19003, "error unzip output: " + file.getPath());
            return;
        }
        if (zipEntry.isDirectory()) {
            m125843O1(file2);
            return;
        }
        if (!file2.getParentFile().exists()) {
            m125843O1(file2.getParentFile());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ZipHelper.unzipEntry() - Extracting: ");
        sb2.append(zipEntry);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            return;
                        }
                    }
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ZipHelper.unzipEntry() - Error: ");
            sb3.append(e11);
        }
    }

    /* renamed from: E1 */
    public AbstractC24006q m125870E1(int i11) {
        this.f116302z0 = i11;
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: G0 */
    protected boolean mo125590G0() {
        if (!this.f116145U.m132394B()) {
            return false;
        }
        String str = this.f116145U.m132439q() + "/" + this.f116145U.m132429g() + ".gif";
        String str2 = this.f116145U.m132439q() + "/" + this.f116145U.m132429g() + ".jpg";
        String str3 = this.f116145U.m132439q() + "/" + this.f116145U.m132429g() + ".png";
        if (!AbstractC23041d2.m118194A(this.f116145U.m132436n()) && !AbstractC23041d2.m118194A(str) && !AbstractC23041d2.m118194A(str3) && !AbstractC23041d2.m118194A(str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:5:0x0003, B:7:0x001a, B:11:0x002d, B:12:0x0035, B:14:0x003b, B:16:0x004f, B:27:0x0055, B:19:0x005f, B:22:0x0067, B:32:0x0071, B:33:0x0074, B:38:0x0023), top: B:4:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:5:0x0003, B:7:0x001a, B:11:0x002d, B:12:0x0035, B:14:0x003b, B:16:0x004f, B:27:0x0055, B:19:0x005f, B:22:0x0067, B:32:0x0071, B:33:0x0074, B:38:0x0023), top: B:4:0x0003, outer: #1 }] */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: H1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1932C(String str, C3979l c3979l, C23995f c23995f) {
        try {
            HashMap hashMap = f116289I0;
            synchronized (hashMap) {
                try {
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.remove(m125850W1(str, this.f116297E0));
                    InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116298v0.get();
                    if (weakHashMap != null) {
                        if (!weakHashMap.containsKey(interfaceC3968a)) {
                        }
                        if (weakHashMap != null) {
                            for (InterfaceC3968a interfaceC3968a2 : weakHashMap.keySet()) {
                                AbstractC24006q abstractC24006q = (AbstractC24006q) weakHashMap.get(interfaceC3968a2);
                                if (this.f116293A0 == abstractC24006q.f116293A0 && this.f116294B0 == abstractC24006q.f116294B0) {
                                    abstractC24006q.f116127C = c23995f;
                                    m125839J1(abstractC24006q, str, interfaceC3968a2, c3979l, c23995f);
                                } else if (!abstractC24006q.f116149Y.get()) {
                                    abstractC24006q.mo125623q(interfaceC3968a2.getContext());
                                }
                            }
                        }
                        if (c3979l != null) {
                            c3979l.m18838b();
                        }
                    }
                    m125839J1(this, str, interfaceC3968a, c3979l, c23995f);
                    if (weakHashMap != null) {
                    }
                    if (c3979l != null) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I1 */
    public void mo115390I1(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
        m125860j2(str, interfaceC3968a, c3979l, false);
    }

    /* renamed from: M1 */
    public void m125872M1() {
        C23995f c23995f;
        HashMap hashMap = f116289I0;
        synchronized (hashMap) {
            try {
                String m125850W1 = m125850W1(m125633u0(), this.f116297E0);
                try {
                    m125856c2("clearTask:" + m125633u0());
                    WeakHashMap weakHashMap = (WeakHashMap) hashMap.get(m125850W1);
                    if (weakHashMap != null) {
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC3968a interfaceC3968a : weakHashMap.keySet()) {
                            AbstractC24006q abstractC24006q = (AbstractC24006q) weakHashMap.get(interfaceC3968a);
                            if (abstractC24006q != null && (c23995f = abstractC24006q.f116127C) != null && c23995f.m125669t()) {
                            }
                            arrayList.add(interfaceC3968a);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            weakHashMap.remove((InterfaceC3968a) it.next());
                        }
                        if (weakHashMap.isEmpty()) {
                            f116289I0.remove(m125850W1);
                        }
                    } else {
                        hashMap.remove(m125850W1);
                    }
                } catch (Exception e11) {
                    f116289I0.remove(m125850W1);
                    AbstractC23350e.m122776f(f116287G0, e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: U1 */
    public C3979l mo125604a0(String str, File file, C23995f c23995f) {
        if (file.getAbsolutePath().contains(AbstractC17526e.f89366x[2])) {
            m125856c2("Extract ket frame from file cache: " + this.f116145U.m132431i());
            Bitmap m18802q = AbstractC3972e.m18802q(this.f116145U.m132432j(), file.getAbsolutePath(), this.f116145U.m132430h(), C20131e.f99303a.m104946c0() + this.f116145U.m132432j() + "/" + this.f116145U.m132429g());
            if (m18802q == null) {
                return null;
            }
            return m125842N1(m18802q, m125852Y1());
        }
        return m125838G1(file.getAbsolutePath(), null);
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: f2 */
    public C3979l mo125597Q0(String str) {
        return m125837F1(m125850W1(str, this.f116297E0));
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: g2 */
    public void mo125598R0(String str, C3979l c3979l) {
        if (c3979l != null) {
            if (f116292L0 == null) {
                f116292L0 = Collections.synchronizedMap(new C3973f(f116290J0, 129600, f116291K0, EnumC25103a.StickerCache));
            }
            f116292L0.put(m125850W1(str, this.f116297E0), c3979l);
        }
    }

    /* renamed from: h2 */
    public AbstractC24006q m125876h2(Drawable drawable) {
        this.f116299w0 = drawable;
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: i0 */
    public File mo125612i0() {
        System.currentTimeMillis();
        return AbstractC3987t.m18879b(this.f116145U, this.f116297E0);
    }

    /* renamed from: p2 */
    public AbstractC24006q m125877p2(int i11) {
        this.f116293A0 = i11;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:            ho0.AbstractC20110a.m104535d("REQUEST NOT START:%d %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r2.longValue()), r12);     */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo125623q(Context context) {
        C3979l mo125597Q0;
        AbstractC19164e.m100538x((byte) 0, AbstractC24621a.f118431a);
        String m125633u0 = m125633u0();
        m125856c2("Async context : " + m125633u0);
        InterfaceC3968a interfaceC3968a = (InterfaceC3968a) this.f116298v0.get();
        if (m125633u0 == null) {
            m125619m1(false);
            m125860j2(null, interfaceC3968a, null, false);
            return;
        }
        if (!this.f116132H && (mo125597Q0 = mo125597Q0(m125633u0)) != null && mo125597Q0.m18839c() != null) {
            m125856c2("Load from mem success:" + m125633u0);
            if (interfaceC3968a != null) {
                interfaceC3968a.setTag(1090453505, m125633u0);
            }
            C23995f m125654e = new C23995f().m125647A(4).m125654e();
            this.f116127C = m125654e;
            mo1932C(m125633u0, mo125597Q0, m125654e);
            AbstractC19164e.m100538x((byte) 1, AbstractC24621a.f118431a);
            return;
        }
        if (interfaceC3968a != null) {
            m125859i2(m125633u0, interfaceC3968a);
        }
        String m125850W1 = m125850W1(m125633u0, this.f116297E0);
        if (this.f116149Y.get()) {
            return;
        }
        HashMap hashMap = f116289I0;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(m125850W1)) {
                    m125836D1(m125850W1, interfaceC3968a);
                    if (interfaceC3968a != null) {
                        super.mo125623q(interfaceC3968a.getContext());
                    }
                } else {
                    m125619m1(true);
                    m125836D1(m125850W1, interfaceC3968a);
                    if (URLUtil.isNetworkUrl(m125633u0)) {
                        Long l11 = (Long) AbstractRunnableC23992c.f116117n0.get(m125633u0);
                        if (l11 != null && System.currentTimeMillis() - l11.longValue() <= 60000) {
                            AbstractRunnableC23992c.m125537S(new Runnable() { // from class: o3.p

                                /* renamed from: p */
                                public final /* synthetic */ String f116285p;

                                public /* synthetic */ RunnableC24005p(String m125633u02) {
                                    r1 = m125633u02;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC24006q.m125854a2(r1);
                                }
                            });
                        }
                        AbstractC20110a.m104535d("REQUEST NOT START: %s", m125633u02);
                        if (interfaceC3968a != null) {
                            super.mo125623q(interfaceC3968a.getContext());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q2 */
    public AbstractC24006q m125878q2(InterfaceC3968a interfaceC3968a) {
        this.f116298v0 = new WeakReference(interfaceC3968a);
        return this;
    }

    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: r0 */
    public int mo125626r0() {
        return this.f116293A0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:32|(9:37|38|39|(1:41)|42|43|44|(5:46|(1:48)(2:58|(1:60))|49|(1:57)(1:54)|55)|61)|65|(1:67)|(1:69)|(1:71)|38|39|(0)|42|43|44|(0)|61) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02ee, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0333, code lost:            mm0.AbstractC23350e.m122778h(r0);     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0285 A[Catch: Exception -> 0x006e, TryCatch #2 {Exception -> 0x006e, blocks: (B:6:0x0021, B:8:0x0024, B:10:0x002d, B:12:0x006a, B:13:0x0071, B:15:0x0091, B:30:0x00da, B:32:0x00df, B:37:0x0107, B:39:0x0277, B:41:0x0285, B:42:0x028a, B:61:0x0336, B:64:0x0333, B:65:0x0127, B:67:0x0141, B:69:0x0146, B:71:0x0167, B:72:0x0170, B:73:0x0186, B:74:0x0187, B:77:0x01b0, B:79:0x01b6, B:85:0x01bc, B:87:0x01cc, B:114:0x0271, B:136:0x00ca, B:44:0x02b2, B:48:0x02c7, B:49:0x031b, B:52:0x032a, B:55:0x032f, B:60:0x02f3, B:17:0x0094, B:19:0x009c, B:21:0x00a1, B:23:0x00c5), top: B:5:0x0021, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c3  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p379o3.AbstractRunnableC23992c
    /* renamed from: r2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3979l mo125625q1(String str, byte[] bArr, C23995f c23995f) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        File file;
        m125856c2("transform:" + str);
        C3979l c3979l = null;
        if (bArr != null) {
            try {
                if (bArr.length > 0 && AbstractC17522a.m93349l(bArr, 0) == 20000) {
                    int m93349l = AbstractC17522a.m93349l(bArr, 4);
                    int m93349l2 = AbstractC17522a.m93349l(bArr, 8);
                    int m93349l3 = AbstractC17522a.m93349l(bArr, 12);
                    int m93347j = AbstractC17522a.m93347j(bArr, 16);
                    int m93349l4 = AbstractC17522a.m93349l(bArr, 17);
                    C20131e c20131e = C20131e.f99303a;
                    String str3 = c20131e.m104942a0() + m93349l;
                    File file2 = new File(str3);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    String str4 = str3 + "/" + m93349l2 + "/";
                    File file3 = new File(str4);
                    if (!file3.exists()) {
                        file3.mkdir();
                    }
                    try {
                        int m132434l = this.f116145U.m132434l();
                        if (m132434l >= 0) {
                            String[] strArr = AbstractC17526e.f89366x;
                            if (m132434l < strArr.length) {
                                String str5 = c20131e.m104942a0() + m93349l + "/" + m93349l2 + strArr[m132434l];
                                if (AbstractC23041d2.m118194A(str5)) {
                                    AbstractC23041d2.m118208g(str5);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    boolean z11 = true;
                    if (m93349l3 != 7 && m93349l3 != 8) {
                        if (m93349l3 >= 0) {
                            String[] strArr2 = AbstractC17526e.f89366x;
                            if (m93349l3 < strArr2.length) {
                                str4 = str4 + m93349l2 + strArr2[m93349l3];
                                FileOutputStream fileOutputStream = new FileOutputStream(str4);
                                fileOutputStream.write(bArr, 21, m93349l4);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                if (m93349l3 != 2 && m93349l3 != 5) {
                                    m125856c2("Decode bitmap old: " + str4);
                                    c3979l = m125838G1(str4, null);
                                    i15 = 0;
                                    i11 = 0;
                                    i12 = 0;
                                    i13 = -1;
                                    i16 = 0;
                                    this.f116145U.m132405O(m93349l2);
                                    if (this.f116145U.m132427f() == -1) {
                                        this.f116145U.m132404N(m93349l);
                                    }
                                    this.f116145U.m132414X(m93349l);
                                    this.f116145U.m132410T(m93349l3);
                                    this.f116145U.m132406P(m93347j);
                                    this.f116145U.m132407Q(str4);
                                    this.f116145U.m132402K(i11);
                                    this.f116145U.m132418a0(i15);
                                    this.f116145U.m132416Z(i16);
                                    this.f116145U.m132401J(i12);
                                    file = new File(this.f116145U.m132439q());
                                    if (file.isDirectory()) {
                                        if (i16 == 2) {
                                            this.f116145U.m132407Q(this.f116145U.m132439q() + "/" + this.f116145U.m132429g() + ".webp");
                                        } else if (i16 == 3) {
                                            this.f116145U.m132407Q(this.f116145U.m132439q() + "/fss_" + this.f116145U.m132429g() + ".webp");
                                        }
                                        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: o3.o
                                            @Override // java.io.FilenameFilter
                                            public final boolean accept(File file4, String str6) {
                                                boolean m125855b2;
                                                m125855b2 = AbstractC24006q.m125855b2(file4, str6);
                                                return m125855b2;
                                            }
                                        });
                                        C25630b c25630b = this.f116145U;
                                        if (i13 < 1 || listFiles == null || listFiles.length <= 0) {
                                            z11 = false;
                                        }
                                        c25630b.m132412V(z11);
                                    }
                                    m125856c2("Update gif local path:" + str4);
                                }
                                m125856c2("Extract key frame: " + str4);
                                Bitmap m18786i = AbstractC3972e.m18786i(str4, m93347j);
                                if (m18786i != null) {
                                    AbstractC23041d2.m118208g(str4);
                                }
                                if (m18786i == null) {
                                    m18786i = AbstractC3972e.m18802q(m93349l, str4, m93347j, C20131e.f99303a.m104946c0() + m93349l + "/" + m93349l2);
                                }
                                if (m18786i != null) {
                                    c3979l = m125842N1(m18786i, m125852Y1());
                                }
                                i15 = 0;
                                i11 = 0;
                                i12 = 0;
                                i13 = -1;
                                i16 = 0;
                                this.f116145U.m132405O(m93349l2);
                                if (this.f116145U.m132427f() == -1) {
                                }
                                this.f116145U.m132414X(m93349l);
                                this.f116145U.m132410T(m93349l3);
                                this.f116145U.m132406P(m93347j);
                                this.f116145U.m132407Q(str4);
                                this.f116145U.m132402K(i11);
                                this.f116145U.m132418a0(i15);
                                this.f116145U.m132416Z(i16);
                                this.f116145U.m132401J(i12);
                                file = new File(this.f116145U.m132439q());
                                if (file.isDirectory()) {
                                }
                                m125856c2("Update gif local path:" + str4);
                            }
                        }
                        throw new Exception("StickerType not valid! " + m93349l3);
                    }
                    String str6 = str4 + m93349l2 + ".zip";
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str6);
                    fileOutputStream2.write(bArr, 21, m93349l4);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    int i17 = 0;
                    boolean z12 = false;
                    for (int i18 = 3; i17 < i18 && !z12; i18 = 3) {
                        z12 = m125867t2(str6, str4);
                        if (!z12) {
                            i17++;
                        }
                    }
                    if (!z12) {
                        AbstractC23041d2.m118211j(new File(str4));
                        c23995f.m125652c(-10003);
                        return null;
                    }
                    AbstractC23041d2.m118208g(str6);
                    String m18757N = AbstractC3972e.m18757N(str4, m93347j);
                    m125856c2("Decode bitmap new: " + str4);
                    c3979l = m125838G1(m18757N, null);
                    try {
                        str2 = str4 + "metadata";
                    } catch (Exception e12) {
                        e = e12;
                        i11 = 0;
                    }
                    if (AbstractC23041d2.m118194A(str2)) {
                        String m118197D = AbstractC23041d2.m118197D(str2);
                        if (!TextUtils.isEmpty(m118197D)) {
                            JSONObject jSONObject = new JSONObject(m118197D);
                            if (c23995f.m125666q() == 1) {
                                try {
                                    jSONObject.put("gifType", m93349l3);
                                    AbstractC23041d2.m118201H(str2, jSONObject.toString());
                                } catch (Exception e13) {
                                    e = e13;
                                    i11 = 0;
                                    i12 = 0;
                                    i13 = -1;
                                    i14 = 0;
                                    AbstractC23350e.m122778h(e);
                                    i15 = 0;
                                    i16 = i14;
                                    this.f116145U.m132405O(m93349l2);
                                    if (this.f116145U.m132427f() == -1) {
                                    }
                                    this.f116145U.m132414X(m93349l);
                                    this.f116145U.m132410T(m93349l3);
                                    this.f116145U.m132406P(m93347j);
                                    this.f116145U.m132407Q(str4);
                                    this.f116145U.m132402K(i11);
                                    this.f116145U.m132418a0(i15);
                                    this.f116145U.m132416Z(i16);
                                    this.f116145U.m132401J(i12);
                                    file = new File(this.f116145U.m132439q());
                                    if (file.isDirectory()) {
                                    }
                                    m125856c2("Update gif local path:" + str4);
                                    return c3979l;
                                }
                            }
                            if (jSONObject.has("effectId")) {
                                i11 = jSONObject.optInt("effectId");
                            } else {
                                i11 = 0;
                            }
                            try {
                                i13 = jSONObject.optInt("format_type", -1);
                                try {
                                    i12 = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                    try {
                                        i14 = jSONObject.optInt("ext", 0);
                                        try {
                                            i15 = jSONObject.optInt("source", 0);
                                        } catch (Exception e14) {
                                            e = e14;
                                            AbstractC23350e.m122778h(e);
                                            i15 = 0;
                                            i16 = i14;
                                            this.f116145U.m132405O(m93349l2);
                                            if (this.f116145U.m132427f() == -1) {
                                            }
                                            this.f116145U.m132414X(m93349l);
                                            this.f116145U.m132410T(m93349l3);
                                            this.f116145U.m132406P(m93347j);
                                            this.f116145U.m132407Q(str4);
                                            this.f116145U.m132402K(i11);
                                            this.f116145U.m132418a0(i15);
                                            this.f116145U.m132416Z(i16);
                                            this.f116145U.m132401J(i12);
                                            file = new File(this.f116145U.m132439q());
                                            if (file.isDirectory()) {
                                            }
                                            m125856c2("Update gif local path:" + str4);
                                            return c3979l;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        i14 = 0;
                                        AbstractC23350e.m122778h(e);
                                        i15 = 0;
                                        i16 = i14;
                                        this.f116145U.m132405O(m93349l2);
                                        if (this.f116145U.m132427f() == -1) {
                                        }
                                        this.f116145U.m132414X(m93349l);
                                        this.f116145U.m132410T(m93349l3);
                                        this.f116145U.m132406P(m93347j);
                                        this.f116145U.m132407Q(str4);
                                        this.f116145U.m132402K(i11);
                                        this.f116145U.m132418a0(i15);
                                        this.f116145U.m132416Z(i16);
                                        this.f116145U.m132401J(i12);
                                        file = new File(this.f116145U.m132439q());
                                        if (file.isDirectory()) {
                                        }
                                        m125856c2("Update gif local path:" + str4);
                                        return c3979l;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    i12 = 0;
                                }
                            } catch (Exception e17) {
                                e = e17;
                                i12 = 0;
                                i13 = -1;
                                i14 = 0;
                                AbstractC23350e.m122778h(e);
                                i15 = 0;
                                i16 = i14;
                                this.f116145U.m132405O(m93349l2);
                                if (this.f116145U.m132427f() == -1) {
                                }
                                this.f116145U.m132414X(m93349l);
                                this.f116145U.m132410T(m93349l3);
                                this.f116145U.m132406P(m93347j);
                                this.f116145U.m132407Q(str4);
                                this.f116145U.m132402K(i11);
                                this.f116145U.m132418a0(i15);
                                this.f116145U.m132416Z(i16);
                                this.f116145U.m132401J(i12);
                                file = new File(this.f116145U.m132439q());
                                if (file.isDirectory()) {
                                }
                                m125856c2("Update gif local path:" + str4);
                                return c3979l;
                            }
                            i16 = i14;
                            this.f116145U.m132405O(m93349l2);
                            if (this.f116145U.m132427f() == -1) {
                            }
                            this.f116145U.m132414X(m93349l);
                            this.f116145U.m132410T(m93349l3);
                            this.f116145U.m132406P(m93347j);
                            this.f116145U.m132407Q(str4);
                            this.f116145U.m132402K(i11);
                            this.f116145U.m132418a0(i15);
                            this.f116145U.m132416Z(i16);
                            this.f116145U.m132401J(i12);
                            file = new File(this.f116145U.m132439q());
                            if (file.isDirectory()) {
                            }
                            m125856c2("Update gif local path:" + str4);
                        }
                    }
                    i15 = 0;
                    i11 = 0;
                    i12 = 0;
                    i13 = -1;
                    i14 = 0;
                    i16 = i14;
                    this.f116145U.m132405O(m93349l2);
                    if (this.f116145U.m132427f() == -1) {
                    }
                    this.f116145U.m132414X(m93349l);
                    this.f116145U.m132410T(m93349l3);
                    this.f116145U.m132406P(m93347j);
                    this.f116145U.m132407Q(str4);
                    this.f116145U.m132402K(i11);
                    this.f116145U.m132418a0(i15);
                    this.f116145U.m132416Z(i16);
                    this.f116145U.m132401J(i12);
                    file = new File(this.f116145U.m132439q());
                    if (file.isDirectory()) {
                    }
                    m125856c2("Update gif local path:" + str4);
                }
            } catch (Exception e18) {
                AbstractC23350e.m122778h(e18);
            }
        }
        return c3979l;
    }
}
