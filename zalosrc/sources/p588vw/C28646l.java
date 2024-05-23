package p588vw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import vg.AbstractC28236y3;

/* renamed from: vw.l */
/* loaded from: classes4.dex */
public final class C28646l {

    /* renamed from: f */
    private static volatile C28646l f132799f;

    /* renamed from: a */
    public String f132802a = "background/";

    /* renamed from: b */
    private final HashMap f132803b = new HashMap();

    /* renamed from: c */
    private final List f132804c = new ArrayList();

    /* renamed from: d */
    private int f132805d = 0;

    /* renamed from: e */
    private static final HashMap f132798e = new HashMap();

    /* renamed from: g */
    public static final String[] f132800g = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

    /* renamed from: h */
    public static final String[] f132801h = {"bg_01", "bg_02", "bg_03", "bg_04", "bg_05", "bg_06", "bg_07", "bg_08", "bg_09", "bg_10", "bg_11", "bg_12", "bg_13", "bg_14", "bg_15", "bg_16", "bg_17", "bg_18", "bg_19", "bg_20"};

    private C28646l() {
        m143324h();
    }

    /* renamed from: b */
    public static void m143315b() {
        try {
            HashMap hashMap = f132798e;
            if (hashMap != null) {
                hashMap.clear();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public static synchronized C28646l m143316d() {
        C28646l c28646l;
        synchronized (C28646l.class) {
            try {
                if (f132799f == null) {
                    synchronized (C28646l.class) {
                        try {
                            if (f132799f == null) {
                                f132799f = new C28646l();
                            }
                        } finally {
                        }
                    }
                }
                c28646l = f132799f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28646l;
    }

    /* renamed from: e */
    private void m143317e() {
        int i11 = 0;
        while (true) {
            try {
                String[] strArr = f132800g;
                if (i11 < strArr.length) {
                    String str = strArr[i11];
                    this.f132803b.put(str.toLowerCase(), this.f132802a + f132801h[i11] + ".png");
                    this.f132804c.add(str.toLowerCase());
                    i11++;
                } else {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m143318g(File file, File file2) {
        return file.getName().compareTo(file2.getName());
    }

    /* renamed from: i */
    private void m143319i() {
        try {
            File[] listFiles = new File(C20131e.f99303a.m104953g()).listFiles();
            if (listFiles != null && listFiles.length > 1) {
                Arrays.sort(listFiles, new Comparator() { // from class: vw.k
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m143318g;
                        m143318g = C28646l.m143318g((File) obj, (File) obj2);
                        return m143318g;
                    }
                });
            }
            for (int length = listFiles.length - 1; length >= 0; length--) {
                String name = listFiles[length].getName();
                String absolutePath = listFiles[length].getAbsolutePath();
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(absolutePath) && name.contains(CoreUtility.f89233i)) {
                    String substring = absolutePath.substring(absolutePath.lastIndexOf(".") + 1);
                    if (TextUtils.isEmpty(substring) || !substring.equals("nomedia")) {
                        this.f132803b.put(name.toLowerCase(), absolutePath);
                        this.f132804c.add(name.toLowerCase());
                    }
                }
            }
            this.f132805d = this.f132804c.size();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static void m143320j() {
        if (f132799f != null) {
            f132799f.m143321k();
        }
    }

    /* renamed from: k */
    private void m143321k() {
        try {
            this.f132803b.clear();
            this.f132804c.clear();
            f132799f = null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: c */
    public Drawable m143322c(Context context, String str) {
        Drawable createFromStream;
        try {
            HashMap hashMap = f132798e;
            if (hashMap.containsKey(str) && hashMap.get(str) != null) {
                return (Drawable) hashMap.get(str);
            }
            String str2 = (String) this.f132803b.get(str);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (str2.contains(C20131e.f99303a.m104953g())) {
                if (context != null) {
                    return AbstractC28236y3.m142200k(context, str2);
                }
                return AbstractC28236y3.m142201l(str2);
            }
            if (context != null) {
                createFromStream = Drawable.createFromStream(context.getAssets().open(str2), null);
            } else {
                createFromStream = Drawable.createFromStream(MainApplication.getAppContext().getAssets().open(str2), null);
            }
            Drawable drawable = createFromStream;
            if (drawable != null) {
                hashMap.put(str, drawable);
                return drawable;
            }
            return drawable;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        } catch (OutOfMemoryError e12) {
            MainApplication.m35468b0();
            e12.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public boolean m143323f(String str) {
        try {
            String str2 = (String) this.f132803b.get(str);
            if (!TextUtils.isEmpty(str2)) {
                if (str2.contains(C20131e.f99303a.m104953g())) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: h */
    public void m143324h() {
        this.f132803b.clear();
        this.f132804c.clear();
        m143319i();
        m143317e();
    }
}
