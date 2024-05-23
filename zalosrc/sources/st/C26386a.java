package st;

import com.zing.zalo.adapters.C7027c3;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.zviews.InAppNotificationView;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import nh0.C23793c;
import p363nh.C23744a;

/* renamed from: st.a */
/* loaded from: classes4.dex */
public class C26386a {

    /* renamed from: c */
    static volatile C26386a f125371c;

    /* renamed from: a */
    public List f125372a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    long f125373b = 0;

    /* renamed from: c */
    public static synchronized C26386a m135966c() {
        C26386a c26386a;
        synchronized (C26386a.class) {
            try {
                if (f125371c == null) {
                    synchronized (C26386a.class) {
                        try {
                            if (f125371c == null) {
                                f125371c = new C26386a();
                            }
                        } finally {
                        }
                    }
                }
                c26386a = f125371c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c26386a;
    }

    /* renamed from: a */
    public void m135967a(C7027c3.b bVar) {
        if (bVar == null || bVar.f38418b.f42434r.equals(CoreUtility.f89233i)) {
            return;
        }
        List list = this.f125372a;
        if (list != null && list.size() > 0) {
            C7027c3.c cVar = (C7027c3.c) this.f125372a.get(r0.size() - 1);
            if (cVar instanceof C7027c3.b) {
                C7027c3.b bVar2 = (C7027c3.b) cVar;
                if (bVar.f38419c) {
                    if (!Objects.equals(bVar.f38418b.m40394Y(), bVar2.f38418b.m40394Y())) {
                        return;
                    }
                    if (bVar.f38419c && bVar2.f38419c) {
                        return;
                    }
                } else if (Objects.equals(bVar.f38418b.m40394Y(), bVar2.f38418b.m40394Y())) {
                    return;
                }
            }
        }
        if (bVar.f38419c && !InAppNotificationView.m80879p()) {
            return;
        }
        m135968b(bVar);
    }

    /* renamed from: b */
    public void m135968b(C7027c3.c cVar) {
        InAppNotificationView.m80877m();
        ArrayList arrayList = new ArrayList();
        this.f125372a = arrayList;
        arrayList.add(cVar);
        if (this.f125372a.size() > 0) {
            C23744a.m124114c().m124116d(4000, new Object[0]);
        }
    }

    /* renamed from: d */
    public C7027c3.c m135969d() {
        List list = this.f125372a;
        if (list != null && list.size() > 0) {
            return (C7027c3.c) this.f125372a.get(r0.size() - 1);
        }
        return null;
    }

    /* renamed from: e */
    public List m135970e() {
        ArrayList arrayList;
        synchronized (this.f125372a) {
            arrayList = new ArrayList(this.f125372a);
        }
        return arrayList;
    }

    /* renamed from: f */
    public boolean m135971f() {
        if (this.f125373b > 0 && C23793c.m124316k().mo124319c() - this.f125373b < 5000) {
            return true;
        }
        this.f125373b = 0L;
        return false;
    }

    /* renamed from: g */
    public void m135972g(MessageId messageId) {
        List list = this.f125372a;
        if (list != null && list.size() > 0) {
            C7027c3.c cVar = (C7027c3.c) this.f125372a.get(r0.size() - 1);
            if (cVar instanceof C7027c3.b) {
                C7027c3.b bVar = (C7027c3.b) cVar;
                if (bVar.f38419c || !Objects.equals(messageId, bVar.f38418b.m40394Y())) {
                    return;
                }
            }
        }
        if (!InAppNotificationView.m80879p()) {
            return;
        }
        C23744a.m124114c().m124116d(4002, new Object[0]);
    }

    /* renamed from: h */
    public void m135973h() {
        this.f125373b = C23793c.m124316k().mo124319c();
    }
}
