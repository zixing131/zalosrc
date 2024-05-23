package com.zing.zalo.p077ui.picker.stickerpanel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.EmojiShortVideoPanelPage;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import fn0.AbstractC19074t;
import p328ln.InterfaceC22530a;

/* loaded from: classes6.dex */
public final class EmojiShortVideoPickerView extends CommonZaloview {

    /* renamed from: L0 */
    private InterfaceC22530a f66887L0;

    public EmojiShortVideoPickerView() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (viewGroup == null) {
            finish();
            return null;
        }
        return new EmojiShortVideoPanelPage(layoutInflater, viewGroup.getContext(), this.f66887L0);
    }

    public EmojiShortVideoPickerView(InterfaceC22530a interfaceC22530a) {
        this();
        this.f66887L0 = interfaceC22530a;
    }
}
