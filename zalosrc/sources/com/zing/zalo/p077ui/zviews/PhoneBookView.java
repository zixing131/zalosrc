package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0852x;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23046d7;
import p348mi.AbstractC23309i;
import p716zh.C31849b1;

/* loaded from: classes.dex */
public class PhoneBookView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: U0 */
    static volatile PhoneBookView f75908U0;

    /* renamed from: V0 */
    static long f75909V0;

    /* renamed from: Q0 */
    TextView f75911Q0;

    /* renamed from: R0 */
    TextView f75912R0;

    /* renamed from: P0 */
    private final String f75910P0 = PhoneBookView.class.getSimpleName();

    /* renamed from: S0 */
    String f75913S0 = "";

    /* renamed from: T0 */
    private final SensitiveData f75914T0 = new SensitiveData("phonebook_sync_scan_in_phonebook_tab", "phonebook_sync");

    /* renamed from: jM */
    public static void m82590jM(int i11) {
        m82591kM(i11, "");
    }

    /* renamed from: kM */
    public static void m82591kM(int i11, String str) {
        try {
            if (m82592lM() != null) {
                m82592lM().m82595iM(i11);
            }
            if (ListContactNativeView.m81061KM() != null) {
                ListContactNativeView.m81061KM().m81110JM(i11, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    public static PhoneBookView m82592lM() {
        return f75908U0;
    }

    /* renamed from: oM */
    public /* synthetic */ void m82593oM(int i11) {
        try {
            if (AbstractC23309i.m122353rd() == 0) {
                if (!AbstractC0852x.m2364u() && !AbstractC0852x.m2365v()) {
                    if (AbstractC23309i.m121261O6() == 0) {
                        this.f75913S0 = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdatePhoneBookStateNone);
                    } else {
                        this.f75913S0 = AbstractC23160o0.m119185C(AbstractC23309i.m121261O6());
                    }
                }
                this.f75913S0 = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdating);
            } else {
                this.f75913S0 = AbstractC23160o0.m119185C(AbstractC23309i.m122353rd());
            }
            this.f72421L0.mo49315c4();
            if (AbstractC23309i.m121083Jd() != 1 && AbstractC23309i.m121083Jd() != 4) {
                this.f75912R0.setText(this.f75913S0);
                if (this.f72421L0.m92672lJ()) {
                    if (i11 == 0) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdateSuccessful));
                    }
                    if (i11 == 50001) {
                        ToastUtils.m89262j();
                        return;
                    } else {
                        ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_submit_contact_success_msg), Integer.valueOf(i11)));
                        return;
                    }
                }
                return;
            }
            this.f75912R0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phone_book_status_unknown_exception));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pM */
    public /* synthetic */ void m82594pM(View view) {
        if (!AbstractC0852x.m2364u() && !AbstractC0852x.m2365v()) {
            Context m92648SI = this.f72421L0.m92648SI();
            String[] strArr = AbstractC23034c6.f112032i;
            if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                AbstractC23034c6.m118186w0((BaseZaloActivity) this.f72421L0.m92648SI(), strArr, 101);
            } else if (C8937j0.m47663l(this.f75914T0.m35528c())) {
                m82598qM();
            } else {
                C23046d7.m118242e(getContext()).mo13822K();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        f75908U0 = this;
        AbstractC23126l.m118627a(this.f75910P0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.phonebook_view, viewGroup, false);
        m82597nM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        f75908U0 = null;
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_update_phonebook));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f72421L0.mo49315c4();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PhoneBookView";
    }

    /* renamed from: iM */
    void m82595iM(int i11) {
        try {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.q40

                /* renamed from: q */
                public final /* synthetic */ int f81668q;

                public /* synthetic */ q40(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PhoneBookView.this.m82593oM(r2);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m82596mM() {
        this.f75911Q0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.r40
            public /* synthetic */ r40() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBookView.this.m82594pM(view);
            }
        });
        if (AbstractC23309i.m122353rd() == 0) {
            if (!AbstractC0852x.m2365v() && !AbstractC0852x.m2364u()) {
                if (AbstractC23309i.m121261O6() == 0) {
                    this.f75913S0 = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdatePhoneBookStateNone);
                } else {
                    this.f75913S0 = AbstractC23160o0.m119185C(AbstractC23309i.m121261O6());
                }
            } else {
                this.f75913S0 = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdating);
            }
        } else {
            this.f75913S0 = AbstractC23160o0.m119185C(AbstractC23309i.m122353rd());
        }
        if (AbstractC23309i.m121083Jd() != 1 && AbstractC23309i.m121083Jd() != 4) {
            this.f75912R0.setText(this.f75913S0);
        } else {
            this.f75912R0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phone_book_status_unknown_exception));
        }
    }

    /* renamed from: nM */
    void m82597nM(View view) {
        this.f75912R0 = (TextView) view.findViewById(AbstractC6918a0.tv_last_update);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.tv_update_phone_book);
        this.f75911Q0 = textView;
        textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.btnUpdatePhoneBook).toUpperCase());
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            f75908U0 = null;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 101 && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0) {
            if (C8937j0.m47663l(this.f75914T0.m35528c())) {
                m82598qM();
                C31849b1.m153097n().m153106h(true);
            } else {
                C23046d7.m118242e(getContext()).mo13822K();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        f75908U0 = this;
        super.onResume();
    }

    /* renamed from: qM */
    void m82598qM() {
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        if (this.f75912R0 != null) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.txtUpdating);
            this.f75913S0 = m118743r0;
            this.f75912R0.setText(m118743r0);
        }
        if (System.currentTimeMillis() - f75909V0 > 3600000) {
            AbstractC23309i.m122105kr(0L);
            f75909V0 = System.currentTimeMillis();
        }
        AbstractC0852x.m2340Q(this.f75914T0);
        AbstractC23309i.m121139Kw(8);
        AbstractC23057e7.m118305l(true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m82596mM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
