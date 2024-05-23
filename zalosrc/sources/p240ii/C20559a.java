package p240ii;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import com.zing.zalo.p062db.C7960e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p037bk.C2827a;
import p056cj.C3538f;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;

/* renamed from: ii.a */
/* loaded from: classes3.dex */
public class C20559a {

    /* renamed from: e */
    public static ArrayList f100942e = new ArrayList();

    /* renamed from: a */
    boolean f100943a = false;

    /* renamed from: b */
    public boolean f100944b = false;

    /* renamed from: c */
    public int f100945c = 1;

    /* renamed from: d */
    String f100946d = "0";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ii.a$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ h f100947a;

        a(h hVar) {
            this.f100947a = hVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                h hVar = this.f100947a;
                if (hVar != null) {
                    hVar.mo64861b();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C20559a.this.f100943a = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0009, B:5:0x000d, B:7:0x0013, B:9:0x001a, B:11:0x0025, B:13:0x0031, B:14:0x003d, B:16:0x0043, B:18:0x0049, B:20:0x0055, B:23:0x005e, B:25:0x0066, B:26:0x0072, B:28:0x0078, B:30:0x0089, B:31:0x0095, B:33:0x0099, B:35:0x009f, B:47:0x00a2), top: B:2:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0009, B:5:0x000d, B:7:0x0013, B:9:0x001a, B:11:0x0025, B:13:0x0031, B:14:0x003d, B:16:0x0043, B:18:0x0049, B:20:0x0055, B:23:0x005e, B:25:0x0066, B:26:0x0072, B:28:0x0078, B:30:0x0089, B:31:0x0095, B:33:0x0099, B:35:0x009f, B:47:0x00a2), top: B:2:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            boolean z11;
            long j11;
            int i11;
            try {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 != null && !jSONObject2.isNull("data")) {
                    JSONArray jSONArray = null;
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (C20559a.this.f100946d.equals("0")) {
                            C7960e.m41971c6().m42365d0();
                            C20559a.f100942e.clear();
                        }
                        if (!jSONObject.isNull("listThemes")) {
                            jSONArray = jSONObject.getJSONArray("listThemes");
                        }
                        if (jSONArray != null) {
                            int length = jSONArray.length();
                            C20559a c20559a = C20559a.this;
                            if (!jSONObject.isNull("isLoadMore")) {
                                z11 = true;
                                if (jSONObject.optInt("isLoadMore") == 1) {
                                    c20559a.f100944b = z11;
                                    if (jSONObject.isNull("expiredDuration")) {
                                        j11 = jSONObject.optLong("expiredDuration") * 1000;
                                    } else {
                                        j11 = 3600000;
                                    }
                                    AbstractC23309i.m121574Wn(j11);
                                    for (i11 = 0; i11 < length; i11++) {
                                        C3538f c3538f = new C3538f(jSONArray.getJSONObject(i11));
                                        if (!C20559a.this.m106861g(c3538f)) {
                                            C20559a.f100942e.add(c3538f);
                                            C7960e.m41971c6().m42189L7(c3538f);
                                        }
                                        if (i11 == length - 1) {
                                            C20559a.this.f100946d = c3538f.f14925a;
                                        }
                                    }
                                }
                            }
                            z11 = false;
                            c20559a.f100944b = z11;
                            if (jSONObject.isNull("expiredDuration")) {
                            }
                            AbstractC23309i.m121574Wn(j11);
                            while (i11 < length) {
                            }
                        }
                    }
                } else {
                    C20559a.this.f100944b = false;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C20559a.this.f100944b = false;
            }
            C20559a.this.f100943a = false;
            h hVar = this.f100947a;
            if (hVar != null) {
                hVar.mo64860a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ii.a$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f100949a;

        /* renamed from: b */
        final /* synthetic */ e f100950b;

        b(String str, e eVar) {
            this.f100949a = str;
            this.f100950b = eVar;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String str;
            try {
                boolean m106860f = C20559a.this.m106860f((r1.f100945c - 1) * 30, 30);
                C3538f m42175K5 = C7960e.m41971c6().m42175K5(this.f100949a);
                String str2 = "";
                try {
                    C2827a m2516G = AbstractC23306f.m120562A().m2516G();
                    if (m2516G.m13669f() && m2516G.m13668e()) {
                        if (m2516G.m13667d().containsKey(AbstractC18458a.f93019a)) {
                            str = (String) m2516G.m13667d().get(AbstractC18458a.f93019a);
                        } else if (m2516G.m13667d().containsKey("en")) {
                            str = (String) m2516G.m13667d().get("en");
                        }
                        str2 = str;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                e eVar = this.f100950b;
                if (eVar != null) {
                    eVar.mo106865a(m106860f, m42175K5, str2);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ii.a$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f100952a;

        /* renamed from: b */
        final /* synthetic */ g f100953b;

        c(String str, g gVar) {
            this.f100952a = str;
            this.f100953b = gVar;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C3538f m42175K5 = C7960e.m41971c6().m42175K5(this.f100952a);
            g gVar = this.f100953b;
            if (gVar != null) {
                gVar.mo65307a(m42175K5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ii.a$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ f f100955a;

        d(f fVar) {
            this.f100955a = fVar;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C20559a c20559a = C20559a.this;
                if (c20559a.f100944b && !c20559a.f100943a) {
                    boolean m106860f = c20559a.m106860f((c20559a.f100945c - 1) * 30, 30);
                    f fVar = this.f100955a;
                    if (fVar != null) {
                        fVar.mo65084a(m106860f);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: ii.a$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: a */
        void mo106865a(boolean z11, C3538f c3538f, String str);
    }

    /* renamed from: ii.a$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: a */
        void mo65084a(boolean z11);
    }

    /* renamed from: ii.a$g */
    /* loaded from: classes3.dex */
    public interface g {
        /* renamed from: a */
        void mo65307a(C3538f c3538f);
    }

    /* renamed from: ii.a$h */
    /* loaded from: classes3.dex */
    public interface h {
        /* renamed from: a */
        void mo64860a();

        /* renamed from: b */
        void mo64861b();

        /* renamed from: c */
        void mo64862c(boolean z11, boolean z12);
    }

    /* renamed from: a */
    public void m106855a(String str, e eVar) {
        C0824j.m2153b(new b(str, eVar));
    }

    /* renamed from: b */
    public void m106856b(f fVar) {
        C0824j.m2153b(new d(fVar));
    }

    /* renamed from: c */
    public void m106857c() {
        ArrayList arrayList = f100942e;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    /* renamed from: d */
    public void m106858d(String str, g gVar) {
        C0824j.m2153b(new c(str, gVar));
    }

    /* renamed from: e */
    public void m106859e(boolean z11, h hVar) {
        try {
            if (this.f100943a) {
                return;
            }
            this.f100943a = true;
            if (z11 && hVar != null) {
                hVar.mo64862c(true, false);
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(hVar));
            c0766k.mo1670ja(this.f100945c, 30, this.f100946d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    boolean m106860f(int i11, int i12) {
        boolean z11;
        try {
            List m42411h6 = C7960e.m41971c6().m42411h6(i11, i12);
            if (m42411h6 != null && m42411h6.size() > 0) {
                this.f100945c++;
                if (m42411h6.size() >= i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f100944b = z11;
                this.f100946d = ((C3538f) m42411h6.get(m42411h6.size() - 1)).f14925a;
                f100942e.addAll(m42411h6);
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f100944b = false;
        return false;
    }

    /* renamed from: g */
    boolean m106861g(C3538f c3538f) {
        try {
            ArrayList arrayList = f100942e;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = f100942e.iterator();
                while (it.hasNext()) {
                    if (((C3538f) it.next()).f14925a.equals(c3538f.f14925a)) {
                        return true;
                    }
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
    public boolean m106862h() {
        ArrayList arrayList = f100942e;
        if (arrayList != null && !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void m106863i() {
        this.f100945c = 1;
        this.f100946d = "0";
        this.f100944b = false;
    }

    /* renamed from: j */
    public void m106864j(C3538f c3538f) {
        try {
            ArrayList arrayList = f100942e;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = f100942e.iterator();
                while (it.hasNext()) {
                    C3538f c3538f2 = (C3538f) it.next();
                    if (c3538f2.f14925a.equals(c3538f.f14925a)) {
                        c3538f2.f14931g = c3538f.f14931g;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
