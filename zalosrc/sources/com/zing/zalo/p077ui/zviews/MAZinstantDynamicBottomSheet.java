package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bi0.AbstractC2808b;
import com.zing.zalo.p077ui.rounedlayout.FrameRoundedLayout;
import com.zing.zalo.p077ui.rounedlayout.RelativeRoundedLayout;
import com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.C23212s8;
import org.json.JSONObject;
import p189gv.C19609h;
import p649xl.C29962o8;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public class MAZinstantDynamicBottomSheet extends MiniAppZinstantBaseView {
    public static final C14532a Companion = new C14532a(null);

    /* renamed from: Y0 */
    private final InterfaceC24854k f74813Y0;

    /* renamed from: Z0 */
    private C29962o8 f74814Z0;

    /* renamed from: com.zing.zalo.ui.zviews.MAZinstantDynamicBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C14532a {
        private C14532a() {
        }

        public /* synthetic */ C14532a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m81272a(C19609h c19609h, String str, JSONObject jSONObject) {
            Bundle bundle = new Bundle();
            if (jSONObject != null) {
                bundle.putString("EXTRA_H5_ACTION", jSONObject.toString());
            }
            bundle.putSerializable("MINI_APP_INFO_EXTRA", c19609h);
            if (str != null) {
                bundle.putString("EXTRA_ACTION", str);
            }
            return bundle;
        }

        /* renamed from: b */
        public final synchronized MAZinstantDynamicBottomSheet m81273b(C17487o0 c17487o0, MAZinstantDynamicBottomSheet mAZinstantDynamicBottomSheet, C19609h c19609h, String str, JSONObject jSONObject, String str2) {
            try {
                AbstractC19074t.m100208f(mAZinstantDynamicBottomSheet, "bottomSheetView");
                if (c17487o0 == null) {
                    return null;
                }
                Bundle m81272a = m81272a(c19609h, str, jSONObject);
                if (str2 != null) {
                    m81272a.putString("EXTRA_MA_ZINSTANT_CACHE", str2);
                }
                mAZinstantDynamicBottomSheet.mo60305zK(m81272a);
                c17487o0.mo89693h2(mAZinstantDynamicBottomSheet, "", 0, true);
                return mAZinstantDynamicBottomSheet;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MAZinstantDynamicBottomSheet$b */
    /* loaded from: classes6.dex */
    static final class C14533b extends AbstractC19075u implements InterfaceC18494a {
        C14533b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MAZinstantDynamicBottomSheetSkeleton mo12V4() {
            Context context = MAZinstantDynamicBottomSheet.this.getContext();
            AbstractC19074t.m100205c(context);
            MAZinstantDynamicBottomSheetSkeleton mAZinstantDynamicBottomSheetSkeleton = new MAZinstantDynamicBottomSheetSkeleton(context);
            ViewGroup mo81263CM = MAZinstantDynamicBottomSheet.this.mo81263CM();
            if (mo81263CM != null) {
                mo81263CM.addView(mAZinstantDynamicBottomSheetSkeleton, new ViewGroup.LayoutParams(-1, -2));
            }
            return mAZinstantDynamicBottomSheetSkeleton;
        }
    }

    public MAZinstantDynamicBottomSheet() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C14533b());
        this.f74813Y0 = m129210a;
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: CM */
    public ViewGroup mo81263CM() {
        C29962o8 c29962o8 = this.f74814Z0;
        if (c29962o8 != null) {
            return c29962o8.f138879r;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: HM */
    public View mo81264HM() {
        return m81266PM();
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: IM */
    public MiniAppZinstantLayout mo81265IM() {
        C29962o8 c29962o8 = this.f74814Z0;
        if (c29962o8 != null) {
            return c29962o8.f138881t;
        }
        return null;
    }

    /* renamed from: PM */
    public final MiniAppZinstantSkeleton m81266PM() {
        return (MiniAppZinstantSkeleton) this.f74813Y0.getValue();
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        int i11;
        RelativeRoundedLayout relativeRoundedLayout;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        FrameRoundedLayout frameRoundedLayout = new FrameRoundedLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(6.0f));
        layoutParams.addRule(10, -1);
        layoutParams.addRule(14, -1);
        frameRoundedLayout.setCornerRadius(AbstractC23136l9.m118742r(3.0f));
        if (C23212s8.m119602i()) {
            i11 = AbstractC2808b.ng80;
        } else {
            i11 = AbstractC2808b.ng20;
        }
        frameRoundedLayout.setBackgroundColor(AbstractC23136l9.m118639A(i11));
        C29962o8 c29962o8 = this.f74814Z0;
        if (c29962o8 != null && (relativeRoundedLayout = c29962o8.f138879r) != null) {
            relativeRoundedLayout.addView(frameRoundedLayout, layoutParams);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: kM */
    public View mo81267kM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DragToCloseLayout dragToCloseLayout;
        DragToCloseLayout dragToCloseLayout2;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29962o8 m148323c = C29962o8.m148323c(layoutInflater, viewGroup, false);
        this.f74814Z0 = m148323c;
        if (m148323c != null && (dragToCloseLayout2 = m148323c.f138880s) != null) {
            dragToCloseLayout2.setDisableTouch(false);
        }
        C29962o8 c29962o8 = this.f74814Z0;
        if (c29962o8 != null && (dragToCloseLayout = c29962o8.f138880s) != null) {
            dragToCloseLayout.setDirection(1);
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.putInt("MINI_APP_VIEW_TYPE_TAG", 5);
        }
        C29962o8 c29962o82 = this.f74814Z0;
        if (c29962o82 != null) {
            return c29962o82.getRoot();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: nM */
    public View mo81268nM() {
        C29962o8 c29962o8 = this.f74814Z0;
        if (c29962o8 != null) {
            return c29962o8.f138878q;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: oM */
    public View mo81269oM() {
        C29962o8 c29962o8 = this.f74814Z0;
        if (c29962o8 != null) {
            return c29962o8.f138880s;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: qM */
    public void mo81270qM(boolean z11) {
        mo81423zM(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: yM */
    public JSONObject mo81271yM(String str, JSONObject jSONObject) {
        JSONObject mo81271yM = super.mo81271yM(str, jSONObject);
        mo81271yM.put("showDialogConfirm", false);
        return mo81271yM;
    }
}
