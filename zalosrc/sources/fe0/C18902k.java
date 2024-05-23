package fe0;

import au.EnumC2382z;
import ci.AbstractC3498e;
import ci.C3499e0;
import ci.C3521p0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.List;
import p185gc.AbstractC19383g;

/* renamed from: fe0.k */
/* loaded from: classes4.dex */
public final class C18902k extends AbstractC19383g {

    /* renamed from: a */
    private final C3521p0 f94358a;

    /* renamed from: fe0.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C17945a0 f94359a;

        public a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            this.f94359a = c17945a0;
        }

        /* renamed from: a */
        public final C17945a0 m99088a() {
            return this.f94359a;
        }
    }

    public C18902k(C3521p0 c3521p0) {
        AbstractC19074t.m100208f(c3521p0, "msRepository");
        this.f94358a = c3521p0;
    }

    /* renamed from: c */
    private final List m99086c(C3499e0 c3499e0, EnumC2382z enumC2382z, C17945a0 c17945a0) {
        AbstractC3498e m17615T = c3499e0.m17615T(enumC2382z);
        if (m17615T == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        MediaStoreItem m17554g = m17615T.m17554g(m95029V3);
        if (m17554g != null) {
            m17554g.m40565E0(c17945a0);
            MessageId m95029V32 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
            arrayList.add(m95029V32);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        EnumC2382z enumC2382z;
        AbstractC19074t.m100208f(aVar, "params");
        for (C3499e0 c3499e0 : this.f94358a.m17790n(aVar.m99088a().mo95039W2())) {
            if (!AbstractC19646n0.m103031t1(aVar.m99088a().m95041W4()) && !AbstractC19646n0.m102886D1(aVar.m99088a().m95041W4()) && !AbstractC19646n0.m102995k1(aVar.m99088a().m95041W4())) {
                if (AbstractC19646n0.m103019q1(aVar.m99088a())) {
                    enumC2382z = EnumC2382z.f9946s;
                } else if (AbstractC19646n0.m103003m1(aVar.m99088a().m95041W4())) {
                    enumC2382z = EnumC2382z.f9947t;
                } else {
                    enumC2382z = EnumC2382z.f9944q;
                }
            } else {
                enumC2382z = EnumC2382z.f9945r;
            }
            List m99086c = m99086c(c3499e0, enumC2382z, aVar.m99088a());
            if (!m99086c.isEmpty()) {
                c3499e0.m17628n(enumC2382z, m99086c);
            }
        }
    }
}
