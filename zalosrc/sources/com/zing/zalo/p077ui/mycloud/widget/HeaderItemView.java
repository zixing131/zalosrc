package com.zing.zalo.p077ui.mycloud.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.widget.HeaderItemView;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21691a;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;

/* loaded from: classes6.dex */
public final class HeaderItemView extends ModulesView {

    /* renamed from: K */
    private C22126c0 f65889K;

    /* renamed from: L */
    private C21691a f65890L;

    /* renamed from: M */
    private Drawable f65891M;

    /* renamed from: N */
    private Drawable f65892N;

    /* renamed from: O */
    private boolean f65893O;

    /* renamed from: P */
    private MyCloudItem f65894P;

    /* renamed from: Q */
    private InterfaceC27158o2 f65895Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderItemView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m71071a0();
    }

    /* renamed from: W */
    private final void m71069W() {
        boolean z11;
        m88985S(this.f65890L);
        if (this.f65891M == null) {
            this.f65891M = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
        }
        if (this.f65892N == null) {
            this.f65892N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.btn_radio_on_holo_light);
        }
        C21691a c21691a = new C21691a(getContext());
        C16718f m89017A = c21691a.m89106L().m89060k0(AbstractC23222t7.f112514B).m89030N(AbstractC23222t7.f112514B).m89017A(Boolean.TRUE);
        C22126c0 c22126c0 = this.f65889K;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("textModule");
            c22126c0 = null;
        }
        m89017A.m89070w(c22126c0).m89035S(AbstractC23222t7.f112566j);
        c21691a.m111906k1(this.f65891M);
        c21691a.m111905j1(this.f65892N);
        c21691a.mo89107L0(new C16719g.b() { // from class: d90.a
            public /* synthetic */ C17840a() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.b
            /* renamed from: a */
            public final void mo945a(C16719g c16719g, boolean z12) {
                HeaderItemView.m71070X(HeaderItemView.this, c16719g, z12);
            }
        });
        MyCloudItem myCloudItem = this.f65894P;
        if (myCloudItem != null) {
            z11 = myCloudItem.m71022f();
        } else {
            z11 = false;
        }
        c21691a.mo89091D0(z11);
        mo69681L(c21691a);
        this.f65890L = c21691a;
    }

    /* renamed from: X */
    public static final void m71070X(HeaderItemView headerItemView, C16719g c16719g, boolean z11) {
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(headerItemView, "this$0");
        MyCloudItem myCloudItem = headerItemView.f65894P;
        if (myCloudItem != null) {
            if ((myCloudItem == null || z11 != myCloudItem.m71022f()) && (interfaceC27158o2 = headerItemView.f65895Q) != null) {
                interfaceC27158o2.mo70519b(myCloudItem, z11);
            }
        }
    }

    /* renamed from: a0 */
    private final void m71071a0() {
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2).m89048d0(AbstractC23222t7.f112564i).m89044a0(AbstractC23222t7.f112584s);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xsmall_m));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor1));
        this.f65889K = c22126c0;
        mo69681L(c22126c0);
    }

    /* renamed from: Y */
    public final void m71072Y(MyCloudItem myCloudItem, boolean z11) {
        this.f65894P = myCloudItem;
        C22126c0 c22126c0 = this.f65889K;
        CharSequence charSequence = null;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("textModule");
            c22126c0 = null;
        }
        if (myCloudItem != null) {
            charSequence = myCloudItem.m71019a();
        }
        c22126c0.m111959G1(String.valueOf(charSequence));
        this.f65893O = z11;
        if (z11) {
            m71069W();
        } else {
            m88985S(this.f65890L);
        }
    }

    public final MyCloudItem getData() {
        return this.f65894P;
    }

    public final boolean getEnableMultiSelect() {
        return this.f65893O;
    }

    public final InterfaceC27158o2 getSelectEventListener() {
        return this.f65895Q;
    }

    public final void setCheckBoModuleState(boolean z11) {
        C21691a c21691a = this.f65890L;
        if (c21691a != null) {
            c21691a.mo89091D0(z11);
        }
    }

    public final void setData(MyCloudItem myCloudItem) {
        this.f65894P = myCloudItem;
    }

    public final void setEnableMultiSelect(boolean z11) {
        this.f65893O = z11;
    }

    public final void setSelectEventListener(InterfaceC27158o2 interfaceC27158o2) {
        this.f65895Q = interfaceC27158o2;
    }
}
