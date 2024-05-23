package com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.AbstractC11208a;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.SystemRingtoneViewCell;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import dg0.AbstractC17927b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kd0.C21692b;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import n50.InterfaceC23568b;
import p262jb.AbstractC21196a;

/* loaded from: classes5.dex */
public final class SystemRingtoneViewCell extends ModulesView {

    /* renamed from: K */
    private C22126c0 f56578K;

    /* renamed from: L */
    private C22122a0 f56579L;

    /* renamed from: M */
    private C21692b f56580M;

    /* renamed from: N */
    private InterfaceC23568b f56581N;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SystemRingtoneViewCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m59011Y(final SystemRingtoneViewCell systemRingtoneViewCell, final AbstractC11208a.b bVar, View view) {
        AbstractC19074t.m100208f(systemRingtoneViewCell, "this$0");
        AbstractC19074t.m100208f(bVar, "$data");
        AbstractC17927b.Companion.m94536b().mo94530d("DEBOUNCE_PREVIEW_RINGTONE", new Runnable() { // from class: s50.l
            @Override // java.lang.Runnable
            public final void run() {
                SystemRingtoneViewCell.m59012a0(SystemRingtoneViewCell.this, bVar);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m59012a0(SystemRingtoneViewCell systemRingtoneViewCell, AbstractC11208a.b bVar) {
        AbstractC19074t.m100208f(systemRingtoneViewCell, "this$0");
        AbstractC19074t.m100208f(bVar, "$data");
        InterfaceC23568b interfaceC23568b = systemRingtoneViewCell.f56581N;
        if (interfaceC23568b != null) {
            interfaceC23568b.mo58771i5(new RingtoneData.C11207d(bVar));
        }
    }

    /* renamed from: X */
    public final void m59013X(final AbstractC11208a.b bVar) {
        int i11;
        AbstractC19074t.m100208f(bVar, "data");
        this.f56578K.m111959G1(bVar.m58745a());
        C22122a0 c22122a0 = this.f56579L;
        int i12 = 8;
        if (bVar.m58748d()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c22122a0.mo44614b1(i11);
        C21692b c21692b = this.f56580M;
        if (bVar.m58749e()) {
            i12 = 0;
        }
        c21692b.mo44614b1(i12);
        setSelected(bVar.m58748d());
        setOnClickListener(new View.OnClickListener() { // from class: s50.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SystemRingtoneViewCell.m59011Y(SystemRingtoneViewCell.this, bVar, view);
            }
        });
    }

    public final InterfaceC23568b getListener() {
        return this.f56581N;
    }

    public final void setListener(InterfaceC23568b interfaceC23568b) {
        this.f56581N = interfaceC23568b;
    }

    public /* synthetic */ SystemRingtoneViewCell(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemRingtoneViewCell(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f56578K = new C22126c0(context);
        this.f56579L = new C22122a0(context);
        this.f56580M = new C21692b(context);
        try {
            C22126c0 c22126c0 = this.f56578K;
            c22126c0.m111957E1(true);
            c22126c0.m111980v1(TextUtils.TruncateAt.END);
            c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85296f3));
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f56579L.mo111926w1(AbstractC16803z.ic_call_ringtone_selected);
            this.f56580M.m111908h1(AbstractC23136l9.m118665N(context, AbstractC16803z.setting_ringtone_drawable));
            C16718f m89027K = this.f56578K.m89106L().m89030N(-2).m89027K(true);
            Boolean bool = Boolean.TRUE;
            m89027K.m89073z(bool).m89049e0(this.f56579L).m89032P(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(12.0f));
            this.f56579L.m89106L().m89060k0(AbstractC23136l9.m118742r(24.0f)).m89030N(AbstractC23136l9.m118742r(24.0f)).m89027K(true).m89035S(AbstractC23136l9.m118742r(12.0f)).m89049e0(this.f56580M).m89029M(15);
            this.f56579L.mo44614b1(8);
            this.f56580M.m89106L().m89060k0(AbstractC23136l9.m118742r(20.0f)).m89030N(AbstractC23136l9.m118742r(20.0f)).m89017A(bool).m89027K(true).m89035S(AbstractC23136l9.m118742r(16.0f)).m89029M(15);
            this.f56580M.mo44614b1(8);
            mo69681L(this.f56580M);
            mo69681L(this.f56579L);
            mo69681L(this.f56578K);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_ringtone_selected_selector));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
