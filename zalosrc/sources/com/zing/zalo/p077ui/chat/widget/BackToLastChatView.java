package com.zing.zalo.p077ui.chat.widget;

import am.C0943w;
import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.transfer.ChatWindowReference;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import vg.C28203u6;

/* loaded from: classes5.dex */
public final class BackToLastChatView extends ModulesView {

    /* renamed from: K */
    private C16716d f60948K;

    /* renamed from: L */
    private C21693c f60949L;

    /* renamed from: M */
    private C22129e f60950M;

    public BackToLastChatView(Context context) {
        super(context);
        m65309W();
    }

    /* renamed from: V */
    public final void m65308V(ChatWindowReference chatWindowReference) {
        AbstractC19074t.m100208f(chatWindowReference, "item");
        C22129e c22129e = null;
        if (AbstractC25495a.m132079d(chatWindowReference.m65298c())) {
            C31973j5 m4472f = C0943w.f3447a.m4472f(chatWindowReference.m65298c());
            if (m4472f != null) {
                C22129e c22129e2 = this.f60950M;
                if (c22129e2 == null) {
                    AbstractC19074t.m100223u("avatar");
                } else {
                    c22129e = c22129e2;
                }
                c22129e.m115437u1(m4472f);
                return;
            }
            return;
        }
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, chatWindowReference.m65298c(), null, 2, null);
        if (m141798e != null) {
            C22129e c22129e3 = this.f60950M;
            if (c22129e3 == null) {
                AbstractC19074t.m100223u("avatar");
            } else {
                c22129e = c22129e3;
            }
            c22129e.m115433q1(m141798e);
        }
    }

    /* renamed from: W */
    public final void m65309W() {
        m88987U(-2, -2);
        setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_back_to_last_chat_view));
        C16716d c16716d = new C16716d(getContext());
        this.f60948K = c16716d;
        c16716d.m89106L().m89028L(-2, -2).m89041Y(AbstractC23222t7.f112562h);
        C21693c c21693c = new C21693c(getContext());
        this.f60949L = c21693c;
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112514B;
        m89106L.m89028L(i11, i11).m89027K(true);
        C21693c c21693c2 = this.f60949L;
        C16716d c16716d2 = null;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("leftArrow");
            c21693c2 = null;
        }
        c21693c2.m89120T0(180);
        C21693c c21693c3 = this.f60949L;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("leftArrow");
            c21693c3 = null;
        }
        c21693c3.m89122U0(180);
        C21693c c21693c4 = this.f60949L;
        if (c21693c4 == null) {
            AbstractC19074t.m100223u("leftArrow");
            c21693c4 = null;
        }
        c21693c4.mo111926w1(AbstractC16803z.ic_chevron_right_line_24_blue);
        C22129e c22129e = new C22129e(getContext(), AbstractC23222t7.f112514B);
        this.f60950M = c22129e;
        C16718f m89027K = c22129e.m89106L().m89027K(true);
        C21693c c21693c5 = this.f60949L;
        if (c21693c5 == null) {
            AbstractC19074t.m100223u("leftArrow");
            c21693c5 = null;
        }
        m89027K.m89054h0(c21693c5).m89034R(AbstractC23222t7.f112552c);
        C16716d c16716d3 = this.f60948K;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("content");
            c16716d3 = null;
        }
        C21693c c21693c6 = this.f60949L;
        if (c21693c6 == null) {
            AbstractC19074t.m100223u("leftArrow");
            c21693c6 = null;
        }
        c16716d3.m89001g1(c21693c6);
        C16716d c16716d4 = this.f60948K;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("content");
            c16716d4 = null;
        }
        C22129e c22129e2 = this.f60950M;
        if (c22129e2 == null) {
            AbstractC19074t.m100223u("avatar");
            c22129e2 = null;
        }
        c16716d4.m89001g1(c22129e2);
        C16716d c16716d5 = this.f60948K;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("content");
        } else {
            c16716d2 = c16716d5;
        }
        mo69681L(c16716d2);
    }

    public BackToLastChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65309W();
    }

    public BackToLastChatView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m65309W();
    }
}
