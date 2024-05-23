package com.zing.zalo.p077ui.toolstoragev1.summary;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import bi0.AbstractC2814h;
import cb0.C3399j;
import cb0.InterfaceC3390a;
import cb0.InterfaceC3391b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.toolstoragev1.list.StorageListView;
import com.zing.zalo.p077ui.toolstoragev1.summary.StorageSummaryView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import k30.C21459a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p371nv.C23952g;
import p649xl.C30071uc;

/* loaded from: classes6.dex */
public class StorageSummaryView extends SlidableZaloView implements InterfaceC3391b, InterfaceC0733x {

    /* renamed from: P0 */
    private C30071uc f68941P0;

    /* renamed from: R0 */
    private int f68943R0;

    /* renamed from: S0 */
    private int f68944S0;

    /* renamed from: U0 */
    private InterfaceC3390a f68946U0;

    /* renamed from: Q0 */
    private C16972e0 f68942Q0 = null;

    /* renamed from: T0 */
    private final Animation f68945T0 = m75530kM();

    /* renamed from: kM */
    private Animation m75530kM() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(500L);
        return alphaAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m75531lM(View view) {
        this.f68946U0.mo17065Kh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m75532mM(View view) {
        this.f68946U0.mo17068u4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m75533nM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f68946U0.mo17064Dm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m75534oM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        this.f68946U0.mo17066Rk();
    }

    /* renamed from: pM */
    private String m75535pM(float f11) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.UP);
        return String.format(m92652XI(AbstractC8020f0.str_storage_usage_and_cache_percentage), decimalFormat.format(f11 * 100.0f) + "%");
    }

    /* renamed from: qM */
    private void m75536qM() {
        this.f68941P0.f139599x.setText("...");
        this.f68941P0.f139599x.setTextColor(this.f68944S0);
        this.f68941P0.f139597v.setText("...");
        this.f68941P0.f139597v.setTextColor(this.f68944S0);
        this.f68941P0.f139600y.setText("...");
        this.f68941P0.f139600y.setTextColor(this.f68944S0);
        this.f68941P0.f139601z.setText("...");
        this.f68941P0.f139601z.setTextColor(this.f68944S0);
        this.f68941P0.f139598w.setText("...");
        this.f68941P0.f139598w.setTextColor(this.f68944S0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C3399j c3399j = new C3399j(this, AbstractC23306f.m120570C1(), AbstractC23306f.m120713t0(), AbstractC23306f.m120574E());
        this.f68946U0 = c3399j;
        c3399j.mo995Nd(null, null);
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: D9 */
    public void mo17069D9(long j11, float f11, long j12, long j13) {
        C23952g.m125345j("Tool Storage", " presentPieChart totalZaloSize: " + j11 + " bytes");
        this.f68941P0.f139596u.setUsage(C21459a.m111036d(j11));
        this.f68941P0.f139596u.setPercent(m75535pM(f11));
        this.f68941P0.f139596u.setValues(new long[]{j11, j12, j13});
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: Fh */
    public void mo17070Fh(boolean z11) {
        this.f68941P0.f139592q.setEnabled(z11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C30071uc m148586c = C30071uc.m148586c(layoutInflater, viewGroup, false);
        this.f68941P0 = m148586c;
        m148586c.f139593r.setOnClickListener(new View.OnClickListener() { // from class: cb0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StorageSummaryView.this.m75531lM(view);
            }
        });
        this.f68941P0.f139592q.setOnClickListener(new View.OnClickListener() { // from class: cb0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StorageSummaryView.this.m75532mM(view);
            }
        });
        this.f68943R0 = C23212s8.m119607o(this.f68941P0.getRoot().getContext(), AbstractC21196a.TextColor1);
        this.f68944S0 = C23212s8.m119607o(this.f68941P0.getRoot().getContext(), AbstractC21196a.TextColor2);
        C23952g.m125345j("Tool Storage", " onCreateView StorageSummaryView calling loadInfoUsageAndCache");
        this.f68946U0.mo17067t8(true, false, false);
        return this.f68941P0.getRoot();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f68946U0.mo994F2();
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: Iz */
    public void mo17071Iz(long j11) {
        this.f68941P0.f139597v.setText(C21459a.m111036d(j11));
        this.f68941P0.f139597v.setAnimation(this.f68945T0);
        this.f68941P0.f139597v.setTextColor(this.f68944S0);
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: JA */
    public void mo17072JA() {
        C16972e0 c16972e0 = this.f68942Q0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: L5 */
    public void mo17073L5() {
        C23952g.m125345j("Tool Storage", " showUIWhileCalculating");
        this.f68941P0.f139596u.m82660c0();
        mo17080tC(false);
        mo17070Fh(false);
        m75536qM();
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: M8 */
    public void mo17074M8(long j11) {
        C23952g.m125345j("Tool Storage", "presentConversationDataSize data in bytes: " + j11 + ". Data in text: " + C21459a.m111036d(j11));
        this.f68941P0.f139601z.setText(C21459a.m111036d(j11));
        this.f68941P0.f139601z.setAnimation(this.f68945T0);
        this.f68941P0.f139601z.setTextColor(this.f68943R0);
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: Mf */
    public void mo17075Mf(long j11, long j12) {
        Bundle bundle = new Bundle();
        bundle.putLong("size_conversation", j11);
        bundle.putLong("size_cache", j12);
        this.f72421L0.m92662fJ().m93066i2(StorageListView.class, bundle, 1, 1, true);
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: Wo */
    public void mo17076Wo(long j11) {
        this.f68941P0.f139598w.setText(C21459a.m111036d(j11));
        this.f68941P0.f139598w.setAnimation(this.f68945T0);
        this.f68941P0.f139598w.setTextColor(this.f68943R0);
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: bH */
    public void mo17077bH(long j11) {
        this.f68941P0.f139600y.setText(C21459a.m111036d(j11));
        this.f68941P0.f139600y.setAnimation(this.f68945T0);
        this.f68941P0.f139600y.setTextColor(this.f68944S0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ToolStorageSummary";
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: jI */
    public void mo17078jI() {
        C16972e0 m90927d = new C16972e0.a(m92689tK()).m90932i(C16972e0.b.DIALOG_INFORMATION).m90949z(AbstractC23136l9.m118746s0(AbstractC8020f0.str_storage_usage_and_cache_dialog_title, this.f68941P0.f139598w.getText().toString())).m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: cb0.n
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageSummaryView.this.m75533nM(interfaceC17463d, i11);
            }
        }).m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger).m90934k(m92652XI(AbstractC8020f0.cancel), new InterfaceC17463d.d() { // from class: cb0.o
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                StorageSummaryView.this.m75534oM(interfaceC17463d, i11);
            }
        }).m90931h("clean_cache_dialog").m90947x("clean_cache_button").m90937n("close_dialog_button").m90927d();
        this.f68942Q0 = m90927d;
        m90927d.mo13822K();
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: nf */
    public void mo17079nf(long j11) {
        this.f68941P0.f139599x.setText(C21459a.m111036d(j11));
        this.f68941P0.f139599x.setAnimation(this.f68945T0);
        this.f68941P0.f139599x.setTextColor(this.f68944S0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1 && i12 == -1 && intent.getBooleanExtra("need_reload", false)) {
            C23952g.m125345j("Tool Storage", " onActivityResult calling loadInfoUsageAndCache");
            this.f68946U0.mo17067t8(true, true, false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: tC */
    public void mo17080tC(boolean z11) {
        this.f68941P0.f139593r.setEnabled(z11);
    }

    @Override // cb0.InterfaceC3391b
    /* renamed from: te */
    public void mo17081te(int i11) {
        AbstractC23306f.m120564A1().m105697n(m92662fJ(), i11);
    }
}
