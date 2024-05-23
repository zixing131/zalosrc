package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.util.AttributeSet;
import dj.C17945a0;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowVideoGifInline extends ChatRowVideoInline {
    public ChatRowVideoGifInline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: m5 */
    private void m61707m5(C17945a0 c17945a0) {
        if (c17945a0.m94959N6()) {
            setRetryVisible(true);
        }
    }

    /* renamed from: n5 */
    private void m61708n5(C17945a0 c17945a0) {
        if (c17945a0.m94959N6()) {
            setRetryVisible(true);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m95032V6()) {
            m61708n5(c17945a0);
        } else {
            m61707m5(c17945a0);
        }
        this.f58831F7.m88796i(true);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline
    /* renamed from: R4 */
    protected void mo61709R4() {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline, hf0.C20040b.c
    /* renamed from: d */
    public void mo44058d(int i11, int i12) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline
    /* renamed from: k5 */
    boolean mo61710k5() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline
    /* renamed from: l5 */
    boolean mo61711l5() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f58828C7.setVideoPlayerMode(2);
    }
}
