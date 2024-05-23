package p716zh;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import dj.C18009w0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me0.AbstractC23136l9;
import me0.AbstractC23238v2;
import p056cj.C3535c;
import p361nb.C23648e;
import p363nh.C23744a;

/* renamed from: zh.r5 */
/* loaded from: classes3.dex */
public class C32090r5 {

    /* renamed from: m */
    static C32090r5 f147854m;

    /* renamed from: c */
    C3535c f147857c;

    /* renamed from: d */
    long f147858d;

    /* renamed from: e */
    String f147859e;

    /* renamed from: f */
    volatile boolean f147860f;

    /* renamed from: g */
    int f147861g;

    /* renamed from: j */
    boolean f147864j = false;

    /* renamed from: k */
    Runnable f147865k = new a();

    /* renamed from: l */
    c f147866l = new b();

    /* renamed from: h */
    Set f147862h = Collections.synchronizedSet(new HashSet());

    /* renamed from: i */
    Set f147863i = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    Set f147856b = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    List f147855a = new ArrayList();

    /* renamed from: zh.r5$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (int size = C32090r5.this.f147855a.size() - 1; size >= 0; size--) {
                    C17945a0 c17945a0 = (C17945a0) C32090r5.this.f147855a.get(size);
                    if (!c17945a0.m95032V6() || !c17945a0.m95306y8() || (c17945a0.m94929K2() != null && !TextUtils.isEmpty(c17945a0.m94929K2().f91014s))) {
                        if (c17945a0.m95032V6() && c17945a0.m94864C6() && (c17945a0.m94929K2() == null || !(c17945a0.m94929K2() instanceof C18009w0) || TextUtils.isEmpty(c17945a0.m94929K2().mo95598f()))) {
                            C32090r5.this.f147855a.remove(size);
                        } else if (c17945a0.m95288w8()) {
                            C32090r5.this.f147855a.remove(size);
                        }
                    }
                    C32090r5.this.f147855a.remove(size);
                }
                if (C32090r5.this.f147855a.size() == 0) {
                    C32090r5.this.m154814d();
                    ToastUtils.showMess(true, MainApplication.getAppContext().getString(AbstractC8020f0.str_group_download_zero_photo_video));
                    if (C32090r5.this.f147858d != 0) {
                        C0815e1.m2075D().m2100V(new C23648e(35, "", 1, "download_success_media", ""), false);
                        return;
                    }
                    return;
                }
                C23744a.m124114c().m124116d(46, new Object[0]);
                C32090r5.this.f147864j = true ^ AbstractC23238v2.m119726k();
                C32090r5 c32090r5 = C32090r5.this;
                c32090r5.m154828s(c32090r5.f147855a);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                C32090r5.this.m154814d();
            }
        }
    }

    /* renamed from: zh.r5$b */
    /* loaded from: classes3.dex */
    class b implements c {
        b() {
        }

        @Override // p716zh.C32090r5.c
        /* renamed from: a */
        public void mo154829a(long j11) {
            synchronized (C32090r5.f147854m) {
                try {
                    if (!C32090r5.this.f147863i.contains(Long.valueOf(j11))) {
                        C32090r5.this.f147863i.add(Long.valueOf(j11));
                        C23744a.m124114c().m124116d(46, new Object[0]);
                        C32090r5 c32090r5 = C32090r5.this;
                        if (c32090r5.f147861g < c32090r5.f147855a.size()) {
                            C32090r5 c32090r52 = C32090r5.this;
                            c32090r52.m154828s(c32090r52.f147855a);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p716zh.C32090r5.c
        /* renamed from: b */
        public void mo154830b(long j11) {
            synchronized (C32090r5.f147854m) {
                try {
                    if (!C32090r5.this.f147862h.contains(Long.valueOf(j11))) {
                        C32090r5.this.f147862h.add(Long.valueOf(j11));
                        C32090r5.this.f147863i.remove(Long.valueOf(j11));
                        C23744a.m124114c().m124116d(46, new Object[0]);
                        C32090r5 c32090r5 = C32090r5.this;
                        if (c32090r5.f147861g < c32090r5.f147855a.size()) {
                            C32090r5 c32090r52 = C32090r5.this;
                            c32090r52.m154828s(c32090r52.f147855a);
                        } else if (C32090r5.this.m154822m() && C32090r5.this.f147858d != 0) {
                            C0815e1.m2075D().m2100V(new C23648e(35, "", 1, "download_success_media", ""), false);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: zh.r5$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo154829a(long j11);

        /* renamed from: b */
        void mo154830b(long j11);
    }

    C32090r5() {
    }

    /* renamed from: i */
    public static C32090r5 m154810i() {
        if (f147854m == null) {
            synchronized (C32090r5.class) {
                f147854m = new C32090r5();
            }
        }
        return f147854m;
    }

    /* renamed from: a */
    public void m154811a() {
        m154814d();
    }

    /* renamed from: b */
    public void m154812b(String str) {
        if (!TextUtils.equals(m154821l(), str)) {
            return;
        }
        m154814d();
    }

    /* renamed from: c */
    public boolean m154813c() {
        return this.f147864j;
    }

    /* renamed from: d */
    public void m154814d() {
        if (!this.f147860f) {
            return;
        }
        this.f147860f = false;
        int i11 = -1;
        for (C17945a0 c17945a0 : this.f147855a) {
            i11++;
            c17945a0.m94858Ba(null);
            if (i11 == 0 || i11 == this.f147855a.size() - 1) {
                C23744a.m124114c().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
            }
        }
        this.f147855a.clear();
        this.f147862h.clear();
        this.f147863i.clear();
        this.f147856b.clear();
        this.f147861g = 0;
        C23744a.m124114c().m124116d(46, new Object[0]);
    }

    /* renamed from: e */
    public long m154815e() {
        return this.f147858d;
    }

    /* renamed from: f */
    public String m154816f() {
        return this.f147859e;
    }

    /* renamed from: g */
    public int m154817g() {
        return ((this.f147862h.size() + this.f147863i.size()) * 100) / this.f147855a.size();
    }

    /* renamed from: h */
    public String m154818h() {
        try {
            if (this.f147858d != 0) {
                if (m154822m()) {
                    if (m154820k() == 0) {
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_download_zero_album_item);
                    }
                    return AbstractC23136l9.m118746s0(AbstractC8020f0.str_album_item_download_done, Integer.valueOf(m154820k()));
                }
                String str = this.f147859e;
                if (str.length() > 10) {
                    str = str.substring(0, 10) + "...";
                }
                return AbstractC23136l9.m118746s0(AbstractC8020f0.str_album_item_downloading, str, Integer.valueOf(m154820k()), Integer.valueOf(m154819j()));
            }
            boolean z11 = false;
            boolean z12 = false;
            for (C17945a0 c17945a0 : this.f147855a) {
                if (c17945a0.m94871D7()) {
                    z11 = true;
                } else if (c17945a0.m95306y8()) {
                    z12 = true;
                }
            }
            if (z11 && z12) {
                if (m154822m()) {
                    if (this.f147862h.size() == 0) {
                        return MainApplication.getAppContext().getString(AbstractC8020f0.str_group_download_zero_photo_video);
                    }
                    return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_photo_and_video_download_done), Integer.valueOf(this.f147862h.size()));
                }
                return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_photo_and_video_downloading), Integer.valueOf(this.f147862h.size()), Integer.valueOf(this.f147855a.size()));
            }
            if (z11) {
                if (m154822m()) {
                    if (this.f147862h.size() == 0) {
                        return MainApplication.getAppContext().getString(AbstractC8020f0.str_group_download_zero_photo);
                    }
                    return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_photo_download_done), Integer.valueOf(this.f147862h.size()));
                }
                return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_photo_downloading), Integer.valueOf(this.f147862h.size()), Integer.valueOf(this.f147855a.size()));
            }
            if (z12) {
                if (m154822m()) {
                    if (this.f147862h.size() == 0) {
                        return MainApplication.getAppContext().getString(AbstractC8020f0.str_group_download_zero_video);
                    }
                    return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_video_download_done), Integer.valueOf(this.f147862h.size()));
                }
                return String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_video_downloading), Integer.valueOf(this.f147862h.size()), Integer.valueOf(this.f147855a.size()));
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    public int m154819j() {
        List list = this.f147855a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: k */
    public int m154820k() {
        return this.f147862h.size();
    }

    /* renamed from: l */
    public String m154821l() {
        C3535c c3535c = this.f147857c;
        if (c3535c != null) {
            return c3535c.m17944I0();
        }
        return "";
    }

    /* renamed from: m */
    public boolean m154822m() {
        if (this.f147862h.size() + this.f147863i.size() == this.f147855a.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m154823n(MessageId messageId, String str) {
        boolean z11 = false;
        if (messageId == null || !TextUtils.equals(m154821l(), str)) {
            return false;
        }
        synchronized (C32090r5.class) {
            try {
                Set set = this.f147856b;
                if (set != null && !set.isEmpty() && this.f147856b.contains(messageId.toString())) {
                    z11 = true;
                }
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: o */
    public boolean m154824o() {
        return this.f147860f;
    }

    /* renamed from: p */
    public void m154825p(MessageId messageId, String str) {
        if (messageId == null || !TextUtils.equals(m154821l(), str)) {
            return;
        }
        synchronized (f147854m) {
            try {
                List list = this.f147855a;
                if (list != null && !list.isEmpty()) {
                    int i11 = this.f147861g;
                    while (true) {
                        if (i11 < this.f147855a.size()) {
                            if (!((C17945a0) this.f147855a.get(i11)).m95135f9(messageId)) {
                                i11++;
                            }
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 >= 0) {
                        this.f147855a.remove(i11);
                        C23744a.m124114c().m124116d(46, new Object[0]);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: q */
    public void m154826q(List list, C3535c c3535c) {
        m154827r(list, c3535c, 0L, "");
    }

    /* renamed from: r */
    public void m154827r(List list, C3535c c3535c, long j11, String str) {
        try {
            if (!this.f147860f && c3535c != null && list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList(list);
                this.f147855a = arrayList;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f147856b.add(((C17945a0) it.next()).m95029V3().toString());
                }
                this.f147857c = c3535c;
                this.f147858d = j11;
                this.f147859e = str;
                this.f147860f = true;
                this.f147861g = 0;
                C23744a.m124114c().m124116d(6, ((C17945a0) this.f147855a.get(0)).m95029V3(), ((C17945a0) this.f147855a.get(0)).mo95039W2());
                AbstractC0837p0.m2225f().mo2040a(this.f147865k);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: s */
    void m154828s(List list) {
        try {
            int i11 = this.f147861g;
            this.f147861g = i11 + 1;
            C17945a0 c17945a0 = (C17945a0) list.get(i11);
            c17945a0.m94858Ba(this.f147866l);
            SensitiveData sensitiveData = new SensitiveData("gallery_save_media_from_popup_csc", "comm_csc");
            if (c17945a0.m95306y8()) {
                c17945a0.m95084aa(false, sensitiveData);
            } else if (c17945a0.m94864C6()) {
                c17945a0.m95222p2(false, sensitiveData);
            } else {
                c17945a0.m95231q2(false, sensitiveData);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
