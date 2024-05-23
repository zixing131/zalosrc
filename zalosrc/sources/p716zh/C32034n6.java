package p716zh;

import am.AbstractC0924m0;
import android.content.Context;
import android.text.TextUtils;
import bp0.AbstractC3096i0;
import com.androidquery.util.AbstractC3972e;
import com.zing.zalo.MainApplication;
import com.zing.zalo.media.download.AbstractC9010h;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17969i0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23041d2;
import me0.AbstractC23204s0;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import mx.AbstractC23466c;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p056cj.C3538f;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p405ov.C24559a;
import p405ov.C24561c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vi0.C28264b;

/* renamed from: zh.n6 */
/* loaded from: classes.dex */
public final class C32034n6 {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f147501a;

    /* renamed from: zh.n6$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f147502q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C32034n6 mo12V4() {
            return c.f147503a.m154509a();
        }
    }

    /* renamed from: zh.n6$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C32034n6 m154508a() {
            return (C32034n6) C32034n6.f147501a.getValue();
        }
    }

    /* renamed from: zh.n6$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f147503a = new c();

        /* renamed from: b */
        private static final C32034n6 f147504b = new C32034n6();

        private c() {
        }

        /* renamed from: a */
        public final C32034n6 m154509a() {
            return f147504b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f147502q);
        f147501a = m129210a;
    }

    /* renamed from: i */
    public static /* synthetic */ void m154488i(C32034n6 c32034n6, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c32034n6.m154503g(c17945a0, z11);
    }

    /* renamed from: j */
    private final void m154489j() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - AbstractC23309i.m121857e7() > 604800000) {
            AbstractC23309i.m120838Cr(currentTimeMillis);
            try {
                File file = new File(C20131e.f99303a.m104953g());
                if (!file.isDirectory()) {
                    return;
                }
                List<C3538f> m42281U4 = C7960e.m41971c6().m42281U4();
                ArrayList arrayList = new ArrayList();
                if (m42281U4 != null && (!m42281U4.isEmpty())) {
                    for (C3538f c3538f : m42281U4) {
                        if (!TextUtils.isEmpty(c3538f.f14931g)) {
                            String str = c3538f.f14931g;
                            AbstractC19074t.m100207e(str, "localPath");
                            arrayList.add(str);
                        } else {
                            arrayList.add(C20131e.f99303a.m104953g() + c3538f.f14925a);
                        }
                    }
                }
                try {
                    String m121775c1 = AbstractC23309i.m121775c1();
                    if (!TextUtils.isEmpty(m121775c1)) {
                        C3538f c3538f2 = new C3538f(new JSONObject(m121775c1));
                        if (!TextUtils.isEmpty(c3538f2.f14931g)) {
                            String str2 = c3538f2.f14931g;
                            AbstractC19074t.m100207e(str2, "localPath");
                            arrayList.add(str2);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                String m122040j1 = AbstractC23309i.m122040j1();
                AbstractC19074t.m100207e(m122040j1, "getDefaultChatBg(...)");
                if (m122040j1.length() > 0) {
                    String m122040j12 = AbstractC23309i.m122040j1();
                    arrayList.add(C20131e.f99303a.m104953g() + m122040j12);
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                int length = listFiles.length;
                for (int i11 = 0; i11 < length; i11++) {
                    if (!arrayList.contains(listFiles[i11].getAbsolutePath())) {
                        String absolutePath = listFiles[i11].getAbsolutePath();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Delete: ");
                        sb2.append(absolutePath);
                        listFiles[i11].delete();
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* renamed from: l */
    private final void m154490l() {
        File[] listFiles;
        try {
            File file = new File(AbstractC20130d.m104848O0());
            if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            int length = listFiles.length;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete ");
            sb2.append(length);
            sb2.append(" photo temp files");
            int length2 = listFiles.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (listFiles[i11].lastModified() < AbstractC23304d.f113381f) {
                    String absolutePath = listFiles[i11].getAbsolutePath();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Delete: ");
                    sb3.append(absolutePath);
                    listFiles[i11].delete();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m */
    private final void m154491m() {
        File[] listFiles;
        try {
            File file = new File(AbstractC20130d.m104894s0());
            if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            int length = listFiles.length;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete ");
            sb2.append(length);
            sb2.append(" photo upload temp files");
            int length2 = listFiles.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (listFiles[i11].lastModified() < AbstractC23304d.f113381f) {
                    String absolutePath = listFiles[i11].getAbsolutePath();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Delete: ");
                    sb3.append(absolutePath);
                    listFiles[i11].delete();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n */
    private final void m154492n() {
        boolean m127149O;
        long currentTimeMillis = System.currentTimeMillis() - AbstractC23309i.m122009i7();
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis > 86400000) {
            AbstractC23309i.m120986Gr(currentTimeMillis2);
            try {
                File m119557h = AbstractC23204s0.m119557h();
                if (m119557h != null && m119557h.exists()) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    ArrayList m42105E5 = C7960e.m41971c6().m42105E5("*");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = m42105E5.iterator();
                    while (it.hasNext()) {
                        C32123ta c32123ta = (C32123ta) it.next();
                        arrayList.add(c32123ta.f148138h);
                        VideoBlendingParam videoBlendingParam = c32123ta.f148156v;
                        if (videoBlendingParam != null) {
                            arrayList2.add(videoBlendingParam.f48277q);
                        }
                    }
                    File[] listFiles = m119557h.listFiles();
                    if (listFiles == null) {
                        return;
                    }
                    for (File file : listFiles) {
                        if (currentTimeMillis3 - file.lastModified() >= 86400000) {
                            if (file.isDirectory()) {
                                try {
                                    if (!arrayList.contains(file.getName())) {
                                        AbstractC23041d2.m118209h(file.getPath());
                                    }
                                } catch (Exception e11) {
                                    AbstractC23350e.m122778h(e11);
                                }
                            } else {
                                String absolutePath = file.getAbsolutePath();
                                AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                                m127149O = AbstractC24342w.m127149O(absolutePath, ".nomedia", false, 2, null);
                                if (!m127149O && !arrayList2.contains(file.getPath())) {
                                    file.delete();
                                }
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* renamed from: o */
    private final void m154493o() {
        File[] listFiles;
        try {
            File file = new File(AbstractC20130d.m104836I0());
            if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            int length = listFiles.length;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete ");
            sb2.append(length);
            sb2.append(" compressed video temp files");
            int length2 = listFiles.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (listFiles[i11].lastModified() < AbstractC23304d.f113381f) {
                    String absolutePath = listFiles[i11].getAbsolutePath();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Delete: ");
                    sb3.append(absolutePath);
                    listFiles[i11].delete();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p */
    private final void m154494p() {
        try {
            String str = CoreUtility.getAppContext().getCacheDir().toString() + "/zalo/temp/";
            AbstractC23041d2.m118208g(str + "backup.tmp.t1");
            AbstractC23041d2.m118208g(str + "backup.tmp.t2");
            AbstractC23041d2.m118208g(str + "backup.tmp.t3");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: q */
    private final void m154495q() {
        File[] listFiles;
        try {
            File file = new File(AbstractC20130d.m104892r0());
            if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            int length = listFiles.length;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete ");
            sb2.append(length);
            sb2.append(" download temp files");
            int length2 = listFiles.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (listFiles[i11].lastModified() < AbstractC23304d.f113381f) {
                    String absolutePath = listFiles[i11].getAbsolutePath();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Delete: ");
                    sb3.append(absolutePath);
                    listFiles[i11].delete();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: r */
    private final void m154496r() {
        File[] listFiles;
        try {
            File m119558i = AbstractC23204s0.m119558i();
            if (!m119558i.isDirectory() || (listFiles = m119558i.listFiles()) == null) {
                return;
            }
            int length = listFiles.length;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete ");
            sb2.append(length);
            sb2.append(" video thumb temp files");
            int length2 = listFiles.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (listFiles[i11].lastModified() < AbstractC23304d.f113381f) {
                    String absolutePath = listFiles[i11].getAbsolutePath();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Delete: ");
                    sb3.append(absolutePath);
                    listFiles[i11].delete();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: s */
    public static final C32034n6 m154497s() {
        return Companion.m154508a();
    }

    /* renamed from: b */
    public final void m154498b() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Context m35500c = MainApplication.Companion.m35500c();
            if (Math.abs(currentTimeMillis - AbstractC23309i.m121819d7()) > 86400000) {
                AbstractC23309i.m120801Br(currentTimeMillis);
                AbstractC3972e.m18782g(m35500c, AbstractC23309i.m120884E(), AbstractC23309i.m120847D());
                File m18806s = AbstractC3972e.m18806s(m35500c);
                AbstractC3972e.m18789j0(AbstractC20130d.m104904x0());
                AbstractC3972e.m18782g(m35500c, 524288000L, 314572800L);
                AbstractC3972e.m18789j0(new File(AbstractC20130d.m104869d0()));
                AbstractC3972e.m18782g(m35500c, 10485760L, 5242880L);
                AbstractC3972e.m18789j0(new File(AbstractC20130d.m104849P()));
                AbstractC3972e.m18782g(m35500c, 30000000L, 15000000L);
                AbstractC3972e.m18789j0(m18806s);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkToCleanAQueryCache elapsed:");
            sb2.append(currentTimeMillis2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: c */
    public final void m154499c() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long m3888i2 = currentTimeMillis - AbstractC0924m0.m3888i2();
            if (m3888i2 >= 0 && m3888i2 < 86400000) {
                return;
            }
            C24561c.m127942b("LocalFileCleaner", "Check to clean semi-cache files");
            AbstractC0924m0.m3875hj(currentTimeMillis);
            AbstractC23306f.m120712t().m142368d();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LocalFileCleaner", e11);
        }
    }

    /* renamed from: d */
    public final void m154500d() {
        if (AbstractC23238v2.m119727l() && AbstractC23304d.f113381f > 0) {
            m154491m();
            m154490l();
            m154495q();
            m154489j();
            m154496r();
            m154493o();
            m154492n();
            AbstractC23041d2.m118211j(new File(C20131e.f99303a.m104936R()));
            m154494p();
            m154499c();
        }
    }

    /* renamed from: e */
    public final long m154501e() {
        try {
            long m104891r = AbstractC20130d.m104891r(C20131e.m104912E());
            long m104891r2 = AbstractC20130d.m104891r(C20131e.m104913G());
            long m104891r3 = AbstractC20130d.m104891r(C20131e.m104923r());
            long m142369g = C28264b.Companion.m142373a().m142369g();
            C20131e.f99303a.m104976u0();
            C32204z7.Companion.m155281c().m155269h();
            C24561c.m127942b("LocalFileCleaner", "Cache files cleaned! Deleted size: internal=" + m104891r + ", codeCache=" + m104891r2 + ", external=" + m104891r3);
            C24561c.m127942b("LocalFileCleaner", "Folder exist: internal=" + AbstractC23041d2.m118194A(C20131e.m104912E()) + ", external=" + AbstractC23041d2.m118194A(C20131e.m104923r()));
            AbstractC20887g.m109217D(20600, null, 2, null);
            return m104891r + m104891r2 + m104891r3 + m142369g;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LocalFileCleaner", e11);
            AbstractC20887g.m109244v(20600, null, 2, null);
            return 0L;
        }
    }

    /* renamed from: f */
    public final void m154502f(File file, long j11) {
        File[] listFiles;
        boolean m127149O;
        if (file == null || !file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        int length = listFiles.length;
        for (int i11 = 0; i11 < length; i11++) {
            String absolutePath = listFiles[i11].getAbsolutePath();
            AbstractC19074t.m100205c(absolutePath);
            m127149O = AbstractC24342w.m127149O(absolutePath, ".nomedia", false, 2, null);
            if (!m127149O && listFiles[i11].lastModified() < j11) {
                listFiles[i11].delete();
            }
        }
    }

    /* renamed from: g */
    public final void m154503g(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (!c17945a0.m94906H5()) {
            return;
        }
        C24559a.m127933c("LocalFileCleaner", "cleanMsgLocalFiles(" + c17945a0.m95104cc() + ")");
        try {
            String m94983Q3 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            if (m94983Q3.length() > 0) {
                if (!z11) {
                    if (m154506t(m94983Q3)) {
                    }
                }
                AbstractC23041d2.m118208g(m94983Q3);
            }
            AbstractC23041d2.m118208g(c17945a0.m94947M4());
            if (c17945a0.m95306y8()) {
                String m95090b5 = c17945a0.m95090b5();
                AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                if (m95090b5.length() > 0) {
                    AbstractC9010h.m48148a(m95090b5);
                    ZMediaPlayer.checkPlayingAndRemove(m95090b5, 0);
                }
                if (c17945a0.m94929K2() instanceof C17961f1) {
                    C17969i0 m94929K2 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVideo");
                    C17961f1 c17961f1 = (C17961f1) m94929K2;
                    String m95481i = c17961f1.m95481i();
                    AbstractC19074t.m100207e(m95481i, "getCompressedVideoName(...)");
                    if (m95481i.length() > 0) {
                        AbstractC23041d2.m118208g(c17961f1.m95483j());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LocalFileCleaner", e11);
        }
    }

    /* renamed from: h */
    public final void m154504h(List list) {
        AbstractC19074t.m100208f(list, "listMsg");
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m154488i(this, (C17945a0) it.next(), false, 2, null);
        }
    }

    /* renamed from: k */
    public final void m154505k() {
        try {
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/mapping-cdn.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/videoencoderlog.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/videocompresslog.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/videonotilog.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/reuselog.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/new_msg_log.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/minichatlog.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/minichatlog_1 .txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/logzlvoice.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/logReaction.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/logLiveLocation.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/logfirebase.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/group_noti_calendar.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/group_info_log.txt");
            AbstractC23041d2.m118208g(AbstractC23204s0.m119554e().getPath() + "/zalo/dupmsg_log.txt");
            String m104847O = AbstractC20130d.m104847O(true);
            if (m104847O != null) {
                AbstractC23041d2.m118211j(new File(m104847O));
            }
            AbstractC23041d2.m118211j(new File(AbstractC23204s0.m119554e().toString() + "/zalo/zbrowser/"));
            AbstractC23041d2.m118211j(new File(AbstractC23466c.m123210m("/zalo/zam_debug/")));
            AbstractC23041d2.m118211j(new File(AbstractC23466c.m123211n("/zalo/zam_user/")));
            AbstractC23041d2.m118211j(new File(AbstractC23466c.m123211n("/zalo/zam/")));
            AbstractC23041d2.m118211j(new File(AbstractC23204s0.m119554e().getPath(), "zalo/webcache"));
            AbstractC23041d2.m118211j(new File(AbstractC23204s0.m119554e().getAbsolutePath() + File.separator + AbstractC3096i0.m15497K()));
            AbstractC23041d2.m118211j(new File(AbstractC20130d.m104846N0()));
            AbstractC23041d2.m118211j(new File(AbstractC20130d.m104851Q()));
            AbstractC23041d2.m118211j(new File(AbstractC20130d.m104864Y()));
            AbstractC23041d2.m118211j(new File(AbstractC20130d.m104870e0()));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("LocalFileCleaner", e11);
        }
    }

    /* renamed from: t */
    public final boolean m154506t(String str) {
        boolean m127120J;
        boolean m127120J2;
        boolean m127120J3;
        boolean m127120J4;
        boolean m127120J5;
        AbstractC19074t.m100208f(str, "path");
        if (str.length() != 0) {
            m127120J = AbstractC24341v.m127120J(str, C20131e.m104924r0(), false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(str, C20131e.m104920n0(), false, 2, null);
                if (!m127120J2) {
                    m127120J3 = AbstractC24341v.m127120J(str, C20131e.m104914H(), false, 2, null);
                    if (!m127120J3) {
                        m127120J4 = AbstractC24341v.m127120J(str, C20131e.m104912E(), false, 2, null);
                        if (!m127120J4) {
                            m127120J5 = AbstractC24341v.m127120J(str, C20131e.m104923r(), false, 2, null);
                            if (!m127120J5) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
