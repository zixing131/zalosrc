package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.ReturnCallScreenView;
import p338m2.InterfaceC22715a;

/* renamed from: xl.sc */
/* loaded from: classes3.dex */
public final class C30037sc implements InterfaceC22715a {

    /* renamed from: p */
    private final ReturnCallScreenView f139341p;

    private C30037sc(ReturnCallScreenView returnCallScreenView) {
        this.f139341p = returnCallScreenView;
    }

    /* renamed from: a */
    public static C30037sc m148499a(View view) {
        if (view != null) {
            return new C30037sc((ReturnCallScreenView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C30037sc m148500c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.sticky_music_player_layout_reuse, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148499a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ReturnCallScreenView getRoot() {
        return this.f139341p;
    }
}
