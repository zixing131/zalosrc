package p495rx;

import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import ee.C18408p;
import fn0.AbstractC19074t;
import ge.C19411c;
import java.util.ArrayList;

/* renamed from: rx.y */
/* loaded from: classes4.dex */
public final class C26011y {

    /* renamed from: a */
    private final String f124138a;

    /* renamed from: b */
    private final C1761c0 f124139b;

    /* renamed from: rx.y$a */
    /* loaded from: classes4.dex */
    public static final class a implements C18408p.a.InterfaceC32814a {
        a() {
        }

        @Override // ee.C18408p.a.InterfaceC32814a
        /* renamed from: a */
        public void mo2271a(C18408p c18408p) {
            AbstractC19074t.m100208f(c18408p, "calendarController");
            ArrayList m97519X = c18408p.m97519X(C26011y.this.m134100b(), 1, null);
            if (m97519X.size() > 0) {
                C26011y.this.m134099e((C19411c) m97519X.get(0));
            } else {
                C26011y.this.m134099e(null);
            }
        }
    }

    public C26011y(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        this.f124138a = str;
        this.f124139b = new C1761c0();
        m134102d();
    }

    /* renamed from: e */
    public final void m134099e(C19411c c19411c) {
        this.f124139b.mo9221n(c19411c);
    }

    /* renamed from: b */
    public final String m134100b() {
        return this.f124138a;
    }

    /* renamed from: c */
    public final LiveData m134101c() {
        return this.f124139b;
    }

    /* renamed from: d */
    public final void m134102d() {
        C18408p.Companion.m97551p(new a());
    }
}
