package b40;

import ag0.C0815e1;
import am.AbstractC0924m0;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import me0.AbstractC23020b3;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import qm0.AbstractC25368s;
import ws.C29199a;

/* renamed from: b40.c */
/* loaded from: classes5.dex */
public final class C2524c {

    /* renamed from: a */
    public static final C2524c f10266a = new C2524c();

    /* renamed from: b */
    private static final ArrayList f10267b;

    static {
        ArrayList m131500h;
        m131500h = AbstractC25368s.m131500h("text", "photo", "file", "video", "others");
        f10267b = m131500h;
    }

    private C2524c() {
    }

    /* renamed from: b */
    private final JSONObject m12640b(Map map) {
        long j11;
        JSONObject jSONObject = new JSONObject();
        Iterator it = f10267b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                Object obj = map.get(str);
                AbstractC19074t.m100205c(obj);
                j11 = ((Number) obj).longValue();
            } else {
                j11 = 0;
            }
            jSONObject.put(str, j11);
        }
        return jSONObject;
    }

    /* renamed from: c */
    private final String m12641c() {
        String uuid = AbstractC23020b3.m118021b(MainApplication.Companion.m35500c()).toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        return uuid;
    }

    /* renamed from: a */
    public final void m12642a() {
        try {
            long m3039F2 = AbstractC0924m0.m3039F2();
            long mo124314i = AbstractC23306f.m120579F1().mo124314i();
            if (mo124314i - m3039F2 > 86400000) {
                C23648e c23648e = new C23648e(1, "", 1, "autosync_msg_mycloud_count", m12641c(), m12640b(AbstractC23306f.m120605O0().m124386j()).toString());
                C0815e1.m2075D().m2100V(c23648e, false);
                AbstractC0924m0.m2998Dj(mo124314i);
                C29199a.m145771a("ActionLogAutoSyncMsg - logAutoSyncMyCloudMsgCountDaily " + c23648e.mo123915d());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public final ArrayList m12643d() {
        return f10267b;
    }

    /* renamed from: e */
    public final void m12644e(Map map) {
        AbstractC19074t.m100208f(map, "mapAutoSyncedMsgStats");
        try {
            if (AbstractC0924m0.m4107pb()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("local_stats", m12640b(AbstractC23306f.m120605O0().m124386j()));
                jSONObject.put("synced_stats", m12640b(map));
                C23648e c23648e = new C23648e(1, "", 1, "autosync_msg_mycloud_done", m12641c(), jSONObject.toString());
                C0815e1.m2075D().m2100V(c23648e, false);
                AbstractC0924m0.m4087ol(false);
                C29199a.m145771a("ActionLogAutoSyncMsg - logAutoSyncMyCloudDone " + c23648e.mo123915d());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
