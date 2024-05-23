package r30;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import me0.AbstractC23059e9;
import me0.AbstractC23088h5;
import p142ey.C18644n;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p716zh.C32035n7;

/* renamed from: r30.h */
/* loaded from: classes5.dex */
public abstract class AbstractC25638h {
    /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ae A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #5 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x000a, B:7:0x0113, B:9:0x0119, B:13:0x0127, B:16:0x0134, B:19:0x018d, B:26:0x01a9, B:33:0x01ae, B:29:0x01a6, B:58:0x018a, B:60:0x0018, B:63:0x0029, B:134:0x0110, B:67:0x0031, B:70:0x0042, B:71:0x0055, B:90:0x00a9, B:107:0x00b8, B:109:0x00c0, B:110:0x00c6, B:112:0x00cc, B:114:0x00d8, B:116:0x00de, B:118:0x00e4, B:120:0x00e7, B:122:0x0100, B:128:0x0103, B:130:0x010c, B:102:0x00b4, B:103:0x00b7, B:131:0x0053, B:76:0x0067, B:78:0x0073, B:80:0x0079, B:82:0x007f, B:84:0x0082, B:86:0x008e, B:105:0x00ad, B:37:0x0145, B:39:0x0155, B:41:0x016f, B:43:0x0175, B:45:0x0184, B:54:0x0187, B:23:0x0195), top: B:1:0x0000, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m132491a() {
        long j11;
        String[] split;
        boolean z11;
        String[] split2;
        long m121489Uc;
        long j12;
        long currentTimeMillis;
        int size;
        try {
            boolean z12 = false;
            if (AbstractC23304d.f113345X <= 0) {
                if (!TextUtils.isEmpty(AbstractC23309i.m121858e8())) {
                }
                if (AbstractC23304d.f113349Y <= 0 || !C21927m.m114302u().m114367y().isEmpty()) {
                    m121489Uc = AbstractC23309i.m121489Uc();
                    if (m121489Uc != 0) {
                        j12 = 259200000;
                    } else {
                        j12 = m121489Uc;
                    }
                    ArrayList arrayList = new ArrayList();
                    currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - AbstractC23304d.f113349Y >= j12) {
                        try {
                            long j13 = 0;
                            for (int size2 = C21927m.m114302u().m114367y().size() - 1; size2 >= 0; size2--) {
                                C32035n7 c32035n7 = (C32035n7) C21927m.m114302u().m114367y().get(size2);
                                String m154511b = c32035n7.m154511b();
                                long m154510a = c32035n7.m154510a();
                                if (m154510a > 0 && currentTimeMillis - m154510a >= j12) {
                                    arrayList.add(m154511b);
                                } else if (j13 == 0 || j13 > m154510a) {
                                    j13 = m154510a;
                                }
                            }
                            AbstractC23304d.f113349Y = j13;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    for (size = arrayList.size() - 1; size >= 0; size--) {
                        try {
                            z12 = C21927m.m114302u().m114350o0((String) arrayList.get(size));
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (!z12) {
                        C18644n.m98524E();
                        return;
                    }
                    return;
                }
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            long m121526Vc = AbstractC23309i.m121526Vc();
            if (m121526Vc == 0) {
                j11 = 259200000;
            } else {
                j11 = m121526Vc;
            }
            if (currentTimeMillis2 - AbstractC23304d.f113345X >= j11) {
                try {
                    String m121858e8 = AbstractC23309i.m121858e8();
                    ArrayList arrayList2 = new ArrayList();
                    if (!TextUtils.isEmpty(m121858e8)) {
                        arrayList2 = new ArrayList(Arrays.asList(TextUtils.split(m121858e8, ",")));
                    } else {
                        AbstractC23304d.f113345X = 0L;
                    }
                    int size3 = arrayList2.size();
                    boolean z13 = false;
                    int size4 = arrayList2.size() - 1;
                    long j14 = 0;
                    while (size4 >= 0) {
                        try {
                            try {
                                String str = (String) arrayList2.get(size4);
                                if (!TextUtils.isEmpty(str) && str.contains("_") && (split2 = TextUtils.split(str, "_")) != null && split2.length == 2) {
                                    long parseLong = Long.parseLong(split2[1]);
                                    if (currentTimeMillis2 - parseLong >= j11) {
                                        AbstractC23059e9.m118317F(split2[0]);
                                        z13 = true;
                                    } else if (j14 == 0 || j14 > parseLong) {
                                        j14 = parseLong;
                                    }
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                            if (z11) {
                                size4--;
                            }
                            size4--;
                        } finally {
                            arrayList2.remove(size4);
                        }
                    }
                    AbstractC23304d.f113345X = j14;
                    if (arrayList2.size() != size3) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            String str2 = (String) arrayList2.get(i11);
                            if (!TextUtils.isEmpty(str2) && str2.contains("_") && (split = TextUtils.split(str2, "_")) != null && split.length == 2) {
                                arrayList3.add(split[0] + "_" + split[1]);
                            }
                        }
                        AbstractC23309i.m120950Fs(TextUtils.join(",", arrayList3));
                    }
                    if (z13) {
                        AbstractC23088h5.m118431l();
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
            if (AbstractC23304d.f113349Y <= 0) {
            }
            m121489Uc = AbstractC23309i.m121489Uc();
            if (m121489Uc != 0) {
            }
            ArrayList arrayList4 = new ArrayList();
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - AbstractC23304d.f113349Y >= j12) {
            }
            while (size >= 0) {
            }
            if (!z12) {
            }
        } catch (Exception e15) {
            e15.printStackTrace();
        }
    }

    /* renamed from: b */
    public static ArrayList m132492b() {
        String m121858e8 = AbstractC23309i.m121858e8();
        if (!TextUtils.isEmpty(m121858e8)) {
            return new ArrayList(Arrays.asList(TextUtils.split(m121858e8, ",")));
        }
        return new ArrayList();
    }

    /* renamed from: c */
    public static void m132493c() {
        try {
            ArrayList m132492b = m132492b();
            long j11 = 0;
            for (int size = m132492b.size() - 1; size >= 0; size--) {
                try {
                    String str = (String) m132492b.get(size);
                    if (!TextUtils.isEmpty(str) && str.contains("_")) {
                        long parseLong = Long.parseLong(TextUtils.split(str, "_")[1]);
                        if (j11 == 0 || j11 > parseLong) {
                            j11 = parseLong;
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (j11 > 0) {
                AbstractC23304d.f113345X = j11;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m132494d(String str) {
        String[] split;
        try {
            ArrayList m132492b = m132492b();
            for (int size = m132492b.size() - 1; size >= 0; size--) {
                try {
                    String str2 = (String) m132492b.get(size);
                    if (!TextUtils.isEmpty(str2) && str2.contains("_") && (split = TextUtils.split(str2, "_")) != null && split.length == 2 && split[0].equals(str)) {
                        m132492b.remove(size);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            AbstractC23309i.m120950Fs(TextUtils.join(",", m132492b));
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m132495e(String str, long j11) {
        ArrayList m132492b = m132492b();
        m132492b.add(str + "_" + j11);
        AbstractC23309i.m120950Fs(TextUtils.join(",", m132492b));
        long j12 = AbstractC23304d.f113345X;
        if (j12 == 0 || j12 > j11) {
            AbstractC23304d.f113345X = j11;
        }
    }
}
