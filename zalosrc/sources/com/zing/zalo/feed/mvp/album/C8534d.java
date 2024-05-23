package com.zing.zalo.feed.mvp.album;

import android.os.Bundle;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import p205hc.InterfaceC19969h;
import p559uv.C27373c;
import p716zh.C32002l4;

/* renamed from: com.zing.zalo.feed.mvp.album.d */
/* loaded from: classes4.dex */
public final class C8534d implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f46132a;

    /* renamed from: b */
    private int f46133b;

    /* renamed from: d */
    private C32002l4 f46135d;

    /* renamed from: e */
    private List f46136e;

    /* renamed from: f */
    private C27373c f46137f;

    /* renamed from: k */
    private List f46142k;

    /* renamed from: c */
    private int f46134c = 1;

    /* renamed from: g */
    private String f46138g = "";

    /* renamed from: h */
    private String f46139h = "";

    /* renamed from: i */
    private ThemeItem f46140i = ThemeItem.Companion.m46365a();

    /* renamed from: j */
    private PrivacyInfo f46141j = new PrivacyInfo();

    /* renamed from: com.zing.zalo.feed.mvp.album.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8534d m45457a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            C8534d c8534d = new C8534d();
            if (bundle.containsKey("extra_entry_point_flow")) {
                c8534d.m45448n(C32002l4.Companion.m154292f(bundle.getString("extra_entry_point_flow")));
            }
            if (bundle.containsKey("medialist")) {
                c8534d.m45450p(bundle.getParcelableArrayList("medialist"));
            }
            if (bundle.containsKey("videoinfo")) {
                c8534d.m45456v((C27373c) bundle.getSerializable("videoinfo"));
            }
            if (bundle.containsKey("extra_external_photos")) {
                c8534d.m45449o(bundle.getParcelableArrayList("extra_external_photos"));
            }
            c8534d.m45451q(bundle.getInt("media_type", 1));
            String string = bundle.getString("title", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            c8534d.m45455u(string);
            String string2 = bundle.getString("desc", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            c8534d.m45447m(string2);
            ThemeItem themeItem = (ThemeItem) bundle.getParcelable("theme");
            if (themeItem == null) {
                themeItem = c8534d.m45443i();
            }
            c8534d.m45454t(themeItem);
            PrivacyInfo privacyInfo = (PrivacyInfo) bundle.getParcelable("privacy");
            if (privacyInfo == null) {
                privacyInfo = c8534d.m45442h();
            }
            c8534d.m45453s(privacyInfo);
            c8534d.m45446l(bundle.getLong("albumid", 0L));
            c8534d.m45452r(bundle.getInt("mode", 0));
            return c8534d;
        }
    }

    /* renamed from: a */
    public final long m45435a() {
        return this.f46132a;
    }

    /* renamed from: b */
    public final String m45436b() {
        return this.f46139h;
    }

    /* renamed from: c */
    public final C32002l4 m45437c() {
        return this.f46135d;
    }

    /* renamed from: d */
    public final List m45438d() {
        return this.f46142k;
    }

    /* renamed from: e */
    public final List m45439e() {
        return this.f46136e;
    }

    /* renamed from: f */
    public final int m45440f() {
        return this.f46134c;
    }

    /* renamed from: g */
    public final int m45441g() {
        return this.f46133b;
    }

    /* renamed from: h */
    public final PrivacyInfo m45442h() {
        return this.f46141j;
    }

    /* renamed from: i */
    public final ThemeItem m45443i() {
        return this.f46140i;
    }

    /* renamed from: j */
    public final String m45444j() {
        return this.f46138g;
    }

    /* renamed from: k */
    public final C27373c m45445k() {
        return this.f46137f;
    }

    /* renamed from: l */
    public final void m45446l(long j11) {
        this.f46132a = j11;
    }

    /* renamed from: m */
    public final void m45447m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46139h = str;
    }

    /* renamed from: n */
    public final void m45448n(C32002l4 c32002l4) {
        this.f46135d = c32002l4;
    }

    /* renamed from: o */
    public final void m45449o(List list) {
        this.f46142k = list;
    }

    /* renamed from: p */
    public final void m45450p(List list) {
        this.f46136e = list;
    }

    /* renamed from: q */
    public final void m45451q(int i11) {
        this.f46134c = i11;
    }

    /* renamed from: r */
    public final void m45452r(int i11) {
        this.f46133b = i11;
    }

    /* renamed from: s */
    public final void m45453s(PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(privacyInfo, "<set-?>");
        this.f46141j = privacyInfo;
    }

    /* renamed from: t */
    public final void m45454t(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "<set-?>");
        this.f46140i = themeItem;
    }

    /* renamed from: u */
    public final void m45455u(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46138g = str;
    }

    /* renamed from: v */
    public final void m45456v(C27373c c27373c) {
        this.f46137f = c27373c;
    }
}
