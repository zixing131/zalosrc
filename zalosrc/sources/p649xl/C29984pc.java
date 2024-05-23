package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.StickerView;
import p338m2.InterfaceC22715a;

/* renamed from: xl.pc */
/* loaded from: classes3.dex */
public final class C29984pc implements InterfaceC22715a {

    /* renamed from: p */
    private final StickerView f139026p;

    /* renamed from: q */
    public final StickerView f139027q;

    private C29984pc(StickerView stickerView, StickerView stickerView2) {
        this.f139026p = stickerView;
        this.f139027q = stickerView2;
    }

    /* renamed from: a */
    public static C29984pc m148373a(View view) {
        if (view != null) {
            StickerView stickerView = (StickerView) view;
            return new C29984pc(stickerView, stickerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29984pc m148374c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.sticker_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148373a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public StickerView getRoot() {
        return this.f139026p;
    }
}
