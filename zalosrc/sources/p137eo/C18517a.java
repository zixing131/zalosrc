package p137eo;

import ae.C0766k;
import am.C0927o;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.C8676a;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.social.controls.LikeContactItem;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import me0.C23250w4;
import org.json.JSONArray;
import org.json.JSONObject;
import p137eo.AbstractC18522f;
import p137eo.AbstractC18523g;
import p304ks.AbstractC21935u;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: eo.a */
/* loaded from: classes4.dex */
public final class C18517a {

    /* renamed from: a */
    public static final C18517a f93095a = new C18517a();

    /* renamed from: b */
    private static boolean f93096b;

    /* renamed from: c */
    private static boolean f93097c;

    /* renamed from: d */
    private static boolean f93098d;

    /* renamed from: e */
    private static boolean f93099e;

    /* renamed from: eo.a$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f93100a;

        a(Continuation continuation) {
            this.f93100a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            Continuation continuation = this.f93100a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                AbstractC20110a.f98889a.mo104551d("deleteUserAlbum " + obj, new Object[0]);
                Continuation continuation = this.f93100a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.b(Boolean.TRUE)));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                Continuation continuation2 = this.f93100a;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
            }
        }
    }

    /* renamed from: eo.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f93101a;

        b(Continuation continuation) {
            this.f93101a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "p0");
            Continuation continuation = this.f93101a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
            C18517a.f93095a.m97878f(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "p0");
            try {
                boolean z11 = true;
                if (((JSONObject) obj).optInt("data", 0) != 1) {
                    z11 = false;
                }
                Continuation continuation = this.f93101a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.b(Boolean.valueOf(z11))));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                Continuation continuation2 = this.f93101a;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
            }
            C18517a.f93095a.m97878f(false);
        }
    }

    /* renamed from: eo.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ProfileAlbumItem f93102a;

        /* renamed from: b */
        final /* synthetic */ Continuation f93103b;

        c(ProfileAlbumItem profileAlbumItem, Continuation continuation) {
            this.f93102a = profileAlbumItem;
            this.f93103b = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC18522f.a aVar;
            AbstractC19074t.m100208f(c20096c, "p0");
            Continuation continuation = this.f93103b;
            C24861r.a aVar2 = C24861r.f119264q;
            int m104491c = c20096c.m104491c();
            if (m104491c != 500 && m104491c != 1001) {
                aVar = new AbstractC18522f.a(new AbstractC18523g.c());
            } else {
                aVar = new AbstractC18522f.a(new AbstractC18523g.a());
            }
            continuation.mo112492g(C24861r.m129218b(aVar));
            C18517a.f93095a.m97879g(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            ProfileAlbumItem profileAlbumItem;
            AbstractC19074t.m100208f(obj, "p0");
            try {
                JSONObject jSONObject2 = null;
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject2 = jSONObject.optJSONObject("data");
                }
                if (jSONObject2 != null) {
                    ProfileAlbumItem profileAlbumItem2 = new ProfileAlbumItem(jSONObject2);
                    if (profileAlbumItem2.m46300c().m46280h() > 1 && (profileAlbumItem = this.f93102a) != null) {
                        profileAlbumItem.m46300c().m46294y(profileAlbumItem2.m46300c().m46279g());
                        this.f93102a.m46300c().m46293x(profileAlbumItem2.m46300c().m46278f());
                        this.f93102a.m46300c().m46292w(profileAlbumItem2.m46300c().m46276d());
                        this.f93102a.m46300c().m46295z(profileAlbumItem2.m46300c().m46280h());
                        this.f93102a.m46299a(profileAlbumItem2);
                        profileAlbumItem2 = this.f93102a;
                    }
                    Continuation continuation = this.f93103b;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.b(profileAlbumItem2)));
                } else {
                    Continuation continuation2 = this.f93103b;
                    C24861r.a aVar2 = C24861r.f119264q;
                    continuation2.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                Continuation continuation3 = this.f93103b;
                C24861r.a aVar3 = C24861r.f119264q;
                continuation3.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
            }
            C18517a.f93095a.m97879g(false);
        }
    }

    /* renamed from: eo.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f93104a;

        d(Continuation continuation) {
            this.f93104a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            Continuation continuation = this.f93104a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new IOException(c20096c.m104492d()))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    Continuation continuation = this.f93104a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(C8676a.Companion.m46353a(jSONObject.optJSONObject("data"))));
                } else {
                    Continuation continuation2 = this.f93104a;
                    C24861r.a aVar2 = C24861r.f119264q;
                    continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new Exception())));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                Continuation continuation3 = this.f93104a;
                C24861r.a aVar3 = C24861r.f119264q;
                continuation3.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new Exception())));
            }
        }
    }

    /* renamed from: eo.a$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f93105a;

        e(Continuation continuation) {
            this.f93105a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            Continuation continuation = this.f93105a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
            C18517a.f93095a.m97880h(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("list");
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj2 = jSONArray.get(i11);
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject = (JSONObject) obj2;
                        String string = jSONObject.getString("uid");
                        String string2 = jSONObject.getString("avt");
                        String string3 = jSONObject.getString("dpn");
                        if (AbstractC21935u.m114558y(string)) {
                            arrayList.add(new LikeContactItem(string, AbstractC21935u.m114542i(string, string3), string2));
                        }
                    }
                }
                Continuation continuation = this.f93105a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.b(arrayList)));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation2 = this.f93105a;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
            }
            C18517a.f93095a.m97880h(false);
        }
    }

    /* renamed from: eo.a$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f93106a;

        f(Continuation continuation) {
            this.f93106a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                Continuation continuation = this.f93106a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.a(new AbstractC18523g.c())));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C18517a.f93095a.m97881i(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                Continuation continuation = this.f93106a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new AbstractC18522f.b(Boolean.TRUE)));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C18517a.f93095a.m97881i(false);
        }
    }

    private C18517a() {
    }

    /* renamed from: a */
    public final Object m97873a(long j11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(c27317h));
        c0766k.m1864q(j11);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: b */
    public final Object m97874b(long j11, String str, String str2, ThemeItem themeItem, long j12, TrackingSource trackingSource, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        if (f93096b) {
            return new AbstractC18522f.a(new AbstractC18523g.b());
        }
        f93096b = true;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        new C0766k();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(c27317h));
        c0766k.m1875w(j11, str, str2, themeItem.getId(), j12, trackingSource);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: c */
    public final Object m97875c(String str, int i11, long j11, long j12, int i12, ProfileAlbumItem profileAlbumItem, TrackingSource trackingSource, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        if (f93099e) {
            return new AbstractC18522f.a(new AbstractC18523g.b());
        }
        f93099e = true;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        new C0766k();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(profileAlbumItem, c27317h));
        c0766k.m1801B(str, i11, 48, j11, j12, i12, C23250w4.m119786E(), trackingSource);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: d */
    public final Object m97876d(String str, int i11, long j11, int i12, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(c27317h));
        c0766k.m1816J(str, C23250w4.m119786E(), i11, j11, i12, 40);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: e */
    public final Object m97877e(long j11, String str, int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        if (f93098d) {
            return new AbstractC18522f.a(new AbstractC18523g.b());
        }
        f93098d = true;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(c27317h));
        c0766k.mo1623da(j11, str, i11);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: f */
    public final void m97878f(boolean z11) {
        f93096b = z11;
    }

    /* renamed from: g */
    public final void m97879g(boolean z11) {
        f93099e = z11;
    }

    /* renamed from: h */
    public final void m97880h(boolean z11) {
        f93098d = z11;
    }

    /* renamed from: i */
    public final void m97881i(boolean z11) {
        f93097c = z11;
    }

    /* renamed from: j */
    public final Object m97882j(long j11, PrivacyInfo privacyInfo, TrackingSource trackingSource, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        if (f93097c) {
            return new AbstractC18522f.a(new AbstractC18523g.b());
        }
        f93097c = true;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(c27317h));
        c0766k.mo1491N5(j11, privacyInfo, trackingSource);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
