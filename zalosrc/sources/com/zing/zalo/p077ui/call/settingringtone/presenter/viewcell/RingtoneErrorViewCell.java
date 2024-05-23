package com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import n50.InterfaceC23568b;
import p262jb.AbstractC21196a;

/* loaded from: classes5.dex */
public final class RingtoneErrorViewCell extends ModulesView {

    /* renamed from: K */
    private C22126c0 f56563K;

    /* renamed from: L */
    private C22126c0 f56564L;

    /* renamed from: M */
    private InterfaceC23568b f56565M;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RingtoneErrorViewCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public final InterfaceC23568b getListener() {
        return this.f56565M;
    }

    public final void setListener(InterfaceC23568b interfaceC23568b) {
        this.f56565M = interfaceC23568b;
    }

    public /* synthetic */ RingtoneErrorViewCell(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingtoneErrorViewCell(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f56563K = new C22126c0(context);
        this.f56564L = new C22126c0(context);
        try {
            C22126c0 c22126c0 = this.f56563K;
            c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85295f2));
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_general_error));
            this.f56563K.m89106L().m89030N(-2).m89026J(true).m89018B(Boolean.TRUE).m89036T(AbstractC23136l9.m118742r(24.0f));
            this.f56564L.m89106L().m89023G(this.f56563K).m89027K(true).m89036T(AbstractC23136l9.m118742r(12.0f));
            AbstractC23022b5.m118023a(this.f56564L, AbstractC8915g0.btnType2_medium);
            mo69681L(this.f56563K);
            mo69681L(this.f56564L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
