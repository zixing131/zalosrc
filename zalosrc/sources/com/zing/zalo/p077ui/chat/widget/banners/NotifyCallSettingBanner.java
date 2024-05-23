package com.zing.zalo.p077ui.chat.widget.banners;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import sy.AbstractC26423o;

/* loaded from: classes5.dex */
public final class NotifyCallSettingBanner extends ModulesView {
    public static final C11733a Companion = new C11733a(null);

    /* renamed from: K */
    public C16716d f60980K;

    /* renamed from: L */
    public C22126c0 f60981L;

    /* renamed from: M */
    public C22126c0 f60982M;

    /* renamed from: N */
    public C21693c f60983N;

    /* renamed from: O */
    private C16719g f60984O;

    /* renamed from: P */
    private int f60985P;

    /* renamed from: com.zing.zalo.ui.chat.widget.banners.NotifyCallSettingBanner$a */
    /* loaded from: classes5.dex */
    public static final class C11733a {
        private C11733a() {
        }

        public /* synthetic */ C11733a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyCallSettingBanner(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f60980K = c16716d;
        c16716d.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
        this.f60980K.m89106L().m89028L(-1, -2).m89039W(AbstractC23136l9.m118742r(48.0f)).m89042Z(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(4.0f));
        C21693c c21693c = new C21693c(context);
        this.f60983N = c21693c;
        c21693c.mo111926w1(AbstractC16803z.ic_call_notify_banner_close);
        C16718f m89046b0 = this.f60983N.m89106L().m89028L(-2, -2).m89046b0(AbstractC23136l9.m118742r(6.0f));
        Boolean bool = Boolean.TRUE;
        m89046b0.m89017A(bool).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f60982M = c22126c0;
        c22126c0.m111958F1(AbstractC8020f0.btn_disable_mute);
        AbstractC23022b5.m118023a(this.f60982M, AbstractC8915g0.btnType2_medium);
        this.f60982M.m89106L().m89046b0(AbstractC23136l9.m118742r(14.0f)).m89047c0(AbstractC23136l9.m118742r(14.0f)).m89034R(AbstractC23136l9.m118742r(2.0f)).m89049e0(this.f60983N).m89027K(true).m89029M(15);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f60981L = c22126c02;
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f60981L.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f60981L.m89106L().m89028L(-1, -2).m89073z(bool).m89027K(true).m89049e0(this.f60982M).m89029M(12).m89035S(AbstractC23136l9.m118742r(8.0f));
        this.f60980K.m89001g1(this.f60983N);
        this.f60980K.m89001g1(this.f60982M);
        this.f60980K.m89001g1(this.f60981L);
        C16719g m118027e = AbstractC23022b5.m118027e(context);
        AbstractC19074t.m100207e(m118027e, "getSeparateLine(...)");
        this.f60984O = m118027e;
        m118027e.m89106L().m89023G(this.f60980K);
        mo69681L(this.f60980K);
        mo69681L(this.f60984O);
    }

    /* renamed from: V */
    private final void m65345V(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                this.f60981L.m111958F1(AbstractC8020f0.str_call_notif_off_banner_csc);
                AbstractC26423o.m136268b(this.f60983N);
                this.f60982M.m111958F1(AbstractC8020f0.str_banner_notify_cta_unmute);
                return;
            }
            return;
        }
        this.f60981L.m111958F1(AbstractC8020f0.str_call_setting_notif_mute_suggest_banner);
        AbstractC26423o.m136270d(this.f60983N);
        this.f60982M.m111958F1(AbstractC8020f0.str_call_setting_notif_mute_suggest_cta);
    }

    public final C16719g getBottomLine() {
        return this.f60984O;
    }

    public final int getType() {
        return this.f60985P;
    }

    public final void setBottomLine(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "<set-?>");
        this.f60984O = c16719g;
    }

    public final void setType(int i11) {
        m65345V(i11);
    }
}
