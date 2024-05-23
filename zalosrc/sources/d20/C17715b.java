package d20;

import android.widget.LinearLayout;
import b10.AbstractC2487f;
import b10.C2484c;
import com.zing.zalo.shortvideo.data.model.Content;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitContentTextView;
import fn0.AbstractC19074t;
import p354n3.C23528a;
import q10.C25059v;
import s20.AbstractC26112n;

/* renamed from: d20.b */
/* loaded from: classes5.dex */
public final class C17715b extends AbstractC17714a {

    /* renamed from: J */
    private final C25059v f89799J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C17715b(C25059v c25059v) {
        super(r0);
        AbstractC19074t.m100208f(c25059v, "binding");
        LinearLayout root = c25059v.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        this.f89799J = c25059v;
    }

    @Override // d20.AbstractC17714a
    /* renamed from: i0 */
    public void mo93789i0(AbstractC2487f abstractC2487f) {
        C2484c c2484c;
        String str;
        Content content;
        AbstractC19074t.m100208f(abstractC2487f, "data");
        C25059v c25059v = this.f89799J;
        if (abstractC2487f instanceof C2484c) {
            c2484c = (C2484c) abstractC2487f;
        } else {
            c2484c = null;
        }
        if (c2484c == null) {
            return;
        }
        C23528a c23528a = (C23528a) new C23528a(c25059v.getRoot().getContext()).m123612r(c25059v.f120345q);
        c23528a.m123599d();
        InteractEventResponse.InteractItem m12549b = c2484c.m12549b();
        if (m12549b != null) {
            str = m12549b.m51668b();
        } else {
            str = null;
        }
        LinearLayout root = c25059v.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        if (c2484c.m12550c()) {
            c25059v.f120346r.setTextSize(1, 13.0f);
        } else {
            c25059v.f120346r.setTextSize(1, 14.0f);
        }
        FitContentTextView fitContentTextView = c25059v.f120346r;
        AbstractC19074t.m100207e(fitContentTextView, "txtContent");
        InteractEventResponse.InteractItem m12549b2 = c2484c.m12549b();
        if (m12549b2 != null) {
            content = m12549b2.m51667a();
        } else {
            content = null;
        }
        AbstractC26112n.m134393d0(fitContentTextView, content);
    }
}
