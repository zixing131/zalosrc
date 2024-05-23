package com.zing.zalo.p077ui.moduleview.group;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.group.GroupLabelWithActionModuleView;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import l80.C22124b0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p716zh.C32020m7;
import rs.C25976a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class GroupLabelWithActionModuleView extends MsgItemInfoModulesView {

    /* renamed from: K */
    C22126c0 f64768K;

    /* renamed from: L */
    C22124b0 f64769L;

    /* renamed from: M */
    C25976a.a f64770M;

    /* renamed from: N */
    C16719g f64771N;

    public GroupLabelWithActionModuleView(Context context, C25976a.a aVar) {
        super(context);
        m88987U(-1, -2);
        this.f64770M = aVar;
        C16719g c16719g = new C16719g(context);
        this.f64771N = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
        this.f64771N.m89106L().m89028L(-1, AbstractC23222t7.f112564i);
        C22124b0 c22124b0 = new C22124b0(context);
        this.f64769L = c22124b0;
        c22124b0.f108888M0.mo111965M1(0);
        this.f64769L.f108888M0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f64769L.m115399p1(AbstractC23136l9.m118742r(6.0f));
        this.f64769L.m115401r1(AbstractC16803z.icn_sort, 0, 0, 0);
        this.f64769L.f108888M0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        C16718f m89106L = this.f64769L.m89106L();
        Boolean bool = Boolean.TRUE;
        m89106L.m89017A(bool).m89047c0(AbstractC23136l9.m118742r(12.0f)).m89048d0(AbstractC23136l9.m118742r(12.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f)).m89028L(-2, -2).m89023G(this.f64771N);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64768K = c22126c0;
        c22126c0.mo111965M1(1);
        this.f64768K.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f64768K.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f64768K.m111980v1(TextUtils.TruncateAt.END);
        this.f64768K.m89106L().m89046b0(AbstractC23136l9.m118742r(16.0f)).m89048d0(AbstractC23136l9.m118742r(12.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f)).m89073z(bool).m89049e0(this.f64769L).m89028L(-2, -2);
        mo69681L(this.f64771N);
        mo69681L(this.f64769L);
        mo69681L(this.f64768K);
        this.f64769L.mo89109M0(new C16719g.c() { // from class: i80.b
            public /* synthetic */ C20427b() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g2) {
                GroupLabelWithActionModuleView.this.m69750W(c16719g2);
            }
        });
    }

    /* renamed from: W */
    public /* synthetic */ void m69750W(C16719g c16719g) {
        if (this.f64770M != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int m89096G = iArr[0] + this.f64769L.m89096G();
            int m89098H = iArr[1] + this.f64769L.m89098H();
            this.f64770M.mo67820uG(new Rect(m89096G, m89098H, this.f64769L.m89114P() + m89096G, this.f64769L.m89112O() + m89098H));
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        this.f64771N.mo44614b1(8);
        int i12 = c32020m7.f147410a;
        if (i12 == 32) {
            this.f64768K.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC16781w.SectionTitleColor1));
            this.f64768K.mo111964L1(AbstractC23222t7.f112580q);
            this.f64768K.m111959G1(c32020m7.f147428s);
            this.f64771N.mo44614b1(0);
            this.f64769L.mo44614b1(8);
            return;
        }
        if (i12 == 6) {
            ContactProfile contactProfile = c32020m7.f147411b;
            if (contactProfile != null) {
                this.f64768K.m111959G1(contactProfile.f42437s);
            }
            this.f64769L.mo44614b1(8);
            return;
        }
        if (i12 == 33) {
            setBackground(AbstractC23136l9.m118665N(this.f84675p, AbstractC16803z.stencils_contact_bg));
            this.f64768K.m111962J1(C23212s8.m119607o(this.f84675p, AbstractC16781w.LinkColor));
            this.f64768K.m111959G1(c32020m7.f147428s);
            this.f64769L.mo44614b1(8);
            return;
        }
        if (i12 == 37) {
            this.f64768K.m111959G1(c32020m7.f147428s);
            this.f64769L.f108888M0.m111959G1(c32020m7.f147429t);
            this.f64769L.mo44614b1(8);
        } else {
            this.f64768K.m111959G1(c32020m7.f147428s);
            this.f64769L.f108888M0.m111959G1(c32020m7.f147429t);
            this.f64769L.mo44614b1(0);
        }
    }
}
