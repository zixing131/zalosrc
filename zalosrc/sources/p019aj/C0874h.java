package p019aj;

import android.text.TextUtils;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p394oj.C24277c;
import pm0.C24848g0;

/* renamed from: aj.h */
/* loaded from: classes3.dex */
public final class C0874h {

    /* renamed from: b */
    private static boolean f3218b;

    /* renamed from: d */
    private static C24277c f3220d;

    /* renamed from: a */
    public static final C0874h f3217a = new C0874h();

    /* renamed from: c */
    private static final List f3219c = Collections.synchronizedList(new ArrayList());

    private C0874h() {
    }

    /* renamed from: e */
    private final void m2585e() {
        synchronized (this) {
            try {
                if (f3218b) {
                    return;
                }
                try {
                    f3219c.clear();
                    f3220d = null;
                    String m121632Y7 = AbstractC23309i.m121632Y7();
                    AbstractC19074t.m100207e(m121632Y7, "getListLiveEmoji(...)");
                    if (!TextUtils.isEmpty(m121632Y7)) {
                        JSONArray jSONArray = new JSONArray(m121632Y7);
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            f3219c.add(new C24277c(jSONArray.getJSONObject(i11)));
                        }
                        String m122314qb = AbstractC23309i.m122314qb();
                        AbstractC19074t.m100207e(m122314qb, "getSelectedLiveEmoji(...)");
                        if (!TextUtils.isEmpty(m122314qb)) {
                            int size = f3219c.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size) {
                                    break;
                                }
                                List list = f3219c;
                                if (AbstractC19074t.m100204b(((C24277c) list.get(i12)).f117241b, m122314qb)) {
                                    f3220d = (C24277c) list.get(i12);
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            Random random = new Random();
                            List list2 = f3219c;
                            f3220d = (C24277c) list2.get(random.nextInt(list2.size()));
                        }
                        if (f3220d == null) {
                            f3220d = (C24277c) f3219c.get(0);
                        }
                        f3218b = true;
                        AbstractC19444a.m101697e(new Runnable() { // from class: aj.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0874h.m2586f();
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static final void m2586f() {
        C23744a.Companion.m124119a().m124116d(123, Boolean.TRUE);
    }

    /* renamed from: b */
    public final void m2587b() {
        synchronized (this) {
            if (!f3218b) {
                return;
            }
            f3217a.m2585e();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: c */
    public final List m2588c() {
        m2585e();
        return new ArrayList(f3219c);
    }

    /* renamed from: d */
    public final C24277c m2589d() {
        m2585e();
        return f3220d;
    }

    /* renamed from: g */
    public final void m2590g(C24277c c24277c) {
        synchronized (this) {
            f3220d = c24277c;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }
}
