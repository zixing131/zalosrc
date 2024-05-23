package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import bi0.AbstractC2814h;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19074t;
import ii0.C20562c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import ri0.C25808b;

/* renamed from: com.zing.zalo.zdesign.component.e0 */
/* loaded from: classes7.dex */
public final class C16972e0 extends KeyEventCallbackC17462c implements InterfaceC16976f1 {

    /* renamed from: I */
    private C20562c f86744I;

    /* renamed from: J */
    private C25808b f86745J;

    /* renamed from: com.zing.zalo.zdesign.component.e0$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        private final C20562c.a f86746a;

        public a(Context context) {
            AbstractC19074t.m100208f(context, "context");
            this.f86746a = new C20562c.a(context);
        }

        /* renamed from: A */
        public final a m90917A(int i11) {
            C20562c.a aVar = this.f86746a;
            aVar.m106949L(aVar.m106959j().getText(i11));
            return this;
        }

        /* renamed from: B */
        public final a m90918B(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "title");
            this.f86746a.m106949L(charSequence);
            return this;
        }

        /* renamed from: C */
        public final a m90919C(Drawable drawable) {
            this.f86746a.m106950M(drawable);
            return this;
        }

        /* renamed from: D */
        public final a m90920D(View view) {
            this.f86746a.m106951N(view);
            return this;
        }

        /* renamed from: E */
        public final a m90921E(boolean z11) {
            this.f86746a.m106952O(z11);
            return this;
        }

        /* renamed from: F */
        public final a m90922F(boolean z11) {
            this.f86746a.m106953P(z11);
            return this;
        }

        /* renamed from: G */
        public final C16972e0 m90923G() {
            C16972e0 m90927d = m90927d();
            m90927d.mo13822K();
            return m90927d;
        }

        /* renamed from: a */
        public final a m90924a(CheckBox checkBox) {
            AbstractC19074t.m100208f(checkBox, "checkBox");
            this.f86746a.m106956g().add(checkBox);
            return this;
        }

        /* renamed from: b */
        public final a m90925b(CharSequence charSequence, Drawable drawable) {
            AbstractC19074t.m100208f(charSequence, "des");
            HashMap hashMap = new HashMap();
            hashMap.put(charSequence, drawable);
            this.f86746a.m106955f().add(hashMap);
            return this;
        }

        /* renamed from: c */
        public final a m90926c(TextField textField) {
            AbstractC19074t.m100208f(textField, "textField");
            this.f86746a.m106956g().add(textField);
            return this;
        }

        /* renamed from: d */
        public final C16972e0 m90927d() {
            C16972e0 c16972e0 = new C16972e0(this.f86746a.m106959j());
            String m106963n = this.f86746a.m106963n();
            if (m106963n != null && m106963n.length() != 0) {
                String m106963n2 = this.f86746a.m106963n();
                AbstractC19074t.m100205c(m106963n2);
                c16972e0.setIdTracking(m106963n2);
                c16972e0.setTrackingExtraData(this.f86746a.m106962m());
            }
            this.f86746a.m106954a(c16972e0.m90916M());
            c16972e0.m92873y(this.f86746a.m106958i());
            c16972e0.m92874z(this.f86746a.m106957h());
            c16972e0.m92854E(this.f86746a.m106960k());
            if (this.f86746a.m106961l() != null) {
                c16972e0.m92856G(this.f86746a.m106961l());
            }
            return c16972e0;
        }

        /* renamed from: e */
        public final a m90928e(boolean z11) {
            this.f86746a.m106965p(z11);
            return this;
        }

        /* renamed from: f */
        public final a m90929f(View view) {
            this.f86746a.m106964o(view);
            return this;
        }

        /* renamed from: g */
        public final a m90930g(C0708i c0708i) {
            this.f86746a.m106940C(c0708i);
            return this;
        }

        /* renamed from: h */
        public final a m90931h(String str) {
            AbstractC19074t.m100208f(str, "trackingId");
            this.f86746a.m106941D(str);
            return this;
        }

        /* renamed from: i */
        public final a m90932i(b bVar) {
            AbstractC19074t.m100208f(bVar, "modalType");
            this.f86746a.m106966q(bVar);
            return this;
        }

        /* renamed from: j */
        public final a m90933j(int i11, InterfaceC17463d.d dVar) {
            AbstractC19074t.m100208f(dVar, "listener");
            C20562c.a aVar = this.f86746a;
            aVar.m106969t(aVar.m106959j().getText(i11));
            this.f86746a.m106967r(dVar);
            return this;
        }

        /* renamed from: k */
        public final a m90934k(CharSequence charSequence, InterfaceC17463d.d dVar) {
            AbstractC19074t.m100208f(charSequence, "text");
            AbstractC19074t.m100208f(dVar, "listener");
            this.f86746a.m106969t(charSequence);
            this.f86746a.m106967r(dVar);
            return this;
        }

        /* renamed from: l */
        public final a m90935l(int i11) {
            this.f86746a.m106968s(i11);
            return this;
        }

        /* renamed from: m */
        public final a m90936m(C0708i c0708i) {
            this.f86746a.m106942E(c0708i);
            return this;
        }

        /* renamed from: n */
        public final a m90937n(String str) {
            AbstractC19074t.m100208f(str, "trackingId");
            this.f86746a.m106943F(str);
            return this;
        }

        /* renamed from: o */
        public final a m90938o(int i11, InterfaceC17463d.d dVar) {
            AbstractC19074t.m100208f(dVar, "listener");
            C20562c.a aVar = this.f86746a;
            aVar.m106972w(aVar.m106959j().getText(i11));
            this.f86746a.m106970u(dVar);
            return this;
        }

        /* renamed from: p */
        public final a m90939p(CharSequence charSequence, InterfaceC17463d.d dVar) {
            AbstractC19074t.m100208f(charSequence, "text");
            AbstractC19074t.m100208f(dVar, "listener");
            this.f86746a.m106972w(charSequence);
            this.f86746a.m106970u(dVar);
            return this;
        }

        /* renamed from: q */
        public final a m90940q(int i11) {
            this.f86746a.m106971v(i11);
            return this;
        }

        /* renamed from: r */
        public final a m90941r(String str) {
            AbstractC19074t.m100208f(str, "trackingId");
            this.f86746a.m106944G(str);
            return this;
        }

        /* renamed from: s */
        public final a m90942s(int i11, InterfaceC17463d.d dVar) {
            AbstractC19074t.m100208f(dVar, "listener");
            C20562c.a aVar = this.f86746a;
            aVar.m106939B(aVar.m106959j().getText(i11));
            this.f86746a.m106975z(dVar);
            return this;
        }

        /* renamed from: t */
        public final a m90943t(CharSequence charSequence, InterfaceC17463d.d dVar) {
            AbstractC19074t.m100208f(charSequence, "text");
            AbstractC19074t.m100208f(dVar, "listener");
            this.f86746a.m106939B(charSequence);
            this.f86746a.m106975z(dVar);
            return this;
        }

        /* renamed from: u */
        public final a m90944u(Drawable drawable, EnumC17020n enumC17020n) {
            this.f86746a.m106973x(drawable);
            C20562c.a aVar = this.f86746a;
            if (enumC17020n == null) {
                enumC17020n = EnumC17020n.LEADING;
            }
            aVar.m106974y(enumC17020n);
            return this;
        }

        /* renamed from: v */
        public final a m90945v(int i11) {
            this.f86746a.m106938A(i11);
            return this;
        }

        /* renamed from: w */
        public final a m90946w(C0708i c0708i) {
            this.f86746a.m106945H(c0708i);
            return this;
        }

        /* renamed from: x */
        public final a m90947x(String str) {
            AbstractC19074t.m100208f(str, "trackingId");
            this.f86746a.m106946I(str);
            return this;
        }

        /* renamed from: y */
        public final a m90948y(float f11) {
            this.f86746a.m106947J(f11);
            return this;
        }

        /* renamed from: z */
        public final a m90949z(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
            this.f86746a.m106948K(charSequence);
            return this;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.e0$b */
    /* loaded from: classes7.dex */
    public enum b {
        DIALOG_INFORMATION,
        DIALOG_PROMOTION,
        POPUP,
        CUSTOM_HUG_CONTENT,
        CUSTOM_FIX_HEIGHT
    }

    public C16972e0(Context context) {
        this(context, AbstractC2814h.ZDSModalTheme);
    }

    /* renamed from: L */
    public final ButtonWithProgress m90915L(int i11) {
        return this.f86744I.m106920I(i11);
    }

    /* renamed from: M */
    public final C20562c m90916M() {
        return this.f86744I;
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (this.f86744I.m106922L(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (this.f86744I.m106923M(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        this.f86744I.m106921J();
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        if (this.f86745J == null) {
            this.f86745J = new C25808b(new WeakReference(m92867k().m92904k()));
        }
        C25808b c25808b = this.f86745J;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        if (this.f86745J == null) {
            this.f86745J = new C25808b(new WeakReference(m92867k().m92904k()));
        }
        C25808b c25808b = this.f86745J;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    public C16972e0(Context context, int i11) {
        super(context, i11);
        this.f86744I = new C20562c(context, this, m92867k());
    }
}
