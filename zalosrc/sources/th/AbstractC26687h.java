package th;

import com.zing.zalo.control.MediaStoreItem;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17990p0;
import fn0.AbstractC19074t;
import nh0.C23793c;
import p279jw.C21373a;
import p461qu.AbstractC25495a;

/* renamed from: th.h */
/* loaded from: classes3.dex */
public abstract class AbstractC26687h {
    /* renamed from: a */
    public static final C26686g m137060a(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (AbstractC25495a.m132078c(str)) {
            return C21373a.f104231a.m110803r();
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m137061b(MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        if (mediaStoreItem.m40596j0()) {
            return true;
        }
        if (!m137065f(mediaStoreItem.m40599m().mo95039W2(), mediaStoreItem.m40599m().m95238r3())) {
            return false;
        }
        return m137063d(C21373a.f104231a.m110803r(), mediaStoreItem.m40599m().m95238r3(), mediaStoreItem.m40599m().m95313z4());
    }

    /* renamed from: c */
    public static final boolean m137062c(C17945a0 c17945a0, C17990p0 c17990p0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(c17990p0, "richContentFile");
        if (!m137065f(c17945a0.mo95039W2(), c17990p0.f91113B)) {
            return false;
        }
        return m137063d(C21373a.f104231a.m110803r(), c17990p0.f91113B, c17945a0.m94974P4());
    }

    /* renamed from: d */
    private static final boolean m137063d(C26686g c26686g, long j11, long j12) {
        if (c26686g.m137053a() <= 0 || j11 <= c26686g.m137053a() || C23793c.Companion.m124321a().mo124310e() - j12 < c26686g.m137056d()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m137064e(C17945a0 c17945a0) {
        C17990p0 c17990p0;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!c17945a0.m95276v6()) {
            return false;
        }
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17990p0) {
            c17990p0 = (C17990p0) m94929K2;
        } else {
            c17990p0 = null;
        }
        if (c17990p0 == null || !m137062c(c17945a0, c17990p0)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m137065f(String str, long j11) {
        if (str == null || !AbstractC25495a.m132078c(str)) {
            return false;
        }
        C21373a c21373a = C21373a.f104231a;
        if (!c21373a.m110802n()) {
            return false;
        }
        C26686g m110803r = c21373a.m110803r();
        if (!m110803r.m137054b() || m110803r.m137053a() <= 0 || j11 <= m110803r.m137053a()) {
            return false;
        }
        return true;
    }
}
