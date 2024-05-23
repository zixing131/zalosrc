package p583vq;

import android.os.Bundle;
import bo.C2988i3;
import com.zing.zalo.control.ItemAlbumMobile;
import is.AbstractC20826v0;
import org.json.JSONException;
import org.json.JSONObject;
import p205hc.InterfaceC19969h;
import p716zh.C32002l4;

/* renamed from: vq.j0 */
/* loaded from: classes4.dex */
public class C28587j0 implements InterfaceC19969h {

    /* renamed from: a */
    public String f132591a;

    /* renamed from: b */
    public String f132592b;

    /* renamed from: c */
    public String f132593c;

    /* renamed from: d */
    public C32002l4 f132594d;

    /* renamed from: e */
    public ItemAlbumMobile f132595e;

    /* renamed from: f */
    public boolean f132596f;

    /* renamed from: h */
    public C2988i3 f132598h;

    /* renamed from: g */
    public int f132597g = -1;

    /* renamed from: i */
    public boolean f132599i = false;

    /* renamed from: j */
    public int f132600j = -1;

    /* renamed from: k */
    public boolean f132601k = false;

    /* renamed from: a */
    public static C28587j0 m143000a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C28587j0 c28587j0 = new C28587j0();
        c28587j0.f132591a = bundle.getString("EXTRA_FEED_ID", "");
        c28587j0.f132592b = bundle.getString("EXTRA_PHOTO_ID", "");
        c28587j0.f132593c = bundle.getString("EXTRA_OWNER_ID", "");
        c28587j0.f132595e = (ItemAlbumMobile) bundle.getParcelable("EXTRA_PHOTO_ITEM");
        if (bundle.containsKey("EXTRA_ENTRY_POINT_FLOW")) {
            c28587j0.f132594d = C32002l4.m154269m(bundle.getString("EXTRA_ENTRY_POINT_FLOW")).m154271a(10011);
        } else {
            c28587j0.f132594d = C32002l4.m154264g(10011);
        }
        c28587j0.f132596f = bundle.getBoolean("EXTRA_SHOULD_SAVE_QUICK_COMMENT_TO_STORE", true);
        c28587j0.f132597g = bundle.getInt("extra_action_request", -1);
        try {
            c28587j0.f132598h = AbstractC20826v0.m108760G0(new JSONObject(bundle.getString("EXTRA_SUGGEST_COMMENT", "")));
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        c28587j0.f132599i = bundle.getBoolean("EXTRA_OPEN_WITH_SUGGEST_COMMENT", false);
        c28587j0.f132600j = bundle.getInt("fromTimelineTab", -1);
        c28587j0.f132601k = bundle.getBoolean("EXTRA_IS_FROM_VIEW_FULL", false);
        return c28587j0;
    }
}
