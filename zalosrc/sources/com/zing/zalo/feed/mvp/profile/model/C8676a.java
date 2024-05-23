package com.zing.zalo.feed.mvp.profile.model;

import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25380y;

/* renamed from: com.zing.zalo.feed.mvp.profile.model.a */
/* loaded from: classes4.dex */
public final class C8676a {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private boolean f46715b;

    /* renamed from: c */
    private int f46716c;

    /* renamed from: d */
    private long f46717d;

    /* renamed from: e */
    private int f46718e;

    /* renamed from: g */
    private boolean f46720g;

    /* renamed from: h */
    private List f46721h;

    /* renamed from: i */
    private List f46722i;

    /* renamed from: a */
    private String f46714a = "";

    /* renamed from: f */
    private int f46719f = 1000;

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8676a m46353a(JSONObject jSONObject) {
            boolean z11;
            C8676a c8676a = new C8676a();
            if (jSONObject == null) {
                return c8676a;
            }
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("header");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("title", "");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    c8676a.m46351v(optString);
                    boolean z12 = true;
                    if (optJSONObject.optInt("hasMore", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c8676a.m46346q(z11);
                    c8676a.m46349t(optJSONObject.optInt("page", 0));
                    c8676a.m46348s(optJSONObject.optLong("lastAlbumId", 0L));
                    c8676a.m46352w(optJSONObject.optInt("totalSize", 0));
                    c8676a.m46350u(optJSONObject.optInt("remain", 1000));
                    if (optJSONObject.optInt("limitVisibleValue", 0) == 0) {
                        z12 = false;
                    }
                    c8676a.m46347r(z12);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("albumList");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        List m46338i = c8676a.m46338i();
                        ProfilePreviewAlbumItem.C8670b c8670b = ProfilePreviewAlbumItem.Companion;
                        String jSONObject2 = optJSONArray.getJSONObject(i11).toString();
                        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                        m46338i.add(c8670b.m46319a(jSONObject2));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("userAlbumList");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        List m46342m = c8676a.m46342m();
                        ProfilePreviewAlbumItem.C8670b c8670b2 = ProfilePreviewAlbumItem.Companion;
                        String jSONObject3 = optJSONArray2.getJSONObject(i12).toString();
                        AbstractC19074t.m100207e(jSONObject3, "toString(...)");
                        m46342m.add(c8670b2.m46319a(jSONObject3));
                    }
                }
                return c8676a;
            } catch (Exception e11) {
                e11.printStackTrace();
                return c8676a;
            }
        }
    }

    public C8676a() {
        List m131502j;
        List m131187O0;
        List m131502j2;
        List m131187O02;
        m131502j = AbstractC25368s.m131502j();
        m131187O0 = AbstractC25332a0.m131187O0(m131502j);
        this.f46721h = m131187O0;
        m131502j2 = AbstractC25368s.m131502j();
        m131187O02 = AbstractC25332a0.m131187O0(m131502j2);
        this.f46722i = m131187O02;
    }

    /* renamed from: b */
    private final void m46330b(ProfilePreviewAlbumItem profilePreviewAlbumItem, List list) {
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            ProfilePreviewAlbumItem profilePreviewAlbumItem2 = (ProfilePreviewAlbumItem) it.next();
            if (profilePreviewAlbumItem2.getId() == profilePreviewAlbumItem.getId() && profilePreviewAlbumItem2.getType() == profilePreviewAlbumItem.getType()) {
                z11 = true;
            }
        }
        if (!z11) {
            list.add(0, profilePreviewAlbumItem);
        }
    }

    /* renamed from: a */
    public final void m46331a(C8676a c8676a) {
        List m131560N;
        List m131560N2;
        AbstractC19074t.m100208f(c8676a, "profilePreviewAlbumCollection");
        m131560N = AbstractC25380y.m131560N(c8676a.f46721h);
        Iterator it = m131560N.iterator();
        while (it.hasNext()) {
            m46330b((ProfilePreviewAlbumItem) it.next(), this.f46721h);
        }
        m131560N2 = AbstractC25380y.m131560N(c8676a.f46722i);
        Iterator it2 = m131560N2.iterator();
        while (it2.hasNext()) {
            m46330b((ProfilePreviewAlbumItem) it2.next(), this.f46722i);
        }
    }

    /* renamed from: c */
    public final void m46332c(long j11, String str, PrivacyInfo privacyInfo, ThemeItem themeItem) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(privacyInfo, "privacy");
        AbstractC19074t.m100208f(themeItem, "themeItem");
        List list = this.f46722i;
        ArrayList<ProfilePreviewAlbumItem> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ProfilePreviewAlbumItem) obj).getId() == j11) {
                arrayList.add(obj);
            }
        }
        for (ProfilePreviewAlbumItem profilePreviewAlbumItem : arrayList) {
            profilePreviewAlbumItem.setTitle(str);
            profilePreviewAlbumItem.setPrivacyType(privacyInfo.f45973p);
            profilePreviewAlbumItem.setThemeInfo(themeItem);
        }
        List list2 = this.f46721h;
        ArrayList<ProfilePreviewAlbumItem> arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((ProfilePreviewAlbumItem) obj2).getId() == j11) {
                arrayList2.add(obj2);
            }
        }
        for (ProfilePreviewAlbumItem profilePreviewAlbumItem2 : arrayList2) {
            profilePreviewAlbumItem2.setTitle(str);
            profilePreviewAlbumItem2.setPrivacyType(privacyInfo.f45973p);
            profilePreviewAlbumItem2.setThemeInfo(themeItem);
        }
    }

    /* renamed from: d */
    public final void m46333d(long j11) {
        int m116580c;
        List list = this.f46722i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ProfilePreviewAlbumItem) obj).getId() == j11) {
                arrayList.add(obj);
            }
        }
        arrayList.size();
        list.removeAll(arrayList);
        List list2 = this.f46721h;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((ProfilePreviewAlbumItem) obj2).getId() == j11) {
                arrayList2.add(obj2);
            }
        }
        int size = arrayList2.size();
        list2.removeAll(arrayList2);
        m116580c = AbstractC22543l.m116580c(0, this.f46718e - size);
        this.f46718e = m116580c;
    }

    /* renamed from: e */
    public final boolean m46334e() {
        return this.f46715b;
    }

    /* renamed from: f */
    public final boolean m46335f() {
        return this.f46720g;
    }

    /* renamed from: g */
    public final long m46336g() {
        return this.f46717d;
    }

    /* renamed from: h */
    public final int m46337h() {
        return this.f46716c;
    }

    /* renamed from: i */
    public final List m46338i() {
        return this.f46721h;
    }

    /* renamed from: j */
    public final int m46339j() {
        return this.f46719f;
    }

    /* renamed from: k */
    public final String m46340k() {
        return this.f46714a;
    }

    /* renamed from: l */
    public final int m46341l() {
        return this.f46718e;
    }

    /* renamed from: m */
    public final List m46342m() {
        return this.f46722i;
    }

    /* renamed from: n */
    public final boolean m46343n(long j11) {
        List list = this.f46722i;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ProfilePreviewAlbumItem) it.next()).getId() == j11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m46344o() {
        if ((!this.f46721h.isEmpty()) || (!this.f46722i.isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m46345p(long j11) {
        List list = this.f46722i;
        ArrayList<ProfilePreviewAlbumItem> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ProfilePreviewAlbumItem) obj).getId() == j11) {
                arrayList.add(obj);
            }
        }
        for (ProfilePreviewAlbumItem profilePreviewAlbumItem : arrayList) {
            this.f46722i.remove(profilePreviewAlbumItem);
            this.f46722i.add(0, profilePreviewAlbumItem);
        }
    }

    /* renamed from: q */
    public final void m46346q(boolean z11) {
        this.f46715b = z11;
    }

    /* renamed from: r */
    public final void m46347r(boolean z11) {
        this.f46720g = z11;
    }

    /* renamed from: s */
    public final void m46348s(long j11) {
        this.f46717d = j11;
    }

    /* renamed from: t */
    public final void m46349t(int i11) {
        this.f46716c = i11;
    }

    /* renamed from: u */
    public final void m46350u(int i11) {
        this.f46719f = i11;
    }

    /* renamed from: v */
    public final void m46351v(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46714a = str;
    }

    /* renamed from: w */
    public final void m46352w(int i11) {
        this.f46718e = i11;
    }
}
