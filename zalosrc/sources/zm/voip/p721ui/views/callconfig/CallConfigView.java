package zm.voip.p721ui.views.callconfig;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes7.dex */
public final class CallConfigView extends ZdsModalBottomSheet {

    /* renamed from: S0 */
    public static final C32472a f149865S0 = new C32472a(null);

    /* renamed from: zm.voip.ui.views.callconfig.CallConfigView$a */
    /* loaded from: classes7.dex */
    public static final class C32472a {
        private C32472a() {
        }

        public /* synthetic */ C32472a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "CallConfigView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new CallConfigViewBottomSheet();
    }
}
