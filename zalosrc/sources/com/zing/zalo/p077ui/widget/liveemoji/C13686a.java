package com.zing.zalo.p077ui.widget.liveemoji;

import android.content.Context;
import android.os.Bundle;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiPickerView;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import p394oj.C24277c;

/* renamed from: com.zing.zalo.ui.widget.liveemoji.a */
/* loaded from: classes6.dex */
public class C13686a extends KeyEventCallbackC17462c {

    /* renamed from: I */
    private LiveEmojiPickerView f70694I;

    /* renamed from: J */
    private b f70695J;

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.a$a */
    /* loaded from: classes6.dex */
    class a implements LiveEmojiPickerView.InterfaceC13685c {
        a() {
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiPickerView.InterfaceC13685c
        /* renamed from: J */
        public void mo76404J() {
            C13686a.this.dismiss();
        }

        @Override // com.zing.zalo.p077ui.widget.liveemoji.LiveEmojiPickerView.InterfaceC13685c
        /* renamed from: a */
        public void mo76405a(C24277c c24277c) {
            C13686a.this.dismiss();
            if (C13686a.this.f70695J != null) {
                C13686a.this.f70695J.mo13058a(c24277c);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.liveemoji.a$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: a */
        void mo13058a(C24277c c24277c);
    }

    public C13686a(Context context, int i11) {
        super(context, i11);
        C17465f m92867k = m92867k();
        m92867k.m92890I(1);
        m92867k.m92895b(131072);
    }

    /* renamed from: M */
    public void m76407M(b bVar) {
        this.f70695J = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        m92850A(AbstractC7409c0.live_emoji_picker_view);
        LiveEmojiPickerView liveEmojiPickerView = (LiveEmojiPickerView) m92864h(AbstractC6918a0.picker_view);
        this.f70694I = liveEmojiPickerView;
        liveEmojiPickerView.setListener(new a());
    }
}
