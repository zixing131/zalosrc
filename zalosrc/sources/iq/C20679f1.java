package iq;

import android.os.Bundle;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import p205hc.InterfaceC19969h;
import p716zh.C32002l4;

/* renamed from: iq.f1 */
/* loaded from: classes4.dex */
public class C20679f1 implements InterfaceC19969h {

    /* renamed from: a */
    public C32002l4 f101680a;

    /* renamed from: b */
    public String f101681b;

    /* renamed from: c */
    public int f101682c;

    /* renamed from: d */
    public long f101683d;

    /* renamed from: e */
    public int f101684e;

    /* renamed from: f */
    public String f101685f;

    /* renamed from: g */
    public String f101686g;

    /* renamed from: h */
    public boolean f101687h;

    /* renamed from: i */
    public boolean f101688i;

    /* renamed from: j */
    public int f101689j = ProfileAlbumDetailView.m45985MM();

    /* renamed from: k */
    public int f101690k = ProfileAlbumDetailView.m45986NM();

    /* renamed from: l */
    public int f101691l = ProfileAlbumDetailView.m45986NM();

    /* renamed from: m */
    public int f101692m = ProfileAlbumDetailView.m45986NM();

    /* renamed from: n */
    public int f101693n = ProfileAlbumDetailView.m45986NM();

    /* renamed from: a */
    public static C20679f1 m107801a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C20679f1 c20679f1 = new C20679f1();
        c20679f1.f101681b = bundle.getString("extra_user_id", "");
        c20679f1.f101683d = bundle.getLong("extra_album_id", 0L);
        c20679f1.f101682c = bundle.getInt("extra_album_type", 0);
        c20679f1.f101684e = bundle.getInt("extra_album_size", 0);
        c20679f1.f101685f = bundle.getString("extra_album_unit", "");
        c20679f1.f101686g = bundle.getString("extra_desc_total", "");
        c20679f1.f101689j = bundle.getInt("extra_preload_bg_color", c20679f1.f101689j);
        c20679f1.f101690k = bundle.getInt("extra_preload_text_color", c20679f1.f101690k);
        c20679f1.f101691l = bundle.getInt("extra_preload_text_color_01", c20679f1.f101691l);
        c20679f1.f101692m = bundle.getInt("extra_preload_text_color_02", c20679f1.f101692m);
        c20679f1.f101693n = bundle.getInt("extra_preload_arrow_color", c20679f1.f101693n);
        c20679f1.f101687h = bundle.getBoolean("extra_is_mode_pick_avatar", false);
        c20679f1.f101688i = bundle.getBoolean("extra_bol_only_show_grid_photo", false);
        if (bundle.containsKey("extra_entry_point_flow")) {
            c20679f1.f101680a = C32002l4.m154269m(bundle.getString("extra_entry_point_flow"));
        }
        return c20679f1;
    }
}
