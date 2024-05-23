package iq;

import android.os.Bundle;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.adapters.C8050a;
import p205hc.InterfaceC19969h;
import p304ks.C21927m;
import p363nh.AbstractC23775p0;
import p716zh.C32002l4;

/* renamed from: iq.b4 */
/* loaded from: classes4.dex */
public class C20661b4 implements InterfaceC19969h {

    /* renamed from: f */
    C32002l4 f101625f;

    /* renamed from: j */
    ContactProfile f101629j;

    /* renamed from: k */
    public boolean f101630k;

    /* renamed from: l */
    public C8050a.d0 f101631l;

    /* renamed from: a */
    String f101620a = "";

    /* renamed from: b */
    boolean f101621b = false;

    /* renamed from: c */
    boolean f101622c = false;

    /* renamed from: d */
    boolean f101623d = false;

    /* renamed from: e */
    int f101624e = -1;

    /* renamed from: g */
    String f101626g = "";

    /* renamed from: h */
    boolean f101627h = false;

    /* renamed from: i */
    int f101628i = 0;

    /* renamed from: a */
    public static C20661b4 m107748a(Bundle bundle) {
        String str;
        boolean z11;
        boolean z12;
        if (bundle == null) {
            return null;
        }
        C20661b4 c20661b4 = new C20661b4();
        String str2 = "";
        if (!bundle.containsKey("userID")) {
            str = "";
        } else {
            str = bundle.getString("userID");
        }
        c20661b4.f101620a = str;
        if (bundle.containsKey("fromChat") && bundle.getBoolean("fromChat")) {
            z11 = true;
        } else {
            z11 = false;
        }
        c20661b4.f101621b = z11;
        if (bundle.containsKey("fromPlugin") && bundle.getBoolean("fromPlugin")) {
            z12 = true;
        } else {
            z12 = false;
        }
        c20661b4.f101622c = z12;
        c20661b4.f101623d = bundle.getBoolean("fromFriendSuggest", false);
        c20661b4.f101624e = C21927m.m114302u().m114307E(c20661b4.f101620a);
        if (bundle.containsKey("extra_entry_point_flow")) {
            c20661b4.f101625f = C32002l4.m154269m(bundle.getString("extra_entry_point_flow"));
        }
        bundle.getString("SOURCE_ACTION", "");
        if (bundle.containsKey("STR_EXTRA_PHONE_NUM_FROM_SEARCH")) {
            str2 = bundle.getString("STR_EXTRA_PHONE_NUM_FROM_SEARCH");
        }
        c20661b4.f101626g = str2;
        if (bundle.getBoolean("extra_from_noti_friend_update_profile_music", false)) {
            c20661b4.f101627h = true;
            AbstractC23775p0.m124198c("music_profile", c20661b4.f101620a);
        }
        c20661b4.f101628i = bundle.getInt("extra_source_friend", 0);
        c20661b4.f101629j = (ContactProfile) bundle.getParcelable("profile");
        c20661b4.f101630k = bundle.getBoolean("extra_show_profile_photo");
        c20661b4.f101631l = (C8050a.d0) bundle.getSerializable("extra_default_tab");
        return c20661b4;
    }
}
