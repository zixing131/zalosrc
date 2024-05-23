package me0;

import android.content.Context;
import android.util.Pair;
import c30.C3229a;
import c30.C3245i;
import com.androidquery.util.AbstractC3972e;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiStickers;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;

/* renamed from: me0.g8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23080g8 {
    /* renamed from: a */
    public static Pair m118396a(Context context, boolean z11) {
        int i11;
        try {
            i11 = m118402g(context);
        } catch (Exception unused) {
            i11 = 150;
        }
        int i12 = (int) (i11 * 0.8d);
        try {
            i12 = Math.min(i12, ((Math.max(AbstractC23136l9.m118728m0(context, z11), AbstractC23136l9.m118742r(200.0f)) - (ChatRow.getReplyBubbleSpacingLeft() * 2)) - (ChatRowMultiStickers.getStickerSpacing() * 2)) / 3);
            i11 = (int) (i12 / 0.8d);
        } catch (Exception unused2) {
        }
        return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: b */
    private static void m118397b(ArrayList arrayList) {
        int min;
        try {
            C3245i c3245i = new C3245i(0, "LOCAL_DEFINE_NAME_CATE", "", 1, "", "", "", "", 30, 0, 0, 1, -1, "", 1, 0, "", 0L);
            boolean m120827Cg = AbstractC23309i.m120827Cg();
            int m121861ea = AbstractC23309i.m121861ea() - 1;
            if (m121861ea < 0) {
                min = 0;
            } else {
                min = Math.min(m121861ea, arrayList.size());
            }
            if (!m120827Cg) {
                arrayList.add(min, c3245i);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: c */
    public static void m118398c(String str) {
        String[] list;
        File file = new File(str);
        if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                if (file2.isDirectory()) {
                    AbstractC20130d.m104887p(file2);
                } else {
                    file2.delete();
                    String absolutePath = file2.getAbsolutePath();
                    File m18745B = AbstractC3972e.m18745B(AbstractC3972e.m18807t(MainApplication.getAppContext(), 1), absolutePath);
                    if (m18745B == null) {
                        m18745B = AbstractC3972e.m18745B(AbstractC3972e.m18807t(MainApplication.getAppContext(), 0), absolutePath);
                    }
                    if (m18745B != null && m18745B.exists()) {
                        m18745B.delete();
                    }
                }
            }
        }
        file.delete();
    }

    /* renamed from: d */
    public static ArrayList m118399d() {
        ArrayList m42519r5 = C7960e.m41971c6().m42519r5(CoreUtility.f89233i);
        m118397b(m42519r5);
        return m42519r5;
    }

    /* renamed from: e */
    public static List m118400e(boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = AbstractC23304d.f113261C;
        synchronized (arrayList2) {
            try {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C3245i c3245i = (C3245i) it.next();
                    int i11 = c3245i.f13854b;
                    if (i11 == -2) {
                        if (z11) {
                            arrayList.add(c3245i);
                        }
                    }
                    if (i11 == -10 && C3229a.f13790a.m16391e() && z12) {
                        arrayList.add(c3245i);
                    }
                    if (!c3245i.m16462d().isEmpty() && !c3245i.m16464f().isEmpty()) {
                        arrayList.add(c3245i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m118397b(arrayList);
        return arrayList;
    }

    /* renamed from: f */
    public static int m118401f(Context context) {
        if (AbstractC23136l9.m118658J0(context)) {
            if (AbstractC23136l9.m118654H0(context)) {
                return 130;
            }
            if (AbstractC23136l9.m118652G0(context) && AbstractC23136l9.m118731n0(context) <= 480) {
                return 130;
            }
            return 240;
        }
        return 360;
    }

    /* renamed from: g */
    public static int m118402g(Context context) {
        int m118653H = AbstractC23136l9.m118653H(context);
        if (m118653H != 0 && m118653H != 3) {
            if (m118653H == 1) {
                return AbstractC23136l9.m118745s(context, 110.0f);
            }
            if (m118653H == 2) {
                return AbstractC23136l9.m118745s(context, 120.0f);
            }
            if (m118653H == 4) {
                return AbstractC23136l9.m118745s(context, 140.0f);
            }
            return AbstractC23136l9.m118745s(context, 110.0f);
        }
        return AbstractC23136l9.m118745s(context, 130.0f);
    }

    /* renamed from: h */
    public static boolean m118403h(int i11, int i12) {
        return i12 >= 0 && i11 > 0;
    }
}
