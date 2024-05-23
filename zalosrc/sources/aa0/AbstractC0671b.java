package aa0;

import androidx.recyclerview.widget.RecyclerView;
import cl.C3570a;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import fn0.AbstractC19074t;
import p348mi.AbstractC23306f;
import p684yk.InterfaceC31005a;
import w90.C28836d0;

/* renamed from: aa0.b */
/* loaded from: classes6.dex */
public abstract class AbstractC0671b {
    /* renamed from: a */
    public static final void m955a(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "<this>");
        C0670a c0670a = new C0670a();
        recyclerView.m9825D(c0670a);
        recyclerView.m9826E(c0670a);
    }

    /* renamed from: b */
    public static final C28836d0 m956b(StickerPanelView stickerPanelView) {
        AbstractC19074t.m100208f(stickerPanelView, "<this>");
        C3570a m120723w1 = AbstractC23306f.m120723w1();
        AbstractC19074t.m100207e(m120723w1, "provideStickerPanelRepository(...)");
        InterfaceC31005a m120726x1 = AbstractC23306f.m120726x1();
        AbstractC19074t.m100207e(m120726x1, "provideStickerRepo(...)");
        return new C28836d0(m120723w1, m120726x1, stickerPanelView, null, 8, null);
    }
}
