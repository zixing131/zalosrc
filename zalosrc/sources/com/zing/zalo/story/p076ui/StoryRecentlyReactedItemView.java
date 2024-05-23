package com.zing.zalo.story.p076ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import fn0.AbstractC19074t;
import java.util.List;
import kd0.C21693c;
import kd0.C21697g;
import l30.AbstractC22047r0;
import l30.C22037m0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p304ks.AbstractC21935u;
import p716zh.C31844ab;
import qm0.AbstractC25332a0;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;

/* loaded from: classes5.dex */
public final class StoryRecentlyReactedItemView extends ModulesView {

    /* renamed from: K */
    private C16971e f55121K;

    /* renamed from: L */
    private C21693c f55122L;

    /* renamed from: M */
    private C21697g f55123M;

    public StoryRecentlyReactedItemView(Context context) {
        this(context, null);
    }

    /* renamed from: W */
    private final void m56594W() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16971e c16971e = new C16971e(context, EnumC16949e.SIZE_24);
        this.f55121K = c16971e;
        C16718f m89106L = c16971e.m89106L();
        int i11 = AbstractC23222t7.f112514B;
        m89106L.m89028L(i11, i11).m89073z(Boolean.TRUE).m89027K(true);
        C16971e c16971e2 = this.f55121K;
        C21697g c21697g = null;
        if (c16971e2 == null) {
            AbstractC19074t.m100223u("avatar");
            c16971e2 = null;
        }
        mo69681L(c16971e2);
        C21693c c21693c = new C21693c(getContext());
        this.f55122L = c21693c;
        C16718f m89106L2 = c21693c.m89106L();
        int i12 = AbstractC23222t7.f112576o;
        C16718f m89028L = m89106L2.m89028L(i12, i12);
        C16971e c16971e3 = this.f55121K;
        if (c16971e3 == null) {
            AbstractC19074t.m100223u("avatar");
            c16971e3 = null;
        }
        C16718f m89019C = m89028L.m89019C(c16971e3);
        C16971e c16971e4 = this.f55121K;
        if (c16971e4 == null) {
            AbstractC19074t.m100223u("avatar");
            c16971e4 = null;
        }
        m89019C.m89067t(c16971e4);
        C21693c c21693c2 = this.f55122L;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("reaction");
            c21693c2 = null;
        }
        c21693c2.m111929z1(5);
        C21693c c21693c3 = this.f55122L;
        if (c21693c3 == null) {
            AbstractC19074t.m100223u("reaction");
            c21693c3 = null;
        }
        mo69681L(c21693c3);
        C21697g c21697g2 = new C21697g(getContext());
        this.f55123M = c21697g2;
        C16718f m89027K = c21697g2.m89106L().m89028L(-2, -2).m89027K(true);
        C16971e c16971e5 = this.f55121K;
        if (c16971e5 == null) {
            AbstractC19074t.m100223u("avatar");
            c16971e5 = null;
        }
        m89027K.m89054h0(c16971e5).m89034R(AbstractC23222t7.f112566j);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C26703b m137293a = C26705d.m137293a(context2, AbstractC2814h.t_normal);
        C21697g c21697g3 = this.f55123M;
        if (c21697g3 == null) {
            AbstractC19074t.m100223u("tvUserName");
            c21697g3 = null;
        }
        new C26707f(c21697g3).m137318a(m137293a);
        C21697g c21697g4 = this.f55123M;
        if (c21697g4 == null) {
            AbstractC19074t.m100223u("tvUserName");
            c21697g4 = null;
        }
        c21697g4.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white));
        C21697g c21697g5 = this.f55123M;
        if (c21697g5 == null) {
            AbstractC19074t.m100223u("tvUserName");
            c21697g5 = null;
        }
        c21697g5.m111953A1(1);
        C21697g c21697g6 = this.f55123M;
        if (c21697g6 == null) {
            AbstractC19074t.m100223u("tvUserName");
            c21697g6 = null;
        }
        c21697g6.m111980v1(TextUtils.TruncateAt.END);
        C21697g c21697g7 = this.f55123M;
        if (c21697g7 == null) {
            AbstractC19074t.m100223u("tvUserName");
        } else {
            c21697g = c21697g7;
        }
        mo69681L(c21697g);
    }

    /* renamed from: V */
    public final void m56595V(C31844ab c31844ab) {
        List list;
        Object m131205e0;
        if (c31844ab == null) {
            setVisibility(8);
            return;
        }
        C16971e c16971e = this.f55121K;
        C21697g c21697g = null;
        if (c16971e == null) {
            AbstractC19074t.m100223u("avatar");
            c16971e = null;
        }
        String str = c31844ab.f146163b;
        AbstractC19074t.m100207e(str, "avt");
        c16971e.m90886N1(str);
        if (C22037m0.f108553a.m115034h() && (list = c31844ab.f146166e) != null && (!list.isEmpty())) {
            C21693c c21693c = this.f55122L;
            if (c21693c == null) {
                AbstractC19074t.m100223u("reaction");
                c21693c = null;
            }
            List list2 = c31844ab.f146166e;
            AbstractC19074t.m100207e(list2, "reactionList");
            m131205e0 = AbstractC25332a0.m131205e0(list2);
            AbstractC19074t.m100207e(m131205e0, "first(...)");
            AbstractC22047r0.m115048f(c21693c, (String) m131205e0, 12);
        } else {
            C21693c c21693c2 = this.f55122L;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("reaction");
                c21693c2 = null;
            }
            c21693c2.mo44614b1(8);
        }
        C21697g c21697g2 = this.f55123M;
        if (c21697g2 == null) {
            AbstractC19074t.m100223u("tvUserName");
        } else {
            c21697g = c21697g2;
        }
        c21697g.m111959G1(AbstractC21935u.m114542i(c31844ab.f146162a, c31844ab.f146164c));
    }

    public StoryRecentlyReactedItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m56594W();
    }
}
