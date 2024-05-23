package com.zing.zalo.feed.components;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.AbstractC17466e;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import ti0.C26705d;
import ti0.C26707f;
import vl0.AbstractC28291a;

/* loaded from: classes4.dex */
public class FeedItemCommentInputBarModulesView extends ModulesView implements View.OnClickListener, C16719g.c {

    /* renamed from: K */
    C23528a f44364K;

    /* renamed from: L */
    boolean f44365L;

    /* renamed from: M */
    InterfaceC8087a f44366M;

    /* renamed from: N */
    C16716d f44367N;

    /* renamed from: O */
    C16716d f44368O;

    /* renamed from: P */
    C22126c0 f44369P;

    /* renamed from: Q */
    C16719g f44370Q;

    /* renamed from: com.zing.zalo.feed.components.FeedItemCommentInputBarModulesView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8087a {
        /* renamed from: a */
        void mo43730a(View view, Bundle bundle);
    }

    public FeedItemCommentInputBarModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43728V(context);
    }

    /* renamed from: V */
    private void m43728V(Context context) {
        this.f44364K = new C23528a(context);
        this.f44365L = AbstractC23309i.m122155m2();
    }

    /* renamed from: W */
    public void m43729W(Context context) {
        try {
            this.f44367N = new C16716d(context);
            this.f44368O = new C16716d(context);
            this.f44369P = new C22126c0(context);
            this.f44370Q = new C16719g(context);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.white));
            this.f44367N.m89106L().m89060k0(-1).m89030N(-2).m89044a0(AbstractC23136l9.m118655I(AbstractC16802y.comment_input_bar_vertical_padding));
            AbstractC23136l9.m118655I(AbstractC16802y.avt_XS);
            this.f44368O.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118655I(AbstractC16802y.feed_comment_input_box_height));
            this.f44368O.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_rounded_border_comment));
            C16718f m89030N = this.f44369P.m89106L().m89060k0(-1).m89030N(-1);
            Boolean bool = Boolean.TRUE;
            m89030N.m89073z(bool).m89029M(12).m89034R(AbstractC23222t7.f112586t).m89027K(true);
            this.f44369P.m89101I0(4);
            this.f44369P.m111953A1(1);
            this.f44369P.m111980v1(TextUtils.TruncateAt.END);
            this.f44369P.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_default_text));
            new C26707f(this.f44369P).m137318a(C26705d.m137293a(context, AbstractC2814h.t_small));
            this.f44369P.m111962J1(C23212s8.m119607o(context, AbstractC28291a.text_tertiary));
            this.f44370Q.m89106L().m89060k0(-1).m89030N(1).m89072y(bool).m89023G(this.f44367N);
            this.f44370Q.m89085A0(C23212s8.m119609q(context, AbstractC16781w.ItemSeparatorColor));
            setOnClickListener(this);
            this.f44369P.mo89109M0(this);
            this.f44368O.m89001g1(this.f44369P);
            this.f44367N.m89001g1(this.f44368O);
            mo69681L(this.f44367N);
            mo69681L(this.f44370Q);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC8087a interfaceC8087a = this.f44366M;
        if (interfaceC8087a != null) {
            interfaceC8087a.mo43730a(view, null);
        }
    }

    public void setOnCommentInputBarClickListener(InterfaceC8087a interfaceC8087a) {
        this.f44366M = interfaceC8087a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo929y(C16719g c16719g) {
        Bundle bundle;
        InterfaceC8087a interfaceC8087a;
        int m89102J = c16719g.m89102J();
        if (m89102J != 1) {
            if (m89102J != 2) {
                if (m89102J != 3) {
                    if (m89102J == 4) {
                        bundle = new Bundle();
                        bundle.putInt("extra_action_request", 24);
                        AbstractC23647d.m123897g("49160003");
                    }
                } else {
                    bundle = new Bundle();
                    bundle.putInt("extra_action_request", 25);
                    AbstractC23647d.m123897g("49160001");
                }
            } else {
                bundle = new Bundle();
                bundle.putInt("extra_action_request", 26);
                AbstractC23647d.m123897g("49160002");
            }
            interfaceC8087a = this.f44366M;
            if (interfaceC8087a == null) {
                interfaceC8087a.mo43730a(this, bundle);
                return;
            }
            return;
        }
        AbstractC23647d.m123897g("49160004");
        bundle = null;
        interfaceC8087a = this.f44366M;
        if (interfaceC8087a == null) {
        }
    }
}
