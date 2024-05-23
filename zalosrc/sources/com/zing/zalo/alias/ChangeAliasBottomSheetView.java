package com.zing.zalo.alias;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import au.AbstractC2379w;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.ZaloView;
import dg0.AbstractC17927b;
import ed0.AbstractC18391a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24342w;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p458qr.C25470c;
import p458qr.C25471d;
import p542ub.InterfaceC27218a;
import p649xl.C30009r1;
import p710zb.C31755h;
import p710zb.InterfaceC31748a;
import p710zb.InterfaceC31751d;
import p710zb.InterfaceC31752e;
import zl0.AbstractC32234k;

/* loaded from: classes3.dex */
public final class ChangeAliasBottomSheetView extends BottomSheetZaloViewWithAnim implements InterfaceC31752e, KeyboardFrameLayout.InterfaceC13508a, C23744a.c {
    public static final C7288a Companion = new C7288a(null);

    /* renamed from: f1 */
    private static final float f39944f1 = AbstractC23136l9.m118742r(85.0f);

    /* renamed from: W0 */
    private C30009r1 f39945W0;

    /* renamed from: X0 */
    private ValueAnimator f39946X0;

    /* renamed from: Y0 */
    private InterfaceC31751d f39947Y0;

    /* renamed from: Z0 */
    private C7291a f39948Z0;

    /* renamed from: a1 */
    private int f39949a1;

    /* renamed from: b1 */
    private int f39950b1;

    /* renamed from: c1 */
    private int f39951c1;

    /* renamed from: d1 */
    private final int f39952d1 = MainApplication.Companion.m35500c().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);

    /* renamed from: e1 */
    private final C7289b f39953e1 = new C7289b();

    /* renamed from: com.zing.zalo.alias.ChangeAliasBottomSheetView$a */
    /* loaded from: classes3.dex */
    public static final class C7288a {
        private C7288a() {
        }

        public /* synthetic */ C7288a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m37139a(String str, String str2, int i11, SensitiveData sensitiveData) {
            AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
            Bundle bundle = new Bundle();
            bundle.putString("STR_PROFILE_UID", str);
            bundle.putString("STR_PROFILE_DPN", str2);
            bundle.putInt("INT_ACTION_FROM", i11);
            bundle.putString("STR_SOURCE_START_VIEW", "");
            bundle.putString("STR_LOG_CHAT_TYPE", "0");
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 8);
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", sensitiveData);
            return bundle;
        }

        /* renamed from: b */
        public final Bundle m37140b(String str, String str2, int i11, String str3, String str4, SensitiveData sensitiveData) {
            AbstractC19074t.m100208f(str3, "sourceStartView");
            AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
            Bundle bundle = new Bundle();
            bundle.putString("STR_PROFILE_UID", str);
            bundle.putString("STR_PROFILE_DPN", str2);
            bundle.putInt("INT_ACTION_FROM", i11);
            bundle.putString("STR_SOURCE_START_VIEW", str3);
            bundle.putString("STR_LOG_CHAT_TYPE", str4);
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 8);
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", sensitiveData);
            return bundle;
        }

        /* renamed from: c */
        public final Bundle m37141c(String str, String str2, String str3, String str4, int i11, SensitiveData sensitiveData) {
            AbstractC19074t.m100208f(sensitiveData, "sensitiveData");
            Bundle bundle = new Bundle();
            bundle.putString("STR_PROFILE_UID", str);
            bundle.putString("STR_PROFILE_DPN", str2);
            bundle.putString("STR_SUGGEST_TEXT", str3);
            bundle.putString("STR_HINT_TEXT", str4);
            bundle.putInt("INT_ACTION_FROM", i11);
            bundle.putString("STR_SOURCE_START_VIEW", "");
            bundle.putString("STR_LOG_CHAT_TYPE", "0");
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 8);
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", sensitiveData);
            return bundle;
        }
    }

    /* renamed from: com.zing.zalo.alias.ChangeAliasBottomSheetView$b */
    /* loaded from: classes3.dex */
    public static final class C7289b extends AbstractC18391a {
        C7289b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                String mo37115NB = ChangeAliasBottomSheetView.this.mo37115NB();
                InterfaceC31751d interfaceC31751d = ChangeAliasBottomSheetView.this.f39947Y0;
                if (interfaceC31751d == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC31751d = null;
                }
                int mo152746sc = interfaceC31751d.mo152746sc();
                if (mo37115NB.length() <= mo152746sc) {
                    ChangeAliasBottomSheetView.this.m37084MM(mo37115NB);
                    return;
                }
                ChangeAliasBottomSheetView.this.m37083LM().f139179s.removeTextChangedListener(this);
                ChangeAliasBottomSheetView changeAliasBottomSheetView = ChangeAliasBottomSheetView.this;
                String substring = mo37115NB.substring(0, mo152746sc);
                AbstractC19074t.m100207e(substring, "substring(...)");
                changeAliasBottomSheetView.mo37113H6(substring);
                ChangeAliasBottomSheetView.this.m37083LM().f139179s.addTextChangedListener(this);
                ChangeAliasBottomSheetView changeAliasBottomSheetView2 = ChangeAliasBottomSheetView.this;
                changeAliasBottomSheetView2.m37084MM(changeAliasBottomSheetView2.mo37115NB());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.alias.ChangeAliasBottomSheetView$c */
    /* loaded from: classes3.dex */
    public static final class C7290c extends ClickableSpan {

        /* renamed from: q */
        final /* synthetic */ String f39956q;

        C7290c(String str) {
            this.f39956q = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            try {
                InterfaceC31751d interfaceC31751d = ChangeAliasBottomSheetView.this.f39947Y0;
                if (interfaceC31751d == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC31751d = null;
                }
                interfaceC31751d.mo152735E6(this.f39956q);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            try {
                textPaint.setUnderlineText(false);
                textPaint.setColor(ChangeAliasBottomSheetView.this.f39951c1);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m37076EM(ChangeAliasBottomSheetView changeAliasBottomSheetView) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        AbstractC2379w.m12430d(changeAliasBottomSheetView.m37083LM().f139179s);
    }

    /* renamed from: FM */
    private final void m37077FM() {
        int i11;
        int m118737p0;
        KeyboardFrameLayout root = m37083LM().getRoot();
        int left = root.getLeft();
        int top = root.getTop();
        int right = root.getRight();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && m92676n2.mo35567d1()) {
            i11 = 0;
        } else {
            i11 = this.f39952d1;
        }
        root.setPadding(left, top, right, i11);
        AbstractC23136l9.m118744r1(this.f72456O0, 8);
        ViewGroup.LayoutParams layoutParams = this.f72455N0.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            this.f72455N0.setLayoutParams(layoutParams);
        }
        m78539iM(false);
        this.f72454M0.setCanOverTranslateMaxY(true);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        InterfaceC27218a m92676n22 = m92676n2();
        if (m92676n22 != null && m92676n22.mo35567d1()) {
            m118737p0 = 0;
        } else {
            m118737p0 = AbstractC23136l9.m118737p0();
        }
        bottomSheetLayout.setPadding(0, m118737p0, 0, 0);
        this.f72454M0.setSupportNestedScrollInBubble(true);
    }

    /* renamed from: GM */
    public static final Bundle m37078GM(String str, String str2, int i11, SensitiveData sensitiveData) {
        return Companion.m37139a(str, str2, i11, sensitiveData);
    }

    /* renamed from: HM */
    public static final Bundle m37079HM(String str, String str2, int i11, String str3, String str4, SensitiveData sensitiveData) {
        return Companion.m37140b(str, str2, i11, str3, str4, sensitiveData);
    }

    /* renamed from: IM */
    public static final Bundle m37080IM(String str, String str2, String str3, String str4, int i11, SensitiveData sensitiveData) {
        return Companion.m37141c(str, str2, str3, str4, i11, sensitiveData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m37081JM(ChangeAliasBottomSheetView changeAliasBottomSheetView) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        InterfaceC31751d interfaceC31751d = changeAliasBottomSheetView.f39947Y0;
        InterfaceC31751d interfaceC31751d2 = null;
        if (interfaceC31751d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d = null;
        }
        interfaceC31751d.mo152744k5();
        InterfaceC31751d interfaceC31751d3 = changeAliasBottomSheetView.f39947Y0;
        if (interfaceC31751d3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d3 = null;
        }
        interfaceC31751d3.mo152734Bh(changeAliasBottomSheetView.mo37115NB());
        InterfaceC31751d interfaceC31751d4 = changeAliasBottomSheetView.f39947Y0;
        if (interfaceC31751d4 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d4 = null;
        }
        interfaceC31751d4.mo152736Gl();
        InterfaceC31751d interfaceC31751d5 = changeAliasBottomSheetView.f39947Y0;
        if (interfaceC31751d5 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC31751d2 = interfaceC31751d5;
        }
        interfaceC31751d2.mo152733B5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m37082KM(ChangeAliasBottomSheetView changeAliasBottomSheetView) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        try {
            changeAliasBottomSheetView.m37083LM().f139179s.setEnabled(true);
            changeAliasBottomSheetView.m37083LM().f139178r.setEnabled(true);
            changeAliasBottomSheetView.m37083LM().f139177q.setEnabled(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public final C30009r1 m37083LM() {
        C30009r1 c30009r1 = this.f39945W0;
        AbstractC19074t.m100205c(c30009r1);
        return c30009r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public final void m37084MM(String str) {
        AbstractC20110a.f98889a.mo104548a("annv handleTextChange " + str, new Object[0]);
        InterfaceC31751d interfaceC31751d = null;
        mo37134me(false, null);
        if (str.length() == 0) {
            m37083LM().f139177q.setVisibility(8);
        } else {
            m37083LM().f139177q.setVisibility(0);
        }
        RobotoTextView robotoTextView = m37083LM().f139178r;
        InterfaceC31751d interfaceC31751d2 = this.f39947Y0;
        if (interfaceC31751d2 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d2 = null;
        }
        robotoTextView.setEnabled(interfaceC31751d2.mo152745md(str));
        InterfaceC31751d interfaceC31751d3 = this.f39947Y0;
        if (interfaceC31751d3 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d3 = null;
        }
        interfaceC31751d3.mo152743j9(str);
        InterfaceC31751d interfaceC31751d4 = this.f39947Y0;
        if (interfaceC31751d4 == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d4 = null;
        }
        interfaceC31751d4.mo152734Bh(str);
        RobotoTextView robotoTextView2 = m37083LM().f139170A;
        int length = str.length();
        InterfaceC31751d interfaceC31751d5 = this.f39947Y0;
        if (interfaceC31751d5 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC31751d = interfaceC31751d5;
        }
        robotoTextView2.setText(length + "/" + interfaceC31751d.mo152746sc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m37085OM(ChangeAliasBottomSheetView changeAliasBottomSheetView, View view) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        changeAliasBottomSheetView.mo37131g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m37086PM(ChangeAliasBottomSheetView changeAliasBottomSheetView, View view) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        changeAliasBottomSheetView.m37083LM().f139185y.setChecked(!changeAliasBottomSheetView.m37083LM().f139185y.isChecked());
        RobotoTextView robotoTextView = changeAliasBottomSheetView.m37083LM().f139178r;
        InterfaceC31751d interfaceC31751d = changeAliasBottomSheetView.f39947Y0;
        if (interfaceC31751d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d = null;
        }
        robotoTextView.setEnabled(interfaceC31751d.mo152745md(changeAliasBottomSheetView.mo37115NB()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m37087QM(ChangeAliasBottomSheetView changeAliasBottomSheetView, PhotoToggleButton photoToggleButton, boolean z11) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        AbstractC19074t.m100208f(photoToggleButton, "<anonymous parameter 0>");
        RobotoTextView robotoTextView = changeAliasBottomSheetView.m37083LM().f139178r;
        InterfaceC31751d interfaceC31751d = changeAliasBottomSheetView.f39947Y0;
        if (interfaceC31751d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d = null;
        }
        robotoTextView.setEnabled(interfaceC31751d.mo152745md(changeAliasBottomSheetView.mo37115NB()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m37088RM(final ChangeAliasBottomSheetView changeAliasBottomSheetView, View view) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_ACTION_SAVE_ALIAS", new Runnable() { // from class: zb.n
            @Override // java.lang.Runnable
            public final void run() {
                ChangeAliasBottomSheetView.m37089SM(ChangeAliasBottomSheetView.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public static final void m37089SM(ChangeAliasBottomSheetView changeAliasBottomSheetView) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        InterfaceC31751d interfaceC31751d = changeAliasBottomSheetView.f39947Y0;
        if (interfaceC31751d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d = null;
        }
        interfaceC31751d.mo152742i7(changeAliasBottomSheetView.mo37115NB());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m37090TM(ChangeAliasBottomSheetView changeAliasBottomSheetView, View view) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        changeAliasBottomSheetView.m37083LM().f139179s.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m37091UM(ChangeAliasBottomSheetView changeAliasBottomSheetView) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        AbstractC2379w.m12432f(changeAliasBottomSheetView.m37083LM().f139179s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m37092VM(int i11, ChangeAliasBottomSheetView changeAliasBottomSheetView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        changeAliasBottomSheetView.m37083LM().f139184x.setTranslationY(((Float) animatedValue).floatValue() * i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public static final void m37093WM(ChangeAliasBottomSheetView changeAliasBottomSheetView) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        AbstractC2379w.m12432f(changeAliasBottomSheetView.m37083LM().f139179s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public static final WindowInsets m37094XM(ChangeAliasBottomSheetView changeAliasBottomSheetView, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(changeAliasBottomSheetView, "this$0");
        AbstractC19074t.m100208f(windowInsets, "insets");
        final KeyboardFrameLayout root = changeAliasBottomSheetView.m37083LM().getRoot();
        root.post(new Runnable() { // from class: zb.l
            @Override // java.lang.Runnable
            public final void run() {
                ChangeAliasBottomSheetView.m37095YM(KeyboardFrameLayout.this);
            }
        });
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static final void m37095YM(KeyboardFrameLayout keyboardFrameLayout) {
        AbstractC19074t.m100208f(keyboardFrameLayout, "$this_apply");
        keyboardFrameLayout.requestLayout();
    }

    /* renamed from: ZM */
    private final void m37096ZM() {
        InterfaceC31751d interfaceC31751d = this.f39947Y0;
        if (interfaceC31751d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d = null;
        }
        interfaceC31751d.mo152737M4();
        m37084MM(mo37115NB());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        InterfaceC31748a m120648c = AbstractC23306f.m120648c();
        AbstractC19074t.m100207e(m120648c, "provideAliasRepository(...)");
        this.f39947Y0 = new C31755h(this, m120648c);
        this.f39948Z0 = C7291a.Companion.m37157a(this.f72421L0.m92642L3());
        InterfaceC31751d interfaceC31751d = this.f39947Y0;
        if (interfaceC31751d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d = null;
        }
        interfaceC31751d.mo995Nd(this.f39948Z0, null);
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: EE */
    public void mo37112EE(String str) {
        AbstractC19074t.m100208f(str, "hintInputAlias");
        m37083LM().f139179s.setHint(str);
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: H6 */
    public void mo37113H6(String str) {
        int i11;
        AbstractC19074t.m100208f(str, "currentInputAlias");
        m37083LM().f139179s.setText(str);
        EditTextWithContextMenu editTextWithContextMenu = m37083LM().f139179s;
        Editable text = m37083LM().f139179s.getText();
        if (text != null) {
            i11 = text.length();
        } else {
            i11 = 0;
        }
        editTextWithContextMenu.setSelection(i11);
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: Iy */
    public void mo37114Iy() {
        this.f72421L0.mo70710wy(new Runnable() { // from class: zb.o
            @Override // java.lang.Runnable
            public final void run() {
                ChangeAliasBottomSheetView.m37082KM(ChangeAliasBottomSheetView.this);
            }
        });
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: NB */
    public String mo37115NB() {
        String obj;
        Editable text = m37083LM().f139179s.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    /* renamed from: NM */
    public final void m37116NM() {
        m37077FM();
        m37083LM().f139172C.setOnClickListener(new View.OnClickListener() { // from class: zb.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAliasBottomSheetView.m37086PM(ChangeAliasBottomSheetView.this, view);
            }
        });
        m37083LM().f139185y.setOnCheckedChangeListener(new PhotoToggleButton.InterfaceC11847c() { // from class: zb.u
            @Override // com.zing.zalo.p077ui.custom.PhotoToggleButton.InterfaceC11847c
            /* renamed from: a */
            public final void mo37055a(PhotoToggleButton photoToggleButton, boolean z11) {
                ChangeAliasBottomSheetView.m37087QM(ChangeAliasBottomSheetView.this, photoToggleButton, z11);
            }
        });
        m37083LM().getRoot().setOnKeyboardListener(this);
        m37083LM().f139178r.setOnClickListener(new View.OnClickListener() { // from class: zb.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAliasBottomSheetView.m37088RM(ChangeAliasBottomSheetView.this, view);
            }
        });
        RecyclingImageView recyclingImageView = m37083LM().f139177q;
        recyclingImageView.setBackgroundResource(AbstractC23136l9.m118734o0(this.f72421L0.getContext(), false));
        recyclingImageView.setOnClickListener(new View.OnClickListener() { // from class: zb.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAliasBottomSheetView.m37090TM(ChangeAliasBottomSheetView.this, view);
            }
        });
        m37083LM().f139180t.setOnClickListener(new View.OnClickListener() { // from class: zb.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeAliasBottomSheetView.m37085OM(ChangeAliasBottomSheetView.this, view);
            }
        });
        m37083LM().f139173D.setMovementMethod(CustomMovementMethod.m56305e());
        EditTextWithContextMenu editTextWithContextMenu = m37083LM().f139179s;
        AbstractC32234k.m155469a(editTextWithContextMenu, AbstractC16803z.ed_text_cursor_app_accent);
        InputFilter[] inputFilterArr = new InputFilter[1];
        InterfaceC31751d interfaceC31751d = this.f39947Y0;
        if (interfaceC31751d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d = null;
        }
        inputFilterArr[0] = new InputFilter.LengthFilter(interfaceC31751d.mo152746sc());
        editTextWithContextMenu.setFilters(inputFilterArr);
        this.f39949a1 = C23212s8.m119607o(getContext(), AbstractC16781w.AppAccentColor);
        this.f39950b1 = C23212s8.m119607o(getContext(), AbstractC7354t0.NotificationColor1);
        this.f39951c1 = C23212s8.m119607o(getContext(), AbstractC16781w.LinkColor);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        NestedScrollView nestedScrollView = m37083LM().f139186z;
        AbstractC19074t.m100207e(nestedScrollView, "scrollContainer");
        return nestedScrollView;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.Companion.m124119a().m124117e(this, 6075);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        Bundle m92642L3;
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        try {
            ZaloView m92650VI = m92650VI();
            InterfaceC31751d interfaceC31751d = this.f39947Y0;
            if (interfaceC31751d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC31751d = null;
            }
            int m131953a = C25471d.m131951c().m131953a(interfaceC31751d.mo152740c());
            bundle.putInt("EXTRA_DATA_RETAIN_KEY", m131953a);
            if (m92650VI != null && (m92642L3 = m92650VI.m92642L3()) != null) {
                m92642L3.putInt("EXTRA_DATA_RETAIN_KEY", m131953a);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: Uz */
    public void mo37119Uz(String str) {
        int m127173b0;
        AbstractC19074t.m100208f(str, "currentInputAlias");
        if (str.length() == 0) {
            mo37137yn();
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alias_sgg_save_to_phonebook);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "%s", 0, false, 6, null);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        SpannableString spannableString = new SpannableString(format);
        int length = spannableString.length();
        if (m127173b0 != -1 && length != -1) {
            spannableString.setSpan(new StyleSpan(1), m127173b0, length, 33);
        }
        m37083LM().f139172C.setText(spannableString);
        m37083LM().f139175F.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: X0 */
    public boolean mo37120X0(float f11, boolean z11, float f12) {
        if (f12 >= f39944f1) {
            mo37131g();
            return true;
        }
        this.f72454M0.setMinimizedWithAnimation(false);
        return true;
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: X9 */
    public void mo37121X9() {
        m37083LM().f139173D.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            m37083LM().f139179s.postDelayed(new Runnable() { // from class: zb.q
                @Override // java.lang.Runnable
                public final void run() {
                    ChangeAliasBottomSheetView.m37093WM(ChangeAliasBottomSheetView.this);
                }
            }, 100L);
        }
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: ZA */
    public void mo37123ZA(boolean z11) {
        m37083LM().f139185y.setChecked(z11);
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: ZC */
    public boolean mo37124ZC() {
        if (AbstractC23034c6.m118167n(this.f72421L0.m92686rK(), AbstractC23034c6.f112032i) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (Build.VERSION.SDK_INT >= 30) {
            m37083LM().getRoot().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: zb.k
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsets m37094XM;
                    m37094XM = ChangeAliasBottomSheetView.m37094XM(ChangeAliasBottomSheetView.this, view2, windowInsets);
                    return m37094XM;
                }
            });
        }
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: bG */
    public void mo37126bG(String str, boolean z11) {
        int m127173b0;
        AbstractC19074t.m100208f(str, "contactName");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alias_sgg_contact_name_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "%s", 0, false, 6, null);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        spannableStringBuilder.append((CharSequence) format);
        int length = spannableStringBuilder.length();
        if (m127173b0 != -1 && length != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(1), m127173b0, length, 33);
        }
        if (z11) {
            spannableStringBuilder.append((CharSequence) " · ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) AbstractC23136l9.m118743r0(AbstractC8020f0.str_alias_sgg_contact_name_action));
            spannableStringBuilder.setSpan(new C7290c(str), length2, spannableStringBuilder.length(), 33);
        }
        m37083LM().f139173D.setText(spannableStringBuilder);
        m37083LM().f139173D.setVisibility(0);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim
    public void close() {
        this.f72827B0.postDelayed(new Runnable() { // from class: zb.r
            @Override // java.lang.Runnable
            public final void run() {
                ChangeAliasBottomSheetView.m37076EM(ChangeAliasBottomSheetView.this);
            }
        }, 100L);
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return AbstractC23136l9.m118713h0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && m92676n2.mo35567d1()) {
            return 0;
        }
        return this.f39952d1;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        this.f39945W0 = C30009r1.m148427c(LayoutInflater.from(getContext()), linearLayout, true);
        m37116NM();
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: ff */
    public boolean mo37130ff() {
        return m37083LM().f139185y.isChecked();
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: g */
    public void mo37131g() {
        close();
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
        return "ChangeAliasBottomSheetView";
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: go */
    public void mo37133go() {
        m37083LM().f139179s.setEnabled(false);
        m37083LM().f139178r.setEnabled(false);
        m37083LM().f139177q.setEnabled(false);
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: me */
    public void mo37134me(boolean z11, String str) {
        try {
            if (z11) {
                m37083LM().f139174E.setVisibility(0);
                m37083LM().f139174E.setText(str);
                m37083LM().f139181u.setBackgroundColor(this.f39950b1);
                try {
                    m37083LM().f139179s.selectAll();
                    m37083LM().f139179s.requestFocus();
                    m37083LM().f139179s.postDelayed(new Runnable() { // from class: zb.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChangeAliasBottomSheetView.m37091UM(ChangeAliasBottomSheetView.this);
                        }
                    }, 100L);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else {
                m37083LM().f139174E.setVisibility(8);
                m37083LM().f139181u.setBackgroundColor(this.f39949a1);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        InterfaceC27218a m92676n2;
        super.onResume();
        C23744a.Companion.m124119a().m124115b(this, 6075);
        m37096ZM();
        try {
            if ((this.f72421L0.m92676n2() instanceof ZaloActivity) && (m92676n2 = this.f72421L0.m92676n2()) != null) {
                m92676n2.mo35554O(18);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 6075) {
            try {
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                if (m92676n2 != null) {
                    m92676n2.runOnUiThread(new Runnable() { // from class: zb.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChangeAliasBottomSheetView.m37081JM(ChangeAliasBottomSheetView.this);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        C25470c m131954b;
        super.mo37135xJ(bundle);
        InterfaceC31751d interfaceC31751d = this.f39947Y0;
        InterfaceC31751d interfaceC31751d2 = null;
        if (interfaceC31751d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC31751d = null;
        }
        interfaceC31751d.mo152741d();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            int i11 = m92642L3.getInt("EXTRA_DATA_RETAIN_KEY", -1);
            AbstractC20110a.f98889a.mo104548a("annv dataRetainKey=" + i11, new Object[0]);
            if (i11 != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
                InterfaceC31751d interfaceC31751d3 = this.f39947Y0;
                if (interfaceC31751d3 == null) {
                    AbstractC19074t.m100223u("presenter");
                    interfaceC31751d3 = null;
                }
                interfaceC31751d3.mo152739b(m131954b);
            }
        }
        InterfaceC31751d interfaceC31751d4 = this.f39947Y0;
        if (interfaceC31751d4 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC31751d2 = interfaceC31751d4;
        }
        interfaceC31751d2.mo152738Tl();
        EditTextWithContextMenu editTextWithContextMenu = m37083LM().f139179s;
        editTextWithContextMenu.removeTextChangedListener(this.f39953e1);
        editTextWithContextMenu.addTextChangedListener(this.f39953e1);
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: y1 */
    public void mo37136y1(int i11) {
        if (!this.f72421L0.m92692wK().mo35576n3()) {
            return;
        }
        ValueAnimator valueAnimator = this.f39946X0;
        if (valueAnimator != null) {
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.cancel();
        }
        ViewGroup.LayoutParams layoutParams = m37083LM().f139186z.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = 0;
        m37083LM().f139186z.setLayoutParams(layoutParams2);
        m37083LM().f139184x.setTranslationY(0.0f);
    }

    @Override // p710zb.InterfaceC31752e
    /* renamed from: yn */
    public void mo37137yn() {
        m37083LM().f139175F.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
    /* renamed from: z3 */
    public void mo37138z3(final int i11) {
        if (!this.f72421L0.m92692wK().mo35576n3()) {
            return;
        }
        ValueAnimator valueAnimator = this.f39946X0;
        if (valueAnimator != null) {
            AbstractC19074t.m100205c(valueAnimator);
            valueAnimator.cancel();
        }
        ViewGroup.LayoutParams layoutParams = m37083LM().f139186z.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i11;
        m37083LM().f139186z.setLayoutParams(layoutParams2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m37083LM().f139184x.getTranslationY() / i11, -1.0f);
        this.f39946X0 = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(150L);
        }
        ValueAnimator valueAnimator2 = this.f39946X0;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zb.p
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ChangeAliasBottomSheetView.m37092VM(i11, this, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.f39946X0;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }
}
