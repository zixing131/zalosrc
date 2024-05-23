package com.zing.zalo.uicontrol.contentpickerpopup;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.ViewOnKeyListenerC7058f0;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView;
import com.zing.zalo.uicontrol.contentpickerpopup.EmojiPopupView;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import sc0.InterfaceC26227e;

/* loaded from: classes4.dex */
public class EmojiPopupView extends ContentPickerPopupView {

    /* renamed from: O0 */
    private ListView f83670O0;

    /* renamed from: P0 */
    private View f83671P0;

    /* renamed from: Q0 */
    private boolean f83672Q0 = false;

    /* renamed from: R0 */
    protected boolean f83673R0;

    /* renamed from: S0 */
    int f83674S0;

    /* renamed from: T0 */
    int f83675T0;

    /* renamed from: com.zing.zalo.uicontrol.contentpickerpopup.EmojiPopupView$a */
    /* loaded from: classes4.dex */
    class C16569a extends ContentPickerPopupView.C16567a {
        C16569a(Context context, int i11, InterfaceC26227e interfaceC26227e) {
            super(context, i11, interfaceC26227e);
        }

        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
        /* renamed from: u */
        public boolean mo88286u(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                dismiss();
                return true;
            }
            return super.mo88286u(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mL */
    public /* synthetic */ void m88284mL(View view) {
        try {
            TextUtils.isEmpty(((StickerView) view).getEmoticon());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nL */
    public /* synthetic */ boolean m88285nL(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f83672Q0 = m92642L3().getBoolean("useBackground");
        this.f83673R0 = m92642L3().getBoolean("showArrowAbove");
        this.f83674S0 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        this.f83674S0 = Math.max(this.f83674S0, AbstractC23136l9.m118712h(getContext(), 170.0f));
        this.f83675T0 = m92642L3().getInt("y");
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        return new C16569a(m92648SI(), mo78533aL(), this);
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: aL */
    protected int mo78533aL() {
        return R.style.Theme.Panel;
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    protected View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.emoji_popup, viewGroup, false);
        this.f83670O0 = (ListView) inflate.findViewById(AbstractC6918a0.emoticon_selector_grid);
        ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0 = new ViewOnKeyListenerC7058f0(m92689tK());
        viewOnKeyListenerC7058f0.m36061y(new View.OnClickListener() { // from class: sc0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmojiPopupView.this.m88284mL(view);
            }
        });
        this.f83670O0.setAdapter((ListAdapter) viewOnKeyListenerC7058f0);
        View findViewById = inflate.findViewById(AbstractC6918a0.delete_emoji_button);
        this.f83671P0 = findViewById;
        findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: sc0.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m88285nL;
                m88285nL = EmojiPopupView.this.m88285nL(view, motionEvent);
                return m88285nL;
            }
        });
        if (this.f83672Q0) {
            this.f83670O0.setBackgroundColor(m92651WI().getColor(AbstractC16801x.emoji_background));
            inflate.findViewById(AbstractC6918a0.emoji_border).setVisibility(0);
        }
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: iL */
    public void mo88276iL() {
        super.mo88276iL();
        C17465f m92867k = m92594JK().m92867k();
        m92867k.m92895b(32);
        m92867k.m92895b(262144);
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        View view = this.f83660J0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = this.f83674S0;
            this.f83660J0.setLayoutParams(layoutParams);
        }
    }
}
