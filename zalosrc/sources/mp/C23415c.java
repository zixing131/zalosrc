package mp;

import android.text.TextUtils;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.utils.ToastUtils;
import is.AbstractC20789d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p302ko.C21785g;

/* renamed from: mp.c */
/* loaded from: classes4.dex */
public class C23415c {

    /* renamed from: c */
    private static C23415c f113782c;

    /* renamed from: d */
    private static final Object f113783d = new Object();

    /* renamed from: b */
    Map f113785b = new HashMap();

    /* renamed from: a */
    private final C21785g f113784a = C21785g.m112430F0();

    /* renamed from: mp.c$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo116833a(C23413a c23413a);
    }

    private C23415c() {
    }

    /* renamed from: b */
    public static C23415c m123032b() {
        if (f113782c == null) {
            synchronized (C23415c.class) {
                f113782c = new C23415c();
            }
        }
        return f113782c;
    }

    /* renamed from: a */
    public C21785g m123033a() {
        return this.f113784a;
    }

    /* renamed from: c */
    public String m123034c(String str, String str2, int i11) {
        return str + "_" + str2 + "_" + i11;
    }

    /* renamed from: d */
    public void m123035d(String str, C23413a c23413a) {
        synchronized (f113783d) {
            try {
                List<a> list = (List) this.f113785b.remove(str);
                if (list != null) {
                    for (a aVar : list) {
                        if (aVar != null) {
                            aVar.mo116833a(c23413a);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m123036e(String str, String str2, String str3, int i11, TrackingSource trackingSource, a aVar) {
        String str4;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (f113783d) {
            try {
                if (this.f113785b != null) {
                    if (!TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str;
                    }
                    String m123034c = m123034c(str4, str3, i11);
                    if (this.f113785b.containsKey(m123034c)) {
                        List list = (List) this.f113785b.get(m123034c);
                        if (list != null) {
                            list.add(aVar);
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar);
                        this.f113785b.put(m123034c, arrayList);
                        new C23414b(str, str2, str3, i11, trackingSource, f113782c).m123031a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public C10873l m123037f(C23416d c23416d, int i11, String str) {
        C10873l m56429f;
        if (c23416d != null) {
            try {
                if (!AbstractC20789d.m108468b()) {
                    if (!c23416d.m123050m()) {
                        ToastUtils.showMess(str);
                        return null;
                    }
                    int m123048k = c23416d.m123048k();
                    if (m123048k != 0) {
                        if (m123048k != 1) {
                            if (m123048k != 2) {
                                m56429f = null;
                            } else {
                                m56429f = C10873l.m56430g(c23416d.m123040c(), c23416d.m123043f(), c23416d.m123045h(), c23416d.m123042e(), c23416d.m123049l(), c23416d.m123039b(), c23416d.m123041d(), c23416d.m123044g(), i11, c23416d.m123047j());
                            }
                        } else {
                            m56429f = C10873l.m56428e(c23416d.m123040c(), c23416d.m123043f(), c23416d.m123045h(), c23416d.m123042e(), c23416d.m123049l(), c23416d.m123039b(), c23416d.m123041d(), c23416d.m123046i(), i11, c23416d.m123047j());
                        }
                    } else {
                        m56429f = C10873l.m56429f(c23416d.m123040c(), c23416d.m123043f(), c23416d.m123045h(), c23416d.m123042e(), c23416d.m123049l(), c23416d.m123039b(), c23416d.m123041d(), i11, c23416d.m123047j());
                    }
                    if (m56429f != null) {
                        AbstractC20789d.m108481o(m56429f);
                    }
                    return m56429f;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }
}
