package p649xl;

import android.view.View;
import com.zing.zalo.zview.actionbar.ActionBar;
import p338m2.InterfaceC22715a;

/* renamed from: xl.u4 */
/* loaded from: classes3.dex */
public final class C30063u4 implements InterfaceC22715a {

    /* renamed from: p */
    private final ActionBar f139538p;

    /* renamed from: q */
    public final ActionBar f139539q;

    private C30063u4(ActionBar actionBar, ActionBar actionBar2) {
        this.f139538p = actionBar;
        this.f139539q = actionBar2;
    }

    /* renamed from: a */
    public static C30063u4 m148563a(View view) {
        if (view != null) {
            ActionBar actionBar = (ActionBar) view;
            return new C30063u4(actionBar, actionBar);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActionBar getRoot() {
        return this.f139538p;
    }
}
