package com.zing.zalo.p077ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.KeyboardAwareRelativeLayout;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p588vw.C28652r;
import vg.C28020b3;
import y90.EnumC30861e;
import z90.AbstractC31727b;

/* loaded from: classes5.dex */
public class SetNicknamePopupView extends ZaloView implements TextWatcher, ZaloView.InterfaceC17421f, KeyboardFrameLayout.InterfaceC13508a, View.OnClickListener, View.OnFocusChangeListener {

    /* renamed from: T0 */
    static int f55403T0;

    /* renamed from: A0 */
    KeyboardAwareRelativeLayout f55404A0;

    /* renamed from: B0 */
    View f55405B0;

    /* renamed from: C0 */
    RobotoButton f55406C0;

    /* renamed from: D0 */
    RobotoButton f55407D0;

    /* renamed from: E0 */
    RedDotImageButton f55408E0;

    /* renamed from: F0 */
    View f55409F0;

    /* renamed from: G0 */
    View f55410G0;

    /* renamed from: H0 */
    StickerPanelView f55411H0;

    /* renamed from: I0 */
    KeyboardFrameLayout f55412I0;

    /* renamed from: J0 */
    RobotoTextView f55413J0;

    /* renamed from: K0 */
    RobotoTextView f55414K0;

    /* renamed from: L0 */
    String f55415L0;

    /* renamed from: M0 */
    String f55416M0;

    /* renamed from: N0 */
    String f55417N0;

    /* renamed from: O0 */
    String f55418O0;

    /* renamed from: x0 */
    Handler f55424x0;

    /* renamed from: z0 */
    ActionEditText f55426z0;

    /* renamed from: w0 */
    int f55423w0 = 40;

    /* renamed from: y0 */
    boolean f55425y0 = false;

    /* renamed from: P0 */
    int f55419P0 = 1;

    /* renamed from: Q0 */
    boolean f55420Q0 = true;

    /* renamed from: R0 */
    final Runnable f55421R0 = new RunnableC10957a();

    /* renamed from: S0 */
    int f55422S0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.SetNicknamePopupView$a */
    /* loaded from: classes5.dex */
    public class RunnableC10957a implements Runnable {
        RunnableC10957a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (SetNicknamePopupView.this.f55426z0.getText().length() > 0) {
                    ActionEditText actionEditText = SetNicknamePopupView.this.f55426z0;
                    if (actionEditText != null) {
                        actionEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                        SetNicknamePopupView.this.f55426z0.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
                    }
                    SetNicknamePopupView setNicknamePopupView = SetNicknamePopupView.this;
                    setNicknamePopupView.f55424x0.postDelayed(setNicknamePopupView.f55421R0, 50L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.SetNicknamePopupView$b */
    /* loaded from: classes5.dex */
    public class C10958b extends AbstractC31727b {
        C10958b() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            SetNicknamePopupView setNicknamePopupView = SetNicknamePopupView.this;
            ActionEditText actionEditText = setNicknamePopupView.f55426z0;
            if (actionEditText != null && (setNicknamePopupView.f55423w0 - actionEditText.length()) - str.length() >= 0) {
                SetNicknamePopupView.this.f55426z0.getText().insert(SetNicknamePopupView.this.f55426z0.getSelectionEnd(), str);
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_edittext));
            }
        }
    }

    /* renamed from: MK */
    private void m56956MK() {
        this.f55411H0.m72709oO(new C10958b());
    }

    /* renamed from: OK */
    public static SetNicknamePopupView m56957OK(String str, String str2, String str3, String str4, int i11) {
        SetNicknamePopupView setNicknamePopupView = new SetNicknamePopupView();
        setNicknamePopupView.m56965PK(str, str2, str3, str4, i11);
        return setNicknamePopupView;
    }

    /* renamed from: RK */
    private void m56958RK(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: SK */
    private void m56959SK() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f55411H0 = (StickerPanelView) m92996E0;
        }
        if (this.f55411H0 != null) {
            m56956MK();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        f55403T0 = 0;
        this.f55424x0 = new Handler(Looper.getMainLooper());
        if (bundle != null) {
            this.f55415L0 = bundle.getString("title");
            this.f55418O0 = bundle.getString("nickname");
            this.f55416M0 = bundle.getString("desc");
            this.f55417N0 = bundle.getString("textHintInputName");
            this.f55423w0 = bundle.getInt("maxLength");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.popup_set_nickname, (ViewGroup) null);
        m56964NK(inflate);
        return inflate;
    }

    /* renamed from: JK */
    public void m56960JK() {
        AbstractC2379w.m12430d(this.f55426z0);
        this.f88762c0.finish();
    }

    /* renamed from: KK */
    void m56961KK() {
        if (this.f55411H0 != null) {
            this.f55409F0.setVisibility(4);
            this.f55410G0.setVisibility(4);
            m56958RK(this.f55411H0, false);
        }
    }

    /* renamed from: Ka */
    public void m56962Ka(int i11) {
        this.f55422S0 = i11;
        int m122007i5 = AbstractC23309i.m122007i5(m92689tK());
        try {
            int i12 = this.f55422S0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        KeyboardAwareRelativeLayout keyboardAwareRelativeLayout = this.f55404A0;
                        if (keyboardAwareRelativeLayout != null) {
                            keyboardAwareRelativeLayout.setGravity(80);
                        }
                        AbstractC2379w.m12430d(this.f55426z0);
                        this.f55408E0.setImageResource(AbstractC16803z.icn_emoji_o);
                        this.f55412I0.setPaddingBottom(m122007i5);
                        this.f55412I0.requestLayout();
                        if (this.f55411H0 == null) {
                            m56963LK(m122007i5);
                        } else {
                            C23744a.m124114c().m124116d(8006, Integer.valueOf(m122007i5));
                        }
                        m56966QK();
                        return;
                    }
                    return;
                }
                m56961KK();
                KeyboardAwareRelativeLayout keyboardAwareRelativeLayout2 = this.f55404A0;
                if (keyboardAwareRelativeLayout2 != null) {
                    keyboardAwareRelativeLayout2.setGravity(80);
                }
                this.f55408E0.setImageResource(AbstractC16803z.icn_emoji);
                this.f55412I0.setPaddingBottom(m122007i5);
                this.f55412I0.requestLayout();
                AbstractC2379w.m12432f(this.f55426z0);
                return;
            }
            m56961KK();
            this.f55404A0.setGravity(17);
            AbstractC2379w.m12430d(this.f55426z0);
            this.f55408E0.setImageResource(AbstractC16803z.icn_emoji);
            this.f55412I0.setPaddingBottom(0);
            this.f55412I0.requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LK */
    public void m56963LK(int i11) {
        this.f55409F0.setVisibility(0);
        this.f55410G0 = this.f55412I0.findViewById(AbstractC6918a0.sep_sticker_panel);
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142419r, 6, false, true, null, null, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", m92676n2()), true, 1, AbstractC16781w.indicator_bg_color, false, i11, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f55411H0 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f55411H0, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m56956MK();
        }
    }

    /* renamed from: NK */
    void m56964NK(View view) {
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.display_name);
        this.f55413J0 = robotoTextView;
        robotoTextView.setText(this.f55415L0);
        this.f55414K0 = (RobotoTextView) view.findViewById(AbstractC6918a0.message);
        if (TextUtils.isEmpty(this.f55416M0)) {
            this.f55414K0.setVisibility(8);
        } else {
            this.f55414K0.setVisibility(0);
            this.f55414K0.setText(this.f55416M0);
        }
        RedDotImageButton redDotImageButton = (RedDotImageButton) view.findViewById(AbstractC6918a0.imgEmoSticker);
        this.f55408E0 = redDotImageButton;
        AbstractC23136l9.m118696b1(redDotImageButton, AbstractC23136l9.m118718j(view.getContext()));
        this.f55408E0.setOnClickListener(this);
        this.f55404A0 = (KeyboardAwareRelativeLayout) view.findViewById(AbstractC6918a0.layoutPopupRoot);
        this.f55405B0 = view.findViewById(AbstractC6918a0.layoutPopupTextMode);
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) view.findViewById(AbstractC6918a0.keyboard_frame_layout);
        this.f55412I0 = keyboardFrameLayout;
        keyboardFrameLayout.setOnClickListener(this);
        this.f55412I0.setTopViewGroup(this.f55404A0);
        this.f55412I0.setOnKeyboardListener(this);
        ActionEditText actionEditText = (ActionEditText) view.findViewById(AbstractC6918a0.chatinput_text);
        this.f55426z0 = actionEditText;
        actionEditText.setHint(" " + ((Object) this.f55426z0.getHint()));
        this.f55426z0.setMaxLines(1);
        this.f55426z0.setOnClickListener(this);
        this.f55426z0.setHint(this.f55417N0);
        if (!TextUtils.isEmpty(this.f55418O0)) {
            this.f55426z0.setText(this.f55418O0);
            this.f55426z0.setSelection(this.f55418O0.length());
        }
        this.f55426z0.addTextChangedListener(this);
        this.f55426z0.setOnFocusChangeListener(this);
        this.f55409F0 = view.findViewById(AbstractC6918a0.sticker_panel_main_layout);
        ArrayList<View> arrayList = new ArrayList<>();
        View view2 = this.f55409F0;
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f55412I0.setBottomViewsGroup(arrayList);
        RobotoButton robotoButton = (RobotoButton) view.findViewById(AbstractC6918a0.confirm_btn_yes);
        this.f55406C0 = robotoButton;
        robotoButton.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_saved));
        this.f55406C0.setOnClickListener(this);
        RobotoButton robotoButton2 = (RobotoButton) view.findViewById(AbstractC6918a0.confirm_btn_no);
        this.f55407D0 = robotoButton2;
        robotoButton2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel));
        this.f55407D0.setOnClickListener(this);
    }

    /* renamed from: PK */
    void m56965PK(String str, String str2, String str3, String str4, int i11) {
        this.f55415L0 = str;
        this.f55418O0 = str3;
        this.f55416M0 = str2;
        this.f55417N0 = str4;
        this.f55423w0 = i11;
        this.f55420Q0 = TextUtils.isEmpty(str3);
    }

    /* renamed from: QK */
    void m56966QK() {
        try {
            StickerPanelView stickerPanelView = this.f55411H0;
            if (stickerPanelView != null) {
                m56958RK(stickerPanelView, true);
                this.f55410G0.setVisibility(0);
                this.f55409F0.setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putString("title", this.f55415L0);
        bundle.putString("nickname", this.f55418O0);
        bundle.putString("desc", this.f55416M0);
        bundle.putString("textHintInputName", this.f55417N0);
        bundle.putInt("maxLength", this.f55423w0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        if (!(this.f88762c0.m92662fJ().m93012K0() instanceof SetNicknamePopupView)) {
            m56960JK();
        }
    }

    /* renamed from: Vf */
    void m56967Vf() {
        try {
            this.f55426z0.setVisibility(0);
            this.f55426z0.requestFocus();
            this.f55419P0 = 2;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (this.f88762c0.m92676n2() != null && this.f88762c0.m92676n2().getWindow() != null) {
                this.f88762c0.m92676n2().mo35554O(18);
                this.f55404A0.setEnableMeasureKeyboard(false);
            }
            ActionEditText actionEditText = this.f55426z0;
            if (actionEditText != null) {
                actionEditText.requestFocus();
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        try {
            String obj = this.f55426z0.getText().toString();
            int length = obj.length();
            int i11 = this.f55423w0;
            if (length > i11) {
                this.f55426z0.setText(obj.substring(0, i11));
                this.f55426z0.setSelection(this.f55423w0);
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_edittext));
            }
            C28652r.m143349v().m143362X(editable, this.f55426z0.getTextSize());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    /* renamed from: oi */
    void m56968oi() {
        try {
            this.f55426z0.setVisibility(0);
            this.f55426z0.requestFocus();
            this.f55419P0 = 1;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.chatinput_text) {
            if (!this.f55425y0) {
                m56962Ka(1);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.imgEmoSticker) {
            if (this.f55422S0 == 2 && !this.f55425y0) {
                m56962Ka(1);
                return;
            } else {
                m56962Ka(2);
                return;
            }
        }
        if (id2 != AbstractC6918a0.confirm_btn_no && id2 != AbstractC6918a0.keyboard_frame_layout) {
            if (id2 == AbstractC6918a0.confirm_btn_yes) {
                AbstractC23647d.m123897g("10060006");
                Intent intent = new Intent();
                intent.putExtra("nickname", this.f55426z0.getText().toString().trim());
                this.f88762c0.mo50035CK(-1, intent);
                this.f88762c0.finish();
                AbstractC2379w.m12430d(this.f55426z0);
                return;
            }
            return;
        }
        AbstractC23647d.m123897g("10060007");
        m56960JK();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z11) {
        if (z11 && !this.f55425y0) {
            m56962Ka(1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            StickerPanelView stickerPanelView = this.f55411H0;
            if (stickerPanelView != null && !stickerPanelView.m92679oJ()) {
                m56962Ka(0);
                return true;
            }
            AbstractC23647d.m123897g("10060007");
            m56960JK();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        if (TextUtils.isEmpty(charSequence)) {
            m56968oi();
            return;
        }
        if (this.f55420Q0) {
            AbstractC23647d.m123897g("10060005");
            this.f55420Q0 = false;
        }
        m56967Vf();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            m56959SK();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: y1 */
    public void mo37136y1(int i11) {
        this.f55425y0 = false;
        if (this.f55422S0 != 2) {
            this.f55404A0.setGravity(17);
            this.f55412I0.setPaddingBottom(0);
            this.f55412I0.requestLayout();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: z3 */
    public void mo37138z3(int i11) {
        this.f55425y0 = true;
    }
}
