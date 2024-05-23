package ag0;

import am.AbstractC0924m0;
import android.os.Environment;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import hu.AbstractC20129c;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23204s0;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;

/* renamed from: ag0.o */
/* loaded from: classes.dex */
public class C0834o extends Thread {

    /* renamed from: p */
    private static boolean f2939p = false;

    public C0834o() {
        super("Z:MigrateData");
    }

    /* renamed from: a */
    private void m2210a(File file, File file2) {
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return;
                    }
                    for (File file3 : listFiles) {
                        try {
                            AbstractC23238v2.m119717b(file3, new File(file2.getAbsolutePath() + File.separator + file3.getName()));
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        }
    }

    /* renamed from: b */
    private void m2211b(List list) {
        if (!AbstractC23309i.m121012Hg() && list != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                File m120294F = AbstractC23280z4.m120294F(str);
                File file = new File(str);
                if (m120294F.exists() && !file.exists()) {
                    try {
                        if (!file.getParentFile().exists()) {
                            file.getParentFile().mkdirs();
                        }
                        AbstractC23238v2.m119717b(m120294F, file);
                        i11++;
                    } catch (IOException e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            }
            if (i11 > 0) {
                AbstractC20110a.m104542k(8, "skip photo in sdcard for gallery: %d", Integer.valueOf(i11));
                AbstractC20887g.m109246x(21062, currentTimeMillis);
            }
            AbstractC23309i.m121693Zv(true);
        }
    }

    /* renamed from: c */
    private void m2212c() {
        String m104833H = AbstractC20130d.m104833H("/zalo/zam/");
        if (!TextUtils.isEmpty(m104833H)) {
            AbstractC23041d2.m118211j(new File(m104833H));
        }
        String m104833H2 = AbstractC20130d.m104833H("/zalo/zam_user/");
        if (!TextUtils.isEmpty(m104833H2)) {
            AbstractC23041d2.m118211j(new File(m104833H2));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean m104883n;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        if (!f2939p && !AbstractC0924m0.m3687bb() && AbstractC23034c6.m118121G()) {
            f2939p = true;
            long currentTimeMillis = System.currentTimeMillis();
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104794b())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104794b(), AbstractC20130d.m104899v())) {
                    m104883n = AbstractC20130d.m104854R0(AbstractC20129c.m104794b(), AbstractC20130d.m104899v(), null);
                } else {
                    m104883n = true;
                }
                AbstractC20110a.m104542k(8, "migrate background folder from cache to user-data", new Object[0]);
                z11 = true;
            } else {
                m104883n = AbstractC20130d.m104883n(AbstractC20129c.m104794b());
                z11 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104790F())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104790F(), AbstractC20130d.m104840K0())) {
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104790F(), AbstractC20130d.m104840K0(), null) && m104883n) {
                        m104883n = true;
                    } else {
                        m104883n = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate voice folder from cache to user-data", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104790F()) && m104883n) {
                m104883n = true;
            } else {
                m104883n = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104803k())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104803k(), AbstractC20130d.m104871f0())) {
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104803k(), AbstractC20130d.m104871f0(), null) && m104883n) {
                        m104883n = true;
                    } else {
                        m104883n = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate doodle folder from cache to user-data", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104803k()) && m104883n) {
                m104883n = true;
            } else {
                m104883n = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104805m())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104805m(), AbstractC20130d.m104872g0())) {
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104805m(), AbstractC20130d.m104872g0(), null) && m104883n) {
                        m104883n = true;
                    } else {
                        m104883n = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate picture folder from cache to user-data", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104805m()) && m104883n) {
                m104883n = true;
            } else {
                m104883n = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104797e())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104797e(), AbstractC20130d.m104823C())) {
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104797e(), AbstractC20130d.m104823C(), null) && m104883n) {
                        m104883n = true;
                    } else {
                        m104883n = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate data folder from cache to user-data", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104797e()) && m104883n) {
                m104883n = true;
            } else {
                m104883n = false;
            }
            if (AbstractC23041d2.m118206e(new File(AbstractC20129c.m104788D())) && m104883n) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104817y())) {
                if (AbstractC0924m0.m3047Fa()) {
                    m2210a(new File(AbstractC20129c.m104817y()), new File(AbstractC20130d.m104828E0()));
                    AbstractC20110a.m104542k(8, "migrate videos compressed folder success ...", new Object[0]);
                    z11 = true;
                }
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104817y()) && z12) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104789E())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104789E(), AbstractC20130d.m104838J0())) {
                    AbstractC20110a.m104542k(8, "migrate video thumb folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104789E(), AbstractC20130d.m104838J0(), null) && z12) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate video thumb folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104789E()) && z12) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AbstractC23041d2.m118206e(new File(AbstractC20129c.m104787C())) && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (AbstractC20130d.m104883n(AbstractC20129c.m104786B()) && z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104810r())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104810r(), AbstractC20130d.m104902w0())) {
                    AbstractC20110a.m104542k(8, "migrate cache default videos folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104810r(), AbstractC20130d.m104902w0(), null) && z14) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate cache default videos folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104810r()) && z14) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104812t())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104812t(), AbstractC20130d.m104908z0())) {
                    AbstractC20110a.m104542k(8, "migrate cache feed videos folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104812t(), AbstractC20130d.m104908z0(), null) && z14) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate cache feed videos folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104812t()) && z14) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104813u())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104813u(), AbstractC20130d.m104820A0())) {
                    AbstractC20110a.m104542k(8, "migrate cache gif videos folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104813u(), AbstractC20130d.m104820A0(), null) && z14) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate cache gif videos folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104813u()) && z14) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104814v())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104814v(), AbstractC20130d.m104822B0())) {
                    AbstractC20110a.m104542k(8, "migrate cache oa videos folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104814v(), AbstractC20130d.m104822B0(), null) && z14) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate cache oa videos folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104814v()) && z14) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104815w())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104815w(), AbstractC20130d.m104824C0())) {
                    AbstractC20110a.m104542k(8, "migrate cache story videos folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104815w(), AbstractC20130d.m104824C0(), null) && z14) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate cache story videos folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104815w()) && z14) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104809q())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104809q(), AbstractC20130d.m104826D0())) {
                    AbstractC20110a.m104542k(8, "migrate cache chat videos folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104809q(), AbstractC20130d.m104826D0(), null) && z14) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate cache chat videos folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104809q()) && z14) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (AbstractC20130d.m104883n(AbstractC20129c.m104811s()) && z14) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (AbstractC23041d2.m118206e(new File(AbstractC20129c.m104785A())) && z15) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (AbstractC23041d2.m118206e(new File(AbstractC20129c.m104816x())) && z16) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (AbstractC20130d.m104883n(AbstractC20129c.m104818z()) && z17) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (AbstractC20130d.m104883n(AbstractC20129c.m104792H()) && z18) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (z11) {
                AbstractC0924m0.m3315Oh(false);
            }
            C20131e c20131e = C20131e.f99303a;
            String m104942a0 = c20131e.m104942a0();
            String m104927I = c20131e.m104927I();
            if (AbstractC20130d.m104860U0(m104927I)) {
                if (!AbstractC20130d.m104893s(m104927I, m104942a0)) {
                    AbstractC20110a.m104542k(8, "migrate sticker ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(m104927I, m104942a0, null) && z19) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate sticker folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(m104927I) && z19) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104801i())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104801i(), AbstractC20130d.m104831G())) {
                    AbstractC20110a.m104542k(8, "migrate decor ... fast migrate fail .... migrate data normally ....", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104801i(), AbstractC20130d.m104831G(), null) && z19) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate decor folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104801i()) && z19) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104800h())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104800h(), AbstractC20130d.m104829F())) {
                    AbstractC20110a.m104542k(8, "migrate animation ... fast migrate fail ... migrate data normally ... ", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104800h(), AbstractC20130d.m104829F(), null) && z19) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate animation folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104800h()) && z19) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104793a())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104793a(), AbstractC20130d.m104895t())) {
                    AbstractC20110a.m104542k(8, "migrate animfilter .... fast migrate fail ... migrate data normally ... ", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104793a(), AbstractC20130d.m104895t(), null) && z19) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate animfilter folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104793a()) && z19) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104802j())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104802j(), AbstractC20130d.m104849P())) {
                    AbstractC20110a.m104542k(8, "migrate cache file .... fast migrate fail ... migrate data normally ....", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104802j(), AbstractC20130d.m104849P(), null) && z19) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate cache file folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104802j()) && z19) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104796d())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104796d(), AbstractC20130d.m104819A(true))) {
                    AbstractC20110a.m104542k(8, "migrate cache img .... fast migrate fail ... migrate data normally ... ", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104796d(), AbstractC20130d.m104819A(true), null) && z19) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate cache img folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104796d()) && z19) {
                z19 = true;
            } else {
                z19 = false;
            }
            String m104946c0 = c20131e.m104946c0();
            String m104928J = c20131e.m104928J();
            if (AbstractC20130d.m104860U0(m104928J)) {
                if (!AbstractC20130d.m104893s(m104928J, m104946c0)) {
                    AbstractC20110a.m104542k(8, "migrate thumbs folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(m104928J, m104946c0, null) && z19) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate thumbs folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(m104928J) && z19) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (AbstractC23041d2.m118206e(new File(AbstractC23204s0.m119554e(), "zalo" + File.separator + "theme")) && z19) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104795c())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104795c(), AbstractC20130d.m104899v())) {
                    AbstractC20110a.m104542k(8, "migrate background folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104795c(), AbstractC20130d.m104899v(), null) && z21) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate background folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104795c()) && z21) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104791G())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104791G(), AbstractC20130d.m104840K0())) {
                    AbstractC20110a.m104542k(8, "migrate voice folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104791G(), AbstractC20130d.m104840K0(), null) && z21) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate voice folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104791G()) && z21) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104804l())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104804l(), AbstractC20130d.m104871f0())) {
                    AbstractC20110a.m104542k(8, "migrate paint folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104804l(), AbstractC20130d.m104871f0(), null) && z21) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate paint folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104804l()) && z21) {
                z21 = true;
            } else {
                z21 = false;
            }
            List m120337l = AbstractC23280z4.m120337l();
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104806n(false)) && !AbstractC23309i.m122578xg()) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104806n(false), AbstractC20130d.m104872g0())) {
                    AbstractC20110a.m104542k(8, "migrate picture folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104806n(false), AbstractC20130d.m104872g0(), m120337l) && z21) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                }
                AbstractC23309i.m120840Ct(true);
                AbstractC20110a.m104542k(8, "migrate picture folder success ...", new Object[0]);
                z11 = true;
            } else {
                if (!AbstractC23309i.m122578xg()) {
                    AbstractC23309i.m120840Ct(true);
                }
                if (AbstractC20130d.m104883n(AbstractC20129c.m104806n(false)) && z21) {
                    z21 = true;
                } else {
                    z21 = false;
                }
            }
            m2211b(m120337l);
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104798f())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104798f(), AbstractC20130d.m104823C())) {
                    AbstractC20110a.m104542k(8, "migrate data folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104798f(), AbstractC20130d.m104823C(), null) && z21) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate data folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104798f()) && z21) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (AbstractC20130d.m104860U0(AbstractC20129c.m104799g())) {
                if (!AbstractC20130d.m104893s(AbstractC20129c.m104799g(), AbstractC20130d.m104825D())) {
                    AbstractC20110a.m104542k(8, "migrate download folder ... fast migrate fail ... migrate data normally ...", new Object[0]);
                    if (AbstractC20130d.m104854R0(AbstractC20129c.m104799g(), AbstractC20130d.m104825D(), null) && z21) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                }
                AbstractC20110a.m104542k(8, "migrate voice folder success ...", new Object[0]);
                z11 = true;
            } else if (AbstractC20130d.m104883n(AbstractC20129c.m104799g()) && z21) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (AbstractC23041d2.m118206e(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/zalo/audio/")) && z21) {
                z22 = true;
            } else {
                z22 = false;
            }
            if (AbstractC23041d2.m118206e(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/zalo/instant_upload/")) && z22) {
                z23 = true;
            } else {
                z23 = false;
            }
            if (AbstractC23041d2.m118206e(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/zalo/zlogs/")) && z23) {
                z24 = true;
            } else {
                z24 = false;
            }
            if (AbstractC23041d2.m118206e(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/zalo/tm_pic/")) && z24) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (AbstractC23041d2.m118206e(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/zalo/temp/")) && z25) {
                z26 = true;
            } else {
                z26 = false;
            }
            m2212c();
            AbstractC20130d.m104883n(Environment.getExternalStorageDirectory().getAbsolutePath() + "/zalo");
            AbstractC20110a.m104542k(8, "migrate from sdcard to user-data in total time %d - run(%b)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Boolean.valueOf(z11));
            if (z11) {
                AbstractC20887g.m109246x(21060, currentTimeMillis);
            }
            f2939p = false;
            AbstractC0924m0.m3115Hk(z26);
        }
    }
}
