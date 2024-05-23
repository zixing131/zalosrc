package com.zing.zalo.location.widget;

import android.graphics.drawable.TransitionDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.location.AbstractC8971q;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.location.widget.C8984c;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.progress.CircularProgress;
import com.zing.zalo.p077ui.widget.textview.AnimEndingThreeDotTextView;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import nh0.C23793c;
import p262jb.AbstractC21196a;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import vg.C28203u6;
import z20.AbstractC31195a;

/* renamed from: com.zing.zalo.location.widget.c */
/* loaded from: classes4.dex */
public class C8984c extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    int f48086r;

    /* renamed from: s */
    protected Location f48087s = null;

    /* renamed from: t */
    List f48088t = new ArrayList();

    /* renamed from: u */
    List f48089u = new ArrayList();

    /* renamed from: v */
    List f48090v = new ArrayList();

    /* renamed from: w */
    Comparator f48091w = new Comparator() { // from class: com.zing.zalo.location.widget.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m48065S;
            m48065S = C8984c.m48065S((C8984c.d) obj, (C8984c.d) obj2);
            return m48065S;
        }
    };

    /* renamed from: x */
    Comparator f48092x = new Comparator() { // from class: com.zing.zalo.location.widget.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m48066T;
            m48066T = C8984c.m48066T((C8984c.d) obj, (C8984c.d) obj2);
            return m48066T;
        }
    };

    /* renamed from: y */
    long f48093y = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.widget.c$a */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        public a(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public void mo48078i0(int i11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.widget.c$b */
    /* loaded from: classes4.dex */
    public class b extends a {

        /* renamed from: I */
        RobotoTextView f48094I;

        public b(View view) {
            super(view);
        }

        @Override // com.zing.zalo.location.widget.C8984c.a
        /* renamed from: i0 */
        public void mo48078i0(int i11) {
            super.mo48078i0(i11);
            c cVar = (c) C8984c.this.m48069P(i11);
            this.f48094I.setText(cVar.f48096b);
            if (cVar.f48097c) {
                RobotoTextView robotoTextView = this.f48094I;
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            } else {
                RobotoTextView robotoTextView2 = this.f48094I;
                robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC16781w.DisableSubText));
            }
        }
    }

    /* renamed from: com.zing.zalo.location.widget.c$c */
    /* loaded from: classes4.dex */
    public static class c extends f {

        /* renamed from: b */
        String f48096b;

        /* renamed from: c */
        public boolean f48097c;

        public c(String str, boolean z11) {
            super(1);
            this.f48096b = str;
            this.f48097c = z11;
        }
    }

    /* renamed from: com.zing.zalo.location.widget.c$d */
    /* loaded from: classes4.dex */
    public static class d extends f {

        /* renamed from: b */
        public C8969o f48098b;

        /* renamed from: c */
        public float f48099c;

        public d(C8969o c8969o) {
            super(0);
            this.f48098b = c8969o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.widget.c$e */
    /* loaded from: classes4.dex */
    public class e extends a {

        /* renamed from: I */
        GroupAvatarView f48100I;

        /* renamed from: J */
        TextView f48101J;

        /* renamed from: K */
        AnimEndingThreeDotTextView f48102K;

        /* renamed from: L */
        TextView f48103L;

        /* renamed from: M */
        CircularProgress f48104M;

        /* renamed from: N */
        View f48105N;

        public e(View view) {
            super(view);
        }

        @Override // com.zing.zalo.location.widget.C8984c.a
        /* renamed from: i0 */
        public void mo48078i0(int i11) {
            int i12;
            float f11;
            String str = "";
            try {
                this.f48101J.setText("");
                this.f48102K.setVisibility(8);
                this.f48103L.setVisibility(8);
                this.f48104M.m76680b(0.0f, "");
                d dVar = (d) C8984c.this.m48069P(i11);
                C8969o c8969o = dVar.f48098b;
                if (c8969o != null) {
                    boolean m47872U = C8967m.m47872U(c8969o);
                    if (C8984c.this.f48086r == 1) {
                        ContactProfile m141809c = C28203u6.f131407a.m141809c(c8969o.f47982c);
                        if (TextUtils.equals(c8969o.f47982c, CoreUtility.f89233i)) {
                            this.f48101J.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you));
                        } else {
                            if (m141809c != null) {
                                this.f48101J.setText(m141809c.m40383Q(true, false));
                            } else {
                                this.f48101J.setText(c8969o.f47991l);
                            }
                            if (C8984c.this.f48087s != null && C23793c.m124316k().mo124310e() - c8969o.f47995p < 86400000) {
                                boolean m47975g = AbstractC8971q.m47975g(c8969o);
                                boolean m47976h = AbstractC8971q.m47976h(c8969o);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(C8984c.this.m48068O(dVar.f48099c));
                                if (m47975g && !m47976h && !m47872U) {
                                    sb2.append(" · ");
                                    sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_live_location_moving));
                                    this.f48102K.setThreeDotVisibility(0);
                                } else {
                                    sb2.append(" · ");
                                    sb2.append(C8984c.this.m48071R(c8969o.f47995p));
                                    this.f48102K.setThreeDotVisibility(8);
                                }
                                this.f48102K.setVisibility(0);
                                this.f48102K.setText(sb2.toString());
                            }
                        }
                        if (m141809c != null) {
                            this.f48100I.m75731c(m141809c);
                        } else {
                            this.f48100I.m75732d(c8969o.f47992m);
                        }
                        GroupAvatarView groupAvatarView = this.f48100I;
                        if (m47872U) {
                            f11 = 0.4f;
                        } else {
                            f11 = 1.0f;
                        }
                        groupAvatarView.setAlpha(f11);
                    } else if (AbstractC25495a.m132079d(c8969o.f47981b)) {
                        this.f48100I.setImageOption(C23278z2.m120141m0());
                        ContactProfile contactProfile = new ContactProfile(c8969o.f47981b);
                        ArrayList arrayList = new ArrayList();
                        C31973j5 m40389U = contactProfile.m40389U();
                        if (m40389U != null) {
                            if (m40389U.m153786t0()) {
                                arrayList.add(m40389U.m153756e());
                            } else {
                                arrayList.addAll(m40389U.m153762h());
                            }
                        } else {
                            arrayList.add(contactProfile.f42446v);
                        }
                        this.f48100I.m75733e(arrayList);
                        TextView textView = this.f48101J;
                        if (m40389U != null) {
                            str = m40389U.m153793y();
                        }
                        textView.setText(str);
                    } else {
                        this.f48100I.setImageOption(C23278z2.m120143n());
                        ContactProfile m141809c2 = C28203u6.f131407a.m141809c(c8969o.f47981b);
                        if (m141809c2 != null) {
                            this.f48101J.setText(m141809c2.m40383Q(true, false));
                            this.f48100I.m75731c(m141809c2);
                        }
                    }
                    long mo124310e = C23793c.m124316k().mo124310e();
                    long j11 = c8969o.f47989j;
                    long j12 = mo124310e - j11;
                    long j13 = c8969o.f47990k;
                    long j14 = j13 - mo124310e;
                    if (j12 < 0) {
                        j12 = 0;
                    }
                    this.f48104M.m76680b((((float) j12) * 1.0f) / ((float) (j13 - j11)), String.valueOf(Math.round(((float) j14) / 60000.0f)));
                    if (m47872U && C8984c.this.f48086r == 1) {
                        this.f48104M.setVisibility(4);
                        this.f48103L.setVisibility(0);
                    } else {
                        this.f48104M.setVisibility(0);
                    }
                    if (C8984c.this.f48093y == c8969o.f47980a) {
                        TransitionDrawable transitionDrawable = (TransitionDrawable) AbstractC23136l9.m118665N(this.f7784p.getContext(), AbstractC16803z.bg_highlight_comment);
                        this.f7784p.setBackground(transitionDrawable);
                        transitionDrawable.setCrossFadeEnabled(true);
                        transitionDrawable.startTransition(1000);
                        C8984c.this.f48093y = 0L;
                    } else {
                        View view = this.f7784p;
                        view.setBackground(AbstractC23136l9.m118665N(view.getContext(), AbstractC16803z.stencils_contact_bg));
                    }
                }
                View view2 = this.f48105N;
                if (i11 == C8984c.this.mo10003k() - 1) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                view2.setVisibility(i12);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.location.widget.c$f */
    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a */
        public int f48107a;

        public f(int i11) {
            this.f48107a = i11;
        }
    }

    public C8984c(int i11) {
        this.f48086r = 1;
        this.f48086r = i11;
    }

    /* renamed from: N */
    private void m48064N() {
        C8969o c8969o;
        if (this.f48087s != null) {
            for (d dVar : this.f48089u) {
                if (dVar != null && (c8969o = dVar.f48098b) != null) {
                    if (TextUtils.equals(c8969o.f47982c, CoreUtility.f89233i)) {
                        dVar.f48099c = 0.0f;
                    } else {
                        double latitude = this.f48087s.getLatitude();
                        double longitude = this.f48087s.getLongitude();
                        C8969o c8969o2 = dVar.f48098b;
                        dVar.f48099c = AbstractC31195a.m151996a(latitude, longitude, c8969o2.f47984e, c8969o2.f47985f);
                    }
                }
            }
            Collections.sort(this.f48089u, this.f48092x);
            return;
        }
        Collections.sort(this.f48089u, this.f48091w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static /* synthetic */ int m48065S(d dVar, d dVar2) {
        C8969o c8969o = dVar.f48098b;
        if (c8969o != null && TextUtils.equals(c8969o.f47982c, CoreUtility.f89233i)) {
            return -1;
        }
        C8969o c8969o2 = dVar2.f48098b;
        if (c8969o2 != null && TextUtils.equals(c8969o2.f47982c, CoreUtility.f89233i)) {
            return 1;
        }
        C8969o c8969o3 = dVar.f48098b;
        if (c8969o3 != null && C8967m.m47872U(c8969o3)) {
            return 1;
        }
        C8969o c8969o4 = dVar2.f48098b;
        if (c8969o4 != null && C8967m.m47872U(c8969o4)) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ int m48066T(d dVar, d dVar2) {
        C8969o c8969o = dVar.f48098b;
        if (c8969o != null && TextUtils.equals(c8969o.f47982c, CoreUtility.f89233i)) {
            return -1;
        }
        C8969o c8969o2 = dVar2.f48098b;
        if (c8969o2 != null && TextUtils.equals(c8969o2.f47982c, CoreUtility.f89233i)) {
            return 1;
        }
        C8969o c8969o3 = dVar.f48098b;
        if (c8969o3 != null && C8967m.m47872U(c8969o3)) {
            return 1;
        }
        C8969o c8969o4 = dVar2.f48098b;
        if (c8969o4 != null && C8967m.m47872U(c8969o4)) {
            return -1;
        }
        return Float.compare(dVar.f48099c, dVar2.f48099c);
    }

    /* renamed from: U */
    private void m48067U() {
        this.f48090v.clear();
        this.f48090v.addAll(this.f48088t);
        this.f48090v.addAll(this.f48089u);
    }

    /* renamed from: O */
    String m48068O(float f11) {
        float f12 = f11 / 1000.0f;
        if (Math.abs(f12) >= 1.0f) {
            return MainApplication.getAppContext().getString(AbstractC8020f0.str_live_location_distance_2, (Math.round(f12 * 100.0f) / 100) + "km");
        }
        return MainApplication.getAppContext().getString(AbstractC8020f0.str_live_location_distance_2, Math.round(f11) + "m");
    }

    /* renamed from: P */
    public f m48069P(int i11) {
        if (i11 >= 0 && i11 < this.f48090v.size()) {
            return (f) this.f48090v.get(i11);
        }
        return null;
    }

    /* renamed from: Q */
    public int m48070Q(long j11) {
        for (int i11 = 0; i11 < this.f48090v.size(); i11++) {
            if (mo10004l(i11) == j11) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: R */
    String m48071R(long j11) {
        long mo124310e = C23793c.m124316k().mo124310e() - j11;
        int i11 = (int) (mo124310e / 3600000);
        int i12 = (int) ((mo124310e - (i11 * 3600000)) / 60000);
        if (i11 > 0) {
            return AbstractC23136l9.m118746s0(AbstractC8020f0.str_live_location_hour_ago, Integer.valueOf(i11));
        }
        return AbstractC23136l9.m118746s0(AbstractC8020f0.str_live_location_min_ago, Integer.valueOf(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        aVar.mo48078i0(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            View inflate = from.inflate(AbstractC7409c0.invite_to_share_live_location_item_layout, viewGroup, false);
            b bVar = new b(inflate);
            bVar.f48094I = (RobotoTextView) inflate.findViewById(AbstractC6918a0.invite_share_tv);
            return bVar;
        }
        View inflate2 = from.inflate(AbstractC7409c0.live_location_list_item_view, viewGroup, false);
        e eVar = new e(inflate2);
        eVar.f48100I = (GroupAvatarView) inflate2.findViewById(AbstractC6918a0.imv_avatar);
        eVar.f48101J = (TextView) inflate2.findViewById(AbstractC6918a0.tv_title);
        eVar.f48102K = (AnimEndingThreeDotTextView) inflate2.findViewById(AbstractC6918a0.tv_subAnimText);
        eVar.f48103L = (TextView) inflate2.findViewById(AbstractC6918a0.tv_live_location_expired);
        CircularProgress circularProgress = (CircularProgress) inflate2.findViewById(AbstractC6918a0.pg_live_remaining_time);
        eVar.f48104M = circularProgress;
        circularProgress.setCountDown(true);
        eVar.f48105N = inflate2.findViewById(AbstractC6918a0.divider);
        return eVar;
    }

    /* renamed from: X */
    public void m48074X(List list, boolean z11) {
        this.f48089u.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f48089u.add(new d((C8969o) it.next()));
            }
            if (z11) {
                m48064N();
            }
        }
        m48067U();
    }

    /* renamed from: Y */
    public void m48075Y(List list) {
        this.f48088t.clear();
        if (list != null) {
            this.f48088t.addAll(list);
        }
        m48067U();
    }

    /* renamed from: Z */
    public void m48076Z(long j11) {
        this.f48093y = j11;
        m10008p();
    }

    /* renamed from: a0 */
    public void m48077a0(Location location) {
        Location location2 = this.f48087s;
        this.f48087s = location;
        if (location2 != null && location != null && AbstractC31195a.m151996a(location.getLatitude(), this.f48087s.getLongitude(), location2.getLatitude(), location2.getLongitude()) < 5.0f) {
            return;
        }
        m48064N();
        m48067U();
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f48090v.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        C8969o c8969o;
        f m48069P = m48069P(i11);
        if (m48069P.f48107a == 0 && (c8969o = ((d) m48069P).f48098b) != null) {
            return c8969o.f47980a;
        }
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 >= 0 && i11 < this.f48090v.size()) {
            return ((f) this.f48090v.get(i11)).f48107a;
        }
        return 0;
    }
}
