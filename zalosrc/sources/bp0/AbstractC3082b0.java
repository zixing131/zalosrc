package bp0;

import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import mm0.AbstractC23350e;
import p111du.AbstractC18070b;
import p348mi.AbstractC23309i;

/* renamed from: bp0.b0 */
/* loaded from: classes7.dex */
public abstract class AbstractC3082b0 {

    /* renamed from: a */
    private static int f13117a = 1;

    /* renamed from: b */
    private static int f13118b = 1;

    /* renamed from: c */
    private static List f13119c;

    /* renamed from: d */
    private static final boolean f13120d;

    /* renamed from: e */
    private static final AbstractC18070b f13121e;

    /* renamed from: bp0.b0$a */
    /* loaded from: classes7.dex */
    class a extends AbstractC18070b {
        a(int i11) {
            super(i11);
        }

        @Override // p111du.AbstractC18070b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat mo15431d() {
            return new SimpleDateFormat("dd/MM HH:mm:ss:SSS", Locale.getDefault());
        }
    }

    static {
        boolean z11 = true;
        if (AbstractC23309i.m121405S2() != 1) {
            z11 = false;
        }
        f13120d = z11;
        f13121e = new a(3);
    }

    /* renamed from: a */
    public static synchronized void m15419a(String str) {
        synchronized (AbstractC3082b0.class) {
            if (str != null) {
                try {
                    if (f13119c == null) {
                        f13119c = new LinkedList();
                    }
                    f13119c.add(str);
                    m15430l(AbstractC3096i0.m15481C(AbstractC3096i0.m15574y()), f13119c);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: b */
    private static String m15420b(String str) {
        return Thread.currentThread().getId() + " " + str;
    }

    /* renamed from: c */
    public static void m15421c(String str, String str2) {
        if (f13117a >= 4) {
            String m15420b = m15420b(str2);
            if (m15425g()) {
                int i11 = 0;
                while (i11 <= m15420b.length() / 3000) {
                    int i12 = i11 * 3000;
                    i11++;
                    int i13 = i11 * 3000;
                    if (i13 > m15420b.length()) {
                        i13 = m15420b.length();
                    }
                    m15420b.substring(i12, i13);
                }
            }
            if (m15426h()) {
                m15419a(m15420b);
            }
        }
    }

    /* renamed from: d */
    public static void m15422d(String str, String str2) {
        if (f13117a >= 1) {
            str2 = m15420b(str2);
            if (m15425g()) {
                AbstractC23350e.m122774d(str, str2);
            }
            if (m15426h()) {
                m15419a(str2);
            }
        }
        if (f13120d) {
            m15427i(str, str2);
        }
    }

    /* renamed from: e */
    public static void m15423e(String str, String str2, Throwable th2) {
        if (f13117a >= 1) {
            str2 = m15420b(str2);
            if (m15425g()) {
                AbstractC23350e.m122775e(str, str2, th2);
            }
            if (m15426h()) {
                m15419a(str2);
            }
        }
        if (f13120d) {
            AbstractC20110a.m104542k(8, System.currentTimeMillis() + ":" + th2 + str + " " + str2, new Object[0]);
        }
    }

    /* renamed from: f */
    public static void m15424f(String str, String str2) {
        if (f13117a >= 3) {
            str2 = m15420b(str2);
            if (m15425g()) {
                int i11 = 0;
                while (i11 <= str2.length() / 3000) {
                    int i12 = i11 * 3000;
                    i11++;
                    int i13 = i11 * 3000;
                    if (i13 > str2.length()) {
                        i13 = str2.length();
                    }
                    str2.substring(i12, i13);
                }
            }
            if (m15426h()) {
                m15419a(str2);
            }
        }
        if (f13120d) {
            m15427i(str, str2);
        }
    }

    /* renamed from: g */
    public static boolean m15425g() {
        int i11 = f13118b;
        return i11 == 1 || i11 == 3;
    }

    /* renamed from: h */
    public static boolean m15426h() {
        int i11 = f13118b;
        return i11 == 2 || i11 == 3;
    }

    /* renamed from: i */
    private static void m15427i(String str, String str2) {
        AbstractC18070b abstractC18070b = f13121e;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) abstractC18070b.mo7484b();
        AbstractC20110a.m104542k(8, simpleDateFormat.format(Calendar.getInstance().getTime()) + ":" + str + ": " + str2, new Object[0]);
        abstractC18070b.mo7483a(simpleDateFormat);
    }

    /* renamed from: j */
    public static void m15428j(int i11) {
        f13117a = i11;
    }

    /* renamed from: k */
    public static void m15429k(String str, String str2) {
        if (f13117a >= 2) {
            str2 = m15420b(str2);
            m15425g();
            if (m15426h()) {
                m15419a(str2);
            }
        }
        if (f13120d) {
            AbstractC20110a.m104542k(8, System.currentTimeMillis() + ":" + str + ": " + str2, new Object[0]);
        }
    }

    /* renamed from: l */
    public static void m15430l(File file, List list) {
        if (file != null && list != null && list.size() > 30) {
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str != null) {
                            fileOutputStream.write(str.getBytes());
                            fileOutputStream.write(10);
                        }
                    }
                    list.clear();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } finally {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
