package vg;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.location.Location;
import android.os.Handler;
import bf.AbstractC2790b;
import bf0.C2793a;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.p062db.C7960e;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import vg.AbstractC28248z6;

/* renamed from: vg.t5 */
/* loaded from: classes3.dex */
public class C28193t5 {

    /* renamed from: f */
    static volatile C28193t5 f131345f;

    /* renamed from: c */
    b f131348c;

    /* renamed from: a */
    boolean f131346a = false;

    /* renamed from: b */
    boolean f131347b = false;

    /* renamed from: d */
    List f131349d = new ArrayList();

    /* renamed from: e */
    private Handler f131350e = new Handler(C2793a.f11144a.m13457b());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.t5$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC28248z6.f {

        /* renamed from: vg.t5$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C33010a implements InterfaceC20094a {

            /* renamed from: vg.t5$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            class C33011a extends AbstractC0939u {

                /* renamed from: a */
                final /* synthetic */ List f131353a;

                C33011a(List list) {
                    this.f131353a = list;
                }

                @Override // p660xw.InterfaceC30214a
                /* renamed from: a */
                public void mo928a() {
                    C7960e.m41971c6().m42596yb();
                    C7960e.m41971c6().m42533s8(this.f131353a);
                }
            }

            C33010a() {
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                C28193t5 c28193t5 = C28193t5.this;
                b bVar = c28193t5.f131348c;
                if (bVar != null) {
                    bVar.mo38390c(c28193t5.f131349d);
                }
                C28193t5 c28193t52 = C28193t5.this;
                c28193t52.f131346a = false;
                c28193t52.f131348c = null;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                int i11;
                if (obj != null) {
                    try {
                        AbstractC20110a.m104535d("doGetFilters: %s", obj);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                C28193t5.this.f131349d.clear();
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                ArrayList arrayList = new ArrayList();
                if (optJSONObject.has("locationFilter")) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("locationFilter");
                    for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i12);
                        C28193t5.this.f131349d.add(AbstractC2790b.m13442e(jSONObject));
                        arrayList.add(jSONObject.toString());
                    }
                }
                if (optJSONObject.has("expiredDuration")) {
                    i11 = optJSONObject.optInt("expiredDuration");
                } else {
                    i11 = 300;
                }
                AbstractC23309i.m121724ao(i11);
                C0824j.m2153b(new C33011a(arrayList));
                AbstractC23309i.m121133Kq(System.currentTimeMillis());
                C28193t5 c28193t5 = C28193t5.this;
                b bVar = c28193t5.f131348c;
                if (bVar != null) {
                    bVar.mo38390c(c28193t5.f131349d);
                }
                C28193t5 c28193t52 = C28193t5.this;
                c28193t52.f131346a = false;
                c28193t52.f131348c = null;
            }
        }

        a() {
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            double longitude;
            double d11 = 0.0d;
            if (location == null) {
                longitude = 0.0d;
            } else {
                try {
                    longitude = location.getLongitude();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C28193t5 c28193t5 = C28193t5.this;
                    b bVar = c28193t5.f131348c;
                    if (bVar != null) {
                        bVar.mo38390c(c28193t5.f131349d);
                    }
                    C28193t5 c28193t52 = C28193t5.this;
                    c28193t52.f131346a = false;
                    c28193t52.f131348c = null;
                    return;
                }
            }
            if (location != null) {
                d11 = location.getLatitude();
            }
            double d12 = d11;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C33010a());
            c0766k.mo1394B5(d12, longitude, String.valueOf(C28139n5.m141620j().m141637i()), String.valueOf(C28139n5.m141620j().m141646s()), String.valueOf(C28139n5.m141620j().m141647t()), String.valueOf(C28139n5.m141620j().m141639l()), 1, 50, 0);
        }
    }

    /* renamed from: vg.t5$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo38388a();

        /* renamed from: b */
        void mo38389b();

        /* renamed from: c */
        void mo38390c(List list);
    }

    private C28193t5() {
    }

    /* renamed from: e */
    public static synchronized C28193t5 m141757e() {
        C28193t5 c28193t5;
        synchronized (C28193t5.class) {
            try {
                if (f131345f == null) {
                    synchronized (C28193t5.class) {
                        try {
                            if (f131345f == null) {
                                f131345f = new C28193t5();
                            }
                        } finally {
                        }
                    }
                }
                c28193t5 = f131345f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28193t5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m141758i() {
        b bVar = this.f131348c;
        if (bVar != null) {
            bVar.mo38388a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m141759j() {
        b bVar = this.f131348c;
        if (bVar != null) {
            bVar.mo38389b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m141760k(boolean z11) {
        a aVar = new a();
        C28239y6 c28239y6 = new C28239y6();
        c28239y6.m142229k(z11);
        SensitiveData sensitiveData = new SensitiveData("location_camera_filter", "camera_filter");
        if (!c28239y6.m142225f(MainApplication.getAppContext(), aVar, sensitiveData)) {
            this.f131346a = false;
            if (!C8937j0.m47663l(sensitiveData.m35528c())) {
                AbstractC19444a.m101695c(new Runnable() { // from class: vg.r5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28193t5.this.m141758i();
                    }
                });
            } else {
                AbstractC19444a.m101695c(new Runnable() { // from class: vg.s5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28193t5.this.m141759j();
                    }
                });
            }
        }
    }

    /* renamed from: d */
    public void m141761d(b bVar, final boolean z11) {
        this.f131348c = bVar;
        if (this.f131346a) {
            return;
        }
        this.f131346a = true;
        if (!this.f131347b) {
            this.f131347b = true;
            this.f131349d = C7960e.m41971c6().m42463m6();
        }
        if (!m141764h()) {
            b bVar2 = this.f131348c;
            if (bVar2 != null) {
                bVar2.mo38390c(this.f131349d);
            }
            this.f131346a = false;
            this.f131348c = null;
            return;
        }
        this.f131350e.post(new Runnable() { // from class: vg.q5
            @Override // java.lang.Runnable
            public final void run() {
                C28193t5.this.m141760k(z11);
            }
        });
    }

    /* renamed from: f */
    public List m141762f() {
        return this.f131349d;
    }

    /* renamed from: g */
    public AbstractC2790b m141763g() {
        List list = this.f131349d;
        if (list != null && list.size() != 0) {
            for (int i11 = 0; i11 < this.f131349d.size(); i11++) {
                if (((AbstractC2790b) this.f131349d.get(i11)).f11111c) {
                    if (((AbstractC2790b) this.f131349d.get(i11)).f11109a == AbstractC23309i.m120853D5()) {
                        return null;
                    }
                    return (AbstractC2790b) this.f131349d.get(i11);
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public boolean m141764h() {
        long m122159m6 = AbstractC23309i.m122159m6();
        long m121665Z3 = AbstractC23309i.m121665Z3();
        if (this.f131349d.size() != 0 && System.currentTimeMillis() - m122159m6 <= m121665Z3 * 1000) {
            return false;
        }
        return true;
    }
}
