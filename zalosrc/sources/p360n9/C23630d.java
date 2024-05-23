package p360n9;

import java.util.Iterator;
import java.util.Map;
import p319l9.C22152a;
import p476r9.EnumC25694b;
import p507s9.C26196m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n9.d */
/* loaded from: classes3.dex */
public final class C23630d extends AbstractC23631e {

    /* renamed from: b */
    private static final C22152a f114510b = C22152a.m115524e();

    /* renamed from: a */
    private final C26196m f114511a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C23630d(C26196m c26196m) {
        this.f114511a = c26196m;
    }

    /* renamed from: g */
    private boolean m123864g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                AbstractC23631e.m123877d((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e11) {
                f114510b.m115533j(e11.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private boolean m123865h(C26196m c26196m) {
        return m123866i(c26196m, 0);
    }

    /* renamed from: i */
    private boolean m123866i(C26196m c26196m, int i11) {
        if (c26196m == null) {
            return false;
        }
        if (i11 > 1) {
            f114510b.m115533j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : c26196m.m134744d0().entrySet()) {
            if (!m123869l((String) entry.getKey())) {
                f114510b.m115533j("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            if (!m123870m((Long) entry.getValue())) {
                f114510b.m115533j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator it = c26196m.m134749l0().iterator();
        while (it.hasNext()) {
            if (!m123866i((C26196m) it.next(), i11 + 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private boolean m123867j(C26196m c26196m) {
        if (c26196m.m134743c0() > 0) {
            return true;
        }
        Iterator it = c26196m.m134749l0().iterator();
        while (it.hasNext()) {
            if (((C26196m) it.next()).m134743c0() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m123868k(C26196m c26196m) {
        return c26196m.m134747j0().startsWith("_st_");
    }

    /* renamed from: l */
    private boolean m123869l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f114510b.m115533j("counterId is empty");
            return false;
        }
        if (trim.length() > 100) {
            f114510b.m115533j("counterId exceeded max length 100");
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m123870m(Long l11) {
        return l11 != null;
    }

    /* renamed from: n */
    private boolean m123871n(C26196m c26196m) {
        Long l11 = (Long) c26196m.m134744d0().get(EnumC25694b.FRAMES_TOTAL.toString());
        if (l11 != null && l11.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m123872o(C26196m c26196m, int i11) {
        if (c26196m == null) {
            f114510b.m115533j("TraceMetric is null");
            return false;
        }
        if (i11 > 1) {
            f114510b.m115533j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!m123874q(c26196m.m134747j0())) {
            f114510b.m115533j("invalid TraceId:" + c26196m.m134747j0());
            return false;
        }
        if (!m123873p(c26196m)) {
            f114510b.m115533j("invalid TraceDuration:" + c26196m.m134746g0());
            return false;
        }
        if (!c26196m.m134750m0()) {
            f114510b.m115533j("clientStartTimeUs is null.");
            return false;
        }
        if (m123868k(c26196m) && !m123871n(c26196m)) {
            f114510b.m115533j("non-positive totalFrames in screen trace " + c26196m.m134747j0());
            return false;
        }
        Iterator it = c26196m.m134749l0().iterator();
        while (it.hasNext()) {
            if (!m123872o((C26196m) it.next(), i11 + 1)) {
                return false;
            }
        }
        if (!m123864g(c26196m.m134745e0())) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private boolean m123873p(C26196m c26196m) {
        if (c26196m != null && c26196m.m134746g0() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m123874q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }

    @Override // p360n9.AbstractC23631e
    /* renamed from: c */
    public boolean mo123851c() {
        if (!m123872o(this.f114511a, 0)) {
            f114510b.m115533j("Invalid Trace:" + this.f114511a.m134747j0());
            return false;
        }
        if (m123867j(this.f114511a) && !m123865h(this.f114511a)) {
            f114510b.m115533j("Invalid Counters for Trace:" + this.f114511a.m134747j0());
            return false;
        }
        return true;
    }
}
