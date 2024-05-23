package fe0;

import au.EnumC2382z;
import ci.AbstractC3498e;
import ci.C3499e0;
import ci.C3521p0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p185gc.AbstractC19383g;
import p241ij.C20568e;
import qm0.AbstractC25366r;

/* renamed from: fe0.e */
/* loaded from: classes4.dex */
public final class C18896e extends AbstractC19383g {

    /* renamed from: a */
    private final C3521p0 f94335a;

    /* renamed from: fe0.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C17945a0 f94336a;

        /* renamed from: b */
        private final MessageId f94337b;

        /* renamed from: c */
        private final C20568e f94338c;

        public a(C17945a0 c17945a0, MessageId messageId, C20568e c20568e) {
            this.f94336a = c17945a0;
            this.f94337b = messageId;
            this.f94338c = c20568e;
        }

        /* renamed from: a */
        public final C17945a0 m99072a() {
            return this.f94336a;
        }

        /* renamed from: b */
        public final MessageId m99073b() {
            return this.f94337b;
        }

        /* renamed from: c */
        public final C20568e m99074c() {
            return this.f94338c;
        }
    }

    public C18896e(C3521p0 c3521p0) {
        AbstractC19074t.m100208f(c3521p0, "msRepository");
        this.f94335a = c3521p0;
    }

    /* renamed from: c */
    private final void m99069c(C3499e0 c3499e0, EnumC2382z enumC2382z, MessageId messageId, boolean z11) {
        List m131496e;
        try {
            AbstractC3498e m17615T = c3499e0.m17615T(enumC2382z);
            if (m17615T == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            MediaStoreItem m17554g = m17615T.m17554g(messageId);
            if (m17554g != null) {
                arrayList.add(m17554g.m40571M());
            }
            if (!(!arrayList.isEmpty())) {
                m131496e = AbstractC25366r.m131496e(messageId);
                c3499e0.m17641u0(enumC2382z, m131496e);
            } else {
                c3499e0.m17603F(enumC2382z, arrayList, z11);
            }
            c3499e0.m17598A(enumC2382z, messageId);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    private final void m99070d(int i11, C3499e0 c3499e0, MessageId messageId, boolean z11) {
        EnumC2382z m119836i;
        if (messageId != null && (m119836i = C23250w4.f112644a.m119836i(i11)) != null) {
            m99069c(c3499e0, m119836i, messageId, z11);
        }
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: e */
    public void mo12006b(a aVar) {
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(aVar, "params");
        MessageId m99073b = aVar.m99073b();
        if (m99073b == null) {
            C17945a0 m99072a = aVar.m99072a();
            if (m99072a != null) {
                m99073b = m99072a.m95029V3();
            } else {
                m99073b = null;
            }
        }
        C20568e m99074c = aVar.m99074c();
        if (m99074c != null) {
            i11 = m99074c.m107019c();
        } else {
            i11 = -1;
        }
        C20568e m99074c2 = aVar.m99074c();
        if (m99074c2 != null) {
            z11 = m99074c2.m107022f();
        } else {
            z11 = false;
        }
        if (aVar.m99072a() != null) {
            String mo95039W2 = aVar.m99072a().mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            Iterator it = this.f94335a.m17790n(mo95039W2).iterator();
            while (it.hasNext()) {
                m99070d(i11, (C3499e0) it.next(), m99073b, z11);
            }
        }
    }
}
