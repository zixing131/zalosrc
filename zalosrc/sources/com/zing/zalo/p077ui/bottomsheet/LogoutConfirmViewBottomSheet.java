package com.zing.zalo.p077ui.bottomsheet;

import ac.C0708i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import org.json.JSONObject;
import p227i3.C20218v;
import p579vl.C28290a;
import p649xl.C30076v0;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import si.C26263i;

/* loaded from: classes5.dex */
public final class LogoutConfirmViewBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    private C30076v0 f56215b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f56216c1;

    /* renamed from: com.zing.zalo.ui.bottomsheet.LogoutConfirmViewBottomSheet$a */
    /* loaded from: classes5.dex */
    static final class C11177a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11177a f56217q = new C11177a();

        C11177a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0708i mo12V4() {
            if (C26263i.m135058w() == null) {
                C0708i c0708i = new C0708i();
                c0708i.m1074e("funnel", new JSONObject("{\"type\":\"has_no_backup_file\"}"));
                return c0708i;
            }
            C0708i c0708i2 = new C0708i();
            c0708i2.m1074e("funnel", new JSONObject("{\"type\":\"has_backup_file\"}"));
            return c0708i2;
        }
    }

    public LogoutConfirmViewBottomSheet() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C11177a.f56217q);
        this.f56216c1 = m129210a;
    }

    /* renamed from: IL */
    private final C0708i m58513IL() {
        return (C0708i) this.f56216c1.getValue();
    }

    /* renamed from: JL */
    private final void m58514JL() {
        m58516LL(2);
        close();
    }

    /* renamed from: KL */
    private final void m58515KL() {
        m58516LL(1);
        close();
    }

    /* renamed from: LL */
    private final void m58516LL(int i11) {
        ZaloView m92650VI;
        if ((m92650VI() instanceof LogoutConfirmView) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(i11, null);
        }
    }

    /* renamed from: ML */
    private final void m58517ML() {
        C30076v0 c30076v0 = this.f56215b1;
        C30076v0 c30076v02 = null;
        if (c30076v0 == null) {
            AbstractC19074t.m100223u("binding");
            c30076v0 = null;
        }
        c30076v0.f139614r.setOnClickListener(this);
        C30076v0 c30076v03 = this.f56215b1;
        if (c30076v03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30076v02 = c30076v03;
        }
        c30076v02.f139613q.setOnClickListener(this);
    }

    /* renamed from: NL */
    private final void m58518NL() {
        setIdTracking("logout_footer");
        C30076v0 c30076v0 = this.f56215b1;
        C30076v0 c30076v02 = null;
        if (c30076v0 == null) {
            AbstractC19074t.m100223u("binding");
            c30076v0 = null;
        }
        c30076v0.f139614r.setIdTracking("logout_button");
        C30076v0 c30076v03 = this.f56215b1;
        if (c30076v03 == null) {
            AbstractC19074t.m100223u("binding");
            c30076v03 = null;
        }
        c30076v03.f139614r.setTrackingExtraData(m58513IL());
        C30076v0 c30076v04 = this.f56215b1;
        if (c30076v04 == null) {
            AbstractC19074t.m100223u("binding");
            c30076v04 = null;
        }
        c30076v04.f139613q.setIdTracking("backup_button");
        C30076v0 c30076v05 = this.f56215b1;
        if (c30076v05 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30076v02 = c30076v05;
        }
        c30076v02.f139613q.setTrackingExtraData(m58513IL());
    }

    /* renamed from: OL */
    private final void m58519OL() {
        m90533zL(EnumC17017m.HUG_CONTENT);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30076v0 m148594c = C30076v0.m148594c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148594c, "inflate(...)");
        this.f56215b1 = m148594c;
        m58519OL();
        m58518NL();
        m58517ML();
        C28290a.f131979a.m142554l(true);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_confirm_logout) {
            m58515KL();
        } else if (id2 == AbstractC6918a0.btn_backup_now) {
            m58514JL();
        }
    }
}
