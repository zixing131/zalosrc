package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.QuickCreateGroupAdapter;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.zview.ZaloView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p716zh.C32141v0;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class QuickCreateGroupChildTabView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: M0 */
    View f76594M0;

    /* renamed from: N0 */
    RecyclerView f76595N0;

    /* renamed from: O0 */
    LinearLayoutManager f76596O0;

    /* renamed from: P0 */
    Handler f76597P0;

    /* renamed from: Q0 */
    HandlerThread f76598Q0;

    /* renamed from: S0 */
    QuickCreateGroupAdapter f76600S0;

    /* renamed from: R0 */
    public int f76599R0 = 0;

    /* renamed from: T0 */
    int f76601T0 = 0;

    /* renamed from: U0 */
    boolean f76602U0 = true;

    /* renamed from: V0 */
    boolean f76603V0 = false;

    /* renamed from: W0 */
    boolean f76604W0 = false;

    /* renamed from: X0 */
    final Runnable f76605X0 = new Runnable() { // from class: com.zing.zalo.ui.zviews.e90
        @Override // java.lang.Runnable
        public final void run() {
            QuickCreateGroupChildTabView.this.m83230lM();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupChildTabView$a */
    /* loaded from: classes6.dex */
    public class C14839a extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ QuickCreateGroupView f76606a;

        C14839a(QuickCreateGroupView quickCreateGroupView) {
            this.f76606a = quickCreateGroupView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                QuickCreateGroupChildTabView.this.f76604W0 = true;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            if (Math.abs(i12) > 0 && QuickCreateGroupChildTabView.this.f76604W0) {
                if (this.f76606a.m83304rc() != 0) {
                    this.f76606a.m83280Ka(0);
                }
                QuickCreateGroupChildTabView.this.f76604W0 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupChildTabView$b */
    /* loaded from: classes6.dex */
    public class ViewOnTouchListenerC14840b implements View.OnTouchListener {

        /* renamed from: p */
        float f76608p = 0.0f;

        ViewOnTouchListenerC14840b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int i11;
            int i12;
            int i13;
            QuickCreateGroupView m83228gM = QuickCreateGroupChildTabView.this.m83228gM();
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    int round = Math.round(motionEvent.getRawY() - this.f76608p);
                    this.f76608p = motionEvent.getRawY();
                    int abs = Math.abs(round);
                    int i14 = m83228gM.f76708t2;
                    if (abs <= i14) {
                        QuickCreateGroupChildTabView quickCreateGroupChildTabView = QuickCreateGroupChildTabView.this;
                        quickCreateGroupChildTabView.f76602U0 = false;
                        if (round > 0) {
                            int i15 = quickCreateGroupChildTabView.f76601T0;
                            if (i15 != 0) {
                                if (i15 == 1) {
                                    quickCreateGroupChildTabView.f76601T0 = 0;
                                }
                            } else {
                                quickCreateGroupChildTabView.f76601T0 = -1;
                            }
                            if (quickCreateGroupChildTabView.f76601T0 == -1) {
                                int i16 = m83228gM.f76710u2;
                                if (i16 + round < i14) {
                                    m83228gM.m83289gN(false, 0, round);
                                    QuickCreateGroupChildTabView.this.f76595N0.m9845O1(0, -round);
                                    return true;
                                }
                                if (i16 != i14) {
                                    m83228gM.m83289gN(false, 0, i14 - i16);
                                }
                                return false;
                            }
                        } else if (round < 0) {
                            int i17 = quickCreateGroupChildTabView.f76601T0;
                            if (i17 != -1) {
                                if (i17 == 0) {
                                    quickCreateGroupChildTabView.f76601T0 = 1;
                                }
                            } else {
                                quickCreateGroupChildTabView.f76601T0 = 0;
                            }
                            if (quickCreateGroupChildTabView.f76601T0 == 1) {
                                int i18 = -round;
                                int i19 = m83228gM.f76710u2;
                                if (i19 - i18 > 0) {
                                    m83228gM.m83289gN(true, 0, i18);
                                    QuickCreateGroupChildTabView.this.f76595N0.m9845O1(0, -i18);
                                    return true;
                                }
                                if (i19 > 0) {
                                    m83228gM.m83289gN(true, 0, i19);
                                }
                            }
                        }
                    }
                    return false;
                }
            } else {
                this.f76608p = 0.0f;
                QuickCreateGroupChildTabView quickCreateGroupChildTabView2 = QuickCreateGroupChildTabView.this;
                quickCreateGroupChildTabView2.f76603V0 = false;
                int i21 = quickCreateGroupChildTabView2.f76601T0;
                if (i21 == -1 && (i12 = m83228gM.f76710u2) < (i13 = m83228gM.f76708t2)) {
                    int i22 = i13 - i12;
                    m83228gM.m83302rM(i22, Math.round((i22 * m83228gM.f76712v2) / i13), false);
                    QuickCreateGroupChildTabView.this.f76603V0 = true;
                } else if (i21 == 1 && (i11 = m83228gM.f76710u2) > 0) {
                    m83228gM.m83300qM(i11, Math.round((i11 * m83228gM.f76712v2) / m83228gM.f76708t2));
                    QuickCreateGroupChildTabView.this.f76603V0 = true;
                }
                QuickCreateGroupChildTabView.this.f76601T0 = 0;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateGroupChildTabView$c */
    /* loaded from: classes6.dex */
    public class C14841c extends RecyclerView.AbstractC1890q {

        /* renamed from: a */
        final /* synthetic */ QuickCreateGroupView f76610a;

        C14841c(QuickCreateGroupView quickCreateGroupView) {
            this.f76610a = quickCreateGroupView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
        /* renamed from: a */
        public boolean mo10175a(int i11, int i12) {
            QuickCreateGroupChildTabView quickCreateGroupChildTabView = QuickCreateGroupChildTabView.this;
            quickCreateGroupChildTabView.f76603V0 = false;
            if (i12 < 0) {
                quickCreateGroupChildTabView.m83229kM(this.f76610a, false);
            } else if (i12 > 0) {
                quickCreateGroupChildTabView.m83229kM(this.f76610a, true);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public /* synthetic */ void m83224hM(ArrayList arrayList, int i11) {
        this.f76600S0.m35818Q(arrayList);
        this.f76600S0.m35819R(i11);
        this.f76600S0.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public /* synthetic */ void m83225iM(InviteContactProfile inviteContactProfile) {
        QuickCreateGroupAdapter.InterfaceC6993d interfaceC6993d;
        QuickCreateGroupView m83228gM = m83228gM();
        if (m83228gM != null && (interfaceC6993d = m83228gM.f76630G2) != null) {
            interfaceC6993d.mo35823a(inviteContactProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public /* synthetic */ void m83226jM(RecyclerView recyclerView, int i11, View view) {
        InviteContactProfile m35813L;
        QuickCreateGroupView m83228gM;
        try {
            if (this.f76600S0.mo10005m(i11) == 0 && (m35813L = this.f76600S0.m35813L(i11)) != null && (m83228gM = m83228gM()) != null) {
                String str = "";
                int i12 = this.f76599R0;
                if (i12 == QuickCreateGroupView.f76612M2) {
                    str = "27421";
                } else if (i12 == QuickCreateGroupView.f76613N2) {
                    str = "27419";
                } else if (i12 == QuickCreateGroupView.f76614O2) {
                    str = "27420";
                }
                m83228gM.m83307tM(m35813L, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f76599R0 = m92642L3.getInt("extra_tab_type");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f76594M0 = layoutInflater.inflate(AbstractC7409c0.quick_create_group_child_tab_view, viewGroup, false);
        m83231mM();
        return this.f76594M0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        HandlerThread handlerThread = this.f76598Q0;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        super.mo39024IJ();
    }

    /* renamed from: d0 */
    public void m83227d0() {
        QuickCreateGroupAdapter quickCreateGroupAdapter = this.f76600S0;
        if (quickCreateGroupAdapter != null) {
            quickCreateGroupAdapter.m10008p();
        }
    }

    /* renamed from: gM */
    QuickCreateGroupView m83228gM() {
        ZaloView m92650VI = this.f72421L0.m92650VI();
        if (m92650VI instanceof QuickCreateGroupView) {
            return (QuickCreateGroupView) m92650VI;
        }
        return null;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickCreateGroupChildTabView";
    }

    /* renamed from: kM */
    public void m83229kM(QuickCreateGroupView quickCreateGroupView, boolean z11) {
        if (z11) {
            int i11 = quickCreateGroupView.f76710u2;
            quickCreateGroupView.m83300qM(i11, Math.round((i11 / quickCreateGroupView.f76708t2) * quickCreateGroupView.f76712v2));
        } else {
            int i12 = quickCreateGroupView.f76708t2;
            int i13 = i12 - quickCreateGroupView.f76710u2;
            quickCreateGroupView.m83302rM(i13, Math.round((i13 / i12) * quickCreateGroupView.f76712v2), false);
        }
    }

    /* renamed from: lM */
    public void m83230lM() {
        int i11;
        QuickCreateGroupView m83228gM = m83228gM();
        if (this.f76600S0 != null && m83228gM != null) {
            ArrayList m83272EM = m83228gM.m83272EM(this.f76599R0);
            final ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            if (m83272EM != null) {
                Iterator it = m83272EM.iterator();
                boolean z11 = true;
                while (it.hasNext()) {
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                    if (inviteContactProfile != null) {
                        int i12 = !inviteContactProfile.m40366G0() ? 1 : 0;
                        if (i12 == 0) {
                            if (!hashMap.containsKey(inviteContactProfile.f42434r)) {
                                String str = inviteContactProfile.f42434r;
                                hashMap.put(str, str);
                            }
                            if (!inviteContactProfile.m40381O0() && TextUtils.isEmpty(inviteContactProfile.f42541e2)) {
                                if (inviteContactProfile.m40392W() != null) {
                                    i11 = 2;
                                } else {
                                    i11 = 3;
                                }
                            } else {
                                i11 = 1;
                            }
                            arrayList.add(new C32141v0(i12, inviteContactProfile, i11));
                        } else {
                            QuickCreateGroupAdapter.C6995f c6995f = new QuickCreateGroupAdapter.C6995f(inviteContactProfile.f42437s, inviteContactProfile);
                            if (!z11) {
                                c6995f.f38274f = true;
                            } else {
                                z11 = false;
                                c6995f.f38274f = false;
                            }
                            arrayList.add(c6995f);
                        }
                    }
                }
            }
            arrayList.add(new C32141v0(2, null));
            final int size = hashMap.size();
            this.f72421L0.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.f90
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCreateGroupChildTabView.this.m83224hM(arrayList, size);
                }
            });
        }
    }

    /* renamed from: mM */
    void m83231mM() {
        try {
            this.f76595N0 = (RecyclerView) this.f76594M0.findViewById(AbstractC6918a0.recycle_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f72421L0.getContext());
            this.f76596O0 = linearLayoutManager;
            this.f76595N0.setLayoutManager(linearLayoutManager);
            QuickCreateGroupView m83228gM = m83228gM();
            QuickCreateGroupAdapter quickCreateGroupAdapter = new QuickCreateGroupAdapter(this.f72421L0.getContext(), m83228gM.f76654S1.m155394h(), false, this.f76599R0);
            this.f76600S0 = quickCreateGroupAdapter;
            quickCreateGroupAdapter.m35817P(new QuickCreateGroupAdapter.InterfaceC6993d() { // from class: com.zing.zalo.ui.zviews.b90
                @Override // com.zing.zalo.adapters.QuickCreateGroupAdapter.InterfaceC6993d
                /* renamed from: a */
                public final void mo35823a(InviteContactProfile inviteContactProfile) {
                    QuickCreateGroupChildTabView.this.m83225iM(inviteContactProfile);
                }
            });
            this.f76595N0.setAdapter(this.f76600S0);
            this.f76595N0.m9826E(new C14839a(m83228gM));
            this.f76595N0.setOnTouchListener(new ViewOnTouchListenerC14840b());
            this.f76595N0.setOnFlingListener(new C14841c(m83228gM));
            C31784b.m152808a(this.f76595N0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.c90
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    QuickCreateGroupChildTabView.this.m83226jM(recyclerView, i11, view);
                }
            });
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.d90
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCreateGroupChildTabView.this.m83227d0();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    public void m83232nM() {
        this.f76597P0.post(this.f76605X0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            HandlerThread handlerThread = new HandlerThread("Z:QuickCreateGroup", 1);
            this.f76598Q0 = handlerThread;
            handlerThread.start();
            this.f76597P0 = new Handler(this.f76598Q0.getLooper());
            m83232nM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
