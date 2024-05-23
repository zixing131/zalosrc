package com.zing.zalo.p077ui.moduleview.message;

import am.C0943w;
import android.content.Context;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.zing.zalo.control.ContactProfile;
import gw.C19637j;
import kd0.C21693c;
import l30.AbstractC22055v0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23268y2;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p132ej.C18450l;
import p132ej.C18451m;
import p266jg.AbstractC21244b;
import p354n3.C23528a;
import p716zh.C31973j5;

/* loaded from: classes6.dex */
public class ProfileSuggestItemModuleView extends TabMsgItemModulesView {

    /* renamed from: K */
    C22129e f64963K;

    /* renamed from: L */
    C21693c f64964L;

    /* renamed from: M */
    C21693c f64965M;

    /* renamed from: N */
    C22126c0 f64966N;

    /* renamed from: O */
    C3977j f64967O;

    /* renamed from: P */
    C23528a f64968P;

    /* renamed from: Q */
    Context f64969Q;

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12431b
    /* renamed from: C */
    public void mo69822C(C18451m c18451m, int i11) {
        boolean z11;
        boolean z12;
        try {
            C18450l c18450l = (C18450l) c18451m;
            int i12 = c18450l.f92990a;
            if (i12 == 1) {
                ContactProfile contactProfile = c18450l.f92992c;
                this.f64963K.m115442z1(AbstractC22055v0.m115112B(contactProfile.f42434r));
                this.f64963K.m115429C1(AbstractC22055v0.m115116F(contactProfile.f42434r, AbstractC21244b.m110054d(this.f64969Q)), AbstractC22055v0.m115115E(contactProfile.f42434r, AbstractC21244b.m110054d(this.f64969Q)));
                this.f64966N.m111959G1(contactProfile.m40383Q(true, false).trim());
                if (!TextUtils.isEmpty(c18450l.f92986i) && !c18450l.f92987j) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (contactProfile.f42338F1 == 1 && !z12) {
                    this.f64964L.mo44614b1(0);
                    this.f64965M.mo44614b1(8);
                } else {
                    this.f64964L.mo44614b1(8);
                    C23528a c23528a = this.f64968P;
                    if (c23528a != null && z12) {
                        AbstractC23268y2.m120033g(c23528a, this.f64967O, this.f64965M, c18450l.f92986i, C23278z2.m120143n(), false);
                        this.f64965M.mo44614b1(0);
                    } else {
                        this.f64965M.mo44614b1(8);
                    }
                }
                this.f64963K.m115433q1(contactProfile);
                return;
            }
            if (i12 == 2) {
                C31973j5 c31973j5 = c18450l.f92989l;
                C31973j5 m4473g = C0943w.m4462l().m4473g(c18450l.f92989l.m153781r());
                if (m4473g != null) {
                    c31973j5 = m4473g;
                }
                this.f64963K.m115429C1(false, false);
                this.f64966N.m111959G1(c31973j5.m153793y());
                this.f64964L.mo44614b1(8);
                if (!TextUtils.isEmpty(c18450l.f92986i) && !c18450l.f92987j) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c31973j5.m153776o0() == 1 && !z11) {
                    if (C19637j.f97466a.m102826G().contains("group_" + c31973j5.m153781r())) {
                        this.f64964L.mo44614b1(0);
                        this.f64965M.mo44614b1(8);
                        this.f64963K.m115437u1(c31973j5);
                    }
                }
                C23528a c23528a2 = this.f64968P;
                if (c23528a2 != null && z11) {
                    AbstractC23268y2.m120033g(c23528a2, this.f64967O, this.f64965M, c18450l.f92986i, C23278z2.m120143n(), false);
                    this.f64965M.mo44614b1(0);
                } else {
                    this.f64965M.mo44614b1(8);
                }
                this.f64963K.m115437u1(c31973j5);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
