package p329lo;

import android.os.Bundle;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import p205hc.InterfaceC19969h;
import p716zh.C32002l4;

/* renamed from: lo.q0 */
/* loaded from: classes4.dex */
public class C22577q0 implements InterfaceC19969h {

    /* renamed from: a */
    public String f110475a;

    /* renamed from: b */
    public String f110476b;

    /* renamed from: c */
    public long f110477c;

    /* renamed from: d */
    public int f110478d;

    /* renamed from: e */
    public int f110479e;

    /* renamed from: f */
    public boolean f110480f;

    /* renamed from: g */
    public String f110481g;

    /* renamed from: h */
    public C32002l4 f110482h;

    /* renamed from: j */
    public boolean f110484j;

    /* renamed from: m */
    public boolean f110487m;

    /* renamed from: n */
    public String f110488n;

    /* renamed from: i */
    public int f110483i = 1;

    /* renamed from: k */
    public int f110485k = -1;

    /* renamed from: l */
    public boolean f110486l = false;

    /* renamed from: a */
    public static C22577q0 m116832a(Bundle bundle) {
        String str;
        String str2;
        long j11;
        if (bundle == null) {
            return null;
        }
        C22577q0 c22577q0 = new C22577q0();
        if (!bundle.containsKey("fid")) {
            str = "";
        } else {
            str = bundle.getString("fid");
        }
        c22577q0.f110475a = str;
        if (!bundle.containsKey("ownerId")) {
            str2 = "";
        } else {
            str2 = bundle.getString("ownerId");
        }
        c22577q0.f110476b = str2;
        if (bundle.containsKey("extra_notification_id")) {
            j11 = bundle.getLong("extra_notification_id");
        } else {
            j11 = 0;
        }
        c22577q0.f110477c = j11;
        c22577q0.f110478d = bundle.getInt("feedCate", 0);
        c22577q0.f110479e = bundle.getInt("ftype", -1);
        c22577q0.f110480f = bundle.getBoolean("extra_scroll_last_comment", false);
        c22577q0.f110481g = bundle.getString("extra_highlight_comment_id", "");
        if (bundle.containsKey("extra_entry_point_flow")) {
            c22577q0.f110482h = C32002l4.m154269m(bundle.getString("extra_entry_point_flow")).m154271a(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
        } else {
            c22577q0.f110482h = C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
        }
        if (bundle.containsKey("fromSrc")) {
            c22577q0.f110483i = bundle.getInt("fromSrc");
        }
        c22577q0.f110484j = bundle.getBoolean("extra_need_scroll_to_bottom", false);
        c22577q0.f110485k = bundle.getInt("extra_action_request", -1);
        c22577q0.f110486l = bundle.getBoolean("extra_mutual_mode", false);
        c22577q0.f110487m = bundle.getBoolean("extra_from_timeline", false);
        c22577q0.f110488n = bundle.getString("extra_feed_memory_info", "");
        return c22577q0;
    }
}
