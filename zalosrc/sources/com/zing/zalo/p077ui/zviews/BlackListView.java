package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7079h;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p304ks.C21912a;
import p542ub.InterfaceC27218a;
import t00.C26446c;
import vg.AbstractC28034c7;

/* loaded from: classes6.dex */
public final class BlackListView extends SlidableZaloView implements ZaloView.InterfaceC17426k, C7079h.b, InterfaceC0733x {

    /* renamed from: Q0 */
    MultiStateView f72423Q0;

    /* renamed from: R0 */
    ListView f72424R0;

    /* renamed from: S0 */
    C7079h f72425S0;

    /* renamed from: T0 */
    View f72426T0;

    /* renamed from: U0 */
    RobotoTextView f72427U0;

    /* renamed from: P0 */
    private final String f72422P0 = BlackListView.class.getSimpleName();

    /* renamed from: V0 */
    String f72428V0 = "";

    /* renamed from: W0 */
    int f72429W0 = -1;

    /* renamed from: X0 */
    int f72430X0 = 0;

    /* renamed from: Y0 */
    C21912a.g f72431Y0 = new C14109b();

    /* renamed from: Z0 */
    public boolean f72432Z0 = false;

    /* renamed from: a1 */
    InterfaceC0765j f72433a1 = new C0766k();

    /* renamed from: b1 */
    InterfaceC20094a f72434b1 = new C14110c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BlackListView$a */
    /* loaded from: classes6.dex */
    public class C14108a extends AbstractC28034c7 {
        C14108a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    C7079h c7079h = BlackListView.this.f72425S0;
                    c7079h.f38701s = false;
                    c7079h.notifyDataSetChanged();
                } else {
                    BlackListView.this.f72425S0.f38701s = true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BlackListView$b */
    /* loaded from: classes6.dex */
    class C14109b implements C21912a.g {
        C14109b() {
        }

        @Override // p304ks.C21912a.g
        /* renamed from: a */
        public void mo78527a() {
            BlackListView.this.m78526tM(true, 0);
        }

        @Override // p304ks.C21912a.g
        /* renamed from: b */
        public void mo78528b(C20096c c20096c) {
            BlackListView.this.m78526tM(false, c20096c.m104491c());
        }

        @Override // p304ks.C21912a.g
        /* renamed from: c */
        public void mo78529c() {
            BlackListView.this.m78526tM(false, 0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BlackListView$c */
    /* loaded from: classes6.dex */
    class C14110c implements InterfaceC20094a {
        C14110c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            BlackListView blackListView = BlackListView.this;
            blackListView.f72432Z0 = false;
            blackListView.f72421L0.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                BlackListView blackListView = BlackListView.this;
                blackListView.f72432Z0 = false;
                blackListView.f72421L0.mo49315c4();
                if (BlackListView.this.f72428V0.length() > 0 && !BlackListView.this.f72428V0.equalsIgnoreCase("null")) {
                    C21912a.m114159g().m114173o(BlackListView.this.f72428V0);
                    BlackListView.this.m78526tM(false, 0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BlackListView$d */
    /* loaded from: classes6.dex */
    public class C14111d extends C10866e {
        public C14111d(InterfaceC27218a interfaceC27218a, int i11, int i12) {
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
            m56392h0(false);
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            try {
                BlackListView.this.f72421L0.m92662fJ().m93069k2(SettingAllowViewSocialView.class, null, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f54823A.getContext(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* renamed from: jM */
    private int m78516jM() {
        int i11 = this.f72430X0;
        if (i11 != 1) {
            return i11 != 2 ? 150 : 107;
        }
        return 103;
    }

    /* renamed from: lM */
    private int m78517lM() {
        int i11 = this.f72430X0;
        if (i11 != 1) {
            return i11 != 2 ? 150 : 107;
        }
        return 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m78518nM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m78524rM(this.f72428V0, this.f72429W0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m78519oM(View view) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("fromBlackListActivity", true);
        bundle.putInt("intExtraTrackingSource", m78516jM());
        this.f72421L0.m92662fJ().m93066i2(ChooseMultiFriendsView.class, bundle, 1000, 1, true);
    }

    /* renamed from: qM */
    private void m78521qM() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            int i11 = 0;
            if (m92642L3.containsKey("int_extra_source_open")) {
                i11 = m92642L3.getInt("int_extra_source_open", 0);
            }
            this.f72430X0 = i11;
        }
    }

    @Override // com.zing.zalo.adapters.C7079h.b
    /* renamed from: C0 */
    public void mo36129C0(String str, int i11) {
        this.f72428V0 = str;
        this.f72429W0 = i11;
        try {
            m78524rM(str, i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        m78521qM();
        AbstractC23126l.m118627a(this.f72422P0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 0) {
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_remove_from_blacklist)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.w2
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        BlackListView.this.m78518nM(interfaceC17463d, i12);
                    }
                });
                return aVar.m43152a();
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.black_list_view, viewGroup, false);
        m78523mM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_blocked_timeline));
                m87077NK.setEnableTrailingButton(true);
                m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.u2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BlackListView.this.m78519oM(view);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.adapters.C7079h.b
    public Context getContext() {
        return this.f72421L0.m92648SI();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BlackListView";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kM */
    public void m78522kM() {
        try {
            C21912a.m114159g().m114164d(true, this.f72431Y0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m78523mM(View view) {
        this.f72426T0 = view.findViewById(AbstractC6918a0.ll_footer);
        this.f72427U0 = (RobotoTextView) view.findViewById(AbstractC6918a0.txt_footer);
        this.f72421L0.m92676n2().mo35554O(3);
        ListView listView = (ListView) view.findViewById(AbstractC6918a0.lv_black);
        this.f72424R0 = listView;
        listView.setOnScrollListener(new C14108a());
        if (C26446c.m136326b().m136330e()) {
            this.f72426T0.setVisibility(0);
            StringBuilder sb2 = new StringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_black_list_footer_text));
            sb2.append(" ");
            int length = sb2.length();
            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_black_list_footer_action));
            int length2 = sb2.length();
            SpannableString spannableString = new SpannableString(sb2);
            spannableString.setSpan(new C14111d(this.f72421L0.m92676n2(), length, length2), length, length2, 33);
            this.f72427U0.setMovementMethod(CustomMovementMethod.m56305e());
            this.f72427U0.setText(spannableString);
        } else {
            this.f72426T0.setVisibility(8);
        }
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f72423Q0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.x2
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                BlackListView.this.m78522kM();
            }
        });
        C7079h c7079h = new C7079h(this, C21912a.m114159g().m114167h());
        this.f72425S0 = c7079h;
        this.f72424R0.setAdapter((ListAdapter) c7079h);
        m78522kM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1000 && i12 == -1) {
            m78522kM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f72423Q0.getState().f81257p == MultiStateView.EnumC15914e.EMPTY.f81257p) {
            try {
                ((ImageView) this.f72423Q0.findViewById(AbstractC6918a0.imvEmpty)).setImageDrawable(AbstractC23136l9.m118665N(this.f72423Q0.getContext(), AbstractC16803z.illus_emptystate_list));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: rM */
    void m78524rM(String str, int i11) {
        if (this.f72432Z0) {
            return;
        }
        this.f72432Z0 = true;
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f72428V0 = str;
        this.f72433a1.mo1704o8(this.f72434b1);
        this.f72433a1.mo1466K4(str, new TrackingSource(m78517lM()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sM, reason: merged with bridge method [inline-methods] */
    public void m78520pM(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                MultiStateView multiStateView = this.f72423Q0;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                    this.f72423Q0.setState(MultiStateView.EnumC15914e.LOADING);
                }
                this.f72424R0.setVisibility(8);
                return;
            }
            if (C21912a.m114159g().m114167h().size() > 0) {
                MultiStateView multiStateView2 = this.f72423Q0;
                if (multiStateView2 != null) {
                    multiStateView2.setVisibility(8);
                }
                this.f72424R0.setVisibility(0);
            } else {
                this.f72424R0.setVisibility(8);
                if (i11 == 0) {
                    this.f72423Q0.setState(MultiStateView.EnumC15914e.EMPTY);
                    this.f72423Q0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.ignorelist_empty));
                    this.f72423Q0.setVisibility(0);
                } else {
                    this.f72423Q0.setState(MultiStateView.EnumC15914e.ERROR);
                    MultiStateView multiStateView3 = this.f72423Q0;
                    if (i11 == 50001) {
                        i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                    } else {
                        i12 = AbstractC8020f0.facebook_mag_emptyList;
                    }
                    multiStateView3.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
                    MultiStateView multiStateView4 = this.f72423Q0;
                    if (i11 == 50001) {
                        enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                    } else {
                        enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                    }
                    multiStateView4.setErrorType(enumC15915f);
                    this.f72423Q0.setVisibility(0);
                }
            }
            this.f72425S0.m36128e(C21912a.m114159g().m114167h());
            this.f72425S0.notifyDataSetChanged();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: tM */
    void m78526tM(final boolean z11, final int i11) {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.v2
            @Override // java.lang.Runnable
            public final void run() {
                BlackListView.this.m78520pM(z11, i11);
            }
        });
    }

    @Override // com.zing.zalo.adapters.C7079h.b
    /* renamed from: wg */
    public boolean mo36130wg() {
        return this.f72432Z0;
    }
}
