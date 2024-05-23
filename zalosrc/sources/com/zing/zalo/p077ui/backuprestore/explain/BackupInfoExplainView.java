package com.zing.zalo.p077ui.backuprestore.explain;

import ah0.C0860a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import ln0.C22537f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24342w;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p387oc.C24213q;
import p421pc.C24720a;
import p649xl.C29899l;
import p716zh.C31986k3;

/* loaded from: classes5.dex */
public final class BackupInfoExplainView extends SlidableZaloView {

    /* renamed from: P0 */
    private C29899l f55936P0;

    /* renamed from: gM */
    private final void m57973gM() {
        if (m57975iM() && C22447s.f109797a.m116077t0()) {
            C29899l c29899l = this.f55936P0;
            C29899l c29899l2 = null;
            if (c29899l == null) {
                AbstractC19074t.m100223u("binding");
                c29899l = null;
            }
            RobotoTextView robotoTextView = c29899l.f138526t;
            C24213q m126205a = C24213q.Companion.m126205a();
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            robotoTextView.setText(m126205a.m126202r(m92689tK));
            c29899l.f138531y.setVisibility(8);
            C29899l c29899l3 = this.f55936P0;
            if (c29899l3 == null) {
                AbstractC19074t.m100223u("binding");
                c29899l3 = null;
            }
            c29899l3.f138531y.setVisibility(8);
            C29899l c29899l4 = this.f55936P0;
            if (c29899l4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29899l2 = c29899l4;
            }
            c29899l2.f138530x.setVisibility(8);
        }
    }

    /* renamed from: hM */
    private final void m57974hM() {
        C29899l c29899l = this.f55936P0;
        if (c29899l == null) {
            AbstractC19074t.m100223u("binding");
            c29899l = null;
        }
        RobotoTextView robotoTextView = c29899l.f138516D;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI = m92652XI(AbstractC8020f0.text_content_description_what_app_backup);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{100}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        RobotoTextView robotoTextView2 = c29899l.f138519G;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.text_header_backup_img_into_n_day_newest);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format2 = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(C24720a.Companion.m128432a().m128413h())}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        robotoTextView2.setText(format2);
        Context context = getContext();
        if (context != null) {
            if (C23212s8.m119601h() == 1) {
                c29899l.f138527u.setImageDrawable(AbstractC1388a.m6964f(context, AbstractC16803z.ic_backup_restore_intro_message_dark));
                c29899l.f138529w.setImageDrawable(AbstractC1388a.m6964f(context, AbstractC16803z.ic_backup_restore_intro_photo_dark));
            } else {
                c29899l.f138527u.setImageDrawable(AbstractC1388a.m6964f(context, AbstractC16803z.ic_backup_restore_intro_message));
                c29899l.f138529w.setImageDrawable(AbstractC1388a.m6964f(context, AbstractC16803z.ic_backup_restore_intro_photo));
            }
        }
        m57973gM();
    }

    /* renamed from: iM */
    private final boolean m57975iM() {
        if (AbstractC23306f.m120633X1().m89807v() && C0860a.Companion.m2473a().m2468s()) {
            return true;
        }
        return false;
    }

    /* renamed from: jM */
    private final void m57976jM() {
        String m118743r0;
        int m127173b0;
        int m127163V;
        CharSequence m127191t0;
        C29899l c29899l = null;
        if (C31986k3.f147083a.m154111U1()) {
            C29899l c29899l2 = this.f55936P0;
            if (c29899l2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29899l = c29899l2;
            }
            c29899l.f138513A.setVisibility(8);
            return;
        }
        if (AbstractC23306f.m120692n().m133023A()) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setup_backup_msg_desc_include_e2ee_thread_v2);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setup_backup_msg_desc_exclude_e2ee_thread_v2);
        }
        AbstractC19074t.m100205c(m118743r0);
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "#x#", 0, false, 6, null);
        if (m127173b0 >= 0) {
            m127163V = AbstractC24342w.m127163V(m118743r0);
            m127191t0 = AbstractC24342w.m127191t0(m118743r0, new C22537f(m127173b0, m127163V));
            m118743r0 = m127191t0.toString();
        }
        C29899l c29899l3 = this.f55936P0;
        if (c29899l3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29899l = c29899l3;
        }
        c29899l.f138525s.setText(m118743r0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29899l m148179c = C29899l.m148179c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148179c, "inflate(...)");
        this.f55936P0 = m148179c;
        m57974hM();
        C29899l c29899l = this.f55936P0;
        if (c29899l == null) {
            AbstractC19074t.m100223u("binding");
            c29899l = null;
        }
        FrameLayout root = c29899l.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DetailDataBackupView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m57976jM();
    }
}
