package p716zh;

import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.database.ContentObserver;
import android.database.Cursor;
import android.location.Location;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import dj.C17945a0;
import dj.C18009w0;
import f90.C18826a;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23067f6;
import me0.AbstractC23254w8;
import me0.AbstractC23280z4;
import p019aj.C0872f;
import p020ak.C0882a;
import p020ak.C0883b;
import p020ak.C0885d;
import p239ih.C20551a;
import p239ih.C20556f;
import p295kb.C21644b;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import vg.C28203u6;

/* renamed from: zh.o7 */
/* loaded from: classes3.dex */
public class C32050o7 {

    /* renamed from: k */
    public static final String f147578k;

    /* renamed from: l */
    public static final String f147579l;

    /* renamed from: m */
    public static final String f147580m;

    /* renamed from: n */
    public static final String f147581n;

    /* renamed from: o */
    private static volatile C32050o7 f147582o;

    /* renamed from: a */
    private final Handler f147583a;

    /* renamed from: b */
    private volatile List f147584b;

    /* renamed from: c */
    private long f147585c;

    /* renamed from: h */
    private long f147590h;

    /* renamed from: j */
    private final C0872f f147592j;

    /* renamed from: d */
    private boolean f147586d = true;

    /* renamed from: e */
    public boolean f147587e = false;

    /* renamed from: f */
    public long f147588f = 0;

    /* renamed from: i */
    public List f147591i = new ArrayList();

    /* renamed from: g */
    private final C21644b f147589g = new C21644b();

    /* renamed from: zh.o7$a */
    /* loaded from: classes3.dex */
    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            C32050o7.this.f147586d = true;
        }
    }

    /* renamed from: zh.o7$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC23309i.m121466Tq(C32050o7.this.f147585c);
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.DIRECTORY_DCIM);
        String str = File.separator;
        sb2.append(str);
        sb2.append("Camera");
        f147578k = sb2.toString();
        f147579l = Environment.DIRECTORY_DCIM + str + "100ANDRO";
        f147580m = Environment.DIRECTORY_DCIM + str + "100ANDROID";
        f147581n = Environment.DIRECTORY_DCIM + str + "100MEDIA";
    }

    private C32050o7() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f147583a = handler;
        this.f147585c = AbstractC23309i.m122494v6();
        this.f147592j = AbstractC23306f.m120562A();
        MainApplication.getAppContext().getContentResolver().registerContentObserver(C18826a.f94117c, true, new a(handler));
    }

    /* renamed from: e */
    private void m154653e(List list) {
        if (list.size() < 2) {
            return;
        }
        MediaItem mediaItem = (MediaItem) list.get(0);
        MediaItem mediaItem2 = (MediaItem) list.get(1);
        if (mediaItem.getWidth() > mediaItem.getHeight() || mediaItem2.getWidth() > mediaItem2.getHeight()) {
            list.clear();
            list.add(mediaItem);
        }
    }

    /* renamed from: f */
    private int m154654f(String str) {
        String m118225x;
        if (AbstractC23254w8.m119859g(str)) {
            C20556f c20556f = new C20556f(str);
            if (Build.VERSION.SDK_INT >= 29) {
                m118225x = c20556f.m106843p();
                if (m118225x == null) {
                    m118225x = "";
                }
                if (m118225x.endsWith(File.separator)) {
                    m118225x = m118225x.substring(0, m118225x.length() - 1);
                }
            } else {
                m118225x = AbstractC23041d2.m118225x(c20556f.m106831c());
            }
        } else {
            m118225x = AbstractC23041d2.m118225x(str);
        }
        if (!m118225x.isEmpty()) {
            if (m118225x.endsWith(f147578k) || m118225x.endsWith(f147579l) || m118225x.endsWith(f147580m) || m118225x.endsWith(f147581n)) {
                return 0;
            }
            if (m118225x.endsWith("Screenshots") || m118225x.endsWith("Screenshot")) {
                return 1;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: h */
    public static synchronized C32050o7 m154655h() {
        C32050o7 c32050o7;
        synchronized (C32050o7.class) {
            try {
                if (f147582o == null) {
                    synchronized (C32050o7.class) {
                        try {
                            if (f147582o == null) {
                                f147582o = new C32050o7();
                            }
                        } finally {
                        }
                    }
                }
                c32050o7 = f147582o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c32050o7;
    }

    /* renamed from: j */
    private float m154656j(List list, MediaItem mediaItem) {
        MediaItem mediaItem2 = (MediaItem) list.get(0);
        float[] fArr = {0.0f};
        Location.distanceBetween(mediaItem2.m41106J(), mediaItem2.m41108K(), mediaItem.m41106J(), mediaItem.m41108K(), fArr);
        return fArr[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m154657c(List list) {
        if (this.f147589g.m111573e() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (this.f147589g.m111572c(((MediaItem) it.next()).mo41090x())) {
                    AbstractC23647d.m123897g("122118");
                    break;
                }
            }
            m154659g();
        }
    }

    /* renamed from: d */
    public void m154658d() {
        if (this.f147589g.m111573e() != 0 && System.currentTimeMillis() - this.f147590h > 300000) {
            this.f147589g.m111571b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m154659g() {
        this.f147589g.m111571b();
    }

    /* renamed from: i */
    public List m154660i() {
        C0882a m2511B = this.f147592j.m2511B();
        if (this.f147584b != null && this.f147584b.size() > 0 && System.currentTimeMillis() - ((MediaItem) this.f147584b.get(0)).m41095C() <= m2511B.m2713b() * 1000) {
            return this.f147584b;
        }
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033e A[Catch: all -> 0x0321, TryCatch #2 {all -> 0x0321, blocks: (B:129:0x02fc, B:130:0x0302, B:132:0x0308, B:134:0x0324, B:137:0x033e, B:138:0x0343, B:142:0x034e, B:143:0x035d, B:145:0x0361, B:147:0x0369, B:148:0x0374, B:150:0x037a, B:152:0x0388, B:153:0x038d, B:166:0x0356), top: B:128:0x02fc }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x037a A[Catch: all -> 0x0321, LOOP:2: B:148:0x0374->B:150:0x037a, LOOP_END, TryCatch #2 {all -> 0x0321, blocks: (B:129:0x02fc, B:130:0x0302, B:132:0x0308, B:134:0x0324, B:137:0x033e, B:138:0x0343, B:142:0x034e, B:143:0x035d, B:145:0x0361, B:147:0x0369, B:148:0x0374, B:150:0x037a, B:152:0x0388, B:153:0x038d, B:166:0x0356), top: B:128:0x02fc }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m154661k(C0885d c0885d, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        C32050o7 c32050o7;
        boolean z16;
        int i12;
        Cursor cursor;
        int i13;
        boolean z17;
        int i14;
        int i15;
        boolean z18;
        boolean z19;
        ArrayList arrayList;
        int i16;
        int i17;
        boolean z21;
        int i18;
        Iterator it;
        long j11;
        String str;
        float f11;
        float f12;
        long j12;
        boolean z22;
        boolean z23;
        int i19;
        boolean z24;
        int i21;
        boolean z25;
        C31973j5 c31973j5;
        C32050o7 c32050o72 = this;
        AbstractC20110a.m104535d("LOG NUMBER PHOTO START UNDER", new Object[0]);
        C0883b m2514E = c32050o72.f147592j.m2514E();
        boolean m2725d = m2514E.m2725d();
        C0882a m2511B = c32050o72.f147592j.m2511B();
        if (c0885d != null && !c0885d.m2734a().isEmpty()) {
            ContactProfile contactProfile = new ContactProfile(c0885d.m2734a());
            if (contactProfile.m40374K0()) {
                c31973j5 = contactProfile.m40389U();
            } else {
                c31973j5 = null;
            }
            if (c31973j5 != null && c31973j5.m153732O() > m2511B.m2714c()) {
                z12 = false;
            } else {
                z12 = true;
            }
            z11 = !C28203u6.f131407a.m141819r(contactProfile.f42434r);
        } else {
            z11 = true;
            z12 = false;
        }
        if (Build.VERSION.SDK_INT >= 34 && AbstractC23034c6.m118124J(MainApplication.getAppContext())) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (m2511B.m2720i() && AbstractC0924m0.m4046na() && z12 && !z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z26 = !z12;
        if ((z14 || m2725d) && c32050o72.f147586d && z11) {
            c32050o72.f147584b = null;
            if (AbstractC23309i.m122504vg() && AbstractC23309i.m121048If()) {
                z15 = true;
            } else {
                z15 = false;
            }
            try {
                ArrayList arrayList2 = new ArrayList();
                cursor = AbstractC23280z4.m120358v0(C18826a.f94117c, C18826a.f94121g, null, null, "date_added DESC", -1, new SensitiveData("gallery_csc_suggest_send_photo", "comm_csc"));
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean z27 = z15;
                    if (m2511B.m2718g() * 1000 < currentTimeMillis - AbstractC23309i.m120816C5()) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (m2514E.m2725d()) {
                        i14 = Math.max(m2514E.m2724c(), 1);
                    } else {
                        i14 = 1;
                    }
                    long m2723b = m2514E.m2723b() * 1000;
                    if (i11 == 0) {
                        i15 = m2511B.m2715d();
                    } else {
                        i15 = 2;
                    }
                    if (cursor != null && cursor.moveToFirst()) {
                        int i22 = 0;
                        boolean z28 = true;
                        boolean z29 = false;
                        boolean z31 = false;
                        int i23 = -1;
                        while (true) {
                            boolean z32 = z27;
                            String m120357v = AbstractC23280z4.m120357v(cursor, C18826a.f94117c, 0, 1);
                            String string = cursor.getString(5);
                            z18 = m2725d;
                            long j13 = cursor.getLong(3);
                            int i24 = i15;
                            int i25 = i14;
                            z16 = z26;
                            try {
                                long j14 = cursor.getLong(2);
                                z19 = z14;
                                long j15 = cursor.getLong(4);
                                if (j13 > 1) {
                                    j11 = j13;
                                } else {
                                    j11 = j14 * 1000;
                                }
                                ArrayList arrayList3 = arrayList2;
                                if (Build.VERSION.SDK_INT >= 29 && !AbstractC23034c6.m118114C(MainApplication.getAppContext(), "android.permission.ACCESS_MEDIA_LOCATION")) {
                                    str = string;
                                    f11 = 0.0f;
                                    f12 = 0.0f;
                                    int m154654f = c32050o72.m154654f(m120357v);
                                    j12 = currentTimeMillis;
                                    if (j11 <= c32050o72.f147585c && m154654f != -1) {
                                        MediaItem mediaItem = new MediaItem();
                                        z22 = z17;
                                        try {
                                            mediaItem.mo41080F0(cursor.getLong(0));
                                            mediaItem.mo41082W0(m120357v);
                                            mediaItem.m41109K0(j13);
                                            mediaItem.m41105I0(j14);
                                            mediaItem.m41107J0(j15);
                                            mediaItem.m41120R0(f12);
                                            mediaItem.m41122S0(f11);
                                            long m41095C = j12 - mediaItem.m41095C();
                                            mediaItem.m41147h1(m41095C);
                                            if (m154654f == 1) {
                                                z24 = true;
                                            } else {
                                                z24 = false;
                                            }
                                            mediaItem.m41138b1(z24);
                                            z23 = z32;
                                            mediaItem.m41116O0(z23);
                                            int i26 = i22 + 1;
                                            if (z19 && z22 && m41095C <= m2511B.m2713b() * 1000) {
                                                if (!z29 && AbstractC23041d2.m118194A(mediaItem.mo41081Q()) && C20551a.m106807b(str)) {
                                                    if (arrayList3.size() != 0) {
                                                        i19 = i24;
                                                        if (arrayList3.size() < i19) {
                                                            i21 = i23;
                                                            if (i21 == m154654f) {
                                                                arrayList = arrayList3;
                                                                if (((MediaItem) arrayList.get(arrayList3.size() - 1)).m41095C() - mediaItem.m41095C() <= m2511B.m2717f() * 1000) {
                                                                    if (i21 == 0) {
                                                                        c32050o7 = this;
                                                                        try {
                                                                            if (c32050o7.m154656j(arrayList, mediaItem) <= m2511B.m2716e()) {
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            i12 = 0;
                                                                            try {
                                                                                th.printStackTrace();
                                                                                AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 2", new Object[0]);
                                                                                if (cursor != null) {
                                                                                    try {
                                                                                        cursor.close();
                                                                                    } catch (Exception e11) {
                                                                                        e11.printStackTrace();
                                                                                    }
                                                                                }
                                                                                if (!z16) {
                                                                                    i13 = 0;
                                                                                    c32050o7.f147586d = false;
                                                                                    AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 3", new Object[i13]);
                                                                                    return i12;
                                                                                }
                                                                                i13 = 0;
                                                                                AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 3", new Object[i13]);
                                                                                return i12;
                                                                            } finally {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c32050o7 = this;
                                                                    }
                                                                } else {
                                                                    c32050o7 = this;
                                                                }
                                                                i23 = i21;
                                                                i16 = i25;
                                                                z25 = true;
                                                                if (i26 < i16) {
                                                                    if (m41095C > m2723b) {
                                                                        z28 = false;
                                                                    }
                                                                    i22 = i26;
                                                                    z29 = z25;
                                                                }
                                                                z31 = true;
                                                                i22 = i26;
                                                                z29 = z25;
                                                            } else {
                                                                c32050o7 = this;
                                                            }
                                                        } else {
                                                            c32050o7 = this;
                                                            i21 = i23;
                                                        }
                                                    } else {
                                                        c32050o7 = this;
                                                        i21 = i23;
                                                        i19 = i24;
                                                        arrayList = arrayList3;
                                                    }
                                                    if (!mediaItem.mo41081Q().equals(AbstractC23309i.m120779B5())) {
                                                        arrayList.add(mediaItem);
                                                        i23 = m154654f;
                                                    }
                                                    i23 = i21;
                                                    i16 = i25;
                                                    z25 = true;
                                                    if (i26 < i16) {
                                                    }
                                                    z31 = true;
                                                    i22 = i26;
                                                    z29 = z25;
                                                } else {
                                                    c32050o7 = this;
                                                    i19 = i24;
                                                    arrayList = arrayList3;
                                                    i23 = i23;
                                                }
                                                z25 = z29;
                                                i16 = i25;
                                                if (i26 < i16) {
                                                }
                                                z31 = true;
                                                i22 = i26;
                                                z29 = z25;
                                            } else {
                                                c32050o7 = this;
                                                i21 = i23;
                                                i19 = i24;
                                            }
                                            arrayList = arrayList3;
                                            i23 = i21;
                                            i16 = i25;
                                            z25 = true;
                                            if (i26 < i16) {
                                            }
                                            z31 = true;
                                            i22 = i26;
                                            z29 = z25;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c32050o7 = this;
                                            i12 = 0;
                                            th.printStackTrace();
                                            AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 2", new Object[0]);
                                            if (cursor != null) {
                                            }
                                            if (!z16) {
                                            }
                                            i13 = 0;
                                            AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 3", new Object[i13]);
                                            return i12;
                                        }
                                    } else {
                                        c32050o7 = c32050o72;
                                        z22 = z17;
                                        z23 = z32;
                                        i16 = i25;
                                        i19 = i24;
                                        arrayList = arrayList3;
                                        i23 = i23;
                                        z29 = true;
                                        z31 = true;
                                    }
                                    if ((z31 || !z29) && cursor.moveToNext()) {
                                        c32050o72 = c32050o7;
                                        z27 = z23;
                                        i15 = i19;
                                        arrayList2 = arrayList;
                                        i14 = i16;
                                        m2725d = z18;
                                        z26 = z16;
                                        z14 = z19;
                                        z17 = z22;
                                        currentTimeMillis = j12;
                                    }
                                }
                                float[] m106839l = new C20556f(m120357v).m106839l();
                                str = string;
                                if (m106839l.length >= 2) {
                                    float f13 = m106839l[0];
                                    f11 = m106839l[1];
                                    f12 = f13;
                                    int m154654f2 = c32050o72.m154654f(m120357v);
                                    j12 = currentTimeMillis;
                                    if (j11 <= c32050o72.f147585c) {
                                    }
                                    c32050o7 = c32050o72;
                                    z22 = z17;
                                    z23 = z32;
                                    i16 = i25;
                                    i19 = i24;
                                    arrayList = arrayList3;
                                    i23 = i23;
                                    z29 = true;
                                    z31 = true;
                                    if (z31) {
                                    }
                                    c32050o72 = c32050o7;
                                    z27 = z23;
                                    i15 = i19;
                                    arrayList2 = arrayList;
                                    i14 = i16;
                                    m2725d = z18;
                                    z26 = z16;
                                    z14 = z19;
                                    z17 = z22;
                                    currentTimeMillis = j12;
                                }
                                f11 = 0.0f;
                                f12 = 0.0f;
                                int m154654f22 = c32050o72.m154654f(m120357v);
                                j12 = currentTimeMillis;
                                if (j11 <= c32050o72.f147585c) {
                                }
                                c32050o7 = c32050o72;
                                z22 = z17;
                                z23 = z32;
                                i16 = i25;
                                i19 = i24;
                                arrayList = arrayList3;
                                i23 = i23;
                                z29 = true;
                                z31 = true;
                                if (z31) {
                                }
                                c32050o72 = c32050o7;
                                z27 = z23;
                                i15 = i19;
                                arrayList2 = arrayList;
                                i14 = i16;
                                m2725d = z18;
                                z26 = z16;
                                z14 = z19;
                                z17 = z22;
                                currentTimeMillis = j12;
                            } catch (Throwable th4) {
                                th = th4;
                                c32050o7 = c32050o72;
                            }
                        }
                        i17 = i22;
                        z21 = z28;
                    } else {
                        z18 = m2725d;
                        z16 = z26;
                        z19 = z14;
                        arrayList = arrayList2;
                        c32050o7 = c32050o72;
                        i16 = i14;
                        i17 = 0;
                        z21 = true;
                    }
                    c32050o7.f147584b = arrayList;
                    AbstractC20110a.m104535d("LOG NUMBER PHOTO " + arrayList.size(), new Object[0]);
                } catch (Throwable th5) {
                    th = th5;
                    c32050o7 = c32050o72;
                    z16 = z26;
                }
            } catch (Throwable th6) {
                th = th6;
                c32050o7 = c32050o72;
                z16 = z26;
                i12 = 0;
                cursor = null;
            }
            if (z19 && c32050o7.f147584b != null) {
                if (c32050o7.f147584b.size() > 0) {
                    i12 = 114;
                    try {
                        for (MediaItem mediaItem2 : c32050o7.f147584b) {
                            C23307g m118367a = AbstractC23067f6.m118367a(mediaItem2.mo41081Q());
                            mediaItem2.m41164p1(m118367a.f113474a);
                            mediaItem2.m41118Q0(m118367a.f113475b);
                        }
                        AbstractC23309i.m121613Xp(((MediaItem) c32050o7.f147584b.get(0)).mo41081Q());
                        i18 = i11;
                        if (i18 == 1) {
                            c32050o7.m154653e(c32050o7.f147584b);
                        }
                        Collections.reverse(c32050o7.f147584b);
                        if (!z18 && i17 >= i16 && z21) {
                            c32050o7.f147587e = true;
                            c32050o7.f147588f = c32050o7.f147585c;
                        } else {
                            c32050o7.f147587e = false;
                            c32050o7.f147588f = 0L;
                        }
                        if (c32050o7.f147584b != null && !c32050o7.f147584b.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            it = c32050o7.f147584b.iterator();
                            while (it.hasNext()) {
                                hashSet.add(((MediaItem) it.next()).m41104I());
                            }
                            c32050o7.f147591i.add(hashSet);
                        }
                        C23744a.m124114c().m124116d(102, new Object[0]);
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                        if (!z16) {
                            c32050o7.f147586d = false;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        th.printStackTrace();
                        AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 2", new Object[0]);
                        if (cursor != null) {
                        }
                        if (!z16) {
                        }
                        i13 = 0;
                        AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 3", new Object[i13]);
                        return i12;
                    }
                    i13 = 0;
                    AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 3", new Object[i13]);
                    return i12;
                }
            }
            i18 = i11;
            i12 = 0;
            if (i18 == 1) {
            }
            Collections.reverse(c32050o7.f147584b);
            if (!z18) {
            }
            c32050o7.f147587e = false;
            c32050o7.f147588f = 0L;
            if (c32050o7.f147584b != null) {
                HashSet hashSet2 = new HashSet();
                it = c32050o7.f147584b.iterator();
                while (it.hasNext()) {
                }
                c32050o7.f147591i.add(hashSet2);
            }
            C23744a.m124114c().m124116d(102, new Object[0]);
            if (cursor != null) {
            }
            if (!z16) {
            }
            i13 = 0;
            AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 3", new Object[i13]);
            return i12;
        }
        if (c32050o72.f147587e) {
            C23744a.m124114c().m124116d(102, new Object[0]);
        }
        AbstractC20110a.m104535d("LOG NUMBER PHOTO STOP 1 " + c32050o72.f147586d, new Object[0]);
        return 0;
    }

    /* renamed from: l */
    public void m154662l() {
        this.f147584b = null;
    }

    /* renamed from: m */
    public void m154663m(List list) {
        this.f147589g.m111571b();
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f147589g.m111570a(((MediaItem) list.get(i11)).mo41090x());
        }
        this.f147590h = System.currentTimeMillis();
    }

    /* renamed from: n */
    public void m154664n(long j11) {
        if (this.f147585c != j11) {
            this.f147585c = j11;
            C0824j.m2153b(new b());
        }
    }

    /* renamed from: o */
    public void m154665o(String str, List list, boolean z11, String str2) {
        if (list != null && !list.isEmpty()) {
            String format = String.format(Locale.US, "{\"num\": %d, \"expiredTime\": %d, \"scsh\": %d, \"hasUnread\": %d}", Integer.valueOf(list.size()), Long.valueOf(((MediaItem) list.get(0)).m41132Y()), Integer.valueOf(((MediaItem) list.get(0)).m41171t0() ? 1 : 0), Integer.valueOf(z11 ? 1 : 0));
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            arrayList.add(format);
            C0815e1.m2075D().m2100V(new C23648e(34, "chat_photosuggest", str.equals("photo_suggest_show") ? 1 : 0, str, (String[]) arrayList.toArray(new String[0])), false);
        }
    }

    /* renamed from: p */
    public void m154666p(C17945a0 c17945a0, boolean z11, String str) {
        String str2;
        if (!c17945a0.m94871D7()) {
            return;
        }
        int i11 = 0;
        while (true) {
            try {
                if (i11 < this.f147591i.size()) {
                    if (((Set) this.f147591i.get(i11)).contains(((C18009w0) c17945a0.m94929K2()).m95774k())) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        if (i11 != -1) {
            this.f147591i.remove(i11);
            if (z11) {
                str2 = "photo_suggest_msg_undo";
            } else {
                str2 = "photo_suggest_msg_delete";
            }
            String str3 = str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            C0815e1.m2075D().m2100V(new C23648e(34, "chat_photosuggest", 0, str3, (String[]) arrayList.toArray(new String[0])), true);
        }
    }
}
