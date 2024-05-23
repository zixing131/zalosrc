package com.zing.zalo.p077ui.group.livestream;

import ag0.C0814e0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import dj.C17945a0;
import p056cj.C3535c;
import p511sw.C26393b;

/* renamed from: com.zing.zalo.ui.group.livestream.a */
/* loaded from: classes5.dex */
public class C11944a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f62321r;

    /* renamed from: s */
    private final LayoutInflater f62322s;

    /* renamed from: t */
    protected boolean f62323t = false;

    /* renamed from: u */
    protected C3535c f62324u;

    /* renamed from: v */
    private int f62325v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.livestream.a$a */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        ChatLiveStreamingItemText f62326I;

        public a(View view, int i11, Context context) {
            super(view);
            m66472i0(view, i11, context);
        }

        /* renamed from: i0 */
        private void m66472i0(View view, int i11, Context context) {
            if (i11 == 1) {
                ChatLiveStreamingItemText chatLiveStreamingItemText = (ChatLiveStreamingItemText) view.findViewById(AbstractC6918a0.chatLiveStreamingText);
                this.f62326I = chatLiveStreamingItemText;
                chatLiveStreamingItemText.m66347a(context, 1);
            }
        }
    }

    public C11944a(Context context) {
        this.f62321r = context;
        this.f62322s = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: L */
    private Object m66465L(int i11) {
        C26393b m136076v;
        if (i11 < 0 || (m136076v = this.f62324u.m136076v()) == null || i11 >= m136076v.m136016p()) {
            return null;
        }
        return m136076v.m136006f(i11);
    }

    /* renamed from: M */
    private boolean m66466M(int i11) {
        try {
            C17945a0 c17945a0 = (C17945a0) m66465L(i11);
            C17945a0 c17945a02 = (C17945a0) m66465L(i11 - 1);
            if (c17945a02 != null && c17945a0 != null) {
                return c17945a02.m94862C4().equals(c17945a0.m94862C4());
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: N */
    public void m66467N() {
        C3535c c3535c = this.f62324u;
        int i11 = 0;
        if (c3535c != null) {
            if (c3535c.m136076v() != null) {
                i11 = this.f62324u.m136076v().m136016p();
            }
            this.f62325v = i11;
        } else {
            this.f62325v = 0;
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        try {
            C17945a0 c17945a0 = (C17945a0) m66465L(i11);
            if (c17945a0 != null && aVar.m9931C() == 1) {
                if (c17945a0.m95032V6() && c17945a0.m95200m8()) {
                    C0814e0.m2056b(c17945a0);
                }
                aVar.f62326I.setType(1);
                aVar.f62326I.m66348b(c17945a0, !m66466M(i11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        View inflate;
        if (i11 != 1) {
            inflate = this.f62322s.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
        } else {
            inflate = this.f62322s.inflate(AbstractC7409c0.chat_live_streaming_text, viewGroup, false);
        }
        return new a(inflate, i11, this.f62321r);
    }

    /* renamed from: Q */
    public void m66470Q(C3535c c3535c) {
        this.f62324u = c3535c;
    }

    /* renamed from: R */
    public void m66471R(boolean z11) {
        this.f62323t = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f62325v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C17945a0 c17945a0;
        try {
            if (this.f62324u == null || (c17945a0 = (C17945a0) m66465L(i11)) == null) {
                return 0;
            }
            if (c17945a0.m95041W4() != 41) {
                return 0;
            }
            return 1;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }
}
