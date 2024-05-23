package v00;

import am.AbstractC0924m0;
import android.os.Bundle;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.libbubbleview.AbstractC8950c;
import com.zing.zalo.libbubbleview.C8949b;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.view.ZChannelFloatingAnimView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.C17507u0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import g20.C19205a;
import java.util.ArrayList;
import p363nh.C23744a;
import qm0.AbstractC25368s;
import yt.AbstractC31072b;
import yt.C31071a;

/* renamed from: v00.j */
/* loaded from: classes5.dex */
public final class C27415j extends AbstractC8950c {
    public static final a Companion = new a(null);

    /* renamed from: E */
    private static C27415j f129051E;

    /* renamed from: D */
    private C27416k f129052D;

    /* renamed from: v00.j$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m140374a() {
            C27415j c27415j = C27415j.f129051E;
            if (c27415j != null) {
                c27415j.m140373b0();
            }
        }

        /* renamed from: b */
        public final C27415j m140375b(ZaloActivity zaloActivity) {
            AbstractC19074t.m100208f(zaloActivity, "zaloActivity");
            if (C27415j.f129051E == null) {
                C27415j.f129051E = new C27415j();
                C27415j c27415j = C27415j.f129051E;
                if (c27415j != null) {
                    c27415j.mo47802W(zaloActivity);
                }
                C27415j c27415j2 = C27415j.f129051E;
                if (c27415j2 != null) {
                    c27415j2.m47805g();
                }
                C27415j c27415j3 = C27415j.f129051E;
                if (c27415j3 != null) {
                    c27415j3.m47803X(zaloActivity);
                }
                C27415j c27415j4 = C27415j.f129051E;
                if (c27415j4 != null) {
                    c27415j4.m47797R(false);
                }
            }
            C27415j c27415j5 = C27415j.f129051E;
            AbstractC19074t.m100205c(c27415j5);
            return c27415j5;
        }

        /* renamed from: c */
        public final boolean m140376c() {
            if (C27415j.f129051E != null) {
                return true;
            }
            return false;
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: O */
    public void mo47794O(AbstractC31072b abstractC31072b) {
        C17487o0 mo35579p;
        C17507u0 m92998F;
        String string;
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        super.mo47794O(abstractC31072b);
        ZaloActivity m47790K = m47790K();
        if (m47790K != null && (string = m47790K.getString(AbstractC27413h.zch_action_key_floating_resume)) != null) {
            C19205a.f95429a.m100713L(string, StateManager.Companion.m53799c());
        }
        C19205a.f95429a.m100723Z("bubble_video", null);
        C27417l.f129055a.m140390n();
        ZaloActivity m47790K2 = m47790K();
        if (m47790K2 != null && (mo35579p = m47790K2.mo35579p()) != null && (m92998F = mo35579p.m92998F(ZChannelFloatingAnimView.class, true)) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("xAnim4View", 2);
            C17507u0 m93139f = m92998F.m93139f(bundle);
            if (m93139f != null) {
                m93139f.m93136a();
            }
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: Q */
    public void mo47796Q(float f11, float f12) {
        float f13 = (float) 1000000000;
        AbstractC0924m0.m3379Qn(f11 * f13);
        AbstractC0924m0.m3408Rn(f12 * f13);
    }

    /* renamed from: b0 */
    public final void m140373b0() {
        AbstractC8950c.Companion.m47819a(this);
        f129051E = null;
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: f */
    public void mo47804f(Object obj, boolean z11) {
        C8949b m47814u;
        ArrayList m131500h;
        AbstractC19074t.m100208f(obj, "itemInfo");
        C27416k c27416k = (C27416k) obj;
        this.f129052D = c27416k;
        if (c27416k != null && (m47814u = m47814u()) != null) {
            m131500h = AbstractC25368s.m131500h(c27416k);
            m47814u.m47769n(m131500h);
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: j */
    public void mo47808j(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        super.mo47808j(abstractC31072b);
        StateManager.Companion.m53798b();
        AbstractC8950c.Companion.m47819a(f129051E);
        f129051E = null;
        C23744a.Companion.m124119a().m124116d(15003, 1);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: q */
    public C31071a mo47812q() {
        return new C31071a(0.0f, 0.0f, 0.0f, 70.0f, 105.0f, 0.5f, 1.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 913287, null);
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: y */
    public float mo47817y() {
        try {
            return ((float) AbstractC0924m0.m2955C5()) / 1.0E9f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.zing.zalo.libbubbleview.AbstractC8950c
    /* renamed from: z */
    public float mo47818z() {
        try {
            return ((float) AbstractC0924m0.m2984D5()) / 1.0E9f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }
}
