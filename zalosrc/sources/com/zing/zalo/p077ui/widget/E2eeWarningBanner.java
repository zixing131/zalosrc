package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22126c0;
import ld0.C22448a;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class E2eeWarningBanner extends ModulesView {

    /* renamed from: K */
    private C16716d f69200K;

    /* renamed from: L */
    private C21693c f69201L;

    /* renamed from: M */
    private C22126c0 f69202M;

    /* renamed from: N */
    private C21693c f69203N;

    /* renamed from: O */
    private C16719g f69204O;

    /* renamed from: P */
    private int f69205P;

    /* renamed from: Q */
    private InterfaceC13496a f69206Q;

    /* renamed from: com.zing.zalo.ui.widget.E2eeWarningBanner$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13496a {
        /* renamed from: a */
        void mo60360a();

        /* renamed from: b */
        void mo60361b();
    }

    /* renamed from: com.zing.zalo.ui.widget.E2eeWarningBanner$b */
    /* loaded from: classes6.dex */
    public static final class C13497b extends ClickableSpan {
        C13497b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "p0");
            InterfaceC13496a e2eeBannerListener = E2eeWarningBanner.this.getE2eeBannerListener();
            if (e2eeBannerListener != null) {
                e2eeBannerListener.mo60360a();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(E2eeWarningBanner.this.getContext(), AbstractC16781w.LinkColor));
            textPaint.setUnderlineText(false);
        }
    }

    public E2eeWarningBanner(Context context) {
        super(context);
        setClickable(true);
        C16716d c16716d = new C16716d(context);
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -2);
        m89028L.f84728x = AbstractC23136l9.m118742r(60.0f);
        m89028L.m89041Y(AbstractC23136l9.m118742r(8.0f));
        this.f69200K = c16716d;
        C21693c c21693c = new C21693c(context);
        C16718f m89034R = c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f)).m89034R(AbstractC23136l9.m118742r(16.0f));
        Boolean bool = Boolean.TRUE;
        m89034R.m89017A(bool).m89027K(true);
        c21693c.m111929z1(6);
        AbstractC19074t.m100205c(context);
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_16, AbstractC2807a.icon_01));
        setClickable(true);
        this.f69201L = c21693c;
        c21693c.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.widget.a0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                E2eeWarningBanner.m75687W(E2eeWarningBanner.this, c16719g);
            }
        });
        C21693c c21693c2 = new C21693c(context);
        c21693c2.m89106L().m89028L(-2, -2).m89034R(AbstractC23136l9.m118742r(8.0f)).m89027K(true).m89073z(bool);
        c21693c2.mo111926w1(AbstractC16803z.ic_zds_lock_e2ee);
        this.f69203N = c21693c2;
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89028L(-1, -2).m89029M(1).m89027K(true).m89073z(bool).m89054h0(this.f69203N).m89049e0(this.f69201L).m89034R(AbstractC23136l9.m118742r(8.0f));
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f69202M = c22126c0;
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_banner_upgrade_status));
        this.f69203N.mo111926w1(AbstractC16803z.ic_zds_lock_e2ee);
        this.f69200K.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
        this.f69200K.m89001g1(this.f69203N);
        this.f69200K.m89001g1(this.f69201L);
        this.f69200K.m89001g1(this.f69202M);
        C16719g m118027e = AbstractC23022b5.m118027e(context);
        AbstractC19074t.m100207e(m118027e, "getSeparateLine(...)");
        this.f69204O = m118027e;
        m118027e.m89106L().m89023G(this.f69200K);
        mo69681L(this.f69200K);
        mo69681L(this.f69204O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final void m75687W(E2eeWarningBanner e2eeWarningBanner, C16719g c16719g) {
        AbstractC19074t.m100208f(e2eeWarningBanner, "this$0");
        InterfaceC13496a interfaceC13496a = e2eeWarningBanner.f69206Q;
        if (interfaceC13496a != null) {
            interfaceC13496a.mo60361b();
        }
    }

    /* renamed from: X */
    public final void m75688X(int i11) {
        if (this.f69205P != i11) {
            this.f69205P = i11;
            this.f69200K.mo44614b1(0);
            int i12 = this.f69205P;
            if (i12 != 0) {
                if (i12 != 2) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_banner_retry_warning);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_try_again_button);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    SpannableString spannableString = new SpannableString(m118743r0 + " " + m118743r02);
                    spannableString.setSpan(new C13497b(), m118743r0.length() + 1, m118743r0.length() + m118743r02.length() + 1, 33);
                    this.f69202M.m111959G1(spannableString);
                    this.f69202M.m111955C1(new C22448a());
                    this.f69203N.mo111926w1(AbstractC16803z.ic_e2ee_error_banner);
                    this.f69200K.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.transfer_banner_error));
                    return;
                }
                this.f69202M.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_banner_old_version_warning));
                this.f69203N.mo111926w1(AbstractC16803z.ic_e2ee_error_banner);
                this.f69200K.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.transfer_banner_error));
                return;
            }
            this.f69202M.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_banner_upgrade_status));
            this.f69203N.mo111926w1(AbstractC16803z.ic_zds_lock_e2ee);
            this.f69200K.mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.PopupBackgroundColor));
        }
    }

    public final int getCurrentState() {
        return this.f69205P;
    }

    public final InterfaceC13496a getE2eeBannerListener() {
        return this.f69206Q;
    }

    public final void setCurrentState(int i11) {
        this.f69205P = i11;
    }

    public final void setE2eeBannerListener(InterfaceC13496a interfaceC13496a) {
        this.f69206Q = interfaceC13496a;
    }
}
