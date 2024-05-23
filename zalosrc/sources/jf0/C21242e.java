package jf0;

import ag0.AbstractC0837p0;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.DumpChatImageView;
import com.zing.zalo.webview.C16792j;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23138m0;
import me0.C23177p6;
import me0.C23278z2;
import org.json.JSONArray;
import p140ev.C18613b;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;

/* renamed from: jf0.e */
/* loaded from: classes5.dex */
public class C21242e {

    /* renamed from: e */
    static C21242e f103527e;

    /* renamed from: f */
    static ConcurrentHashMap f103528f = new ConcurrentHashMap();

    /* renamed from: a */
    AtomicBoolean f103529a = new AtomicBoolean(false);

    /* renamed from: b */
    public AtomicBoolean f103530b = new AtomicBoolean(true);

    /* renamed from: c */
    C23528a f103531c = new C23528a(MainApplication.getAppContext());

    /* renamed from: d */
    CopyOnWriteArrayList f103532d = new CopyOnWriteArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jf0.e$a */
    /* loaded from: classes5.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ DumpChatImageView f103533l1;

        a(DumpChatImageView dumpChatImageView) {
            this.f103533l1 = dumpChatImageView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            DumpChatImageView dumpChatImageView = this.f103533l1;
            Objects.requireNonNull(dumpChatImageView);
            dumpChatImageView.setImageInfo(c3979l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jf0.e$b */
    /* loaded from: classes5.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ DumpChatImageView f103535l1;

        b(DumpChatImageView dumpChatImageView) {
            this.f103535l1 = dumpChatImageView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            DumpChatImageView dumpChatImageView = this.f103535l1;
            if (dumpChatImageView != null) {
                dumpChatImageView.setImageInfo(c3979l);
            }
        }
    }

    C21242e() {
    }

    /* renamed from: d */
    public static synchronized C21242e m110039d() {
        C21242e c21242e;
        synchronized (C21242e.class) {
            try {
                if (f103527e == null) {
                    f103527e = new C21242e();
                }
                if (!f103527e.m110049j()) {
                    f103527e.m110047h();
                }
                c21242e = f103527e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c21242e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m110040k() {
        DumpChatImageView dumpChatImageView;
        try {
            C24003n m120143n = C23278z2.m120143n();
            for (C21238a c21238a : m110044e()) {
                if (f103528f.get(c21238a.f103522c) != null) {
                    DumpChatImageView dumpChatImageView2 = (DumpChatImageView) f103528f.get(c21238a.f103522c);
                    Objects.requireNonNull(dumpChatImageView2);
                    dumpChatImageView2.setImageInfo(null);
                    dumpChatImageView = (DumpChatImageView) f103528f.get(c21238a.f103522c);
                } else {
                    dumpChatImageView = new DumpChatImageView(MainApplication.getAppContext());
                    f103528f.put(c21238a.f103522c, dumpChatImageView);
                }
                ((C23528a) this.f103531c.m123612r(dumpChatImageView)).m123579C(c21238a.f103522c, m120143n, new a(dumpChatImageView));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m110041l() {
        DumpChatImageView dumpChatImageView;
        try {
            C24003n m120143n = C23278z2.m120143n();
            for (C21238a c21238a : m110044e()) {
                if (f103528f.get(c21238a.f103522c) != null) {
                    DumpChatImageView dumpChatImageView2 = (DumpChatImageView) f103528f.get(c21238a.f103522c);
                    Objects.requireNonNull(dumpChatImageView2);
                    dumpChatImageView2.setImageInfo(null);
                    dumpChatImageView = (DumpChatImageView) f103528f.get(c21238a.f103522c);
                } else {
                    dumpChatImageView = new DumpChatImageView(MainApplication.getAppContext());
                    f103528f.put(c21238a.f103522c, dumpChatImageView);
                }
                ((C23528a) this.f103531c.m123612r(dumpChatImageView)).m123579C(c21238a.f103522c, m120143n, new b(dumpChatImageView));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m110042m() {
        try {
            for (RecyclingImageView recyclingImageView : f103528f.values()) {
                if (recyclingImageView.getParent() != null && (recyclingImageView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) recyclingImageView.getParent()).removeView(recyclingImageView);
                }
                recyclingImageView.setImageInfo(null);
            }
            f103528f.clear();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    public static synchronized void m110043o() {
        synchronized (C21242e.class) {
            try {
                try {
                    C21242e c21242e = f103527e;
                    if (c21242e != null) {
                        c21242e.m110050n();
                    }
                    f103527e = null;
                    if (C16792j.m89700i() != null) {
                        C16792j.m89700i().m89704f();
                    }
                    C23177p6.f112366b = null;
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public List m110044e() {
        return this.f103532d;
    }

    /* renamed from: f */
    void m110045f(String str) {
        try {
            AbstractC20110a.m104535d("init : %s", str);
            if (TextUtils.isEmpty(str)) {
                str = "[]";
            } else {
                this.f103529a.set(true);
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                C21238a c21238a = new C21238a(jSONArray.getJSONObject(i11));
                if (c21238a.m110035a()) {
                    this.f103532d.add(c21238a);
                }
            }
            if (this.f103532d.size() > 0) {
                AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: jf0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21242e.this.m110040k();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f103532d.clear();
        }
    }

    /* renamed from: g */
    void m110046g() {
        int i11 = 0;
        AbstractC20110a.m104535d("init default", new Object[0]);
        if (AbstractC23309i.m121266Ob() != -1) {
            C21238a c21238a = new C21238a();
            c21238a.f103520a = 0;
            c21238a.f103521b = 2;
            c21238a.f103523d = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.oa_moretab_section);
            c21238a.f103522c = "https://res-zalo.zadn.vn/upload/media/2017/9/12/ava_ketnoi_shop_1505217304771.png";
            c21238a.f103524e = 1;
            m110044e().add(c21238a);
            i11 = 1;
        }
        if (AbstractC23309i.m122343r3()) {
            C21238a c21238a2 = new C21238a();
            c21238a2.f103520a = i11;
            c21238a2.f103521b = 4;
            c21238a2.f103523d = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.sticker_moretab_section);
            c21238a2.f103522c = "https://res-zalo.zadn.vn/upload/media/2017/9/12/ava_ketnoi_sticker_1505217213020.png";
            c21238a2.f103524e = 1;
            i11++;
            m110044e().add(c21238a2);
        }
        if (AbstractC23309i.m120748Ab() != -1) {
            C21238a c21238a3 = new C21238a();
            c21238a3.f103520a = i11;
            c21238a3.f103521b = 3;
            c21238a3.f103523d = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.game_moretab_section);
            c21238a3.f103522c = "https://res-zalo.zadn.vn/upload/media/2017/9/12/ava_ketnoi_game_1505217107421.png";
            c21238a3.f103524e = 1;
            i11++;
            m110044e().add(c21238a3);
        }
        if (AbstractC23309i.m122600y1() == 1) {
            C21238a c21238a4 = new C21238a();
            c21238a4.f103520a = i11;
            c21238a4.f103521b = 5;
            c21238a4.f103523d = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.oa_moretab_section_my);
            c21238a4.f103522c = "https://res-zalo.zadn.vn/upload/media/2017/9/12/ava_channel_1505216919678.png";
            c21238a4.f103524e = 1;
            m110044e().add(c21238a4);
        }
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: jf0.b
            @Override // java.lang.Runnable
            public final void run() {
                C21242e.this.m110041l();
            }
        });
    }

    /* renamed from: h */
    void m110047h() {
        if (!AbstractC23138m0.m118770b()) {
            return;
        }
        m110045f(AbstractC23309i.m121741b4());
        if (!m110049j() && !this.f103529a.get()) {
            m110046g();
        }
    }

    /* renamed from: i */
    public boolean m110048i(C18613b c18613b) {
        if (m110049j()) {
            Iterator it = this.f103532d.iterator();
            while (it.hasNext()) {
                C21238a c21238a = (C21238a) it.next();
                if (c21238a.f103521b == c18613b.m98348a()) {
                    return c21238a.m110035a();
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m110049j() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f103532d;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public synchronized void m110050n() {
        try {
            this.f103529a.set(false);
            this.f103530b.set(true);
            CopyOnWriteArrayList copyOnWriteArrayList = this.f103532d;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: jf0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C21242e.m110042m();
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
