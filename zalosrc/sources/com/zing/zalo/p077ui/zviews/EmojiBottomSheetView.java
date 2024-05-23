package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.ViewOnKeyListenerC7058f0;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import me0.AbstractC23188q6;
import z90.AbstractC31727b;

/* loaded from: classes6.dex */
public class EmojiBottomSheetView extends BottomPickerView {

    /* renamed from: U0 */
    InterfaceC14247b f73209U0;

    /* renamed from: V0 */
    TextView f73210V0;

    /* renamed from: W0 */
    ListView f73211W0;

    /* renamed from: X0 */
    ViewOnKeyListenerC7058f0 f73212X0;

    /* renamed from: Y0 */
    int f73213Y0 = AbstractC8020f0.str_emoji_picker_title;

    /* renamed from: com.zing.zalo.ui.zviews.EmojiBottomSheetView$a */
    /* loaded from: classes6.dex */
    class C14246a extends AbstractC31727b {
        C14246a() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            InterfaceC14247b interfaceC14247b = EmojiBottomSheetView.this.f73209U0;
            if (interfaceC14247b != null) {
                interfaceC14247b.mo79474c(str);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.EmojiBottomSheetView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC14247b extends BottomPickerView.InterfaceC14112a {
        /* renamed from: c */
        void mo79474c(String str);
    }

    /* renamed from: nL */
    public static EmojiBottomSheetView m79472nL(InterfaceC14247b interfaceC14247b, int i11) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        EmojiBottomSheetView emojiBottomSheetView = new EmojiBottomSheetView();
        emojiBottomSheetView.m79473oL(interfaceC14247b);
        emojiBottomSheetView.mo60305zK(m78535kL);
        emojiBottomSheetView.f73213Y0 = i11;
        return emojiBottomSheetView;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: lL */
    protected View mo78264lL() {
        return this.f73211W0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.emoji_bottom_sheet_layout;
    }

    /* renamed from: oL */
    public void m79473oL(InterfaceC14247b interfaceC14247b) {
        this.f73209U0 = interfaceC14247b;
        this.f72452T0 = interfaceC14247b;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            this.f73210V0 = (TextView) this.f83659I0.findViewById(AbstractC6918a0.tv_emoji_label);
            this.f73211W0 = (ListView) this.f83659I0.findViewById(AbstractC6918a0.emoji_list);
            ViewOnKeyListenerC7058f0 viewOnKeyListenerC7058f0 = new ViewOnKeyListenerC7058f0(this.f88762c0.m92689tK(), AbstractC23188q6.m119487e());
            this.f73212X0 = viewOnKeyListenerC7058f0;
            viewOnKeyListenerC7058f0.m36060x(new C14246a());
            this.f73211W0.setAdapter((ListAdapter) this.f73212X0);
            this.f73210V0.setText(this.f73213Y0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
