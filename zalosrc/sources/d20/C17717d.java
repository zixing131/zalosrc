package d20;

import b10.AbstractC2487f;
import b10.C2491j;
import com.zing.zalo.shortvideo.data.model.Content;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.WelcomeCommentLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import fn0.AbstractC19074t;
import p354n3.C23528a;
import q10.C25072z0;
import s20.AbstractC26112n;

/* renamed from: d20.d */
/* loaded from: classes5.dex */
public final class C17717d extends AbstractC17714a {

    /* renamed from: J */
    private final C25072z0 f89801J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C17717d(C25072z0 c25072z0) {
        super(r0);
        AbstractC19074t.m100208f(c25072z0, "binding");
        WelcomeCommentLayout root = c25072z0.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        this.f89801J = c25072z0;
    }

    @Override // d20.AbstractC17714a
    /* renamed from: i0 */
    public void mo93789i0(AbstractC2487f abstractC2487f) {
        C2491j c2491j;
        String str;
        Content content;
        AbstractC19074t.m100208f(abstractC2487f, "data");
        C25072z0 c25072z0 = this.f89801J;
        if (abstractC2487f instanceof C2491j) {
            c2491j = (C2491j) abstractC2487f;
        } else {
            c2491j = null;
        }
        if (c2491j == null) {
            return;
        }
        C23528a c23528a = (C23528a) new C23528a(c25072z0.getRoot().getContext()).m123612r(c25072z0.f120439q);
        c23528a.m123599d();
        InteractEventResponse.InteractItem m12574b = c2491j.m12574b();
        if (m12574b != null) {
            str = m12574b.m51668b();
        } else {
            str = null;
        }
        WelcomeCommentLayout root = c25072z0.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        if (c2491j.m12575c()) {
            c25072z0.f120440r.setTextSize(1, 13.0f);
        } else {
            c25072z0.f120440r.setTextSize(1, 14.0f);
        }
        SimpleShadowTextView simpleShadowTextView = c25072z0.f120440r;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtContent");
        InteractEventResponse.InteractItem m12574b2 = c2491j.m12574b();
        if (m12574b2 != null) {
            content = m12574b2.m51667a();
        } else {
            content = null;
        }
        AbstractC26112n.m134393d0(simpleShadowTextView, content);
    }
}
