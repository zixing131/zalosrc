package l30;

import ae.C0766k;
import ae.InterfaceC0765j;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.C21927m;
import vg.C28203u6;

/* renamed from: l30.l0 */
/* loaded from: classes5.dex */
public class C22035l0 {

    /* renamed from: a */
    d f108537a;

    /* renamed from: f */
    ArrayList f108542f;

    /* renamed from: j */
    ArrayList f108546j;

    /* renamed from: b */
    public boolean f108538b = false;

    /* renamed from: c */
    InterfaceC0765j f108539c = new C0766k();

    /* renamed from: d */
    InterfaceC20094a f108540d = new a();

    /* renamed from: e */
    public boolean f108541e = false;

    /* renamed from: g */
    InterfaceC0765j f108543g = new C0766k();

    /* renamed from: h */
    InterfaceC20094a f108544h = new b();

    /* renamed from: i */
    public boolean f108545i = false;

    /* renamed from: k */
    InterfaceC0765j f108547k = new C0766k();

    /* renamed from: l */
    InterfaceC20094a f108548l = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.l0$a */
    /* loaded from: classes5.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C22035l0 c22035l0 = C22035l0.this;
                c22035l0.f108538b = false;
                d dVar = c22035l0.f108537a;
                if (dVar != null) {
                    dVar.mo84526b(c20096c.m104491c(), c20096c.m104492d());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray jSONArray;
            String string;
            String string2;
            String string3;
            try {
                C22035l0.this.f108538b = false;
                C21927m.m114302u().m114309G().clear();
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.isNull("data")) {
                    jSONArray = null;
                } else {
                    jSONArray = jSONObject.getJSONArray("data");
                }
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        if (jSONObject2.isNull("userId")) {
                            string = "";
                        } else {
                            string = jSONObject2.getString("userId");
                        }
                        if (jSONObject2.isNull("displayName")) {
                            string2 = "";
                        } else {
                            string2 = jSONObject2.getString("displayName");
                        }
                        if (jSONObject2.isNull("avatar")) {
                            string3 = "";
                        } else {
                            string3 = jSONObject2.getString("avatar");
                        }
                        ContactProfile contactProfile = new ContactProfile(string);
                        contactProfile.f42437s = string2;
                        contactProfile.f42446v = string3;
                        C21927m.m114302u().m114309G().add(contactProfile);
                    }
                }
                d dVar = C22035l0.this.f108537a;
                if (dVar != null) {
                    dVar.mo84526b(0, "");
                }
            } catch (Exception e11) {
                C22035l0 c22035l0 = C22035l0.this;
                c22035l0.f108538b = false;
                d dVar2 = c22035l0.f108537a;
                if (dVar2 != null) {
                    dVar2.mo84526b(-1, "");
                }
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.l0$b */
    /* loaded from: classes5.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22035l0 c22035l0 = C22035l0.this;
            c22035l0.f108541e = false;
            c22035l0.f108542f = null;
            d dVar = c22035l0.f108537a;
            if (dVar != null) {
                dVar.mo78820a(c20096c.m104491c(), c20096c.m104492d());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C22035l0 c22035l0 = C22035l0.this;
            c22035l0.f108541e = false;
            ArrayList arrayList = c22035l0.f108542f;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = C22035l0.this.f108542f.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                    if (m141809c != null) {
                        ContactProfile contactProfile = new ContactProfile(str);
                        contactProfile.f42437s = m141809c.f42437s;
                        contactProfile.f42446v = m141809c.f42446v;
                        C21927m.m114302u().m114309G().add(contactProfile);
                    }
                }
            }
            C22035l0 c22035l02 = C22035l0.this;
            c22035l02.f108542f = null;
            d dVar = c22035l02.f108537a;
            if (dVar != null) {
                dVar.mo78820a(0, "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.l0$c */
    /* loaded from: classes5.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22035l0 c22035l0 = C22035l0.this;
            c22035l0.f108545i = false;
            c22035l0.f108546j = null;
            d dVar = c22035l0.f108537a;
            if (dVar != null) {
                dVar.mo84527c(c20096c.m104491c(), c20096c.m104492d());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C22035l0 c22035l0 = C22035l0.this;
                c22035l0.f108545i = false;
                ArrayList arrayList = c22035l0.f108546j;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int size = C21927m.m114302u().m114309G().size() - 1; size >= 0; size--) {
                        if (C22035l0.this.f108546j.contains(((ContactProfile) C21927m.m114302u().m114309G().get(size)).f42434r)) {
                            C21927m.m114302u().m114309G().remove(size);
                        }
                    }
                }
                C22035l0 c22035l02 = C22035l0.this;
                c22035l02.f108546j = null;
                d dVar = c22035l02.f108537a;
                if (dVar != null) {
                    dVar.mo84527c(0, "");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C22035l0 c22035l03 = C22035l0.this;
                c22035l03.f108545i = false;
                d dVar2 = c22035l03.f108537a;
                if (dVar2 != null) {
                    dVar2.mo84527c(-1, "");
                }
            }
        }
    }

    /* renamed from: l30.l0$d */
    /* loaded from: classes5.dex */
    public static abstract class d {
        /* renamed from: a */
        public void mo78820a(int i11, String str) {
        }

        /* renamed from: b */
        public void mo84526b(int i11, String str) {
        }

        /* renamed from: c */
        public void mo84527c(int i11, String str) {
        }
    }

    public C22035l0(d dVar) {
        this.f108537a = dVar;
    }

    /* renamed from: a */
    public void m115022a(String str, TrackingSource trackingSource) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m115023b(arrayList, trackingSource);
    }

    /* renamed from: b */
    public void m115023b(ArrayList arrayList, TrackingSource trackingSource) {
        if (arrayList == null || arrayList.size() == 0 || this.f108541e) {
            return;
        }
        this.f108541e = true;
        this.f108542f = new ArrayList(arrayList);
        this.f108543g.mo1704o8(this.f108544h);
        this.f108543g.mo1472Ka(this.f108542f, trackingSource);
    }

    /* renamed from: c */
    public void m115024c(int i11, int i12) {
        if (this.f108538b) {
            return;
        }
        this.f108538b = true;
        this.f108539c.mo1704o8(this.f108540d);
        this.f108539c.mo1417E4(i11, i12);
    }

    /* renamed from: d */
    public void m115025d(String str, TrackingSource trackingSource) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m115026e(arrayList, trackingSource);
    }

    /* renamed from: e */
    public void m115026e(ArrayList arrayList, TrackingSource trackingSource) {
        if (arrayList == null || arrayList.size() == 0 || this.f108545i) {
            return;
        }
        this.f108545i = true;
        this.f108546j = new ArrayList(arrayList);
        this.f108547k.mo1704o8(this.f108548l);
        this.f108547k.mo1419E6(this.f108546j, trackingSource);
    }
}
