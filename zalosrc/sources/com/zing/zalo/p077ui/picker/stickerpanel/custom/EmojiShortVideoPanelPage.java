package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;
import p328ln.InterfaceC22530a;
import z90.AbstractC31727b;

@SuppressLint({"ViewConstructor", "ClickableViewAccessibility"})
/* loaded from: classes6.dex */
public final class EmojiShortVideoPanelPage extends EmojiChatPanelPage {

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.EmojiShortVideoPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12932a extends AbstractC31727b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22530a f67025a;

        C12932a(InterfaceC22530a interfaceC22530a) {
            this.f67025a = interfaceC22530a;
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "emo");
            super.mo38306d(str, i11, i12);
            InterfaceC22530a interfaceC22530a = this.f67025a;
            if (interfaceC22530a != null) {
                interfaceC22530a.mo55708c(str, i11, i12);
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: f */
        public void mo71323f(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "emo");
            super.mo71323f(str, i11, i12);
            InterfaceC22530a interfaceC22530a = this.f67025a;
            if (interfaceC22530a != null) {
                interfaceC22530a.mo55707b(str, i11, i12);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiShortVideoPanelPage(LayoutInflater layoutInflater, Context context, final InterfaceC22530a interfaceC22530a) {
        super(layoutInflater, context, null);
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        get_adapter().m36420m0(new C12932a(interfaceC22530a));
        get_binding().f137734q.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.picker.stickerpanel.custom.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m72831k;
                m72831k = EmojiShortVideoPanelPage.m72831k(InterfaceC22530a.this, view, motionEvent);
                return m72831k;
            }
        });
        mo72826e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final boolean m72831k(InterfaceC22530a interfaceC22530a, View view, MotionEvent motionEvent) {
        if (interfaceC22530a != null) {
            return interfaceC22530a.mo55706a(view, motionEvent);
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.EmojiChatPanelPage
    /* renamed from: e */
    public void mo72826e() {
        get_adapter().m36417i0(-3);
    }
}
