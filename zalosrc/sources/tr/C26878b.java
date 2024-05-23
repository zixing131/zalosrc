package tr;

import android.text.TextUtils;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.control.ItemAlbumMobile;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p398oo.C24371m0;

/* renamed from: tr.b */
/* loaded from: classes4.dex */
public final class C26878b {

    /* renamed from: a */
    public static final C26878b f127183a = new C26878b();

    /* renamed from: b */
    private static final String f127184b = C26878b.class.getSimpleName();

    /* renamed from: c */
    private static Map f127185c = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: d */
    private static final Map f127186d = Collections.synchronizedMap(new HashMap());

    private C26878b() {
    }

    /* renamed from: b */
    public static final C26878b m138449b() {
        return f127183a;
    }

    /* renamed from: a */
    public final C3000l0 m138450a(String str) {
        AbstractC19074t.m100208f(str, "localId");
        return (C3000l0) f127185c.get(str);
    }

    /* renamed from: c */
    public final C3000l0 m138451c(String str) {
        AbstractC19074t.m100208f(str, "fid");
        return (C3000l0) f127186d.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:            r2.m40521j(r3);     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ItemAlbumMobile m138452d(String str) {
        C3020p0 m14322a0;
        int i11;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Iterator it = C24371m0.Companion.m127483a().m127477m().iterator();
            ItemAlbumMobile itemAlbumMobile = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3000l0 c3000l0 = (C3000l0) it.next();
                if (c3000l0.m14322a0() != null && ((i11 = (m14322a0 = c3000l0.m14322a0()).f12058q) == 2 || i11 == 3 || i11 == 17)) {
                    itemAlbumMobile = m14322a0.f12023C.m14565b(str);
                    if (itemAlbumMobile != null) {
                        break;
                    }
                }
            }
            return itemAlbumMobile;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public final void m138453e(C3000l0 c3000l0, C3020p0 c3020p0) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        C3000l0 c3000l02 = new C3000l0();
        c3000l02.f11903u = c3000l0.f11903u;
        c3000l02.m14282A1(c3000l0.m14339j0());
        c3000l02.f11893p = c3000l0.f11893p;
        c3000l02.f11895q = c3000l0.f11895q;
        ArrayList arrayList = new ArrayList();
        c3000l02.f11899s = arrayList;
        arrayList.add(c3020p0);
        c3000l02.f11913z = false;
        c3000l02.f11851A = c3000l0.f11851A;
        c3000l02.f11869R = c3000l0.f11869R;
        c3000l02.f11870S = c3000l0.f11870S;
        c3000l02.f11872U = c3000l0.f11872U;
        c3000l02.f11871T = c3000l0.f11871T;
        c3000l02.f11873V = c3000l0.f11873V;
        Map map = f127186d;
        AbstractC19074t.m100207e(map, "currentFeedContentMap");
        map.put(c3020p0.f12057p, c3000l02);
    }

    /* renamed from: f */
    public final void m138454f(String str) {
        AbstractC19074t.m100208f(str, "fid");
        try {
            if (m138451c(str) != null) {
                return;
            }
            for (C3000l0 c3000l0 : C24371m0.Companion.m127483a().m127477m()) {
                List list = c3000l0.f11899s;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C3020p0 c3020p0 = (C3020p0) it.next();
                        if (c3020p0 != null && AbstractC19074t.m100204b(str, c3020p0.f12057p)) {
                            m138453e(c3000l0, c3020p0);
                            break;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    public final void m138455g(C3000l0 c3000l0, C3020p0 c3020p0) {
        if (c3000l0 != null && c3020p0 != null) {
            C3000l0 c3000l02 = new C3000l0();
            c3000l02.f11903u = c3000l0.f11903u;
            c3000l02.m14282A1(c3000l0.m14339j0());
            c3000l02.f11893p = c3000l0.f11893p;
            c3000l02.f11895q = c3000l0.f11895q;
            c3000l02.f11899s = new ArrayList();
            C3020p0 m108752C0 = AbstractC20826v0.m108752C0(c3020p0.m14474E0(), c3000l0.f11893p);
            AbstractC19074t.m100207e(m108752C0, "parseFeedItem(...)");
            c3000l02.f11899s.add(m108752C0);
            c3000l02.f11913z = false;
            c3000l02.f11851A = c3000l0.f11851A;
            Map map = f127186d;
            AbstractC19074t.m100207e(map, "currentFeedContentMap");
            map.put(c3020p0.f12057p, c3000l02);
        }
    }

    /* renamed from: h */
    public final void m138456h(String str, C3000l0 c3000l0) {
        AbstractC19074t.m100208f(str, "localId");
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        try {
            if (f127185c.size() > 20) {
                f127185c.clear();
            }
            Map map = f127185c;
            AbstractC19074t.m100207e(map, "feedPostSuccessMap");
            map.put(str, c3000l0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
