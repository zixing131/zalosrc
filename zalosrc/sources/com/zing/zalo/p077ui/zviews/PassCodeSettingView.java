package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.core.hardware.fingerprint.C1433a;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.C17460a;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import p161fg.C18922m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import s00.AbstractC26080o;
import th.AbstractC26681b;
import vg.C28023b6;

/* loaded from: classes6.dex */
public class PassCodeSettingView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    RelativeLayout f75781P0;

    /* renamed from: Q0 */
    RelativeLayout f75782Q0;

    /* renamed from: R0 */
    RelativeLayout f75783R0;

    /* renamed from: S0 */
    StencilSwitch f75784S0;

    /* renamed from: T0 */
    TextView f75785T0;

    /* renamed from: U0 */
    View f75786U0;

    /* renamed from: V0 */
    C17460a f75787V0;

    /* renamed from: W0 */
    String[] f75788W0;

    /* renamed from: X0 */
    int[] f75789X0;

    /* renamed from: Y0 */
    int f75790Y0 = -1;

    /* renamed from: Z0 */
    int f75791Z0;

    /* renamed from: a1 */
    RelativeLayout f75792a1;

    /* renamed from: b1 */
    StencilSwitch f75793b1;

    /* renamed from: kM */
    public static /* synthetic */ boolean m82471kM(View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(AbstractC23136l9.m118665N(view.getContext(), ((Integer) obj).intValue()));
            return true;
        }
        return false;
    }

    /* renamed from: lM */
    public /* synthetic */ void m82472lM() {
        this.f75785T0.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_destimeoutPssCode), this.f75788W0[this.f75790Y0]));
    }

    /* renamed from: mM */
    public /* synthetic */ void m82473mM(InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        String str;
        this.f75790Y0 = i11;
        int[] iArr = this.f75789X0;
        if (iArr.length > i11) {
            i12 = iArr[i11];
        } else {
            i12 = AbstractC26080o.a.f124275b;
        }
        AbstractC23309i.m122505vh(i12);
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.n30
            public /* synthetic */ n30() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                PassCodeSettingView.this.m82472lM();
            }
        });
        int i13 = this.f75790Y0;
        if (i13 == 0) {
            str = "37144";
        } else if (i13 == 1) {
            str = "37145";
        } else if (i13 == 2) {
            str = "37146";
        } else if (i13 == 3) {
            str = "37147";
        } else if (i13 == 4) {
            str = "37148";
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            AbstractC23647d.m123906p(str);
            AbstractC23647d.m123893c();
        }
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.passcodesettings, viewGroup, false);
        m82474jM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titlePssCodeAct));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 != 16908332) {
            return super.mo37491QJ(i11);
        }
        finish();
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C17460a c17460a = this.f75787V0;
        if (c17460a != null && c17460a.m92868m()) {
            this.f75787V0.dismiss();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PassCodeSettingView";
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x012a, code lost:            if (r8.m7316e() != false) goto L86;     */
    /* renamed from: jM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m82474jM(View view) {
        int[] iArr;
        boolean z11;
        int i11;
        this.f75791Z0 = AbstractC23309i.m122339r();
        this.f75788W0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_active_time_passcode);
        this.f75789X0 = AbstractC23136l9.m118698c0().getIntArray(AbstractC16775v.array_active_time_passcode_as_second);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            iArr = this.f75789X0;
            if (i13 >= iArr.length) {
                break;
            }
            if (this.f75791Z0 == iArr[i13]) {
                this.f75790Y0 = i13;
                break;
            }
            i13++;
        }
        int i14 = this.f75790Y0;
        boolean z12 = true;
        if ((i14 < 0 || i14 > iArr.length - 1) && iArr.length > 1) {
            this.f75790Y0 = 1;
            AbstractC23309i.m122505vh(iArr[1]);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutusepasscode);
        this.f75781P0 = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.f75792a1 = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutusepasscode_fingerprint);
        this.f75793b1 = (StencilSwitch) view.findViewById(AbstractC6918a0.switchUseFingerPrint);
        this.f75786U0 = view.findViewById(AbstractC6918a0.passcode_setting_fingerprint_separate_line);
        StencilSwitch stencilSwitch = this.f75793b1;
        if (AbstractC23309i.m121192Mb() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        stencilSwitch.setChecked(z11);
        this.f75793b1.setOnClickListener(this);
        this.f75792a1.setOnClickListener(this);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutchangepasscode);
        this.f75782Q0 = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
        RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutsettingTimePassCode);
        this.f75783R0 = relativeLayout3;
        relativeLayout3.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tv_desactivetimepasscode);
        this.f75785T0 = textView;
        textView.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_destimeoutPssCode), this.f75788W0[this.f75790Y0]));
        if (!AbstractC23165o5.m119333b()) {
            this.f75782Q0.setEnabled(false);
            this.f75783R0.setEnabled(false);
            this.f75792a1.setEnabled(false);
            this.f75793b1.setEnabled(false);
            this.f75793b1.setAlpha(0.6f);
        } else {
            this.f75782Q0.setEnabled(true);
            this.f75783R0.setEnabled(true);
            this.f75792a1.setEnabled(true);
            this.f75793b1.setEnabled(true);
            this.f75793b1.setAlpha(1.0f);
        }
        StencilSwitch stencilSwitch2 = (StencilSwitch) view.findViewById(AbstractC6918a0.switchUsePasscode);
        this.f75784S0 = stencilSwitch2;
        stencilSwitch2.setChecked(AbstractC23165o5.m119333b());
        this.f75784S0.setOnClickListener(this);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                C1433a m7309b = C1433a.m7309b(MainApplication.getAppContext());
                if (AbstractC23309i.m121155Lb() == 1 && m7309b != null) {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        z12 = false;
        RelativeLayout relativeLayout4 = this.f75792a1;
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        relativeLayout4.setVisibility(i11);
        View view2 = this.f75786U0;
        if (!z12) {
            i12 = 8;
        }
        view2.setVisibility(i12);
    }

    /* renamed from: nM */
    void m82475nM() {
        int i11;
        int i12;
        int length = this.f75788W0.length;
        int i13 = this.f75790Y0;
        if (i13 < 0 || i13 > length - 1) {
            this.f75790Y0 = 1;
            int[] iArr = this.f75789X0;
            if (iArr.length > 1) {
                i11 = iArr[1];
            } else {
                i11 = AbstractC26080o.a.f124275b;
            }
            AbstractC23309i.m122505vh(i11);
        }
        int[] iArr2 = new int[length];
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != this.f75790Y0) {
                i12 = AbstractC16803z.btn_radio_off_holo_light;
            } else {
                i12 = AbstractC16803z.btn_radio_on_holo_light;
            }
            iArr2[i14] = i12;
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.f75788W0[i14]);
            hashMap.put("icon", Integer.valueOf(iArr2[i14]));
            arrayList.add(hashMap);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
        simpleAdapter.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: com.zing.zalo.ui.zviews.l30
            @Override // android.widget.SimpleAdapter.ViewBinder
            public final boolean setViewValue(View view, Object obj, String str) {
                boolean m82471kM;
                m82471kM = PassCodeSettingView.m82471kM(view, obj, str);
                return m82471kM;
            }
        });
        C17460a.a aVar = new C17460a.a(this.f72421L0.m92648SI());
        aVar.m92832c(true);
        aVar.m92831b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.m30
            public /* synthetic */ m30() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                PassCodeSettingView.this.m82473mM(interfaceC17463d, i15);
            }
        });
        C17460a m92830a = aVar.m92830a();
        this.f75787V0 = m92830a;
        if (m92830a != null && !m92830a.m92868m()) {
            this.f75787V0.mo13822K();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        int[] iArr;
        int i13;
        if (i11 == 1000) {
            try {
                this.f75784S0.setChecked(AbstractC23165o5.m119333b());
                if (i12 == -1) {
                    if (this.f75784S0.isChecked()) {
                        String name = this.f72421L0.m92648SI().getClass().getName();
                        AbstractC23304d.f113302M0 = name;
                        AbstractC23309i.m122617yi(name);
                        AbstractC23304d.f113334U0 = false;
                        this.f75782Q0.setEnabled(true);
                        this.f75783R0.setEnabled(true);
                        this.f75792a1.setEnabled(true);
                        this.f75793b1.setEnabled(true);
                        this.f75793b1.setAlpha(1.0f);
                        this.f75791Z0 = AbstractC23309i.m122339r();
                        int i14 = 0;
                        while (true) {
                            iArr = this.f75789X0;
                            if (i14 >= iArr.length) {
                                break;
                            }
                            if (this.f75791Z0 == iArr[i14]) {
                                this.f75790Y0 = i14;
                                break;
                            }
                            i14++;
                        }
                        int i15 = this.f75790Y0;
                        if (i15 < 0 || i15 > iArr.length - 1) {
                            this.f75790Y0 = 1;
                            if (iArr.length > 1) {
                                i13 = iArr[1];
                            } else {
                                i13 = AbstractC26080o.a.f124275b;
                            }
                            AbstractC23309i.m122505vh(i13);
                        }
                        this.f75785T0.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_destimeoutPssCode), this.f75788W0[this.f75790Y0]));
                        return;
                    }
                    this.f75782Q0.setEnabled(false);
                    this.f75783R0.setEnabled(false);
                    this.f75792a1.setEnabled(false);
                    this.f75793b1.setEnabled(false);
                    this.f75793b1.setAlpha(0.6f);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        int id2 = view.getId();
        int i11 = AbstractC6918a0.layoutusepasscode;
        int i12 = AbstractC26080o.a.f124275b;
        if (id2 == i11) {
            boolean isChecked = this.f75784S0.isChecked();
            if (!this.f75784S0.isChecked()) {
                Bundle bundle = new Bundle();
                bundle.putInt("case_passcode_process", 0);
                this.f72421L0.m92662fJ().m93066i2(PasscodeView.class, bundle, 1000, 1, true);
            } else {
                this.f75784S0.setChecked(false);
                AbstractC23309i.m122523vz(this.f75784S0.isChecked());
                if (!AbstractC23165o5.m119333b()) {
                    AbstractC23304d.f113266D0 = false;
                    AbstractC23304d.f113270E0 = false;
                    AbstractC23304d.f113306N0 = 0;
                    AbstractC23304d.f113298L0 = "";
                    AbstractC23304d.f113302M0 = "";
                    AbstractC23304d.f113310O0 = 0L;
                    AbstractC23309i.m122020ih();
                    AbstractC23309i.m122523vz(false);
                    AbstractC23309i.m121137Ku(MainApplication.getAppContext(), "");
                    int[] iArr = this.f75789X0;
                    if (iArr.length > 1) {
                        i12 = iArr[1];
                    }
                    AbstractC23309i.m122505vh(i12);
                    this.f75782Q0.setEnabled(false);
                    this.f75783R0.setEnabled(false);
                    this.f75792a1.setEnabled(false);
                    this.f75793b1.setEnabled(false);
                    this.f75793b1.setAlpha(0.6f);
                } else {
                    C18922m.m99141t().m99156p();
                }
                if (AbstractC26681b.f126356a && !AbstractC23034c6.m118126L(MainApplication.getAppContext()) && !C28023b6.m141250h0().m141329a0()) {
                    AbstractC23034c6.m118182u0(this.f72421L0.m92662fJ(), 0);
                }
            }
            if (isChecked) {
                str = "37141";
            } else {
                str = "37142";
            }
            AbstractC23647d.m123906p(str);
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.switchUseFingerPrint) {
            StencilSwitch stencilSwitch = this.f75784S0;
            if (stencilSwitch != null && stencilSwitch.isChecked()) {
                this.f75793b1.setChecked(!r1.isChecked());
                AbstractC23309i.m121546Vw(this.f75793b1.isChecked() ? 1 : 0);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.layoutusepasscode_fingerprint) {
            StencilSwitch stencilSwitch2 = this.f75784S0;
            if (stencilSwitch2 != null && stencilSwitch2.isChecked()) {
                this.f75793b1.setChecked(!r1.isChecked());
                AbstractC23309i.m121546Vw(this.f75793b1.isChecked() ? 1 : 0);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.layoutchangepasscode) {
            if (AbstractC23165o5.m119333b()) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("case_passcode_process", 1);
                this.f72421L0.m92662fJ().m93069k2(PasscodeView.class, bundle2, 1, true);
            }
            AbstractC23647d.m123906p("37143");
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.layoutsettingTimePassCode) {
            m82475nM();
            return;
        }
        if (id2 == AbstractC6918a0.switchUsePasscode) {
            this.f75784S0.setChecked(!r1.isChecked());
            if (this.f75784S0.isChecked()) {
                if (!AbstractC23165o5.m119333b()) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("case_passcode_process", 0);
                    this.f72421L0.m92662fJ().m93066i2(PasscodeView.class, bundle3, 1000, 1, true);
                    return;
                }
                return;
            }
            AbstractC23309i.m122523vz(this.f75784S0.isChecked());
            if (!AbstractC23165o5.m119333b()) {
                AbstractC23304d.f113266D0 = false;
                AbstractC23304d.f113270E0 = false;
                AbstractC23304d.f113306N0 = 0;
                AbstractC23304d.f113298L0 = "";
                AbstractC23304d.f113302M0 = "";
                AbstractC23304d.f113310O0 = 0L;
                AbstractC23309i.m122020ih();
                AbstractC23309i.m122523vz(false);
                AbstractC23309i.m121137Ku(MainApplication.getAppContext(), "");
                int[] iArr2 = this.f75789X0;
                if (iArr2.length > 1) {
                    i12 = iArr2[1];
                }
                AbstractC23309i.m122505vh(i12);
                this.f75782Q0.setEnabled(false);
                this.f75783R0.setEnabled(false);
                this.f75792a1.setEnabled(false);
                this.f75793b1.setEnabled(false);
                this.f75793b1.setAlpha(0.6f);
            } else {
                C18922m.m99141t().m99156p();
            }
            if (AbstractC26681b.f126356a && !AbstractC23034c6.m118126L(MainApplication.getAppContext()) && !C28023b6.m141250h0().m141329a0()) {
                AbstractC23034c6.m118182u0(this.f72421L0.m92662fJ(), 0);
            }
        }
    }
}
