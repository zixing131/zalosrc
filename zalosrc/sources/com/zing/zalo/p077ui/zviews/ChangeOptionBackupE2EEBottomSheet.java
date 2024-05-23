package com.zing.zalo.p077ui.zviews;

import ag0.AbstractC0837p0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p649xl.C30043t1;

/* loaded from: classes6.dex */
public final class ChangeOptionBackupE2EEBottomSheet extends BottomSheetZaloViewWithAnim {

    /* renamed from: W0 */
    private C30043t1 f72602W0;

    /* renamed from: qM */
    private final C30043t1 m78694qM() {
        C30043t1 c30043t1 = this.f72602W0;
        AbstractC19074t.m100205c(c30043t1);
        return c30043t1;
    }

    /* renamed from: rM */
    private final void m78695rM() {
        int i11;
        AbstractC23136l9.m118744r1(this.f72456O0, 8);
        ViewGroup.LayoutParams layoutParams = this.f72455N0.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            this.f72455N0.setLayoutParams(layoutParams);
        }
        m78539iM(true);
        this.f72454M0.setCanOverTranslateMaxY(true);
        m78694qM().f139369r.setIdTracking("backup_enable_e2ee_switch");
        m78694qM().f139369r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.y4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOptionBackupE2EEBottomSheet.m78696sM(ChangeOptionBackupE2EEBottomSheet.this, view);
            }
        });
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.z4
            @Override // java.lang.Runnable
            public final void run() {
                ChangeOptionBackupE2EEBottomSheet.m78697tM(ChangeOptionBackupE2EEBottomSheet.this);
            }
        });
        RobotoTextView robotoTextView = m78694qM().f139370s;
        if (C24720a.Companion.m128432a().m128393J()) {
            i11 = AbstractC8020f0.str_setting_backup_e2ee_v2;
        } else {
            i11 = AbstractC8020f0.str_setting_backup_e2ee;
        }
        robotoTextView.setText(AbstractC23136l9.m118743r0(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m78696sM(ChangeOptionBackupE2EEBottomSheet changeOptionBackupE2EEBottomSheet, View view) {
        AbstractC19074t.m100208f(changeOptionBackupE2EEBottomSheet, "this$0");
        changeOptionBackupE2EEBottomSheet.m78699vM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static final void m78697tM(final ChangeOptionBackupE2EEBottomSheet changeOptionBackupE2EEBottomSheet) {
        AbstractC19074t.m100208f(changeOptionBackupE2EEBottomSheet, "this$0");
        final boolean m133023A = AbstractC23306f.m120692n().m133023A();
        changeOptionBackupE2EEBottomSheet.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.b5
            @Override // java.lang.Runnable
            public final void run() {
                ChangeOptionBackupE2EEBottomSheet.m78698uM(ChangeOptionBackupE2EEBottomSheet.this, m133023A);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static final void m78698uM(ChangeOptionBackupE2EEBottomSheet changeOptionBackupE2EEBottomSheet, boolean z11) {
        AbstractC19074t.m100208f(changeOptionBackupE2EEBottomSheet, "this$0");
        changeOptionBackupE2EEBottomSheet.m78694qM().f139369r.setChecked(z11);
    }

    /* renamed from: vM */
    private final void m78699vM() {
        boolean isChecked = m78694qM().f139369r.isChecked();
        m78694qM().f139369r.setChecked(!isChecked);
        AbstractC23306f.m120692n().m133031K(!isChecked ? 1 : 0);
        mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.a5
            @Override // java.lang.Runnable
            public final void run() {
                ChangeOptionBackupE2EEBottomSheet.m78700wM(ChangeOptionBackupE2EEBottomSheet.this);
            }
        }, 400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m78700wM(ChangeOptionBackupE2EEBottomSheet changeOptionBackupE2EEBottomSheet) {
        AbstractC19074t.m100208f(changeOptionBackupE2EEBottomSheet, "this$0");
        changeOptionBackupE2EEBottomSheet.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return (this.f72454M0.getMeasuredHeight() - m78694qM().f139368q.getBottom()) - AbstractC23136l9.m118737p0();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        this.f72602W0 = C30043t1.m148509c(LayoutInflater.from(getContext()), linearLayout, true);
        m78695rM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMinTranslationY(mo37128eM());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ChangeOptionBackupE2EEBottomSheet";
    }
}
