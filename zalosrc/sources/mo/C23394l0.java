package mo;

import android.os.Bundle;
import p205hc.InterfaceC19969h;
import p716zh.C32002l4;

/* renamed from: mo.l0 */
/* loaded from: classes4.dex */
public class C23394l0 implements InterfaceC19969h {

    /* renamed from: a */
    public String f113643a;

    /* renamed from: b */
    public String f113644b;

    /* renamed from: c */
    public String f113645c;

    /* renamed from: d */
    public int f113646d = 1;

    /* renamed from: e */
    public long f113647e;

    /* renamed from: f */
    public boolean f113648f;

    /* renamed from: g */
    public String f113649g;

    /* renamed from: h */
    public C32002l4 f113650h;

    /* renamed from: i */
    public boolean f113651i;

    /* renamed from: j */
    public boolean f113652j;

    /* renamed from: a */
    public static C23394l0 m122886a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        long j11;
        if (bundle == null) {
            return null;
        }
        C23394l0 c23394l0 = new C23394l0();
        String str4 = "";
        if (!bundle.containsKey("userId")) {
            str = "";
        } else {
            str = bundle.getString("userId");
        }
        c23394l0.f113643a = str;
        if (!bundle.containsKey("picid")) {
            str2 = "";
        } else {
            str2 = bundle.getString("picid");
        }
        c23394l0.f113644b = str2;
        if (!bundle.containsKey("extra_feed_id")) {
            str3 = "";
        } else {
            str3 = bundle.getString("extra_feed_id");
        }
        c23394l0.f113645c = str3;
        if (bundle.containsKey("fromSrc")) {
            c23394l0.f113646d = bundle.getInt("fromSrc");
        }
        if (bundle.containsKey("extra_notification_id")) {
            j11 = bundle.getLong("extra_notification_id");
        } else {
            j11 = 0;
        }
        c23394l0.f113647e = j11;
        c23394l0.f113648f = bundle.getBoolean("extra_scroll_last_comment", false);
        if (bundle.containsKey("extra_highlight_comment_id")) {
            str4 = bundle.getString("extra_highlight_comment_id");
        }
        c23394l0.f113649g = str4;
        if (bundle.containsKey("extra_entry_point_flow")) {
            c23394l0.f113650h = C32002l4.m154269m(bundle.getString("extra_entry_point_flow")).m154271a(10007);
        } else {
            c23394l0.f113650h = C32002l4.m154264g(10007);
        }
        c23394l0.f113651i = bundle.getBoolean("extra_view_avatar", false);
        c23394l0.f113652j = bundle.getBoolean("extra_view_cover", false);
        return c23394l0;
    }
}
