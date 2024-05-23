package com.zing.zalo.p077ui.mycloud.gridtab;

import android.content.Context;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C17023o;
import dj.C17945a0;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class VideoGridChatItemView extends PhotoGridChatItemView {

    /* renamed from: J0 */
    private C17023o f65739J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoGridChatItemView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.PhotoGridChatItemView, com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: C0 */
    public C16719g mo70813C0() {
        super.mo70813C0();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonMedium_TertiaryAlpha);
        c17023o.m89106L().m89025I(true);
        Context context2 = c17023o.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        c17023o.m91112r1(C27280g.m139659b(context2, AbstractC23322a.zds_ic_play_solid_24, AbstractC2808b.wht_a80));
        c17023o.m89085A0(AbstractC23136l9.m118665N(c17023o.getContext(), AbstractC16803z.bg_button_play_video_grid_item));
        getContainerModule().m89001g1(c17023o);
        this.f65739J0 = c17023o;
        return getContainerModule();
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.PhotoGridChatItemView, com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: R0 */
    protected void mo70892R0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            if (c17945a0.m95041W4() == 19 && c17945a0.m95089b4() == 1) {
                setShowLoadingProgress(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.PhotoGridChatItemView
    /* renamed from: d1 */
    public void mo70930d1(C17945a0 c17945a0, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        super.mo70930d1(c17945a0, z11);
        C17023o c17023o = this.f65739J0;
        if (c17023o != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            c17023o.mo44614b1(i11);
        }
    }
}
